/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 04:45:52 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

public class Range_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      Range range1 = Range.expandToInclude(range0, 4454.8791375046);
      boolean boolean0 = range1.equals(range0);
      assertFalse(boolean0);
      assertFalse(range0.equals((Object)range1));
      assertEquals((-290.208145), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range(0.0, 102.73);
      Range range1 = Range.expand(range0, 3029.89160323, 34.5);
      assertEquals(102.73, range0.getLength(), 0.01);
      assertEquals((-153806.92469990897), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      Range range1 = Range.expandToInclude(range0, (-1.0));
      assertEquals((-0.5), range1.getCentralValue(), 0.01);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = new Range(216.782383718, 216.782383718);
      Range range1 = Range.expandToInclude(range0, (-1905.6607304));
      boolean boolean0 = range1.intersects((-1.0), 216.782383718);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects(2310.0359517754, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range(5751.0, 5751.0);
      boolean boolean0 = range0.intersects(1882.15, 1882.15);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range(1.0, 1142.3656);
      Range range1 = Range.shift(range0, 1.0, false);
      assertEquals(572.6828, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      Range range1 = Range.shift(range0, 1167.497864091735, false);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range((-2486.2), 399.002);
      Range range1 = Range.expandToInclude(range0, 3311.059);
      Range range2 = Range.shift(range1, (-32.57183275), false);
      assertEquals(5797.259, range2.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range((-2807.47), (-2807.47));
      Range range1 = Range.shift(range0, (-878.04752));
      boolean boolean0 = range1.equals(range0);
      assertEquals((-3685.51752), range1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      Range range1 = Range.shift(range0, 1167.497864091735);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range((-791.84386), 0.0);
      double double0 = range0.getUpperBound();
      assertEquals((-395.92193), range0.getCentralValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = new Range(216.782383718, 216.782383718);
      double double0 = range0.getUpperBound();
      assertEquals(216.782383718, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      double double0 = range0.getLowerBound();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range((-2486.2), 399.002);
      double double0 = range0.getLength();
      assertEquals(2885.2019999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getCentralValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range((-3914.4), 259.426175742);
      double double0 = range0.getCentralValue();
      assertEquals((-1827.486912129), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range(136.3, 136.3);
      Range range1 = Range.expandToInclude(range0, 136.3);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expandToInclude(range0, 54.290441144286);
      Range range2 = Range.expand(range1, 0.0, 0.0);
      assertEquals(54.290441144286, range2.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expand(range0, (-0.29654645776257804), 0.0);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = Range.combine((Range) null, (Range) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = new Range(5525.88032958, 5525.88032958);
      Range range1 = Range.combine(range0, range0);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = new Range(0.0, 102.73);
      Range range1 = Range.combine(range0, range0);
      assertEquals(102.73, range1.getLength(), 0.01);
  }

//   @Test(timeout = 4000)
//   public void test24()  throws Throwable  {
//       // Undeclared exception!
//       try { 
//         Range.shift((Range) null, (-1.656006777446982E7), true);
//         fail("Expecting exception: NullPointerException");
      
//       } catch(NullPointerException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

//   @Test(timeout = 4000)
//   public void test25()  throws Throwable  {
//       // Undeclared exception!
//       try { 
//         Range.shift((Range) null, 1.0);
//         fail("Expecting exception: NullPointerException");
      
//       } catch(NullPointerException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = new Range((-2486.2), 399.002);
      Range range1 = Range.shift(range0, (-32.57183275), false);
      assertEquals((-1076.1708327499998), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = new Range(1.0, 1142.3656);
      boolean boolean0 = range0.contains(3593.66911846838);
      assertFalse(boolean0);
      assertEquals(571.6828, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = new Range(5525.88032958, 5525.88032958);
      boolean boolean0 = range0.contains((-981.391779928));
      assertFalse(boolean0);
  }

//   @Test(timeout = 4000)
//   public void test29()  throws Throwable  {
//       Range range0 = null;
//       try {
//         range0 = new Range(289.38, (-1.0));
//         fail("Expecting exception: IllegalArgumentException");
      
//       } catch(IllegalArgumentException e) {
//          //
//          // Range(double, double): require lower (289.38) <= upper (-1.0).
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range((-2807.47), (-2807.47));
      double double0 = range0.getUpperBound();
      assertEquals((-2807.47), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range((-2807.47), (-2807.47));
      double double0 = range0.getLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = new Range((-3914.4), 259.426175742);
      double double0 = range0.getLowerBound();
      assertEquals(4173.8261757420005, range0.getLength(), 0.01);
      assertEquals((-3914.4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      Range range1 = Range.expandToInclude(range0, 1985.14962);
      boolean boolean0 = range0.equals(range1);
      assertEquals((-290.208145), range1.getLowerBound(), 0.01);
      assertFalse(range1.equals((Object)range0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range((-2807.47), (-2807.47));
      Range range1 = Range.shift(range0, (-2807.47), true);
      boolean boolean0 = range0.equals(range1);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = new Range(5751.0, 5751.0);
      boolean boolean0 = range0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      boolean boolean0 = range0.equals(range0);
      assertTrue(boolean0);
  }

//   @Test(timeout = 4000)
//   public void test37()  throws Throwable  {
//       // Undeclared exception!
//       try { 
//         Range.expand((Range) null, 693.05153533997, 693.05153533997);
//         fail("Expecting exception: IllegalArgumentException");
      
//       } catch(IllegalArgumentException e) {
//          //
//          // Null 'range' argument.
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      Range range1 = Range.expandToInclude(range0, (-290.208145));
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.combine(range0, (Range) null);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = new Range((-2807.47), (-2807.47));
      Range range1 = Range.combine((Range) null, range0);
      assertSame(range0, range1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = new Range(216.782383718, 216.782383718);
      double double0 = range0.constrain(216.782383718);
      assertEquals(216.782383718, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-471.85839357161194), true);
      Range range2 = Range.combine(range0, range1);
      Range range3 = Range.shift(range2, 101.717084617);
      boolean boolean0 = range3.intersects(0.0, (-471.85839357161194));
      assertEquals(0.0, range2.getUpperBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(471.85839357161194, range3.getLength(), 0.01);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range((-3914.4), 259.426175742);
      boolean boolean0 = range0.intersects((-1.0), (-1.0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      assertEquals(1.0, range0.getUpperBound(), 0.01);
      
      Range range1 = Range.shift(range0, 1.0);
      Range range2 = Range.expand(range1, (-1311.577901395), 1.0);
      boolean boolean0 = range2.intersects((-2184.2539758795033), 2.0);
      assertEquals(0.0, range2.getLength(), 0.01);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects(0.0, 1094.129524914096);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range(0.0, 1147.9255135);
      boolean boolean0 = range0.intersects(1147.9255135, 255.1955143632);
      assertEquals(573.96275675, range0.getCentralValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-0.29654645776257804), true);
      Range range2 = Range.expandToInclude(range1, 0.0);
      boolean boolean0 = range2.contains((-0.29654645776257804));
      assertEquals(0.0, range2.getUpperBound(), 0.01);
      assertEquals((-0.29654645776257804), range1.getCentralValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      double double0 = range0.constrain(0.0);
      assertEquals((-290.208145), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.constrain((-0.14827322888128902));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      String string0 = range0.toString();
      assertEquals("Range[-290.208145,-290.208145]", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Range range0 = new Range((-2170.36815), (-2170.36815));
      range0.hashCode();
      assertEquals((-2170.36815), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Range range0 = new Range(0.0, 1147.9255135);
      double double0 = range0.getCentralValue();
      assertEquals(573.96275675, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Range range0 = new Range((-290.208145), (-290.208145));
      assertEquals((-290.208145), range0.getLowerBound(), 0.01);
      
      Range range1 = Range.expand(range0, 1167.497864091735, (-290.208145));
      assertEquals(0.0, range1.getLength(), 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
  }
}
