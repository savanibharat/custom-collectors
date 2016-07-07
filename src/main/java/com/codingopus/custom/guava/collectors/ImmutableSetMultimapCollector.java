package com.codingopus.custom.guava.collectors;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.google.common.collect.ImmutableSetMultimap;

public final class ImmutableSetMultimapCollector<T, K> {

	public static <T, K> Collector<T, ?, ImmutableSetMultimap<K, T>> toImmutableSetMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor) {

		return toImmutableSetMultimapCollector(keyExtractor, Function.identity());
	}

	public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor,
			final Function<? super T, ? extends V> valueExtractor) {

		return 
				Collector.of(
						ImmutableSetMultimap::builder,
						(map, val) -> map.put(keyExtractor.apply(val), valueExtractor.apply(val)),
						(l, r) -> l.putAll(r.build()), 
						ImmutableSetMultimap.Builder<K, V>::build, 
						Characteristics.UNORDERED);
	}
}