

package org.jfree.chart;


public class ChartColor extends java.awt.Color {
	public static final java.awt.Color VERY_DARK_RED = new java.awt.Color(128, 0, 0);

	public static final java.awt.Color DARK_RED = new java.awt.Color(192, 0, 0);

	public static final java.awt.Color LIGHT_RED = new java.awt.Color(255, 64, 64);

	public static final java.awt.Color VERY_LIGHT_RED = new java.awt.Color(255, 128, 128);

	public static final java.awt.Color VERY_DARK_YELLOW = new java.awt.Color(128, 128, 0);

	public static final java.awt.Color DARK_YELLOW = new java.awt.Color(192, 192, 0);

	public static final java.awt.Color LIGHT_YELLOW = new java.awt.Color(255, 255, 64);

	public static final java.awt.Color VERY_LIGHT_YELLOW = new java.awt.Color(255, 255, 128);

	public static final java.awt.Color VERY_DARK_GREEN = new java.awt.Color(0, 128, 0);

	public static final java.awt.Color DARK_GREEN = new java.awt.Color(0, 192, 0);

	public static final java.awt.Color LIGHT_GREEN = new java.awt.Color(64, 255, 64);

	public static final java.awt.Color VERY_LIGHT_GREEN = new java.awt.Color(128, 255, 128);

	public static final java.awt.Color VERY_DARK_CYAN = new java.awt.Color(0, 128, 128);

	public static final java.awt.Color DARK_CYAN = new java.awt.Color(0, 192, 192);

	public static final java.awt.Color LIGHT_CYAN = new java.awt.Color(64, 255, 255);

	public static final java.awt.Color VERY_LIGHT_CYAN = new java.awt.Color(128, 255, 255);

	public static final java.awt.Color VERY_DARK_BLUE = new java.awt.Color(0, 0, 128);

	public static final java.awt.Color DARK_BLUE = new java.awt.Color(0, 0, 192);

	public static final java.awt.Color LIGHT_BLUE = new java.awt.Color(64, 64, 255);

	public static final java.awt.Color VERY_LIGHT_BLUE = new java.awt.Color(128, 128, 255);

	public static final java.awt.Color VERY_DARK_MAGENTA = new java.awt.Color(128, 0, 128);

	public static final java.awt.Color DARK_MAGENTA = new java.awt.Color(192, 0, 192);

	public static final java.awt.Color LIGHT_MAGENTA = new java.awt.Color(255, 64, 255);

	public static final java.awt.Color VERY_LIGHT_MAGENTA = new java.awt.Color(255, 128, 255);

	public ChartColor(int r, int g, int b) {
		super(r, g, b);
	}

	public static java.awt.Paint[] createDefaultPaintArray() {
		return new java.awt.Paint[]{ new java.awt.Color(255, 85, 85) , new java.awt.Color(85, 85, 255) , new java.awt.Color(85, 255, 85) , new java.awt.Color(255, 255, 85) , new java.awt.Color(255, 85, 255) , new java.awt.Color(85, 255, 255) , java.awt.Color.pink , java.awt.Color.gray , org.jfree.chart.ChartColor.DARK_RED , org.jfree.chart.ChartColor.DARK_BLUE , org.jfree.chart.ChartColor.DARK_GREEN , org.jfree.chart.ChartColor.DARK_YELLOW , org.jfree.chart.ChartColor.DARK_MAGENTA , org.jfree.chart.ChartColor.DARK_CYAN , java.awt.Color.darkGray , org.jfree.chart.ChartColor.LIGHT_RED , org.jfree.chart.ChartColor.LIGHT_BLUE , org.jfree.chart.ChartColor.LIGHT_GREEN , org.jfree.chart.ChartColor.LIGHT_YELLOW , org.jfree.chart.ChartColor.LIGHT_MAGENTA , org.jfree.chart.ChartColor.LIGHT_CYAN , java.awt.Color.lightGray , org.jfree.chart.ChartColor.VERY_DARK_RED , org.jfree.chart.ChartColor.VERY_DARK_BLUE , org.jfree.chart.ChartColor.VERY_DARK_GREEN , org.jfree.chart.ChartColor.VERY_DARK_YELLOW , org.jfree.chart.ChartColor.VERY_DARK_MAGENTA , org.jfree.chart.ChartColor.VERY_DARK_CYAN , org.jfree.chart.ChartColor.VERY_LIGHT_RED , org.jfree.chart.ChartColor.VERY_LIGHT_BLUE , org.jfree.chart.ChartColor.VERY_LIGHT_GREEN , org.jfree.chart.ChartColor.VERY_LIGHT_YELLOW , org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA , org.jfree.chart.ChartColor.VERY_LIGHT_CYAN };
	}
}

