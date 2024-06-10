package org.secureBuilderFactoryExample.director;

import org.secureBuilderFactoryExample.builder.Builder;
import org.secureBuilderFactoryExample.model.Credentials;

public class Director {
    public void construct(Builder builder, Credentials credentials) {
        builder.buildUsername(credentials.getUsername());
        builder.buildPassword(credentials.getPassword());
        builder.buildPermissions();
    }
}