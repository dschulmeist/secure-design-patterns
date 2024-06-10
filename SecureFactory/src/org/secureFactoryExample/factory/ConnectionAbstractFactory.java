package org.secureFactoryExample.factory;

import org.secureFactoryExample.credentials.Credentials;
import org.secureFactoryExample.product.APIConnection;
import org.secureFactoryExample.product.DatabaseConnection;

public abstract class ConnectionAbstractFactory {
    public abstract DatabaseConnection createDatabaseConnection(Credentials c);
    public abstract APIConnection createAPIConnection(Credentials c);
}

