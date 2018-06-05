

package org.jfree.chart.util;


public class ShapeUtilities {
	private ShapeUtilities() {
	}

	public static java.awt.Shape clone(java.awt.Shape shape) {
		if (shape instanceof java.lang.Cloneable) {
			try {
				return ((java.awt.Shape) (org.jfree.chart.util.ObjectUtilities.clone(shape)));
			} catch (java.lang.CloneNotSupportedException cnse) {
			}
		}
		java.awt.Shape result = null;
		return result;
	}

	public static boolean equal(java.awt.Shape s1, java.awt.Shape s2) {
		if ((s1 instanceof java.awt.geom.Line2D) && (s2 instanceof java.awt.geom.Line2D)) {
			return org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.Line2D) (s1)), ((java.awt.geom.Line2D) (s2)));
		}else
			if ((s1 instanceof java.awt.geom.Ellipse2D) && (s2 instanceof java.awt.geom.Ellipse2D)) {
				return org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.Ellipse2D) (s1)), ((java.awt.geom.Ellipse2D) (s2)));
			}else
				if ((s1 instanceof java.awt.geom.Arc2D) && (s2 instanceof java.awt.geom.Arc2D)) {
					return org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.Arc2D) (s1)), ((java.awt.geom.Arc2D) (s2)));
				}else
					if ((s1 instanceof java.awt.Polygon) && (s2 instanceof java.awt.Polygon)) {
						return org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon) (s1)), ((java.awt.Polygon) (s2)));
					}else
						if ((s1 instanceof java.awt.geom.GeneralPath) && (s2 instanceof java.awt.geom.GeneralPath)) {
							return org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath) (s1)), ((java.awt.geom.GeneralPath) (s2)));
						}else {
							return org.jfree.chart.util.ObjectUtilities.equal(s1, s2);
						}
					
				
			
		
	}

	public static boolean equal(java.awt.geom.Line2D l1, java.awt.geom.Line2D l2) {
		if (l1 == null) {
			return l2 == null;
		}
		if (l2 == null) {
			return false;
		}
		if (!(l1.getP1().equals(l2.getP1()))) {
			return false;
		}
		if (!(l1.getP2().equals(l2.getP2()))) {
			return false;
		}
		return true;
	}

	public static boolean equal(java.awt.geom.Ellipse2D e1, java.awt.geom.Ellipse2D e2) {
		if (e1 == null) {
			return e2 == null;
		}
		if (e2 == null) {
			return false;
		}
		if (!(e1.getFrame().equals(e2.getFrame()))) {
			return false;
		}
		return true;
	}

	public static boolean equal(java.awt.geom.Arc2D a1, java.awt.geom.Arc2D a2) {
		if (a1 == null) {
			return a2 == null;
		}
		if (a2 == null) {
			return false;
		}
		if (!(a1.getFrame().equals(a2.getFrame()))) {
			return false;
		}
		if ((a1.getAngleStart()) != (a2.getAngleStart())) {
			return false;
		}
		if ((a1.getAngleExtent()) != (a2.getAngleExtent())) {
			return false;
		}
		if ((a1.getArcType()) != (a2.getArcType())) {
			return false;
		}
		return true;
	}

	public static boolean equal(java.awt.Polygon p1, java.awt.Polygon p2) {
		if (p1 == null) {
			return p2 == null;
		}
		if (p2 == null) {
			return false;
		}
		if ((p1.npoints) != (p2.npoints)) {
			return false;
		}
		if (!(java.util.Arrays.equals(p1.xpoints, p2.xpoints))) {
			return false;
		}
		if (!(java.util.Arrays.equals(p1.ypoints, p2.ypoints))) {
			return false;
		}
		return true;
	}

	public static boolean equal(java.awt.geom.GeneralPath p1, java.awt.geom.GeneralPath p2) {
		if (p1 == null) {
			return p2 == null;
		}
		if (p2 == null) {
			return false;
		}
		if ((p1.getWindingRule()) != (p2.getWindingRule())) {
			return false;
		}
		java.awt.geom.PathIterator iterator1 = p1.getPathIterator(null);
		java.awt.geom.PathIterator iterator2 = p1.getPathIterator(null);
		double[] d1 = new double[6];
		double[] d2 = new double[6];
		boolean done = (iterator1.isDone()) && (iterator2.isDone());
		while (!done) {
			if ((iterator1.isDone()) != (iterator2.isDone())) {
				return false;
			}
			int seg1 = iterator1.currentSegment(d1);
			int seg2 = iterator2.currentSegment(d2);
			if (seg1 != seg2) {
				return false;
			}
			if (!(java.util.Arrays.equals(d1, d2))) {
				return false;
			}
			iterator1.next();
			iterator2.next();
			done = (iterator1.isDone()) && (iterator2.isDone());
		} 
		return true;
	}

	public static java.awt.Shape createTranslatedShape(java.awt.Shape shape, double transX, double transY) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		java.awt.geom.AffineTransform transform = java.awt.geom.AffineTransform.getTranslateInstance(transX, transY);
		return transform.createTransformedShape(shape);
	}

	public static java.awt.Shape createTranslatedShape(java.awt.Shape shape, org.jfree.chart.util.RectangleAnchor anchor, double locationX, double locationY) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		java.awt.geom.Point2D anchorPoint = org.jfree.chart.util.RectangleAnchor.coordinates(shape.getBounds2D(), anchor);
		java.awt.geom.AffineTransform transform = java.awt.geom.AffineTransform.getTranslateInstance((locationX - (anchorPoint.getX())), (locationY - (anchorPoint.getY())));
		return transform.createTransformedShape(shape);
	}

	public static java.awt.Shape rotateShape(java.awt.Shape base, double angle, float x, float y) {
		if (base == null) {
			return null;
		}
		java.awt.geom.AffineTransform rotate = java.awt.geom.AffineTransform.getRotateInstance(angle, x, y);
		java.awt.Shape result = rotate.createTransformedShape(base);
		return result;
	}

	public static void drawRotatedShape(java.awt.Graphics2D g2, java.awt.Shape shape, double angle, float x, float y) {
		java.awt.geom.AffineTransform saved = g2.getTransform();
		java.awt.geom.AffineTransform rotate = java.awt.geom.AffineTransform.getRotateInstance(angle, x, y);
		g2.transform(rotate);
		g2.draw(shape);
		g2.setTransform(saved);
	}

	private static final float SQRT2 = ((float) (java.lang.Math.pow(2.0, 0.5)));

	public static java.awt.Shape createDiagonalCross(float l, float t) {
		java.awt.geom.GeneralPath p0 = new java.awt.geom.GeneralPath();
		p0.moveTo(((-l) - t), ((-l) + t));
		p0.lineTo(((-l) + t), ((-l) - t));
		p0.lineTo(0.0F, ((-t) * (org.jfree.chart.util.ShapeUtilities.SQRT2)));
		p0.lineTo((l - t), ((-l) - t));
		p0.lineTo((l + t), ((-l) + t));
		p0.lineTo((t * (org.jfree.chart.util.ShapeUtilities.SQRT2)), 0.0F);
		p0.lineTo((l + t), (l - t));
		p0.lineTo((l - t), (l + t));
		p0.lineTo(0.0F, (t * (org.jfree.chart.util.ShapeUtilities.SQRT2)));
		p0.lineTo(((-l) + t), (l + t));
		p0.lineTo(((-l) - t), (l - t));
		p0.lineTo(((-t) * (org.jfree.chart.util.ShapeUtilities.SQRT2)), 0.0F);
		p0.closePath();
		return p0;
	}

	public static java.awt.Shape createRegularCross(float l, float t) {
		java.awt.geom.GeneralPath p0 = new java.awt.geom.GeneralPath();
		p0.moveTo((-l), t);
		p0.lineTo((-t), t);
		p0.lineTo((-t), l);
		p0.lineTo(t, l);
		p0.lineTo(t, t);
		p0.lineTo(l, t);
		p0.lineTo(l, (-t));
		p0.lineTo(t, (-t));
		p0.lineTo(t, (-l));
		p0.lineTo((-t), (-l));
		p0.lineTo((-t), (-t));
		p0.lineTo((-l), (-t));
		p0.closePath();
		return p0;
	}

	public static java.awt.Shape createDiamond(float s) {
		java.awt.geom.GeneralPath p0 = new java.awt.geom.GeneralPath();
		p0.moveTo(0.0F, (-s));
		p0.lineTo(s, 0.0F);
		p0.lineTo(0.0F, s);
		p0.lineTo((-s), 0.0F);
		p0.closePath();
		return p0;
	}

	public static java.awt.Shape createUpTriangle(float s) {
		java.awt.geom.GeneralPath p0 = new java.awt.geom.GeneralPath();
		p0.moveTo(0.0F, (-s));
		p0.lineTo(s, s);
		p0.lineTo((-s), s);
		p0.closePath();
		return p0;
	}

	public static java.awt.Shape createDownTriangle(float s) {
		java.awt.geom.GeneralPath p0 = new java.awt.geom.GeneralPath();
		p0.moveTo(0.0F, s);
		p0.lineTo(s, (-s));
		p0.lineTo((-s), (-s));
		p0.closePath();
		return p0;
	}

	public static java.awt.Shape createLineRegion(java.awt.geom.Line2D line, float width) {
		java.awt.geom.GeneralPath result = new java.awt.geom.GeneralPath();
		float x1 = ((float) (line.getX1()));
		float x2 = ((float) (line.getX2()));
		float y1 = ((float) (line.getY1()));
		float y2 = ((float) (line.getY2()));
		if ((x2 - x1) != 0.0) {
			double theta = java.lang.Math.atan(((y2 - y1) / (x2 - x1)));
			float dx = ((float) (java.lang.Math.sin(theta))) * width;
			float dy = ((float) (java.lang.Math.cos(theta))) * width;
			result.moveTo((x1 - dx), (y1 + dy));
			result.lineTo((x1 + dx), (y1 - dy));
			result.lineTo((x2 + dx), (y2 - dy));
			result.lineTo((x2 - dx), (y2 + dy));
			result.closePath();
		}else {
			result.moveTo((x1 - (width / 2.0F)), y1);
			result.lineTo((x1 + (width / 2.0F)), y1);
			result.lineTo((x2 + (width / 2.0F)), y2);
			result.lineTo((x2 - (width / 2.0F)), y2);
			result.closePath();
		}
		return result;
	}

	public static java.awt.geom.Point2D getPointInRectangle(double x, double y, java.awt.geom.Rectangle2D area) {
		x = java.lang.Math.max(area.getMinX(), java.lang.Math.min(x, area.getMaxX()));
		y = java.lang.Math.max(area.getMinY(), java.lang.Math.min(y, area.getMaxY()));
		return new java.awt.geom.Point2D.Double(x, y);
	}

	public static boolean contains(java.awt.geom.Rectangle2D rect1, java.awt.geom.Rectangle2D rect2) {
		double x0 = rect1.getX();
		double y0 = rect1.getY();
		double x = rect2.getX();
		double y = rect2.getY();
		double w = rect2.getWidth();
		double h = rect2.getHeight();
		return (((x >= x0) && (y >= y0)) && ((x + w) <= (x0 + (rect1.getWidth())))) && ((y + h) <= (y0 + (rect1.getHeight())));
	}

	public static boolean intersects(java.awt.geom.Rectangle2D rect1, java.awt.geom.Rectangle2D rect2) {
		double x0 = rect1.getX();
		double y0 = rect1.getY();
		double x = rect2.getX();
		double width = rect2.getWidth();
		double y = rect2.getY();
		double height = rect2.getHeight();
		return ((((x + width) >= x0) && ((y + height) >= y0)) && (x <= (x0 + (rect1.getWidth())))) && (y <= (y0 + (rect1.getHeight())));
	}
}

