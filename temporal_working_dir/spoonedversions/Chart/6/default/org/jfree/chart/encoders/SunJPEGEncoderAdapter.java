

package org.jfree.chart.encoders;


public class SunJPEGEncoderAdapter implements org.jfree.chart.encoders.ImageEncoder {
	private float quality = 0.95F;

	public SunJPEGEncoderAdapter() {
	}

	public float getQuality() {
		return org.jfree.chart.encoders.SunJPEGEncoderAdapter.this.quality;
	}

	public void setQuality(float quality) {
		if ((quality < 0.0F) || (quality > 1.0F)) {
			throw new java.lang.IllegalArgumentException("The 'quality' must be in the range 0.0f to 1.0f");
		}
		org.jfree.chart.encoders.SunJPEGEncoderAdapter.this.quality = quality;
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
		java.util.Iterator iterator = javax.imageio.ImageIO.getImageWritersByFormatName("jpeg");
		javax.imageio.ImageWriter writer = ((javax.imageio.ImageWriter) (iterator.next()));
		javax.imageio.ImageWriteParam p = writer.getDefaultWriteParam();
		p.setCompressionMode(javax.imageio.ImageWriteParam.MODE_EXPLICIT);
		p.setCompressionQuality(org.jfree.chart.encoders.SunJPEGEncoderAdapter.this.quality);
		javax.imageio.stream.ImageOutputStream ios = javax.imageio.ImageIO.createImageOutputStream(outputStream);
		writer.setOutput(ios);
		writer.write(null, new javax.imageio.IIOImage(bufferedImage, null, null), p);
		ios.flush();
		writer.dispose();
		ios.close();
	}
}

