

package org.apache.commons.math3.linear;


public class RealMatrixFormat {
	private static final java.lang.String DEFAULT_PREFIX = "{";

	private static final java.lang.String DEFAULT_SUFFIX = "}";

	private static final java.lang.String DEFAULT_ROW_PREFIX = "{";

	private static final java.lang.String DEFAULT_ROW_SUFFIX = "}";

	private static final java.lang.String DEFAULT_ROW_SEPARATOR = ",";

	private static final java.lang.String DEFAULT_COLUMN_SEPARATOR = ",";

	private final java.lang.String prefix;

	private final java.lang.String suffix;

	private final java.lang.String rowPrefix;

	private final java.lang.String rowSuffix;

	private final java.lang.String rowSeparator;

	private final java.lang.String columnSeparator;

	private final java.text.NumberFormat format;

	public RealMatrixFormat() {
		this(org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_PREFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_SUFFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_ROW_PREFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_ROW_SUFFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_ROW_SEPARATOR, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_COLUMN_SEPARATOR, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public RealMatrixFormat(final java.text.NumberFormat format) {
		this(org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_PREFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_SUFFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_ROW_PREFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_ROW_SUFFIX, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_ROW_SEPARATOR, org.apache.commons.math3.linear.RealMatrixFormat.DEFAULT_COLUMN_SEPARATOR, format);
	}

	public RealMatrixFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String rowPrefix, final java.lang.String rowSuffix, final java.lang.String rowSeparator, final java.lang.String columnSeparator) {
		this(prefix, suffix, rowPrefix, rowSuffix, rowSeparator, columnSeparator, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public RealMatrixFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String rowPrefix, final java.lang.String rowSuffix, final java.lang.String rowSeparator, final java.lang.String columnSeparator, final java.text.NumberFormat format) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.rowPrefix = rowPrefix;
		this.rowSuffix = rowSuffix;
		this.rowSeparator = rowSeparator;
		this.columnSeparator = columnSeparator;
		this.format = format;
		org.apache.commons.math3.linear.RealMatrixFormat.this.format.setGroupingUsed(false);
	}

	public static java.util.Locale[] getAvailableLocales() {
		return java.text.NumberFormat.getAvailableLocales();
	}

	public java.lang.String getPrefix() {
		return prefix;
	}

	public java.lang.String getSuffix() {
		return suffix;
	}

	public java.lang.String getRowPrefix() {
		return rowPrefix;
	}

	public java.lang.String getRowSuffix() {
		return rowSuffix;
	}

	public java.lang.String getRowSeparator() {
		return rowSeparator;
	}

	public java.lang.String getColumnSeparator() {
		return columnSeparator;
	}

	public java.text.NumberFormat getFormat() {
		return format;
	}

	public static org.apache.commons.math3.linear.RealMatrixFormat getInstance() {
		return org.apache.commons.math3.linear.RealMatrixFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math3.linear.RealMatrixFormat getInstance(final java.util.Locale locale) {
		return new org.apache.commons.math3.linear.RealMatrixFormat(org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(locale));
	}

	public java.lang.String format(org.apache.commons.math3.linear.RealMatrix m) {
		return format(m, new java.lang.StringBuffer(), new java.text.FieldPosition(0)).toString();
	}

	public java.lang.StringBuffer format(org.apache.commons.math3.linear.RealMatrix matrix, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		toAppendTo.append(prefix);
		final int rows = matrix.getRowDimension();
		for (int i = 0; i < rows; ++i) {
			toAppendTo.append(rowPrefix);
			for (int j = 0; j < (matrix.getColumnDimension()); ++j) {
				if (j > 0) {
					toAppendTo.append(columnSeparator);
				}
				org.apache.commons.math3.util.CompositeFormat.formatDouble(matrix.getEntry(i, j), format, toAppendTo, pos);
			}
			toAppendTo.append(rowSuffix);
			if (i < (rows - 1)) {
				toAppendTo.append(rowSeparator);
			}
		}
		toAppendTo.append(suffix);
		return toAppendTo;
	}

	public org.apache.commons.math3.linear.RealMatrix parse(java.lang.String source) {
		final java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		final org.apache.commons.math3.linear.RealMatrix result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math3.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math3.linear.Array2DRowRealMatrix.class);
		}
		return result;
	}

	public org.apache.commons.math3.linear.RealMatrix parse(java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		final java.lang.String trimmedPrefix = prefix.trim();
		final java.lang.String trimmedSuffix = suffix.trim();
		final java.lang.String trimmedRowPrefix = rowPrefix.trim();
		final java.lang.String trimmedRowSuffix = rowSuffix.trim();
		final java.lang.String trimmedColumnSeparator = columnSeparator.trim();
		final java.lang.String trimmedRowSeparator = rowSeparator.trim();
		org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math3.util.CompositeFormat.parseFixedstring(source, trimmedPrefix, pos))) {
			return null;
		}
		java.util.List<java.util.List<java.lang.Number>> matrix = new java.util.ArrayList<java.util.List<java.lang.Number>>();
		java.util.List<java.lang.Number> rowComponents = new java.util.ArrayList<java.lang.Number>();
		for (boolean loop = true; loop;) {
			if (!(rowComponents.isEmpty())) {
				org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
				if (!(org.apache.commons.math3.util.CompositeFormat.parseFixedstring(source, trimmedColumnSeparator, pos))) {
					if (((trimmedRowSuffix.length()) != 0) && (!(org.apache.commons.math3.util.CompositeFormat.parseFixedstring(source, trimmedRowSuffix, pos)))) {
						return null;
					}else {
						org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
						if (org.apache.commons.math3.util.CompositeFormat.parseFixedstring(source, trimmedRowSeparator, pos)) {
							matrix.add(rowComponents);
							rowComponents = new java.util.ArrayList<java.lang.Number>();
							continue;
						}else {
							loop = false;
						}
					}
				}
			}else {
				org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
				if (((trimmedRowPrefix.length()) != 0) && (!(org.apache.commons.math3.util.CompositeFormat.parseFixedstring(source, trimmedRowPrefix, pos)))) {
					return null;
				}
			}
			if (loop) {
				org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
				java.lang.Number component = org.apache.commons.math3.util.CompositeFormat.parseNumber(source, format, pos);
				if (component != null) {
					rowComponents.add(component);
				}else {
					if (rowComponents.isEmpty()) {
						loop = false;
					}else {
						pos.setIndex(initialIndex);
						return null;
					}
				}
			}
		}
		if (!(rowComponents.isEmpty())) {
			matrix.add(rowComponents);
		}
		org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math3.util.CompositeFormat.parseFixedstring(source, trimmedSuffix, pos))) {
			return null;
		}
		if (matrix.isEmpty()) {
			pos.setIndex(initialIndex);
			return null;
		}
		double[][] data = new double[matrix.size()][];
		int row = 0;
		for (java.util.List<java.lang.Number> rowList : matrix) {
			data[row] = new double[rowList.size()];
			for (int i = 0; i < (rowList.size()); i++) {
				data[row][i] = rowList.get(i).doubleValue();
			}
			row++;
		}
		return org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(data);
	}
}

