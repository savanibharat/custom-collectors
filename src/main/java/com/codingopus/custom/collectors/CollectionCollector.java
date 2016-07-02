package com.codingopus.custom.collectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public final class CollectionCollector {

	/**
	 * Creates a {@link Collector} of specified {@link Supplier} 
	 * and {@link Characteristics}.
	 * 
	 * @param T The type of input elements for the new collector
	 * @param C The type of {@link Collection}
	 * */
	static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(
			final Supplier<C> supplierFactory, 
			final Characteristics... characteristics) {
		
		return 
				Collector.of(
						supplierFactory, 
						C::add, 
						(t, u) -> {
							t.addAll(u);
							return t;
						}, 
						characteristics);
	}

	/**
	 * This method accepts initial capacity as int-valued argument.
	 * We use this argument to create new {@link ArrayList} using
	 * {@link ArrayList#ArrayList(int)} constructor.
	 * 
	 * @param T The type of input elements for the new collector
	 * @param C The type of {@link Collection}
	 * */
	static <T, C extends Collection<T>> Collector<T, ?, C>  toOrderedCollection(
			final int initialCapacity, 
			final IntFunction<C> sizedFactory, 
			final Characteristics... characteristics) {
		
		//return toCollection(() -> sizedFactory.apply(initialCapacity), characteristics);
		return toCollection(new Supplier<C>() {
			@Override
			public C get() {
				return sizedFactory.apply(initialCapacity);
			}
		}, characteristics);
	}
	
	static <T, C extends Collection<T>> Collector<T, ?, C>  toUnOrderedCollection(
			final int initialCapacity, 
			final IntFunction<C> sizedFactory, 
			final Characteristics... characteristics) {
		
		return toCollection(() -> sizedFactory.apply(initialCapacity), characteristics);
	}
	
}
