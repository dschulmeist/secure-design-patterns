import org.secureChainOfResponsibilityExample.handler.AuthenticationHandler;
import org.secureChainOfResponsibilityExample.handler.AuthorizationHandler;
import org.secureChainOfResponsibilityExample.handler.Handler;
import org.secureChainOfResponsibilityExample.handler.LoggingHandler;
import org.secureChainOfResponsibilityExample.model.Credentials;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler loggingHandler = new LoggingHandler();
        Handler authHandler = new AuthenticationHandler();
        Handler authzHandler = new AuthorizationHandler();

        // Set successors
        loggingHandler.setSuccessor(authHandler);
        authHandler.setSuccessor(authzHandler);

        // Create credentials
        Credentials credentials = new Credentials("user", "password", true);

        // Start the chain
        loggingHandler.handleRequest(credentials);
    }
}