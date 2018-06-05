

package org.jfree.chart.text;


public class TextUtilities {
	private static boolean useDrawRotatedStringWorkaround;

	private static boolean useFontMetricsGetStringBounds;

	static {
		boolean isJava14 = org.jfree.chart.util.ObjectUtilities.isJDK14();
		org.jfree.chart.text.TextUtilities.useDrawRotatedStringWorkaround = isJava14 == false;
		org.jfree.chart.text.TextUtilities.useFontMetricsGetStringBounds = isJava14 == true;
	}

	private TextUtilities() {
	}

	public static org.jfree.chart.text.TextBlock createTextBlock(java.lang.String text, java.awt.Font font, java.awt.Paint paint) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		org.jfree.chart.text.TextBlock result = new org.jfree.chart.text.TextBlock();
		java.lang.String input = text;
		boolean moreInputToProcess = (text.length()) > 0;
		int start = 0;
		while (moreInputToProcess) {
			int index = input.indexOf("\n");
			if (index > start) {
				java.lang.String line = input.substring(start, index);
				if (index < ((input.length()) - 1)) {
					result.addLine(line, font, paint);
					input = input.substring((index + 1));
				}else {
					moreInputToProcess = false;
				}
			}else
				if (index == start) {
					if (index < ((input.length()) - 1)) {
						input = input.substring((index + 1));
					}else {
						moreInputToProcess = false;
					}
				}else {
					result.addLine(input, font, paint);
					moreInputToProcess = false;
				}
			
		} 
		return result;
	}

	public static org.jfree.chart.text.TextBlock createTextBlock(java.lang.String text, java.awt.Font font, java.awt.Paint paint, float maxWidth, org.jfree.chart.text.TextMeasurer measurer) {
		return org.jfree.chart.text.TextUtilities.createTextBlock(text, font, paint, maxWidth, java.lang.Integer.MAX_VALUE, measurer);
	}

	public static org.jfree.chart.text.TextBlock createTextBlock(java.lang.String text, java.awt.Font font, java.awt.Paint paint, float maxWidth, int maxLines, org.jfree.chart.text.TextMeasurer measurer) {
		org.jfree.chart.text.TextBlock result = new org.jfree.chart.text.TextBlock();
		java.text.BreakIterator iterator = java.text.BreakIterator.getLineInstance();
		iterator.setText(text);
		int current = 0;
		int lines = 0;
		int length = text.length();
		while ((current < length) && (lines < maxLines)) {
			int next = org.jfree.chart.text.TextUtilities.nextLineBreak(text, current, maxWidth, iterator, measurer);
			if (next == (java.text.BreakIterator.DONE)) {
				result.addLine(text.substring(current), font, paint);
				return result;
			}
			result.addLine(text.substring(current, next), font, paint);
			lines++;
			current = next;
			while ((current < (text.length())) && ((text.charAt(current)) == '\n')) {
				current++;
			} 
		} 
		if (current < length) {
			org.jfree.chart.text.TextLine lastLine = result.getLastLine();
			org.jfree.chart.text.TextFragment lastFragment = lastLine.getLastTextFragment();
			java.lang.String oldStr = lastFragment.getText();
			java.lang.String newStr = "...";
			if ((oldStr.length()) > 3) {
				newStr = (oldStr.substring(0, ((oldStr.length()) - 3))) + "...";
			}
			lastLine.removeFragment(lastFragment);
			org.jfree.chart.text.TextFragment newFragment = new org.jfree.chart.text.TextFragment(newStr, lastFragment.getFont(), lastFragment.getPaint());
			lastLine.addFragment(newFragment);
		}
		return result;
	}

	private static int nextLineBreak(java.lang.String text, int start, float width, java.text.BreakIterator iterator, org.jfree.chart.text.TextMeasurer measurer) {
		int current = start;
		int end;
		float x = 0.0F;
		boolean firstWord = true;
		int newline = text.indexOf('\n', start);
		if (newline < 0) {
			newline = java.lang.Integer.MAX_VALUE;
		}
		while ((end = iterator.next()) != (java.text.BreakIterator.DONE)) {
			x += measurer.getStringWidth(text, current, end);
			if (x > width) {
				if (firstWord) {
					while ((measurer.getStringWidth(text, start, end)) > width) {
						end--;
						if (end <= start) {
							return end;
						}
					} 
					return end;
				}else {
					end = iterator.previous();
					return end;
				}
			}else {
				if (end > newline) {
					return newline;
				}
			}
			firstWord = false;
			current = end;
		} 
		return java.text.BreakIterator.DONE;
	}

	public static java.awt.geom.Rectangle2D getTextBounds(java.lang.String text, java.awt.Graphics2D g2, java.awt.FontMetrics fm) {
		final java.awt.geom.Rectangle2D bounds;
		if (org.jfree.chart.text.TextUtilities.useFontMetricsGetStringBounds) {
			bounds = fm.getStringBounds(text, g2);
			java.awt.font.LineMetrics lm = fm.getFont().getLineMetrics(text, g2.getFontRenderContext());
			bounds.setRect(bounds.getX(), bounds.getY(), bounds.getWidth(), lm.getHeight());
		}else {
			double width = fm.stringWidth(text);
			double height = fm.getHeight();
			bounds = new java.awt.geom.Rectangle2D.Double(0.0, (-(fm.getAscent())), width, height);
		}
		return bounds;
	}

	public static java.awt.geom.Rectangle2D drawAlignedString(java.lang.String text, java.awt.Graphics2D g2, float x, float y, org.jfree.chart.text.TextAnchor anchor) {
		java.awt.geom.Rectangle2D textBounds = new java.awt.geom.Rectangle2D.Double();
		float[] adjust = org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(g2, text, anchor, textBounds);
		textBounds.setRect((x + (adjust[0])), ((y + (adjust[1])) + (adjust[2])), textBounds.getWidth(), textBounds.getHeight());
		g2.drawString(text, (x + (adjust[0])), (y + (adjust[1])));
		return textBounds;
	}

	private static float[] deriveTextBoundsAnchorOffsets(java.awt.Graphics2D g2, java.lang.String text, org.jfree.chart.text.TextAnchor anchor, java.awt.geom.Rectangle2D textBounds) {
		float[] result = new float[3];
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		java.awt.Font f = g2.getFont();
		java.awt.FontMetrics fm = g2.getFontMetrics(f);
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(text, g2, fm);
		java.awt.font.LineMetrics metrics = f.getLineMetrics(text, frc);
		float ascent = metrics.getAscent();
		result[2] = -ascent;
		float halfAscent = ascent / 2.0F;
		float descent = metrics.getDescent();
		float leading = metrics.getLeading();
		float xAdj = 0.0F;
		float yAdj = 0.0F;
		if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER))) {
			xAdj = ((float) (-(bounds.getWidth()))) / 2.0F;
		}else
			if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT))) {
				xAdj = ((float) (-(bounds.getWidth())));
			}
		
		if (((anchor == (org.jfree.chart.text.TextAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT))) {
			yAdj = ((-descent) - leading) + ((float) (bounds.getHeight()));
		}else
			if (((anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT))) {
				yAdj = halfAscent;
			}else
				if (((anchor == (org.jfree.chart.text.TextAnchor.CENTER_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_RIGHT))) {
					yAdj = ((-descent) - leading) + ((float) ((bounds.getHeight()) / 2.0));
				}else
					if (((anchor == (org.jfree.chart.text.TextAnchor.BASELINE_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_RIGHT))) {
						yAdj = 0.0F;
					}else
						if (((anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) {
							yAdj = (-(metrics.getDescent())) - (metrics.getLeading());
						}
					
				
			
		
		if (textBounds != null) {
			textBounds.setRect(bounds);
		}
		result[0] = xAdj;
		result[1] = yAdj;
		return result;
	}

	public static void setUseDrawRotatedStringWorkaround(boolean use) {
		org.jfree.chart.text.TextUtilities.useDrawRotatedStringWorkaround = use;
	}

	public static void drawRotatedString(java.lang.String text, java.awt.Graphics2D g2, double angle, float x, float y) {
		org.jfree.chart.text.TextUtilities.drawRotatedString(text, g2, x, y, angle, x, y);
	}

	public static void drawRotatedString(java.lang.String text, java.awt.Graphics2D g2, float textX, float textY, double angle, float rotateX, float rotateY) {
		if ((text == null) || (text.equals(""))) {
			return ;
		}
		java.awt.geom.AffineTransform saved = g2.getTransform();
		java.awt.geom.AffineTransform rotate = java.awt.geom.AffineTransform.getRotateInstance(angle, rotateX, rotateY);
		g2.transform(rotate);
		if (org.jfree.chart.text.TextUtilities.useDrawRotatedStringWorkaround) {
			java.awt.font.TextLayout tl = new java.awt.font.TextLayout(text, g2.getFont(), g2.getFontRenderContext());
			tl.draw(g2, textX, textY);
		}else {
			java.text.AttributedString as = new java.text.AttributedString(text, g2.getFont().getAttributes());
			g2.drawString(as.getIterator(), textX, textY);
		}
		g2.setTransform(saved);
	}

	public static void drawRotatedString(java.lang.String text, java.awt.Graphics2D g2, float x, float y, org.jfree.chart.text.TextAnchor textAnchor, double angle, float rotationX, float rotationY) {
		if ((text == null) || (text.equals(""))) {
			return ;
		}
		float[] textAdj = org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(g2, text, textAnchor);
		org.jfree.chart.text.TextUtilities.drawRotatedString(text, g2, (x + (textAdj[0])), (y + (textAdj[1])), angle, rotationX, rotationY);
	}

	public static void drawRotatedString(java.lang.String text, java.awt.Graphics2D g2, float x, float y, org.jfree.chart.text.TextAnchor textAnchor, double angle, org.jfree.chart.text.TextAnchor rotationAnchor) {
		if ((text == null) || (text.equals(""))) {
			return ;
		}
		float[] textAdj = org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(g2, text, textAnchor);
		float[] rotateAdj = org.jfree.chart.text.TextUtilities.deriveRotationAnchorOffsets(g2, text, rotationAnchor);
		org.jfree.chart.text.TextUtilities.drawRotatedString(text, g2, (x + (textAdj[0])), (y + (textAdj[1])), angle, ((x + (textAdj[0])) + (rotateAdj[0])), ((y + (textAdj[1])) + (rotateAdj[1])));
	}

	public static java.awt.Shape calculateRotatedStringBounds(java.lang.String text, java.awt.Graphics2D g2, float x, float y, org.jfree.chart.text.TextAnchor textAnchor, double angle, org.jfree.chart.text.TextAnchor rotationAnchor) {
		if ((text == null) || (text.equals(""))) {
			return null;
		}
		float[] textAdj = org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(g2, text, textAnchor);
		float[] rotateAdj = org.jfree.chart.text.TextUtilities.deriveRotationAnchorOffsets(g2, text, rotationAnchor);
		java.awt.Shape result = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(text, g2, (x + (textAdj[0])), (y + (textAdj[1])), angle, ((x + (textAdj[0])) + (rotateAdj[0])), ((y + (textAdj[1])) + (rotateAdj[1])));
		return result;
	}

	private static float[] deriveTextBoundsAnchorOffsets(java.awt.Graphics2D g2, java.lang.String text, org.jfree.chart.text.TextAnchor anchor) {
		float[] result = new float[2];
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		java.awt.Font f = g2.getFont();
		java.awt.FontMetrics fm = g2.getFontMetrics(f);
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(text, g2, fm);
		java.awt.font.LineMetrics metrics = f.getLineMetrics(text, frc);
		float ascent = metrics.getAscent();
		float halfAscent = ascent / 2.0F;
		float descent = metrics.getDescent();
		float leading = metrics.getLeading();
		float xAdj = 0.0F;
		float yAdj = 0.0F;
		if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER))) {
			xAdj = ((float) (-(bounds.getWidth()))) / 2.0F;
		}else
			if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT))) {
				xAdj = ((float) (-(bounds.getWidth())));
			}
		
		if (((anchor == (org.jfree.chart.text.TextAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT))) {
			yAdj = ((-descent) - leading) + ((float) (bounds.getHeight()));
		}else
			if (((anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT))) {
				yAdj = halfAscent;
			}else
				if (((anchor == (org.jfree.chart.text.TextAnchor.CENTER_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_RIGHT))) {
					yAdj = ((-descent) - leading) + ((float) ((bounds.getHeight()) / 2.0));
				}else
					if (((anchor == (org.jfree.chart.text.TextAnchor.BASELINE_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_RIGHT))) {
						yAdj = 0.0F;
					}else
						if (((anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) {
							yAdj = (-(metrics.getDescent())) - (metrics.getLeading());
						}
					
				
			
		
		result[0] = xAdj;
		result[1] = yAdj;
		return result;
	}

	private static float[] deriveRotationAnchorOffsets(java.awt.Graphics2D g2, java.lang.String text, org.jfree.chart.text.TextAnchor anchor) {
		float[] result = new float[2];
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		java.awt.font.LineMetrics metrics = g2.getFont().getLineMetrics(text, frc);
		java.awt.FontMetrics fm = g2.getFontMetrics();
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(text, g2, fm);
		float ascent = metrics.getAscent();
		float halfAscent = ascent / 2.0F;
		float descent = metrics.getDescent();
		float leading = metrics.getLeading();
		float xAdj = 0.0F;
		float yAdj = 0.0F;
		if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_LEFT))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_LEFT))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_LEFT))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT))) {
			xAdj = 0.0F;
		}else
			if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER))) {
				xAdj = ((float) (bounds.getWidth())) / 2.0F;
			}else
				if (((((anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_RIGHT))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT))) {
					xAdj = ((float) (bounds.getWidth()));
				}
			
		
		if (((anchor == (org.jfree.chart.text.TextAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT))) {
			yAdj = (descent + leading) - ((float) (bounds.getHeight()));
		}else
			if (((anchor == (org.jfree.chart.text.TextAnchor.CENTER_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.CENTER_RIGHT))) {
				yAdj = (descent + leading) - ((float) ((bounds.getHeight()) / 2.0));
			}else
				if (((anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT))) {
					yAdj = -halfAscent;
				}else
					if (((anchor == (org.jfree.chart.text.TextAnchor.BASELINE_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BASELINE_RIGHT))) {
						yAdj = 0.0F;
					}else
						if (((anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) {
							yAdj = (metrics.getDescent()) + (metrics.getLeading());
						}
					
				
			
		
		result[0] = xAdj;
		result[1] = yAdj;
		return result;
	}

	public static java.awt.Shape calculateRotatedStringBounds(java.lang.String text, java.awt.Graphics2D g2, float textX, float textY, double angle, float rotateX, float rotateY) {
		if ((text == null) || (text.equals(""))) {
			return null;
		}
		java.awt.FontMetrics fm = g2.getFontMetrics();
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(text, g2, fm);
		java.awt.geom.AffineTransform translate = java.awt.geom.AffineTransform.getTranslateInstance(textX, textY);
		java.awt.Shape translatedBounds = translate.createTransformedShape(bounds);
		java.awt.geom.AffineTransform rotate = java.awt.geom.AffineTransform.getRotateInstance(angle, rotateX, rotateY);
		java.awt.Shape result = rotate.createTransformedShape(translatedBounds);
		return result;
	}

	public static boolean getUseFontMetricsGetStringBounds() {
		return org.jfree.chart.text.TextUtilities.useFontMetricsGetStringBounds;
	}

	public static void setUseFontMetricsGetStringBounds(final boolean use) {
		org.jfree.chart.text.TextUtilities.useFontMetricsGetStringBounds = use;
	}

	public static boolean isUseDrawRotatedStringWorkaround() {
		return org.jfree.chart.text.TextUtilities.useDrawRotatedStringWorkaround;
	}
}

