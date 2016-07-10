package org.codingopus.custom.collectors;

import static com.codingopus.collectors.CustomCollectors.toArrayListMultimap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.ArrayListMultimap;

public class AllDrivers {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		demoArrayListMultimapCollector(map);
	}

	public static void demoArrayListMultimapCollector(Map<Integer, String> map) {

		ArrayListMultimap<Entry<Integer, String>, Entry<Integer, String>> arrayListMultimapCollector =
				map.entrySet()
				.stream().collect(toArrayListMultimap(a->a));

		System.out.println(arrayListMultimapCollector);
		
	}

}
