

package com.google.javascript.rhino;


public class UintMap implements java.io.Serializable {
	static final long serialVersionUID = 4242698212885848444L;

	public UintMap() {
		this(4);
	}

	public UintMap(int initialCapacity) {
		if (initialCapacity < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int minimalCapacity = (initialCapacity * 4) / 3;
		int i;
		for (i = 2; (1 << i) < minimalCapacity; ++i) {
		}
		power = i;
		assert !((power) < 2);
	}

	public boolean isEmpty() {
		return (keyCount) == 0;
	}

	public int size() {
		return keyCount;
	}

	public boolean has(int key) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		return 0 <= (findIndex(key));
	}

	public java.lang.Object getObject(int key) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		if ((values) != null) {
			int index = findIndex(key);
			if (0 <= index) {
				return values[index];
			}
		}
		return null;
	}

	public int getInt(int key, int defaultValue) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int index = findIndex(key);
		if (0 <= index) {
			if ((ivaluesShift) != 0) {
				return keys[((ivaluesShift) + index)];
			}
			return 0;
		}
		return defaultValue;
	}

	public int getExistingInt(int key) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int index = findIndex(key);
		if (0 <= index) {
			if ((ivaluesShift) != 0) {
				return keys[((ivaluesShift) + index)];
			}
			return 0;
		}
		com.google.javascript.rhino.Kit.codeBug();
		return 0;
	}

	public void put(int key, java.lang.Object value) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int index = ensureIndex(key, false);
		if ((values) == null) {
			values = new java.lang.Object[1 << (power)];
		}
		values[index] = value;
	}

	public void put(int key, int value) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int index = ensureIndex(key, true);
		if ((ivaluesShift) == 0) {
			int N = 1 << (power);
			if ((keys.length) != (N * 2)) {
				int[] tmp = new int[N * 2];
				java.lang.System.arraycopy(keys, 0, tmp, 0, N);
				keys = tmp;
			}
			ivaluesShift = N;
		}
		keys[((ivaluesShift) + index)] = value;
	}

	public void remove(int key) {
		if (key < 0)
			com.google.javascript.rhino.Kit.codeBug();
		
		int index = findIndex(key);
		if (0 <= index) {
			keys[index] = com.google.javascript.rhino.UintMap.DELETED;
			--(keyCount);
			if ((values) != null) {
				values[index] = null;
			}
			if ((ivaluesShift) != 0) {
				keys[((ivaluesShift) + index)] = 0;
			}
		}
	}

	public void clear() {
		int N = 1 << (power);
		if ((keys) != null) {
			for (int i = 0; i != N; ++i) {
				keys[i] = com.google.javascript.rhino.UintMap.EMPTY;
			}
			if ((values) != null) {
				for (int i = 0; i != N; ++i) {
					values[i] = null;
				}
			}
		}
		ivaluesShift = 0;
		keyCount = 0;
		occupiedCount = 0;
	}

	public int[] getKeys() {
		int[] keys = com.google.javascript.rhino.UintMap.this.keys;
		int n = keyCount;
		int[] result = new int[n];
		for (int i = 0; n != 0; ++i) {
			int entry = keys[i];
			if ((entry != (com.google.javascript.rhino.UintMap.EMPTY)) && (entry != (com.google.javascript.rhino.UintMap.DELETED))) {
				result[(--n)] = entry;
			}
		}
		return result;
	}

	private static int tableLookupStep(int fraction, int mask, int power) {
		int shift = 32 - (2 * power);
		if (shift >= 0) {
			return ((fraction >>> shift) & mask) | 1;
		}else {
			return (fraction & (mask >>> (-shift))) | 1;
		}
	}

	private int findIndex(int key) {
		int[] keys = com.google.javascript.rhino.UintMap.this.keys;
		if (keys != null) {
			int fraction = key * (com.google.javascript.rhino.UintMap.A);
			int index = fraction >>> (32 - (power));
			int entry = keys[index];
			if (entry == key) {
				return index;
			}
			if (entry != (com.google.javascript.rhino.UintMap.EMPTY)) {
				int mask = (1 << (power)) - 1;
				int step = com.google.javascript.rhino.UintMap.tableLookupStep(fraction, mask, power);
				int n = 0;
				do {
					if (com.google.javascript.rhino.UintMap.check) {
						if (n >= (occupiedCount))
							com.google.javascript.rhino.Kit.codeBug();
						
						++n;
					}
					index = (index + step) & mask;
					entry = keys[index];
					if (entry == key) {
						return index;
					}
				} while (entry != (com.google.javascript.rhino.UintMap.EMPTY) );
			}
		}
		return -1;
	}

	private int insertNewKey(int key) {
		assert (occupiedCount) == (keyCount);
		assert (keyCount) != (1 << (power));
		int[] keys = com.google.javascript.rhino.UintMap.this.keys;
		int fraction = key * (com.google.javascript.rhino.UintMap.A);
		int index = fraction >>> (32 - (power));
		if ((keys[index]) != (com.google.javascript.rhino.UintMap.EMPTY)) {
			int mask = (1 << (power)) - 1;
			int step = com.google.javascript.rhino.UintMap.tableLookupStep(fraction, mask, power);
			int firstIndex = index;
			do {
				assert (keys[index]) != (com.google.javascript.rhino.UintMap.DELETED);
				index = (index + step) & mask;
				assert firstIndex != index;
			} while ((keys[index]) != (com.google.javascript.rhino.UintMap.EMPTY) );
		}
		keys[index] = key;
		++(occupiedCount);
		++(keyCount);
		return index;
	}

	private void rehashTable(boolean ensureIntSpace) {
		if ((keys) != null) {
			if (((keyCount) * 2) >= (occupiedCount)) {
				++(power);
			}
		}
		int N = 1 << (power);
		int[] old = keys;
		int oldShift = ivaluesShift;
		if ((oldShift == 0) && (!ensureIntSpace)) {
			keys = new int[N];
		}else {
			ivaluesShift = N;
			keys = new int[N * 2];
		}
		for (int i = 0; i != N; ++i) {
			keys[i] = com.google.javascript.rhino.UintMap.EMPTY;
		}
		java.lang.Object[] oldValues = values;
		if (oldValues != null) {
			values = new java.lang.Object[N];
		}
		int oldCount = keyCount;
		occupiedCount = 0;
		if (oldCount != 0) {
			keyCount = 0;
			for (int i = 0, remaining = oldCount; remaining != 0; ++i) {
				int key = old[i];
				if ((key != (com.google.javascript.rhino.UintMap.EMPTY)) && (key != (com.google.javascript.rhino.UintMap.DELETED))) {
					int index = insertNewKey(key);
					if (oldValues != null) {
						values[index] = oldValues[i];
					}
					if (oldShift != 0) {
						keys[((ivaluesShift) + index)] = old[(oldShift + i)];
					}
					--remaining;
				}
			}
		}
	}

	private int ensureIndex(int key, boolean intType) {
		int index = -1;
		int firstDeleted = -1;
		int[] keys = com.google.javascript.rhino.UintMap.this.keys;
		if (keys != null) {
			int fraction = key * (com.google.javascript.rhino.UintMap.A);
			index = fraction >>> (32 - (power));
			int entry = keys[index];
			if (entry == key) {
				return index;
			}
			if (entry != (com.google.javascript.rhino.UintMap.EMPTY)) {
				if (entry == (com.google.javascript.rhino.UintMap.DELETED)) {
					firstDeleted = index;
				}
				int mask = (1 << (power)) - 1;
				int step = com.google.javascript.rhino.UintMap.tableLookupStep(fraction, mask, power);
				int n = 0;
				do {
					if (com.google.javascript.rhino.UintMap.check) {
						if (n >= (occupiedCount))
							com.google.javascript.rhino.Kit.codeBug();
						
						++n;
					}
					index = (index + step) & mask;
					entry = keys[index];
					if (entry == key) {
						return index;
					}
					if ((entry == (com.google.javascript.rhino.UintMap.DELETED)) && (firstDeleted < 0)) {
						firstDeleted = index;
					}
				} while (entry != (com.google.javascript.rhino.UintMap.EMPTY) );
			}
		}
		assert (keys == null) || ((keys[index]) == (com.google.javascript.rhino.UintMap.EMPTY));
		if (firstDeleted >= 0) {
			index = firstDeleted;
		}else {
			if ((keys == null) || (((occupiedCount) * 4) >= ((1 << (power)) * 3))) {
				rehashTable(intType);
				keys = com.google.javascript.rhino.UintMap.this.keys;
				return insertNewKey(key);
			}
			++(occupiedCount);
		}
		keys[index] = key;
		++(keyCount);
		return index;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		out.defaultWriteObject();
		int count = keyCount;
		if (count != 0) {
			boolean hasIntValues = (ivaluesShift) != 0;
			boolean hasObjectValues = (values) != null;
			out.writeBoolean(hasIntValues);
			out.writeBoolean(hasObjectValues);
			for (int i = 0; count != 0; ++i) {
				int key = keys[i];
				if ((key != (com.google.javascript.rhino.UintMap.EMPTY)) && (key != (com.google.javascript.rhino.UintMap.DELETED))) {
					--count;
					out.writeInt(key);
					if (hasIntValues) {
						out.writeInt(keys[((ivaluesShift) + i)]);
					}
					if (hasObjectValues) {
						out.writeObject(values[i]);
					}
				}
			}
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		in.defaultReadObject();
		int writtenKeyCount = keyCount;
		if (writtenKeyCount != 0) {
			keyCount = 0;
			boolean hasIntValues = in.readBoolean();
			boolean hasObjectValues = in.readBoolean();
			int N = 1 << (power);
			if (hasIntValues) {
				keys = new int[2 * N];
				ivaluesShift = N;
			}else {
				keys = new int[N];
			}
			for (int i = 0; i != N; ++i) {
				keys[i] = com.google.javascript.rhino.UintMap.EMPTY;
			}
			if (hasObjectValues) {
				values = new java.lang.Object[N];
			}
			for (int i = 0; i != writtenKeyCount; ++i) {
				int key = in.readInt();
				int index = insertNewKey(key);
				if (hasIntValues) {
					int ivalue = in.readInt();
					keys[((ivaluesShift) + index)] = ivalue;
				}
				if (hasObjectValues) {
					values[index] = in.readObject();
				}
			}
		}
	}

	private static final int A = -1640531527;

	private static final int EMPTY = -1;

	private static final int DELETED = -2;

	private transient int[] keys;

	private transient java.lang.Object[] values;

	private int power;

	private int keyCount;

	private transient int occupiedCount;

	private transient int ivaluesShift;

	private static final boolean check = false;
}

