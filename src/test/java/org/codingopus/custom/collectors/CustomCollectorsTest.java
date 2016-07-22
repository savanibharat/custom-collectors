package org.codingopus.custom.collectors;

import static com.codingopus.collectors.CustomCollectors.toArrayList;
import static com.codingopus.collectors.CustomCollectors.toArrayListMultimap;
import static com.codingopus.collectors.CustomCollectors.toHashMultimap;
import static com.codingopus.collectors.CustomCollectors.toHashSet;
import static com.codingopus.collectors.CustomCollectors.toImmutableList;
import static com.codingopus.collectors.CustomCollectors.toImmutableListMultimapCollector;
import static com.codingopus.collectors.CustomCollectors.toImmutableMap;
import static com.codingopus.collectors.CustomCollectors.toImmutableMultisetCollector;
import static com.codingopus.collectors.CustomCollectors.toImmutableSet;
import static com.codingopus.collectors.CustomCollectors.toImmutableSetMultimapCollector;
import static com.codingopus.collectors.CustomCollectors.toImmutableSortedMap;
import static com.codingopus.collectors.CustomCollectors.toImmutableSortedMultisetCollector;
import static com.codingopus.collectors.CustomCollectors.toImmutableSortedSetCollector;
import static com.codingopus.collectors.CustomCollectors.toLinkedHashMultimap;
import static com.codingopus.collectors.CustomCollectors.toLinkedHashSet;
import static com.codingopus.collectors.CustomCollectors.toLinkedListMultimap;
import static com.codingopus.collectors.CustomCollectors.toReverseImmutableSortedMap;
import static com.codingopus.collectors.CustomCollectors.toReverseImmutableSortedMultisetCollector;
import static com.codingopus.collectors.CustomCollectors.toReverseImmutableSortedSetCollector;
import static com.codingopus.collectors.CustomCollectors.toTreeSet;
import static com.codingopus.collectors.CustomCollectors.toVector;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;

public class CustomCollectorsTest {
//put them in different file. here it looks dirty.
	final List<String> names = Arrays.asList("John", "Jane", "Markus", "Tim");
	final String namesAsString = names.toString();
	final Set<String> hashSet = new HashSet<>(names);
	final NavigableSet<String> treeSet = new TreeSet<>(names);
	final Set<String> linkedHashSet = new LinkedHashSet<>(names);

	@Test
	public void arrayListWithInitialCapacity() {
		List<String> listWithInitialCapacity = names.stream().collect(toArrayList(10));
		Assert.assertEquals(listWithInitialCapacity, names);
	}

	@Test
	public void vectorWithInitialCapacity() {
		List<String> listWithInitialCapacity = names.stream().collect(toVector(10));
		Assert.assertEquals(listWithInitialCapacity, names);
	}

	@Test
	public void hashSetWithInitialCapacity() {

		Set<String> setWithInitialCapacity = hashSet.stream().collect(toHashSet(20));
		Assert.assertEquals(setWithInitialCapacity, hashSet);
	}

	@Test
	public void linkedHashSetWithInitialCapacity() {
		Set<String> setWithInitialCapacity = linkedHashSet.stream().collect(toLinkedHashSet(20));
		Assert.assertEquals(setWithInitialCapacity, linkedHashSet);
	}

	@Test
	public void treeSet() {
		NavigableSet<String> navigableSet = treeSet.stream().collect(toTreeSet());
		Assert.assertEquals(navigableSet, treeSet);
	}

	@Test
	public void treeSetWithComparator() {
		NavigableSet<String> navigableSet = treeSet.stream().collect(toTreeSet(String::compareTo));
		Assert.assertEquals(navigableSet, treeSet);
	}

	@Test
	public void arrayListMultimapCollectorWithKey(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		
		ArrayListMultimap<Integer, Entry<Integer, String>> arrayListMultimapCollector =
				map.entrySet()
				.stream().collect(toArrayListMultimap(a -> a.getKey()));

		ArrayListMultimap<Integer, Entry<Integer, String>> arrayListMultimap = ArrayListMultimap.create();
		ArrayListMultimap<Integer, String> oneValue = ArrayListMultimap.create();
		oneValue.put(1, "One");
		ArrayListMultimap<Integer, String> twoValue = ArrayListMultimap.create();
		twoValue.put(2, "Two");

		arrayListMultimap.put(1, oneValue.entries().iterator().next());
		arrayListMultimap.put(2, twoValue.entries().iterator().next());
		
		Assert.assertEquals(arrayListMultimapCollector, arrayListMultimap);
	}
	
	@Test
	public void arrayListMultimapCollectorWithKeysAndValues(){
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		
		ArrayListMultimap<Integer, String> arrayListMultimapCollector =
				map.entrySet()
				.stream().collect(toArrayListMultimap(k -> k.getKey(), v -> v.getValue()));

		ArrayListMultimap<Integer, String> arrayListMultimap = ArrayListMultimap.create();
		arrayListMultimap.put(1, "One");
		arrayListMultimap.put(2, "Two");

		Assert.assertEquals(arrayListMultimapCollector, arrayListMultimap);
	}
	
//	@Test
//	public void concurrentHashMultisetCollector(){
//		
//		Set<String> set = new HashSet<>();
//		set.add("a"); set.add("b"); set.add("c");
//		
//		ConcurrentHashMultiset<String> concurrentHashMultisetCollector = 
//		
//		set.stream()
//		   .collect(toConcurrentHashMultisetCollector());
//		
//		ConcurrentHashMultiset<String> concurrentHashMultiset = ConcurrentHashMultiset.create();
//		concurrentHashMultiset.add("a");
//		concurrentHashMultiset.add("b");
//		concurrentHashMultiset.add("c");
//		
//		Assert.assertEquals(concurrentHashMultisetCollector, concurrentHashMultiset);
//	}
	
	@Test
	public void hashMultimapCollectorWithKey(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		HashMultimap<Integer, Entry<Integer, String>> hashMultimapCollector= 
				map.entrySet().stream()
					.collect(toHashMultimap(k->k.getKey()));
		
		HashMultimap<Integer, Entry<Integer, String>> hashMultimap = HashMultimap.create();
		
		HashMultimap<Integer, String> oneValue = HashMultimap.create();
		oneValue.put(1, "One");
		
		HashMultimap<Integer, String> twoValue = HashMultimap.create();
		twoValue.put(2, "Two");
		
		HashMultimap<Integer, String> threeValue = HashMultimap.create();
		threeValue.put(3, "Three");
		
		hashMultimap.put(1, oneValue.entries().iterator().next());
		hashMultimap.put(2, twoValue.entries().iterator().next());
		hashMultimap.put(3, threeValue.entries().iterator().next());
		
		Assert.assertEquals(hashMultimapCollector, hashMultimap);
	}
	
	@Test
	public void hashMultimapCollectorWithKeyAndValues(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		HashMultimap<Integer, String> hashMultimapCollector= 
				map.entrySet().stream()
					.collect(toHashMultimap(k -> k.getKey(), v -> v.getValue()));
		
		HashMultimap<Integer, String> hashMultimap = HashMultimap.create();
		
		hashMultimap.put(1, "One");
		hashMultimap.put(2, "Two");
		hashMultimap.put(3, "Three");
		
		Assert.assertEquals(hashMultimapCollector, hashMultimap);
	}
	
	@Test
	public void immutableList(){
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		ImmutableList<Integer> immutableList = list.stream().collect(toImmutableList());
		Assert.assertEquals(immutableList, ImmutableList.of(1, 2, 3, 4, 5));
	}
	
	@Test
	public void immutableListMultimapCollectorWithKeys(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		ImmutableListMultimap<Integer, Entry<Integer, String>> immutableListMultimapCollector
		=map.entrySet().stream().collect(toImmutableListMultimapCollector(k->k.getKey()));
		
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		ImmutableListMultimap<Integer, Entry<Integer, String>> immutableListMultimap 
		= ImmutableListMultimap.of(1, iterator.next(), 2, iterator.next(), 3, iterator.next());
		
		Assert.assertEquals(immutableListMultimapCollector, immutableListMultimap);
	}

	@Test
	public void immutableListMultimapCollectorWithKeysAndValues(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		ImmutableListMultimap<Integer, String> immutableListMultimapCollector
		=map.entrySet().stream().collect(toImmutableListMultimapCollector(
				k -> k.getKey(),
				v -> v.getValue()));
		
		ImmutableListMultimap<Integer, String> immutableListMultimap 
		= ImmutableListMultimap.of(1, "One", 2, "Two", 3, "Three");
		
		Assert.assertEquals(immutableListMultimapCollector, immutableListMultimap);
	}
	
	@Test
	public void immutableMapWithKeys(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		ImmutableMap<Integer, Entry<Integer, String>> immutableMapCollector = 
				map.entrySet().stream().collect(toImmutableMap(k -> k.getKey()));
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		ImmutableMap<Integer, Entry<Integer, String>> immutableMap =
				ImmutableMap.of(1, oneMap.entrySet().iterator().next(), 
						2, twoMap.entrySet().iterator().next(), 
						3, threeMap.entrySet().iterator().next());

		Assert.assertEquals(immutableMapCollector, immutableMap);
	}
	
	@Test
	public void immutableMapWithKeysAndValues(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		ImmutableMap<Integer, String> immutableMapCollector = 
				map.entrySet().stream().collect(
						toImmutableMap(
								k -> k.getKey(),
								v -> v.getValue()));
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		ImmutableMap<Integer, String> immutableMap =
				ImmutableMap.of(1, "One", 2, "Two", 3, "Three");

		Assert.assertEquals(immutableMapCollector, immutableMap);
	}
	
	@Test
	public void immutableMultiset() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		ImmutableMultiset<Integer> immutableMultisetCollector = 
		list.stream()
			.collect(toImmutableMultisetCollector());
		
		ImmutableMultiset<Integer> immutableMultiset = ImmutableMultiset.of(1, 2, 3, 4, 5);
		Assert.assertEquals(immutableMultisetCollector, immutableMultiset);
	}
	
	@Test
	public void immutableSet(){
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		ImmutableSet<Integer> immutableSet = list.stream().collect(toImmutableSet());
		Assert.assertEquals(immutableSet, ImmutableSet.of(1, 2, 3, 4, 5));
	}
	
	@Test
	public void immutableSetMultimapCollectorWithKeys(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		ImmutableSetMultimap<Integer, Entry<Integer, String>> immutableSetMultimapCollector = 
		map.entrySet().stream().collect(toImmutableSetMultimapCollector(k -> k.getKey()));
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		ImmutableSetMultimap<Integer, Entry<Integer, String>> immutableSetMultimap = 
				ImmutableSetMultimap.of(1, oneMap.entrySet().iterator().next(), 
						2, twoMap.entrySet().iterator().next(), 
						3, threeMap.entrySet().iterator().next());
		
		Assert.assertEquals(immutableSetMultimapCollector, immutableSetMultimap);
		
	}
	
	@Test
	public void immutableSetMultimapCollectorWithKeysAndValues(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		ImmutableSetMultimap<Integer,String> immutableSetMultimapCollector = 
		map.entrySet().stream().collect(
				toImmutableSetMultimapCollector(
						k -> k.getKey(),
						v -> v.getValue()));
		
		ImmutableSetMultimap<Integer, String> immutableSetMultimap = 
				ImmutableSetMultimap.of(1, "One", 2, "Two", 3, "Three");
		
		Assert.assertEquals(immutableSetMultimapCollector, immutableSetMultimap);
	}
	
	@Test
	public void immutableSortedMapWithKeys(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		ImmutableSortedMap<Integer, Entry<Integer, String>> immutableSortedMapCollector = 
		map.entrySet().stream()
		   .collect(toImmutableSortedMap(k -> k.getKey()));
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		Assert.assertEquals(immutableSortedMapCollector, ImmutableSortedMap.of(
				3, threeMap.entrySet().iterator().next(),
				1, oneMap.entrySet().iterator().next(),
				2, twoMap.entrySet().iterator().next()));
		
		//this cannot be done as ImmutableListCollector needs a method that accepts collection.
		//we need to have metohd that accepts collection. so below is possible.
		//Collectors.collectingAndThen(toSet, ImmutableListCollector.toListCollector()) is not possible.
//		.collect(Collectors.collectingAndThen(Collectors.toSet(), ImmutableListCollector::toImmutableList));
		
	}
	
	@Test
	public void immutableSortedMapWithKeysAndValues(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		ImmutableSortedMap<Integer, String> immutableSortedMapCollector = 
		map.entrySet().stream()
		   .collect(toImmutableSortedMap(k -> k.getKey(), v -> v.getValue()));
		
		Assert.assertEquals(immutableSortedMapCollector, ImmutableSortedMap.of(
				3, "Three",
				1, "One",
				2, "Two"));
	}
	
	@Test
	public void immutableSortedMapReverseSortedWithKeys(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		ImmutableSortedMap<Integer, Entry<Integer, String>> immutableSortedMapCollector = 
		map.entrySet().stream()
		   .collect(toReverseImmutableSortedMap(k -> k.getKey()));
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		ImmutableSortedMap.Builder<Integer, Entry<Integer, String>> immutableSortedmap =  
		ImmutableSortedMap.reverseOrder();
		immutableSortedmap.put(1, oneMap.entrySet().iterator().next());
		immutableSortedmap.put(2, twoMap.entrySet().iterator().next());
		immutableSortedmap.put(3, threeMap.entrySet().iterator().next());
		
		Assert.assertEquals(immutableSortedMapCollector, 
				immutableSortedmap.build());
		
	}
	
	@Test
	public void immutableSortedMapReverseSortedWithKeysAndValues(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		ImmutableSortedMap<Integer, String> immutableSortedMapCollector = 
		map.entrySet().stream()
		   .collect(toReverseImmutableSortedMap(k -> k.getKey(), v -> v.getValue()));
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		ImmutableSortedMap.Builder<Integer, String> immutableSortedmap =  
		ImmutableSortedMap.reverseOrder();
		immutableSortedmap.put(1, "One");
		immutableSortedmap.put(2, "Two");
		immutableSortedmap.put(3, "Three");
		
		Assert.assertEquals(immutableSortedMapCollector, 
				immutableSortedmap.build());
	}
	
	@Test
	public void immutableSortedMultiset(){
		
		List<Integer> list = Arrays.asList(8, 7, 4, 3, 2, 2, 1, 8);
		
		ImmutableSortedMultiset<Integer> immutableSortedMultiset = 
				list.stream()
					.collect(toImmutableSortedMultisetCollector());
		
		Assert.assertEquals(immutableSortedMultiset, 
				ImmutableSortedMultiset.of(8, 7, 4, 3, 2, 2, 1, 8));
	}
	
	@Test
	public void immutableSortedMultisetReverse(){
		
		List<Integer> list = Arrays.asList(8, 7, 4, 3, 2, 2, 1, 8);
		
		ImmutableSortedMultiset<Integer> immutableSortedMultiset = 
				list.stream()
					.collect(toReverseImmutableSortedMultisetCollector());
		
		Assert.assertEquals(immutableSortedMultiset, 
				ImmutableSortedMultiset.of(8, 7, 4, 3, 2, 2, 1, 8));
	}
	
	@Test
	public void immutableSortedSet(){
		
		List<Integer> list = Arrays.asList(8, 7, 4, 3, 2, 2, 1, 8);
		
		ImmutableSortedSet<Integer> immutableSortedSet = 
				list.stream()
					.collect(toImmutableSortedSetCollector());
		
		Assert.assertEquals(immutableSortedSet, 
				ImmutableSortedSet.of(8, 7, 4, 3, 2, 2, 1, 8));
	}
	
	@Test
	public void immutableSortedSetReverse(){
		
		List<Integer> list = Arrays.asList(8, 7, 4, 3, 2, 2, 1, 8);
		
		ImmutableSortedSet<Integer> immutableSortedSetReverse = 
				list.stream()
					.collect(toReverseImmutableSortedSetCollector());
		
		Assert.assertEquals(immutableSortedSetReverse, 
				ImmutableSortedSet.reverseOrder().addAll(list).build());
	}
	
	@Test
	public void linkedHashMultimapCollectorWithKeys() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		
		LinkedHashMultimap<Integer, Entry<Integer, String>> linkedHashMultimapCollector =
		map.entrySet()
			.stream().collect(toLinkedHashMultimap(k -> k.getKey()));
		
		LinkedHashMultimap<Integer, Entry<Integer, String>> linkedHashMultimap = 
				LinkedHashMultimap.create();
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		linkedHashMultimap.put(1, oneMap.entrySet().iterator().next());
		linkedHashMultimap.put(2, twoMap.entrySet().iterator().next());
		linkedHashMultimap.put(3, threeMap.entrySet().iterator().next());
				
		Assert.assertEquals(linkedHashMultimapCollector, linkedHashMultimap);
	}
	
	@Test
	public void linkedHashMultimapCollectorWithKeysAndValues() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		
		LinkedHashMultimap<Integer, String> linkedHashMultimapCollector =
		map.entrySet()
			.stream().collect(toLinkedHashMultimap(k -> k.getKey(), v -> v.getValue()));
		
		LinkedHashMultimap<Integer, String> linkedHashMultimap = 
				LinkedHashMultimap.create();
		
		linkedHashMultimap.put(1, "One");
		linkedHashMultimap.put(2, "Two");
		linkedHashMultimap.put(3, "Three");
				
		Assert.assertEquals(linkedHashMultimapCollector, linkedHashMultimap);
	}
	
	@Test
	public void linkedListMultimapCollectorWithKeys() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		
		LinkedListMultimap<Integer, Entry<Integer, String>> linkedListMultimapCollector =
		map.entrySet()
			.stream().collect(toLinkedListMultimap(k -> k.getKey()));
		
		LinkedListMultimap<Integer, Entry<Integer, String>> linkedListMultimap = 
				LinkedListMultimap.create();
		
		Map<Integer, String> oneMap = new HashMap<>();
		oneMap.put(1, "One");
		
		Map<Integer, String> twoMap = new HashMap<>();
		twoMap.put(2, "Two");
		
		Map<Integer, String> threeMap = new HashMap<>();
		threeMap.put(3, "Three");
		
		linkedListMultimap.put(1, oneMap.entrySet().iterator().next());
		linkedListMultimap.put(2, twoMap.entrySet().iterator().next());
		linkedListMultimap.put(3, threeMap.entrySet().iterator().next());
				
		Assert.assertEquals(linkedListMultimapCollector, linkedListMultimap);
	}
	
	@Test
	public void linkedListMultimapCollectorWithKeysAndValues() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(1, "One");
		map.put(2, "Two");
		
		LinkedListMultimap<Integer, String> linkedListMultimapCollector =
		map.entrySet()
			.stream().collect(toLinkedListMultimap(k -> k.getKey(), v -> v.getValue()));
		
		LinkedListMultimap<Integer, String> linkedListMultimap = 
				LinkedListMultimap.create();
		
		linkedListMultimap.put(1, "One");
		linkedListMultimap.put(2, "Two");
		linkedListMultimap.put(3, "Three");
				
		Assert.assertEquals(linkedListMultimapCollector, linkedListMultimap);
	}
	
}