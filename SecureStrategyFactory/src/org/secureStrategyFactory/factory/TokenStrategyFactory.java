package org.secureStrategyFactory.factory;

import org.secureStrategyFactory.model.Credentials;
import org.secureStrategyFactory.strategy.Strategy;
import org.secureStrategyFactory.strategy.TokenStrategy;

public class TokenStrategyFactory extends AbstractStrategyFactory {
    @Override
    public Strategy createStrategy(Credentials credentials) {
        return new TokenStrategy();
    }
}