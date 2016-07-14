package com.codingopus.guava.custom.collectors;

import java.util.stream.Collector;

import com.google.common.collect.ImmutableSet;

public final class ImmutableSetCollector<T> {

	public static <T> Collector<T, ImmutableSet.Builder<T>, ImmutableSet<T>>
	toSetCollector() {
		
		return 
				Collector.of(
						ImmutableSet.Builder<T>::new,
						ImmutableSet.Builder<T>::add,
						(left, right) -> left.addAll(right.build()),
			            ImmutableSet.Builder<T>::build);
	}
}
