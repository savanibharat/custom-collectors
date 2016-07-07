package com.codingopus.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.codingopus.collection.custom.collectors.ToListCollectors;
import com.codingopus.collection.custom.collectors.ToSetCollectors;
import com.codingopus.custom.guava.collectors.ArrayListMultimapCollector;
import com.codingopus.custom.guava.collectors.HashMultimapCollector;
import com.codingopus.custom.guava.collectors.ImmutableListCollector;
import com.codingopus.custom.guava.collectors.ImmutableListMultimapCollector;
import com.codingopus.custom.guava.collectors.ImmutableMapCollector;
import com.codingopus.custom.guava.collectors.ImmutableMultisetCollector;
import com.codingopus.custom.guava.collectors.ImmutableSetMultimapCollector;
import com.codingopus.custom.guava.collectors.ImmutableSortedMapCollector;
import com.codingopus.custom.guava.collectors.ImmutableSortedMultisetCollector;
import com.codingopus.custom.guava.collectors.ImmutableSortedSetCollector;
import com.codingopus.custom.guava.collectors.LinkedListMultimapCollector;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.LinkedListMultimap;

/**
 * Insert every collector here and test from here.
 * */
public class CustomCollectors {
	
	public static <T> Collector<T, ?, List<T>> toArrayList(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		return ToListCollectors.toArrayList(initialCapacity, characteristics);
	}
	
	public static <T> Collector<T, ?, List<T>> toVector(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		return ToListCollectors.toVector(initialCapacity, characteristics);
	}
	
	public static <T> Collector<T, ?, Set<T>> toHashSet(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return ToSetCollectors.toHashSet(initialCapacity, characteristics);
	}
	
	public static <T> Collector<T, ?, Set<T>> toLinkedHashSet(
			final int initialCapacity, 
			final Characteristics... characteristics) {
		
		return ToSetCollectors.toLinkedHashSet(initialCapacity, characteristics);
	}
	
	public static <T> Collector<T, ?, NavigableSet<T>> toTreeSet(
			final Characteristics... characteristics) {
		
		return ToSetCollectors.toTreeSet(characteristics);
	}

	public static <T> Collector<T, ?, NavigableSet<T>> toTreeSet(
			final Comparator<? super T> comparator,
			final Characteristics... characteristics) {
		
		return ToSetCollectors.toTreeSet(comparator, characteristics);
	}
	
	public static <T, K> Collector<T, ?, ArrayListMultimap<K, T>>
	toArrayListMultimap(
			final Function<? super T, ? extends K> keyExtractor) {
		return ArrayListMultimapCollector.toArrayListMultimap(keyExtractor);
	}
	
	public static <T, K, V> Collector<T, ?, ArrayListMultimap<K, V>>
	toArrayListMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return ArrayListMultimapCollector.toArrayListMultimap(keyExtractor, valueExtractor);
	}
	
	public static <T, K> Collector<T, ?, HashMultimap<K, T>>
	toHashMultimap(
			final Function<? super T, ? extends K> keyExtractor) {
		
		return HashMultimapCollector.toHashMultimap(keyExtractor);
	}
	
	public static <T, K, V> Collector<T, ?, HashMultimap<K, V>>
	toHashMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return HashMultimapCollector.toHashMultimap(keyExtractor, valueExtractor);
	}
	
	/**
	 * @return {@link ImmutableListCollector}
	 */
	public static <T> Collector<T, ImmutableList.Builder<T>, ImmutableList<T>>
	toImmutableList() {
		return ImmutableListCollector.toListCollector();
	}
	
//	/**
//	 * @return {@link ImmutableSetCollector}
//	 */
//	public static <T> Collector<T, ?, ImmutableSet<T>> toImmutableSet() {
//		return new ImmutableSetCollector<T>();
//	}
	
	/**
	 * @return {@link ImmutableMultisetCollector}
	 */
	public static <E> ImmutableMultisetCollector<E> toImmutableMultiset() {
		return new ImmutableMultisetCollector<>();
	}
	
	/**
	 * @return {@link ImmutableSortedMultisetCollector}
	 */
	public static <E extends Comparable<E>> ImmutableSortedMultisetCollector<E> toImmutableSortedMultiset() {
		return new ImmutableSortedMultisetCollector<>();
	}
	
	/**
	 * @return {@link ImmutableSortedSetCollector}
	 */
	public static <E extends Comparable<?>> ImmutableSortedSetCollector<E> toImmutableSortedSetCollector() {
		return new ImmutableSortedSetCollector<>();
	}
	
	public static <T, K> Collector<T, ?, ImmutableListMultimap<K, T>> 
	toImmutableListMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor) {
	
		return ImmutableListMultimapCollector.toImmutableListMultimapCollector(keyExtractor);
	}
	
	public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> 
	toImmutableListMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor,
			final Function<? super T, ? extends V> valueExtractor) {
		
		return ImmutableListMultimapCollector.toImmutableListMultimapCollector(keyExtractor, valueExtractor);
	}
	
	public static <T, K extends Comparable<?>> Collector<T, ?, ImmutableMap<K, T>> 
	toImmutableMap(
	        final Function<? super T, ? extends K> keyExtractor) {
		
		return ImmutableMapCollector.toImmutableMap(keyExtractor);
	}
	
	public static <T, K extends Comparable<?>, V> Collector<T, ?, ImmutableMap<K, V>> 
	toImmutableMap(
	        final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return ImmutableMapCollector.toImmutableMap(keyExtractor, valueExtractor);
	}
	
	public static <T, K> Collector<T, ?, ImmutableSetMultimap<K, T>> 
	toImmutableSetMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor) {
	
		return ImmutableSetMultimapCollector.toImmutableSetMultimapCollector(keyExtractor);
	}
	
	public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimapCollector(
			final Function<? super T, ? extends K> keyExtractor,
			final Function<? super T, ? extends V> valueExtractor) {
		
		return ImmutableSetMultimapCollector.toImmutableSetMultimapCollector(keyExtractor, valueExtractor);
	}
	public static <T, K extends Comparable<?>> Collector<T, ?, ImmutableSortedMap<K, T>> 
	toImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor) {
		
		return ImmutableSortedMapCollector.toImmutableSortedMap(keyExtractor);
		
	}
	
	public static <T, K extends Comparable<?>, V> Collector<T, ?, ImmutableSortedMap<K, V>> 
	toImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return ImmutableSortedMapCollector.toImmutableSortedMap(keyExtractor, valueExtractor);
	}
	
	public static <T, K extends Comparable<?>> Collector<T, ?, ImmutableSortedMap<K, T>> 
	toReverseImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor) {
		
		return ImmutableSortedMapCollector.toReverseImmutableSortedMap(keyExtractor);
	}
	
	public static <T, K extends Comparable<?>, V> Collector<T, ?, ImmutableSortedMap<K, V>> 
	toReverseImmutableSortedMap(
	        final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return ImmutableSortedMapCollector.toReverseImmutableSortedMap(keyExtractor, valueExtractor);
	}
	
	public static <T, K> Collector<T, ?, LinkedListMultimap<K, T>>
	toLinkedListMultimap(
			final Function<? super T, ? extends K> keyExtractor) {
		
		return LinkedListMultimapCollector.toLinkedListMultimap(keyExtractor);
	}
	
	public static <T, K, V> Collector<T, ?, LinkedListMultimap<K, V>>
	toLinkedListMultimap(
			final Function<? super T, ? extends K> keyExtractor,
	        final Function<? super T, ? extends V> valueExtractor) {
		
		return LinkedListMultimapCollector.toLinkedListMultimap(keyExtractor, valueExtractor);
	}
}
