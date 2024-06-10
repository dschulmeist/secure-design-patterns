package org.secureChainOfResponsibilityExample.handler;

import org.secureChainOfResponsibilityExample.model.Credentials;

public abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Credentials credentials) {
        if (check(credentials)) {
            if (successor != null) {
                successor.handleRequest(credentials);
            }
        } else {
            System.out.println("Request denied by " + this.getClass().getSimpleName());
        }
    }

    protected abstract boolean check(Credentials credentials);
}