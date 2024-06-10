import org.secureBuilderFactoryExample.builder.Builder;
import org.secureBuilderFactoryExample.director.Director;
import org.secureBuilderFactoryExample.factory.AbstractBuilderFactory;
import org.secureBuilderFactoryExample.factory.AdminBuilderFactory;
import org.secureBuilderFactoryExample.factory.UserBuilderFactory;
import org.secureBuilderFactoryExample.model.Account;
import org.secureBuilderFactoryExample.model.Credentials;

public class Main {
    public static void main(String[] args) {
        Credentials adminCredentials = new Credentials("ADMIN", "adminUser", "adminPass");
        Credentials userCredentials = new Credentials("USER", "normalUser", "userPass");

        Director director = new Director();

        AbstractBuilderFactory adminFactory = new AdminBuilderFactory();
        Builder adminBuilder = adminFactory.createBuilder(adminCredentials);
        director.construct(adminBuilder, adminCredentials);
        Account adminAccount = adminBuilder.getResult();
        System.out.println(adminAccount);

        AbstractBuilderFactory userFactory = new UserBuilderFactory();
        Builder userBuilder = userFactory.createBuilder(userCredentials);
        director.construct(userBuilder, userCredentials);
        Account userAccount = userBuilder.getResult();
        System.out.println(userAccount);
    }
}