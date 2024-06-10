# Secure Builder Factory Pattern

## Overview 
The Secure Builder Factory design pattern is used to create complex objects while ensuring security through credentials. It combines the builder pattern with security mechanisms to ensure only authorized users can create objects.

## Components
- **Builder**: Abstract class defining the methods to build parts of an object.
- **Concrete Builders**: Specific implementations of the Builder for different types of objects.
- **Director**: Controls the construction process using a Builder.
- **AbstractBuilderFactory**: Abstract class defining the method to create builders based on credentials.
- **Concrete Factories**: Specific implementations of the AbstractBuilderFactory for different types of builders.
- **Credentials**: Class representing user credentials.
- **Account**: Class representing the complex object being built.

## Usage

The client interacts with the system by providing credentials to the factory, which returns the appropriate builder. The director then uses the builder to construct the object.