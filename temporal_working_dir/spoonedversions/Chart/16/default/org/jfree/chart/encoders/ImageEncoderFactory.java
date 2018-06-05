

package org.jfree.chart.encoders;


public class ImageEncoderFactory {
	private static java.util.Hashtable encoders = null;

	static {
		org.jfree.chart.encoders.ImageEncoderFactory.init();
	}

	private static void init() {
		org.jfree.chart.encoders.ImageEncoderFactory.encoders = new java.util.Hashtable();
		org.jfree.chart.encoders.ImageEncoderFactory.encoders.put("jpeg", "org.jfree.chart.encoders.SunJPEGEncoderAdapter");
		try {
			java.lang.Class.forName("javax.imageio.ImageIO");
			java.lang.Class.forName("org.jfree.chart.encoders.SunPNGEncoderAdapter");
			org.jfree.chart.encoders.ImageEncoderFactory.encoders.put("png", "org.jfree.chart.encoders.SunPNGEncoderAdapter");
			org.jfree.chart.encoders.ImageEncoderFactory.encoders.put("jpeg", "org.jfree.chart.encoders.SunJPEGEncoderAdapter");
		} catch (java.lang.ClassNotFoundException e) {
			org.jfree.chart.encoders.ImageEncoderFactory.encoders.put("png", "org.jfree.chart.encoders.KeypointPNGEncoderAdapter");
		}
	}

	public static void setImageEncoder(java.lang.String format, java.lang.String imageEncoderClassName) {
		org.jfree.chart.encoders.ImageEncoderFactory.encoders.put(format, imageEncoderClassName);
	}

	public static org.jfree.chart.encoders.ImageEncoder newInstance(java.lang.String format) {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = null;
		java.lang.String className = ((java.lang.String) (org.jfree.chart.encoders.ImageEncoderFactory.encoders.get(format)));
		if (className == null) {
			throw new java.lang.IllegalArgumentException(("Unsupported image format - " + format));
		}
		try {
			java.lang.Class imageEncoderClass = java.lang.Class.forName(className);
			imageEncoder = ((org.jfree.chart.encoders.ImageEncoder) (imageEncoderClass.newInstance()));
		} catch (java.lang.Exception e) {
			throw new java.lang.IllegalArgumentException(e.toString());
		}
		return imageEncoder;
	}

	public static org.jfree.chart.encoders.ImageEncoder newInstance(java.lang.String format, float quality) {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format);
		imageEncoder.setQuality(quality);
		return imageEncoder;
	}

	public static org.jfree.chart.encoders.ImageEncoder newInstance(java.lang.String format, boolean encodingAlpha) {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format);
		imageEncoder.setEncodingAlpha(encodingAlpha);
		return imageEncoder;
	}

	public static org.jfree.chart.encoders.ImageEncoder newInstance(java.lang.String format, float quality, boolean encodingAlpha) {
		org.jfree.chart.encoders.ImageEncoder imageEncoder = org.jfree.chart.encoders.ImageEncoderFactory.newInstance(format);
		imageEncoder.setQuality(quality);
		imageEncoder.setEncodingAlpha(encodingAlpha);
		return imageEncoder;
	}
}

