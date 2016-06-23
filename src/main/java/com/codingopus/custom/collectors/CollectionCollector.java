package com.codingopus.custom.collectors;

import java.util.Collection;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public class CollectionCollector {

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

	static <T, C extends Collection<T>> Collector<T, ?, C>  toOrderedCollection(
			final int initialCapacity, 
			final IntFunction<C> sizedFactory, 
			final Characteristics... characteristics) {
		
		return toCollection(() -> sizedFactory.apply(initialCapacity), characteristics);
	}
	
	static <T, C extends Collection<T>> Collector<T, ?, C>  toUnOrderedCollection(
			final int initialCapacity, 
			final IntFunction<C> sizedFactory, 
			final Characteristics... characteristics) {
		
		return toCollection(() -> sizedFactory.apply(initialCapacity), characteristics);
	}
	
}
