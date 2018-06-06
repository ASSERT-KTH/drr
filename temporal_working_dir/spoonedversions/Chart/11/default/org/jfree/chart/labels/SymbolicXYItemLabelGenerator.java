

package org.jfree.chart.labels;


public class SymbolicXYItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYItemLabelGenerator , org.jfree.chart.labels.XYToolTipGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 3963400354475494395L;

	public java.lang.String generateToolTip(org.jfree.data.xy.XYDataset data, int series, int item) {
		java.lang.String xStr;
		java.lang.String yStr;
		if (data instanceof org.jfree.data.xy.YisSymbolic) {
			yStr = ((org.jfree.data.xy.YisSymbolic) (data)).getYSymbolicValue(series, item);
		}else {
			double y = data.getYValue(series, item);
			yStr = java.lang.Double.toString(org.jfree.chart.labels.SymbolicXYItemLabelGenerator.round(y, 2));
		}
		if (data instanceof org.jfree.data.xy.XisSymbolic) {
			xStr = ((org.jfree.data.xy.XisSymbolic) (data)).getXSymbolicValue(series, item);
		}else
			if (data instanceof org.jfree.data.time.TimeSeriesCollection) {
				org.jfree.data.time.RegularTimePeriod p = ((org.jfree.data.time.TimeSeriesCollection) (data)).getSeries(series).getTimePeriod(item);
				xStr = p.toString();
			}else {
				double x = data.getXValue(series, item);
				xStr = java.lang.Double.toString(org.jfree.chart.labels.SymbolicXYItemLabelGenerator.round(x, 2));
			}
		
		return (("X: " + xStr) + ", Y: ") + yStr;
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series, int category) {
		return null;
	}

	private static double round(double value, int nb) {
		if (nb <= 0) {
			return java.lang.Math.floor((value + 0.5));
		}
		double p = java.lang.Math.pow(10, nb);
		double tempval = java.lang.Math.floor(((value * p) + 0.5));
		return tempval / p;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.SymbolicXYItemLabelGenerator.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.labels.SymbolicXYItemLabelGenerator) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int result = 127;
		return result;
	}
}

