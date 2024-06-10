package org.secureStateMachine.state;

import org.secureStateMachine.context.SecurityContext;
import org.secureStateMachine.model.Credentials;

public class AuthorizedState implements SecurityState {
    @Override
    public void handle(SecurityContext context, Credentials credentials) {
        System.out.println("User is already authorized. Access granted.");
        // User can access resources.
    }
}