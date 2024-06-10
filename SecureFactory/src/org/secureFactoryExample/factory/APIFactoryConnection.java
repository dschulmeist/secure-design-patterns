package org.secureFactoryExample.factory;

import org.secureFactoryExample.credentials.Credentials;
import org.secureFactoryExample.product.APIConnection;
import org.secureFactoryExample.product.DatabaseConnection;
import org.secureFactoryExample.product.RESTAPIConnection;
import org.secureFactoryExample.product.SOAPAPIConnection;

public class APIFactoryConnection extends ConnectionAbstractFactory {
    @Override
    public DatabaseConnection createDatabaseConnection(Credentials c) {
        return null; // Not applicable for APIFactory
    }

    @Override
    public APIConnection createAPIConnection(Credentials c) {
        if (c.getType().equals("REST")) {
            return new RESTAPIConnection(c);
        } else if (c.getType().equals("SOAP")) {
            return new SOAPAPIConnection(c);
        }
        return null;
    }

}
