

package org.apache.commons.lang;


class IntHashMap {
	private transient org.apache.commons.lang.IntHashMap.Entry[] table;

	private transient int count;

	private int threshold;

	private float loadFactor;

	private static class Entry {
		int hash;

		int key;

		java.lang.Object value;

		org.apache.commons.lang.IntHashMap.Entry next;

		protected Entry(int hash, int key, java.lang.Object value, org.apache.commons.lang.IntHashMap.Entry next) {
			org.apache.commons.lang.IntHashMap.Entry.this.hash = hash;
			org.apache.commons.lang.IntHashMap.Entry.this.key = key;
			org.apache.commons.lang.IntHashMap.Entry.this.value = value;
			org.apache.commons.lang.IntHashMap.Entry.this.next = next;
		}
	}

	public IntHashMap() {
		this(20, 0.75F);
	}

	public IntHashMap(int initialCapacity) {
		this(initialCapacity, 0.75F);
	}

	public IntHashMap(int initialCapacity, float loadFactor) {
		super();
		if (initialCapacity < 0) {
			throw new java.lang.IllegalArgumentException(("Illegal Capacity: " + initialCapacity));
		}
		if (loadFactor <= 0) {
			throw new java.lang.IllegalArgumentException(("Illegal Load: " + loadFactor));
		}
		if (initialCapacity == 0) {
			initialCapacity = 1;
		}
		org.apache.commons.lang.IntHashMap.this.loadFactor = loadFactor;
		table = new org.apache.commons.lang.IntHashMap.Entry[initialCapacity];
		threshold = ((int) (initialCapacity * loadFactor));
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return (count) == 0;
	}

	public boolean contains(java.lang.Object value) {
		if (value == null) {
			throw new java.lang.NullPointerException();
		}
		org.apache.commons.lang.IntHashMap.Entry[] tab = table;
		for (int i = tab.length; (i--) > 0;) {
			for (org.apache.commons.lang.IntHashMap.Entry e = tab[i]; e != null; e = e.next) {
				if (e.value.equals(value)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean containsValue(java.lang.Object value) {
		return contains(value);
	}

	public boolean containsKey(int key) {
		org.apache.commons.lang.IntHashMap.Entry[] tab = table;
		int hash = key;
		int index = (hash & 2147483647) % (tab.length);
		for (org.apache.commons.lang.IntHashMap.Entry e = tab[index]; e != null; e = e.next) {
			if ((e.hash) == hash) {
				return true;
			}
		}
		return false;
	}

	public java.lang.Object get(int key) {
		org.apache.commons.lang.IntHashMap.Entry[] tab = table;
		int hash = key;
		int index = (hash & 2147483647) % (tab.length);
		for (org.apache.commons.lang.IntHashMap.Entry e = tab[index]; e != null; e = e.next) {
			if ((e.hash) == hash) {
				return e.value;
			}
		}
		return null;
	}

	protected void rehash() {
		int oldCapacity = table.length;
		org.apache.commons.lang.IntHashMap.Entry[] oldMap = table;
		int newCapacity = (oldCapacity * 2) + 1;
		org.apache.commons.lang.IntHashMap.Entry[] newMap = new org.apache.commons.lang.IntHashMap.Entry[newCapacity];
		threshold = ((int) (newCapacity * (loadFactor)));
		table = newMap;
		for (int i = oldCapacity; (i--) > 0;) {
			for (org.apache.commons.lang.IntHashMap.Entry old = oldMap[i]; old != null;) {
				org.apache.commons.lang.IntHashMap.Entry e = old;
				old = old.next;
				int index = ((e.hash) & 2147483647) % newCapacity;
				e.next = newMap[index];
				newMap[index] = e;
			}
		}
	}

	public java.lang.Object put(int key, java.lang.Object value) {
		org.apache.commons.lang.IntHashMap.Entry[] tab = table;
		int hash = key;
		int index = (hash & 2147483647) % (tab.length);
		for (org.apache.commons.lang.IntHashMap.Entry e = tab[index]; e != null; e = e.next) {
			if ((e.hash) == hash) {
				java.lang.Object old = e.value;
				e.value = value;
				return old;
			}
		}
		if ((count) >= (threshold)) {
			rehash();
			tab = table;
			index = (hash & 2147483647) % (tab.length);
		}
		org.apache.commons.lang.IntHashMap.Entry e = new org.apache.commons.lang.IntHashMap.Entry(hash, key, value, tab[index]);
		tab[index] = e;
		(count)++;
		return null;
	}

	public java.lang.Object remove(int key) {
		org.apache.commons.lang.IntHashMap.Entry[] tab = table;
		int hash = key;
		int index = (hash & 2147483647) % (tab.length);
		for (org.apache.commons.lang.IntHashMap.Entry e = tab[index], prev = null; e != null; prev = e , e = e.next) {
			if ((e.hash) == hash) {
				if (prev != null) {
					prev.next = e.next;
				}else {
					tab[index] = e.next;
				}
				(count)--;
				java.lang.Object oldValue = e.value;
				e.value = null;
				return oldValue;
			}
		}
		return null;
	}

	public synchronized void clear() {
		org.apache.commons.lang.IntHashMap.Entry[] tab = table;
		for (int index = tab.length; (--index) >= 0;) {
			tab[index] = null;
		}
		count = 0;
	}
}

