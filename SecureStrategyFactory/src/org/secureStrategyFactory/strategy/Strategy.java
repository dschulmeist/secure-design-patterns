package org.secureStrategyFactory.strategy;

import org.secureStrategyFactory.model.Credentials;

public interface Strategy {
    boolean authenticate(Credentials credentials);
}