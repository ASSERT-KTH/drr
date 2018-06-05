

package org.apache.commons.math.util;


public class SerializablePair<K extends java.io.Serializable, V extends java.io.Serializable> extends org.apache.commons.math.util.Pair<K, V> implements java.io.Serializable {
	public SerializablePair(K k, V v) {
		super(k, v);
	}

	public SerializablePair(org.apache.commons.math.util.SerializablePair<? extends K, ? extends V> entry) {
		super(entry);
	}
}

