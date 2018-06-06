

package org.jfree.chart.editor;


public class DefaultChartEditorFactory implements org.jfree.chart.editor.ChartEditorFactory {
	public DefaultChartEditorFactory() {
	}

	public org.jfree.chart.editor.ChartEditor createEditor(org.jfree.chart.JFreeChart chart) {
		return new org.jfree.chart.editor.DefaultChartEditor(chart);
	}
}

