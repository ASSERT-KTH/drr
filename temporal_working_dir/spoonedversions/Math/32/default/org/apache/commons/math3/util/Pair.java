

package org.apache.commons.math3.util;


public class Pair<K, V> {
	private final K key;

	private final V value;

	public Pair(K k, V v) {
		key = k;
		value = v;
	}

	public Pair(org.apache.commons.math3.util.Pair<? extends K, ? extends V> entry) {
		this(entry.getKey(), entry.getValue());
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object o) {
		if ((org.apache.commons.math3.util.Pair.this) == o) {
			return true;
		}
		if (!(o instanceof org.apache.commons.math3.util.Pair)) {
			return false;
		}else {
			org.apache.commons.math3.util.Pair<?, ?> oP = ((org.apache.commons.math3.util.Pair<?, ?>) (o));
			return ((key) == null ? (oP.key) == null : key.equals(oP.key)) && ((value) == null ? (oP.value) == null : value.equals(oP.value));
		}
	}

	@java.lang.Override
	public int hashCode() {
		int result = (key) == null ? 0 : key.hashCode();
		final int h = (value) == null ? 0 : value.hashCode();
		result = ((37 * result) + h) ^ (h >>> 16);
		return result;
	}
}

