package org.secureStrategyFactory.strategy;

import org.secureStrategyFactory.model.Credentials;

public class PasswordStrategy implements Strategy {
    @Override
    public boolean authenticate(Credentials credentials) {
        // Implement Password-based authentication
        System.out.println("Authenticating using Password Strategy for user: " + credentials.getUsername());
        return credentials.getPassword().equals("correctPassword"); // Simulated password check
    }
}