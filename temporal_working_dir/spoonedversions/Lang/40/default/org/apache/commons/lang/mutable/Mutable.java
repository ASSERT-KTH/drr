

package org.apache.commons.lang.mutable;


public interface Mutable<T> {
	T getValue();

	void setValue(T value);
}

