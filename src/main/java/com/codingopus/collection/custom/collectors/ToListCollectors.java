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
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collector;

/**
 * {@link ToListCollectors} is used to create a Collection 
 * {@link Collector} that accepts initial capacity.
 * 
 * */
public final class ToListCollectors {

	 private static final Set<Collector.Characteristics> CH_ID
     = Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
	
	/**
	 * @param <T> The type of input elements for the new collector
	 * */
	public static <T> Collector<T, ?, List<T>> toArrayList(
			final int initialCapacity) {
		
		return
				CollectionCollector.toCollection(
						initialCapacity, 
						ArrayList::new, 
						CH_ID);
	}
	
	public static <T> Collector<T, ?, List<T>> toVector(
			final int initialCapacity) {
		
		return
				CollectionCollector.toCollection(
						initialCapacity, 
						Vector::new, 
						CH_ID);
	}
	
}
