

package org.joda.time.tz;


public class ZoneInfoProvider implements org.joda.time.tz.Provider {
	private final java.io.File iFileDir;

	private final java.lang.String iResourcePath;

	private final java.lang.ClassLoader iLoader;

	private final java.util.Map<java.lang.String, java.lang.Object> iZoneInfoMap;

	public ZoneInfoProvider(java.io.File fileDir) throws java.io.IOException {
		if (fileDir == null) {
			throw new java.lang.IllegalArgumentException("No file directory provided");
		}
		if (!(fileDir.exists())) {
			throw new java.io.IOException(("File directory doesn't exist: " + fileDir));
		}
		if (!(fileDir.isDirectory())) {
			throw new java.io.IOException(("File doesn't refer to a directory: " + fileDir));
		}
		iFileDir = fileDir;
		iResourcePath = null;
		iLoader = null;
		iZoneInfoMap = org.joda.time.tz.ZoneInfoProvider.loadZoneInfoMap(openResource("ZoneInfoMap"));
	}

	public ZoneInfoProvider(java.lang.String resourcePath) throws java.io.IOException {
		this(resourcePath, null, false);
	}

	public ZoneInfoProvider(java.lang.String resourcePath, java.lang.ClassLoader loader) throws java.io.IOException {
		this(resourcePath, loader, true);
	}

	private ZoneInfoProvider(java.lang.String resourcePath, java.lang.ClassLoader loader, boolean favorSystemLoader) throws java.io.IOException {
		if (resourcePath == null) {
			throw new java.lang.IllegalArgumentException("No resource path provided");
		}
		if (!(resourcePath.endsWith("/"))) {
			resourcePath += '/';
		}
		iFileDir = null;
		iResourcePath = resourcePath;
		if ((loader == null) && (!favorSystemLoader)) {
			loader = getClass().getClassLoader();
		}
		iLoader = loader;
		iZoneInfoMap = org.joda.time.tz.ZoneInfoProvider.loadZoneInfoMap(openResource("ZoneInfoMap"));
	}

	public org.joda.time.DateTimeZone getZone(java.lang.String id) {
		if (id == null) {
			return null;
		}
		java.lang.Object obj = iZoneInfoMap.get(id);
		if (obj == null) {
			return null;
		}
		if (id.equals(obj)) {
			return loadZoneData(id);
		}
		if (obj instanceof java.lang.ref.SoftReference<?>) {
			@java.lang.SuppressWarnings(value = "unchecked")
			java.lang.ref.SoftReference<org.joda.time.DateTimeZone> ref = ((java.lang.ref.SoftReference<org.joda.time.DateTimeZone>) (obj));
			org.joda.time.DateTimeZone tz = ref.get();
			if (tz != null) {
				return tz;
			}
			return loadZoneData(id);
		}
		return getZone(((java.lang.String) (obj)));
	}

	public java.util.Set<java.lang.String> getAvailableIDs() {
		return new java.util.TreeSet<java.lang.String>(iZoneInfoMap.keySet());
	}

	protected void uncaughtException(java.lang.Exception ex) {
		java.lang.Thread t = java.lang.Thread.currentThread();
		t.getThreadGroup().uncaughtException(t, ex);
	}

	private java.io.InputStream openResource(java.lang.String name) throws java.io.IOException {
		java.io.InputStream in;
		if ((iFileDir) != null) {
			in = new java.io.FileInputStream(new java.io.File(iFileDir, name));
		}else {
			java.lang.String path = iResourcePath.concat(name);
			if ((iLoader) != null) {
				in = iLoader.getResourceAsStream(path);
			}else {
				in = java.lang.ClassLoader.getSystemResourceAsStream(path);
			}
			if (in == null) {
				java.lang.StringBuffer buf = new java.lang.StringBuffer(40).append("Resource not found: \"").append(path).append("\" ClassLoader: ").append(((iLoader) != null ? iLoader.toString() : "system"));
				throw new java.io.IOException(buf.toString());
			}
		}
		return in;
	}

	private org.joda.time.DateTimeZone loadZoneData(java.lang.String id) {
		java.io.InputStream in = null;
		try {
			in = openResource(id);
			org.joda.time.DateTimeZone tz = org.joda.time.tz.DateTimeZoneBuilder.readFrom(in, id);
			iZoneInfoMap.put(id, new java.lang.ref.SoftReference<org.joda.time.DateTimeZone>(tz));
			return tz;
		} catch (java.io.IOException e) {
			uncaughtException(e);
			iZoneInfoMap.remove(id);
			return null;
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (java.io.IOException e) {
			}
		}
	}

	private static java.util.Map<java.lang.String, java.lang.Object> loadZoneInfoMap(java.io.InputStream in) throws java.io.IOException {
		java.util.Map<java.lang.String, java.lang.Object> map = new java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>();
		java.io.DataInputStream din = new java.io.DataInputStream(in);
		try {
			org.joda.time.tz.ZoneInfoProvider.readZoneInfoMap(din, map);
		} finally {
			try {
				din.close();
			} catch (java.io.IOException e) {
			}
		}
		map.put("UTC", new java.lang.ref.SoftReference<org.joda.time.DateTimeZone>(org.joda.time.DateTimeZone.UTC));
		return map;
	}

	private static void readZoneInfoMap(java.io.DataInputStream din, java.util.Map<java.lang.String, java.lang.Object> zimap) throws java.io.IOException {
		int size = din.readUnsignedShort();
		java.lang.String[] pool = new java.lang.String[size];
		for (int i = 0; i < size; i++) {
			pool[i] = din.readUTF().intern();
		}
		size = din.readUnsignedShort();
		for (int i = 0; i < size; i++) {
			try {
				zimap.put(pool[din.readUnsignedShort()], pool[din.readUnsignedShort()]);
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				throw new java.io.IOException("Corrupt zone info map");
			}
		}
	}
}

