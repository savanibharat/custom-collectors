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

package com.codingopus.collection.custom.collectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public final class CollectionCollector {

	/**
	 * Creates a {@link Collector} of specified {@link Supplier} 
	 * and {@link Characteristics}.
	 * 
	 * @param T The type of input elements for the new collector
	 * @param C The type of {@link Collection}
	 * */
	public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(
			final Supplier<C> supplierFactory, 
			final Set<Collector.Characteristics> characteristics) {

		return 
				Collector.of(
						supplierFactory, 
						C::add, 
						(t, u) -> {
							t.addAll(u);
							return t;
						}, 
						characteristics.toArray(new Characteristics[0]));
	}

	/**
	 * This method accepts initial capacity as int-valued argument.
	 * Example:
	 * We can use this argument to create new {@link ArrayList} using
	 * {@link ArrayList#ArrayList(int)} constructor.
	 * 
	 * @param T The type of input elements for the new collector
	 * @param C The type of {@link Collection}
	 * */
	public static <T, C extends Collection<T>> Collector<T, ?, C>  toCollection(
			final int initialCapacity, 
			final IntFunction<C> sizedFactory, 
			final Set<Collector.Characteristics> characteristics) {
		
		return toCollection(() -> sizedFactory.apply(initialCapacity), characteristics);
	}
}
