package org.secureFactoryExample.client;

import org.secureFactoryExample.credentials.Credentials;
import org.secureFactoryExample.factory.APIFactoryConnection;
import org.secureFactoryExample.factory.ConnectionAbstractFactory;
import org.secureFactoryExample.factory.DatabaseFactoryConnection;
import org.secureFactoryExample.product.APIConnection;
import org.secureFactoryExample.product.DatabaseConnection;

import java.util.Scanner;

public class SecureFactoryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter database username:");
        String dbUsername = scanner.nextLine();

        System.out.println("Enter database password:");
        String dbPassword = scanner.nextLine();

        System.out.println("Enter database type (MySQL/PostgreSQL):");
        String dbType = scanner.nextLine();

        Credentials dbCredentials = new Credentials(dbUsername, dbPassword, dbType);

        ConnectionAbstractFactory databaseFactory = new DatabaseFactoryConnection();
        DatabaseConnection dbConnection = databaseFactory.createDatabaseConnection(dbCredentials);
        dbConnection.connect();

        System.out.println("Enter API username:");
        String apiUsername = scanner.nextLine();

        System.out.println("Enter API password:");
        String apiPassword = scanner.nextLine();

        System.out.println("Enter API type (REST/SOAP):");
        String apiType = scanner.nextLine();

        Credentials apiCredentials = new Credentials(apiUsername, apiPassword, apiType);

        ConnectionAbstractFactory apiFactory = new APIFactoryConnection();
        APIConnection apiConnection = apiFactory.createAPIConnection(apiCredentials);
        apiConnection.connect();
    }
}