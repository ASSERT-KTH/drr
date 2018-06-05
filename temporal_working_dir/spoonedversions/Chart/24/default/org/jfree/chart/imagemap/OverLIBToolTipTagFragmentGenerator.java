

package org.jfree.chart.imagemap;


public class OverLIBToolTipTagFragmentGenerator implements org.jfree.chart.imagemap.ToolTipTagFragmentGenerator {
	public java.lang.String generateToolTipFragment(java.lang.String toolTipText) {
		return (" onMouseOver=\"return overlib(\'" + toolTipText) + "\');\" onMouseOut=\"return nd();\"";
	}
}

