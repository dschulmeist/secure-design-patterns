package org.secureStrategyFactory.factory;

import org.secureStrategyFactory.model.Credentials;
import org.secureStrategyFactory.strategy.Strategy;

public abstract class AbstractStrategyFactory {
    public abstract Strategy createStrategy(Credentials credentials);
}