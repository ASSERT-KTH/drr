

package org.jfree.chart.util;


public final class TableOrder implements java.io.Serializable {
	private static final long serialVersionUID = 525193294068177057L;

	public static final org.jfree.chart.util.TableOrder BY_ROW = new org.jfree.chart.util.TableOrder("TableOrder.BY_ROW");

	public static final org.jfree.chart.util.TableOrder BY_COLUMN = new org.jfree.chart.util.TableOrder("TableOrder.BY_COLUMN");

	private java.lang.String name;

	private TableOrder(java.lang.String name) {
		org.jfree.chart.util.TableOrder.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.TableOrder.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.TableOrder.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.TableOrder)) {
			return false;
		}
		org.jfree.chart.util.TableOrder that = ((org.jfree.chart.util.TableOrder) (obj));
		if (!(org.jfree.chart.util.TableOrder.this.name.equals(that.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.TableOrder.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.TableOrder.this.equals(org.jfree.chart.util.TableOrder.BY_ROW)) {
			return org.jfree.chart.util.TableOrder.BY_ROW;
		}else
			if (org.jfree.chart.util.TableOrder.this.equals(org.jfree.chart.util.TableOrder.BY_COLUMN)) {
				return org.jfree.chart.util.TableOrder.BY_COLUMN;
			}
		
		return null;
	}
}

