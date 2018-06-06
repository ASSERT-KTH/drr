

package org.jfree.chart.ui;


public class LCBLayout implements java.awt.LayoutManager , java.io.Serializable {
	private static final long serialVersionUID = -2531780832406163833L;

	private static final int COLUMNS = 3;

	private int[] colWidth;

	private int[] rowHeight;

	private int labelGap;

	private int buttonGap;

	private int vGap;

	public LCBLayout(int maxrows) {
		org.jfree.chart.ui.LCBLayout.this.labelGap = 10;
		org.jfree.chart.ui.LCBLayout.this.buttonGap = 6;
		org.jfree.chart.ui.LCBLayout.this.vGap = 2;
		org.jfree.chart.ui.LCBLayout.this.colWidth = new int[org.jfree.chart.ui.LCBLayout.COLUMNS];
		org.jfree.chart.ui.LCBLayout.this.rowHeight = new int[maxrows];
	}

	public java.awt.Dimension preferredLayoutSize(java.awt.Container parent) {
		synchronized(parent.getTreeLock()) {
			java.awt.Insets insets = parent.getInsets();
			int ncomponents = parent.getComponentCount();
			int nrows = ncomponents / (org.jfree.chart.ui.LCBLayout.COLUMNS);
			for (int c = 0; c < (org.jfree.chart.ui.LCBLayout.COLUMNS); c++) {
				for (int r = 0; r < nrows; r++) {
					java.awt.Component component = parent.getComponent(((r * (org.jfree.chart.ui.LCBLayout.COLUMNS)) + c));
					java.awt.Dimension d = component.getPreferredSize();
					if ((org.jfree.chart.ui.LCBLayout.this.colWidth[c]) < (d.width)) {
						org.jfree.chart.ui.LCBLayout.this.colWidth[c] = d.width;
					}
					if ((org.jfree.chart.ui.LCBLayout.this.rowHeight[r]) < (d.height)) {
						org.jfree.chart.ui.LCBLayout.this.rowHeight[r] = d.height;
					}
				}
			}
			int totalHeight = (org.jfree.chart.ui.LCBLayout.this.vGap) * (nrows - 1);
			for (int r = 0; r < nrows; r++) {
				totalHeight = totalHeight + (org.jfree.chart.ui.LCBLayout.this.rowHeight[r]);
			}
			int totalWidth = ((((org.jfree.chart.ui.LCBLayout.this.colWidth[0]) + (org.jfree.chart.ui.LCBLayout.this.labelGap)) + (org.jfree.chart.ui.LCBLayout.this.colWidth[1])) + (org.jfree.chart.ui.LCBLayout.this.buttonGap)) + (org.jfree.chart.ui.LCBLayout.this.colWidth[2]);
			return new java.awt.Dimension((((((insets.left) + (insets.right)) + totalWidth) + (org.jfree.chart.ui.LCBLayout.this.labelGap)) + (org.jfree.chart.ui.LCBLayout.this.buttonGap)), ((((insets.top) + (insets.bottom)) + totalHeight) + (org.jfree.chart.ui.LCBLayout.this.vGap)));
		}
	}

	public java.awt.Dimension minimumLayoutSize(java.awt.Container parent) {
		synchronized(parent.getTreeLock()) {
			java.awt.Insets insets = parent.getInsets();
			int ncomponents = parent.getComponentCount();
			int nrows = ncomponents / (org.jfree.chart.ui.LCBLayout.COLUMNS);
			for (int c = 0; c < (org.jfree.chart.ui.LCBLayout.COLUMNS); c++) {
				for (int r = 0; r < nrows; r++) {
					java.awt.Component component = parent.getComponent(((r * (org.jfree.chart.ui.LCBLayout.COLUMNS)) + c));
					java.awt.Dimension d = component.getMinimumSize();
					if ((org.jfree.chart.ui.LCBLayout.this.colWidth[c]) < (d.width)) {
						org.jfree.chart.ui.LCBLayout.this.colWidth[c] = d.width;
					}
					if ((org.jfree.chart.ui.LCBLayout.this.rowHeight[r]) < (d.height)) {
						org.jfree.chart.ui.LCBLayout.this.rowHeight[r] = d.height;
					}
				}
			}
			int totalHeight = (org.jfree.chart.ui.LCBLayout.this.vGap) * (nrows - 1);
			for (int r = 0; r < nrows; r++) {
				totalHeight = totalHeight + (org.jfree.chart.ui.LCBLayout.this.rowHeight[r]);
			}
			int totalWidth = ((((org.jfree.chart.ui.LCBLayout.this.colWidth[0]) + (org.jfree.chart.ui.LCBLayout.this.labelGap)) + (org.jfree.chart.ui.LCBLayout.this.colWidth[1])) + (org.jfree.chart.ui.LCBLayout.this.buttonGap)) + (org.jfree.chart.ui.LCBLayout.this.colWidth[2]);
			return new java.awt.Dimension((((((insets.left) + (insets.right)) + totalWidth) + (org.jfree.chart.ui.LCBLayout.this.labelGap)) + (org.jfree.chart.ui.LCBLayout.this.buttonGap)), ((((insets.top) + (insets.bottom)) + totalHeight) + (org.jfree.chart.ui.LCBLayout.this.vGap)));
		}
	}

	public void layoutContainer(java.awt.Container parent) {
		synchronized(parent.getTreeLock()) {
			java.awt.Insets insets = parent.getInsets();
			int ncomponents = parent.getComponentCount();
			int nrows = ncomponents / (org.jfree.chart.ui.LCBLayout.COLUMNS);
			for (int c = 0; c < (org.jfree.chart.ui.LCBLayout.COLUMNS); c++) {
				for (int r = 0; r < nrows; r++) {
					java.awt.Component component = parent.getComponent(((r * (org.jfree.chart.ui.LCBLayout.COLUMNS)) + c));
					java.awt.Dimension d = component.getPreferredSize();
					if ((org.jfree.chart.ui.LCBLayout.this.colWidth[c]) < (d.width)) {
						org.jfree.chart.ui.LCBLayout.this.colWidth[c] = d.width;
					}
					if ((org.jfree.chart.ui.LCBLayout.this.rowHeight[r]) < (d.height)) {
						org.jfree.chart.ui.LCBLayout.this.rowHeight[r] = d.height;
					}
				}
			}
			int totalHeight = (org.jfree.chart.ui.LCBLayout.this.vGap) * (nrows - 1);
			for (int r = 0; r < nrows; r++) {
				totalHeight = totalHeight + (org.jfree.chart.ui.LCBLayout.this.rowHeight[r]);
			}
			int totalWidth = ((org.jfree.chart.ui.LCBLayout.this.colWidth[0]) + (org.jfree.chart.ui.LCBLayout.this.colWidth[1])) + (org.jfree.chart.ui.LCBLayout.this.colWidth[2]);
			int available = ((((parent.getWidth()) - (insets.left)) - (insets.right)) - (org.jfree.chart.ui.LCBLayout.this.labelGap)) - (org.jfree.chart.ui.LCBLayout.this.buttonGap);
			org.jfree.chart.ui.LCBLayout.this.colWidth[1] = (org.jfree.chart.ui.LCBLayout.this.colWidth[1]) + (available - totalWidth);
			int x = insets.left;
			for (int c = 0; c < (org.jfree.chart.ui.LCBLayout.COLUMNS); c++) {
				int y = insets.top;
				for (int r = 0; r < nrows; r++) {
					int i = (r * (org.jfree.chart.ui.LCBLayout.COLUMNS)) + c;
					if (i < ncomponents) {
						java.awt.Component component = parent.getComponent(i);
						java.awt.Dimension d = component.getPreferredSize();
						int h = d.height;
						int adjust = ((org.jfree.chart.ui.LCBLayout.this.rowHeight[r]) - h) / 2;
						parent.getComponent(i).setBounds(x, (y + adjust), org.jfree.chart.ui.LCBLayout.this.colWidth[c], h);
					}
					y = (y + (org.jfree.chart.ui.LCBLayout.this.rowHeight[r])) + (org.jfree.chart.ui.LCBLayout.this.vGap);
				}
				x = x + (org.jfree.chart.ui.LCBLayout.this.colWidth[c]);
				if (c == 0) {
					x = x + (org.jfree.chart.ui.LCBLayout.this.labelGap);
				}
				if (c == 1) {
					x = x + (org.jfree.chart.ui.LCBLayout.this.buttonGap);
				}
			}
		}
	}

	public void addLayoutComponent(java.awt.Component comp) {
	}

	public void removeLayoutComponent(java.awt.Component comp) {
	}

	public void addLayoutComponent(java.lang.String name, java.awt.Component comp) {
	}

	public void removeLayoutComponent(java.lang.String name, java.awt.Component comp) {
	}
}

