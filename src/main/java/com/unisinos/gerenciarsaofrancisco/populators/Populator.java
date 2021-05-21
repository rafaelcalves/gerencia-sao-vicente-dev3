package com.unisinos.gerenciarsaofrancisco.populators;

public interface Populator<S,T> {
    void populate(S source, T target);
}
