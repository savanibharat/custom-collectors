package com.codingopus.collections.factory;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class MapStream<K, V> implements Stream<Map.Entry<K, V>> {

	private final Stream<Map.Entry<K, V>> mapStream;

	private MapStream(Stream<Map.Entry<K, V>> mapStream) {
		this.mapStream = mapStream;
	}

	public static <K, V> MapStream<K, V> of(Map<K, V> map) {
		return new MapStream<>(map.entrySet().stream());
	}

	@Override
	public Iterator<Map.Entry<K, V>> iterator() {
		return mapStream.iterator();
	}

	@Override
	public Spliterator<Map.Entry<K, V>> spliterator() {
		return mapStream.spliterator();
	}

	@Override
	public boolean isParallel() {
		return mapStream.isParallel();
	}

	@Override
	public MapStream<K, V> sequential() {
		return new MapStream<K, V>(mapStream.sequential());
	}

	@Override
	public MapStream<K, V> parallel() {
		return new MapStream<K, V>(mapStream.parallel());
	}

	@Override
	public MapStream<K, V> unordered() {
		return new MapStream<K, V>(mapStream.unordered());
	}

	@Override
	public MapStream<K, V> onClose(Runnable closeHandler) {
		return new MapStream<K, V>(mapStream.onClose(closeHandler));
	}

	@Override
	public void close() {
		mapStream.close();
	}

	@Override
	public Stream<Map.Entry<K, V>> filter(Predicate<? super Map.Entry<K, V>> predicate) {
		return new MapStream<K, V>(mapStream.filter(predicate));
	}

	@Override
	public <R> Stream<R> map(Function<? super Map.Entry<K, V>, ? extends R> mapper) {
		return mapStream.map(mapper);
	}

	@Override
	public IntStream mapToInt(ToIntFunction<? super Map.Entry<K, V>> mapper) {
		return mapStream.mapToInt(mapper);
	}

	@Override
	public LongStream mapToLong(ToLongFunction<? super Map.Entry<K, V>> mapper) {
		return mapStream.mapToLong(mapper);
	}

	@Override
	public DoubleStream mapToDouble(ToDoubleFunction<? super Map.Entry<K, V>> mapper) {
		return mapStream.mapToDouble(mapper);
	}

	@Override
	public <R> Stream<R> flatMap(Function<? super Map.Entry<K, V>, ? extends Stream<? extends R>> mapper) {
		return mapStream.flatMap(mapper);
	}

	@Override
	public IntStream flatMapToInt(Function<? super Map.Entry<K, V>, ? extends IntStream> mapper) {
		return mapStream.flatMapToInt(mapper);
	}

	@Override
	public LongStream flatMapToLong(Function<? super Map.Entry<K, V>, ? extends LongStream> mapper) {
		return mapStream.flatMapToLong(mapper);
	}

	@Override
	public DoubleStream flatMapToDouble(Function<? super Map.Entry<K, V>, ? extends DoubleStream> mapper) {
		return mapStream.flatMapToDouble(mapper);
	}

	@Override
	public MapStream<K, V> distinct() {
		return new MapStream<K, V>(mapStream.distinct());
	}

	@Override
	public MapStream<K, V> sorted() {
		return new MapStream<K, V>(mapStream.sorted());
	}

	@Override
	public MapStream<K, V> sorted(Comparator<? super Map.Entry<K, V>> comparator) {
		return new MapStream<>(mapStream.sorted(comparator));
	}

	@Override
	public MapStream<K, V> peek(Consumer<? super Map.Entry<K, V>> action) {
		return new MapStream<>(mapStream.peek(action));
	}

	@Override
	public MapStream<K, V> limit(long maxSize) {
		return new MapStream<>(mapStream.limit(maxSize));
	}

	@Override
	public MapStream<K, V> skip(long n) {
		return new MapStream<>(mapStream.skip(n));
	}

	@Override
	public void forEach(Consumer<? super Map.Entry<K, V>> action) {
		mapStream.forEach(action);
	}

	@Override
	public void forEachOrdered(Consumer<? super Map.Entry<K, V>> action) {
		mapStream.forEachOrdered(action);
	}

	@Override
	public Object[] toArray() {
		return mapStream.toArray();
	}

	@Override
	public <A> A[] toArray(IntFunction<A[]> generator) {
		return mapStream.toArray(generator);
	}

	@Override
	public Map.Entry<K, V> reduce(Map.Entry<K, V> identity, BinaryOperator<Map.Entry<K, V>> accumulator) {
		return mapStream.reduce(identity, accumulator);
	}

	@Override
	public Optional<Map.Entry<K, V>> reduce(BinaryOperator<Map.Entry<K, V>> accumulator) {
		return mapStream.reduce(accumulator);
	}

	@Override
	public <U> U reduce(U identity, BiFunction<U, ? super Map.Entry<K, V>, U> accumulator, BinaryOperator<U> combiner) {
		return mapStream.reduce(identity, accumulator, combiner);
	}

	@Override
	public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super Map.Entry<K, V>> accumulator,
			BiConsumer<R, R> combiner) {
		return mapStream.collect(supplier, accumulator, combiner);
	}

	@Override
	public <R, A> R collect(Collector<? super Map.Entry<K, V>, A, R> collector) {
		return mapStream.collect(collector);
	}

	@Override
	public Optional<Map.Entry<K, V>> min(Comparator<? super Map.Entry<K, V>> comparator) {
		return mapStream.min(comparator);
	}

	@Override
	public Optional<Map.Entry<K, V>> max(Comparator<? super Map.Entry<K, V>> comparator) {
		return mapStream.max(comparator);
	}

	@Override
	public long count() {
		return mapStream.count();
	}

	@Override
	public boolean anyMatch(Predicate<? super Map.Entry<K, V>> predicate) {
		return mapStream.anyMatch(predicate);
	}

	@Override
	public boolean allMatch(Predicate<? super Map.Entry<K, V>> predicate) {
		return mapStream.allMatch(predicate);
	}

	@Override
	public boolean noneMatch(Predicate<? super Map.Entry<K, V>> predicate) {
		return mapStream.noneMatch(predicate);
	}

	@Override
	public Optional<Map.Entry<K, V>> findFirst() {
		return mapStream.findFirst();
	}

	@Override
	public Optional<Map.Entry<K, V>> findAny() {
		return mapStream.findAny();
	}

}
