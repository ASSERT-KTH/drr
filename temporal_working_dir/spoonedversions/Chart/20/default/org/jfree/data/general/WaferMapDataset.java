

package org.jfree.data.general;


public class WaferMapDataset extends org.jfree.data.general.AbstractDataset {
	private org.jfree.data.DefaultKeyedValues2D data;

	private int maxChipX;

	private int maxChipY;

	private double chipSpace;

	private java.lang.Double maxValue;

	private java.lang.Double minValue;

	private static final double DEFAULT_CHIP_SPACE = 1.0;

	public WaferMapDataset(int maxChipX, int maxChipY) {
		this(maxChipX, maxChipY, null);
	}

	public WaferMapDataset(int maxChipX, int maxChipY, java.lang.Number chipSpace) {
		org.jfree.data.general.WaferMapDataset.this.maxValue = new java.lang.Double(java.lang.Double.NEGATIVE_INFINITY);
		org.jfree.data.general.WaferMapDataset.this.minValue = new java.lang.Double(java.lang.Double.POSITIVE_INFINITY);
		org.jfree.data.general.WaferMapDataset.this.data = new org.jfree.data.DefaultKeyedValues2D();
		org.jfree.data.general.WaferMapDataset.this.maxChipX = maxChipX;
		org.jfree.data.general.WaferMapDataset.this.maxChipY = maxChipY;
		if (chipSpace == null) {
			org.jfree.data.general.WaferMapDataset.this.chipSpace = org.jfree.data.general.WaferMapDataset.DEFAULT_CHIP_SPACE;
		}else {
			org.jfree.data.general.WaferMapDataset.this.chipSpace = chipSpace.doubleValue();
		}
	}

	public void addValue(java.lang.Number value, java.lang.Comparable chipx, java.lang.Comparable chipy) {
		setValue(value, chipx, chipy);
	}

	public void addValue(int v, int x, int y) {
		setValue(new java.lang.Double(v), new java.lang.Integer(x), new java.lang.Integer(y));
	}

	public void setValue(java.lang.Number value, java.lang.Comparable chipx, java.lang.Comparable chipy) {
		org.jfree.data.general.WaferMapDataset.this.data.setValue(value, chipx, chipy);
		if (isMaxValue(value)) {
			org.jfree.data.general.WaferMapDataset.this.maxValue = ((java.lang.Double) (value));
		}
		if (isMinValue(value)) {
			org.jfree.data.general.WaferMapDataset.this.minValue = ((java.lang.Double) (value));
		}
	}

	public int getUniqueValueCount() {
		return getUniqueValues().size();
	}

	public java.util.Set getUniqueValues() {
		java.util.Set unique = new java.util.TreeSet();
		for (int r = 0; r < (org.jfree.data.general.WaferMapDataset.this.data.getRowCount()); r++) {
			for (int c = 0; c < (org.jfree.data.general.WaferMapDataset.this.data.getColumnCount()); c++) {
				java.lang.Number value = org.jfree.data.general.WaferMapDataset.this.data.getValue(r, c);
				if (value != null) {
					unique.add(value);
				}
			}
		}
		return unique;
	}

	public java.lang.Number getChipValue(int chipx, int chipy) {
		return getChipValue(new java.lang.Integer(chipx), new java.lang.Integer(chipy));
	}

	public java.lang.Number getChipValue(java.lang.Comparable chipx, java.lang.Comparable chipy) {
		int rowIndex = org.jfree.data.general.WaferMapDataset.this.data.getRowIndex(chipx);
		if (rowIndex < 0) {
			return null;
		}
		int colIndex = org.jfree.data.general.WaferMapDataset.this.data.getColumnIndex(chipy);
		if (colIndex < 0) {
			return null;
		}
		return org.jfree.data.general.WaferMapDataset.this.data.getValue(rowIndex, colIndex);
	}

	public boolean isMaxValue(java.lang.Number check) {
		if ((check.doubleValue()) > (org.jfree.data.general.WaferMapDataset.this.maxValue.doubleValue())) {
			return true;
		}
		return false;
	}

	public boolean isMinValue(java.lang.Number check) {
		if ((check.doubleValue()) < (org.jfree.data.general.WaferMapDataset.this.minValue.doubleValue())) {
			return true;
		}
		return false;
	}

	public java.lang.Number getMaxValue() {
		return org.jfree.data.general.WaferMapDataset.this.maxValue;
	}

	public java.lang.Number getMinValue() {
		return org.jfree.data.general.WaferMapDataset.this.minValue;
	}

	public int getMaxChipX() {
		return org.jfree.data.general.WaferMapDataset.this.maxChipX;
	}

	public void setMaxChipX(int maxChipX) {
		org.jfree.data.general.WaferMapDataset.this.maxChipX = maxChipX;
	}

	public int getMaxChipY() {
		return org.jfree.data.general.WaferMapDataset.this.maxChipY;
	}

	public void setMaxChipY(int maxChipY) {
		org.jfree.data.general.WaferMapDataset.this.maxChipY = maxChipY;
	}

	public double getChipSpace() {
		return org.jfree.data.general.WaferMapDataset.this.chipSpace;
	}

	public void setChipSpace(double space) {
		org.jfree.data.general.WaferMapDataset.this.chipSpace = space;
	}
}

