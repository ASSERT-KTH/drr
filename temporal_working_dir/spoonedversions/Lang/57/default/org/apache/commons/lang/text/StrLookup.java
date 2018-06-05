

package org.apache.commons.lang.text;


public abstract class StrLookup {
	private static final org.apache.commons.lang.text.StrLookup NONE_LOOKUP;

	private static final org.apache.commons.lang.text.StrLookup SYSTEM_PROPERTIES_LOOKUP;

	static {
		NONE_LOOKUP = new org.apache.commons.lang.text.StrLookup.MapStrLookup(null);
		org.apache.commons.lang.text.StrLookup lookup = null;
		try {
			lookup = new org.apache.commons.lang.text.StrLookup.MapStrLookup(java.lang.System.getProperties());
		} catch (java.lang.SecurityException ex) {
			lookup = org.apache.commons.lang.text.StrLookup.NONE_LOOKUP;
		}
		SYSTEM_PROPERTIES_LOOKUP = lookup;
	}

	public static org.apache.commons.lang.text.StrLookup noneLookup() {
		return org.apache.commons.lang.text.StrLookup.NONE_LOOKUP;
	}

	public static org.apache.commons.lang.text.StrLookup systemPropertiesLookup() {
		return org.apache.commons.lang.text.StrLookup.SYSTEM_PROPERTIES_LOOKUP;
	}

	public static org.apache.commons.lang.text.StrLookup mapLookup(java.util.Map map) {
		return new org.apache.commons.lang.text.StrLookup.MapStrLookup(map);
	}

	protected StrLookup() {
		super();
	}

	public abstract java.lang.String lookup(java.lang.String key);

	static class MapStrLookup extends org.apache.commons.lang.text.StrLookup {
		private final java.util.Map map;

		MapStrLookup(java.util.Map map) {
			this.map = map;
		}

		public java.lang.String lookup(java.lang.String key) {
			if ((map) == null) {
				return null;
			}
			java.lang.Object obj = map.get(key);
			if (obj == null) {
				return null;
			}
			return obj.toString();
		}
	}
}

