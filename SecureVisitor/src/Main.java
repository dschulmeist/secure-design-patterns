import org.secureVisitor.element.LockedContent;
import org.secureVisitor.element.UnlockableContent;
import org.secureVisitor.element.UnlockedContent;
import org.secureVisitor.model.Credentials;
import org.secureVisitor.visitor.AdminVisitor;
import org.secureVisitor.visitor.GuestVisitor;
import org.secureVisitor.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        UnlockableContent lockedContent = new LockedContent("Sensitive Data", "admin123");
        UnlockableContent unlockedContent = new UnlockedContent("Public Data");

        Visitor admin = new AdminVisitor();
        Visitor guest = new GuestVisitor();

        Credentials adminCredentials = new Credentials("admin123");
        Credentials guestCredentials = new Credentials("guest");

        System.out.println("Admin visiting locked content:");
        admin.visit(lockedContent, adminCredentials);

        System.out.println("Guest visiting locked content:");
        guest.visit(lockedContent, guestCredentials);

        System.out.println("Admin visiting unlocked content:");
        admin.visit(unlockedContent, adminCredentials);

        System.out.println("Guest visiting unlocked content:");
        guest.visit(unlockedContent, guestCredentials);
    }
}