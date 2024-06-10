package org.secureFactoryExample.product;

import org.secureFactoryExample.credentials.Credentials;

public class PostgreSQLConnection implements DatabaseConnection {
    private Credentials credentials;

    public PostgreSQLConnection(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL with user: " + credentials.getUsername());
        // Implement connection logic
    }
}
