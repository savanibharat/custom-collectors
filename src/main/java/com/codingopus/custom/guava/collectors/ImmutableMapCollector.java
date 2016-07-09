package com.codingopus.custom.guava.collectors;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.google.common.collect.ImmutableMap;

public final class ImmutableMapCollector<T, K, V> {

	public static <T, K extends Comparable<?>> Collector<T, ?, ImmutableMap<K, T>> 
	toImmutableMap(
	        final Function<? super T, ? extends K> keyExtractor) {
		
		return toImmutableMap(keyExtractor, Function.identity());
	}
	
	public static <T, K extends Comparable<?>, V> Collector<T, ?, ImmutableMap<K, V>> 
	toImmutableMap(
	        final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {

	        return 
	        		Collector.of(
	        				ImmutableMap::builder,
	        				(map, val) -> map.put(keyExtractor.apply(val), valueExtractor.apply(val)),
	        				(left, right) -> left.putAll(right.build()),
	        				ImmutableMap.Builder<K, V>::build,
	        				Characteristics.CONCURRENT
	        			);
	    }

}
