package org.secureStateMachine.context;

import org.secureStateMachine.model.Credentials;
import org.secureStateMachine.state.SecurityState;
import org.secureStateMachine.state.UnauthenticatedState;

public class SecurityContext {
    private SecurityState currentState;

    public SecurityContext() {
        currentState = new UnauthenticatedState(); // Initial state
    }

    public void setState(SecurityState state) {
        currentState = state;
    }

    public void request(Credentials credentials) {
        currentState.handle(this, credentials);
    }
}