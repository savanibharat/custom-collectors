package com.codingopus.custom.guava.collectors;

import java.util.function.Supplier;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableCollection.Builder;
import com.google.common.collect.ImmutableSortedSet;

public class ImmutableSortedSetCollector<T extends Comparable<?>> 
									extends ImmutableCollectionCollector<T> {

	@Override
	public Supplier<Builder<T>> supplier() {
		//return ImmutableSortedSet::naturalOrder;
		return new Supplier<ImmutableCollection.Builder<T>>() {
			@Override
			public Builder<T> get() {
				return ImmutableSortedSet.naturalOrder();
			}
		};
	}
}
