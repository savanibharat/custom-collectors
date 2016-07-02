package com.codingopus.custom.collectors;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public final class ToSetCollectors {

	public static <T> Collector<T, ?, Set<T>> toHashSet(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toUnOrderedCollection(
						initialCapacity, 
						HashSet::new, 
						characteristics);
	}
	
	public static <T> Collector<T, ?, Set<T>> toLinkedHashSet(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return
				CollectionCollector.toUnOrderedCollection(
						initialCapacity, 
						LinkedHashSet::new, 
						characteristics);
	}
	
	/**
	 * All elements inserted into implement the 
	 * {@link Comparable} interface.
	 * */
	public static <T> Collector<T, ?, NavigableSet<T>> toTreeSet(
			final Characteristics... characteristics){
		
		return 
				CollectionCollector.toCollection(
						TreeSet::new, 
						characteristics);
	}
	
	/**
	 * All elements inserted into implement the 
	 * {@link Comparator} interface.
	 * */
	public static <T> Collector<T, ?, NavigableSet<T>> toTreeSet(
			final Comparator<? super T> comparator,
			final Characteristics... characteristics){
		
		return 
				CollectionCollector.toCollection(
						() -> new TreeSet<>(comparator), 
						characteristics);
	}
	

	
}
