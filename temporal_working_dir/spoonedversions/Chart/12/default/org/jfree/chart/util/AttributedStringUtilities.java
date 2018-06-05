

package org.jfree.chart.util;


public class AttributedStringUtilities {
	private AttributedStringUtilities() {
	}

	public static boolean equal(java.text.AttributedString s1, java.text.AttributedString s2) {
		if (s1 == null) {
			return s2 == null;
		}
		if (s2 == null) {
			return false;
		}
		java.text.AttributedCharacterIterator it1 = s1.getIterator();
		java.text.AttributedCharacterIterator it2 = s2.getIterator();
		char c1 = it1.first();
		char c2 = it2.first();
		int start = 0;
		while (c1 != (java.text.CharacterIterator.DONE)) {
			int limit1 = it1.getRunLimit();
			int limit2 = it2.getRunLimit();
			if (limit1 != limit2) {
				return false;
			}
			java.util.Map m1 = it1.getAttributes();
			java.util.Map m2 = it2.getAttributes();
			if (!(m1.equals(m2))) {
				return false;
			}
			for (int i = start; i < limit1; i++) {
				if (c1 != c2) {
					return false;
				}
				c1 = it1.next();
				c2 = it2.next();
			}
			start = limit1;
		} 
		return c2 == (java.text.CharacterIterator.DONE);
	}
}

