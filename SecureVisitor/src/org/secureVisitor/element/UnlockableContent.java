package org.secureVisitor.element;

import org.secureVisitor.model.Credentials;

public interface UnlockableContent {
    boolean unlock(Credentials credentials);
    String getContent();
}