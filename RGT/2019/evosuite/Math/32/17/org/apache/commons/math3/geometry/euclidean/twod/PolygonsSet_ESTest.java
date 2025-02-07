/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 16:49:56 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class PolygonsSet_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.0, 3668.577, 3.0, 3668.577);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet1.getVertices();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 5184.346662950138);
      bSPTree0.insertCut(line0);
      polygonsSet1.computeGeometricalProperties();
      assertNotSame(polygonsSet1, polygonsSet0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      polygonsSet0.computeGeometricalProperties();
      assertTrue(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, (-448.71836761), 1288.0406, 1105.975498594648);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-0.9999999999), 13.874244664780422, (-0.9999999999), 3.4028234663852886E38);
      double double0 = polygonsSet0.getSize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D[][] vector2DArray0 = polygonsSet0.getVertices();
      assertEquals(1, vector2DArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-13.87424466478042), 0.0, (-13.87424466478042), 0.3300893573730384);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = new Vector2D(24.8952410835961, 24.8952410835961);
      Line line0 = new Line(vector2D0, 1.0E-10);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Line line1 = new Line(vector2D0, 24.8952410835961);
      SubLine subLine1 = line1.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      SubLine subLine2 = new SubLine(vector2D0, vector2D0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine2);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        polygonsSet0.getBarycenter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }
}
