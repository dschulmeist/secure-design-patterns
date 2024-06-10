package org.secureStateMachine.model;

public class Credentials {
    private String username;
    private String password;
    private boolean isAuthorized;

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

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}