package org.secureFactoryExample.product;

import org.secureFactoryExample.credentials.Credentials;

public class MySQLConnection implements DatabaseConnection {
    private Credentials credentials;

    public MySQLConnection(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL with user: " + credentials.getUsername());
        // Implement connection logic
    }
}