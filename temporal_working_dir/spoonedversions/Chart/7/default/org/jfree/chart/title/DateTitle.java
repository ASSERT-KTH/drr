

package org.jfree.chart.title;


public class DateTitle extends org.jfree.chart.title.TextTitle implements java.io.Serializable {
	private static final long serialVersionUID = -465434812763159881L;

	public DateTitle() {
		this(java.text.DateFormat.LONG);
	}

	public DateTitle(int style) {
		this(style, java.util.Locale.getDefault(), new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12), java.awt.Color.black);
	}

	public DateTitle(int style, java.util.Locale locale, java.awt.Font font, java.awt.Paint paint) {
		this(style, locale, font, paint, org.jfree.chart.util.RectangleEdge.BOTTOM, org.jfree.chart.util.HorizontalAlignment.RIGHT, org.jfree.chart.util.VerticalAlignment.CENTER, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	public DateTitle(int style, java.util.Locale locale, java.awt.Font font, java.awt.Paint paint, org.jfree.chart.util.RectangleEdge position, org.jfree.chart.util.HorizontalAlignment horizontalAlignment, org.jfree.chart.util.VerticalAlignment verticalAlignment, org.jfree.chart.util.RectangleInsets padding) {
		super(java.text.DateFormat.getDateInstance(style, locale).format(new java.util.Date()), font, paint, position, horizontalAlignment, verticalAlignment, padding);
	}

	public void setDateFormat(int style, java.util.Locale locale) {
		setText(java.text.DateFormat.getDateInstance(style, locale).format(new java.util.Date()));
	}
}

