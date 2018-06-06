

package org.jfree.chart.encoders;


public class EncoderUtil {
	public static byte[] encode(java.awt.image.BufferedImage image, java.lang.String format) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format);
		return imageEncoder.encode(image);
	}

	public static byte[] encode(java.awt.image.BufferedImage image, java.lang.String format, boolean encodeAlpha) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format, encodeAlpha);
		return imageEncoder.encode(image);
	}

	public static byte[] encode(java.awt.image.BufferedImage image, java.lang.String format, float quality) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format, quality);
		return imageEncoder.encode(image);
	}

	public static byte[] encode(java.awt.image.BufferedImage image, java.lang.String format, float quality, boolean encodeAlpha) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format, quality, encodeAlpha);
		return imageEncoder.encode(image);
	}

	public static void writeBufferedImage(java.awt.image.BufferedImage image, java.lang.String format, java.io.OutputStream outputStream) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format);
		imageEncoder.encode(image, outputStream);
	}

	public static void writeBufferedImage(java.awt.image.BufferedImage image, java.lang.String format, java.io.OutputStream outputStream, float quality) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format, quality);
		imageEncoder.encode(image, outputStream);
	}

	public static void writeBufferedImage(java.awt.image.BufferedImage image, java.lang.String format, java.io.OutputStream outputStream, boolean encodeAlpha) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format, encodeAlpha);
		imageEncoder.encode(image, outputStream);
	}

	public static void writeBufferedImage(java.awt.image.BufferedImage image, java.lang.String format, java.io.OutputStream outputStream, float quality, boolean encodeAlpha) throws java.io.IOException {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format, quality, encodeAlpha);
		imageEncoder.encode(image, outputStream);
	}
}

