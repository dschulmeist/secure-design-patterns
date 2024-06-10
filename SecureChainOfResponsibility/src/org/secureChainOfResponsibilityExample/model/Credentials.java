package org.secureChainOfResponsibilityExample.model;

public class Credentials {
    private final String username;
    private final String password;
    private final boolean isAuthorized;

    public Credentials(String username, String password, boolean isAuthorized) {
        this.username = username;
        this.password = password;
        this.isAuthorized = isAuthorized;
    }

    public boolean isValid() {
        // Simulate validation logic
        return "user".equals(username) && "password".equals(password);
    }

    public boolean hasAuthorization() {
        return isAuthorized;
    }

    public String getUsername() {
        return username;
    }
}