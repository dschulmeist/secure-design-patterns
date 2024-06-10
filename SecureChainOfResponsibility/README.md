# Secure Chain of Responsibility Pattern

## Overview
The Secure Chain of Responsibility pattern is a design pattern that allows an incoming request to be processed by a chain of handlers, each responsible for handling the request or passing it to the next handler in the chain. This pattern adds an additional layer of security by ensuring that each handler checks the credentials of the request before processing it.

## UML Diagram
TODO

## Components
- **Handler**: Abstract class defining the interface for handling requests.
- **Concrete Handlers**: Specific implementations of the Handler for different types of requests.
- **Credentials**: Class representing user credentials.
- **Main**: Class demonstrating the use of the Chain of Responsibility pattern.

