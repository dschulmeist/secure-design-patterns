package org.secureStrategyFactory.strategy;

import org.secureStrategyFactory.model.Credentials;

public class BiometricStrategy implements Strategy {
    @Override
    public boolean authenticate(Credentials credentials) {
        // Implement Biometric-based authentication
        System.out.println("Authenticating using Biometric Strategy for user: " + credentials.getUsername());
        return credentials.getBiometricData() != null; // Simulated biometric data check
    }
}