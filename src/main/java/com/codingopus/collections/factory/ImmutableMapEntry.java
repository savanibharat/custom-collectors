package com.codingopus.collections.factory;

import java.util.Map;
import java.util.Objects;

final class ImmutableMapEntry<K, V> implements Map.Entry<K, V> {

	private final K k;
	private final V v;

	private ImmutableMapEntry(K k, V v) {

		this.k = Objects.requireNonNull(k);
		this.v = Objects.requireNonNull(v);
	}

	public static <K, V> ImmutableMapEntry<K, V> of(
			K k, V v) {
		return new ImmutableMapEntry<K, V>(k, v);
	}
	
	@Override
	public K getKey() {
		return this.k;
	}

	@Override
	public V getValue() {
		return this.v;
	}

	@Override
	public V setValue(V value) {
		throw new UnsupportedOperationException("Cannot set value.");
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Map.Entry))
			return false;
		Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
		return k.equals(e.getKey()) && v.equals(e.getValue());
	}

	@Override
	public int hashCode() {
		return k.hashCode() ^ v.hashCode();
	}

	@Override
	public String toString() {
		return k + "=" + v;
	}

}
