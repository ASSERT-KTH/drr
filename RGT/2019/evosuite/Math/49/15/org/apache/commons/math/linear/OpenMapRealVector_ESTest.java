/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 01:00:19 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class OpenMapRealVector_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1358.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      openMapRealVector0.projection(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(4227);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector.OpenMapEntry openMapRealVector_OpenMapEntry0 = openMapRealVector0.new OpenMapEntry((OpenIntToDoubleHashMap.Iterator) null);
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapEntry0.getIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(153, 153, 887.032499);
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapSparseIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(0.0);
      assertEquals(0, openMapRealVector0.getDimension());
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      RealVector realVector0 = openMapRealVector0.add((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(2, realVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(0.0);
      assertEquals(6, openMapRealVector1.getDimension());
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double double1 = openMapRealVector0.getSparsity();
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(4174);
      // Undeclared exception!
      try { 
        openMapRealVector0.setSubVector(4174, (RealVector) openMapRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // index (4,174)
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2393, 2414);
      assertEquals(2393, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = null;
      try {
        openMapRealVector0 = new OpenMapRealVector(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-0.5));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(30, 580, 30);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.combineToSelf((double) 580, Double.POSITIVE_INFINITY, (RealVector) openMapRealVector0);
      openMapRealVector1.add((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 3914.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector0.set(0.0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      
      openMapRealVector0.setEntry(0, 244.93124058149155);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.add(openMapRealVector0);
      assertFalse(openMapRealVector2.equals((Object)openMapRealVector1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-0.5));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(openMapRealVector0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(5, 32, (-1612.67));
      Double[] doubleArray0 = new Double[2];
      doubleArray0[0] = (Double) 1.0E-12;
      doubleArray0[1] = (Double) 1.0E-12;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) arrayRealVector0);
      assertEquals(5, openMapRealVector0.getDimension());
      assertEquals(0.2857142857142857, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(12, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(191, 1265, (-1856.64056991));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      
      openMapRealVector1.mapAddToSelf(1265);
      double double0 = openMapRealVector0.dotProduct((RealVector) openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(16, 16);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      openMapRealVector0.dotProduct((RealVector) arrayRealVector0);
      assertEquals(16, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-4298.784006);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 843.4432605093;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 843.4432605093;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray0);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3914.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(0, 1);
      assertEquals(0.1111111111111111, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3914.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(8, 1);
      assertEquals(1, openMapRealVector1.getDimension());
      assertEquals(0.1111111111111111, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-5468.3210853415);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(0, 1);
      assertEquals(1, openMapRealVector1.getDimension());
      assertEquals(0.1111111111111111, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-4298.784006);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertArrayEquals(new double[] {(-4298.784006), 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-4298.784006);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-118.66080158552602);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      double double0 = openMapRealVector1.getDistance(openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(118.66080158552602, double0, 0.01);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(4227);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-4298.784006);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-356.033372736273));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector();
      double double1 = openMapRealVector1.getL1Distance(openMapRealVector0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(Double.NaN, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double double1 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3914.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.1111111111111111, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3914.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.1111111111111111, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(3914.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 3914.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = openMapRealVector0.combine(1.0E-12, 0.0, doubleArray0);
      openMapRealVector0.set(0.0);
      double double0 = openMapRealVector0.getLInfDistance(realVector0);
      assertEquals(3.9145E-9, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (-5468.3210853415);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector0.set(0.0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector1);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(618.6629866784);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = double0;
      doubleArray0[4] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.39549231485089675));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      double[] doubleArray1 = openMapRealVector0.getData();
      double double1 = openMapRealVector1.getLInfDistance(doubleArray1);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertArrayEquals(new double[] {618.6629866784, 618.6629866784, 618.6629866784, 618.6629866784, 618.6629866784}, doubleArray1, 0.01);
      assertEquals(618.2157730829, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1105.9833896547113;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.projection(doubleArray0);
      boolean boolean0 = openMapRealVector1.isInfinite();
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(726);
      double[] doubleArray0 = new double[5];
      doubleArray0[4] = Double.NEGATIVE_INFINITY;
      openMapRealVector0.setSubVector(477, doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertEquals(0.0013774104683195593, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-4298.784006);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertFalse(boolean0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.49999999999999994));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector1.isNaN();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1105.9833896547113;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      assertEquals(1, realMatrix0.getRowDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1105.9833896547113;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-118.66080158552602);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.subtract((RealVector) openMapRealVector0);
      assertFalse(openMapRealVector2.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector2, openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.125, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(693);
      assertEquals(693, openMapRealVector0.getDimension());
      
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(693);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-147), 79.12);
      // Undeclared exception!
      try { 
        openMapRealVector0.unitVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 0.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.hashCode();
      assertEquals(0.1111111111111111, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Object object0 = new Object();
      boolean boolean0 = openMapRealVector0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(8);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 8);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(16, openMapRealVector1.getDimension());
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 0.030589580535888672);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-4298.784006);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 3236.55413535524;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 3236.55413535524);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-118.66080158552602);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
  }
}
