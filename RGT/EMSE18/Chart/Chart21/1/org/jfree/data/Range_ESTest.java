/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 02:17:25 GMT 2017
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
      Range range0 = new Range((-1806.839), (-1806.839));
      range0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.expandToInclude(range0, 0.37571632914066777);
      boolean boolean0 = range1.equals(range0);
      assertEquals((-0.3121418354296661), range1.getCentralValue(), 0.01);
      assertFalse(range0.equals((Object)range1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-1196.65));
      boolean boolean0 = range0.equals(range1);
      assertEquals((-1196.65), range1.getLowerBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = new Range((-1.0), 4089.4236);
      Range range1 = Range.expand(range0, 4089.4236, (-1.0));
      assertEquals(4090.4236, range0.getLength(), 0.01);
      assertEquals((-8363738.40191848), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.expandToInclude(range0, 0.37571632914066777);
      Range range2 = Range.combine(range1, range0);
      assertEquals((-0.3121418354296661), range2.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range((-2.0), (-2.0));
      Range range1 = Range.combine((Range) null, range0);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range((-1.0), 4089.4236);
      boolean boolean0 = range0.intersects(0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range(254.81311496264848, 254.81311496264848);
      Range range1 = Range.shift(range0, (-3834.0), false);
      boolean boolean0 = range1.intersects(254.81311496264848, 4042.923614);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects(0.0, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range(0.0, 2622.8806106);
      Range range1 = Range.expand(range0, 0.0, 153.228673766709);
      Range range2 = Range.expandToInclude(range1, 2622.8806106);
      boolean boolean0 = range2.contains(2622.8806106);
      assertTrue(boolean0);
      assertEquals(202261.69901062697, range2.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range(0.0, 2622.8806106);
      Range range1 = Range.shift(range0, 1104.37042214468, true);
      assertEquals(2622.8806106, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.shift(range0, 0.0);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.shift(range0, 0.6005485449062167);
      assertEquals((-0.3994514550937833), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range(0.0, 461.5929802291585);
      double double0 = range0.getUpperBound();
      assertEquals(230.79649011457926, range0.getCentralValue(), 0.01);
      assertEquals(461.5929802291585, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      double double0 = range0.getLowerBound();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      double double0 = range0.getLowerBound();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range((-856.0), 1.0);
      double double0 = range0.getLength();
      assertEquals(857.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      double double0 = range0.getCentralValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      double double0 = range0.getCentralValue();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range((-3241.1349167816534), (-3241.1349167816534));
      Range range1 = Range.expandToInclude(range0, (-3241.1349167816534));
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 4011.292);
      assertEquals(4011.292, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      Range range1 = Range.expand(range0, 1.0, 1.0);
      assertTrue(range1.equals((Object)range0));
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.expand(range0, 0.0, 0.0);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      double double0 = range0.constrain((-630.3689));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      Range range1 = Range.combine(range0, range0);
      assertNotSame(range1, range0);
      assertEquals(1.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = new Range(0.0, 2622.8806106);
      Range range1 = Range.combine(range0, range0);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
      assertNotSame(range1, range0);
      assertEquals(1311.4403053, range1.getCentralValue(), 0.01);
  }

//   @Test(timeout = 4000)
//   public void test27()  throws Throwable  {
//       // Undeclared exception!
//       try { 
//         Range.shift((Range) null, (-3118.747031764), true);
//         fail("Expecting exception: NullPointerException");
      
//       } catch(NullPointerException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

//   @Test(timeout = 4000)
//   public void test28()  throws Throwable  {
//       // Undeclared exception!
//       try { 
//         Range.shift((Range) null, 698.23557);
//         fail("Expecting exception: NullPointerException");
      
//       } catch(NullPointerException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      boolean boolean0 = range0.contains(2349.348);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range((-457.7717208869538), (-457.7717208869538));
      double double0 = range0.getUpperBound();
      assertEquals((-457.7717208869538), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range(3073.367389249, 3073.367389249);
      double double0 = range0.getLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = new Range(0.0, 2622.8806106);
      double double0 = range0.getLowerBound();
      assertEquals(1311.4403053, range0.getCentralValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range(254.81311496264848, 254.81311496264848);
      Range range1 = Range.shift(range0, (-3834.0), false);
      boolean boolean0 = range1.equals(range0);
      assertFalse(boolean0);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range(3073.367389249, 3073.367389249);
      boolean boolean0 = range0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = new Range((-5.173026846563192), 4089.4236);
      boolean boolean0 = range0.equals(range0);
      assertTrue(boolean0);
      assertEquals(4094.596626846563, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      Range range1 = Range.shift(range0, 0.0, true);
      assertEquals(1.0, range1.getLength(), 0.01);
  }

//   @Test(timeout = 4000)
//   public void test37()  throws Throwable  {
//       // Undeclared exception!
//       try { 
//         Range.expand((Range) null, 4011.292, 511.2);
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
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expandToInclude(range0, (-1196.65));
      assertEquals((-598.325), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.combine(range0, (Range) null);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = Range.combine((Range) null, (Range) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.constrain((-1.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      double double0 = range0.constrain((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range(1.4523873875315796, 4089.4236);
      boolean boolean0 = range0.intersects(22.551231713381803, 1.0);
      assertFalse(boolean0);
      assertEquals(2045.4379936937657, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      boolean boolean0 = range0.intersects(0.0, (-7409.97176988487));
      assertEquals(1.0, range0.getLength(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      boolean boolean0 = range0.intersects(1.0, 1156.176807544);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      Range range1 = Range.shift(range0, 1.0);
      Range range2 = Range.shift(range1, 2223.68525309);
      boolean boolean0 = range2.intersects(403.77230510368, 240.82493698664);
      assertEquals(2224.18525309, range2.getCentralValue(), 0.01);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = new Range((-5.173026846563192), 4089.4236);
      boolean boolean0 = range0.intersects(0.0, 1.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      assertEquals((-1.0), range0.getLowerBound(), 0.01);
      
      Range range1 = Range.shift(range0, (-1.0), false);
      double double0 = range1.constrain((-1.0));
      assertEquals((-2.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = new Range(3073.367389249, 3073.367389249);
      boolean boolean0 = range0.contains(466.58622409613);
      assertFalse(boolean0);
  }

//   @Test(timeout = 4000)
//   public void test50()  throws Throwable  {
//       Range range0 = null;
//       try {
//         range0 = new Range(0.0, (-943.8585));
//         fail("Expecting exception: IllegalArgumentException");
      
//       } catch(IllegalArgumentException e) {
//          //
//          // Range(double, double): require lower (0.0) <= upper (-943.8585).
//          //
//          verifyException("org.jfree.data.Range", e);
//       }
//   }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Range range0 = new Range((-5.173026846563192), 4089.4236);
      String string0 = range0.toString();
      assertEquals("Range[-5.173026846563192,4089.4236]", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Range range0 = new Range((-5.173026846563192), 4089.4236);
      Range range1 = Range.shift(range0, 596.7575896273428);
      Range range2 = Range.shift(range1, (-5.173026846563192), true);
      boolean boolean0 = range0.equals(range2);
      assertFalse(range2.equals((Object)range0));
      assertEquals(4686.181189627343, range2.getLength(), 0.01);
      assertFalse(boolean0);
      assertEquals(4089.4236, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Range range0 = new Range((-5.173026846563192), 4089.4236);
      double double0 = range0.getCentralValue();
      assertEquals(2042.1252865767185, double0, 0.01);
  }
}
