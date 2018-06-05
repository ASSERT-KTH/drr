

package org.jfree.chart.imagemap;


public class StandardToolTipTagFragmentGenerator implements org.jfree.chart.imagemap.ToolTipTagFragmentGenerator {
	public StandardToolTipTagFragmentGenerator() {
		super();
	}

	public java.lang.String generateToolTipFragment(java.lang.String toolTipText) {
		return (" title=\"" + (org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape(toolTipText))) + "\" alt=\"\"";
	}
}

