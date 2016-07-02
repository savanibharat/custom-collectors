package com.codingopus.custom.guava.collectors;

import java.util.function.Supplier;

import com.google.common.collect.ImmutableCollection.Builder;
import com.google.common.collect.ImmutableList;

public class ImmutableListCollector<T> extends ImmutableCollectionCollector<T>{

	@Override
	public Supplier<Builder<T>> supplier() {
		return ImmutableList::builder;
	}
}