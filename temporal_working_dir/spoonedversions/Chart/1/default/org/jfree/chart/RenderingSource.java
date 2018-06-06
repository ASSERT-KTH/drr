

package org.jfree.chart;


public interface RenderingSource {
	public java.awt.Graphics2D createGraphics2D();

	public org.jfree.data.general.DatasetSelectionState getSelectionState(org.jfree.data.general.Dataset dataset);

	public void putSelectionState(org.jfree.data.general.Dataset dataset, org.jfree.data.general.DatasetSelectionState state);
}

