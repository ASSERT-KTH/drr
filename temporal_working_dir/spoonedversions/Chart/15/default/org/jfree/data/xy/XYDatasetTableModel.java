

package org.jfree.data.xy;


public class XYDatasetTableModel extends javax.swing.table.AbstractTableModel implements javax.swing.table.TableModel , org.jfree.data.general.DatasetChangeListener {
	org.jfree.data.xy.TableXYDataset model = null;

	public XYDatasetTableModel() {
		super();
	}

	public XYDatasetTableModel(org.jfree.data.xy.TableXYDataset dataset) {
		this();
		org.jfree.data.xy.XYDatasetTableModel.this.model = dataset;
		org.jfree.data.xy.XYDatasetTableModel.this.model.addChangeListener(org.jfree.data.xy.XYDatasetTableModel.this);
	}

	public void setModel(org.jfree.data.xy.TableXYDataset dataset) {
		org.jfree.data.xy.XYDatasetTableModel.this.model = dataset;
		org.jfree.data.xy.XYDatasetTableModel.this.model.addChangeListener(org.jfree.data.xy.XYDatasetTableModel.this);
		fireTableDataChanged();
	}

	public int getRowCount() {
		if ((org.jfree.data.xy.XYDatasetTableModel.this.model) == null) {
			return 0;
		}
		return org.jfree.data.xy.XYDatasetTableModel.this.model.getItemCount();
	}

	public int getColumnCount() {
		if ((org.jfree.data.xy.XYDatasetTableModel.this.model) == null) {
			return 0;
		}
		return (org.jfree.data.xy.XYDatasetTableModel.this.model.getSeriesCount()) + 1;
	}

	public java.lang.String getColumnName(int column) {
		if ((org.jfree.data.xy.XYDatasetTableModel.this.model) == null) {
			return super.getColumnName(column);
		}
		if (column < 1) {
			return "X Value";
		}else {
			return org.jfree.data.xy.XYDatasetTableModel.this.model.getSeriesKey((column - 1)).toString();
		}
	}

	public java.lang.Object getValueAt(int row, int column) {
		if ((org.jfree.data.xy.XYDatasetTableModel.this.model) == null) {
			return null;
		}
		if (column < 1) {
			return org.jfree.data.xy.XYDatasetTableModel.this.model.getX(0, row);
		}else {
			return org.jfree.data.xy.XYDatasetTableModel.this.model.getY((column - 1), row);
		}
	}

	public void datasetChanged(org.jfree.data.general.DatasetChangeEvent event) {
		fireTableDataChanged();
	}

	public boolean isCellEditable(int row, int column) {
		return false;
	}

	public void setValueAt(java.lang.Object value, int row, int column) {
		if (isCellEditable(row, column)) {
		}
	}
}

