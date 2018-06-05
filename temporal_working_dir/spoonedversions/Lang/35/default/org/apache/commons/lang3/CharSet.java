

package org.apache.commons.lang3;


public class CharSet implements java.io.Serializable {
	private static final long serialVersionUID = 5947847346149275958L;

	public static final org.apache.commons.lang3.CharSet EMPTY = new org.apache.commons.lang3.CharSet(((java.lang.String) (null)));

	public static final org.apache.commons.lang3.CharSet ASCII_ALPHA = new org.apache.commons.lang3.CharSet("a-zA-Z");

	public static final org.apache.commons.lang3.CharSet ASCII_ALPHA_LOWER = new org.apache.commons.lang3.CharSet("a-z");

	public static final org.apache.commons.lang3.CharSet ASCII_ALPHA_UPPER = new org.apache.commons.lang3.CharSet("A-Z");

	public static final org.apache.commons.lang3.CharSet ASCII_NUMERIC = new org.apache.commons.lang3.CharSet("0-9");

	protected static final java.util.Map<java.lang.String, org.apache.commons.lang3.CharSet> COMMON = java.util.Collections.synchronizedMap(new java.util.HashMap<java.lang.String, org.apache.commons.lang3.CharSet>());

	static {
		org.apache.commons.lang3.CharSet.COMMON.put(null, org.apache.commons.lang3.CharSet.EMPTY);
		org.apache.commons.lang3.CharSet.COMMON.put("", org.apache.commons.lang3.CharSet.EMPTY);
		org.apache.commons.lang3.CharSet.COMMON.put("a-zA-Z", org.apache.commons.lang3.CharSet.ASCII_ALPHA);
		org.apache.commons.lang3.CharSet.COMMON.put("A-Za-z", org.apache.commons.lang3.CharSet.ASCII_ALPHA);
		org.apache.commons.lang3.CharSet.COMMON.put("a-z", org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER);
		org.apache.commons.lang3.CharSet.COMMON.put("A-Z", org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER);
		org.apache.commons.lang3.CharSet.COMMON.put("0-9", org.apache.commons.lang3.CharSet.ASCII_NUMERIC);
	}

	private final java.util.Set<org.apache.commons.lang3.CharRange> set = new java.util.HashSet<org.apache.commons.lang3.CharRange>();

	public static org.apache.commons.lang3.CharSet getInstance(java.lang.String setStr) {
		java.lang.Object set = org.apache.commons.lang3.CharSet.COMMON.get(setStr);
		if (set != null) {
			return ((org.apache.commons.lang3.CharSet) (set));
		}
		return new org.apache.commons.lang3.CharSet(setStr);
	}

	public static org.apache.commons.lang3.CharSet getInstance(java.lang.String[] setStrs) {
		if (setStrs == null) {
			return null;
		}
		return new org.apache.commons.lang3.CharSet(setStrs);
	}

	protected CharSet(java.lang.String setStr) {
		super();
		add(setStr);
	}

	protected CharSet(java.lang.String[] set) {
		super();
		int sz = set.length;
		for (int i = 0; i < sz; i++) {
			add(set[i]);
		}
	}

	protected void add(java.lang.String str) {
		if (str == null) {
			return ;
		}
		int len = str.length();
		int pos = 0;
		while (pos < len) {
			int remainder = len - pos;
			if (((remainder >= 4) && ((str.charAt(pos)) == '^')) && ((str.charAt((pos + 2))) == '-')) {
				set.add(org.apache.commons.lang3.CharRange.isNotIn(str.charAt((pos + 1)), str.charAt((pos + 3))));
				pos += 4;
			}else
				if ((remainder >= 3) && ((str.charAt((pos + 1))) == '-')) {
					set.add(org.apache.commons.lang3.CharRange.isIn(str.charAt(pos), str.charAt((pos + 2))));
					pos += 3;
				}else
					if ((remainder >= 2) && ((str.charAt(pos)) == '^')) {
						set.add(org.apache.commons.lang3.CharRange.isNot(str.charAt((pos + 1))));
						pos += 2;
					}else {
						set.add(org.apache.commons.lang3.CharRange.is(str.charAt(pos)));
						pos += 1;
					}
				
			
		} 
	}

	public org.apache.commons.lang3.CharRange[] getCharRanges() {
		return set.toArray(new org.apache.commons.lang3.CharRange[set.size()]);
	}

	public boolean contains(char ch) {
		for (org.apache.commons.lang3.CharRange range : set) {
			if (range.contains(ch)) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang3.CharSet.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang3.CharSet) == false) {
			return false;
		}
		org.apache.commons.lang3.CharSet other = ((org.apache.commons.lang3.CharSet) (obj));
		return set.equals(other.set);
	}

	@java.lang.Override
	public int hashCode() {
		return 89 + (set.hashCode());
	}

	@java.lang.Override
	public java.lang.String toString() {
		return set.toString();
	}
}

