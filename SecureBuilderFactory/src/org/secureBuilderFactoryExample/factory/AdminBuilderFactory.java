package org.secureBuilderFactoryExample.factory;

import org.secureBuilderFactoryExample.builder.AdminBuilder;
import org.secureBuilderFactoryExample.builder.Builder;
import org.secureBuilderFactoryExample.model.Credentials;

public class AdminBuilderFactory extends AbstractBuilderFactory {
    @Override
    public Builder createBuilder(Credentials credentials) {
        return new AdminBuilder();
    }
}