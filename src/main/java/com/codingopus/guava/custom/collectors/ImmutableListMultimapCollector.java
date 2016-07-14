package com.codingopus.guava.custom.collectors;

import java.util.function.Function;
import java.util.stream.Collector;

import com.google.common.collect.ImmutableListMultimap;

public final class ImmutableListMultimapCollector<T, K> {

	public static <T, K> Collector<T, ?, ImmutableListMultimap<K, T>> 
	toImmutableListMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor) {
		
		return toImmutableListMultimapCollector(keyExtractor, Function.identity());
	}
	
	public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> 
	toImmutableListMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor,
			final Function<? super T, ? extends V> valueExtractor) {
		
		return 
        		Collector.of(
        				ImmutableListMultimap::builder,
        				(map, val) -> map.put(keyExtractor.apply(val), valueExtractor.apply(val)),
        				(l, r) -> l.putAll(r.build()),
        				ImmutableListMultimap.Builder<K, V>::build);
	}
}
