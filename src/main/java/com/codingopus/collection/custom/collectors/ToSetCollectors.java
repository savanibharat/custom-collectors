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

import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

/**
 * {@link ToSetCollectors} is used to create {@link Collector}
 * that accepts initial capacity.
 * */
public final class ToSetCollectors {

	 private static final Set<Collector.Characteristics> CH_ID
     = Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
	
	 private static final Set<Collector.Characteristics> CH_UNORDERED_ID
     = Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.UNORDERED,
                                              Collector.Characteristics.IDENTITY_FINISH));
	
	/**
	 * Create a {@link Collector} of type {@link HashSet}
	 * with initial capacity.
	 * 
	 * @param <T> type of input elements for new Collector
	 * */
	public static <T> Collector<T, ?, Set<T>> toHashSet(
			final int initialCapacity) {
		
		return
				CollectionCollector.toCollection(
						initialCapacity, 
						HashSet::new, 
						CH_UNORDERED_ID);
	}
	
	/**
	 * Create a {@link Collector} of type {@link LinkedHashSet}
	 * with initial capacity.
	 * 
	 * @param <T> type of input elements for new Collector
	 * */
	public static <T> Collector<T, ?, Set<T>> toLinkedHashSet(
			final int initialCapacity) {
		
		return
				CollectionCollector.toCollection(
						initialCapacity, 
						LinkedHashSet::new, 
						CH_ID);
	}
	
	/**
	 * Creates a {@link Collector} of type {@link TreeSet}
	 * 
	 * All elements inserted into implement the 
	 * {@link Comparable} interface.
	 * 
	 * @param <T> type of input elements for new Collector
	 * */
	public static <T> Collector<T, ?, NavigableSet<T>> toTreeSet() {
		
		return 
				CollectionCollector.toCollection(
						TreeSet::new, 
						CH_ID);
	}
	
	/**
	 * Create a {@link Collector} of type {@link TreeSet}
	 * 
	 * All elements inserted into implement the 
	 * {@link Comparator} interface.
	 * 
	 * @param <T> type of input elements of new Collector
	 * */
	public static <T> Collector<T, ?, NavigableSet<T>> toTreeSet(
			final Comparator<? super T> comparator) {
		
		return 
				CollectionCollector.toCollection(
						() -> new TreeSet<>(comparator),
						CH_ID);
	}
}
