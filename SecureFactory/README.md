# Secure Factory Pattern

## Overview
The Secure Factory Pattern ensures that only authorized subjects can create specific objects using provided credentials. It abstracts the creation process, promoting loose coupling and flexible architecture.

## Key Points
- **Access Control**: Each method to create a product requires credentials to ensure only authorized subjects can create products.
- **Abstraction of Product Creation**: The client does not need to know the concrete implementations of the products, leading to a more flexible architecture.
- **Extensibility**: New product types or factories can be added without changing existing code, as long as they implement the `AbstractFactory` interface.

## UML-Diagram
TODO

## Class Structure:

- **AbstractFactory**:
    - `createProductA(Credentials c)`: Creates a database connection.
    - `createProductB(Credentials c)`: Creates an API connection.

- **ConcreteFactory1 and ConcreteFactory2**:
    - `ConcreteFactory1`: Creates a MySQL database connection and a REST API connection.
    - `ConcreteFactory2`: Creates a PostgreSQL database connection and a SOAP API connection.

- **ProductA and ProductB**:
    - `ProductA`: Defines the interface for database connections.
    - `ProductB`: Defines the interface for API connections.

- **ConcreteProductA1 and ConcreteProductA2**:
    - `ConcreteProductA1`: Implements the MySQL database connection.
    - `ConcreteProductA2`: Implements the PostgreSQL database connection.

- **ConcreteProductB1 and ConcreteProductB2**:
    - `ConcreteProductB1`: Implements the REST API connection.
    - `ConcreteProductB2`: Implements the SOAP API connection.

- **Client**:
    - Uses the factories to create connections.


