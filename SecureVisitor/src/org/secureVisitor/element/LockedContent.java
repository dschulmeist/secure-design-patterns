package org.secureVisitor.element;

import org.secureVisitor.model.Credentials;

public class LockedContent implements UnlockableContent {
    private String content;
    private String requiredPassword;

    public LockedContent(String content, String password) {
        this.content = content;
        this.requiredPassword = password;
    }

    @Override
    public boolean unlock(Credentials credentials) {
        return credentials.getPassword().equals(requiredPassword);
    }

    @Override
    public String getContent() {
        return content;
    }
}