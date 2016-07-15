/*
 * Copyright 2016 Bharat Savani
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.codingopus.guava.custom.collectors;

import java.util.function.Function;
import java.util.stream.Collector;

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
	        				ImmutableSortedMap.Builder<K, V>::build);
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
	        				ImmutableSortedMap.Builder<K, V>::build);
	}
}
