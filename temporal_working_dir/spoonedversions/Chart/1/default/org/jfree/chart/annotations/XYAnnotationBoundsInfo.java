

package org.jfree.chart.annotations;


public interface XYAnnotationBoundsInfo {
	public boolean getIncludeInDataBounds();

	public org.jfree.data.Range getXRange();

	public org.jfree.data.Range getYRange();
}

