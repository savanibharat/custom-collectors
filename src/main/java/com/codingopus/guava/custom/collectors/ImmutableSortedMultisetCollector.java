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

import java.util.stream.Collector;

import com.google.common.collect.ImmutableSortedMultiset;

public final class ImmutableSortedMultisetCollector<T extends Comparable<?>> {

	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedMultiset.Builder<T>, ImmutableSortedMultiset<T>>
	toImmutableSortedMultisetCollector() {
		return 
				Collector.of(
						ImmutableSortedMultiset::naturalOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedMultiset.Builder<T>::build);
	}
	
	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedMultiset.Builder<T>, ImmutableSortedMultiset<T>>
	toReverseImmutableSortedMultisetCollector() {
		return 
				Collector.of(
						ImmutableSortedMultiset::reverseOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedMultiset.Builder<T>::build);
	}
}
