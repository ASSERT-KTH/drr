

package org.apache.commons.math3.util;


public class Pair<K, V> {
	private final K key;

	private final V value;

	public Pair(K k, V v) {
		key = k;
		value = v;
	}

	public Pair(org.apache.commons.math3.util.Pair<? extends K, ? extends V> entry) {
		key = entry.getKey();
		value = entry.getValue();
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof org.apache.commons.math3.util.Pair)) {
			return false;
		}else {
			org.apache.commons.math3.util.Pair<?, ?> oP = ((org.apache.commons.math3.util.Pair<?, ?>) (o));
			return ((key) == null ? (oP.getKey()) == null : key.equals(oP.getKey())) && ((value) == null ? (oP.getValue()) == null : value.equals(oP.getValue()));
		}
	}

	@java.lang.Override
	public int hashCode() {
		return ((key) == null ? 0 : key.hashCode()) ^ ((value) == null ? 0 : value.hashCode());
	}
}

