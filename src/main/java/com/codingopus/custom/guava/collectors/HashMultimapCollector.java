package com.codingopus.custom.guava.collectors;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.google.common.collect.HashMultimap;

public final class HashMultimapCollector {

	public static <T, K> Collector<T, ?, HashMultimap<K, T>>
	toHashMultimap(
			final Function<? super T, ? extends K> keyExtractor){
		
		return toHashMultimap(keyExtractor, Function.identity());
	}
	
	public static <T, K, V> Collector<T, ?, HashMultimap<K, V>>
	toHashMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return 
				Collector.of(
						HashMultimap::create,
						(map, value) -> map.put(keyExtractor.apply(value),valueExtractor.apply(value)),
						(c1, c2) -> {
							c1.putAll(c2);
							return c1;
						},
						Characteristics.UNORDERED);
	}
	
}
