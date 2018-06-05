

package org.apache.commons.math3.util;


public class TransformerMap implements java.io.Serializable , org.apache.commons.math3.util.NumberTransformer {
	private static final long serialVersionUID = 4605318041528645258L;

	private org.apache.commons.math3.util.NumberTransformer defaultTransformer = null;

	private java.util.Map<java.lang.Class<?>, org.apache.commons.math3.util.NumberTransformer> map = null;

	public TransformerMap() {
		map = new java.util.HashMap<java.lang.Class<?>, org.apache.commons.math3.util.NumberTransformer>();
		defaultTransformer = new org.apache.commons.math3.util.DefaultTransformer();
	}

	public boolean containsClass(java.lang.Class<?> key) {
		return map.containsKey(key);
	}

	public boolean containsTransformer(org.apache.commons.math3.util.NumberTransformer value) {
		return map.containsValue(value);
	}

	public org.apache.commons.math3.util.NumberTransformer getTransformer(java.lang.Class<?> key) {
		return map.get(key);
	}

	public org.apache.commons.math3.util.NumberTransformer putTransformer(java.lang.Class<?> key, org.apache.commons.math3.util.NumberTransformer transformer) {
		return map.put(key, transformer);
	}

	public org.apache.commons.math3.util.NumberTransformer removeTransformer(java.lang.Class<?> key) {
		return map.remove(key);
	}

	public void clear() {
		map.clear();
	}

	public java.util.Set<java.lang.Class<?>> classes() {
		return map.keySet();
	}

	public java.util.Collection<org.apache.commons.math3.util.NumberTransformer> transformers() {
		return map.values();
	}

	public double transform(java.lang.Object o) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		double value = java.lang.Double.NaN;
		if ((o instanceof java.lang.Number) || (o instanceof java.lang.String)) {
			value = defaultTransformer.transform(o);
		}else {
			org.apache.commons.math3.util.NumberTransformer trans = getTransformer(o.getClass());
			if (trans != null) {
				value = trans.transform(o);
			}
		}
		return value;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math3.util.TransformerMap.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math3.util.TransformerMap) {
			org.apache.commons.math3.util.TransformerMap rhs = ((org.apache.commons.math3.util.TransformerMap) (other));
			if (!(defaultTransformer.equals(rhs.defaultTransformer))) {
				return false;
			}
			if ((map.size()) != (rhs.map.size())) {
				return false;
			}
			for (java.util.Map.Entry<java.lang.Class<?>, org.apache.commons.math3.util.NumberTransformer> entry : map.entrySet()) {
				if (!(entry.getValue().equals(rhs.map.get(entry.getKey())))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		int hash = defaultTransformer.hashCode();
		for (org.apache.commons.math3.util.NumberTransformer t : map.values()) {
			hash = (hash * 31) + (t.hashCode());
		}
		return hash;
	}
}

