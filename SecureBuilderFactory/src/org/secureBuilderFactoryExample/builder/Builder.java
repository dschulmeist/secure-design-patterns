package org.secureBuilderFactoryExample.builder;

import org.secureBuilderFactoryExample.model.Account;

public abstract class Builder {
    protected Account account = new Account();

    public abstract void buildUsername(String username);
    public abstract void buildPassword(String password);
    public abstract void buildPermissions();

    public Account getResult() {
        return account;
    }
}