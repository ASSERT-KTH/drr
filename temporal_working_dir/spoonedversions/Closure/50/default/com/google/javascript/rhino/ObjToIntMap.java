

package com.google.javascript.rhino;


public class ObjToIntMap implements java.io.Serializable {
	static final long serialVersionUID = -1542220580748809402L;

	public static class Iterator {
		Iterator(com.google.javascript.rhino.ObjToIntMap master) {
			com.google.javascript.rhino.ObjToIntMap.Iterator.this.master = master;
		}

		final void init(java.lang.Object[] keys, int[] values, int keyCount) {
			com.google.javascript.rhino.ObjToIntMap.Iterator.this.keys = keys;
			com.google.javascript.rhino.ObjToIntMap.Iterator.this.values = values;
			com.google.javascript.rhino.ObjToIntMap.Iterator.this.cursor = -1;
			com.google.javascript.rhino.ObjToIntMap.Iterator.this.remaining = keyCount;
		}

		public void start() {
			master.initIterator(com.google.javascript.rhino.ObjToIntMap.Iterator.this);
			next();
		}

		public boolean done() {
			return (remaining) < 0;
		}

		public void next() {
			if ((remaining) == (-1))
				com.google.javascript.rhino.Kit.codeBug();
			
			if ((remaining) == 0) {
				remaining = -1;
				cursor = -1;
			}else {
				for (++(cursor); ; ++(cursor)) {
					java.lang.Object key = keys[cursor];
					if ((key != null) && (key != (com.google.javascript.rhino.ObjToIntMap.DELETED))) {
						--(remaining);
						break;
					}
				}
			}
		}

		public java.lang.Object getKey() {
			java.lang.Object key = keys[cursor];
			if (key == (com.google.javascript.rhino.UniqueTag.NULL_VALUE)) {
				key = null;
			}
			return key;
		}

		public int getValue() {
			return values[cursor];
		}

		public void setValue(int value) {
			values[cursor] = value;
		}

		com.google.javascript.rhino.ObjToIntMap master;

		private int cursor;

		private int remaining;

		private java.lang.Object[] keys;

		private int[] values;
	}

	public ObjToIntMap() {
		this(4);
	}

	public ObjToIntMap(int keyCountHint) {
		if (keyCountHint < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int minimalCapacity = (keyCountHint * 4) / 3;
		int i;
		for (i = 2; (1 << i) < minimalCapacity; ++i) {
		}
		power = i;
		assert (power) >= 2;
	}

	public boolean isEmpty() {
		return (keyCount) == 0;
	}

	public int size() {
		return keyCount;
	}

	public boolean has(java.lang.Object key) {
		if (key == null) {
			key = com.google.javascript.rhino.UniqueTag.NULL_VALUE;
		}
		return 0 <= (findIndex(key));
	}

	public int get(java.lang.Object key, int defaultValue) {
		if (key == null) {
			key = com.google.javascript.rhino.UniqueTag.NULL_VALUE;
		}
		int index = findIndex(key);
		if (0 <= index) {
			return values[index];
		}
		return defaultValue;
	}

	public int getExisting(java.lang.Object key) {
		if (key == null) {
			key = com.google.javascript.rhino.UniqueTag.NULL_VALUE;
		}
		int index = findIndex(key);
		if (0 <= index) {
			return values[index];
		}
		com.google.javascript.rhino.Kit.codeBug();
		return 0;
	}

	public void put(java.lang.Object key, int value) {
		if (key == null) {
			key = com.google.javascript.rhino.UniqueTag.NULL_VALUE;
		}
		int index = ensureIndex(key);
		values[index] = value;
	}

	public java.lang.Object intern(java.lang.Object keyArg) {
		boolean nullKey = false;
		if (keyArg == null) {
			nullKey = true;
			keyArg = com.google.javascript.rhino.UniqueTag.NULL_VALUE;
		}
		int index = ensureIndex(keyArg);
		values[index] = 0;
		return nullKey ? null : keys[index];
	}

	public void remove(java.lang.Object key) {
		if (key == null) {
			key = com.google.javascript.rhino.UniqueTag.NULL_VALUE;
		}
		int index = findIndex(key);
		if (0 <= index) {
			keys[index] = com.google.javascript.rhino.ObjToIntMap.DELETED;
			--(keyCount);
		}
	}

	public void clear() {
		int i = keys.length;
		while (i != 0) {
			keys[(--i)] = null;
		} 
		keyCount = 0;
		occupiedCount = 0;
	}

	public com.google.javascript.rhino.ObjToIntMap.Iterator newIterator() {
		return new com.google.javascript.rhino.ObjToIntMap.Iterator(com.google.javascript.rhino.ObjToIntMap.this);
	}

	final void initIterator(com.google.javascript.rhino.ObjToIntMap.Iterator i) {
		i.init(keys, values, keyCount);
	}

	public java.lang.Object[] getKeys() {
		java.lang.Object[] array = new java.lang.Object[keyCount];
		getKeys(array, 0);
		return array;
	}

	public void getKeys(java.lang.Object[] array, int offset) {
		int count = keyCount;
		for (int i = 0; count != 0; ++i) {
			java.lang.Object key = keys[i];
			if ((key != null) && (key != (com.google.javascript.rhino.ObjToIntMap.DELETED))) {
				if (key == (com.google.javascript.rhino.UniqueTag.NULL_VALUE)) {
					key = null;
				}
				array[offset] = key;
				++offset;
				--count;
			}
		}
	}

	private static int tableLookupStep(int fraction, int mask, int power) {
		int shift = 32 - (2 * power);
		if (shift >= 0) {
			return ((fraction >>> shift) & mask) | 1;
		}else {
			return (fraction & (mask >>> (-shift))) | 1;
		}
	}

	private int findIndex(java.lang.Object key) {
		if ((keys) != null) {
			int hash = key.hashCode();
			int fraction = hash * (com.google.javascript.rhino.ObjToIntMap.A);
			int index = fraction >>> (32 - (power));
			java.lang.Object test = keys[index];
			if (test != null) {
				int N = 1 << (power);
				if ((test == key) || (((values[(N + index)]) == hash) && (test.equals(key)))) {
					return index;
				}
				int mask = N - 1;
				int step = com.google.javascript.rhino.ObjToIntMap.tableLookupStep(fraction, mask, power);
				int n = 0;
				for (; ;) {
					if (com.google.javascript.rhino.ObjToIntMap.check) {
						if (n >= (occupiedCount))
							com.google.javascript.rhino.Kit.codeBug();
						
						++n;
					}
					index = (index + step) & mask;
					test = keys[index];
					if (test == null) {
						break;
					}
					if ((test == key) || (((values[(N + index)]) == hash) && (test.equals(key)))) {
						return index;
					}
				}
			}
		}
		return -1;
	}

	private int insertNewKey(java.lang.Object key, int hash) {
		assert (occupiedCount) == (keyCount);
		assert (keyCount) != (1 << (power));
		int fraction = hash * (com.google.javascript.rhino.ObjToIntMap.A);
		int index = fraction >>> (32 - (power));
		int N = 1 << (power);
		if ((keys[index]) != null) {
			int mask = N - 1;
			int step = com.google.javascript.rhino.ObjToIntMap.tableLookupStep(fraction, mask, power);
			int firstIndex = index;
			do {
				assert (keys[index]) != (com.google.javascript.rhino.ObjToIntMap.DELETED);
				index = (index + step) & mask;
				assert firstIndex != index;
			} while ((keys[index]) != null );
		}
		keys[index] = key;
		values[(N + index)] = hash;
		++(occupiedCount);
		++(keyCount);
		return index;
	}

	private void rehashTable() {
		if ((keys) == null) {
			assert (keyCount) == 0;
			assert (occupiedCount) == 0;
			int N = 1 << (power);
			keys = new java.lang.Object[N];
			values = new int[2 * N];
		}else {
			if (((keyCount) * 2) >= (occupiedCount)) {
				++(power);
			}
			int N = 1 << (power);
			java.lang.Object[] oldKeys = keys;
			int[] oldValues = values;
			int oldN = oldKeys.length;
			keys = new java.lang.Object[N];
			values = new int[2 * N];
			int remaining = keyCount;
			occupiedCount = keyCount = 0;
			for (int i = 0; remaining != 0; ++i) {
				java.lang.Object key = oldKeys[i];
				if ((key != null) && (key != (com.google.javascript.rhino.ObjToIntMap.DELETED))) {
					int keyHash = oldValues[(oldN + i)];
					int index = insertNewKey(key, keyHash);
					values[index] = oldValues[i];
					--remaining;
				}
			}
		}
	}

	private int ensureIndex(java.lang.Object key) {
		int hash = key.hashCode();
		int index = -1;
		int firstDeleted = -1;
		if ((keys) != null) {
			int fraction = hash * (com.google.javascript.rhino.ObjToIntMap.A);
			index = fraction >>> (32 - (power));
			java.lang.Object test = keys[index];
			if (test != null) {
				int N = 1 << (power);
				if ((test == key) || (((values[(N + index)]) == hash) && (test.equals(key)))) {
					return index;
				}
				if (test == (com.google.javascript.rhino.ObjToIntMap.DELETED)) {
					firstDeleted = index;
				}
				int mask = N - 1;
				int step = com.google.javascript.rhino.ObjToIntMap.tableLookupStep(fraction, mask, power);
				int n = 0;
				for (; ;) {
					if (com.google.javascript.rhino.ObjToIntMap.check) {
						if (n >= (occupiedCount))
							com.google.javascript.rhino.Kit.codeBug();
						
						++n;
					}
					index = (index + step) & mask;
					test = keys[index];
					if (test == null) {
						break;
					}
					if ((test == key) || (((values[(N + index)]) == hash) && (test.equals(key)))) {
						return index;
					}
					if ((test == (com.google.javascript.rhino.ObjToIntMap.DELETED)) && (firstDeleted < 0)) {
						firstDeleted = index;
					}
				}
			}
		}
		assert ((keys) == null) || ((keys[index]) == null);
		if (firstDeleted >= 0) {
			index = firstDeleted;
		}else {
			if (((keys) == null) || (((occupiedCount) * 4) >= ((1 << (power)) * 3))) {
				rehashTable();
				return insertNewKey(key, hash);
			}
			++(occupiedCount);
		}
		keys[index] = key;
		values[((1 << (power)) + index)] = hash;
		++(keyCount);
		return index;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		out.defaultWriteObject();
		int count = keyCount;
		for (int i = 0; count != 0; ++i) {
			java.lang.Object key = keys[i];
			if ((key != null) && (key != (com.google.javascript.rhino.ObjToIntMap.DELETED))) {
				--count;
				out.writeObject(key);
				out.writeInt(values[i]);
			}
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		in.defaultReadObject();
		int writtenKeyCount = keyCount;
		if (writtenKeyCount != 0) {
			keyCount = 0;
			int N = 1 << (power);
			keys = new java.lang.Object[N];
			values = new int[2 * N];
			for (int i = 0; i != writtenKeyCount; ++i) {
				java.lang.Object key = in.readObject();
				int hash = key.hashCode();
				int index = insertNewKey(key, hash);
				values[index] = in.readInt();
			}
		}
	}

	private static final int A = -1640531527;

	private static final java.lang.Object DELETED = new java.lang.Object();

	private transient java.lang.Object[] keys;

	private transient int[] values;

	private int power;

	private int keyCount;

	private transient int occupiedCount;

	private static final boolean check = false;
}

