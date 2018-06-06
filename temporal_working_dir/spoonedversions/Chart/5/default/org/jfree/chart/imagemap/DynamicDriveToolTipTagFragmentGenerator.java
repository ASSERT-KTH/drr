

package org.jfree.chart.imagemap;


public class DynamicDriveToolTipTagFragmentGenerator implements org.jfree.chart.imagemap.ToolTipTagFragmentGenerator {
	protected java.lang.String title = "";

	protected int style = 1;

	public DynamicDriveToolTipTagFragmentGenerator() {
		super();
	}

	public DynamicDriveToolTipTagFragmentGenerator(java.lang.String title, int style) {
		org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.this.title = title;
		org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.this.style = style;
	}

	public java.lang.String generateToolTipFragment(java.lang.String toolTipText) {
		return ((((((" onMouseOver=\"return stm([\'" + (org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape(org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.this.title))) + "','") + (org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape(toolTipText))) + "'],Style[") + (org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator.this.style)) + "]);\"") + " onMouseOut=\"return htm();\"";
	}
}

