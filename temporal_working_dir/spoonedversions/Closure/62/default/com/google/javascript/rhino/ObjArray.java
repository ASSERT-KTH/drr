

package com.google.javascript.rhino;


public class ObjArray implements java.io.Serializable {
	static final long serialVersionUID = 4174889037736658296L;

	public ObjArray() {
	}

	public final boolean isSealed() {
		return sealed;
	}

	public final void seal() {
		sealed = true;
	}

	public final boolean isEmpty() {
		return (size) == 0;
	}

	public final int size() {
		return size;
	}

	public final void setSize(int newSize) {
		if (newSize < 0)
			throw new java.lang.IllegalArgumentException();
		
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		int N = size;
		if (newSize < N) {
			for (int i = newSize; i != N; ++i) {
				setImpl(i, null);
			}
		}else
			if (newSize > N) {
				if (newSize > (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) {
					ensureCapacity(newSize);
				}
			}
		
		size = newSize;
	}

	public final java.lang.Object get(int index) {
		if (!((0 <= index) && (index < (size))))
			throw com.google.javascript.rhino.ObjArray.onInvalidIndex(index, size);
		
		return getImpl(index);
	}

	public final void set(int index, java.lang.Object value) {
		if (!((0 <= index) && (index < (size))))
			throw com.google.javascript.rhino.ObjArray.onInvalidIndex(index, size);
		
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		setImpl(index, value);
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private java.lang.Object getImpl(int index) {
		switch (index) {
			case 0 :
				return f0;
			case 1 :
				return f1;
			case 2 :
				return f2;
			case 3 :
				return f3;
			case 4 :
				return f4;
		}
		return data[(index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE))];
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private void setImpl(int index, java.lang.Object value) {
		switch (index) {
			case 0 :
				f0 = value;
				break;
			case 1 :
				f1 = value;
				break;
			case 2 :
				f2 = value;
				break;
			case 3 :
				f3 = value;
				break;
			case 4 :
				f4 = value;
				break;
			default :
				data[(index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE))] = value;
		}
	}

	public int indexOf(java.lang.Object obj) {
		int N = size;
		for (int i = 0; i != N; ++i) {
			java.lang.Object current = getImpl(i);
			if ((current == obj) || ((current != null) && (current.equals(obj)))) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(java.lang.Object obj) {
		for (int i = size; i != 0;) {
			--i;
			java.lang.Object current = getImpl(i);
			if ((current == obj) || ((current != null) && (current.equals(obj)))) {
				return i;
			}
		}
		return -1;
	}

	public final java.lang.Object peek() {
		int N = size;
		if (N == 0)
			throw com.google.javascript.rhino.ObjArray.onEmptyStackTopRead();
		
		return getImpl((N - 1));
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	public final java.lang.Object pop() {
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		int N = size;
		--N;
		java.lang.Object top;
		switch (N) {
			case -1 :
				throw com.google.javascript.rhino.ObjArray.onEmptyStackTopRead();
			case 0 :
				top = f0;
				f0 = null;
				break;
			case 1 :
				top = f1;
				f1 = null;
				break;
			case 2 :
				top = f2;
				f2 = null;
				break;
			case 3 :
				top = f3;
				f3 = null;
				break;
			case 4 :
				top = f4;
				f4 = null;
				break;
			default :
				top = data[(N - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE))];
				data[(N - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE))] = null;
		}
		size = N;
		return top;
	}

	public final void push(java.lang.Object value) {
		add(value);
	}

	public final void add(java.lang.Object value) {
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		int N = size;
		if (N >= (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) {
			ensureCapacity((N + 1));
		}
		size = N + 1;
		setImpl(N, value);
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	public final void add(int index, java.lang.Object value) {
		int N = size;
		if (!((0 <= index) && (index <= N)))
			throw com.google.javascript.rhino.ObjArray.onInvalidIndex(index, (N + 1));
		
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		java.lang.Object tmp;
		switch (index) {
			case 0 :
				if (N == 0) {
					f0 = value;
					break;
				}
				tmp = f0;
				f0 = value;
				value = tmp;
			case 1 :
				if (N == 1) {
					f1 = value;
					break;
				}
				tmp = f1;
				f1 = value;
				value = tmp;
			case 2 :
				if (N == 2) {
					f2 = value;
					break;
				}
				tmp = f2;
				f2 = value;
				value = tmp;
			case 3 :
				if (N == 3) {
					f3 = value;
					break;
				}
				tmp = f3;
				f3 = value;
				value = tmp;
			case 4 :
				if (N == 4) {
					f4 = value;
					break;
				}
				tmp = f4;
				f4 = value;
				value = tmp;
				index = com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE;
			default :
				ensureCapacity((N + 1));
				if (index != N) {
					java.lang.System.arraycopy(data, (index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)), data, ((index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) + 1), (N - index));
				}
				data[(index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE))] = value;
		}
		size = N + 1;
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	public final void remove(int index) {
		int N = size;
		if (!((0 <= index) && (index < N)))
			throw com.google.javascript.rhino.ObjArray.onInvalidIndex(index, N);
		
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		--N;
		switch (index) {
			case 0 :
				if (N == 0) {
					f0 = null;
					break;
				}
				f0 = f1;
			case 1 :
				if (N == 1) {
					f1 = null;
					break;
				}
				f1 = f2;
			case 2 :
				if (N == 2) {
					f2 = null;
					break;
				}
				f2 = f3;
			case 3 :
				if (N == 3) {
					f3 = null;
					break;
				}
				f3 = f4;
			case 4 :
				if (N == 4) {
					f4 = null;
					break;
				}
				f4 = data[0];
				index = com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE;
			default :
				if (index != N) {
					java.lang.System.arraycopy(data, ((index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) + 1), data, (index - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)), (N - index));
				}
				data[(N - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE))] = null;
		}
		size = N;
	}

	public final void clear() {
		if (sealed)
			throw com.google.javascript.rhino.ObjArray.onSeledMutation();
		
		int N = size;
		for (int i = 0; i != N; ++i) {
			setImpl(i, null);
		}
		size = 0;
	}

	public final java.lang.Object[] toArray() {
		java.lang.Object[] array = new java.lang.Object[size];
		toArray(array, 0);
		return array;
	}

	public final void toArray(java.lang.Object[] array) {
		toArray(array, 0);
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	public final void toArray(java.lang.Object[] array, int offset) {
		int N = size;
		switch (N) {
			default :
				java.lang.System.arraycopy(data, 0, array, (offset + (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)), (N - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)));
			case 5 :
				array[(offset + 4)] = f4;
			case 4 :
				array[(offset + 3)] = f3;
			case 3 :
				array[(offset + 2)] = f2;
			case 2 :
				array[(offset + 1)] = f1;
			case 1 :
				array[(offset + 0)] = f0;
			case 0 :
				break;
		}
	}

	private void ensureCapacity(int minimalCapacity) {
		int required = minimalCapacity - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE);
		if (required <= 0)
			throw new java.lang.IllegalArgumentException();
		
		if ((data) == null) {
			int alloc = (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE) * 2;
			if (alloc < required) {
				alloc = required;
			}
			data = new java.lang.Object[alloc];
		}else {
			int alloc = data.length;
			if (alloc < required) {
				if (alloc <= (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) {
					alloc = (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE) * 2;
				}else {
					alloc *= 2;
				}
				if (alloc < required) {
					alloc = required;
				}
				java.lang.Object[] tmp = new java.lang.Object[alloc];
				if ((size) > (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) {
					java.lang.System.arraycopy(data, 0, tmp, 0, ((size) - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)));
				}
				data = tmp;
			}
		}
	}

	private static java.lang.RuntimeException onInvalidIndex(int index, int upperBound) {
		java.lang.String msg = ((index + " \u2209 [0, ") + upperBound) + ')';
		throw new java.lang.IndexOutOfBoundsException(msg);
	}

	private static java.lang.RuntimeException onEmptyStackTopRead() {
		throw new java.lang.RuntimeException("Empty stack");
	}

	private static java.lang.RuntimeException onSeledMutation() {
		throw new java.lang.IllegalStateException("Attempt to modify sealed array");
	}

	private void writeObject(java.io.ObjectOutputStream os) throws java.io.IOException {
		os.defaultWriteObject();
		int N = size;
		for (int i = 0; i != N; ++i) {
			java.lang.Object obj = getImpl(i);
			os.writeObject(obj);
		}
	}

	private void readObject(java.io.ObjectInputStream is) throws java.io.IOException, java.lang.ClassNotFoundException {
		is.defaultReadObject();
		int N = size;
		if (N > (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)) {
			data = new java.lang.Object[N - (com.google.javascript.rhino.ObjArray.FIELDS_STORE_SIZE)];
		}
		for (int i = 0; i != N; ++i) {
			java.lang.Object obj = is.readObject();
			setImpl(i, obj);
		}
	}

	private int size;

	private boolean sealed;

	private static final int FIELDS_STORE_SIZE = 5;

	private transient java.lang.Object f0;

	private transient java.lang.Object f1;

	private transient java.lang.Object f2;

	private transient java.lang.Object f3;

	private transient java.lang.Object f4;

	private transient java.lang.Object[] data;
}

