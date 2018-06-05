

package org.jfree.chart.util;


public class SerialUtilities {
	private SerialUtilities() {
	}

	public static boolean isSerializable(java.lang.Class c) {
		return java.io.Serializable.class.isAssignableFrom(c);
	}

	public static java.awt.Paint readPaint(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		java.awt.Paint result = null;
		boolean isNull = stream.readBoolean();
		if (!isNull) {
			java.lang.Class c = ((java.lang.Class) (stream.readObject()));
			if (org.jfree.chart.util.SerialUtilities.isSerializable(c)) {
				result = ((java.awt.Paint) (stream.readObject()));
			}else
				if (c.equals(java.awt.GradientPaint.class)) {
					float x1 = stream.readFloat();
					float y1 = stream.readFloat();
					java.awt.Color c1 = ((java.awt.Color) (stream.readObject()));
					float x2 = stream.readFloat();
					float y2 = stream.readFloat();
					java.awt.Color c2 = ((java.awt.Color) (stream.readObject()));
					boolean isCyclic = stream.readBoolean();
					result = new java.awt.GradientPaint(x1, y1, c1, x2, y2, c2, isCyclic);
				}
			
		}
		return result;
	}

	public static void writePaint(java.awt.Paint paint, java.io.ObjectOutputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		if (paint != null) {
			stream.writeBoolean(false);
			stream.writeObject(paint.getClass());
			if (paint instanceof java.io.Serializable) {
				stream.writeObject(paint);
			}else
				if (paint instanceof java.awt.GradientPaint) {
					java.awt.GradientPaint gp = ((java.awt.GradientPaint) (paint));
					stream.writeFloat(((float) (gp.getPoint1().getX())));
					stream.writeFloat(((float) (gp.getPoint1().getY())));
					stream.writeObject(gp.getColor1());
					stream.writeFloat(((float) (gp.getPoint2().getX())));
					stream.writeFloat(((float) (gp.getPoint2().getY())));
					stream.writeObject(gp.getColor2());
					stream.writeBoolean(gp.isCyclic());
				}
			
		}else {
			stream.writeBoolean(true);
		}
	}

	public static java.awt.Stroke readStroke(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		java.awt.Stroke result = null;
		boolean isNull = stream.readBoolean();
		if (!isNull) {
			java.lang.Class c = ((java.lang.Class) (stream.readObject()));
			if (c.equals(java.awt.BasicStroke.class)) {
				float width = stream.readFloat();
				int cap = stream.readInt();
				int join = stream.readInt();
				float miterLimit = stream.readFloat();
				float[] dash = ((float[]) (stream.readObject()));
				float dashPhase = stream.readFloat();
				result = new java.awt.BasicStroke(width, cap, join, miterLimit, dash, dashPhase);
			}else {
				result = ((java.awt.Stroke) (stream.readObject()));
			}
		}
		return result;
	}

	public static void writeStroke(java.awt.Stroke stroke, java.io.ObjectOutputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		if (stroke != null) {
			stream.writeBoolean(false);
			if (stroke instanceof java.awt.BasicStroke) {
				java.awt.BasicStroke s = ((java.awt.BasicStroke) (stroke));
				stream.writeObject(java.awt.BasicStroke.class);
				stream.writeFloat(s.getLineWidth());
				stream.writeInt(s.getEndCap());
				stream.writeInt(s.getLineJoin());
				stream.writeFloat(s.getMiterLimit());
				stream.writeObject(s.getDashArray());
				stream.writeFloat(s.getDashPhase());
			}else {
				stream.writeObject(stroke.getClass());
				stream.writeObject(stroke);
			}
		}else {
			stream.writeBoolean(true);
		}
	}

	public static java.awt.Shape readShape(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		java.awt.Shape result = null;
		boolean isNull = stream.readBoolean();
		if (!isNull) {
			java.lang.Class c = ((java.lang.Class) (stream.readObject()));
			if (c.equals(java.awt.geom.Line2D.class)) {
				double x1 = stream.readDouble();
				double y1 = stream.readDouble();
				double x2 = stream.readDouble();
				double y2 = stream.readDouble();
				result = new java.awt.geom.Line2D.Double(x1, y1, x2, y2);
			}else
				if (c.equals(java.awt.geom.Rectangle2D.class)) {
					double x = stream.readDouble();
					double y = stream.readDouble();
					double w = stream.readDouble();
					double h = stream.readDouble();
					result = new java.awt.geom.Rectangle2D.Double(x, y, w, h);
				}else
					if (c.equals(java.awt.geom.Ellipse2D.class)) {
						double x = stream.readDouble();
						double y = stream.readDouble();
						double w = stream.readDouble();
						double h = stream.readDouble();
						result = new java.awt.geom.Ellipse2D.Double(x, y, w, h);
					}else
						if (c.equals(java.awt.geom.Arc2D.class)) {
							double x = stream.readDouble();
							double y = stream.readDouble();
							double w = stream.readDouble();
							double h = stream.readDouble();
							double as = stream.readDouble();
							double ae = stream.readDouble();
							int at = stream.readInt();
							result = new java.awt.geom.Arc2D.Double(x, y, w, h, as, ae, at);
						}else
							if (c.equals(java.awt.geom.GeneralPath.class)) {
								java.awt.geom.GeneralPath gp = new java.awt.geom.GeneralPath();
								float[] args = new float[6];
								boolean hasNext = stream.readBoolean();
								while (!hasNext) {
									int type = stream.readInt();
									for (int i = 0; i < 6; i++) {
										args[i] = stream.readFloat();
									}
									switch (type) {
										case java.awt.geom.PathIterator.SEG_MOVETO :
											gp.moveTo(args[0], args[1]);
											break;
										case java.awt.geom.PathIterator.SEG_LINETO :
											gp.lineTo(args[0], args[1]);
											break;
										case java.awt.geom.PathIterator.SEG_CUBICTO :
											gp.curveTo(args[0], args[1], args[2], args[3], args[4], args[5]);
											break;
										case java.awt.geom.PathIterator.SEG_QUADTO :
											gp.quadTo(args[0], args[1], args[2], args[3]);
											break;
										case java.awt.geom.PathIterator.SEG_CLOSE :
											gp.closePath();
											break;
										default :
											throw new java.lang.RuntimeException("JFreeChart - No path exists");
									}
									gp.setWindingRule(stream.readInt());
									hasNext = stream.readBoolean();
								} 
								result = gp;
							}else {
								result = ((java.awt.Shape) (stream.readObject()));
							}
						
					
				
			
		}
		return result;
	}

	public static void writeShape(java.awt.Shape shape, java.io.ObjectOutputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		if (shape != null) {
			stream.writeBoolean(false);
			if (shape instanceof java.awt.geom.Line2D) {
				java.awt.geom.Line2D line = ((java.awt.geom.Line2D) (shape));
				stream.writeObject(java.awt.geom.Line2D.class);
				stream.writeDouble(line.getX1());
				stream.writeDouble(line.getY1());
				stream.writeDouble(line.getX2());
				stream.writeDouble(line.getY2());
			}else
				if (shape instanceof java.awt.geom.Rectangle2D) {
					java.awt.geom.Rectangle2D rectangle = ((java.awt.geom.Rectangle2D) (shape));
					stream.writeObject(java.awt.geom.Rectangle2D.class);
					stream.writeDouble(rectangle.getX());
					stream.writeDouble(rectangle.getY());
					stream.writeDouble(rectangle.getWidth());
					stream.writeDouble(rectangle.getHeight());
				}else
					if (shape instanceof java.awt.geom.Ellipse2D) {
						java.awt.geom.Ellipse2D ellipse = ((java.awt.geom.Ellipse2D) (shape));
						stream.writeObject(java.awt.geom.Ellipse2D.class);
						stream.writeDouble(ellipse.getX());
						stream.writeDouble(ellipse.getY());
						stream.writeDouble(ellipse.getWidth());
						stream.writeDouble(ellipse.getHeight());
					}else
						if (shape instanceof java.awt.geom.Arc2D) {
							java.awt.geom.Arc2D arc = ((java.awt.geom.Arc2D) (shape));
							stream.writeObject(java.awt.geom.Arc2D.class);
							stream.writeDouble(arc.getX());
							stream.writeDouble(arc.getY());
							stream.writeDouble(arc.getWidth());
							stream.writeDouble(arc.getHeight());
							stream.writeDouble(arc.getAngleStart());
							stream.writeDouble(arc.getAngleExtent());
							stream.writeInt(arc.getArcType());
						}else
							if (shape instanceof java.awt.geom.GeneralPath) {
								stream.writeObject(java.awt.geom.GeneralPath.class);
								java.awt.geom.PathIterator pi = shape.getPathIterator(null);
								float[] args = new float[6];
								stream.writeBoolean(pi.isDone());
								while (!(pi.isDone())) {
									int type = pi.currentSegment(args);
									stream.writeInt(type);
									for (int i = 0; i < 6; i++) {
										stream.writeFloat(args[i]);
									}
									stream.writeInt(pi.getWindingRule());
									pi.next();
									stream.writeBoolean(pi.isDone());
								} 
							}else {
								stream.writeObject(shape.getClass());
								stream.writeObject(shape);
							}
						
					
				
			
		}else {
			stream.writeBoolean(true);
		}
	}

	public static java.awt.geom.Point2D readPoint2D(java.io.ObjectInputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		java.awt.geom.Point2D result = null;
		boolean isNull = stream.readBoolean();
		if (!isNull) {
			double x = stream.readDouble();
			double y = stream.readDouble();
			result = new java.awt.geom.Point2D.Double(x, y);
		}
		return result;
	}

	public static void writePoint2D(java.awt.geom.Point2D p, java.io.ObjectOutputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		if (p != null) {
			stream.writeBoolean(false);
			stream.writeDouble(p.getX());
			stream.writeDouble(p.getY());
		}else {
			stream.writeBoolean(true);
		}
	}

	public static java.text.AttributedString readAttributedString(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		java.text.AttributedString result = null;
		boolean isNull = stream.readBoolean();
		if (!isNull) {
			java.lang.String plainStr = ((java.lang.String) (stream.readObject()));
			result = new java.text.AttributedString(plainStr);
			char c = stream.readChar();
			int start = 0;
			while (c != (java.text.CharacterIterator.DONE)) {
				int limit = stream.readInt();
				java.util.Map atts = ((java.util.Map) (stream.readObject()));
				result.addAttributes(atts, start, limit);
				start = limit;
				c = stream.readChar();
			} 
		}
		return result;
	}

	public static void writeAttributedString(java.text.AttributedString as, java.io.ObjectOutputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		if (as != null) {
			stream.writeBoolean(false);
			java.text.AttributedCharacterIterator aci = as.getIterator();
			java.lang.StringBuffer plainStr = new java.lang.StringBuffer();
			char current = aci.first();
			while (current != (java.text.CharacterIterator.DONE)) {
				plainStr = plainStr.append(current);
				current = aci.next();
			} 
			stream.writeObject(plainStr.toString());
			current = aci.first();
			int begin = aci.getBeginIndex();
			while (current != (java.text.CharacterIterator.DONE)) {
				stream.writeChar(current);
				int limit = aci.getRunLimit();
				stream.writeInt((limit - begin));
				java.util.Map atts = new java.util.HashMap(aci.getAttributes());
				stream.writeObject(atts);
				current = aci.setIndex(limit);
			} 
			stream.writeChar(java.text.CharacterIterator.DONE);
		}else {
			stream.writeBoolean(true);
		}
	}

	public static java.awt.Image readImage(java.io.ObjectInputStream stream) throws java.io.IOException {
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("Null 'stream' argument.");
		}
		java.awt.image.BufferedImage result = null;
		boolean isNull = stream.readBoolean();
		if (!isNull) {
			result = javax.imageio.ImageIO.read(stream);
		}
		return result;
	}

	public static void writeImage(java.awt.Image image, java.io.ObjectOutputStream stream) throws java.io.IOException {
		java.awt.image.BufferedImage bi = null;
		if (image instanceof java.awt.image.BufferedImage) {
			bi = ((java.awt.image.BufferedImage) (image));
		}else {
			bi = new java.awt.image.BufferedImage(image.getWidth(null), image.getHeight(null), java.awt.image.BufferedImage.TYPE_INT_ARGB);
			java.awt.Graphics2D g2 = bi.createGraphics();
			g2.drawImage(image, 0, 0, null);
			g2.dispose();
		}
		org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(bi, org.jfree.chart.encoders.ImageFormat.PNG, stream);
	}
}

