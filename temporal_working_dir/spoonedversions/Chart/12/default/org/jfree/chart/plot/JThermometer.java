

package org.jfree.chart.plot;


public class JThermometer extends javax.swing.JPanel implements java.io.Serializable {
	private static final long serialVersionUID = 1079905665515589820L;

	private org.jfree.data.general.DefaultValueDataset data;

	private org.jfree.chart.JFreeChart chart;

	private org.jfree.chart.ChartPanel panel;

	private org.jfree.chart.plot.ThermometerPlot plot = new org.jfree.chart.plot.ThermometerPlot();

	public JThermometer() {
		super(new java.awt.CardLayout());
		org.jfree.chart.plot.JThermometer.this.plot.setInsets(new org.jfree.chart.util.RectangleInsets(5.0, 5.0, 5.0, 5.0));
		org.jfree.chart.plot.JThermometer.this.data = new org.jfree.data.general.DefaultValueDataset();
		org.jfree.chart.plot.JThermometer.this.plot.setDataset(org.jfree.chart.plot.JThermometer.this.data);
		org.jfree.chart.plot.JThermometer.this.chart = new org.jfree.chart.JFreeChart(null, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, org.jfree.chart.plot.JThermometer.this.plot, false);
		org.jfree.chart.plot.JThermometer.this.panel = new org.jfree.chart.ChartPanel(org.jfree.chart.plot.JThermometer.this.chart);
		add(org.jfree.chart.plot.JThermometer.this.panel, "Panel");
		setBackground(getBackground());
	}

	public void addSubtitle(org.jfree.chart.title.Title subtitle) {
		org.jfree.chart.plot.JThermometer.this.chart.addSubtitle(subtitle);
	}

	public void addSubtitle(java.lang.String subtitle) {
		org.jfree.chart.plot.JThermometer.this.chart.addSubtitle(new org.jfree.chart.title.TextTitle(subtitle));
	}

	public void addSubtitle(java.lang.String subtitle, java.awt.Font font) {
		org.jfree.chart.plot.JThermometer.this.chart.addSubtitle(new org.jfree.chart.title.TextTitle(subtitle, font));
	}

	public void setValueFormat(java.text.DecimalFormat df) {
		org.jfree.chart.plot.JThermometer.this.plot.setValueFormat(df);
	}

	public void setRange(double lower, double upper) {
		org.jfree.chart.plot.JThermometer.this.plot.setRange(lower, upper);
	}

	public void setSubrangeInfo(int range, double displayLow, double displayHigh) {
		org.jfree.chart.plot.JThermometer.this.plot.setSubrangeInfo(range, displayLow, displayHigh);
	}

	public void setSubrangeInfo(int range, double rangeLow, double rangeHigh, double displayLow, double displayHigh) {
		org.jfree.chart.plot.JThermometer.this.plot.setSubrangeInfo(range, rangeLow, rangeHigh, displayLow, displayHigh);
	}

	public void setValueLocation(int loc) {
		org.jfree.chart.plot.JThermometer.this.plot.setValueLocation(loc);
		org.jfree.chart.plot.JThermometer.this.panel.repaint();
	}

	public void setValuePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.JThermometer.this.plot.setValuePaint(paint);
	}

	public java.lang.Number getValue() {
		if ((org.jfree.chart.plot.JThermometer.this.data) != null) {
			return org.jfree.chart.plot.JThermometer.this.data.getValue();
		}else {
			return null;
		}
	}

	public void setValue(double value) {
		setValue(new java.lang.Double(value));
	}

	public void setValue(java.lang.Number value) {
		if ((org.jfree.chart.plot.JThermometer.this.data) != null) {
			org.jfree.chart.plot.JThermometer.this.data.setValue(value);
		}
	}

	public void setUnits(int i) {
		if ((org.jfree.chart.plot.JThermometer.this.plot) != null) {
			org.jfree.chart.plot.JThermometer.this.plot.setUnits(i);
		}
	}

	public void setOutlinePaint(java.awt.Paint p) {
		if ((org.jfree.chart.plot.JThermometer.this.plot) != null) {
			org.jfree.chart.plot.JThermometer.this.plot.setOutlinePaint(p);
		}
	}

	public void setForeground(java.awt.Color fg) {
		super.setForeground(fg);
		if ((org.jfree.chart.plot.JThermometer.this.plot) != null) {
			org.jfree.chart.plot.JThermometer.this.plot.setThermometerPaint(fg);
		}
	}

	public void setBackground(java.awt.Color bg) {
		super.setBackground(bg);
		if ((org.jfree.chart.plot.JThermometer.this.plot) != null) {
			org.jfree.chart.plot.JThermometer.this.plot.setBackgroundPaint(bg);
		}
		if ((org.jfree.chart.plot.JThermometer.this.chart) != null) {
			org.jfree.chart.plot.JThermometer.this.chart.setBackgroundPaint(bg);
		}
		if ((org.jfree.chart.plot.JThermometer.this.panel) != null) {
			org.jfree.chart.plot.JThermometer.this.panel.setBackground(bg);
		}
	}

	public void setValueFont(java.awt.Font f) {
		if ((org.jfree.chart.plot.JThermometer.this.plot) != null) {
			org.jfree.chart.plot.JThermometer.this.plot.setValueFont(f);
		}
	}

	public java.awt.Font getTickLabelFont() {
		org.jfree.chart.axis.ValueAxis axis = org.jfree.chart.plot.JThermometer.this.plot.getRangeAxis();
		return axis.getTickLabelFont();
	}

	public void setTickLabelFont(java.awt.Font font) {
		org.jfree.chart.axis.ValueAxis axis = org.jfree.chart.plot.JThermometer.this.plot.getRangeAxis();
		axis.setTickLabelFont(font);
	}

	public void changeTickFontSize(int delta) {
		java.awt.Font f = getTickLabelFont();
		java.lang.String fName = f.getFontName();
		java.awt.Font newFont = new java.awt.Font(fName, f.getStyle(), ((f.getSize()) + delta));
		setTickLabelFont(newFont);
	}

	public void setTickFontStyle(int style) {
		java.awt.Font f = getTickLabelFont();
		java.lang.String fName = f.getFontName();
		java.awt.Font newFont = new java.awt.Font(fName, style, f.getSize());
		setTickLabelFont(newFont);
	}

	public void setFollowDataInSubranges(boolean flag) {
		org.jfree.chart.plot.JThermometer.this.plot.setFollowDataInSubranges(flag);
	}

	public void setShowAxisLocation(int location) {
		org.jfree.chart.plot.JThermometer.this.plot.setAxisLocation(location);
	}

	public int getShowAxisLocation() {
		return org.jfree.chart.plot.JThermometer.this.plot.getAxisLocation();
	}
}

