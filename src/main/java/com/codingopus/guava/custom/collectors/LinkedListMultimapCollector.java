package com.codingopus.guava.custom.collectors;

import java.util.function.Function;
import java.util.stream.Collector;

import com.google.common.collect.LinkedListMultimap;

public final class LinkedListMultimapCollector {

	public static <T, K> Collector<T, ?, LinkedListMultimap<K, T>>
	toLinkedListMultimap(
			final Function<? super T, ? extends K> keyExtractor) {
		
		return toLinkedListMultimap(keyExtractor, Function.identity());
	}
	
	public static <T, K, V> Collector<T, ?, LinkedListMultimap<K, V>>
	toLinkedListMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return 
				Collector.of(
						LinkedListMultimap::create,
						(map, value) -> map.put(keyExtractor.apply(value),valueExtractor.apply(value)),
						(c1, c2) -> {
							c1.putAll(c2);
							return c1;
						});
	}

	
}
