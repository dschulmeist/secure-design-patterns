package org.secureChainOfResponsibilityExample.handler;

import org.secureChainOfResponsibilityExample.model.Credentials;

public class LoggingHandler extends Handler {
    @Override
    protected boolean check(Credentials credentials) {
        System.out.println("Logging request for user: " + credentials.getUsername());
        return true; // Always allow logging to pass
    }
}