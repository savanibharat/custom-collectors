package com.codingopus.collection.custom.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

/**
 * {@link ToListCollectors} is used to create a Collection 
 * {@link Collector} that accepts initial capacity.
 * 
 * */
public final class ToListCollectors {

	 private static final Set<Collector.Characteristics> CH_ID
     = Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
	 private static final Set<Collector.Characteristics> CH_UNORDERED_ID
     = Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.UNORDERED,
                                              Collector.Characteristics.IDENTITY_FINISH));
	
	/**
	 * @param <T> The type of input elements for the new collector
	 * */
	public static <T> Collector<T, ?, List<T>> toArrayList(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toCollection(
						initialCapacity, 
						ArrayList::new, 
						CH_ID);
	}
	
	public static <T> Collector<T, ?, List<T>> toVector(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toCollection(
						initialCapacity, 
						Vector::new, 
						CH_ID);
	}
	
}
