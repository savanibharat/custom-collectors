package com.codingopus.custom.guava.collectors;

import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import com.google.common.collect.ConcurrentHashMultiset;

public final class ConcurrentHashMultisetCollector {

	public static <T> Collector<T, ConcurrentHashMultiset<T>, ConcurrentHashMultiset<T>>
	toConcurrentHashMultisetCollector() {
		
		return 
				
				Collector.of(
						ConcurrentHashMultiset::create, 
						ConcurrentHashMultiset::add,
						(l, r) -> {
							l.addAll(r); 
							return l;
						}, 
						Characteristics.CONCURRENT);
				
	}

}
