

package org.jfree.chart.renderer;


public class WaferMapRenderer extends org.jfree.chart.renderer.AbstractRenderer {
	private java.util.Map paintIndex;

	private org.jfree.chart.plot.WaferMapPlot plot;

	private int paintLimit;

	private static final int DEFAULT_PAINT_LIMIT = 35;

	public static final int POSITION_INDEX = 0;

	public static final int VALUE_INDEX = 1;

	private int paintIndexMethod;

	public WaferMapRenderer() {
		this(null, null);
	}

	public WaferMapRenderer(int paintLimit, int paintIndexMethod) {
		this(new java.lang.Integer(paintLimit), new java.lang.Integer(paintIndexMethod));
	}

	public WaferMapRenderer(java.lang.Integer paintLimit, java.lang.Integer paintIndexMethod) {
		super();
		org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex = new java.util.HashMap();
		if (paintLimit == null) {
			org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit = org.jfree.chart.renderer.WaferMapRenderer.DEFAULT_PAINT_LIMIT;
		}else {
			org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit = paintLimit.intValue();
		}
		org.jfree.chart.renderer.WaferMapRenderer.this.paintIndexMethod = org.jfree.chart.renderer.WaferMapRenderer.VALUE_INDEX;
		if (paintIndexMethod != null) {
			if (isMethodValid(paintIndexMethod.intValue())) {
				org.jfree.chart.renderer.WaferMapRenderer.this.paintIndexMethod = paintIndexMethod.intValue();
			}
		}
	}

	private boolean isMethodValid(int method) {
		switch (method) {
			case org.jfree.chart.renderer.WaferMapRenderer.POSITION_INDEX :
				return true;
			case org.jfree.chart.renderer.WaferMapRenderer.VALUE_INDEX :
				return true;
			default :
				return false;
		}
	}

	public org.jfree.chart.plot.DrawingSupplier getDrawingSupplier() {
		org.jfree.chart.plot.DrawingSupplier result = null;
		org.jfree.chart.plot.WaferMapPlot p = getPlot();
		if (p != null) {
			result = p.getDrawingSupplier();
		}
		return result;
	}

	public org.jfree.chart.plot.WaferMapPlot getPlot() {
		return org.jfree.chart.renderer.WaferMapRenderer.this.plot;
	}

	public void setPlot(org.jfree.chart.plot.WaferMapPlot plot) {
		org.jfree.chart.renderer.WaferMapRenderer.this.plot = plot;
		makePaintIndex();
	}

	public java.awt.Paint getChipColor(java.lang.Number value) {
		return getSeriesPaint(getPaintIndex(value));
	}

	private int getPaintIndex(java.lang.Number value) {
		return ((java.lang.Integer) (org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.get(value))).intValue();
	}

	private void makePaintIndex() {
		if ((org.jfree.chart.renderer.WaferMapRenderer.this.plot) == null) {
			return ;
		}
		org.jfree.data.general.WaferMapDataset data = org.jfree.chart.renderer.WaferMapRenderer.this.plot.getDataset();
		java.lang.Number dataMin = data.getMinValue();
		java.lang.Number dataMax = data.getMaxValue();
		java.util.Set uniqueValues = data.getUniqueValues();
		if ((uniqueValues.size()) <= (org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit)) {
			int count = 0;
			for (java.util.Iterator i = uniqueValues.iterator(); i.hasNext();) {
				org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.put(i.next(), new java.lang.Integer((count++)));
			}
		}else {
			switch (org.jfree.chart.renderer.WaferMapRenderer.this.paintIndexMethod) {
				case org.jfree.chart.renderer.WaferMapRenderer.POSITION_INDEX :
					makePositionIndex(uniqueValues);
					break;
				case org.jfree.chart.renderer.WaferMapRenderer.VALUE_INDEX :
					makeValueIndex(dataMax, dataMin, uniqueValues);
					break;
				default :
					break;
			}
		}
	}

	private void makePositionIndex(java.util.Set uniqueValues) {
		int valuesPerColor = ((int) (java.lang.Math.ceil((((double) (uniqueValues.size())) / (org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit)))));
		int count = 0;
		int paint = 0;
		for (java.util.Iterator i = uniqueValues.iterator(); i.hasNext();) {
			org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.put(i.next(), new java.lang.Integer(paint));
			if (((++count) % valuesPerColor) == 0) {
				paint++;
			}
			if (paint > (org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit)) {
				paint = org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit;
			}
		}
	}

	private void makeValueIndex(java.lang.Number max, java.lang.Number min, java.util.Set uniqueValues) {
		double valueRange = (max.doubleValue()) - (min.doubleValue());
		double valueStep = valueRange / (org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit);
		int paint = 0;
		double cutPoint = (min.doubleValue()) + valueStep;
		for (java.util.Iterator i = uniqueValues.iterator(); i.hasNext();) {
			java.lang.Number value = ((java.lang.Number) (i.next()));
			while ((value.doubleValue()) > cutPoint) {
				cutPoint += valueStep;
				paint++;
				if (paint > (org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit)) {
					paint = org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit;
				}
			} 
			org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.put(value, new java.lang.Integer(paint));
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendCollection() {
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		if (((org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex) != null) && ((org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.size()) > 0)) {
			if ((org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.size()) <= (org.jfree.chart.renderer.WaferMapRenderer.this.paintLimit)) {
				for (java.util.Iterator i = org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.entrySet().iterator(); i.hasNext();) {
					java.util.Map.Entry entry = ((java.util.Map.Entry) (i.next()));
					java.lang.String label = entry.getKey().toString();
					java.lang.String description = label;
					java.awt.Shape shape = new java.awt.geom.Rectangle2D.Double(1.0, 1.0, 1.0, 1.0);
					java.awt.Paint paint = getSeriesPaint(((java.lang.Integer) (entry.getValue())).intValue());
					java.awt.Paint outlinePaint = java.awt.Color.black;
					java.awt.Stroke outlineStroke = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
					result.add(new org.jfree.chart.LegendItem(label, description, null, null, shape, paint, outlineStroke, outlinePaint));
				}
			}else {
				java.util.Set unique = new java.util.HashSet();
				for (java.util.Iterator i = org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.entrySet().iterator(); i.hasNext();) {
					java.util.Map.Entry entry = ((java.util.Map.Entry) (i.next()));
					if (unique.add(entry.getValue())) {
						java.lang.String label = ((getMinPaintValue(((java.lang.Integer) (entry.getValue()))).toString()) + " - ") + (getMaxPaintValue(((java.lang.Integer) (entry.getValue()))).toString());
						java.lang.String description = label;
						java.awt.Shape shape = new java.awt.geom.Rectangle2D.Double(1.0, 1.0, 1.0, 1.0);
						java.awt.Paint paint = getSeriesPaint(((java.lang.Integer) (entry.getValue())).intValue());
						java.awt.Paint outlinePaint = java.awt.Color.black;
						java.awt.Stroke outlineStroke = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
						result.add(new org.jfree.chart.LegendItem(label, description, null, null, shape, paint, outlineStroke, outlinePaint));
					}
				}
			}
		}
		return result;
	}

	private java.lang.Number getMinPaintValue(java.lang.Integer index) {
		double minValue = java.lang.Double.POSITIVE_INFINITY;
		for (java.util.Iterator i = org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.entrySet().iterator(); i.hasNext();) {
			java.util.Map.Entry entry = ((java.util.Map.Entry) (i.next()));
			if (((java.lang.Integer) (entry.getValue())).equals(index)) {
				if ((((java.lang.Number) (entry.getKey())).doubleValue()) < minValue) {
					minValue = ((java.lang.Number) (entry.getKey())).doubleValue();
				}
			}
		}
		return new java.lang.Double(minValue);
	}

	private java.lang.Number getMaxPaintValue(java.lang.Integer index) {
		double maxValue = java.lang.Double.NEGATIVE_INFINITY;
		for (java.util.Iterator i = org.jfree.chart.renderer.WaferMapRenderer.this.paintIndex.entrySet().iterator(); i.hasNext();) {
			java.util.Map.Entry entry = ((java.util.Map.Entry) (i.next()));
			if (((java.lang.Integer) (entry.getValue())).equals(index)) {
				if ((((java.lang.Number) (entry.getKey())).doubleValue()) > maxValue) {
					maxValue = ((java.lang.Number) (entry.getKey())).doubleValue();
				}
			}
		}
		return new java.lang.Double(maxValue);
	}
}

