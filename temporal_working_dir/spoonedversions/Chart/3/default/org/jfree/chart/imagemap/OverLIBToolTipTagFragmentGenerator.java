

package org.jfree.chart.imagemap;


public class OverLIBToolTipTagFragmentGenerator implements org.jfree.chart.imagemap.ToolTipTagFragmentGenerator {
	public OverLIBToolTipTagFragmentGenerator() {
		super();
	}

	public java.lang.String generateToolTipFragment(java.lang.String toolTipText) {
		return (" onMouseOver=\"return overlib(\'" + (org.jfree.chart.imagemap.ImageMapUtilities.javascriptEscape(toolTipText))) + "\');\" onMouseOut=\"return nd();\"";
	}
}

