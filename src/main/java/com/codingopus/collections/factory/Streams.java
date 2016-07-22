package com.codingopus.collections.factory;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class Streams {

	/**
	 * Creates a new sequential Stream from a Spliterator.
	 * 
	 * @param <T> the type of element in the Iterable
     * @return a stream of the elements in the Iterable
	 * */
	public static <T> Stream<T> of(
			Iterable<T> iterable) {

		Objects.requireNonNull(iterable);
		return StreamSupport.stream(iterable.spliterator(), false);
	}
	
	/**
	 * Creates a new Stream from Optional if value is present
	 * else creates empty Stream..
	 * 
	 * @param <T> the type of element in Optional
	 * @return Stream of element in Optional.
	 * */
	public static <T> Stream<T> optional(
			final Optional<T> optional) {
		
		Objects.requireNonNull(optional);
		return
				optional.isPresent() ? Stream.of(optional.get())
									 : Stream.empty();
	}
	
}
