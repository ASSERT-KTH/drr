

package org.jfree.data;


public class KeyedValueComparator implements java.util.Comparator {
	private org.jfree.data.KeyedValueComparatorType type;

	private org.jfree.chart.util.SortOrder order;

	public KeyedValueComparator(org.jfree.data.KeyedValueComparatorType type, org.jfree.chart.util.SortOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.data.KeyedValueComparator.this.type = type;
		org.jfree.data.KeyedValueComparator.this.order = order;
	}

	public org.jfree.data.KeyedValueComparatorType getType() {
		return org.jfree.data.KeyedValueComparator.this.type;
	}

	public org.jfree.chart.util.SortOrder getOrder() {
		return org.jfree.data.KeyedValueComparator.this.order;
	}

	public int compare(java.lang.Object o1, java.lang.Object o2) {
		if (o2 == null) {
			return -1;
		}
		if (o1 == null) {
			return 1;
		}
		int result;
		org.jfree.data.KeyedValue kv1 = ((org.jfree.data.KeyedValue) (o1));
		org.jfree.data.KeyedValue kv2 = ((org.jfree.data.KeyedValue) (o2));
		if ((org.jfree.data.KeyedValueComparator.this.type) == (org.jfree.data.KeyedValueComparatorType.BY_KEY)) {
			if (org.jfree.data.KeyedValueComparator.this.order.equals(org.jfree.chart.util.SortOrder.ASCENDING)) {
				result = kv1.getKey().compareTo(kv2.getKey());
			}else
				if (org.jfree.data.KeyedValueComparator.this.order.equals(org.jfree.chart.util.SortOrder.DESCENDING)) {
					result = kv2.getKey().compareTo(kv1.getKey());
				}else {
					throw new java.lang.IllegalArgumentException("Unrecognised sort order.");
				}
			
		}else
			if ((org.jfree.data.KeyedValueComparator.this.type) == (org.jfree.data.KeyedValueComparatorType.BY_VALUE)) {
				java.lang.Number n1 = kv1.getValue();
				java.lang.Number n2 = kv2.getValue();
				if (n2 == null) {
					return -1;
				}
				if (n1 == null) {
					return 1;
				}
				double d1 = n1.doubleValue();
				double d2 = n2.doubleValue();
				if (org.jfree.data.KeyedValueComparator.this.order.equals(org.jfree.chart.util.SortOrder.ASCENDING)) {
					if (d1 > d2) {
						result = 1;
					}else
						if (d1 < d2) {
							result = -1;
						}else {
							result = 0;
						}
					
				}else
					if (org.jfree.data.KeyedValueComparator.this.order.equals(org.jfree.chart.util.SortOrder.DESCENDING)) {
						if (d1 > d2) {
							result = -1;
						}else
							if (d1 < d2) {
								result = 1;
							}else {
								result = 0;
							}
						
					}else {
						throw new java.lang.IllegalArgumentException("Unrecognised sort order.");
					}
				
			}else {
				throw new java.lang.IllegalArgumentException("Unrecognised type.");
			}
		
		return result;
	}
}

