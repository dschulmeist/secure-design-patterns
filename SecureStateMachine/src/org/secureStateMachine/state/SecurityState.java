package org.secureStateMachine.state;

import org.secureStateMachine.context.SecurityContext;
import org.secureStateMachine.model.Credentials;

public interface SecurityState {
    void handle(SecurityContext context, Credentials credentials);
}