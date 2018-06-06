

package org.jfree.chart.util;


public class DefaultShadowGenerator implements java.io.Serializable , org.jfree.chart.util.ShadowGenerator {
	private int shadowSize;

	private java.awt.Color shadowColor;

	private float shadowOpacity;

	private double angle;

	private int distance;

	public DefaultShadowGenerator() {
		this(5, java.awt.Color.black, 0.5F, 5, ((-(java.lang.Math.PI)) / 4));
	}

	public DefaultShadowGenerator(int size, java.awt.Color color, float opacity, int distance, double angle) {
		if (color == null) {
			throw new java.lang.IllegalArgumentException("Null 'color' argument.");
		}
		org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize = size;
		org.jfree.chart.util.DefaultShadowGenerator.this.shadowColor = color;
		org.jfree.chart.util.DefaultShadowGenerator.this.shadowOpacity = opacity;
		org.jfree.chart.util.DefaultShadowGenerator.this.distance = distance;
		org.jfree.chart.util.DefaultShadowGenerator.this.angle = angle;
	}

	public int getShadowSize() {
		return org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize;
	}

	public java.awt.Color getShadowColor() {
		return org.jfree.chart.util.DefaultShadowGenerator.this.shadowColor;
	}

	public float getShadowOpacity() {
		return org.jfree.chart.util.DefaultShadowGenerator.this.shadowOpacity;
	}

	public int getDistance() {
		return org.jfree.chart.util.DefaultShadowGenerator.this.distance;
	}

	public double getAngle() {
		return org.jfree.chart.util.DefaultShadowGenerator.this.angle;
	}

	public int calculateOffsetX() {
		return ((int) ((java.lang.Math.cos(org.jfree.chart.util.DefaultShadowGenerator.this.angle)) * (org.jfree.chart.util.DefaultShadowGenerator.this.distance))) - (org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize);
	}

	public int calculateOffsetY() {
		return (-((int) ((java.lang.Math.sin(org.jfree.chart.util.DefaultShadowGenerator.this.angle)) * (org.jfree.chart.util.DefaultShadowGenerator.this.distance)))) - (org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize);
	}

	public java.awt.image.BufferedImage createDropShadow(java.awt.image.BufferedImage source) {
		java.awt.image.BufferedImage subject = new java.awt.image.BufferedImage(((source.getWidth()) + ((org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize) * 2)), ((source.getHeight()) + ((org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize) * 2)), java.awt.image.BufferedImage.TYPE_INT_ARGB);
		java.awt.Graphics2D g2 = subject.createGraphics();
		g2.drawImage(source, null, shadowSize, shadowSize);
		g2.dispose();
		applyShadow(subject);
		return subject;
	}

	protected void applyShadow(java.awt.image.BufferedImage image) {
		int dstWidth = image.getWidth();
		int dstHeight = image.getHeight();
		int left = ((shadowSize) - 1) >> 1;
		int right = (shadowSize) - left;
		int xStart = left;
		int xStop = dstWidth - right;
		int yStart = left;
		int yStop = dstHeight - right;
		int shadowRgb = (shadowColor.getRGB()) & 16777215;
		int[] aHistory = new int[shadowSize];
		int historyIdx = 0;
		int aSum;
		int[] dataBuffer = ((java.awt.image.DataBufferInt) (image.getRaster().getDataBuffer())).getData();
		int lastPixelOffset = right * dstWidth;
		float sumDivider = (shadowOpacity) / (shadowSize);
		for (int y = 0, bufferOffset = 0; y < dstHeight; y++ , bufferOffset = y * dstWidth) {
			aSum = 0;
			historyIdx = 0;
			for (int x = 0; x < (shadowSize); x++ , bufferOffset++) {
				int a = (dataBuffer[bufferOffset]) >>> 24;
				aHistory[x] = a;
				aSum += a;
			}
			bufferOffset -= right;
			for (int x = xStart; x < xStop; x++ , bufferOffset++) {
				int a = ((int) (aSum * sumDivider));
				dataBuffer[bufferOffset] = (a << 24) | shadowRgb;
				aSum -= aHistory[historyIdx];
				a = (dataBuffer[(bufferOffset + right)]) >>> 24;
				aHistory[historyIdx] = a;
				aSum += a;
				if ((++historyIdx) >= (shadowSize)) {
					historyIdx -= shadowSize;
				}
			}
		}
		for (int x = 0, bufferOffset = 0; x < dstWidth; x++ , bufferOffset = x) {
			aSum = 0;
			historyIdx = 0;
			for (int y = 0; y < (shadowSize); y++ , bufferOffset += dstWidth) {
				int a = (dataBuffer[bufferOffset]) >>> 24;
				aHistory[y] = a;
				aSum += a;
			}
			bufferOffset -= lastPixelOffset;
			for (int y = yStart; y < yStop; y++ , bufferOffset += dstWidth) {
				int a = ((int) (aSum * sumDivider));
				dataBuffer[bufferOffset] = (a << 24) | shadowRgb;
				aSum -= aHistory[historyIdx];
				a = (dataBuffer[(bufferOffset + lastPixelOffset)]) >>> 24;
				aHistory[historyIdx] = a;
				aSum += a;
				if ((++historyIdx) >= (shadowSize)) {
					historyIdx -= shadowSize;
				}
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.DefaultShadowGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.DefaultShadowGenerator)) {
			return false;
		}
		org.jfree.chart.util.DefaultShadowGenerator that = ((org.jfree.chart.util.DefaultShadowGenerator) (obj));
		if ((org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize) != (that.shadowSize)) {
			return false;
		}
		if (!(org.jfree.chart.util.DefaultShadowGenerator.this.shadowColor.equals(that.shadowColor))) {
			return false;
		}
		if ((org.jfree.chart.util.DefaultShadowGenerator.this.shadowOpacity) != (that.shadowOpacity)) {
			return false;
		}
		if ((org.jfree.chart.util.DefaultShadowGenerator.this.distance) != (that.distance)) {
			return false;
		}
		if ((org.jfree.chart.util.DefaultShadowGenerator.this.angle) != (that.angle)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int hash = org.jfree.chart.util.HashUtilities.hashCode(17, org.jfree.chart.util.DefaultShadowGenerator.this.shadowSize);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.util.DefaultShadowGenerator.this.shadowColor);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.util.DefaultShadowGenerator.this.shadowOpacity);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.util.DefaultShadowGenerator.this.distance);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.util.DefaultShadowGenerator.this.angle);
		return hash;
	}
}

