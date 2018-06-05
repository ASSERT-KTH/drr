

package org.apache.commons.lang.reflect;


abstract class MemberUtils {
	private static final int ACCESS_TEST = ((java.lang.reflect.Modifier.PUBLIC) | (java.lang.reflect.Modifier.PROTECTED)) | (java.lang.reflect.Modifier.PRIVATE);

	private static final java.lang.reflect.Method IS_SYNTHETIC;

	static {
		java.lang.reflect.Method isSynthetic = null;
		if (org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(1.5F)) {
			try {
				isSynthetic = java.lang.reflect.Member.class.getMethod("isSynthetic", org.apache.commons.lang.ArrayUtils.EMPTY_CLASS_ARRAY);
			} catch (java.lang.Exception e) {
			}
		}
		IS_SYNTHETIC = isSynthetic;
	}

	private static final java.lang.Class[] ORDERED_PRIMITIVE_TYPES = new java.lang.Class[]{ java.lang.Byte.TYPE , java.lang.Short.TYPE , java.lang.Character.TYPE , java.lang.Integer.TYPE , java.lang.Long.TYPE , java.lang.Float.TYPE , java.lang.Double.TYPE };

	static void setAccessibleWorkaround(java.lang.reflect.AccessibleObject o) {
		if ((o == null) || (o.isAccessible())) {
			return ;
		}
		java.lang.reflect.Member m = ((java.lang.reflect.Member) (o));
		if ((java.lang.reflect.Modifier.isPublic(m.getModifiers())) && (org.apache.commons.lang.reflect.MemberUtils.isPackageAccess(m.getDeclaringClass().getModifiers()))) {
			try {
				o.setAccessible(true);
			} catch (java.lang.SecurityException e) {
			}
		}
	}

	static boolean isPackageAccess(int modifiers) {
		return (modifiers & (org.apache.commons.lang.reflect.MemberUtils.ACCESS_TEST)) == 0;
	}

	static boolean isAccessible(java.lang.reflect.Member m) {
		return ((m != null) && (java.lang.reflect.Modifier.isPublic(m.getModifiers()))) && (!(org.apache.commons.lang.reflect.MemberUtils.isSynthetic(m)));
	}

	static boolean isSynthetic(java.lang.reflect.Member m) {
		if ((org.apache.commons.lang.reflect.MemberUtils.IS_SYNTHETIC) != null) {
			try {
				return ((java.lang.Boolean) (org.apache.commons.lang.reflect.MemberUtils.IS_SYNTHETIC.invoke(m, null))).booleanValue();
			} catch (java.lang.Exception e) {
			}
		}
		return false;
	}

	static int compareParameterTypes(java.lang.Class[] left, java.lang.Class[] right, java.lang.Class[] actual) {
		float leftCost = org.apache.commons.lang.reflect.MemberUtils.getTotalTransformationCost(actual, left);
		float rightCost = org.apache.commons.lang.reflect.MemberUtils.getTotalTransformationCost(actual, right);
		return leftCost < rightCost ? -1 : rightCost < leftCost ? 1 : 0;
	}

	private static float getTotalTransformationCost(java.lang.Class[] srcArgs, java.lang.Class[] destArgs) {
		float totalCost = 0.0F;
		for (int i = 0; i < (srcArgs.length); i++) {
			java.lang.Class srcClass;
			java.lang.Class destClass;
			srcClass = srcArgs[i];
			destClass = destArgs[i];
			totalCost += org.apache.commons.lang.reflect.MemberUtils.getObjectTransformationCost(srcClass, destClass);
		}
		return totalCost;
	}

	private static float getObjectTransformationCost(java.lang.Class srcClass, java.lang.Class destClass) {
		if (destClass.isPrimitive()) {
			return org.apache.commons.lang.reflect.MemberUtils.getPrimitivePromotionCost(srcClass, destClass);
		}
		float cost = 0.0F;
		while ((destClass != null) && (!(destClass.equals(srcClass)))) {
			if ((destClass.isInterface()) && (org.apache.commons.lang.ClassUtils.isAssignable(srcClass, destClass))) {
				cost += 0.25F;
				break;
			}
			cost++;
			destClass = destClass.getSuperclass();
		} 
		if (destClass == null) {
			cost += 1.5F;
		}
		return cost;
	}

	private static float getPrimitivePromotionCost(final java.lang.Class srcClass, final java.lang.Class destClass) {
		float cost = 0.0F;
		java.lang.Class cls = srcClass;
		if (!(cls.isPrimitive())) {
			cost += 0.1F;
			cls = org.apache.commons.lang.ClassUtils.wrapperToPrimitive(cls);
		}
		for (int i = 0; (cls != destClass) && (i < (org.apache.commons.lang.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES.length)); i++) {
			if (cls == (org.apache.commons.lang.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES[i])) {
				cost += 0.1F;
				if (i < ((org.apache.commons.lang.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES.length) - 1)) {
					cls = org.apache.commons.lang.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES[(i + 1)];
				}
			}
		}
		return cost;
	}
}

