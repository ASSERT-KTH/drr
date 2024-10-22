/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 21 22:25:43 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import javax.swing.JList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.jfree.chart.util.Size2D;
import org.junit.runner.RunWith;


public class ShapeUtilities_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle((-1.0F));
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) (-1.0F), Double.NaN);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(614.3479F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(883.4F, 673.33F, 673.33F, 883.4F);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle2D0, 0.0, 673.33F, (-914.2377F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, (-1656.677F));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1337.0162F, 1.0F, 1337.0162F, 1.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-3268.6633F), (-1244.43F));
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) arc2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      ArrayDeque<Point>[] arrayDequeArray0 = (ArrayDeque<Point>[]) Array.newInstance(ArrayDeque.class, 7);
      JList<ArrayDeque<Point>> jList0 = new JList<ArrayDeque<Point>>(arrayDequeArray0);
      Rectangle rectangle0 = jList0.getCellBounds(0, 14);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(1.0F, 1.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      line2D_Float0.y1 = (-75.5992F);
      Line2D.Float line2D_Float1 = (Line2D.Float)ShapeUtilities.clone(line2D_Float0);
      line2D_Float0.y1 = (-593.23F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Line2D.Double line2D_Double1 = new Line2D.Double((-3268.6), 0.0, (-3033.4503), 916.443);
      line2D_Double0.setLine((Line2D) line2D_Double1);
      line2D_Double0.y2 = (-322.872935851418);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double1, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1.7976931348623157E308, 345.1226501464844, (-589), 683.14479758305);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-3268.6633F), (-3268.6633F), (-3268.6633F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double();
      arc2D_Double1.setFrameFromDiagonal(0.0, 570.2859729, (-3383.0), 2195.41);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(0.0F, 0, 0.0F, 0.0F, (-582.649F), 2.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      arc2D_Double1.setAngles((Point2D) point2D_Float0, (Point2D) point2D_Float0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(1);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon();
      polygon1.addPoint(0, 47);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      int[] intArray0 = new int[3];
      polygon0.ypoints = intArray0;
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(2403.293F, 4750.727F);
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(2403.293F, 4750.727F);
      GeneralPath generalPath0 = new GeneralPath(0, 14);
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 47);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(1.0F, 1.0F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      GeneralPath generalPath1 = new GeneralPath(ellipse2D_Double0);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiamond((-808.0F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.rotateShape(line2D_Float0, 0.0F, 0.0F, 0.0F);
      assertNotNull(shape0);
      
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      GeneralPath generalPath1 = new GeneralPath(shape0);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape((Shape) arc2D_Double0, 1.0, 3710.966379);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, (double) 1173.7F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 2423.6007815, (-1401.300823752767));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Double0, point2D_Double0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle2D0, (RectangleAnchor) null, 0.0, 235.8255571653);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 0.0F, 0.0F);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-384.563F), (-384.563F), 1.0F, 0.0F);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 1173.7F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(989.94617F, 0.0F, 989.94617F, 1692.1935F);
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Float0);
      Rectangle rectangle0 = generalPath0.getBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createIntersection(rectangle0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = new Rectangle((-1), (-1), (-1), 409);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.setFrameFromCenter(0.0, 1.0, 1507.450726797734, 1.0);
      Rectangle2D.Double rectangle2D_Double1 = new Rectangle2D.Double(3126.520499878, 0.0, 1.0, 0.0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-1.0F), rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-1.0F), rectangleAnchor0);
      Rectangle2D rectangle2D1 = RectangleAnchor.createRectangle(size2D0, 0.0, 0.0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1615L), (-1615L), (-1615L), 1489.5F);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1615L), (-1615L), (-1615L), 1489.5F);
      rectangle2D_Float0.setFrameFromDiagonal((-2919.838907950319), (double) 1552L, (double) 1552L, Double.NaN);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-1.7976931348623157E308), 702.86389, rectangle2D_Float0);
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      Rectangle rectangle0 = line2D_Float0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)rectangle2D_Float0.createUnion(rectangle0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
      assertFalse(boolean0);
      assertEquals((-2920.0), rectangle2D_Double0.x, 0.01);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-464), (-464));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(989.94617F, 0.0F, 989.94617F, 1692.1935F);
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Float0);
      Rectangle rectangle0 = generalPath0.getBounds();
      rectangle0.y = 1073741824;
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle0);
      assertFalse(boolean0);
  }
}
