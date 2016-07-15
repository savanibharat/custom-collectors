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
		return Sets.newHashSet(Characteristics.UNORDERED);
	}


}
