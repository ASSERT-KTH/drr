

package org.jfree.chart.imagemap;


public class StandardToolTipTagFragmentGenerator implements org.jfree.chart.imagemap.ToolTipTagFragmentGenerator {
	public java.lang.String generateToolTipFragment(java.lang.String toolTipText) {
		return (" title=\"" + toolTipText) + "\" alt=\"\"";
	}
}

