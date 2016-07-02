package com.codingopus.custom.guava.collectors;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableCollection.Builder;

public abstract class ImmutableCollectionCollector<T> implements 
				Collector<T, ImmutableCollection.Builder<T>, ImmutableCollection<T>> {

	@Override
	public abstract Supplier<Builder<T>> supplier();
	
	@Override
	public BiConsumer<ImmutableCollection.Builder<T>, T> accumulator() {
		return (c, v) -> c.add(v);
	}

	@Override
	public BinaryOperator<ImmutableCollection.Builder<T>> combiner() {
		return (c1, c2) -> {
			c1.addAll(c2.build());
			return c1;
		};
	}

	@Override
	public Function<ImmutableCollection.Builder<T>, ImmutableCollection<T>> finisher() {
		return ImmutableCollection.Builder::build;
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.unmodifiableSet(Sets.newHashSet(Characteristics.CONCURRENT));
	}

}