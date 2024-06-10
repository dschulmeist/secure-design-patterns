package org.secureStateMachine.state;

import org.secureStateMachine.context.SecurityContext;
import org.secureStateMachine.model.Credentials;

public class AuthenticatedState implements SecurityState {
    @Override
    public void handle(SecurityContext context, Credentials credentials) {
        if (credentials.hasAuthorization()) {
            System.out.println("User authorized successfully.");
            context.setState(new AuthorizedState());
        } else {
            System.out.println("Authorization failed.");
        }
    }
}