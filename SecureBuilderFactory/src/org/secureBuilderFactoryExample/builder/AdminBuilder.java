package org.secureBuilderFactoryExample.builder;

public class AdminBuilder extends Builder {
    @Override
    public void buildUsername(String username) {
        account.setUsername(username);
    }

    @Override
    public void buildPassword(String password) {
        account.setPassword(password);
    }

    @Override
    public void buildPermissions() {
        account.setPermissions("FULL_ACCESS");
    }
}