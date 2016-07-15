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
