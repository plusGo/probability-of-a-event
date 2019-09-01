package com.mhl;

import java.util.Optional;

public interface Event {
    void action();

    default double happening() {
        final double probability = Math.random();

        Optional.of(Math.random() > probability)
                .filter(result -> result)
                .ifPresent(result -> {
                    this.action();
                });

        return probability;
    }
}
