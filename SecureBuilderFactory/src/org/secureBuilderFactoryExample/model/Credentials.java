package org.secureBuilderFactoryExample.model;

public class Credentials {
    private String role;
    private String username;
    private String password;

    public Credentials(String role, String username, String password) {
        this.role = role;
        this.username = username;
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}