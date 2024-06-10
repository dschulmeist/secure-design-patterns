package org.secureBuilderFactoryExample.factory;

import org.secureBuilderFactoryExample.builder.Builder;
import org.secureBuilderFactoryExample.model.Credentials;

public abstract class AbstractBuilderFactory {
    public abstract Builder createBuilder(Credentials credentials);
}