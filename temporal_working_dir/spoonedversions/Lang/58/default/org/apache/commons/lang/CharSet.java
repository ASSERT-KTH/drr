

package org.apache.commons.lang;


public class CharSet implements java.io.Serializable {
	private static final long serialVersionUID = 5947847346149275958L;

	public static final org.apache.commons.lang.CharSet EMPTY = new org.apache.commons.lang.CharSet(((java.lang.String) (null)));

	public static final org.apache.commons.lang.CharSet ASCII_ALPHA = new org.apache.commons.lang.CharSet("a-zA-Z");

	public static final org.apache.commons.lang.CharSet ASCII_ALPHA_LOWER = new org.apache.commons.lang.CharSet("a-z");

	public static final org.apache.commons.lang.CharSet ASCII_ALPHA_UPPER = new org.apache.commons.lang.CharSet("A-Z");

	public static final org.apache.commons.lang.CharSet ASCII_NUMERIC = new org.apache.commons.lang.CharSet("0-9");

	protected static final java.util.Map COMMON = new java.util.HashMap();

	static {
		org.apache.commons.lang.CharSet.COMMON.put(null, org.apache.commons.lang.CharSet.EMPTY);
		org.apache.commons.lang.CharSet.COMMON.put("", org.apache.commons.lang.CharSet.EMPTY);
		org.apache.commons.lang.CharSet.COMMON.put("a-zA-Z", org.apache.commons.lang.CharSet.ASCII_ALPHA);
		org.apache.commons.lang.CharSet.COMMON.put("A-Za-z", org.apache.commons.lang.CharSet.ASCII_ALPHA);
		org.apache.commons.lang.CharSet.COMMON.put("a-z", org.apache.commons.lang.CharSet.ASCII_ALPHA_LOWER);
		org.apache.commons.lang.CharSet.COMMON.put("A-Z", org.apache.commons.lang.CharSet.ASCII_ALPHA_UPPER);
		org.apache.commons.lang.CharSet.COMMON.put("0-9", org.apache.commons.lang.CharSet.ASCII_NUMERIC);
	}

	private java.util.Set set = new java.util.HashSet();

	public static org.apache.commons.lang.CharSet getInstance(java.lang.String setStr) {
		java.lang.Object set = org.apache.commons.lang.CharSet.COMMON.get(setStr);
		if (set != null) {
			return ((org.apache.commons.lang.CharSet) (set));
		}
		return new org.apache.commons.lang.CharSet(setStr);
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
				set.add(new org.apache.commons.lang.CharRange(str.charAt((pos + 1)), str.charAt((pos + 3)), true));
				pos += 4;
			}else
				if ((remainder >= 3) && ((str.charAt((pos + 1))) == '-')) {
					set.add(new org.apache.commons.lang.CharRange(str.charAt(pos), str.charAt((pos + 2))));
					pos += 3;
				}else
					if ((remainder >= 2) && ((str.charAt(pos)) == '^')) {
						set.add(new org.apache.commons.lang.CharRange(str.charAt((pos + 1)), true));
						pos += 2;
					}else {
						set.add(new org.apache.commons.lang.CharRange(str.charAt(pos)));
						pos += 1;
					}
				
			
		} 
	}

	public org.apache.commons.lang.CharRange[] getCharRanges() {
		return ((org.apache.commons.lang.CharRange[]) (set.toArray(new org.apache.commons.lang.CharRange[set.size()])));
	}

	public boolean contains(char ch) {
		for (java.util.Iterator it = set.iterator(); it.hasNext();) {
			org.apache.commons.lang.CharRange range = ((org.apache.commons.lang.CharRange) (it.next()));
			if (range.contains(ch)) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.CharSet.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang.CharSet) == false) {
			return false;
		}
		org.apache.commons.lang.CharSet other = ((org.apache.commons.lang.CharSet) (obj));
		return set.equals(other.set);
	}

	public int hashCode() {
		return 89 + (set.hashCode());
	}

	public java.lang.String toString() {
		return set.toString();
	}
}

