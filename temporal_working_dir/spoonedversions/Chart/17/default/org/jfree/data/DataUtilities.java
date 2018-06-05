

package org.jfree.data;


public abstract class DataUtilities {
	public static double calculateColumnTotal(org.jfree.data.Values2D data, int column) {
		double total = 0.0;
		int rowCount = data.getRowCount();
		for (int r = 0; r < rowCount; r++) {
			java.lang.Number n = data.getValue(r, column);
			if (n != null) {
				total += n.doubleValue();
			}
		}
		return total;
	}

	public static double calculateRowTotal(org.jfree.data.Values2D data, int row) {
		double total = 0.0;
		int columnCount = data.getColumnCount();
		for (int c = 0; c < columnCount; c++) {
			java.lang.Number n = data.getValue(row, c);
			if (n != null) {
				total += n.doubleValue();
			}
		}
		return total;
	}

	public static java.lang.Number[] createNumberArray(double[] data) {
		if (data == null) {
			throw new java.lang.IllegalArgumentException("Null 'data' argument.");
		}
		java.lang.Number[] result = new java.lang.Number[data.length];
		for (int i = 0; i < (data.length); i++) {
			result[i] = new java.lang.Double(data[i]);
		}
		return result;
	}

	public static java.lang.Number[][] createNumberArray2D(double[][] data) {
		if (data == null) {
			throw new java.lang.IllegalArgumentException("Null 'data' argument.");
		}
		int l1 = data.length;
		java.lang.Number[][] result = new java.lang.Number[l1][];
		for (int i = 0; i < l1; i++) {
			result[i] = org.jfree.data.DataUtilities.createNumberArray(data[i]);
		}
		return result;
	}

	public static org.jfree.data.KeyedValues getCumulativePercentages(org.jfree.data.KeyedValues data) {
		if (data == null) {
			throw new java.lang.IllegalArgumentException("Null 'data' argument.");
		}
		org.jfree.data.DefaultKeyedValues result = new org.jfree.data.DefaultKeyedValues();
		double total = 0.0;
		for (int i = 0; i < (data.getItemCount()); i++) {
			java.lang.Number v = data.getValue(i);
			if (v != null) {
				total = total + (v.doubleValue());
			}
		}
		double runningTotal = 0.0;
		for (int i = 0; i < (data.getItemCount()); i++) {
			java.lang.Number v = data.getValue(i);
			if (v != null) {
				runningTotal = runningTotal + (v.doubleValue());
			}
			result.addValue(data.getKey(i), new java.lang.Double((runningTotal / total)));
		}
		return result;
	}
}

