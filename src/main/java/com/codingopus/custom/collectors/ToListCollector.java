package com.codingopus.custom.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public class ToListCollector {

	public static <T> Collector<T, ?, List<T>> toArrayList(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toOrderedCollection(
						initialCapacity, 
						ArrayList::new, 
						characteristics);
	}
	
	public static <T> Collector<T, ?, List<T>> toLinkedList(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toOrderedCollection(
						initialCapacity, 
						Vector::new, 
						characteristics);
	}
	
}
