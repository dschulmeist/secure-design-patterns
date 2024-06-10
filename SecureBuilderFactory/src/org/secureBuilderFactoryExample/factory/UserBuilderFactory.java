package org.secureBuilderFactoryExample.factory;

import org.secureBuilderFactoryExample.builder.Builder;
import org.secureBuilderFactoryExample.builder.UserBuilder;
import org.secureBuilderFactoryExample.model.Credentials;

public class UserBuilderFactory extends AbstractBuilderFactory {
    @Override
    public Builder createBuilder(Credentials credentials) {
        return new UserBuilder();
    }
}