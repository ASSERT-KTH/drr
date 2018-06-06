

package org.jfree.chart;


public abstract class ChartUtilities {
	public static void applyCurrentTheme(org.jfree.chart.JFreeChart chart) {
		org.jfree.chart.ChartFactory.getChartTheme().apply(chart);
	}

	public static void writeChartAsPNG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.writeChartAsPNG(out, chart, width, height, null);
	}

	public static void writeChartAsPNG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height, boolean encodeAlpha, int compression) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.writeChartAsPNG(out, chart, width, height, null, encodeAlpha, compression);
	}

	public static void writeChartAsPNG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.awt.image.BufferedImage bufferedImage = chart.createBufferedImage(width, height, info);
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bufferedImage, org.jfree.chart.encoders.ImageFormat.PNG, out);
	}

	public static void writeChartAsPNG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info, boolean encodeAlpha, int compression) throws java.io.IOException {
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Null 'out' argument.");
		}
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.awt.image.BufferedImage chartImage = chart.createBufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB, info);
		org.jfree.chart.ChartUtilities.writeBufferedImageAsPNG(out, chartImage, encodeAlpha, compression);
	}

	public static void writeScaledChartAsPNG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height, int widthScaleFactor, int heightScaleFactor) throws java.io.IOException {
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Null 'out' argument.");
		}
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		double desiredWidth = width * widthScaleFactor;
		double desiredHeight = height * heightScaleFactor;
		double defaultWidth = width;
		double defaultHeight = height;
		boolean scale = false;
		if ((widthScaleFactor != 1) || (heightScaleFactor != 1)) {
			scale = true;
		}
		double scaleX = desiredWidth / defaultWidth;
		double scaleY = desiredHeight / defaultHeight;
		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(((int) (desiredWidth)), ((int) (desiredHeight)), java.awt.image.BufferedImage.TYPE_INT_ARGB);
		java.awt.Graphics2D g2 = image.createGraphics();
		if (scale) {
			java.awt.geom.AffineTransform saved = g2.getTransform();
			g2.transform(java.awt.geom.AffineTransform.getScaleInstance(scaleX, scaleY));
			chart.draw(g2, new java.awt.geom.Rectangle2D.Double(0, 0, defaultWidth, defaultHeight), null, null);
			g2.setTransform(saved);
			g2.dispose();
		}else {
			chart.draw(g2, new java.awt.geom.Rectangle2D.Double(0, 0, defaultWidth, defaultHeight), null, null);
		}
		out.write(org.jfree.chart.ChartUtilities.encodeAsPNG(image));
	}

	public static void saveChartAsPNG(java.io.File file, org.jfree.chart.JFreeChart chart, int width, int height) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.saveChartAsPNG(file, chart, width, height, null);
	}

	public static void saveChartAsPNG(java.io.File file, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		if (file == null) {
			throw new java.lang.IllegalArgumentException("Null 'file' argument.");
		}
		java.io.OutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
		try {
			org.jfree.chart.ChartUtilities.writeChartAsPNG(out, chart, width, height, info);
		} finally {
			out.close();
		}
	}

	public static void saveChartAsPNG(java.io.File file, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info, boolean encodeAlpha, int compression) throws java.io.IOException {
		if (file == null) {
			throw new java.lang.IllegalArgumentException("Null 'file' argument.");
		}
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.io.OutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
		try {
			org.jfree.chart.ChartUtilities.writeChartAsPNG(out, chart, width, height, info, encodeAlpha, compression);
		} finally {
			out.close();
		}
	}

	public static void writeChartAsJPEG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.writeChartAsJPEG(out, chart, width, height, null);
	}

	public static void writeChartAsJPEG(java.io.OutputStream out, float quality, org.jfree.chart.JFreeChart chart, int width, int height) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.writeChartAsJPEG(out, quality, chart, width, height, null);
	}

	public static void writeChartAsJPEG(java.io.OutputStream out, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.awt.image.BufferedImage image = chart.createBufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB, info);
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(image, org.jfree.chart.encoders.ImageFormat.JPEG, out);
	}

	public static void writeChartAsJPEG(java.io.OutputStream out, float quality, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.awt.image.BufferedImage image = chart.createBufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB, info);
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(image, org.jfree.chart.encoders.ImageFormat.JPEG, out, quality);
	}

	public static void saveChartAsJPEG(java.io.File file, org.jfree.chart.JFreeChart chart, int width, int height) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.saveChartAsJPEG(file, chart, width, height, null);
	}

	public static void saveChartAsJPEG(java.io.File file, float quality, org.jfree.chart.JFreeChart chart, int width, int height) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.saveChartAsJPEG(file, quality, chart, width, height, null);
	}

	public static void saveChartAsJPEG(java.io.File file, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		if (file == null) {
			throw new java.lang.IllegalArgumentException("Null 'file' argument.");
		}
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.io.OutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
		try {
			org.jfree.chart.ChartUtilities.writeChartAsJPEG(out, chart, width, height, info);
		} finally {
			out.close();
		}
	}

	public static void saveChartAsJPEG(java.io.File file, float quality, org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		if (file == null) {
			throw new java.lang.IllegalArgumentException("Null 'file' argument.");
		}
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		java.io.OutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
		try {
			org.jfree.chart.ChartUtilities.writeChartAsJPEG(out, quality, chart, width, height, info);
		} finally {
			out.close();
		}
	}

	public static void writeBufferedImageAsJPEG(java.io.OutputStream out, java.awt.image.BufferedImage image) throws java.io.IOException {
		org.jfree.chart.ChartUtilities.writeBufferedImageAsJPEG(out, 0.75F, image);
	}

	public static void writeBufferedImageAsJPEG(java.io.OutputStream out, float quality, java.awt.image.BufferedImage image) throws java.io.IOException {
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(image, org.jfree.chart.encoders.ImageFormat.JPEG, out, quality);
	}

	public static void writeBufferedImageAsPNG(java.io.OutputStream out, java.awt.image.BufferedImage image) throws java.io.IOException {
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(image, org.jfree.chart.encoders.ImageFormat.PNG, out);
	}

	public static void writeBufferedImageAsPNG(java.io.OutputStream out, java.awt.image.BufferedImage image, boolean encodeAlpha, int compression) throws java.io.IOException {
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(image, org.jfree.chart.encoders.ImageFormat.PNG, out, compression, encodeAlpha);
	}

	public static byte[] encodeAsPNG(java.awt.image.BufferedImage image) throws java.io.IOException {
		return org.jfree.chart.encoders.EncoderUtil.encode(image, org.jfree.chart.encoders.ImageFormat.PNG);
	}

	public static byte[] encodeAsPNG(java.awt.image.BufferedImage image, boolean encodeAlpha, int compression) throws java.io.IOException {
		return org.jfree.chart.encoders.EncoderUtil.encode(image, org.jfree.chart.encoders.ImageFormat.PNG, compression, encodeAlpha);
	}

	public static void writeImageMap(java.io.PrintWriter writer, java.lang.String name, org.jfree.chart.ChartRenderingInfo info, boolean useOverLibForToolTips) throws java.io.IOException {
		org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator = null;
		if (useOverLibForToolTips) {
			toolTipTagFragmentGenerator = new org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGenerator();
		}else {
			toolTipTagFragmentGenerator = new org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator();
		}
		org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(writer, name, info, toolTipTagFragmentGenerator, new org.jfree.chart.imagemap.StandardURLTagFragmentGenerator());
	}

	public static void writeImageMap(java.io.PrintWriter writer, java.lang.String name, org.jfree.chart.ChartRenderingInfo info, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator urlTagFragmentGenerator) throws java.io.IOException {
		writer.println(org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(name, info, toolTipTagFragmentGenerator, urlTagFragmentGenerator));
	}

	public static java.lang.String getImageMap(java.lang.String name, org.jfree.chart.ChartRenderingInfo info) {
		return org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(name, info, new org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator(), new org.jfree.chart.imagemap.StandardURLTagFragmentGenerator());
	}

	public static java.lang.String getImageMap(java.lang.String name, org.jfree.chart.ChartRenderingInfo info, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator urlTagFragmentGenerator) {
		return org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(name, info, toolTipTagFragmentGenerator, urlTagFragmentGenerator);
	}
}

