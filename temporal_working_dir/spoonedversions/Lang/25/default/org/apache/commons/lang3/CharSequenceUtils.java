

package org.apache.commons.lang3;


public class CharSequenceUtils {
	public static java.lang.CharSequence subSequence(java.lang.CharSequence cs, int start) {
		return cs == null ? null : cs.subSequence(start, cs.length());
	}
}

