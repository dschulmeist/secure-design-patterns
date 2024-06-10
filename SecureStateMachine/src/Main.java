import org.secureStateMachine.context.SecurityContext;
import org.secureStateMachine.model.Credentials;

public class Main {
    public static void main(String[] args) {

        SecurityContext context = new SecurityContext();

        Credentials unauthenticatedCredentials = new Credentials("user", "wrongpassword", false);
        Credentials authenticatedCredentials = new Credentials("user", "password", false);
        Credentials authorizedCredentials = new Credentials("user", "password", true);

        System.out.println("Attempting to authenticate with wrong password:");
        context.request(unauthenticatedCredentials);

        System.out.println("\nAttempting to authenticate with correct password:");
        context.request(authenticatedCredentials);

        System.out.println("\nAttempting to authorize user:");
        context.request(authorizedCredentials);
    }
}