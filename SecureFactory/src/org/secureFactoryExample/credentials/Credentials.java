package org.secureFactoryExample.credentials;

public class Credentials {
    private final String username;
    private final String password;
    private final String type; // Type of connection, e.g., "DB" or "API"

    public Credentials(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }
}
