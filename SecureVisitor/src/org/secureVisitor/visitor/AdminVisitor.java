package org.secureVisitor.visitor;

import org.secureVisitor.element.UnlockableContent;
import org.secureVisitor.model.Credentials;

public class AdminVisitor implements Visitor {
    @Override
    public void visit(UnlockableContent content, Credentials credentials) {
        if (content.unlock(credentials)) {
            System.out.println("Admin accessed content: " + content.getContent());
        } else {
            System.out.println("Admin access denied.");
        }
    }
}