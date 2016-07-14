package com.codingopus.guava.custom.collectors;

import java.util.function.Function;
import java.util.stream.Collector;

import com.google.common.collect.LinkedHashMultimap;

public class LinkedHashMultimapCollector {

	public static <T, K> Collector<T, ?, LinkedHashMultimap<K, T>>
	toLinkedHashMultimap(
			final Function<? super T, ? extends K> keyExtractor) {
		
		return toLinkedHashMultimap(keyExtractor, Function.identity());
	}
	
	public static <T, K, V> Collector<T, ?, LinkedHashMultimap<K, V>>
	toLinkedHashMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return 
				Collector.of(
						LinkedHashMultimap::create,
						(map, value) -> map.put(keyExtractor.apply(value),valueExtractor.apply(value)),
						(c1, c2) -> {
							c1.putAll(c2);
							return c1;
						});
	}

	
}
