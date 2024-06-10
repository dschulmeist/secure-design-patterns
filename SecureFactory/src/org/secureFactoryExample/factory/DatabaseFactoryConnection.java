package org.secureFactoryExample.factory;

import org.secureFactoryExample.credentials.Credentials;
import org.secureFactoryExample.product.APIConnection;
import org.secureFactoryExample.product.DatabaseConnection;
import org.secureFactoryExample.product.MySQLConnection;
import org.secureFactoryExample.product.PostgreSQLConnection;

public class DatabaseFactoryConnection extends ConnectionAbstractFactory {
    @Override
    public DatabaseConnection createDatabaseConnection(Credentials c) {
        if (c.getType().equals("MySQL")) {
            return new MySQLConnection(c);
        } else if (c.getType().equals("PostgreSQL")) {
            return new PostgreSQLConnection(c);
        }
        return null;
    }

    @Override
    public APIConnection createAPIConnection(Credentials c) {
        return null; // Not applicable for DatabaseFactory
    }

}