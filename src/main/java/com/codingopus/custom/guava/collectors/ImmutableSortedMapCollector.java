package com.codingopus.custom.guava.collectors;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.google.common.collect.ImmutableSortedMap;

public final class ImmutableSortedMapCollector<T, K extends Comparable<?>, V>  {

	public static <T, K extends Comparable<?>> Collector<T, ?, ImmutableSortedMap<K, T>> 
	toImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor) {
		
		return toImmutableSortedMap(keyExtractor, Function.identity());
	}
	
	
	public static <T, K extends Comparable<?>, V> Collector<T, ?, ImmutableSortedMap<K, V>> 
	toImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {

	        return 
	        		Collector.of(
	        				ImmutableSortedMap::naturalOrder,
	        				(map, val) -> map.put(keyExtractor.apply(val), valueExtractor.apply(val)),
	        				(l, r) -> l.putAll(r.build()),
	        				ImmutableSortedMap.Builder<K, V>::build,
	        				Characteristics.CONCURRENT);
	}
	
	public static <T, K extends Comparable<?>> Collector<T, ?, ImmutableSortedMap<K, T>> 
	toReverseImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor) {
		return toReverseImmutableSortedMap(keyExtractor, Function.identity());
	}
	
	
	public static <T, K extends Comparable<?>, V> Collector<T, ?, ImmutableSortedMap<K, V>> 
	toReverseImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {

	        return 
	        		Collector.of(
	        				ImmutableSortedMap::reverseOrder,
	        				(map, val) -> map.put(keyExtractor.apply(val), valueExtractor.apply(val)),
	        				(l, r) -> l.putAll(r.build()),
	        				ImmutableSortedMap.Builder<K, V>::build,
	        				Characteristics.CONCURRENT);
	}
}
