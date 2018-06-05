

package org.jfree.data;


public class KeyedObjectComparator implements java.util.Comparator {
	private org.jfree.data.KeyedObjectComparatorType type;

	private org.jfree.chart.util.SortOrder order;

	public KeyedObjectComparator(org.jfree.data.KeyedObjectComparatorType type, org.jfree.chart.util.SortOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.data.KeyedObjectComparator.this.type = type;
		org.jfree.data.KeyedObjectComparator.this.order = order;
	}

	public org.jfree.data.KeyedObjectComparatorType getType() {
		return org.jfree.data.KeyedObjectComparator.this.type;
	}

	public org.jfree.chart.util.SortOrder getOrder() {
		return org.jfree.data.KeyedObjectComparator.this.order;
	}

	public int compare(java.lang.Object o1, java.lang.Object o2) {
		if (o2 == null) {
			return -1;
		}
		if (o1 == null) {
			return 1;
		}
		org.jfree.data.KeyedObject ko1 = ((org.jfree.data.KeyedObject) (o1));
		org.jfree.data.KeyedObject ko2 = ((org.jfree.data.KeyedObject) (o2));
		if ((org.jfree.data.KeyedObjectComparator.this.type) == (org.jfree.data.KeyedObjectComparatorType.BY_KEY)) {
			if (org.jfree.data.KeyedObjectComparator.this.order.equals(org.jfree.chart.util.SortOrder.ASCENDING)) {
				return ko1.getKey().compareTo(ko2.getKey());
			}else
				if (org.jfree.data.KeyedObjectComparator.this.order.equals(org.jfree.chart.util.SortOrder.DESCENDING)) {
					return ko2.getKey().compareTo(ko1.getKey());
				}else {
					throw new java.lang.IllegalArgumentException("Unrecognised sort order.");
				}
			
		}else
			if ((org.jfree.data.KeyedObjectComparator.this.type) == (org.jfree.data.KeyedObjectComparatorType.BY_VALUE)) {
				java.lang.Object n1 = ko1.getObject();
				java.lang.Object n2 = ko2.getObject();
				java.lang.Comparable c1 = "FALLBACK";
				if (n1 instanceof java.lang.Comparable) {
					c1 = ((java.lang.Comparable) (n1));
				}
				java.lang.Comparable c2 = "FALLBACK";
				if (n2 instanceof java.lang.Comparable) {
					c2 = ((java.lang.Comparable) (n2));
				}
				if (n2 == null) {
					return -1;
				}
				if (n1 == null) {
					return 1;
				}
				if (org.jfree.data.KeyedObjectComparator.this.order.equals(org.jfree.chart.util.SortOrder.ASCENDING)) {
					return c1.compareTo(c2);
				}else
					if (org.jfree.data.KeyedObjectComparator.this.order.equals(org.jfree.chart.util.SortOrder.DESCENDING)) {
						return c2.compareTo(c1);
					}else {
						throw new java.lang.IllegalArgumentException("Unrecognised sort order.");
					}
				
			}else {
				throw new java.lang.IllegalArgumentException("Unrecognised type.");
			}
		
	}
}

