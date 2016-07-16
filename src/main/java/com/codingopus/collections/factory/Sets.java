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
 * If the values are duplicate then throw {@link IllegalArgumentException}.
 * Check it using {@link Set#size()}
 * 
 * Implement Set.ofOrdered(LinkedHashSet)
 * */
public interface Sets {

	public static <E> Set<E> of(){
		return Collections.emptySet();
	}

	public static <E> Set<E> of(
			final E e1){

		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singleton(e1);
	}

	public static <E> Set<E> of(
			final E e1, final E e2){

		ObjectsNonNull.objectsNonNull(e1, e2);
		Set<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		if(set.size() != 2) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}

	public static <E> Set<E> of(
			final E e1, final E e2, final E e3){

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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4){

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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5){
		
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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6){
		
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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7){
		
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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8){
		
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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9){
		
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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10){
		
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
	
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11){
		
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
	
	@SafeVarargs
	public static <E> Set<E> of(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11, final E e12, final E... others){
		
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
		final int size = 12 + others.length;
		if(set.size() != size) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	///////////////////////////////////////////////////////////////////////////

	public static <E> Set<E> ofOrdered(){
		return Collections.emptySet();
	}

	public static <E> Set<E> ofOrdered(
			final E e1){

		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singleton(e1);
	}

	public static <E> Set<E> ofOrdered(
			final E e1, final E e2){

		ObjectsNonNull.objectsNonNull(e1, e2);
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		if(set.size() != 2) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}

	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3){

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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4){

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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5){
		
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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6){
		
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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7){
		
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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8){
		
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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9){
		
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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10){
		
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
	
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11){
		
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
	
	@SafeVarargs
	public static <E> Set<E> ofOrdered(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11, final E e12, final E... others){
		
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
		final int size = 12 + others.length;
		if(set.size() != size) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public static <E> Set<E> ofSorted(){
		return Collections.emptySet();
	}

	public static <E> Set<E> ofSorted(
			final E e1){

		ObjectsNonNull.objectsNonNull(e1);
		return Collections.singleton(e1);
	}

	public static <E> Set<E> ofSorted(
			final E e1, final E e2){

		ObjectsNonNull.objectsNonNull(e1, e2);
		Set<E> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		if(set.size() != 2) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	
	}

	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3){

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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4){

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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5){
		
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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6){
		
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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7){
		
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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8){
		
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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9){
		
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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10){
		
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
	
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11){
		
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
	
	@SafeVarargs
	public static <E> Set<E> ofSorted(
			final E e1, final E e2, final E e3, final E e4, final E e5,
			final E e6, final E e7, final E e8, final E e9, final E e10,
			final E e11, final E e12, final E... others){
		
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
		final int size = 12 + others.length;
		if(set.size() != size) {
			throw new IllegalArgumentException("Duplicates elements encountered.");
		}
		return Collections.unmodifiableSet(set);
	}
	
}
