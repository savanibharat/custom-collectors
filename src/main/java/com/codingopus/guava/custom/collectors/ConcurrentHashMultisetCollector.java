package com.codingopus.guava.custom.collectors;

import java.util.stream.Collector;

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
						});
				
	}

}
