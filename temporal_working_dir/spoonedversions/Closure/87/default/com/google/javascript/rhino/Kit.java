

package com.google.javascript.rhino;


public class Kit {
	private static java.lang.reflect.Method Throwable_initCause = null;

	static {
		try {
			java.lang.Class<?> ThrowableClass = com.google.javascript.rhino.Kit.classOrNull("java.lang.Throwable");
			java.lang.Class<?>[] signature = new java.lang.Class<?>[]{ ThrowableClass };
			com.google.javascript.rhino.Kit.Throwable_initCause = ThrowableClass.getMethod("initCause", signature);
		} catch (java.lang.Exception ex) {
		}
	}

	public static java.lang.Class<?> classOrNull(java.lang.String className) {
		try {
			return java.lang.Class.forName(className);
		} catch (java.lang.ClassNotFoundException ex) {
		} catch (java.lang.SecurityException ex) {
		} catch (java.lang.LinkageError ex) {
		} catch (java.lang.IllegalArgumentException e) {
		}
		return null;
	}

	public static java.lang.Class<?> classOrNull(java.lang.ClassLoader loader, java.lang.String className) {
		try {
			return loader.loadClass(className);
		} catch (java.lang.ClassNotFoundException ex) {
		} catch (java.lang.SecurityException ex) {
		} catch (java.lang.LinkageError ex) {
		} catch (java.lang.IllegalArgumentException e) {
		}
		return null;
	}

	static <T> T newInstanceOrNull(java.lang.Class<T> cl) {
		try {
			return cl.newInstance();
		} catch (java.lang.SecurityException x) {
		} catch (java.lang.LinkageError ex) {
		} catch (java.lang.InstantiationException x) {
		} catch (java.lang.IllegalAccessException x) {
		}
		return null;
	}

	public static java.lang.RuntimeException initCause(java.lang.RuntimeException ex, java.lang.Throwable cause) {
		if ((com.google.javascript.rhino.Kit.Throwable_initCause) != null) {
			java.lang.Object[] args = new java.lang.Object[]{ cause };
			try {
				com.google.javascript.rhino.Kit.Throwable_initCause.invoke(ex, args);
			} catch (java.lang.Exception e) {
			}
		}
		return ex;
	}

	public static java.lang.String[] semicolonSplit(java.lang.String s) {
		java.lang.String[] array = null;
		for (; ;) {
			int count = 0;
			int cursor = 0;
			for (; ;) {
				int next = s.indexOf(';', cursor);
				if (next < 0) {
					break;
				}
				if (array != null) {
					array[count] = s.substring(cursor, next);
				}
				++count;
				cursor = next + 1;
			}
			if (array == null) {
				if (cursor != (s.length()))
					throw new java.lang.IllegalArgumentException();
				
				array = new java.lang.String[count];
			}else {
				break;
			}
		}
		return array;
	}

	public static int xDigitToInt(int c, int accumulator) {
		check : {
			if (c <= '9') {
				c -= '0';
				if (0 <= c) {
					break check;
				}
			}else
				if (c <= 'F') {
					if ('A' <= c) {
						c -= 'A' - 10;
						break check;
					}
				}else
					if (c <= 'f') {
						if ('a' <= c) {
							c -= 'a' - 10;
							break check;
						}
					}
				
			
			return -1;
		}
		return (accumulator << 4) | c;
	}

	public static java.lang.Object addListener(java.lang.Object bag, java.lang.Object listener) {
		if (listener == null)
			throw new java.lang.IllegalArgumentException();
		
		if (listener instanceof java.lang.Object[])
			throw new java.lang.IllegalArgumentException();
		
		if (bag == null) {
			bag = listener;
		}else
			if (!(bag instanceof java.lang.Object[])) {
				bag = new java.lang.Object[]{ bag , listener };
			}else {
				java.lang.Object[] array = ((java.lang.Object[]) (bag));
				int L = array.length;
				if (L < 2)
					throw new java.lang.IllegalArgumentException();
				
				java.lang.Object[] tmp = new java.lang.Object[L + 1];
				java.lang.System.arraycopy(array, 0, tmp, 0, L);
				tmp[L] = listener;
				bag = tmp;
			}
		
		return bag;
	}

	public static java.lang.Object removeListener(java.lang.Object bag, java.lang.Object listener) {
		if (listener == null)
			throw new java.lang.IllegalArgumentException();
		
		if (listener instanceof java.lang.Object[])
			throw new java.lang.IllegalArgumentException();
		
		if (bag == listener) {
			bag = null;
		}else
			if (bag instanceof java.lang.Object[]) {
				java.lang.Object[] array = ((java.lang.Object[]) (bag));
				int L = array.length;
				if (L < 2)
					throw new java.lang.IllegalArgumentException();
				
				if (L == 2) {
					if ((array[1]) == listener) {
						bag = array[0];
					}else
						if ((array[0]) == listener) {
							bag = array[1];
						}
					
				}else {
					int i = L;
					do {
						--i;
						if ((array[i]) == listener) {
							java.lang.Object[] tmp = new java.lang.Object[L - 1];
							java.lang.System.arraycopy(array, 0, tmp, 0, i);
							java.lang.System.arraycopy(array, (i + 1), tmp, i, (L - (i + 1)));
							bag = tmp;
							break;
						}
					} while (i != 0 );
				}
			}
		
		return bag;
	}

	public static java.lang.Object getListener(java.lang.Object bag, int index) {
		if (index == 0) {
			if (bag == null)
				return null;
			
			if (!(bag instanceof java.lang.Object[]))
				return bag;
			
			java.lang.Object[] array = ((java.lang.Object[]) (bag));
			if ((array.length) < 2)
				throw new java.lang.IllegalArgumentException();
			
			return array[0];
		}else
			if (index == 1) {
				if (!(bag instanceof java.lang.Object[])) {
					if (bag == null)
						throw new java.lang.IllegalArgumentException();
					
					return null;
				}
				java.lang.Object[] array = ((java.lang.Object[]) (bag));
				return array[1];
			}else {
				java.lang.Object[] array = ((java.lang.Object[]) (bag));
				int L = array.length;
				if (L < 2)
					throw new java.lang.IllegalArgumentException();
				
				if (index == L)
					return null;
				
				return array[index];
			}
		
	}

	static <K, V> V initHash(java.util.Hashtable<K, V> h, K key, V initialValue) {
		synchronized(h) {
			V current = h.get(key);
			if (current == null) {
				h.put(key, initialValue);
			}else {
				initialValue = current;
			}
		}
		return initialValue;
	}

	private static final class ComplexKey {
		private java.lang.Object key1;

		private java.lang.Object key2;

		private int hash;

		ComplexKey(java.lang.Object key1, java.lang.Object key2) {
			com.google.javascript.rhino.Kit.ComplexKey.this.key1 = key1;
			com.google.javascript.rhino.Kit.ComplexKey.this.key2 = key2;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object anotherObj) {
			if (!(anotherObj instanceof com.google.javascript.rhino.Kit.ComplexKey))
				return false;
			
			com.google.javascript.rhino.Kit.ComplexKey another = ((com.google.javascript.rhino.Kit.ComplexKey) (anotherObj));
			return (key1.equals(another.key1)) && (key2.equals(another.key2));
		}

		@java.lang.Override
		public int hashCode() {
			if ((hash) == 0) {
				hash = (key1.hashCode()) ^ (key2.hashCode());
			}
			return hash;
		}
	}

	public static java.lang.Object makeHashKeyFromPair(java.lang.Object key1, java.lang.Object key2) {
		if (key1 == null)
			throw new java.lang.IllegalArgumentException();
		
		if (key2 == null)
			throw new java.lang.IllegalArgumentException();
		
		return new com.google.javascript.rhino.Kit.ComplexKey(key1, key2);
	}

	public static java.lang.String readReader(java.io.Reader r) throws java.io.IOException {
		char[] buffer = new char[512];
		int cursor = 0;
		for (; ;) {
			int n = r.read(buffer, cursor, ((buffer.length) - cursor));
			if (n < 0) {
				break;
			}
			cursor += n;
			if (cursor == (buffer.length)) {
				char[] tmp = new char[(buffer.length) * 2];
				java.lang.System.arraycopy(buffer, 0, tmp, 0, cursor);
				buffer = tmp;
			}
		}
		return new java.lang.String(buffer, 0, cursor);
	}

	public static byte[] readStream(java.io.InputStream is, int initialBufferCapacity) throws java.io.IOException {
		if (initialBufferCapacity <= 0) {
			throw new java.lang.IllegalArgumentException(("Bad initialBufferCapacity: " + initialBufferCapacity));
		}
		byte[] buffer = new byte[initialBufferCapacity];
		int cursor = 0;
		for (; ;) {
			int n = is.read(buffer, cursor, ((buffer.length) - cursor));
			if (n < 0) {
				break;
			}
			cursor += n;
			if (cursor == (buffer.length)) {
				byte[] tmp = new byte[(buffer.length) * 2];
				java.lang.System.arraycopy(buffer, 0, tmp, 0, cursor);
				buffer = tmp;
			}
		}
		if (cursor != (buffer.length)) {
			byte[] tmp = new byte[cursor];
			java.lang.System.arraycopy(buffer, 0, tmp, 0, cursor);
			buffer = tmp;
		}
		return buffer;
	}

	public static java.lang.RuntimeException codeBug() throws java.lang.RuntimeException {
		java.lang.RuntimeException ex = new java.lang.IllegalStateException("FAILED ASSERTION");
		ex.printStackTrace(java.lang.System.err);
		throw ex;
	}
}

