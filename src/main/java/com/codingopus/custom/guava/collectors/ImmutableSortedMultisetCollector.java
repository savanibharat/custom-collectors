package com.codingopus.custom.guava.collectors;

import java.util.stream.Collector;

import com.google.common.collect.ImmutableSortedMultiset;

public final class ImmutableSortedMultisetCollector<T extends Comparable<?>> {

	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedMultiset.Builder<T>, ImmutableSortedMultiset<T>>
	toImmutableSortedMultisetCollector() {
		return 
				Collector.of(
						ImmutableSortedMultiset::naturalOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedMultiset.Builder<T>::build);
	}
}
