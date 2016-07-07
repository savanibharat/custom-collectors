package com.codingopus.custom.guava.collectors;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Sets;

public abstract class BaseImmutableMapCollector<T, K, V> 
				implements Collector<T, ImmutableMap.Builder<K, V>, ImmutableMap<K, V>>{
	
	public abstract Supplier<Builder<K, V>> supplier();
	
	public abstract BiConsumer<Builder<K, V>, T> accumulator();
	
	@Override
	public BinaryOperator<Builder<K, V>> combiner() {
		return
				(left, right) -> left.putAll(right.build());
	}

	@Override
	public Function<Builder<K, V>, ImmutableMap<K, V>> finisher() {
		return  ImmutableMap.Builder<K, V>::build;
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return Sets.newHashSet(Characteristics.CONCURRENT);
	}


}
