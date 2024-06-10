package org.secureBuilderFactoryExample.model;

public class Account {
    private String username;
    private String password;
    private String permissions;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permissions='" + permissions + '\'' +
                '}';
    }
}