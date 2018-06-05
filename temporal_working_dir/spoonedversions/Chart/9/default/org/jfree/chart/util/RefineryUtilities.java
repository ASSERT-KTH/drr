

package org.jfree.chart.util;


public class RefineryUtilities {
	private RefineryUtilities() {
	}

	public static java.awt.Point getCenterPoint() {
		java.awt.GraphicsEnvironment localGraphicsEnvironment = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
		try {
			java.lang.reflect.Method method = java.awt.GraphicsEnvironment.class.getMethod("getCenterPoint", ((java.lang.Class[]) (null)));
			return ((java.awt.Point) (method.invoke(localGraphicsEnvironment, ((java.lang.Object[]) (null)))));
		} catch (java.lang.Exception e) {
		}
		java.awt.Dimension s = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		return new java.awt.Point(((s.width) / 2), ((s.height) / 2));
	}

	public static java.awt.Rectangle getMaximumWindowBounds() {
		java.awt.GraphicsEnvironment localGraphicsEnvironment = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
		try {
			java.lang.reflect.Method method = java.awt.GraphicsEnvironment.class.getMethod("getMaximumWindowBounds", ((java.lang.Class[]) (null)));
			return ((java.awt.Rectangle) (method.invoke(localGraphicsEnvironment, ((java.lang.Object[]) (null)))));
		} catch (java.lang.Exception e) {
		}
		java.awt.Dimension s = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		return new java.awt.Rectangle(0, 0, s.width, s.height);
	}

	public static void centerFrameOnScreen(final java.awt.Window frame) {
		org.jfree.chart.util.RefineryUtilities.positionFrameOnScreen(frame, 0.5, 0.5);
	}

	public static void positionFrameOnScreen(java.awt.Window frame, double horizontalPercent, double verticalPercent) {
		java.awt.Rectangle s = org.jfree.chart.util.RefineryUtilities.getMaximumWindowBounds();
		java.awt.Dimension f = frame.getSize();
		int w = java.lang.Math.max(((s.width) - (f.width)), 0);
		int h = java.lang.Math.max(((s.height) - (f.height)), 0);
		int x = ((int) (horizontalPercent * w)) + (s.x);
		int y = ((int) (verticalPercent * h)) + (s.y);
		frame.setBounds(x, y, f.width, f.height);
	}

	public static void positionFrameRandomly(java.awt.Window frame) {
		org.jfree.chart.util.RefineryUtilities.positionFrameOnScreen(frame, java.lang.Math.random(), java.lang.Math.random());
	}

	public static void centerDialogInParent(java.awt.Dialog dialog) {
		org.jfree.chart.util.RefineryUtilities.positionDialogRelativeToParent(dialog, 0.5, 0.5);
	}

	public static void positionDialogRelativeToParent(java.awt.Dialog dialog, double horizontalPercent, double verticalPercent) {
		java.awt.Dimension d = dialog.getSize();
		java.awt.Container parent = dialog.getParent();
		java.awt.Dimension p = parent.getSize();
		int baseX = (parent.getX()) - (d.width);
		int baseY = (parent.getY()) - (d.height);
		int w = (d.width) + (p.width);
		int h = (d.height) + (p.height);
		int x = baseX + ((int) (horizontalPercent * w));
		int y = baseY + ((int) (verticalPercent * h));
		java.awt.Rectangle s = org.jfree.chart.util.RefineryUtilities.getMaximumWindowBounds();
		x = java.lang.Math.min(x, ((s.width) - (d.width)));
		x = java.lang.Math.max(x, 0);
		y = java.lang.Math.min(y, ((s.height) - (d.height)));
		y = java.lang.Math.max(y, 0);
		dialog.setBounds((x + (s.x)), (y + (s.y)), d.width, d.height);
	}

	public static javax.swing.JPanel createTablePanel(javax.swing.table.TableModel model) {
		javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout());
		javax.swing.JTable table = new javax.swing.JTable(model);
		for (int columnIndex = 0; columnIndex < (model.getColumnCount()); columnIndex++) {
			javax.swing.table.TableColumn column = table.getColumnModel().getColumn(columnIndex);
			java.lang.Class c = model.getColumnClass(columnIndex);
			if (c.equals(java.lang.Number.class)) {
				column.setCellRenderer(new org.jfree.chart.util.NumberCellRenderer());
			}
		}
		panel.add(new javax.swing.JScrollPane(table));
		return panel;
	}

	public static javax.swing.JLabel createJLabel(java.lang.String text, java.awt.Font font) {
		javax.swing.JLabel result = new javax.swing.JLabel(text);
		result.setFont(font);
		return result;
	}

	public static javax.swing.JLabel createJLabel(java.lang.String text, java.awt.Font font, java.awt.Color color) {
		javax.swing.JLabel result = new javax.swing.JLabel(text);
		result.setFont(font);
		result.setForeground(color);
		return result;
	}

	public static javax.swing.JButton createJButton(java.lang.String label, java.awt.Font font) {
		javax.swing.JButton result = new javax.swing.JButton(label);
		result.setFont(font);
		return result;
	}
}

