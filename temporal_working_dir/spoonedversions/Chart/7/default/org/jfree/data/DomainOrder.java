

package org.jfree.data;


public final class DomainOrder implements java.io.Serializable {
	private static final long serialVersionUID = 4902774943512072627L;

	public static final org.jfree.data.DomainOrder NONE = new org.jfree.data.DomainOrder("DomainOrder.NONE");

	public static final org.jfree.data.DomainOrder ASCENDING = new org.jfree.data.DomainOrder("DomainOrder.ASCENDING");

	public static final org.jfree.data.DomainOrder DESCENDING = new org.jfree.data.DomainOrder("DomainOrder.DESCENDING");

	private java.lang.String name;

	private DomainOrder(java.lang.String name) {
		org.jfree.data.DomainOrder.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.DomainOrder.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.DomainOrder.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.DomainOrder)) {
			return false;
		}
		org.jfree.data.DomainOrder that = ((org.jfree.data.DomainOrder) (obj));
		if (!(org.jfree.data.DomainOrder.this.name.equals(that.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.DomainOrder.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.data.DomainOrder.this.equals(org.jfree.data.DomainOrder.ASCENDING)) {
			return org.jfree.data.DomainOrder.ASCENDING;
		}else
			if (org.jfree.data.DomainOrder.this.equals(org.jfree.data.DomainOrder.DESCENDING)) {
				return org.jfree.data.DomainOrder.DESCENDING;
			}else
				if (org.jfree.data.DomainOrder.this.equals(org.jfree.data.DomainOrder.NONE)) {
					return org.jfree.data.DomainOrder.NONE;
				}
			
		
		return null;
	}
}

