package org.secureStateMachine.state;

import org.secureStateMachine.context.SecurityContext;
import org.secureStateMachine.model.Credentials;

public class UnauthenticatedState implements SecurityState {
    @Override
    public void handle(SecurityContext context, Credentials credentials) {
        if (credentials.isValid()) {
            System.out.println("User authenticated successfully.");
            context.setState(new AuthenticatedState());
        } else {
            System.out.println("Authentication failed.");
        }
    }
}