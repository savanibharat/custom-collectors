package org.codingopus.custom.collectors;

import static com.codingopus.collectors.CustomCollectors.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.codingopus.guava.custom.collectors.ConcurrentHashMultisetCollector;
import com.codingopus.guava.custom.collectors.ImmutableMultisetCollector;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSetMultimap;

@SuppressWarnings("unused")
public class AllDrivers {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");

		immutableListMultiMap();
	}

	public static void demoArrayListMultimapCollectorWithKey(Map<Integer, String> map) {

		ArrayListMultimap<Integer, Entry<Integer, String>> arrayListMultimapCollector =
				map.entrySet()
				.stream().collect(toArrayListMultimap(a -> a.getKey()));

		System.out.println(arrayListMultimapCollector);
		ArrayListMultimap<Integer, Entry<Integer, String>> arrayListMultimap = ArrayListMultimap.create();
		ArrayListMultimap<Integer, String> oneValue = ArrayListMultimap.create();
		oneValue.put(1, "One");
		
		ArrayListMultimap<Integer, String> twoValue = ArrayListMultimap.create();
		twoValue.put(2, "Two");
		arrayListMultimap.put(1, oneValue.entries().iterator().next());
		arrayListMultimap.put(2, twoValue.entries().iterator().next());
		System.out.println(arrayListMultimap.equals(arrayListMultimapCollector));
	}

	public static void demoArrayListMultimapCollectorWithKeyAndValue(Map<Integer, String> map) {

		ArrayListMultimap<Integer, String> arrayListMultimapCollector =
				map.entrySet()
				.stream().collect(toArrayListMultimap(k -> k.getKey(), v -> v.getValue()));

		System.out.println(arrayListMultimapCollector);
		ArrayListMultimap<Integer, String> arrayListMultimap = ArrayListMultimap.create();
		arrayListMultimap.put(1, "One");
		arrayListMultimap.put(2, "Two");
		System.out.println(arrayListMultimap);
		System.out.println(arrayListMultimap.equals(arrayListMultimapCollector));
	}
	
	public static void concurrentHashMultisetCollector(){
		
		ConcurrentHashMultiset<String> concurrentHashMultiset = ConcurrentHashMultiset.create();
		concurrentHashMultiset.add("a");
		concurrentHashMultiset.add("b");
		concurrentHashMultiset.add("c");
		System.out.println(concurrentHashMultiset);
		
		Set<String> set = new HashSet<>();
		set.add("a"); set.add("b"); set.add("c");
		
		ConcurrentHashMultiset<String> concurrentHashMultiset2 = 
		
		set.stream()
			.collect(ConcurrentHashMultisetCollector.toConcurrentHashMultisetCollector());
		
		System.out.println(concurrentHashMultiset.equals(concurrentHashMultiset2));
	}
	
	public static void hashMultimapCollector(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		HashMultimap<Integer, Entry<Integer, String>> hashMultimapCollector= 
				map.entrySet().stream()
					.collect(toHashMultimap(k->k.getKey()));
		System.out.println(hashMultimapCollector);
		
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
		System.out.println(hashMultimap);
		
		System.out.println(hashMultimapCollector.equals(hashMultimap));
	}

	public static void immutableListMultiMap(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		ImmutableListMultimap<Integer, String> immutableListMultimapCollector
		=map.entrySet().stream().collect(toImmutableListMultimapCollector(k->k.getKey(),
				v->v.getValue()));
		
		ImmutableListMultimap<Integer, String> immutableListMultimap 
		= ImmutableListMultimap.of(1, "One", 2, "Two", 3, "Three");
		System.out.println(immutableListMultimap);
		System.out.println(immutableListMultimapCollector.equals(immutableListMultimap));
	}
	
	public static void immutableMultiset() {
		//ImmutableMultisetCollector
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		ImmutableMultiset<Integer> immutableMultisetCollector = 
		list.stream()
			.collect(toImmutableMultisetCollector());
		
	}
	
	public static void immutableSetMultimapCollector(){
		
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
		
		
		
	}
	
	
}
