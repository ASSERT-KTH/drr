

package org.jfree.data.category;


public class DefaultIntervalCategoryDataset extends org.jfree.data.general.AbstractSeriesDataset implements org.jfree.data.category.IntervalCategoryDataset {
	private java.lang.Comparable[] seriesKeys;

	private java.lang.Comparable[] categoryKeys;

	private java.lang.Number[][] startData;

	private java.lang.Number[][] endData;

	public DefaultIntervalCategoryDataset(double[][] starts, double[][] ends) {
		this(org.jfree.data.DataUtilities.createNumberArray2D(starts), org.jfree.data.DataUtilities.createNumberArray2D(ends));
	}

	public DefaultIntervalCategoryDataset(java.lang.Number[][] starts, java.lang.Number[][] ends) {
		this(null, null, starts, ends);
	}

	public DefaultIntervalCategoryDataset(java.lang.String[] seriesNames, java.lang.Number[][] starts, java.lang.Number[][] ends) {
		this(seriesNames, null, starts, ends);
	}

	public DefaultIntervalCategoryDataset(java.lang.Comparable[] seriesKeys, java.lang.Comparable[] categoryKeys, java.lang.Number[][] starts, java.lang.Number[][] ends) {
		org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData = starts;
		org.jfree.data.category.DefaultIntervalCategoryDataset.this.endData = ends;
		if ((starts != null) && (ends != null)) {
			java.lang.String baseName = "org.jfree.data.resources.DataPackageResources";
			java.util.ResourceBundle resources = org.jfree.chart.util.ResourceBundleWrapper.getBundle(baseName);
			int seriesCount = starts.length;
			if (seriesCount != (ends.length)) {
				java.lang.String errMsg = "DefaultIntervalCategoryDataset: the number " + (("of series in the start value dataset does " + "not match the number of series in the end ") + "value dataset.");
				throw new java.lang.IllegalArgumentException(errMsg);
			}
			if (seriesCount > 0) {
				if (seriesKeys != null) {
					if ((seriesKeys.length) != seriesCount) {
						throw new java.lang.IllegalArgumentException(("The number of series keys does not " + "match the number of series in the data."));
					}
					org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys = seriesKeys;
				}else {
					java.lang.String prefix = (resources.getString("series.default-prefix")) + " ";
					org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys = generateKeys(seriesCount, prefix);
				}
				int categoryCount = starts[0].length;
				if (categoryCount != (ends[0].length)) {
					java.lang.String errMsg = "DefaultIntervalCategoryDataset: the " + (("number of categories in the start value " + "dataset does not match the number of ") + "categories in the end value dataset.");
					throw new java.lang.IllegalArgumentException(errMsg);
				}
				if (categoryKeys != null) {
					if ((categoryKeys.length) != categoryCount) {
						throw new java.lang.IllegalArgumentException(("The number of category keys does not match " + "the number of categories in the data."));
					}
					org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys = categoryKeys;
				}else {
					java.lang.String prefix = (resources.getString("categories.default-prefix")) + " ";
					org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys = generateKeys(categoryCount, prefix);
				}
			}else {
				org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys = new java.lang.Comparable[0];
				org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys = new java.lang.Comparable[0];
			}
		}
	}

	public int getSeriesCount() {
		int result = 0;
		if ((org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData) != null) {
			result = org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData.length;
		}
		return result;
	}

	public int getSeriesIndex(java.lang.Comparable seriesKey) {
		int result = -1;
		for (int i = 0; i < (org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys.length); i++) {
			if (seriesKey.equals(org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys[i])) {
				result = i;
				break;
			}
		}
		return result;
	}

	public java.lang.Comparable getSeriesKey(int series) {
		if ((series >= (getSeriesCount())) || (series < 0)) {
			throw new java.lang.IllegalArgumentException(("No such series : " + series));
		}
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys[series];
	}

	public void setSeriesKeys(java.lang.Comparable[] seriesKeys) {
		if (seriesKeys == null) {
			throw new java.lang.IllegalArgumentException("Null 'seriesKeys' argument.");
		}
		if ((seriesKeys.length) != (getSeriesCount())) {
			throw new java.lang.IllegalArgumentException("The number of series keys does not match the data.");
		}
		org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys = seriesKeys;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getCategoryCount() {
		int result = 0;
		if ((org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData) != null) {
			if ((getSeriesCount()) > 0) {
				result = org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData[0].length;
			}
		}
		return result;
	}

	public java.util.List getColumnKeys() {
		if ((org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys) == null) {
			return new java.util.ArrayList();
		}else {
			return java.util.Collections.unmodifiableList(java.util.Arrays.asList(org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys));
		}
	}

	public void setCategoryKeys(java.lang.Comparable[] categoryKeys) {
		if (categoryKeys == null) {
			throw new java.lang.IllegalArgumentException("Null 'categoryKeys' argument.");
		}
		if ((categoryKeys.length) != (getCategoryCount())) {
			throw new java.lang.IllegalArgumentException("The number of categories does not match the data.");
		}
		for (int i = 0; i < (categoryKeys.length); i++) {
			if ((categoryKeys[i]) == null) {
				throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.setCategoryKeys(): " + "null category not permitted."));
			}
		}
		org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys = categoryKeys;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public java.lang.Number getValue(java.lang.Comparable series, java.lang.Comparable category) {
		int seriesIndex = getSeriesIndex(series);
		if (seriesIndex < 0) {
			throw new org.jfree.data.UnknownKeyException("Unknown 'series' key.");
		}
		int itemIndex = getColumnIndex(category);
		if (itemIndex < 0) {
			throw new org.jfree.data.UnknownKeyException("Unknown 'category' key.");
		}
		return getValue(seriesIndex, itemIndex);
	}

	public java.lang.Number getValue(int series, int category) {
		return getEndValue(series, category);
	}

	public java.lang.Number getStartValue(java.lang.Comparable series, java.lang.Comparable category) {
		int seriesIndex = getSeriesIndex(series);
		if (seriesIndex < 0) {
			throw new org.jfree.data.UnknownKeyException("Unknown 'series' key.");
		}
		int itemIndex = getColumnIndex(category);
		if (itemIndex < 0) {
			throw new org.jfree.data.UnknownKeyException("Unknown 'category' key.");
		}
		return getStartValue(seriesIndex, itemIndex);
	}

	public java.lang.Number getStartValue(int series, int category) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.getValue(): " + "series index out of range."));
		}
		if ((category < 0) || (category >= (getCategoryCount()))) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.getValue(): " + "category index out of range."));
		}
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData[series][category];
	}

	public java.lang.Number getEndValue(java.lang.Comparable series, java.lang.Comparable category) {
		int seriesIndex = getSeriesIndex(series);
		if (seriesIndex < 0) {
			throw new org.jfree.data.UnknownKeyException("Unknown 'series' key.");
		}
		int itemIndex = getColumnIndex(category);
		if (itemIndex < 0) {
			throw new org.jfree.data.UnknownKeyException("Unknown 'category' key.");
		}
		return getEndValue(seriesIndex, itemIndex);
	}

	public java.lang.Number getEndValue(int series, int category) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.getValue(): " + "series index out of range."));
		}
		if ((category < 0) || (category >= (getCategoryCount()))) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.getValue(): " + "category index out of range."));
		}
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.endData[series][category];
	}

	public void setStartValue(int series, java.lang.Comparable category, java.lang.Number value) {
		if ((series < 0) || (series > ((getSeriesCount()) - 1))) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.setValue: " + "series outside valid range."));
		}
		int categoryIndex = getCategoryIndex(category);
		if (categoryIndex < 0) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.setValue: " + "unrecognised category."));
		}
		org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData[series][categoryIndex] = value;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void setEndValue(int series, java.lang.Comparable category, java.lang.Number value) {
		if ((series < 0) || (series > ((getSeriesCount()) - 1))) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.setValue: " + "series outside valid range."));
		}
		int categoryIndex = getCategoryIndex(category);
		if (categoryIndex < 0) {
			throw new java.lang.IllegalArgumentException(("DefaultIntervalCategoryDataset.setValue: " + "unrecognised category."));
		}
		org.jfree.data.category.DefaultIntervalCategoryDataset.this.endData[series][categoryIndex] = value;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getCategoryIndex(java.lang.Comparable category) {
		int result = -1;
		for (int i = 0; i < (org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys.length); i++) {
			if (category.equals(org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys[i])) {
				result = i;
				break;
			}
		}
		return result;
	}

	private java.lang.Comparable[] generateKeys(int count, java.lang.String prefix) {
		java.lang.Comparable[] result = new java.lang.Comparable[count];
		java.lang.String name;
		for (int i = 0; i < count; i++) {
			name = prefix + (i + 1);
			result[i] = name;
		}
		return result;
	}

	public java.lang.Comparable getColumnKey(int column) {
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys[column];
	}

	public int getColumnIndex(java.lang.Comparable columnKey) {
		if (columnKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'columnKey' argument.");
		}
		return getCategoryIndex(columnKey);
	}

	public int getRowIndex(java.lang.Comparable rowKey) {
		return getSeriesIndex(rowKey);
	}

	public java.util.List getRowKeys() {
		if ((org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys) == null) {
			return new java.util.ArrayList();
		}else {
			return java.util.Collections.unmodifiableList(java.util.Arrays.asList(org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys));
		}
	}

	public java.lang.Comparable getRowKey(int row) {
		if ((row >= (getRowCount())) || (row < 0)) {
			throw new java.lang.IllegalArgumentException("The 'row' argument is out of bounds.");
		}
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys[row];
	}

	public int getColumnCount() {
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys.length;
	}

	public int getRowCount() {
		return org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys.length;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.category.DefaultIntervalCategoryDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.category.DefaultIntervalCategoryDataset)) {
			return false;
		}
		org.jfree.data.category.DefaultIntervalCategoryDataset that = ((org.jfree.data.category.DefaultIntervalCategoryDataset) (obj));
		if (!(java.util.Arrays.equals(org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys, that.seriesKeys))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys, that.categoryKeys))) {
			return false;
		}
		if (!(org.jfree.data.category.DefaultIntervalCategoryDataset.equal(org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData, that.startData))) {
			return false;
		}
		if (!(org.jfree.data.category.DefaultIntervalCategoryDataset.equal(org.jfree.data.category.DefaultIntervalCategoryDataset.this.endData, that.endData))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.category.DefaultIntervalCategoryDataset clone = ((org.jfree.data.category.DefaultIntervalCategoryDataset) (super.clone()));
		clone.categoryKeys = ((java.lang.Comparable[]) (org.jfree.data.category.DefaultIntervalCategoryDataset.this.categoryKeys.clone()));
		clone.seriesKeys = ((java.lang.Comparable[]) (org.jfree.data.category.DefaultIntervalCategoryDataset.this.seriesKeys.clone()));
		clone.startData = org.jfree.data.category.DefaultIntervalCategoryDataset.clone(org.jfree.data.category.DefaultIntervalCategoryDataset.this.startData);
		clone.endData = org.jfree.data.category.DefaultIntervalCategoryDataset.clone(org.jfree.data.category.DefaultIntervalCategoryDataset.this.endData);
		return clone;
	}

	private static boolean equal(java.lang.Number[][] array1, java.lang.Number[][] array2) {
		if (array1 == null) {
			return array2 == null;
		}
		if (array2 == null) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if (!(java.util.Arrays.equals(array1[i], array2[i]))) {
				return false;
			}
		}
		return true;
	}

	private static java.lang.Number[][] clone(java.lang.Number[][] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("Null 'array' argument.");
		}
		java.lang.Number[][] result = new java.lang.Number[array.length][];
		for (int i = 0; i < (array.length); i++) {
			java.lang.Number[] child = array[i];
			java.lang.Number[] copychild = new java.lang.Number[child.length];
			java.lang.System.arraycopy(child, 0, copychild, 0, child.length);
			result[i] = copychild;
		}
		return result;
	}
}

