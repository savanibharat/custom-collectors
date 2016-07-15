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

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface Lists {

	public static <E> List<E> of() {
		return Collections.emptyList();
	}
	
	public static <E> List<E> of(
			final E e1) {
		
		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singletonList(e1);
	}
	
	public static <E> List<E> of(
			final E e1, final E e2) {
		
		ObjectsNonNull.objectsNonNull(e1, e2);
		return Collections.unmodifiableList(
				asList(e1, e2));
	}

	public static <E> List<E> of(
			final E e1, final E e2, final E e3) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3);
		return Collections.unmodifiableList(
				asList(e1, e2, e3));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4);
		return Collections.unmodifiableList(asList(e1, e2, e3, e4));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8, e9));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
	}
	
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11));
	}
	
	@SafeVarargs
	public static <E> List<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11, final E e12, final E... others) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
		for (E element : others) {
			Objects.requireNonNull(element);
		}
		
		List<E> list = new ArrayList<E>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		list.add(e11);
		list.add(e12);
		for (E element : others) {
			list.add(element);
		}
		return Collections.unmodifiableList(
				list);
	}
}
