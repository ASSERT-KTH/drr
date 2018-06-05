

package org.jfree.data.general;


public final class DatasetUtilities {
	private DatasetUtilities() {
	}

	public static double calculatePieDatasetTotal(org.jfree.data.general.PieDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.util.List keys = dataset.getKeys();
		double totalValue = 0;
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable current = ((java.lang.Comparable) (iterator.next()));
			if (current != null) {
				java.lang.Number value = dataset.getValue(current);
				double v = 0.0;
				if (value != null) {
					v = value.doubleValue();
				}
				if (v > 0) {
					totalValue = totalValue + v;
				}
			}
		} 
		return totalValue;
	}

	public static org.jfree.data.general.PieDataset createPieDatasetForRow(org.jfree.data.category.CategoryDataset dataset, java.lang.Comparable rowKey) {
		int row = dataset.getRowIndex(rowKey);
		return org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(dataset, row);
	}

	public static org.jfree.data.general.PieDataset createPieDatasetForRow(org.jfree.data.category.CategoryDataset dataset, int row) {
		org.jfree.data.general.DefaultPieDataset result = new org.jfree.data.general.DefaultPieDataset();
		int columnCount = dataset.getColumnCount();
		for (int current = 0; current < columnCount; current++) {
			java.lang.Comparable columnKey = dataset.getColumnKey(current);
			result.setValue(columnKey, dataset.getValue(row, current));
		}
		return result;
	}

	public static org.jfree.data.general.PieDataset createPieDatasetForColumn(org.jfree.data.category.CategoryDataset dataset, java.lang.Comparable columnKey) {
		int column = dataset.getColumnIndex(columnKey);
		return org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(dataset, column);
	}

	public static org.jfree.data.general.PieDataset createPieDatasetForColumn(org.jfree.data.category.CategoryDataset dataset, int column) {
		org.jfree.data.general.DefaultPieDataset result = new org.jfree.data.general.DefaultPieDataset();
		int rowCount = dataset.getRowCount();
		for (int i = 0; i < rowCount; i++) {
			java.lang.Comparable rowKey = dataset.getRowKey(i);
			result.setValue(rowKey, dataset.getValue(i, column));
		}
		return result;
	}

	public static org.jfree.data.general.PieDataset createConsolidatedPieDataset(org.jfree.data.general.PieDataset source, java.lang.Comparable key, double minimumPercent) {
		return org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(source, key, minimumPercent, 2);
	}

	public static org.jfree.data.general.PieDataset createConsolidatedPieDataset(org.jfree.data.general.PieDataset source, java.lang.Comparable key, double minimumPercent, int minItems) {
		org.jfree.data.general.DefaultPieDataset result = new org.jfree.data.general.DefaultPieDataset();
		double total = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(source);
		java.util.List keys = source.getKeys();
		java.util.ArrayList otherKeys = new java.util.ArrayList();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable currentKey = ((java.lang.Comparable) (iterator.next()));
			java.lang.Number dataValue = source.getValue(currentKey);
			if (dataValue != null) {
				double value = dataValue.doubleValue();
				if ((value / total) < minimumPercent) {
					otherKeys.add(currentKey);
				}
			}
		} 
		iterator = keys.iterator();
		double otherValue = 0;
		while (iterator.hasNext()) {
			java.lang.Comparable currentKey = ((java.lang.Comparable) (iterator.next()));
			java.lang.Number dataValue = source.getValue(currentKey);
			if (dataValue != null) {
				if ((otherKeys.contains(currentKey)) && ((otherKeys.size()) >= minItems)) {
					otherValue += dataValue.doubleValue();
				}else {
					result.setValue(currentKey, dataValue);
				}
			}
		} 
		if ((otherKeys.size()) >= minItems) {
			result.setValue(key, otherValue);
		}
		return result;
	}

	public static org.jfree.data.category.CategoryDataset createCategoryDataset(java.lang.String rowKeyPrefix, java.lang.String columnKeyPrefix, double[][] data) {
		org.jfree.data.category.DefaultCategoryDataset result = new org.jfree.data.category.DefaultCategoryDataset();
		for (int r = 0; r < (data.length); r++) {
			java.lang.String rowKey = rowKeyPrefix + (r + 1);
			for (int c = 0; c < (data[r].length); c++) {
				java.lang.String columnKey = columnKeyPrefix + (c + 1);
				result.addValue(new java.lang.Double(data[r][c]), rowKey, columnKey);
			}
		}
		return result;
	}

	public static org.jfree.data.category.CategoryDataset createCategoryDataset(java.lang.String rowKeyPrefix, java.lang.String columnKeyPrefix, java.lang.Number[][] data) {
		org.jfree.data.category.DefaultCategoryDataset result = new org.jfree.data.category.DefaultCategoryDataset();
		for (int r = 0; r < (data.length); r++) {
			java.lang.String rowKey = rowKeyPrefix + (r + 1);
			for (int c = 0; c < (data[r].length); c++) {
				java.lang.String columnKey = columnKeyPrefix + (c + 1);
				result.addValue(data[r][c], rowKey, columnKey);
			}
		}
		return result;
	}

	public static org.jfree.data.category.CategoryDataset createCategoryDataset(java.lang.Comparable[] rowKeys, java.lang.Comparable[] columnKeys, double[][] data) {
		if (rowKeys == null) {
			throw new java.lang.IllegalArgumentException("Null 'rowKeys' argument.");
		}
		if (columnKeys == null) {
			throw new java.lang.IllegalArgumentException("Null 'columnKeys' argument.");
		}
		if (org.jfree.chart.util.ArrayUtilities.hasDuplicateItems(rowKeys)) {
			throw new java.lang.IllegalArgumentException("Duplicate items in 'rowKeys'.");
		}
		if (org.jfree.chart.util.ArrayUtilities.hasDuplicateItems(columnKeys)) {
			throw new java.lang.IllegalArgumentException("Duplicate items in 'columnKeys'.");
		}
		if ((rowKeys.length) != (data.length)) {
			throw new java.lang.IllegalArgumentException(("The number of row keys does not match the number of rows in " + "the data array."));
		}
		int columnCount = 0;
		for (int r = 0; r < (data.length); r++) {
			columnCount = java.lang.Math.max(columnCount, data[r].length);
		}
		if ((columnKeys.length) != columnCount) {
			throw new java.lang.IllegalArgumentException(("The number of column keys does not match the number of " + "columns in the data array."));
		}
		org.jfree.data.category.DefaultCategoryDataset result = new org.jfree.data.category.DefaultCategoryDataset();
		for (int r = 0; r < (data.length); r++) {
			java.lang.Comparable rowKey = rowKeys[r];
			for (int c = 0; c < (data[r].length); c++) {
				java.lang.Comparable columnKey = columnKeys[c];
				result.addValue(new java.lang.Double(data[r][c]), rowKey, columnKey);
			}
		}
		return result;
	}

	public static org.jfree.data.category.CategoryDataset createCategoryDataset(java.lang.Comparable rowKey, org.jfree.data.KeyedValues rowData) {
		if (rowKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'rowKey' argument.");
		}
		if (rowData == null) {
			throw new java.lang.IllegalArgumentException("Null 'rowData' argument.");
		}
		org.jfree.data.category.DefaultCategoryDataset result = new org.jfree.data.category.DefaultCategoryDataset();
		for (int i = 0; i < (rowData.getItemCount()); i++) {
			result.addValue(rowData.getValue(i), rowKey, rowData.getKey(i));
		}
		return result;
	}

	public static org.jfree.data.xy.XYDataset sampleFunction2D(org.jfree.data.function.Function2D f, double start, double end, int samples, java.lang.Comparable seriesKey) {
		if (f == null) {
			throw new java.lang.IllegalArgumentException("Null 'f' argument.");
		}
		if (seriesKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'seriesKey' argument.");
		}
		if (start >= end) {
			throw new java.lang.IllegalArgumentException("Requires 'start' < 'end'.");
		}
		if (samples < 2) {
			throw new java.lang.IllegalArgumentException("Requires 'samples' > 1");
		}
		org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries(seriesKey);
		double step = (end - start) / (samples - 1);
		for (int i = 0; i < samples; i++) {
			double x = start + (step * i);
			series.add(x, f.getValue(x));
		}
		org.jfree.data.xy.XYSeriesCollection collection = new org.jfree.data.xy.XYSeriesCollection(series);
		return collection;
	}

	public static boolean isEmptyOrNull(org.jfree.data.general.PieDataset dataset) {
		if (dataset == null) {
			return true;
		}
		int itemCount = dataset.getItemCount();
		if (itemCount == 0) {
			return true;
		}
		for (int item = 0; item < itemCount; item++) {
			java.lang.Number y = dataset.getValue(item);
			if (y != null) {
				double yy = y.doubleValue();
				if (yy > 0.0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isEmptyOrNull(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			return true;
		}
		int rowCount = dataset.getRowCount();
		int columnCount = dataset.getColumnCount();
		if ((rowCount == 0) || (columnCount == 0)) {
			return true;
		}
		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				if ((dataset.getValue(r, c)) != null) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isEmptyOrNull(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			for (int s = 0; s < (dataset.getSeriesCount()); s++) {
				if ((dataset.getItemCount(s)) > 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.findDomainBounds(dataset, true);
	}

	public static org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset, boolean includeInterval) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.data.Range result = null;
		if (dataset instanceof org.jfree.data.DomainInfo) {
			org.jfree.data.DomainInfo info = ((org.jfree.data.DomainInfo) (dataset));
			result = info.getDomainBounds(includeInterval);
		}else {
			result = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(dataset, includeInterval);
		}
		return result;
	}

	public static org.jfree.data.Range iterateDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.iterateDomainBounds(dataset, true);
	}

	public static org.jfree.data.Range iterateDomainBounds(org.jfree.data.xy.XYDataset dataset, boolean includeInterval) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int seriesCount = dataset.getSeriesCount();
		double lvalue;
		double uvalue;
		if (includeInterval && (dataset instanceof org.jfree.data.xy.IntervalXYDataset)) {
			org.jfree.data.xy.IntervalXYDataset intervalXYData = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					lvalue = intervalXYData.getStartXValue(series, item);
					uvalue = intervalXYData.getEndXValue(series, item);
					minimum = java.lang.Math.min(minimum, lvalue);
					maximum = java.lang.Math.max(maximum, uvalue);
				}
			}
		}else {
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					lvalue = dataset.getXValue(series, item);
					uvalue = lvalue;
					minimum = java.lang.Math.min(minimum, lvalue);
					maximum = java.lang.Math.max(maximum, uvalue);
				}
			}
		}
		if (minimum > maximum) {
			return null;
		}else {
			return new org.jfree.data.Range(minimum, maximum);
		}
	}

	public static org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, true);
	}

	public static org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset, boolean includeInterval) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.data.Range result = null;
		if (dataset instanceof org.jfree.data.RangeInfo) {
			org.jfree.data.RangeInfo info = ((org.jfree.data.RangeInfo) (dataset));
			result = info.getRangeBounds(includeInterval);
		}else {
			result = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(dataset, includeInterval);
		}
		return result;
	}

	public static org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, true);
	}

	public static org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset, boolean includeInterval) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.data.Range result = null;
		if (dataset instanceof org.jfree.data.RangeInfo) {
			org.jfree.data.RangeInfo info = ((org.jfree.data.RangeInfo) (dataset));
			result = info.getRangeBounds(includeInterval);
		}else {
			result = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(dataset, includeInterval);
		}
		return result;
	}

	public static org.jfree.data.Range iterateRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.iterateRangeBounds(dataset, true);
	}

	public static org.jfree.data.Range iterateRangeBounds(org.jfree.data.category.CategoryDataset dataset, boolean includeInterval) {
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int rowCount = dataset.getRowCount();
		int columnCount = dataset.getColumnCount();
		if (includeInterval && (dataset instanceof org.jfree.data.category.IntervalCategoryDataset)) {
			org.jfree.data.category.IntervalCategoryDataset icd = ((org.jfree.data.category.IntervalCategoryDataset) (dataset));
			java.lang.Number lvalue;
			java.lang.Number uvalue;
			for (int row = 0; row < rowCount; row++) {
				for (int column = 0; column < columnCount; column++) {
					lvalue = icd.getStartValue(row, column);
					uvalue = icd.getEndValue(row, column);
					if (lvalue != null) {
						minimum = java.lang.Math.min(minimum, lvalue.doubleValue());
					}
					if (uvalue != null) {
						maximum = java.lang.Math.max(maximum, uvalue.doubleValue());
					}
				}
			}
		}else {
			for (int row = 0; row < rowCount; row++) {
				for (int column = 0; column < columnCount; column++) {
					java.lang.Number value = dataset.getValue(row, column);
					if (value != null) {
						double v = value.doubleValue();
						minimum = java.lang.Math.min(minimum, v);
						maximum = java.lang.Math.max(maximum, v);
					}
				}
			}
		}
		if (minimum == (java.lang.Double.POSITIVE_INFINITY)) {
			return null;
		}else {
			return new org.jfree.data.Range(minimum, maximum);
		}
	}

	public static org.jfree.data.Range iterateRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.iterateRangeBounds(dataset, true);
	}

	public static org.jfree.data.Range iterateRangeBounds(org.jfree.data.xy.XYDataset dataset, boolean includeInterval) {
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int seriesCount = dataset.getSeriesCount();
		if (includeInterval && (dataset instanceof org.jfree.data.xy.IntervalXYDataset)) {
			org.jfree.data.xy.IntervalXYDataset ixyd = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double lvalue = ixyd.getStartYValue(series, item);
					double uvalue = ixyd.getEndYValue(series, item);
					if (!(java.lang.Double.isNaN(lvalue))) {
						minimum = java.lang.Math.min(minimum, lvalue);
					}
					if (!(java.lang.Double.isNaN(uvalue))) {
						maximum = java.lang.Math.max(maximum, uvalue);
					}
				}
			}
		}else
			if (includeInterval && (dataset instanceof org.jfree.data.xy.OHLCDataset)) {
				org.jfree.data.xy.OHLCDataset ohlc = ((org.jfree.data.xy.OHLCDataset) (dataset));
				for (int series = 0; series < seriesCount; series++) {
					int itemCount = dataset.getItemCount(series);
					for (int item = 0; item < itemCount; item++) {
						double lvalue = ohlc.getLowValue(series, item);
						double uvalue = ohlc.getHighValue(series, item);
						if (!(java.lang.Double.isNaN(lvalue))) {
							minimum = java.lang.Math.min(minimum, lvalue);
						}
						if (!(java.lang.Double.isNaN(uvalue))) {
							maximum = java.lang.Math.max(maximum, uvalue);
						}
					}
				}
			}else {
				for (int series = 0; series < seriesCount; series++) {
					int itemCount = dataset.getItemCount(series);
					for (int item = 0; item < itemCount; item++) {
						double value = dataset.getYValue(series, item);
						if (!(java.lang.Double.isNaN(value))) {
							minimum = java.lang.Math.min(minimum, value);
							maximum = java.lang.Math.max(maximum, value);
						}
					}
				}
			}
		
		if (minimum == (java.lang.Double.POSITIVE_INFINITY)) {
			return null;
		}else {
			return new org.jfree.data.Range(minimum, maximum);
		}
	}

	public static java.lang.Number findMinimumDomainValue(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.lang.Number result = null;
		if (dataset instanceof org.jfree.data.DomainInfo) {
			org.jfree.data.DomainInfo info = ((org.jfree.data.DomainInfo) (dataset));
			return new java.lang.Double(info.getDomainLowerBound(true));
		}else {
			double minimum = java.lang.Double.POSITIVE_INFINITY;
			int seriesCount = dataset.getSeriesCount();
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double value;
					if (dataset instanceof org.jfree.data.xy.IntervalXYDataset) {
						org.jfree.data.xy.IntervalXYDataset intervalXYData = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
						value = intervalXYData.getStartXValue(series, item);
					}else {
						value = dataset.getXValue(series, item);
					}
					if (!(java.lang.Double.isNaN(value))) {
						minimum = java.lang.Math.min(minimum, value);
					}
				}
			}
			if (minimum == (java.lang.Double.POSITIVE_INFINITY)) {
				result = null;
			}else {
				result = new java.lang.Double(minimum);
			}
		}
		return result;
	}

	public static java.lang.Number findMaximumDomainValue(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.lang.Number result = null;
		if (dataset instanceof org.jfree.data.DomainInfo) {
			org.jfree.data.DomainInfo info = ((org.jfree.data.DomainInfo) (dataset));
			return new java.lang.Double(info.getDomainUpperBound(true));
		}else {
			double maximum = java.lang.Double.NEGATIVE_INFINITY;
			int seriesCount = dataset.getSeriesCount();
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double value;
					if (dataset instanceof org.jfree.data.xy.IntervalXYDataset) {
						org.jfree.data.xy.IntervalXYDataset intervalXYData = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
						value = intervalXYData.getEndXValue(series, item);
					}else {
						value = dataset.getXValue(series, item);
					}
					if (!(java.lang.Double.isNaN(value))) {
						maximum = java.lang.Math.max(maximum, value);
					}
				}
			}
			if (maximum == (java.lang.Double.NEGATIVE_INFINITY)) {
				result = null;
			}else {
				result = new java.lang.Double(maximum);
			}
		}
		return result;
	}

	public static java.lang.Number findMinimumRangeValue(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (dataset instanceof org.jfree.data.RangeInfo) {
			org.jfree.data.RangeInfo info = ((org.jfree.data.RangeInfo) (dataset));
			return new java.lang.Double(info.getRangeLowerBound(true));
		}else {
			double minimum = java.lang.Double.POSITIVE_INFINITY;
			int seriesCount = dataset.getRowCount();
			int itemCount = dataset.getColumnCount();
			for (int series = 0; series < seriesCount; series++) {
				for (int item = 0; item < itemCount; item++) {
					java.lang.Number value;
					if (dataset instanceof org.jfree.data.category.IntervalCategoryDataset) {
						org.jfree.data.category.IntervalCategoryDataset icd = ((org.jfree.data.category.IntervalCategoryDataset) (dataset));
						value = icd.getStartValue(series, item);
					}else {
						value = dataset.getValue(series, item);
					}
					if (value != null) {
						minimum = java.lang.Math.min(minimum, value.doubleValue());
					}
				}
			}
			if (minimum == (java.lang.Double.POSITIVE_INFINITY)) {
				return null;
			}else {
				return new java.lang.Double(minimum);
			}
		}
	}

	public static java.lang.Number findMinimumRangeValue(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (dataset instanceof org.jfree.data.RangeInfo) {
			org.jfree.data.RangeInfo info = ((org.jfree.data.RangeInfo) (dataset));
			return new java.lang.Double(info.getRangeLowerBound(true));
		}else {
			double minimum = java.lang.Double.POSITIVE_INFINITY;
			int seriesCount = dataset.getSeriesCount();
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double value;
					if (dataset instanceof org.jfree.data.xy.IntervalXYDataset) {
						org.jfree.data.xy.IntervalXYDataset intervalXYData = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
						value = intervalXYData.getStartYValue(series, item);
					}else
						if (dataset instanceof org.jfree.data.xy.OHLCDataset) {
							org.jfree.data.xy.OHLCDataset highLowData = ((org.jfree.data.xy.OHLCDataset) (dataset));
							value = highLowData.getLowValue(series, item);
						}else {
							value = dataset.getYValue(series, item);
						}
					
					if (!(java.lang.Double.isNaN(value))) {
						minimum = java.lang.Math.min(minimum, value);
					}
				}
			}
			if (minimum == (java.lang.Double.POSITIVE_INFINITY)) {
				return null;
			}else {
				return new java.lang.Double(minimum);
			}
		}
	}

	public static java.lang.Number findMaximumRangeValue(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (dataset instanceof org.jfree.data.RangeInfo) {
			org.jfree.data.RangeInfo info = ((org.jfree.data.RangeInfo) (dataset));
			return new java.lang.Double(info.getRangeUpperBound(true));
		}else {
			double maximum = java.lang.Double.NEGATIVE_INFINITY;
			int seriesCount = dataset.getRowCount();
			int itemCount = dataset.getColumnCount();
			for (int series = 0; series < seriesCount; series++) {
				for (int item = 0; item < itemCount; item++) {
					java.lang.Number value;
					if (dataset instanceof org.jfree.data.category.IntervalCategoryDataset) {
						org.jfree.data.category.IntervalCategoryDataset icd = ((org.jfree.data.category.IntervalCategoryDataset) (dataset));
						value = icd.getEndValue(series, item);
					}else {
						value = dataset.getValue(series, item);
					}
					if (value != null) {
						maximum = java.lang.Math.max(maximum, value.doubleValue());
					}
				}
			}
			if (maximum == (java.lang.Double.NEGATIVE_INFINITY)) {
				return null;
			}else {
				return new java.lang.Double(maximum);
			}
		}
	}

	public static java.lang.Number findMaximumRangeValue(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (dataset instanceof org.jfree.data.RangeInfo) {
			org.jfree.data.RangeInfo info = ((org.jfree.data.RangeInfo) (dataset));
			return new java.lang.Double(info.getRangeUpperBound(true));
		}else {
			double maximum = java.lang.Double.NEGATIVE_INFINITY;
			int seriesCount = dataset.getSeriesCount();
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double value;
					if (dataset instanceof org.jfree.data.xy.IntervalXYDataset) {
						org.jfree.data.xy.IntervalXYDataset intervalXYData = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
						value = intervalXYData.getEndYValue(series, item);
					}else
						if (dataset instanceof org.jfree.data.xy.OHLCDataset) {
							org.jfree.data.xy.OHLCDataset highLowData = ((org.jfree.data.xy.OHLCDataset) (dataset));
							value = highLowData.getHighValue(series, item);
						}else {
							value = dataset.getYValue(series, item);
						}
					
					if (!(java.lang.Double.isNaN(value))) {
						maximum = java.lang.Math.max(maximum, value);
					}
				}
			}
			if (maximum == (java.lang.Double.NEGATIVE_INFINITY)) {
				return null;
			}else {
				return new java.lang.Double(maximum);
			}
		}
	}

	public static org.jfree.data.Range findStackedRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(dataset, 0.0);
	}

	public static org.jfree.data.Range findStackedRangeBounds(org.jfree.data.category.CategoryDataset dataset, double base) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.data.Range result = null;
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int categoryCount = dataset.getColumnCount();
		for (int item = 0; item < categoryCount; item++) {
			double positive = base;
			double negative = base;
			int seriesCount = dataset.getRowCount();
			for (int series = 0; series < seriesCount; series++) {
				java.lang.Number number = dataset.getValue(series, item);
				if (number != null) {
					double value = number.doubleValue();
					if (value > 0.0) {
						positive = positive + value;
					}
					if (value < 0.0) {
						negative = negative + value;
					}
				}
			}
			minimum = java.lang.Math.min(minimum, negative);
			maximum = java.lang.Math.max(maximum, positive);
		}
		if (minimum <= maximum) {
			result = new org.jfree.data.Range(minimum, maximum);
		}
		return result;
	}

	public static org.jfree.data.Range findStackedRangeBounds(org.jfree.data.category.CategoryDataset dataset, org.jfree.data.KeyToGroupMap map) {
		org.jfree.data.Range result = null;
		if (dataset != null) {
			int[] groupIndex = new int[dataset.getRowCount()];
			for (int i = 0; i < (dataset.getRowCount()); i++) {
				groupIndex[i] = map.getGroupIndex(map.getGroup(dataset.getRowKey(i)));
			}
			int groupCount = map.getGroupCount();
			double[] minimum = new double[groupCount];
			double[] maximum = new double[groupCount];
			int categoryCount = dataset.getColumnCount();
			for (int item = 0; item < categoryCount; item++) {
				double[] positive = new double[groupCount];
				double[] negative = new double[groupCount];
				int seriesCount = dataset.getRowCount();
				for (int series = 0; series < seriesCount; series++) {
					java.lang.Number number = dataset.getValue(series, item);
					if (number != null) {
						double value = number.doubleValue();
						if (value > 0.0) {
							positive[groupIndex[series]] = (positive[groupIndex[series]]) + value;
						}
						if (value < 0.0) {
							negative[groupIndex[series]] = (negative[groupIndex[series]]) + value;
						}
					}
				}
				for (int g = 0; g < groupCount; g++) {
					minimum[g] = java.lang.Math.min(minimum[g], negative[g]);
					maximum[g] = java.lang.Math.max(maximum[g], positive[g]);
				}
			}
			for (int j = 0; j < groupCount; j++) {
				result = org.jfree.data.Range.combine(result, new org.jfree.data.Range(minimum[j], maximum[j]));
			}
		}
		return result;
	}

	public static java.lang.Number findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset dataset) {
		java.lang.Number result = null;
		if (dataset != null) {
			double minimum = 0.0;
			int categoryCount = dataset.getRowCount();
			for (int item = 0; item < categoryCount; item++) {
				double total = 0.0;
				int seriesCount = dataset.getColumnCount();
				for (int series = 0; series < seriesCount; series++) {
					java.lang.Number number = dataset.getValue(series, item);
					if (number != null) {
						double value = number.doubleValue();
						if (value < 0.0) {
							total = total + value;
						}
					}
				}
				minimum = java.lang.Math.min(minimum, total);
			}
			result = new java.lang.Double(minimum);
		}
		return result;
	}

	public static java.lang.Number findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset dataset) {
		java.lang.Number result = null;
		if (dataset != null) {
			double maximum = 0.0;
			int categoryCount = dataset.getColumnCount();
			for (int item = 0; item < categoryCount; item++) {
				double total = 0.0;
				int seriesCount = dataset.getRowCount();
				for (int series = 0; series < seriesCount; series++) {
					java.lang.Number number = dataset.getValue(series, item);
					if (number != null) {
						double value = number.doubleValue();
						if (value > 0.0) {
							total = total + value;
						}
					}
				}
				maximum = java.lang.Math.max(maximum, total);
			}
			result = new java.lang.Double(maximum);
		}
		return result;
	}

	public static org.jfree.data.Range findStackedRangeBounds(org.jfree.data.xy.TableXYDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(dataset, 0.0);
	}

	public static org.jfree.data.Range findStackedRangeBounds(org.jfree.data.xy.TableXYDataset dataset, double base) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		double minimum = base;
		double maximum = base;
		for (int itemNo = 0; itemNo < (dataset.getItemCount()); itemNo++) {
			double positive = base;
			double negative = base;
			int seriesCount = dataset.getSeriesCount();
			for (int seriesNo = 0; seriesNo < seriesCount; seriesNo++) {
				double y = dataset.getYValue(seriesNo, itemNo);
				if (!(java.lang.Double.isNaN(y))) {
					if (y > 0.0) {
						positive += y;
					}else {
						negative += y;
					}
				}
			}
			if (positive > maximum) {
				maximum = positive;
			}
			if (negative < minimum) {
				minimum = negative;
			}
		}
		if (minimum <= maximum) {
			return new org.jfree.data.Range(minimum, maximum);
		}else {
			return null;
		}
	}

	public static double calculateStackTotal(org.jfree.data.xy.TableXYDataset dataset, int item) {
		double total = 0.0;
		int seriesCount = dataset.getSeriesCount();
		for (int s = 0; s < seriesCount; s++) {
			double value = dataset.getYValue(s, item);
			if (!(java.lang.Double.isNaN(value))) {
				total = total + value;
			}
		}
		return total;
	}

	public static org.jfree.data.Range findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		boolean allItemsNull = true;
		double minimum = 0.0;
		double maximum = 0.0;
		for (int row = 0; row < (dataset.getRowCount()); row++) {
			double runningTotal = 0.0;
			for (int column = 0; column <= ((dataset.getColumnCount()) - 1); column++) {
				java.lang.Number n = dataset.getValue(row, column);
				if (n != null) {
					allItemsNull = false;
					double value = n.doubleValue();
					runningTotal = runningTotal + value;
					minimum = java.lang.Math.min(minimum, runningTotal);
					maximum = java.lang.Math.max(maximum, runningTotal);
				}
			}
		}
		if (!allItemsNull) {
			return new org.jfree.data.Range(minimum, maximum);
		}else {
			return null;
		}
	}
}

