

package org.jfree.chart.util;


public interface ShadowGenerator {
	public java.awt.image.BufferedImage createDropShadow(java.awt.image.BufferedImage source);

	public int calculateOffsetX();

	public int calculateOffsetY();
}

