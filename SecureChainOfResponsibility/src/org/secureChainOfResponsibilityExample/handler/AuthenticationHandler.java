package org.secureChainOfResponsibilityExample.handler;

import org.secureChainOfResponsibilityExample.model.Credentials;

public class AuthenticationHandler extends Handler {
    @Override
    protected boolean check(Credentials credentials) {
        boolean authenticated = credentials.isValid();
        if (authenticated) {
            System.out.println("Authentication successful.");
        }
        return authenticated;
    }
}