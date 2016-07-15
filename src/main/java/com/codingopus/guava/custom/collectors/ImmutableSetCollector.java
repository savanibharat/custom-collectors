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

import java.util.stream.Collector;

import com.google.common.collect.ImmutableSet;

public final class ImmutableSetCollector<T> {

	public static <T> Collector<T, ImmutableSet.Builder<T>, ImmutableSet<T>>
	toSetCollector() {
		
		return 
				Collector.of(
						ImmutableSet.Builder<T>::new,
						ImmutableSet.Builder<T>::add,
						(left, right) -> left.addAll(right.build()),
			            ImmutableSet.Builder<T>::build);
	}
}
