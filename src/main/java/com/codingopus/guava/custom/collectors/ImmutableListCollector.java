package com.codingopus.guava.custom.collectors;

import java.util.stream.Collector;

import com.google.common.collect.ImmutableList;

public final class ImmutableListCollector<T> {
	
	/**
	 * @returns a {@link Collector} that collects data in
	 * {@link ImmutableList}.
	 * 
	 * @param <T> The type of input elements for the new collector.
	 * */
	public static <T> Collector<T, ImmutableList.Builder<T>, ImmutableList<T>>
	toListCollector() {
		
		return 
				Collector.of(
						ImmutableList.Builder<T>::new, 
						ImmutableList.Builder<T>::add, 
						(left, right) -> left.addAll(right.build()),
						ImmutableList.Builder<T>::build
					);
	}
}