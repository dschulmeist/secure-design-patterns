package org.secureFactoryExample.product;

import org.secureFactoryExample.credentials.Credentials;

public class SOAPAPIConnection implements APIConnection {
    private Credentials credentials;

    public SOAPAPIConnection(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to SOAP API with user: " + credentials.getUsername());
        // Implement connection logic
    }
}