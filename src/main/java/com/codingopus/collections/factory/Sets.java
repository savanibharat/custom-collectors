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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * JEP 269
 * Make it convenient to create instances of collections 
 * and maps with small numbers of elements, so as to ease 
 * the pain of not having collection literals in the Java 
 * programming language.
 * 
 * Sets provide static factories for 
 * {@code HashSet} using factory {@code Sets#of(Object)}
 * {@code LinkedHashSet} using factory {@code Sets#ofOrdered(Object)}
 * {@code TreeSet} using factory {@code Sets#ofSorted(Object)}
 * */
public interface Sets {

	/**
	 * Returns immutable Set containing zero elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @return an empty {@code Set}
	 * */
	public static <E> Set<E> of(){
		return Collections.emptySet();
	}
	
	/**
	 * Returns immutable Set containing one element.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 a single element
	 * @throws NullPointerException if an element is {@code null}
	 * @return an {@code Set} containing specified element.
	 * */
	public static <E> Set<E> of(
			E e1){

		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singleton(e1);
	}

	/**
	 * Returns immutable Set containing two elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return an empty {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2){

		ObjectsNonNull.objectsNonNull(e1, e2);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		if(set.size() != 2) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}

	/**
	 * Returns immutable Set containing three elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3){

		ObjectsNonNull.objectsNonNull(e1, e2, e3);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		if(set.size() != 3) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}
	
	/**
	 * Returns immutable Set containing four elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4){

		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		if(set.size() != 4) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}
	
	/**
	 * Returns immutable Set containing five elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		if(set.size() != 5) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing six elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		if(set.size() != 6) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing seven elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		if(set.size() != 7) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing eight elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		if(set.size() != 8) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing nine elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		if(set.size() != 9) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing ten elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		if(set.size() != 10) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing eleven elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		set.add(e11);
		if(set.size() != 11) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing twelve elements
	 * and additional varargs elements if any.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	@SafeVarargs
	public static <E> Set<E> of(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11, E e12, E... others){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
		for (E element : others) {
			Objects.requireNonNull(element);
		}
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		set.add(e11);
		set.add(e12);
		for (E element : others) {
			set.add(element);
		}
		int size = 12 + others.length;
		if(set.size() != size) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing zero elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @throws NullPointerException if an element is {@code null}
	 * @return an empty {@code Set}
	 * */
	public static <E> Set<E> ofOrdered(){
		return Collections.emptySet();
	}

	/**
	 * Returns immutable Set containing one element.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 a single element
	 * @throws NullPointerException if an element is {@code null}
	 * @return an {@code Set} containing specified element.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1){

		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singleton(e1);
	}

	/**
	 * Returns immutable Set containing two elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return an empty {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2){

		ObjectsNonNull.objectsNonNull(e1, e2);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		if(set.size() != 2) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}

	/**
	 * Returns immutable Set containing three elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3){

		ObjectsNonNull.objectsNonNull(e1, e2, e3);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		if(set.size() != 3) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}
	
	/**
	 * Returns immutable Set containing four elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4){

		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		if(set.size() != 4) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}
	
	/**
	 * Returns immutable Set containing five elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		if(set.size() != 5) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing six elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		if(set.size() != 6) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing seven elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		if(set.size() != 7) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing eight elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		if(set.size() != 8) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing nine elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		if(set.size() != 9) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing ten elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		if(set.size() != 10) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing eleven elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		set.add(e11);
		if(set.size() != 11) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing twelve elements
	 * and additional varargs elements if any.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	@SafeVarargs
	public static <E> Set<E> ofOrdered(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11, E e12, E... others){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
		for (E element : others) {
			Objects.requireNonNull(element);
		}
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		set.add(e11);
		set.add(e12);
		for (E element : others) {
			set.add(element);
		}
		int size = 12 + others.length;
		if(set.size() != size) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing zero elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @throws NullPointerException if an element is {@code null}
	 * @return an empty {@code Set}
	 * */
	public static <E> Set<E> ofSorted(){
		return Collections.emptySet();
	}

	/**
	 * Returns immutable Set containing one element.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 a single element
	 * @throws NullPointerException if an element is {@code null}
	 * @return an {@code Set} containing specified element.
	 * */
	public static <E> Set<E> ofSorted(
			E e1){

		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singleton(e1);
	}

	/**
	 * Returns immutable Set containing two elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return an empty {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2){

		ObjectsNonNull.objectsNonNull(e1, e2);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		if(set.size() != 2) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}

	/**
	 * Returns immutable Set containing three elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3){

		ObjectsNonNull.objectsNonNull(e1, e2, e3);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		if(set.size() != 3) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}
	
	/**
	 * Returns immutable Set containing four elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4){

		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		if(set.size() != 4) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}
	
	/**
	 * Returns immutable Set containing five elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		if(set.size() != 5) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing six elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		if(set.size() != 6) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing seven elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		if(set.size() != 7) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing eight elements.
	 * 
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @throws NullPointerException if an element is {@code null}
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		if(set.size() != 8) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing nine elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		if(set.size() != 9) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing ten elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		if(set.size() != 10) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing eleven elements.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		set.add(e11);
		if(set.size() != 11) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	/**
	 * Returns immutable Set containing twelve elements
	 * and additional varargs elements if any.
	 * 
	 * @param <E> the {@code Set}'s element type
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
	 * @throws IllegalArgumentException if elements are duplicate.
	 * @return a {@code Set} containing specified elements.
	 * */
	@SafeVarargs
	public static <E> Set<E> ofSorted(
			E e1, E e2, E e3, E e4, E e5,
			E e6, E e7, E e8, E e9, E e10,
			E e11, E e12, E... others){
		
		ObjectsNonNull.objectsNonNull(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
		for (E element : others) {
			Objects.requireNonNull(element);
		}
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		set.add(e10);
		set.add(e11);
		set.add(e12);
		for (E element : others) {
			set.add(element);
		}
		int size = 12 + others.length;
		if(set.size() != size) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
}
