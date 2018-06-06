

package org.jfree.data.time;


public class TimeSeriesTableModel extends javax.swing.table.AbstractTableModel implements org.jfree.data.event.SeriesChangeListener {
	private org.jfree.data.time.TimeSeries series;

	private boolean editable;

	private org.jfree.data.time.RegularTimePeriod newTimePeriod;

	private java.lang.Number newValue;

	public TimeSeriesTableModel() {
		this(new org.jfree.data.time.TimeSeries("Untitled"));
	}

	public TimeSeriesTableModel(org.jfree.data.time.TimeSeries series) {
		this(series, false);
	}

	public TimeSeriesTableModel(org.jfree.data.time.TimeSeries series, boolean editable) {
		org.jfree.data.time.TimeSeriesTableModel.this.series = series;
		org.jfree.data.time.TimeSeriesTableModel.this.series.addChangeListener(org.jfree.data.time.TimeSeriesTableModel.this);
		org.jfree.data.time.TimeSeriesTableModel.this.editable = editable;
	}

	public int getColumnCount() {
		return 2;
	}

	public java.lang.Class getColumnClass(int column) {
		if (column == 0) {
			return java.lang.String.class;
		}else {
			if (column == 1) {
				return java.lang.Double.class;
			}else {
				return null;
			}
		}
	}

	public java.lang.String getColumnName(int column) {
		if (column == 0) {
			return "Period:";
		}else {
			if (column == 1) {
				return "Value:";
			}else {
				return null;
			}
		}
	}

	public int getRowCount() {
		return org.jfree.data.time.TimeSeriesTableModel.this.series.getItemCount();
	}

	public java.lang.Object getValueAt(int row, int column) {
		if (row < (org.jfree.data.time.TimeSeriesTableModel.this.series.getItemCount())) {
			if (column == 0) {
				return org.jfree.data.time.TimeSeriesTableModel.this.series.getTimePeriod(row);
			}else {
				if (column == 1) {
					return org.jfree.data.time.TimeSeriesTableModel.this.series.getValue(row);
				}else {
					return null;
				}
			}
		}else {
			if (column == 0) {
				return org.jfree.data.time.TimeSeriesTableModel.this.newTimePeriod;
			}else {
				if (column == 1) {
					return org.jfree.data.time.TimeSeriesTableModel.this.newValue;
				}else {
					return null;
				}
			}
		}
	}

	public boolean isCellEditable(int row, int column) {
		if (org.jfree.data.time.TimeSeriesTableModel.this.editable) {
			if ((column == 0) || (column == 1)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	public void setValueAt(java.lang.Object value, int row, int column) {
		if (row < (org.jfree.data.time.TimeSeriesTableModel.this.series.getItemCount())) {
			if (column == 1) {
				try {
					java.lang.Double v = java.lang.Double.valueOf(value.toString());
					org.jfree.data.time.TimeSeriesTableModel.this.series.update(row, v);
				} catch (java.lang.NumberFormatException nfe) {
					java.lang.System.err.println("Number format exception");
				}
			}
		}else {
			if (column == 0) {
				org.jfree.data.time.TimeSeriesTableModel.this.newTimePeriod = null;
			}else
				if (column == 1) {
					org.jfree.data.time.TimeSeriesTableModel.this.newValue = java.lang.Double.valueOf(value.toString());
				}
			
		}
	}

	public void seriesChanged(org.jfree.data.event.SeriesChangeEvent event) {
		fireTableDataChanged();
	}
}

