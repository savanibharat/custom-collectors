package com.codingopus.custom.guava.collectors;

import java.util.stream.Collector;

import com.google.common.collect.ImmutableMultiset;

public final class ImmutableMultisetCollector<T> {
	
	public static <T> Collector<T, ImmutableMultiset.Builder<T>, ImmutableMultiset<T>>
	toImmutableMultisetCollector() {
		
		return 
				Collector.of(
						ImmutableMultiset.Builder<T>::new,
						ImmutableMultiset.Builder<T>::add,
						(l, r) -> l.addAll(r.build()),
			            ImmutableMultiset.Builder<T>::build,
			            Collector.Characteristics.UNORDERED);
	}
	
}
