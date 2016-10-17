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

import com.google.common.collect.ImmutableSortedSet;

public final class ImmutableSortedSetCollector<T extends Comparable<?>> {

	/**
     * @returns a {@link Collector} that collects data in
     * {@link ImmutableSortedSet} whose elements are
     * ordered by their natural ordering.
     *
     * @param <T> The type of input elements for the new 
     * collector.
     * */
	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedSet.Builder<T>, ImmutableSortedSet<T>>
	toImmutableSortedSetCollector() {
		return 
				Collector.of(
						ImmutableSortedSet::naturalOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedSet.Builder<T>::build);
	}
	
	/**
     * @returns a {@link Collector} that collects data in
     * {@link ImmutableSortedSet} whose elements are
     * ordered by reverse of the their natural ordering.
     *
     * @param <T> The type of input elements for the new 
     * collector.
     * */
	public static <T extends Comparable<?>>
	Collector<T, ImmutableSortedSet.Builder<T>, ImmutableSortedSet<T>>
	toReverseImmutableSortedSetCollector() {
		return 
				Collector.of(
						ImmutableSortedSet::reverseOrder, 
						(c, v) -> c.add(v),
						(c1, c2) -> c1.addAll(c2.build()),
						ImmutableSortedSet.Builder<T>::build);
	}
}
