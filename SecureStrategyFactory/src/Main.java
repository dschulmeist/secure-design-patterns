import org.secureStrategyFactory.context.Context;
import org.secureStrategyFactory.factory.AbstractStrategyFactory;
import org.secureStrategyFactory.factory.BiometricStrategyFactory;
import org.secureStrategyFactory.factory.PasswordStrategyFactory;
import org.secureStrategyFactory.factory.TokenStrategyFactory;
import org.secureStrategyFactory.model.Credentials;
import org.secureStrategyFactory.strategy.Strategy;

public class Main {
    public static void main(String[] args) {
        Credentials passwordCredentials = new Credentials("PASSWORD", "user1", "correctPassword", null, null);
        Credentials tokenCredentials = new Credentials("TOKEN", "user2", null, "validToken", null);
        Credentials biometricCredentials = new Credentials("BIOMETRIC", "user3", null, null, new byte[]{1, 2, 3});

        Context context = new Context();

        // Password Strategy
        AbstractStrategyFactory passwordFactory = new PasswordStrategyFactory();
        Strategy passwordStrategy = passwordFactory.createStrategy(passwordCredentials);
        context.setStrategy(passwordStrategy);
        System.out.println("Password Authentication: " + context.authenticate(passwordCredentials));

        // Token Strategy
        AbstractStrategyFactory tokenFactory = new TokenStrategyFactory();
        Strategy tokenStrategy = tokenFactory.createStrategy(tokenCredentials);
        context.setStrategy(tokenStrategy);
        System.out.println("Token Authentication: " + context.authenticate(tokenCredentials));

        // Biometric Strategy
        AbstractStrategyFactory biometricFactory = new BiometricStrategyFactory();
        Strategy biometricStrategy = biometricFactory.createStrategy(biometricCredentials);
        context.setStrategy(biometricStrategy);
        System.out.println("Biometric Authentication: " + context.authenticate(biometricCredentials));
    }
}