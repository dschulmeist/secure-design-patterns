package org.secureFactoryExample.product;

import org.secureFactoryExample.credentials.Credentials;

public class RESTAPIConnection implements APIConnection {
    private Credentials credentials;

    public RESTAPIConnection(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to REST API with user: " + credentials.getUsername());
        // Implement connection logic
    }
}
