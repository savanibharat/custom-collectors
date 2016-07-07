package com.codingopus.custom.guava.collectors;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.google.common.collect.ArrayListMultimap;

public final class ArrayListMultimapCollector<T, K, V> {
	
	public static <T, K> Collector<T, ?, ArrayListMultimap<K, T>>
	toArrayListMultimap(
			final Function<? super T, ? extends K> keyExtractor) {
		
		return toArrayListMultimap(keyExtractor, Function.identity());
	}
	
	public static <T, K, V> Collector<T, ?, ArrayListMultimap<K, V>>
	toArrayListMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return 
				Collector.of(
						ArrayListMultimap::create,
						(map, value) -> map.put(keyExtractor.apply(value),valueExtractor.apply(value)),
						(c1, c2) -> {
							c1.putAll(c2);
							return c1;
						},
						Characteristics.CONCURRENT);
	}
}