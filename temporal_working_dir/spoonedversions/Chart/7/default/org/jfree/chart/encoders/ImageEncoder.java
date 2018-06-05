

package org.jfree.chart.encoders;


public interface ImageEncoder {
	public byte[] encode(java.awt.image.BufferedImage bufferedImage) throws java.io.IOException;

	public void encode(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream) throws java.io.IOException;

	public float getQuality();

	public void setQuality(float quality);

	public boolean isEncodingAlpha();

	public void setEncodingAlpha(boolean encodingAlpha);
}

