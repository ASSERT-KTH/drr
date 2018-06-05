

package org.apache.commons.math.stat;


public class Frequency implements java.io.Serializable {
	private static final long serialVersionUID = -3845586908418844111L;

	private java.util.TreeMap freqTable = null;

	public Frequency() {
		freqTable = new java.util.TreeMap();
	}

	public Frequency(java.util.Comparator comparator) {
		freqTable = new java.util.TreeMap(comparator);
	}

	public java.lang.String toString() {
		java.text.NumberFormat nf = java.text.NumberFormat.getPercentInstance();
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
		outBuffer.append("Value \t Freq. \t Pct. \t Cum Pct. \n");
		java.util.Iterator iter = freqTable.keySet().iterator();
		while (iter.hasNext()) {
			java.lang.Object value = iter.next();
			outBuffer.append(value);
			outBuffer.append('\t');
			outBuffer.append(getCount(value));
			outBuffer.append('\t');
			outBuffer.append(nf.format(getPct(value)));
			outBuffer.append('\t');
			outBuffer.append(nf.format(getCumPct(value)));
			outBuffer.append('\n');
		} 
		return outBuffer.toString();
	}

	public void addValue(java.lang.Object v) {
		java.lang.Object obj = v;
		if (v instanceof java.lang.Integer) {
			obj = java.lang.Long.valueOf(((java.lang.Integer) (v)).longValue());
		}
		try {
			java.lang.Long count = ((java.lang.Long) (freqTable.get(obj)));
			if (count == null) {
				freqTable.put(obj, java.lang.Long.valueOf(1));
			}else {
				freqTable.put(obj, java.lang.Long.valueOf(((count.longValue()) + 1)));
			}
		} catch (java.lang.ClassCastException ex) {
			throw new java.lang.IllegalArgumentException("Value not comparable to existing values.");
		}
	}

	public void addValue(int v) {
		addValue(java.lang.Long.valueOf(v));
	}

	public void addValue(java.lang.Integer v) {
		addValue(java.lang.Long.valueOf(v.longValue()));
	}

	public void addValue(long v) {
		addValue(java.lang.Long.valueOf(v));
	}

	public void addValue(char v) {
		addValue(java.lang.Character.valueOf(v));
	}

	public void clear() {
		freqTable.clear();
	}

	public java.util.Iterator valuesIterator() {
		return freqTable.keySet().iterator();
	}

	public long getSumFreq() {
		long result = 0;
		java.util.Iterator iterator = freqTable.values().iterator();
		while (iterator.hasNext()) {
			result += ((java.lang.Long) (iterator.next())).longValue();
		} 
		return result;
	}

	public long getCount(java.lang.Object v) {
		if (v instanceof java.lang.Integer) {
			return getCount(((java.lang.Integer) (v)).longValue());
		}
		long result = 0;
		try {
			java.lang.Long count = ((java.lang.Long) (freqTable.get(v)));
			if (count != null) {
				result = count.longValue();
			}
		} catch (java.lang.ClassCastException ex) {
		}
		return result;
	}

	public long getCount(int v) {
		return getCount(java.lang.Long.valueOf(v));
	}

	public long getCount(long v) {
		return getCount(java.lang.Long.valueOf(v));
	}

	public long getCount(char v) {
		return getCount(java.lang.Character.valueOf(v));
	}

	public double getPct(java.lang.Object v) {
		if ((getSumFreq()) == 0) {
			return java.lang.Double.NaN;
		}
		return ((double) (getCount(v))) / ((double) (getSumFreq()));
	}

	public double getPct(int v) {
		return getPct(java.lang.Long.valueOf(v));
	}

	public double getPct(long v) {
		return getPct(java.lang.Long.valueOf(v));
	}

	public double getPct(char v) {
		return getPct(java.lang.Character.valueOf(v));
	}

	public long getCumFreq(java.lang.Object v) {
		if ((getSumFreq()) == 0) {
			return 0;
		}
		if (v instanceof java.lang.Integer) {
			return getCumFreq(((java.lang.Integer) (v)).longValue());
		}
		java.util.Comparator c = freqTable.comparator();
		if (c == null) {
			c = new org.apache.commons.math.stat.Frequency.NaturalComparator();
		}
		long result = 0;
		try {
			java.lang.Long value = ((java.lang.Long) (freqTable.get(v)));
			if (value != null) {
				result = value.longValue();
			}
		} catch (java.lang.ClassCastException ex) {
			return result;
		}
		if ((c.compare(v, freqTable.firstKey())) < 0) {
			return 0;
		}
		if ((c.compare(v, freqTable.lastKey())) >= 0) {
			return getSumFreq();
		}
		java.util.Iterator values = valuesIterator();
		while (values.hasNext()) {
			java.lang.Object nextValue = values.next();
			if ((c.compare(v, nextValue)) > 0) {
				result += getCount(nextValue);
			}else {
				return result;
			}
		} 
		return result;
	}

	public long getCumFreq(int v) {
		return getCumFreq(java.lang.Long.valueOf(v));
	}

	public long getCumFreq(long v) {
		return getCumFreq(java.lang.Long.valueOf(v));
	}

	public long getCumFreq(char v) {
		return getCumFreq(java.lang.Character.valueOf(v));
	}

	public double getCumPct(java.lang.Object v) {
		if ((getSumFreq()) == 0) {
			return java.lang.Double.NaN;
		}
		return ((double) (getCumFreq(v))) / ((double) (getSumFreq()));
	}

	public double getCumPct(int v) {
		return getCumPct(java.lang.Long.valueOf(v));
	}

	public double getCumPct(long v) {
		return getCumPct(java.lang.Long.valueOf(v));
	}

	public double getCumPct(char v) {
		return getCumPct(java.lang.Character.valueOf(v));
	}

	private static class NaturalComparator implements java.io.Serializable , java.util.Comparator {
		private static final long serialVersionUID = -3852193713161395148L;

		public int compare(java.lang.Object o1, java.lang.Object o2) {
			return ((java.lang.Comparable) (o1)).compareTo(o2);
		}
	}
}

