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

package com.codingopus.collections.factory;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

/**
 * JEP 269
 * Make it convenient to create instances of collections 
 * and maps with small numbers of elements, so as to ease 
 * the pain of not having collection literals in the Java 
 * programming language.
 * 
 * Maps provide static factories for 
 * {@code HashMap} using factory {@code Maps#of(Object)}
 * {@code LinkedHashMaps} using factory {@code Maps#ofOrdered(Object)}
 * {@code TreeMaps} using factory {@code Maps#ofSorted(Object)}
 * */
public interface Maps {

	/**
	 * Returns immutable Map containing zero elements.
	 * 
	 * @param <E> the {@code Map}'s element type
	 * @throws NullPointerException if an element is {@code null}
	 * @return an empty {@code Map}
	 * */
	public static <K, V> Map<K, V> of() {
		return Collections.emptyMap();
	}

	/**
	 * Returns immutable Map containing one entry.
	 * 
	 * @param <K> the  {@code Map}'s key
	 * @param <V> the  {@code Map}'s value
	 * @param k1 the first key
	 * @param v1 the first value
	 * 
	 * @throws NullPointerException if key or value is {@code null}
	 * @return an {@code Map} containing specified element.
	 * */
	public static <K, V> Map<K, V> of(
			K k1, V v1) {
		ObjectsNonNull.objectsNonNull(k1, v1);
		return Collections.singletonMap(k1, v1);
	}

	/**
	 * Returns immutable Map containing two entries.
	 * 
	 * @param <K> the  {@code Map}'s key
	 * @param <V> the  {@code Map}'s value
	 * @param k1 the first key
	 * @param v1 the first value
	 * @param k2 the second key
	 * @param v2 the second value
	 * 
	 * @throws NullPointerException if any key or value is {@code null}
	 * @return an {@code Map} containing specified element.
	 * */
	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		if (map.size() != 2) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	/**
	 * Returns immutable Map containing three entries.
	 * 
	 * @param <K> the  {@code Map}'s key
	 * @param <V> the  {@code Map}'s value
	 * @param k1 the first key
	 * @param v1 the first value
	 * @param k2 the second key
	 * @param v2 the second value
	 * @param k3 the third key
	 * @param v3 the third value
	 * 
	 * @throws NullPointerException if any key or value is {@code null}
	 * @return an {@code Map} containing specified element.
	 * */
	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		if (map.size() != 3) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	/**
	 * Returns immutable Map containing four entries.
	 * 
	 * @param <K> the  {@code Map}'s key
	 * @param <V> the  {@code Map}'s value
	 * @param k1 the first key
	 * @param v1 the first value
	 * @param k2 the second key
	 * @param v2 the second value
	 * @param k3 the third key
	 * @param v3 the third value
	 * @param k4 the four key
	 * @param v4 the four value
	 * 
	 * @throws NullPointerException if any key or value is {@code null}
	 * @return an {@code Map} containing specified element.
	 * */
	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3, k4, v4);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		if (map.size() != 4) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	/**
	 * Returns immutable Map containing five entries.
	 * 
	 * @param <K> the  {@code Map}'s key
	 * @param <V> the  {@code Map}'s value
	 * @param k1 the first key
	 * @param v1 the first value
	 * @param k2 the second key
	 * @param v2 the second value
	 * @param k3 the third key
	 * @param v3 the third value
	 * @param k4 the four key
	 * @param v4 the four value
	 * @param k5 the five key
	 * @param v5 the five value
	 * 
	 * @throws NullPointerException if any key or value is {@code null}
	 * @return an {@code Map} containing specified element.
	 * */
	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		if (map.size() != 5) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		if (map.size() != 6) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		if (map.size() != 7) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		if (map.size() != 8) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		if (map.size() != 9) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		if (map.size() != 10) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10, 
			K k11, V v11) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10, 
				k11, v11);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		map.put(k11, v11);
		if (map.size() != 11) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> of(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10, 
			K k11, V v11, K k12, V v12) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10, 
				k11, v11, k12, v12);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		map.put(k11, v11);
		map.put(k12, v12);
		if (map.size() != 12) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered() {
		return Collections.emptyMap();
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1) {
		ObjectsNonNull.objectsNonNull(k1, v1);
		return Collections.singletonMap(k1, v1);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		if (map.size() != 2) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		if (map.size() != 3) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3, k4, v4);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		if (map.size() != 4) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		if (map.size() != 5) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		if (map.size() != 6) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		if (map.size() != 7) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		if (map.size() != 8) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		if (map.size() != 9) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		if (map.size() != 10) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10, 
			K k11, V v11) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10,
				k11, v11);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		map.put(k11, v11);
		if (map.size() != 11) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofOrdered(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10, 
			K k11, V v11, K k12, V v12) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10,
				k11, v11, k12, v12);
		Map<K, V> map = new LinkedHashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		map.put(k11, v11);
		map.put(k12, v12);
		if (map.size() != 12) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted() {
		return Collections.emptyMap();
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1) {
		ObjectsNonNull.objectsNonNull(k1, v1);
		return Collections.singletonMap(k1, v1);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		if (map.size() != 2) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		if (map.size() != 3) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3, k4, v4);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		if (map.size() != 4) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {

		ObjectsNonNull.objectsNonNull(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		if (map.size() != 5) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		if (map.size() != 6) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		if (map.size() != 7) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		if (map.size() != 8) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		if (map.size() != 9) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		if (map.size() != 10) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10, 
			K k11, V v11) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10,
				k11, v11);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		map.put(k11, v11);
		if (map.size() != 11) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> ofSorted(
			K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, 
			K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10, 
			K k11, V v11, K k12, V v12) {

		ObjectsNonNull.objectsNonNull(
				k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, 
				k6, v6, k7, v7, k8, v8, k9, v9, k10, v10,
				k11, v11, k12, v12);
		Map<K, V> map = new TreeMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		map.put(k9, v9);
		map.put(k10, v10);
		map.put(k11, v11);
		map.put(k12, v12);
		if (map.size() != 12) {
			throw new IllegalArgumentException("Duplicate keys.");
		}
		return Collections.unmodifiableMap(map);
	}

	@SafeVarargs
	public static <K, V> Map<K, V> ofEntries(Entry<K, V>... entries) {
		return ofEntries(new HashMap<>(), entries);
	}
	
	@SafeVarargs
	public static <K, V> Map<K, V> ofOrderedEntries(Entry<K, V>... entries) {
		return ofEntries(new LinkedHashMap<>(), entries);
	}
	
	@SafeVarargs
	public static <K, V> Map<K, V> ofSortedEntries(Entry<K, V>... entries) {
		return ofEntries(new TreeMap<>(), entries);
	}

	@SafeVarargs
	static <K, V> Map<K, V> ofEntries(Map<K, V> map, Entry<K, V>... entries) {
		Objects.requireNonNull(map);
		Objects.requireNonNull(entries);
		for (Entry<K, V> entry : entries) {
			map.put(
					Objects.requireNonNull(entry.getKey()), 
					Objects.requireNonNull(entry.getValue())
				);
		}

		if (map.size() != entries.length) {
			throw new IllegalArgumentException("Duplicate keys");
		}
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Entry<K, V> entry(K k, V v) {
		return new ImmutableMapEntry<K, V>(k, v);
	}

}
