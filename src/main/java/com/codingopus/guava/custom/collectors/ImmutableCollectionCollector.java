/*
 * Copyright 2016 Bharat Savani
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.codingopus.guava.custom.collectors;

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
		return Collections.unmodifiableSet(Sets.newHashSet(Characteristics.UNORDERED));
	}

}