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

/**
 * JEP 269
 * Make it convenient to create instances of collections 
 * and maps with small numbers of elements, so as to ease 
 * the pain of not having collection literals in the Java 
 * programming language.
 * */
public interface Lists {

	/**
	 * Returns immutable List containing zero elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @throws NullPointerException if an element is {@code null}
	 * @return an empty {@code List}
	 * */
	public static <E> List<E> of() {
		return Collections.emptyList();
	}
	
	/**
	 * Returns immutable List containing one element.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 a single element
	 * @throws NullPointerException if an element is {@code null}
	 * @return an {@code List} containing specified element.
	 * */
	public static <E> List<E> of(
			E e1) {
		
		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singletonList(e1);
	}
	
	/**
	 * Returns immutable List containing two elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @throws NullPointerException if an element is {@code null}
	 * @return an empty {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2) {
		
		ObjectsNonNull.objectsNonNull(e1, e2);
		return Collections.unmodifiableList(
				asList(e1, e2));
	}

	/**
	 * Returns immutable List containing three elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3);
		return Collections.unmodifiableList(
				asList(e1, e2, e3));
	}
	
	/**
	 * Returns immutable List containing four elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4);
		return Collections.unmodifiableList(asList(e1, e2, e3, e4));
	}
	
	/**
	 * Returns immutable List containing five elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5));
	}
	
	/**
	 * Returns immutable List containing six elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6));
	}
	
	/**
	 * Returns immutable List containing seven elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7));
	}
	
	/**
	 * Returns immutable List containing eight elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8));
	}
	
	/**
	 * Returns immutable List containing nine elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8, e9));
	}
	
	/**
	 * Returns immutable List containing ten elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @param e10 the tenth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
	}
	
	/**
	 * Returns immutable List containing eleven elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @param e10 the tenth element
	 * @param e11 the eleventh element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11) {
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
		return Collections.unmodifiableList(
				asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11));
	}
	
	/**
	 * Returns immutable List containing twelfth elements.
	 * 
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @param e10 the tenth element
	 * @param e11 the eleventh element
	 * @param e12 the twelfth element
	 * @throws NullPointerException if an element is {@code null}
	 * @return a {@code List} containing specified elements.
	 * */
	@SafeVarargs
	public static <E> List<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11, E e12, E... others) {
		
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
