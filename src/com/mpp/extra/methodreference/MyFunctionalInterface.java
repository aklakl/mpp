package com.mpp.extra.methodreference;

@FunctionalInterface
public interface MyFunctionalInterface<T, S, U, K, R> {

	/**
	 * Applies this function to the given arguments.
	 * 
	 * @param <T>
	 * @param <S>
	 * @param <U>
	 *
	 * @param t
	 *            the first function argument
	 * @param u
	 *            the second function argument
	 * @param s
	 *            the third function argument
	 * @return
	 * @return the function result
	 */
	R apply(T t, U u, S s, K k);
}