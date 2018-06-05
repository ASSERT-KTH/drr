

package org.jfree.chart.encoders;


public class SunPNGEncoderAdapter implements org.jfree.chart.encoders.ImageEncoder {
	public float getQuality() {
		return 0.0F;
	}

	public void setQuality(float quality) {
	}

	public boolean isEncodingAlpha() {
		return false;
	}

	public void setEncodingAlpha(boolean encodingAlpha) {
	}

	public byte[] encode(java.awt.image.BufferedImage bufferedImage) throws java.io.IOException {
		java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
		encode(bufferedImage, outputStream);
		return outputStream.toByteArray();
	}

	public void encode(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream) throws java.io.IOException {
		if (bufferedImage == null) {
			throw new java.lang.IllegalArgumentException("Null 'image' argument.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Null 'outputStream' argument.");
		}
		javax.imageio.ImageIO.write(bufferedImage, org.jfree.chart.encoders.ImageFormat.PNG, outputStream);
	}
}

