package org.secureVisitor.element;

import org.secureVisitor.model.Credentials;

public class UnlockedContent implements UnlockableContent {
    private String content;

    public UnlockedContent(String content) {
        this.content = content;
    }

    @Override
    public boolean unlock(Credentials credentials) {
        return true; // Always unlocked
    }

    @Override
    public String getContent() {
        return content;
    }
}