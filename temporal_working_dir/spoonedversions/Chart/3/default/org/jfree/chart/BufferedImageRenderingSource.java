

package org.jfree.chart;


public class BufferedImageRenderingSource implements org.jfree.chart.RenderingSource {
	private java.awt.image.BufferedImage image;

	private java.util.List selectionStates = new java.util.ArrayList();

	public BufferedImageRenderingSource(java.awt.image.BufferedImage image) {
		if (image == null) {
			throw new java.lang.IllegalArgumentException("Null 'image' argument.");
		}
		org.jfree.chart.BufferedImageRenderingSource.this.image = image;
	}

	public java.awt.Graphics2D createGraphics2D() {
		return org.jfree.chart.BufferedImageRenderingSource.this.image.createGraphics();
	}

	public org.jfree.data.general.DatasetSelectionState getSelectionState(org.jfree.data.general.Dataset dataset) {
		java.util.Iterator iterator = org.jfree.chart.BufferedImageRenderingSource.this.selectionStates.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.general.DatasetAndSelection das = ((org.jfree.data.general.DatasetAndSelection) (iterator.next()));
			if ((das.getDataset()) == dataset) {
				return das.getSelection();
			}
		} 
		return null;
	}

	public void putSelectionState(org.jfree.data.general.Dataset dataset, org.jfree.data.general.DatasetSelectionState state) {
		org.jfree.chart.BufferedImageRenderingSource.this.selectionStates.add(new org.jfree.data.general.DatasetAndSelection(dataset, state));
	}
}

