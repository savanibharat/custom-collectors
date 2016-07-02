package com.codingopus.custom.guava.collectors;

import java.util.function.Supplier;

import com.google.common.collect.ImmutableCollection.Builder;
import com.google.common.collect.ImmutableSet;

public class ImmutableSetCollector<T> extends ImmutableCollectionCollector<T> {

	@Override
	public Supplier<Builder<T>> supplier() {
		return ImmutableSet::builder;
	}
}
