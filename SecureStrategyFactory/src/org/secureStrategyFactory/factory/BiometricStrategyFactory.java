package org.secureStrategyFactory.factory;

import org.secureStrategyFactory.model.Credentials;
import org.secureStrategyFactory.strategy.BiometricStrategy;
import org.secureStrategyFactory.strategy.Strategy;

public class BiometricStrategyFactory extends AbstractStrategyFactory {
    @Override
    public Strategy createStrategy(Credentials credentials) {
        return new BiometricStrategy();
    }
}