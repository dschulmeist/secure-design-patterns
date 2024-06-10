package org.secureStrategyFactory.context;

import org.secureStrategyFactory.model.Credentials;
import org.secureStrategyFactory.strategy.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean authenticate(Credentials credentials) {
        return strategy.authenticate(credentials);
    }
}