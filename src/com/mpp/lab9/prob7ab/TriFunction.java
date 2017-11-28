package com.mpp.lab9.prob7ab;

@FunctionalInterface
public interface TriFunction<S, T, U, R> {
	R apply(S s, T t, U u);
}
