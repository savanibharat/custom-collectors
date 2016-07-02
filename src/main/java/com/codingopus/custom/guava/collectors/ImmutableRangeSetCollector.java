package com.codingopus.custom.guava.collectors;

import java.util.function.Supplier;

import com.google.common.collect.ImmutableCollection.Builder;

public class ImmutableRangeSetCollector<T extends Comparable<?>> extends ImmutableCollectionCollector<T> {

	@Override
	public Supplier<Builder<T>> supplier() {
		throw new UnsupportedOperationException();
	}
}
