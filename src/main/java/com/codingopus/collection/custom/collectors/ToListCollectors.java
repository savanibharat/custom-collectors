package com.codingopus.collection.custom.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

/**
 * {@link ToListCollectors} is used to create a Collection 
 * {@link Collector} that accepts initial capacity.
 * 
 * */
public final class ToListCollectors {

	/**
	 * @param <T> The type of input elements for the new collector
	 * */
	public static <T> Collector<T, ?, List<T>> toArrayList(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toOrderedCollection(
						initialCapacity, 
						ArrayList::new, 
						characteristics);
	}
	
	public static <T> Collector<T, ?, List<T>> toVector(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toOrderedCollection(
						initialCapacity, 
						Vector::new, 
						characteristics);
	}
	
}
