package com.codingopus.guava.custom.collectors;

import java.util.stream.Collector;

import com.google.common.collect.ImmutableSortedSet;

public final class ImmutableSortedSetCollector<T extends Comparable<?>> {

	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedSet.Builder<T>, ImmutableSortedSet<T>>
	toImmutableSortedSetCollector() {
		return 
				Collector.of(
						ImmutableSortedSet::naturalOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedSet.Builder<T>::build);
	}
	
	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedSet.Builder<T>, ImmutableSortedSet<T>>
	toReverseImmutableSortedSetCollector() {
		return 
				Collector.of(
						ImmutableSortedSet::reverseOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedSet.Builder<T>::build);
	}
}
