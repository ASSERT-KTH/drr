

package org.jfree.chart.util;


public class NumberCellRenderer extends javax.swing.table.DefaultTableCellRenderer {
	public NumberCellRenderer() {
		super();
		setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
	}

	public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		setFont(null);
		java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
		if (value != null) {
			setText(nf.format(value));
		}else {
			setText("");
		}
		if (isSelected) {
			setBackground(table.getSelectionBackground());
		}else {
			setBackground(null);
		}
		return org.jfree.chart.util.NumberCellRenderer.this;
	}
}

