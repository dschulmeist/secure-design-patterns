package org.secureStrategyFactory.factory;

import org.secureStrategyFactory.model.Credentials;
import org.secureStrategyFactory.strategy.PasswordStrategy;
import org.secureStrategyFactory.strategy.Strategy;

public class PasswordStrategyFactory extends AbstractStrategyFactory {
    @Override
    public Strategy createStrategy(Credentials credentials) {
        return new PasswordStrategy();
    }
}