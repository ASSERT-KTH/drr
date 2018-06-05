

package org.jfree.chart.editor;


public class ChartEditorManager {
	static org.jfree.chart.editor.ChartEditorFactory factory = new org.jfree.chart.editor.DefaultChartEditorFactory();

	private ChartEditorManager() {
	}

	public static org.jfree.chart.editor.ChartEditorFactory getChartEditorFactory() {
		return org.jfree.chart.editor.ChartEditorManager.factory;
	}

	public static void setChartEditorFactory(org.jfree.chart.editor.ChartEditorFactory f) {
		if (f == null) {
			throw new java.lang.IllegalArgumentException("Null 'f' argument.");
		}
		org.jfree.chart.editor.ChartEditorManager.factory = f;
	}

	public static org.jfree.chart.editor.ChartEditor getChartEditor(org.jfree.chart.JFreeChart chart) {
		return org.jfree.chart.editor.ChartEditorManager.factory.createEditor(chart);
	}
}

