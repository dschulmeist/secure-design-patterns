package org.secureChainOfResponsibilityExample.handler;

import org.secureChainOfResponsibilityExample.model.Credentials;

public class AuthorizationHandler extends Handler {
    @Override
    protected boolean check(Credentials credentials) {
        boolean authorized = credentials.hasAuthorization();
        if (authorized) {
            System.out.println("Authorization successful.");
        }
        return authorized;
    }
}