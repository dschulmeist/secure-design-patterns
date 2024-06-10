package org.secureVisitor.visitor;

import org.secureVisitor.element.UnlockableContent;
import org.secureVisitor.model.Credentials;

public interface Visitor {
    void visit(UnlockableContent content, Credentials credentials);
}