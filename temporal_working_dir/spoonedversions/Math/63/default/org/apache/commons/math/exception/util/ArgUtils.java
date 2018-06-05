

package org.apache.commons.math.exception.util;


public class ArgUtils {
	public static java.lang.Object[] flatten(java.lang.Object[] array) {
		final java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
		if (array != null) {
			for (java.lang.Object o : array) {
				if (o instanceof java.lang.Object[]) {
					for (java.lang.Object oR : org.apache.commons.math.exception.util.ArgUtils.flatten(((java.lang.Object[]) (o)))) {
						list.add(oR);
					}
				}else {
					list.add(o);
				}
			}
		}
		return list.toArray();
	}
}

