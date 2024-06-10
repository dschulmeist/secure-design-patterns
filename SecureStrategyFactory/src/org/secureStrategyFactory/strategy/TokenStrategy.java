package org.secureStrategyFactory.strategy;

import org.secureStrategyFactory.model.Credentials;

public class TokenStrategy implements Strategy {
    @Override
    public boolean authenticate(Credentials credentials) {
        // Implement Token-based authentication
        System.out.println("Authenticating using Token Strategy for user: " + credentials.getUsername());
        return credentials.getToken().equals("validToken"); // Simulated token check
    }
}