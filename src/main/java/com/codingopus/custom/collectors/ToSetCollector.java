package com.codingopus.custom.collectors;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public class ToSetCollector {

	public static <T> Collector<T, ?, Set<T>> toHashSet(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toUnOrderedCollection(
						initialCapacity, 
						HashSet::new, 
						characteristics);
	}
	
	
	
}
