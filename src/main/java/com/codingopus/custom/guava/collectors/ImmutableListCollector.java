package com.codingopus.custom.guava.collectors;

import java.util.stream.Collector;

import com.google.common.collect.ImmutableList;

public final class ImmutableListCollector<T> {
	
	public static <T> Collector<T, ImmutableList.Builder<T>, ImmutableList<T>>
	toListCollector() {
		
		return 
				Collector.of(
				ImmutableList.Builder<T>::new, 
				ImmutableList.Builder<T>::add, 
				(left, right) -> left.addAll(right.build()),
				ImmutableList.Builder<T>::build);
	}
	
}