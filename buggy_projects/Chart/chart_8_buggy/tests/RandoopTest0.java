
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(100, (-1));
    int var9 = var7.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var10 = var7.previous();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.compareTo((java.lang.Object)var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     java.util.Calendar var6 = null;
//     long var7 = var5.getMiddleMillisecond(var6);
// 
//   }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Calendar var3 = null;
//     long var4 = var2.getMiddleMillisecond(var3);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var0 = null;
    java.util.TimeZone var1 = null;
    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(var0, var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = new org.jfree.data.time.Week(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    java.util.TimeZone var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getMiddleMillisecond(var6);
// 
//   }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(10, var1);
// 
//   }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.util.Calendar var1 = null;
//     var0.peg(var1);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    java.util.TimeZone var5 = null;
    org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
    java.util.TimeZone var7 = null;
    java.util.Locale var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(var4, var7, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     java.util.Calendar var2 = null;
//     long var3 = var0.getMiddleMillisecond(var2);
// 
//   }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.util.Calendar var7 = null;
//     long var8 = var2.getMiddleMillisecond(var7);
// 
//   }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, var1);
// 
//   }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     long var7 = var2.getSerialIndex();
//     java.util.Calendar var8 = null;
//     long var9 = var2.getFirstMillisecond(var8);
// 
//   }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    long var6 = var2.getSerialIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var7 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 47L);

  }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = org.jfree.data.time.RegularTimePeriod.downsize(var0);
// 
//   }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     java.util.Calendar var8 = null;
//     var2.peg(var8);
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.util.Calendar var1 = null;
//     long var2 = var0.getFirstMillisecond(var1);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), var1);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     java.util.Calendar var9 = null;
//     var2.peg(var9);
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
    java.util.TimeZone var6 = null;
    java.util.Locale var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var3, var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var3 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    java.util.TimeZone var5 = null;
    org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
    java.util.TimeZone var8 = null;
    java.util.Locale var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var4, var8, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getFirstMillisecond(var9);
// 
//   }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var7);
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(var7);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var10 = var0.compareTo((java.lang.Object)var9);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
    int var7 = var5.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var8 = var5.previous();
    long var9 = var5.getSerialIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var2.compareTo((java.lang.Object)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 47L);

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getFirstMillisecond(var6);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    java.util.TimeZone var5 = null;
    org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
    java.util.TimeZone var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var4, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Calendar var5 = null;
//     var4.peg(var5);
// 
//   }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var10 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
// 
//   }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, var1);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Calendar var4 = null;
//     long var5 = var0.getMiddleMillisecond(var4);
// 
//   }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.TimeZone var5 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var3, var5);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
// 
//   }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     java.util.Calendar var5 = null;
//     long var6 = var2.getFirstMillisecond(var5);
// 
//   }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var4);
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var4);
    java.util.TimeZone var7 = null;
    org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var7);
    java.util.TimeZone var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var4, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.util.Calendar var3 = null;
//     long var4 = var0.getFirstMillisecond(var3);
// 
//   }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getFirstMillisecond();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getLastMillisecond(var9);
// 
//   }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Calendar var18 = null;
//     long var19 = var2.getMiddleMillisecond(var18);
// 
//   }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.TimeZone var4 = null;
//     java.util.Locale var5 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var3, var4, var5);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
// 
//   }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(100, (-1));
//     int var14 = var12.compareTo((java.lang.Object)0L);
//     int var15 = var12.getWeek();
//     java.util.Date var16 = var12.getStart();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var17 = var2.compareTo((java.lang.Object)var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
// 
//   }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     java.util.Calendar var19 = null;
//     var2.peg(var19);
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     java.util.Calendar var7 = null;
//     long var8 = var2.getMiddleMillisecond(var7);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 100, -1");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     java.util.Date var13 = var12.getStart();
//     java.util.TimeZone var14 = null;
//     java.util.Locale var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var13, var14, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var9 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.util.TimeZone var14 = null;
//     java.util.Locale var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var12, var14, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.util.Calendar var11 = null;
//     var2.peg(var11);
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    java.util.TimeZone var5 = null;
    org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
    java.util.Date var8 = var7.getStart();
    java.util.TimeZone var9 = null;
    java.util.Locale var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var8, var9, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
//     java.lang.String var2 = var1.toString();
//     long var3 = var1.getMiddleMillisecond();
//     java.util.Date var4 = var1.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     java.util.TimeZone var8 = null;
//     java.util.Locale var9 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var4, var8, var9);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "Week 51, 2014"+ "'", var2.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var6);
// 
//   }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     java.util.TimeZone var6 = null;
//     java.util.Locale var7 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var3, var6, var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
// 
//   }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
//     java.lang.String var2 = var1.toString();
//     long var3 = var1.getMiddleMillisecond();
//     java.util.Date var4 = var1.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     java.util.Calendar var8 = null;
//     var7.peg(var8);
// 
//   }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getFirstMillisecond(var11);
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
    java.util.TimeZone var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var3, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var8);
    java.util.TimeZone var10 = null;
    java.util.Locale var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5, var10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), 0);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
//     int var7 = var5.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var8 = var5.previous();
//     long var9 = var8.getMiddleMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var10 = var2.compareTo((java.lang.Object)var8);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139585600001L));
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    java.lang.Class var0 = null;
    java.util.Date var1 = null;
    java.util.TimeZone var2 = null;
    org.jfree.data.time.RegularTimePeriod var3 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     org.jfree.data.time.RegularTimePeriod var6 = var4.next();
//     java.util.Calendar var7 = null;
//     long var8 = var4.getLastMillisecond(var7);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    int var5 = var3.getWeek();
    org.jfree.data.time.TimePeriodFormatException var7 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var9 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var7.addSuppressed((java.lang.Throwable)var9);
    org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var12.addSuppressed((java.lang.Throwable)var14);
    var7.addSuppressed((java.lang.Throwable)var14);
    boolean var17 = var3.equals((java.lang.Object)var7);
    int var18 = var3.getYearValue();
    java.util.Date var19 = var3.getStart();
    java.util.TimeZone var20 = null;
    org.jfree.data.time.RegularTimePeriod var21 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var19, var20);
    java.util.TimeZone var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(var19, var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var10 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    long var6 = var2.getSerialIndex();
    int var8 = var2.compareTo((java.lang.Object)0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var9 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 47L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     java.util.Calendar var4 = null;
//     long var5 = var2.getMiddleMillisecond(var4);
// 
//   }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     java.util.Calendar var8 = null;
//     long var9 = var7.getMiddleMillisecond(var8);
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    boolean var6 = var2.equals((java.lang.Object)(-1L));
    java.lang.String var7 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var8 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(2014, var1);
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     java.util.Calendar var20 = null;
//     long var21 = var2.getLastMillisecond(var20);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     java.util.Calendar var13 = null;
//     long var14 = var2.getMiddleMillisecond(var13);
// 
//   }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.util.Calendar var3 = null;
//     long var4 = var0.getMiddleMillisecond(var3);
// 
//   }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
//     java.lang.String var2 = var1.toString();
//     long var3 = var1.getMiddleMillisecond();
//     java.util.Date var4 = var1.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     java.util.Calendar var8 = null;
//     long var9 = var7.getFirstMillisecond(var8);
// 
//   }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     org.jfree.data.time.RegularTimePeriod var6 = var4.next();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     boolean var13 = var9.equals((java.lang.Object)(-1L));
//     java.lang.String var14 = var9.toString();
//     long var15 = var9.getMiddleMillisecond();
//     int var16 = var9.getWeek();
//     long var17 = var9.getFirstMillisecond();
//     java.lang.String var18 = var9.toString();
//     long var19 = var9.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var20 = var9.previous();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var21 = var4.compareTo((java.lang.Object)var20);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 100, -1"+ "'", var14.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var18 + "' != '" + "Week 100, -1"+ "'", var18.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var20 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == (-62138678400001L));
// 
//   }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     java.util.TimeZone var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var3, var6);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
// 
//   }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     java.util.Calendar var3 = null;
//     var0.peg(var3);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("org.jfree.data.time.TimePeriodFormatException: hi!");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     java.util.Calendar var11 = null;
//     long var12 = var10.getMiddleMillisecond(var11);
// 
//   }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     org.jfree.data.time.RegularTimePeriod var6 = var4.next();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var10 = var9.getEnd();
//     int var11 = var9.getWeek();
//     long var12 = var9.getSerialIndex();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var13 = var4.compareTo((java.lang.Object)var9);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    java.lang.Class var2 = null;
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var6 = var5.getEnd();
    java.util.TimeZone var7 = null;
    org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var2, var6, var7);
    java.util.TimeZone var9 = null;
    org.jfree.data.time.RegularTimePeriod var10 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var6, var9);
    java.util.TimeZone var11 = null;
    org.jfree.data.time.RegularTimePeriod var12 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var6, var11);
    java.util.TimeZone var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var6, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Date var4 = var0.getEnd();
//     java.util.Calendar var5 = null;
//     long var6 = var0.getLastMillisecond(var5);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     org.jfree.data.time.RegularTimePeriod var6 = var4.next();
//     java.util.Calendar var7 = null;
//     long var8 = var6.getMiddleMillisecond(var7);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     int var10 = var2.getYearValue();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getMiddleMillisecond(var11);
// 
//   }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Date var5 = var4.getStart();
//     int var7 = var4.compareTo((java.lang.Object)1);
//     java.util.Calendar var8 = null;
//     var4.peg(var8);
// 
//   }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.lang.Class var3 = null;
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var3, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     java.util.Date var11 = var10.getStart();
//     boolean var12 = var0.equals((java.lang.Object)var11);
//     java.util.TimeZone var13 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var11, var13);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var4 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var8);
    java.util.TimeZone var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var5, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     int var20 = var2.getWeek();
//     java.util.Calendar var21 = null;
//     long var22 = var2.getFirstMillisecond(var21);
// 
//   }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     java.util.Calendar var6 = null;
//     long var7 = var5.getFirstMillisecond(var6);
// 
//   }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     java.util.Date var10 = var2.getEnd();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, (-2015));
//     java.util.Calendar var3 = null;
//     long var4 = var2.getMiddleMillisecond(var3);
// 
//   }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     long var8 = var2.getSerialIndex();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getFirstMillisecond(var9);
// 
//   }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     int var5 = var2.getWeek();
//     java.util.Calendar var6 = null;
//     var2.peg(var6);
// 
//   }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     org.jfree.data.time.RegularTimePeriod var9 = var2.previous();
//     int var10 = var2.getWeek();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.lang.Class var3 = null;
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var3, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     java.util.Date var11 = var10.getStart();
//     boolean var12 = var0.equals((java.lang.Object)var11);
//     java.util.Calendar var13 = null;
//     long var14 = var0.getFirstMillisecond(var13);
// 
//   }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), 0);
//     java.util.Calendar var3 = null;
//     var2.peg(var3);
// 
//   }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    int var5 = var3.compareTo((java.lang.Object)0L);
    int var6 = var3.getWeek();
    java.util.Date var7 = var3.getStart();
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var7, var8);
    java.util.TimeZone var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var7, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.TimePeriodFormatException var5 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     int var6 = var2.compareTo((java.lang.Object)var5);
//     java.util.Calendar var7 = null;
//     long var8 = var2.getLastMillisecond(var7);
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     int var20 = var2.getWeek();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var21 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "Week 100, -1"+ "'", var16.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 100);
// 
//   }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 100);
//     java.util.Calendar var3 = null;
//     long var4 = var2.getLastMillisecond(var3);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
    org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var5);
    java.util.Date var9 = var8.getStart();
    java.util.TimeZone var10 = null;
    org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var9, var10);
    java.util.TimeZone var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var9, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     long var5 = var2.getMiddleMillisecond();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getLastMillisecond(var6);
// 
//   }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     boolean var6 = var4.equals((java.lang.Object)(-1));
//     java.util.Calendar var7 = null;
//     var4.peg(var7);
// 
//   }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: hi!");
//     boolean var16 = var13.equals((java.lang.Object)"org.jfree.data.time.TimePeriodFormatException: hi!");
//     java.util.Calendar var17 = null;
//     long var18 = var13.getMiddleMillisecond(var17);
// 
//   }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     org.jfree.data.time.RegularTimePeriod var9 = var2.previous();
//     long var10 = var2.getLastMillisecond();
//     java.util.Date var11 = var2.getEnd();
//     java.util.TimeZone var12 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var11, var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
// 
//   }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
//     java.lang.String var2 = var1.toString();
//     long var3 = var1.getMiddleMillisecond();
//     java.util.Date var4 = var1.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var4);
//     java.util.TimeZone var9 = null;
//     java.util.Locale var10 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var4, var9, var10);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "Week 51, 2014"+ "'", var2.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var6);
// 
//   }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     boolean var15 = var2.equals((java.lang.Object)10.0f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-2015));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
// 
//   }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.next();
//     long var14 = var2.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-62138980800001L));
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     java.lang.Class var2 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
//     java.lang.String var4 = var3.toString();
//     long var5 = var3.getMiddleMillisecond();
//     java.util.Date var6 = var3.getEnd();
//     java.util.TimeZone var7 = null;
//     org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var2, var6, var7);
//     java.util.TimeZone var9 = null;
//     org.jfree.data.time.RegularTimePeriod var10 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var6, var9);
//     java.util.TimeZone var11 = null;
//     org.jfree.data.time.RegularTimePeriod var12 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var6, var11);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var6);
//     java.util.TimeZone var14 = null;
//     java.util.Locale var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var6, var14, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var4 + "' != '" + "Week 51, 2014"+ "'", var4.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var12);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.next();
//     long var4 = var0.getFirstMillisecond();
//     java.util.Calendar var5 = null;
//     long var6 = var0.getLastMillisecond(var5);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    java.util.Date var5 = var2.getEnd();
    java.util.TimeZone var6 = null;
    java.util.Locale var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var5, var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("hi!");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(10, 100);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Week 10, 100"+ "'", var3.equals("Week 10, 100"));

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     java.util.Calendar var9 = null;
//     var2.peg(var9);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     java.util.Date var15 = var2.getEnd();
//     java.util.TimeZone var16 = null;
//     java.util.Locale var17 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var15, var16, var17);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     long var10 = var2.getSerialIndex();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
    java.util.TimeZone var10 = null;
    org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
    org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var5, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Date var5 = var4.getStart();
//     java.util.TimeZone var6 = null;
//     java.util.Locale var7 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var5, var6, var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
// 
//   }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, 0);
//     java.util.Calendar var3 = null;
//     long var4 = var2.getLastMillisecond(var3);
// 
//   }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     java.util.Calendar var17 = null;
//     var2.peg(var17);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
    org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var5);
    java.util.Date var9 = var8.getStart();
    java.util.TimeZone var10 = null;
    org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var9, var10);
    java.util.TimeZone var12 = null;
    java.util.Locale var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var9, var12, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-2015));
//     long var3 = var2.getSerialIndex();
//     java.util.Calendar var4 = null;
//     var2.peg(var4);
// 
//   }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     java.util.Calendar var15 = null;
//     long var16 = var11.getMiddleMillisecond(var15);
// 
//   }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     java.util.Date var8 = var7.getStart();
//     java.util.Calendar var9 = null;
//     var7.peg(var9);
// 
//   }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     java.util.Date var3 = var0.getStart();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     long var5 = var4.getSerialIndex();
//     java.util.Date var6 = var4.getStart();
//     java.util.Calendar var7 = null;
//     long var8 = var4.getMiddleMillisecond(var7);
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     long var6 = var4.getSerialIndex();
//     long var7 = var4.getFirstMillisecond();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(100, (-1));
//     int var12 = var10.compareTo((java.lang.Object)0L);
//     boolean var14 = var10.equals((java.lang.Object)(-1L));
//     java.lang.String var15 = var10.toString();
//     long var16 = var10.getMiddleMillisecond();
//     int var17 = var10.getWeek();
//     long var18 = var10.getFirstMillisecond();
//     java.lang.String var19 = var10.toString();
//     long var20 = var10.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var21 = var10.previous();
//     org.jfree.data.time.RegularTimePeriod var22 = var10.previous();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var23 = var4.compareTo((java.lang.Object)var22);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 106793L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "Week 100, -1"+ "'", var15.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var19 + "' != '" + "Week 100, -1"+ "'", var19.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, (-2015));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var3 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.RegularTimePeriod var5 = var4.previous();
//     int var6 = var4.getYearValue();
//     java.util.Date var7 = var4.getEnd();
//     java.util.Calendar var8 = null;
//     long var9 = var4.getFirstMillisecond(var8);
// 
//   }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     java.util.Date var10 = var2.getStart();
//     java.util.Calendar var11 = null;
//     var2.peg(var11);
// 
//   }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(100, (-1));
//     int var14 = var12.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var15 = var12.previous();
//     long var16 = var12.getSerialIndex();
//     int var17 = var12.getYearValue();
//     long var18 = var12.getFirstMillisecond();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
//     java.lang.String var20 = var19.toString();
//     long var21 = var19.getMiddleMillisecond();
//     java.util.Date var22 = var19.getEnd();
//     int var23 = var12.compareTo((java.lang.Object)var22);
//     java.util.Date var24 = var12.getStart();
//     int var25 = var2.compareTo((java.lang.Object)var24);
//     java.util.TimeZone var26 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(var24, var26);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "Week 51, 2014"+ "'", var20.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 1);
// 
//   }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     long var15 = var2.getFirstMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var16 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-62139283200000L));
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, (-2015));
    java.util.Date var3 = var2.getStart();
    java.util.TimeZone var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-2015), var1);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    int var5 = var2.getWeek();
    java.util.Date var6 = var2.getStart();
    java.util.TimeZone var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-2015));
//     long var3 = var2.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-125756078400001L));
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("org.jfree.data.time.TimePeriodFormatException: ");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     java.util.Calendar var4 = null;
//     var0.peg(var4);
// 
//   }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     long var7 = var2.getSerialIndex();
//     java.lang.String var8 = var2.toString();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getFirstMillisecond(var9);
// 
//   }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
//     java.lang.String var2 = var1.toString();
//     long var3 = var1.getMiddleMillisecond();
//     java.util.Date var4 = var1.getEnd();
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var4);
//     java.util.Date var6 = var5.getStart();
//     java.util.TimeZone var7 = null;
//     org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var6, var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "Week 51, 2014"+ "'", var2.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var8);
// 
//   }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     org.jfree.data.time.RegularTimePeriod var14 = var2.previous();
//     java.util.Calendar var15 = null;
//     long var16 = var2.getFirstMillisecond(var15);
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     long var8 = var2.getSerialIndex();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getLastMillisecond(var9);
// 
//   }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 51, 2014");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 100);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
//     java.lang.String var3 = var2.toString();
//     long var4 = var2.getMiddleMillisecond();
//     java.util.Date var5 = var2.getEnd();
//     java.util.TimeZone var6 = null;
//     org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var8);
//     java.util.TimeZone var10 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var5, var10);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var3 + "' != '" + "Week 51, 2014"+ "'", var3.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
// 
//   }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     java.util.Date var3 = var0.getStart();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     long var5 = var4.getSerialIndex();
//     java.util.Calendar var6 = null;
//     var4.peg(var6);
// 
//   }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     java.util.Date var10 = var2.getEnd();
//     long var11 = var2.getFirstMillisecond();
//     java.util.Calendar var12 = null;
//     long var13 = var2.getFirstMillisecond(var12);
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     java.util.Calendar var2 = null;
//     long var3 = var1.getMiddleMillisecond(var2);
// 
//   }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     java.util.Date var20 = var2.getStart();
//     java.util.TimeZone var21 = null;
//     java.util.Locale var22 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(var20, var21, var22);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     java.util.Date var5 = var0.getStart();
//     java.util.TimeZone var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5, var6);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     org.jfree.data.time.RegularTimePeriod var9 = var2.previous();
//     long var10 = var2.getLastMillisecond();
//     java.util.Date var11 = var2.getEnd();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var12 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     java.util.Date var3 = var0.getStart();
//     java.util.TimeZone var4 = null;
//     java.util.Locale var5 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var3, var4, var5);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
// 
//   }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     org.jfree.data.time.RegularTimePeriod var14 = var2.previous();
//     long var15 = var14.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-62139585600001L));
// 
//   }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, var1);
// 
//   }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     java.util.Calendar var7 = null;
//     long var8 = var2.getFirstMillisecond(var7);
// 
//   }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     java.util.Calendar var25 = null;
//     long var26 = var2.getFirstMillisecond(var25);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    int var5 = var2.getWeek();
    java.util.Date var6 = var2.getStart();
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var6);
    java.util.TimeZone var8 = null;
    java.util.Locale var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var6, var8, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var8);
    org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var11 = null;
    java.util.Locale var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5, var11, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test158() {}
//   public void test158() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.previous();
//     java.util.Date var8 = var2.getEnd();
//     long var9 = var2.getLastMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138678400001L));
// 
//   }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     java.util.Calendar var14 = null;
//     long var15 = var2.getLastMillisecond(var14);
// 
//   }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     java.util.Calendar var20 = null;
//     var2.peg(var20);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    long var6 = var2.getSerialIndex();
    long var7 = var2.getSerialIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var8 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 47L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 47L);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     java.util.Calendar var14 = null;
//     var9.peg(var14);
// 
//   }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     long var8 = var7.getLastMillisecond();
//     long var9 = var7.getSerialIndex();
//     java.util.Calendar var10 = null;
//     long var11 = var7.getFirstMillisecond(var10);
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    int var5 = var2.getWeek();
    java.util.Date var6 = var2.getStart();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var7 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(48, var1);
// 
//   }

  public void test166() {}
//   public void test166() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
//     java.lang.String var14 = var13.toString();
//     long var15 = var13.getMiddleMillisecond();
//     java.util.Date var16 = var13.getEnd();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var16);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var16);
//     boolean var19 = var9.equals((java.lang.Object)var18);
//     long var20 = var18.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     java.util.Date var22 = var18.getEnd();
//     int var23 = var5.compareTo((java.lang.Object)var22);
//     org.jfree.data.time.Week var26 = new org.jfree.data.time.Week(100, (-1));
//     int var28 = var26.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var29 = var26.previous();
//     long var30 = var26.getSerialIndex();
//     int var31 = var26.getYearValue();
//     long var32 = var26.getFirstMillisecond();
//     int var33 = var26.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var34 = var26.next();
//     boolean var35 = var5.equals((java.lang.Object)var34);
//     org.jfree.data.time.RegularTimePeriod var36 = var5.previous();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 51, 2014"+ "'", var14.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var32 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
// 
//   }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Date var4 = var0.getEnd();
//     java.util.Date var5 = var0.getStart();
//     java.util.TimeZone var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5, var6);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
// 
//   }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     java.lang.Class var10 = null;
//     java.lang.Class var11 = null;
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var15 = var14.getEnd();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var15);
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var15);
//     java.util.TimeZone var18 = null;
//     org.jfree.data.time.RegularTimePeriod var19 = org.jfree.data.time.RegularTimePeriod.createInstance(var11, var15, var18);
//     java.util.TimeZone var20 = null;
//     org.jfree.data.time.RegularTimePeriod var21 = org.jfree.data.time.RegularTimePeriod.createInstance(var10, var15, var20);
//     org.jfree.data.time.Week var22 = new org.jfree.data.time.Week(var15);
//     org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(var15);
//     boolean var24 = var2.equals((java.lang.Object)var15);
//     java.util.Calendar var25 = null;
//     var2.peg(var25);
// 
//   }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     long var1 = var0.getLastMillisecond();
//     java.util.Calendar var2 = null;
//     var0.peg(var2);
// 
//   }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.util.Date var14 = var2.getStart();
//     java.util.TimeZone var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var14, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
// 
//   }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
//     int var7 = var5.compareTo((java.lang.Object)0L);
//     boolean var9 = var5.equals((java.lang.Object)(byte)1);
//     long var10 = var5.getSerialIndex();
//     int var11 = var2.compareTo((java.lang.Object)var10);
//     java.util.Calendar var12 = null;
//     var2.peg(var12);
// 
//   }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     java.lang.String var4 = var0.toString();
//     java.util.Calendar var5 = null;
//     var0.peg(var5);
// 
//   }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    java.util.Date var5 = var2.getEnd();
    java.util.TimeZone var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable[] var11 = var8.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var13.addSuppressed((java.lang.Throwable)var15);
    org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var18.addSuppressed((java.lang.Throwable)var20);
    var13.addSuppressed((java.lang.Throwable)var20);
    java.lang.Throwable[] var23 = var20.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var25 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var27 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var25.addSuppressed((java.lang.Throwable)var27);
    var20.addSuppressed((java.lang.Throwable)var27);
    var8.addSuppressed((java.lang.Throwable)var27);
    org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("Week 51, 2014");
    org.jfree.data.time.TimePeriodFormatException var34 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var36 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var34.addSuppressed((java.lang.Throwable)var36);
    org.jfree.data.time.TimePeriodFormatException var39 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var41 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var39.addSuppressed((java.lang.Throwable)var41);
    var34.addSuppressed((java.lang.Throwable)var41);
    java.lang.Throwable[] var44 = var41.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var46 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var48 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var46.addSuppressed((java.lang.Throwable)var48);
    var41.addSuppressed((java.lang.Throwable)var48);
    java.lang.String var51 = var48.toString();
    var32.addSuppressed((java.lang.Throwable)var48);
    var27.addSuppressed((java.lang.Throwable)var32);
    java.lang.String var54 = var32.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var51.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: Week 51, 2014"+ "'", var54.equals("org.jfree.data.time.TimePeriodFormatException: Week 51, 2014"));

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Date var5 = var4.getStart();
//     int var7 = var4.compareTo((java.lang.Object)1);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(100, (-1));
//     int var12 = var10.compareTo((java.lang.Object)0L);
//     boolean var14 = var10.equals((java.lang.Object)(-1L));
//     java.lang.String var15 = var10.toString();
//     long var16 = var10.getMiddleMillisecond();
//     int var17 = var10.getWeek();
//     long var18 = var10.getFirstMillisecond();
//     java.lang.String var19 = var10.toString();
//     org.jfree.data.time.RegularTimePeriod var20 = var10.next();
//     org.jfree.data.time.RegularTimePeriod var21 = var10.next();
//     boolean var22 = var4.equals((java.lang.Object)var10);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var23 = var10.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "Week 100, -1"+ "'", var15.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var19 + "' != '" + "Week 100, -1"+ "'", var19.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == false);
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    java.util.Date var0 = null;
    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     long var3 = var2.getMiddleMillisecond();
//     long var4 = var2.getSerialIndex();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 47L);
// 
//   }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     java.util.Date var10 = var2.getEnd();
//     java.util.TimeZone var11 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var10, var11);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
// 
//   }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var8 = var2.previous();
//     int var9 = var2.getWeek();
//     long var10 = var2.getSerialIndex();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     int var15 = var13.compareTo((java.lang.Object)0L);
//     boolean var17 = var13.equals((java.lang.Object)(-1L));
//     java.lang.String var18 = var13.toString();
//     org.jfree.data.time.RegularTimePeriod var19 = var13.next();
//     long var20 = var19.getMiddleMillisecond();
//     java.util.Date var21 = var19.getEnd();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var22 = var2.compareTo((java.lang.Object)var19);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var18 + "' != '" + "Week 100, -1"+ "'", var18.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == (-62167406400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
// 
//   }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     int var9 = var2.compareTo((java.lang.Object)0.0d);
//     java.util.Calendar var10 = null;
//     long var11 = var2.getMiddleMillisecond(var10);
// 
//   }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     java.util.Date var20 = var2.getStart();
//     org.jfree.data.time.RegularTimePeriod var21 = var2.next();
//     java.util.Calendar var22 = null;
//     long var23 = var2.getLastMillisecond(var22);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     java.util.Calendar var5 = null;
//     long var6 = var4.getMiddleMillisecond(var5);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    int var5 = var3.getWeek();
    org.jfree.data.time.TimePeriodFormatException var7 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var9 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var7.addSuppressed((java.lang.Throwable)var9);
    org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var12.addSuppressed((java.lang.Throwable)var14);
    var7.addSuppressed((java.lang.Throwable)var14);
    boolean var17 = var3.equals((java.lang.Object)var7);
    int var18 = var3.getYearValue();
    java.util.Date var19 = var3.getStart();
    java.util.TimeZone var20 = null;
    org.jfree.data.time.RegularTimePeriod var21 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var19, var20);
    java.util.TimeZone var22 = null;
    java.util.Locale var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var24 = new org.jfree.data.time.Week(var19, var22, var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     long var1 = var0.getLastMillisecond();
//     java.util.Calendar var2 = null;
//     long var3 = var0.getFirstMillisecond(var2);
// 
//   }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    java.lang.String var5 = var2.toString();
    org.jfree.data.time.RegularTimePeriod var6 = var2.next();
    java.util.Date var7 = var6.getStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Week 100, -1"+ "'", var5.equals("Week 100, -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.next();
//     int var4 = var0.getWeek();
//     int var5 = var0.getYearValue();
//     long var6 = var0.getSerialIndex();
//     java.util.Calendar var7 = null;
//     var0.peg(var7);
// 
//   }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getSerialIndex();
//     java.util.Date var12 = var2.getEnd();
//     java.util.TimeZone var13 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var12, var13);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
// 
//   }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     long var5 = var2.getMiddleMillisecond();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getFirstMillisecond(var6);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var3 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 0);
//     org.jfree.data.time.RegularTimePeriod var3 = var2.next();
//     long var4 = var2.getSerialIndex();
//     java.util.Calendar var5 = null;
//     long var6 = var2.getMiddleMillisecond(var5);
// 
//   }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
//     int var7 = var5.compareTo((java.lang.Object)0L);
//     boolean var9 = var5.equals((java.lang.Object)(byte)1);
//     long var10 = var5.getSerialIndex();
//     int var11 = var2.compareTo((java.lang.Object)var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week();
//     java.lang.String var13 = var12.toString();
//     org.jfree.data.time.RegularTimePeriod var14 = var12.next();
//     java.util.Date var15 = var12.getStart();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var15);
//     long var17 = var16.getSerialIndex();
//     java.util.Date var18 = var16.getStart();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     java.util.TimeZone var20 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var21 = new org.jfree.data.time.Week(var18, var20);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var13 + "' != '" + "Week 51, 2014"+ "'", var13.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 106793L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
// 
//   }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(0, 10);
//     int var28 = var2.compareTo((java.lang.Object)10);
//     org.jfree.data.time.Week var31 = new org.jfree.data.time.Week(100, (-1));
//     int var33 = var31.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var34 = var31.previous();
//     org.jfree.data.time.Week var35 = new org.jfree.data.time.Week();
//     java.lang.String var36 = var35.toString();
//     long var37 = var35.getMiddleMillisecond();
//     java.util.Date var38 = var35.getEnd();
//     org.jfree.data.time.Week var39 = new org.jfree.data.time.Week(var38);
//     org.jfree.data.time.Week var40 = new org.jfree.data.time.Week(var38);
//     boolean var41 = var31.equals((java.lang.Object)var40);
//     long var42 = var40.getMiddleMillisecond();
//     boolean var43 = var2.equals((java.lang.Object)var40);
//     java.util.Calendar var44 = null;
//     long var45 = var2.getLastMillisecond(var44);
// 
//   }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     java.util.Calendar var5 = null;
//     long var6 = var0.getFirstMillisecond(var5);
// 
//   }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     java.util.Date var20 = var2.getStart();
//     org.jfree.data.time.RegularTimePeriod var21 = var2.next();
//     org.jfree.data.time.Week var24 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var25 = var24.getEnd();
//     int var26 = var24.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var28 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var30 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var28.addSuppressed((java.lang.Throwable)var30);
//     org.jfree.data.time.TimePeriodFormatException var33 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var33.addSuppressed((java.lang.Throwable)var35);
//     var28.addSuppressed((java.lang.Throwable)var35);
//     boolean var38 = var24.equals((java.lang.Object)var28);
//     int var39 = var24.getYearValue();
//     java.util.Date var40 = var24.getStart();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var41 = var2.compareTo((java.lang.Object)var24);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var38 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var39 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
// 
//   }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     java.util.Calendar var25 = null;
//     long var26 = var2.getLastMillisecond(var25);
// 
//   }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     java.util.TimeZone var6 = null;
//     org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var5);
//     java.util.Calendar var11 = null;
//     long var12 = var10.getFirstMillisecond(var11);
// 
//   }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     java.util.Date var20 = var2.getStart();
//     org.jfree.data.time.RegularTimePeriod var21 = var2.next();
//     java.util.Calendar var22 = null;
//     long var23 = var2.getMiddleMillisecond(var22);
// 
//   }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     int var15 = var2.getYearValue();
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(100, (-1));
//     int var20 = var18.compareTo((java.lang.Object)0L);
//     boolean var22 = var18.equals((java.lang.Object)(-1L));
//     int var24 = var18.compareTo((java.lang.Object)(-1.0f));
//     long var25 = var18.getFirstMillisecond();
//     int var26 = var18.getYearValue();
//     org.jfree.data.time.Week var29 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var30 = var29.getEnd();
//     int var31 = var29.getWeek();
//     java.util.Date var32 = var29.getEnd();
//     boolean var33 = var18.equals((java.lang.Object)var32);
//     boolean var34 = var2.equals((java.lang.Object)var18);
//     java.util.Calendar var35 = null;
//     long var36 = var18.getMiddleMillisecond(var35);
// 
//   }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.previous();
//     java.util.Calendar var8 = null;
//     long var9 = var7.getMiddleMillisecond(var8);
// 
//   }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    java.util.TimeZone var5 = null;
    org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
    java.util.Date var8 = var7.getStart();
    java.util.TimeZone var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var8, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.RegularTimePeriod var5 = var4.previous();
//     java.util.Calendar var6 = null;
//     var4.peg(var6);
// 
//   }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var10 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     int var15 = var2.getYearValue();
//     java.util.Calendar var16 = null;
//     var2.peg(var16);
// 
//   }

  public void test204() {}
//   public void test204() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     java.util.Calendar var11 = null;
//     var2.peg(var11);
// 
//   }

  public void test205() {}
//   public void test205() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     long var15 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var16 = var2.next();
//     java.util.Calendar var17 = null;
//     var2.peg(var17);
// 
//   }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 1);
//     java.lang.Object var3 = null;
//     boolean var4 = var2.equals(var3);
//     java.util.Calendar var5 = null;
//     long var6 = var2.getFirstMillisecond(var5);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, 0);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Calendar var18 = null;
//     var2.peg(var18);
// 
//   }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.RegularTimePeriod var5 = var4.previous();
//     java.util.Calendar var6 = null;
//     long var7 = var4.getFirstMillisecond(var6);
// 
//   }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 0, 1");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getLastMillisecond();
//     java.util.Date var12 = var2.getStart();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var14 = var13.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
// 
//   }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     java.util.Calendar var6 = null;
//     long var7 = var4.getFirstMillisecond(var6);
// 
//   }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     long var1 = var0.getFirstMillisecond();
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
//     java.lang.String var3 = var2.toString();
//     long var4 = var2.getMiddleMillisecond();
//     java.util.Date var5 = var2.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.RegularTimePeriod var7 = var6.next();
//     boolean var8 = var0.equals((java.lang.Object)var7);
//     java.util.Date var9 = var7.getEnd();
//     java.util.TimeZone var10 = null;
//     java.util.Locale var11 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var9, var10, var11);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var3 + "' != '" + "Week 51, 2014"+ "'", var3.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
// 
//   }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     java.util.Date var15 = var2.getEnd();
//     org.jfree.data.time.RegularTimePeriod var16 = var2.next();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var17 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
// 
//   }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), (-1));
//     org.jfree.data.time.RegularTimePeriod var3 = var2.previous();
//     org.jfree.data.time.RegularTimePeriod var4 = var2.next();
//     java.util.Calendar var5 = null;
//     long var6 = var2.getLastMillisecond(var5);
// 
//   }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     java.util.Calendar var6 = null;
//     long var7 = var5.getMiddleMillisecond(var6);
// 
//   }

  public void test217() {}
//   public void test217() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     java.util.Date var3 = var0.getStart();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.lang.Object var5 = null;
//     boolean var6 = var4.equals(var5);
//     java.lang.Object var7 = null;
//     boolean var8 = var4.equals(var7);
//     int var9 = var4.getWeek();
//     java.util.Calendar var10 = null;
//     long var11 = var4.getFirstMillisecond(var10);
// 
//   }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var8 = var2.previous();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getFirstMillisecond(var9);
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     java.lang.String var5 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var6 = var2.next();
//     java.util.Calendar var7 = null;
//     long var8 = var2.getLastMillisecond(var7);
// 
//   }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     java.lang.String var10 = var2.toString();
//     long var11 = var2.getLastMillisecond();
//     java.util.Calendar var12 = null;
//     long var13 = var2.getLastMillisecond(var12);
// 
//   }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     org.jfree.data.time.RegularTimePeriod var14 = var2.previous();
//     org.jfree.data.time.RegularTimePeriod var15 = var2.next();
//     java.util.Calendar var16 = null;
//     long var17 = var15.getMiddleMillisecond(var16);
// 
//   }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     long var10 = var2.getSerialIndex();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getFirstMillisecond(var11);
// 
//   }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(100, (-1));
//     int var14 = var12.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var15 = var12.previous();
//     long var16 = var12.getSerialIndex();
//     int var17 = var12.getYearValue();
//     long var18 = var12.getFirstMillisecond();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
//     java.lang.String var20 = var19.toString();
//     long var21 = var19.getMiddleMillisecond();
//     java.util.Date var22 = var19.getEnd();
//     int var23 = var12.compareTo((java.lang.Object)var22);
//     java.util.Date var24 = var12.getStart();
//     int var25 = var2.compareTo((java.lang.Object)var24);
//     org.jfree.data.time.Week var28 = new org.jfree.data.time.Week(100, (-1));
//     int var30 = var28.compareTo((java.lang.Object)0L);
//     boolean var32 = var28.equals((java.lang.Object)(-1L));
//     java.lang.String var33 = var28.toString();
//     org.jfree.data.time.RegularTimePeriod var34 = var28.next();
//     long var35 = var34.getMiddleMillisecond();
//     java.util.Date var36 = var34.getEnd();
//     int var37 = var2.compareTo((java.lang.Object)var36);
//     java.util.TimeZone var38 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var39 = new org.jfree.data.time.Week(var36, var38);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "Week 51, 2014"+ "'", var20.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var32 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var33 + "' != '" + "Week 100, -1"+ "'", var33.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == (-62167406400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == 1);
// 
//   }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
//     java.lang.String var14 = var13.toString();
//     long var15 = var13.getMiddleMillisecond();
//     java.util.Date var16 = var13.getEnd();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var16);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var16);
//     boolean var19 = var9.equals((java.lang.Object)var18);
//     long var20 = var18.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     java.util.Date var22 = var18.getEnd();
//     int var23 = var5.compareTo((java.lang.Object)var22);
//     java.util.TimeZone var24 = null;
//     java.util.Locale var25 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var26 = new org.jfree.data.time.Week(var22, var24, var25);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 51, 2014"+ "'", var14.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
// 
//   }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.util.Date var14 = var2.getStart();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var15 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
// 
//   }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getSerialIndex();
//     java.util.Calendar var12 = null;
//     long var13 = var2.getFirstMillisecond(var12);
// 
//   }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     org.jfree.data.time.RegularTimePeriod var9 = var2.previous();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var13 = var12.getEnd();
//     long var14 = var12.getFirstMillisecond();
//     java.util.Date var15 = var12.getStart();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var16 = var2.compareTo((java.lang.Object)var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     int var15 = var2.getYearValue();
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(100, (-1));
//     int var20 = var18.compareTo((java.lang.Object)0L);
//     boolean var22 = var18.equals((java.lang.Object)(-1L));
//     int var24 = var18.compareTo((java.lang.Object)(-1.0f));
//     long var25 = var18.getFirstMillisecond();
//     int var26 = var18.getYearValue();
//     org.jfree.data.time.Week var29 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var30 = var29.getEnd();
//     int var31 = var29.getWeek();
//     java.util.Date var32 = var29.getEnd();
//     boolean var33 = var18.equals((java.lang.Object)var32);
//     boolean var34 = var2.equals((java.lang.Object)var18);
//     org.jfree.data.time.Week var37 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var38 = var37.getEnd();
//     org.jfree.data.time.Week var39 = new org.jfree.data.time.Week(var38);
//     boolean var41 = var39.equals((java.lang.Object)(-1));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var42 = var2.compareTo((java.lang.Object)var39);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 100, -1"+ "'", var14.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var41 == false);
// 
//   }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var7 = var5.previous();
//     java.util.Calendar var8 = null;
//     long var9 = var5.getLastMillisecond(var8);
// 
//   }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var12.addSuppressed((java.lang.Throwable)var14);
//     org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var19 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var17.addSuppressed((java.lang.Throwable)var19);
//     var12.addSuppressed((java.lang.Throwable)var19);
//     java.lang.Throwable[] var22 = var19.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var24 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var26 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var24.addSuppressed((java.lang.Throwable)var26);
//     var19.addSuppressed((java.lang.Throwable)var26);
//     org.jfree.data.time.TimePeriodFormatException var30 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var30.addSuppressed((java.lang.Throwable)var32);
//     org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var37 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var35.addSuppressed((java.lang.Throwable)var37);
//     java.lang.String var39 = var35.toString();
//     java.lang.String var40 = var35.toString();
//     var32.addSuppressed((java.lang.Throwable)var35);
//     java.lang.String var42 = var35.toString();
//     var19.addSuppressed((java.lang.Throwable)var35);
//     boolean var44 = var2.equals((java.lang.Object)var35);
//     java.util.Date var45 = var2.getStart();
//     java.util.Calendar var46 = null;
//     var2.peg(var46);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 10, 100");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test232() {}
//   public void test232() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     java.util.Date var2 = var0.getStart();
//     java.util.Calendar var3 = null;
//     long var4 = var0.getLastMillisecond(var3);
// 
//   }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Date var4 = var0.getEnd();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     java.lang.String var10 = var6.toString();
//     java.lang.String var11 = var6.toString();
//     int var12 = var0.compareTo((java.lang.Object)var6);
//     java.lang.String var13 = var6.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var10.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var11.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var13 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var13.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
// 
//   }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
    boolean var6 = var4.equals((java.lang.Object)(-1));
    long var7 = var4.getSerialIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var8 = var4.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101L);

  }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     java.util.Date var15 = var11.getEnd();
//     java.util.Calendar var16 = null;
//     long var17 = var11.getFirstMillisecond(var16);
// 
//   }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.toString();
    var3.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var13 = var3.toString();
    org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var15.addSuppressed((java.lang.Throwable)var17);
    org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var22 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var20.addSuppressed((java.lang.Throwable)var22);
    java.lang.String var24 = var20.toString();
    java.lang.String var25 = var20.toString();
    var17.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var27 = var20.toString();
    java.lang.Throwable[] var28 = var20.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var20);
    java.lang.Throwable[] var30 = var20.getSuppressed();
    java.lang.Throwable[] var31 = var20.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var10.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var11.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var13.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var24.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var25.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var27.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     java.util.Calendar var15 = null;
//     var2.peg(var15);
// 
//   }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Date var5 = var4.getStart();
//     int var7 = var4.compareTo((java.lang.Object)1);
//     java.util.Calendar var8 = null;
//     long var9 = var4.getFirstMillisecond(var8);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 48, 1");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     long var3 = var2.getMiddleMillisecond();
//     int var4 = var2.getWeek();
//     int var6 = var2.compareTo((java.lang.Object)(byte)1);
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    int var5 = var3.compareTo((java.lang.Object)0L);
    int var6 = var3.getWeek();
    java.util.Date var7 = var3.getStart();
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var7, var8);
    org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
    java.util.TimeZone var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var7, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.RegularTimePeriod var4 = var2.next();
//     java.util.Calendar var5 = null;
//     long var6 = var2.getMiddleMillisecond(var5);
// 
//   }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var11.addSuppressed((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var13);
    boolean var16 = var2.equals((java.lang.Object)var6);
    int var17 = var2.getYearValue();
    org.jfree.data.time.Week var20 = new org.jfree.data.time.Week(51, 1);
    int var21 = var2.compareTo((java.lang.Object)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var22 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getFirstMillisecond();
//     java.util.Date var9 = var2.getEnd();
//     int var10 = var2.getYearValue();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.next();
//     int var4 = var0.getWeek();
//     int var5 = var0.getYearValue();
//     long var6 = var0.getSerialIndex();
//     java.util.Calendar var7 = null;
//     long var8 = var0.getMiddleMillisecond(var7);
// 
//   }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     long var2 = var0.getSerialIndex();
//     java.util.Calendar var3 = null;
//     long var4 = var0.getFirstMillisecond(var3);
// 
//   }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     java.util.Calendar var15 = null;
//     long var16 = var2.getMiddleMillisecond(var15);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(48, 1);

  }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, (-1));
//     int var3 = var2.getWeek();
//     int var4 = var2.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var5 = var2.next();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getMiddleMillisecond(var6);
// 
//   }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     boolean var15 = var2.equals((java.lang.Object)var13);
//     java.lang.Throwable[] var16 = var13.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("");
//     var13.addSuppressed((java.lang.Throwable)var18);
//     java.lang.String var20 = var18.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: "+ "'", var20.equals("org.jfree.data.time.TimePeriodFormatException: "));
// 
//   }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     boolean var7 = var3.equals((java.lang.Object)(-1L));
//     long var8 = var3.getSerialIndex();
//     boolean var9 = var0.equals((java.lang.Object)var8);
//     long var10 = var0.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1418846399999L);
// 
//   }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     int var4 = var0.getYearValue();
//     java.lang.String var5 = var0.toString();
//     long var6 = var0.getSerialIndex();
//     java.util.Calendar var7 = null;
//     long var8 = var0.getFirstMillisecond(var7);
// 
//   }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     java.lang.String var10 = var2.toString();
//     long var11 = var2.getLastMillisecond();
//     java.util.Calendar var12 = null;
//     var2.peg(var12);
// 
//   }

  public void test254() {}
//   public void test254() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     java.util.Date var15 = var2.getEnd();
//     java.util.Calendar var16 = null;
//     var2.peg(var16);
// 
//   }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
    java.util.TimeZone var10 = null;
    org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
    org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: hi!");
    boolean var16 = var13.equals((java.lang.Object)"org.jfree.data.time.TimePeriodFormatException: hi!");
    org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var18.addSuppressed((java.lang.Throwable)var20);
    org.jfree.data.time.TimePeriodFormatException var23 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var25 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var23.addSuppressed((java.lang.Throwable)var25);
    var18.addSuppressed((java.lang.Throwable)var25);
    java.lang.Throwable[] var28 = var18.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var30 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var30.addSuppressed((java.lang.Throwable)var32);
    org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var37 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var35.addSuppressed((java.lang.Throwable)var37);
    java.lang.String var39 = var35.toString();
    java.lang.String var40 = var35.toString();
    var32.addSuppressed((java.lang.Throwable)var35);
    var18.addSuppressed((java.lang.Throwable)var35);
    java.lang.Throwable[] var43 = var18.getSuppressed();
    int var44 = var13.compareTo((java.lang.Object)var43);
    java.lang.String var45 = var13.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var46 = var13.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var39.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var40.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Week 48, 1"+ "'", var45.equals("Week 48, 1"));

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, (-2015));
//     java.lang.Object var3 = null;
//     boolean var4 = var2.equals(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week();
//     java.lang.String var6 = var5.toString();
//     long var7 = var5.getMiddleMillisecond();
//     long var8 = var5.getFirstMillisecond();
//     int var9 = var5.getYearValue();
//     int var10 = var5.getYearValue();
//     boolean var11 = var2.equals((java.lang.Object)var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "Week 51, 2014"+ "'", var6.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == false);
// 
//   }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
//     java.lang.String var3 = var2.toString();
//     long var4 = var2.getMiddleMillisecond();
//     long var5 = var2.getFirstMillisecond();
//     int var6 = var2.getYearValue();
//     int var7 = var2.getYearValue();
//     org.jfree.data.time.Year var8 = var2.getYear();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(10, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(2014, var8);
//     java.util.Calendar var11 = null;
//     long var12 = var10.getFirstMillisecond(var11);
// 
//   }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-1));
//     long var3 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var4 = var2.previous();
//     int var5 = var2.getWeek();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-62199158400000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
// 
//   }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    java.lang.Class var5 = null;
    java.lang.Class var6 = null;
    org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var10 = var9.getEnd();
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var10);
    org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var10);
    java.util.TimeZone var13 = null;
    org.jfree.data.time.RegularTimePeriod var14 = org.jfree.data.time.RegularTimePeriod.createInstance(var6, var10, var13);
    java.util.TimeZone var15 = null;
    org.jfree.data.time.RegularTimePeriod var16 = org.jfree.data.time.RegularTimePeriod.createInstance(var5, var10, var15);
    org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var2.compareTo((java.lang.Object)var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test260() {}
//   public void test260() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
//     java.lang.String var3 = var2.toString();
//     long var4 = var2.getMiddleMillisecond();
//     long var5 = var2.getFirstMillisecond();
//     int var6 = var2.getYearValue();
//     int var7 = var2.getYearValue();
//     org.jfree.data.time.Year var8 = var2.getYear();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(10, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(1, var8);
//     java.util.Calendar var11 = null;
//     long var12 = var10.getLastMillisecond(var11);
// 
//   }

  public void test261() {}
//   public void test261() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(100, (-1));
//     int var14 = var12.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var15 = var12.previous();
//     long var16 = var12.getSerialIndex();
//     int var17 = var12.getYearValue();
//     long var18 = var12.getFirstMillisecond();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
//     java.lang.String var20 = var19.toString();
//     long var21 = var19.getMiddleMillisecond();
//     java.util.Date var22 = var19.getEnd();
//     int var23 = var12.compareTo((java.lang.Object)var22);
//     java.util.Date var24 = var12.getStart();
//     int var25 = var2.compareTo((java.lang.Object)var24);
//     org.jfree.data.time.Week var28 = new org.jfree.data.time.Week(100, (-1));
//     int var30 = var28.compareTo((java.lang.Object)0L);
//     boolean var32 = var28.equals((java.lang.Object)(-1L));
//     java.lang.String var33 = var28.toString();
//     org.jfree.data.time.RegularTimePeriod var34 = var28.next();
//     long var35 = var34.getMiddleMillisecond();
//     java.util.Date var36 = var34.getEnd();
//     int var37 = var2.compareTo((java.lang.Object)var36);
//     org.jfree.data.time.RegularTimePeriod var38 = var2.previous();
//     java.util.Calendar var39 = null;
//     long var40 = var2.getMiddleMillisecond(var39);
// 
//   }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     java.util.Calendar var13 = null;
//     long var14 = var2.getMiddleMillisecond(var13);
// 
//   }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     java.util.Calendar var6 = null;
//     long var7 = var4.getLastMillisecond(var6);
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    java.lang.Class var2 = null;
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var6 = var5.getEnd();
    java.util.TimeZone var7 = null;
    org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var2, var6, var7);
    java.util.TimeZone var9 = null;
    org.jfree.data.time.RegularTimePeriod var10 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var6, var9);
    java.util.TimeZone var11 = null;
    org.jfree.data.time.RegularTimePeriod var12 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var6, var11);
    java.util.TimeZone var13 = null;
    java.util.Locale var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(var6, var13, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     boolean var6 = var4.equals((java.lang.Object)(-1));
//     java.util.Calendar var7 = null;
//     long var8 = var4.getLastMillisecond(var7);
// 
//   }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var11.addSuppressed((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var13);
    boolean var16 = var2.equals((java.lang.Object)var6);
    java.lang.String var17 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var18 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Week 100, -1"+ "'", var17.equals("Week 100, -1"));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var11.addSuppressed((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var13);
    boolean var16 = var2.equals((java.lang.Object)var6);
    int var17 = var2.getYearValue();
    java.util.Date var18 = var2.getStart();
    org.jfree.data.time.Week var19 = new org.jfree.data.time.Week(var18);
    java.util.TimeZone var20 = null;
    java.util.Locale var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var22 = new org.jfree.data.time.Week(var18, var20, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     java.lang.String var5 = var0.toString();
//     int var6 = var0.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     long var13 = var9.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var14 = var9.next();
//     java.util.Date var15 = var9.getEnd();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var15);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var17 = var0.compareTo((java.lang.Object)var16);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "Week 51, 2014"+ "'", var5.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-2015));
    long var3 = var2.getSerialIndex();
    int var4 = var2.getWeek();
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-106794L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test270() {}
//   public void test270() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
//     java.lang.String var14 = var13.toString();
//     long var15 = var13.getMiddleMillisecond();
//     java.util.Date var16 = var13.getEnd();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var16);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var16);
//     boolean var19 = var9.equals((java.lang.Object)var18);
//     long var20 = var18.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     java.util.Date var22 = var18.getEnd();
//     int var23 = var5.compareTo((java.lang.Object)var22);
//     java.util.TimeZone var24 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var25 = new org.jfree.data.time.Week(var22, var24);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 51, 2014"+ "'", var14.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
// 
//   }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     int var4 = var0.getYearValue();
//     java.util.Calendar var5 = null;
//     var0.peg(var5);
// 
//   }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     java.util.Date var15 = var2.getEnd();
//     java.util.Calendar var16 = null;
//     long var17 = var2.getFirstMillisecond(var16);
// 
//   }

  public void test273() {}
//   public void test273() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
//     org.jfree.data.time.RegularTimePeriod var3 = var2.previous();
//     java.util.Calendar var4 = null;
//     long var5 = var2.getLastMillisecond(var4);
// 
//   }

  public void test274() {}
//   public void test274() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getSerialIndex();
//     java.lang.String var12 = var2.toString();
//     java.util.Calendar var13 = null;
//     long var14 = var2.getLastMillisecond(var13);
// 
//   }

  public void test276() {}
//   public void test276() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-2015), 10);
//     java.util.Calendar var3 = null;
//     long var4 = var2.getMiddleMillisecond(var3);
// 
//   }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     long var5 = var2.getMiddleMillisecond();
//     boolean var7 = var2.equals((java.lang.Object)1.0d);
//     java.util.Calendar var8 = null;
//     long var9 = var2.getLastMillisecond(var8);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("org.jfree.data.time.TimePeriodFormatException: org.jfree.data.time.TimePeriodFormatException: hi!");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test279() {}
//   public void test279() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     java.lang.Object var12 = null;
//     boolean var13 = var2.equals(var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var14 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
// 
//   }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 0);
//     org.jfree.data.time.RegularTimePeriod var3 = var2.next();
//     int var4 = var2.getYearValue();
//     java.util.Calendar var5 = null;
//     long var6 = var2.getFirstMillisecond(var5);
// 
//   }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getLastMillisecond();
//     java.util.Date var20 = var2.getStart();
//     org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var24 = var23.getEnd();
//     int var25 = var23.getWeek();
//     java.lang.String var26 = var23.toString();
//     org.jfree.data.time.RegularTimePeriod var27 = var23.next();
//     boolean var28 = var2.equals((java.lang.Object)var27);
//     java.util.Calendar var29 = null;
//     long var30 = var2.getFirstMillisecond(var29);
// 
//   }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     org.jfree.data.time.Year var4 = var0.getYear();
//     java.util.Calendar var5 = null;
//     var0.peg(var5);
// 
//   }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     long var10 = var2.getSerialIndex();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getMiddleMillisecond(var11);
// 
//   }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), (-1));
//     org.jfree.data.time.RegularTimePeriod var3 = var2.next();
//     java.util.Calendar var4 = null;
//     long var5 = var2.getFirstMillisecond(var4);
// 
//   }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     int var5 = var2.getWeek();
//     org.jfree.data.time.RegularTimePeriod var6 = var2.previous();
//     long var7 = var2.getLastMillisecond();
//     java.util.Calendar var8 = null;
//     long var9 = var2.getMiddleMillisecond(var8);
// 
//   }

  public void test286() {}
//   public void test286() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, (-1));
//     int var3 = var2.getWeek();
//     java.util.Calendar var4 = null;
//     long var5 = var2.getFirstMillisecond(var4);
// 
//   }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-2015));
//     java.util.Calendar var3 = null;
//     long var4 = var2.getFirstMillisecond(var3);
// 
//   }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Date var4 = var0.getEnd();
//     java.util.Date var5 = var0.getStart();
//     java.util.Date var6 = var0.getEnd();
//     java.util.TimeZone var7 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var6, var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
// 
//   }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.util.Calendar var14 = null;
//     long var15 = var2.getMiddleMillisecond(var14);
// 
//   }

  public void test290() {}
//   public void test290() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     int var4 = var0.getYearValue();
//     int var5 = var0.getYearValue();
//     org.jfree.data.time.Year var6 = var0.getYear();
//     java.util.Calendar var7 = null;
//     var0.peg(var7);
// 
//   }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(0, 1);
//     boolean var28 = var2.equals((java.lang.Object)var27);
//     java.lang.String var29 = var27.toString();
//     org.jfree.data.time.RegularTimePeriod var30 = var27.previous();
//     java.util.Calendar var31 = null;
//     long var32 = var27.getLastMillisecond(var31);
// 
//   }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     long var15 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var16 = var2.next();
//     java.util.Date var17 = var16.getEnd();
//     java.util.Date var18 = var16.getEnd();
//     java.util.TimeZone var19 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var20 = new org.jfree.data.time.Week(var18, var19);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
// 
//   }

  public void test293() {}
//   public void test293() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     int var20 = var2.getYearValue();
//     java.util.Calendar var21 = null;
//     var2.peg(var21);
// 
//   }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var4 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var4.addSuppressed((java.lang.Throwable)var6);
    org.jfree.data.time.TimePeriodFormatException var9 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var9.toString();
    java.lang.String var14 = var9.toString();
    var6.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var16 = var6.toString();
    org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var18.addSuppressed((java.lang.Throwable)var20);
    org.jfree.data.time.TimePeriodFormatException var23 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var25 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var23.addSuppressed((java.lang.Throwable)var25);
    java.lang.String var27 = var23.toString();
    java.lang.String var28 = var23.toString();
    var20.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var30 = var23.toString();
    java.lang.Throwable[] var31 = var23.getSuppressed();
    var6.addSuppressed((java.lang.Throwable)var23);
    var1.addSuppressed((java.lang.Throwable)var6);
    org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var37 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var35.addSuppressed((java.lang.Throwable)var37);
    org.jfree.data.time.TimePeriodFormatException var40 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var42 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var40.addSuppressed((java.lang.Throwable)var42);
    var35.addSuppressed((java.lang.Throwable)var42);
    java.lang.Throwable[] var45 = var35.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var47 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var49 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var47.addSuppressed((java.lang.Throwable)var49);
    org.jfree.data.time.TimePeriodFormatException var52 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var54 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var52.addSuppressed((java.lang.Throwable)var54);
    java.lang.String var56 = var52.toString();
    java.lang.String var57 = var52.toString();
    var49.addSuppressed((java.lang.Throwable)var52);
    var35.addSuppressed((java.lang.Throwable)var52);
    org.jfree.data.time.TimePeriodFormatException var61 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var63 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var61.addSuppressed((java.lang.Throwable)var63);
    org.jfree.data.time.TimePeriodFormatException var66 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var68 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var66.addSuppressed((java.lang.Throwable)var68);
    java.lang.String var70 = var66.toString();
    java.lang.String var71 = var66.toString();
    var63.addSuppressed((java.lang.Throwable)var66);
    java.lang.String var73 = var66.toString();
    java.lang.Throwable[] var74 = var66.getSuppressed();
    var35.addSuppressed((java.lang.Throwable)var66);
    java.lang.String var76 = var35.toString();
    var1.addSuppressed((java.lang.Throwable)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var13.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var14.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var16.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var27.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var28.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var30.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var56.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var57.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var70.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var71.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var73.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var76.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));

  }

  public void test295() {}
//   public void test295() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     int var10 = var2.getYearValue();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var14 = var13.getEnd();
//     int var15 = var13.getWeek();
//     java.util.Date var16 = var13.getEnd();
//     boolean var17 = var2.equals((java.lang.Object)var16);
//     java.util.Date var18 = var2.getEnd();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week(var18);
//     java.util.TimeZone var20 = null;
//     java.util.Locale var21 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var22 = new org.jfree.data.time.Week(var18, var20, var21);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
// 
//   }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-2015));

  }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var8 = var2.previous();
//     java.util.Calendar var9 = null;
//     long var10 = var8.getMiddleMillisecond(var9);
// 
//   }

  public void test298() {}
//   public void test298() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     int var13 = var12.getYearValue();
//     int var14 = var12.getWeek();
//     long var15 = var12.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-62107531200001L));
// 
//   }

  public void test299() {}
//   public void test299() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     int var5 = var2.getWeek();
//     java.util.Date var6 = var2.getStart();
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var1.addSuppressed((java.lang.Throwable)var3);
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     java.lang.String var10 = var6.toString();
//     java.lang.String var11 = var6.toString();
//     var3.addSuppressed((java.lang.Throwable)var6);
//     java.lang.String var13 = var6.toString();
//     java.lang.Throwable var14 = null;
//     var6.addSuppressed(var14);
// 
//   }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     int var3 = var0.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     int var5 = var0.getYearValue();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 2014);
// 
//   }

  public void test302() {}
//   public void test302() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var12 = var9.next();
//     int var13 = var9.getWeek();
//     int var14 = var9.getYearValue();
//     long var15 = var9.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var16 = var9.next();
//     boolean var17 = var2.equals((java.lang.Object)var9);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var18 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 106793L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
// 
//   }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable[] var11 = var8.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var13.addSuppressed((java.lang.Throwable)var15);
    var8.addSuppressed((java.lang.Throwable)var15);
    org.jfree.data.time.TimePeriodFormatException var19 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var21 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var19.addSuppressed((java.lang.Throwable)var21);
    org.jfree.data.time.TimePeriodFormatException var24 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var26 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var24.addSuppressed((java.lang.Throwable)var26);
    var19.addSuppressed((java.lang.Throwable)var26);
    java.lang.Throwable[] var29 = var19.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var31 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var33 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var31.addSuppressed((java.lang.Throwable)var33);
    org.jfree.data.time.TimePeriodFormatException var36 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var38 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var36.addSuppressed((java.lang.Throwable)var38);
    java.lang.String var40 = var36.toString();
    java.lang.String var41 = var36.toString();
    var33.addSuppressed((java.lang.Throwable)var36);
    var19.addSuppressed((java.lang.Throwable)var36);
    var15.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var45 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var40.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var41.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var45.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     java.util.Calendar var7 = null;
//     long var8 = var2.getMiddleMillisecond(var7);
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
    java.util.Date var3 = var2.getStart();
    java.util.TimeZone var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test306() {}
//   public void test306() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     java.util.Calendar var8 = null;
//     long var9 = var7.getLastMillisecond(var8);
// 
//   }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     org.jfree.data.time.RegularTimePeriod var14 = var9.next();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(100, (-1));
//     int var19 = var17.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var20 = var17.previous();
//     long var21 = var17.getSerialIndex();
//     int var22 = var17.getYearValue();
//     int var24 = var17.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.RegularTimePeriod var25 = var17.next();
//     boolean var26 = var9.equals((java.lang.Object)var17);
//     long var27 = var9.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-2015));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == 1418846399999L);
// 
//   }

  public void test308() {}
//   public void test308() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.RegularTimePeriod var5 = var4.previous();
//     org.jfree.data.time.RegularTimePeriod var6 = var4.previous();
//     long var7 = var4.getFirstMillisecond();
//     int var8 = var4.getYearValue();
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     int var14 = var11.getWeek();
//     java.util.Date var15 = var11.getStart();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var16 = var4.compareTo((java.lang.Object)var11);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test309() {}
//   public void test309() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(2014, 48);
//     java.util.Calendar var3 = null;
//     long var4 = var2.getFirstMillisecond(var3);
// 
//   }

  public void test310() {}
//   public void test310() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     long var10 = var2.getSerialIndex();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var11 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 47L);
// 
//   }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    java.lang.String var5 = var2.toString();
    org.jfree.data.time.RegularTimePeriod var6 = var2.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var7 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Week 100, -1"+ "'", var5.equals("Week 100, -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test312() {}
//   public void test312() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.previous();
//     java.util.Date var8 = var2.getEnd();
//     int var9 = var2.getYearValue();
//     java.util.Calendar var10 = null;
//     var2.peg(var10);
// 
//   }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 10);
//     java.util.Calendar var3 = null;
//     long var4 = var2.getMiddleMillisecond(var3);
// 
//   }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.previous();
//     java.util.Calendar var3 = null;
//     var0.peg(var3);
// 
//   }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-1));
//     long var3 = var2.getFirstMillisecond();
//     java.util.Calendar var4 = null;
//     long var5 = var2.getMiddleMillisecond(var4);
// 
//   }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     java.util.Calendar var7 = null;
//     long var8 = var5.getLastMillisecond(var7);
// 
//   }

  public void test317() {}
//   public void test317() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     int var10 = var2.getYearValue();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var14 = var13.getEnd();
//     int var15 = var13.getWeek();
//     java.util.Date var16 = var13.getEnd();
//     boolean var17 = var2.equals((java.lang.Object)var16);
//     java.util.Date var18 = var2.getStart();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var19 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
// 
//   }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.lang.Class var3 = null;
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var3, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     java.util.Date var11 = var10.getStart();
//     boolean var12 = var0.equals((java.lang.Object)var11);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var11);
//     java.util.TimeZone var14 = null;
//     java.util.Locale var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var11, var14, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var5 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test320() {}
//   public void test320() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.lang.String var3 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     long var5 = var0.getFirstMillisecond();
//     java.util.Calendar var6 = null;
//     long var7 = var0.getMiddleMillisecond(var6);
// 
//   }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var12.addSuppressed((java.lang.Throwable)var14);
//     org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var19 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var17.addSuppressed((java.lang.Throwable)var19);
//     var12.addSuppressed((java.lang.Throwable)var19);
//     java.lang.Throwable[] var22 = var19.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var24 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var26 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var24.addSuppressed((java.lang.Throwable)var26);
//     var19.addSuppressed((java.lang.Throwable)var26);
//     org.jfree.data.time.TimePeriodFormatException var30 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var30.addSuppressed((java.lang.Throwable)var32);
//     org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var37 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var35.addSuppressed((java.lang.Throwable)var37);
//     java.lang.String var39 = var35.toString();
//     java.lang.String var40 = var35.toString();
//     var32.addSuppressed((java.lang.Throwable)var35);
//     java.lang.String var42 = var35.toString();
//     var19.addSuppressed((java.lang.Throwable)var35);
//     boolean var44 = var2.equals((java.lang.Object)var35);
//     java.util.Date var45 = var2.getStart();
//     java.util.Calendar var46 = null;
//     long var47 = var2.getLastMillisecond(var46);
// 
//   }

  public void test322() {}
//   public void test322() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.next();
//     long var4 = var0.getSerialIndex();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 106793L);
// 
//   }

  public void test323() {}
//   public void test323() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     java.util.Calendar var8 = null;
//     long var9 = var2.getFirstMillisecond(var8);
// 
//   }

  public void test324() {}
//   public void test324() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     java.util.Calendar var7 = null;
//     long var8 = var5.getFirstMillisecond(var7);
// 
//   }

  public void test325() {}
//   public void test325() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Date var5 = var4.getStart();
//     org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var9 = var8.getEnd();
//     int var10 = var8.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var12.addSuppressed((java.lang.Throwable)var14);
//     org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var19 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var17.addSuppressed((java.lang.Throwable)var19);
//     var12.addSuppressed((java.lang.Throwable)var19);
//     boolean var22 = var8.equals((java.lang.Object)var12);
//     int var23 = var8.getYearValue();
//     java.util.Date var24 = var8.getStart();
//     boolean var25 = var4.equals((java.lang.Object)var8);
//     java.lang.String var26 = var8.toString();
//     org.jfree.data.time.Week var29 = new org.jfree.data.time.Week(100, (-1));
//     int var31 = var29.compareTo((java.lang.Object)0L);
//     boolean var33 = var29.equals((java.lang.Object)(-1L));
//     java.lang.String var34 = var29.toString();
//     long var35 = var29.getMiddleMillisecond();
//     int var36 = var29.getWeek();
//     long var37 = var29.getFirstMillisecond();
//     java.lang.String var38 = var29.toString();
//     java.lang.Object var39 = null;
//     boolean var40 = var29.equals(var39);
//     int var41 = var8.compareTo(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var26 + "' != '" + "Week 100, -1"+ "'", var26.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var34 + "' != '" + "Week 100, -1"+ "'", var34.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var36 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var38 + "' != '" + "Week 100, -1"+ "'", var38.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var40 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var41 == 1);
// 
//   }

  public void test326() {}
//   public void test326() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Year var6 = var5.getYear();
//     java.util.Calendar var7 = null;
//     long var8 = var5.getFirstMillisecond(var7);
// 
//   }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     java.util.Date var13 = var12.getStart();
//     java.util.TimeZone var14 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(var13, var14);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
// 
//   }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    org.jfree.data.time.RegularTimePeriod var4 = var2.next();
    int var5 = var2.getYearValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var6 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 51, -2015");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Year var6 = var5.getYear();
//     java.util.Calendar var7 = null;
//     long var8 = var5.getLastMillisecond(var7);
// 
//   }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var11 = var2.next();
//     java.util.Calendar var12 = null;
//     var2.peg(var12);
// 
//   }

  public void test332() {}
//   public void test332() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     int var20 = var2.getWeek();
//     org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(100, (-1));
//     int var25 = var23.compareTo((java.lang.Object)0L);
//     boolean var27 = var23.equals((java.lang.Object)(-1L));
//     java.lang.String var28 = var23.toString();
//     org.jfree.data.time.RegularTimePeriod var29 = var23.next();
//     long var30 = var23.getLastMillisecond();
//     int var31 = var2.compareTo((java.lang.Object)var30);
//     org.jfree.data.time.Week var34 = new org.jfree.data.time.Week(100, (-1));
//     int var36 = var34.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var37 = var34.previous();
//     org.jfree.data.time.Week var38 = new org.jfree.data.time.Week();
//     java.lang.String var39 = var38.toString();
//     long var40 = var38.getMiddleMillisecond();
//     java.util.Date var41 = var38.getEnd();
//     org.jfree.data.time.Week var42 = new org.jfree.data.time.Week(var41);
//     org.jfree.data.time.Week var43 = new org.jfree.data.time.Week(var41);
//     boolean var44 = var34.equals((java.lang.Object)var43);
//     long var45 = var43.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var46 = var43.previous();
//     int var47 = var43.getWeek();
//     int var48 = var43.getWeek();
//     boolean var49 = var2.equals((java.lang.Object)var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "Week 100, -1"+ "'", var16.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var28 + "' != '" + "Week 100, -1"+ "'", var28.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var36 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var37);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var39 + "' != '" + "Week 51, 2014"+ "'", var39.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var40 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var44 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var45 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var47 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var48 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var49 == false);
// 
//   }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("org.jfree.data.time.TimePeriodFormatException: Week 51, 2014");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-2015), 10);
//     java.util.Calendar var3 = null;
//     var2.peg(var3);
// 
//   }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     java.util.Calendar var20 = null;
//     long var21 = var2.getFirstMillisecond(var20);
// 
//   }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, (-1));
//     int var3 = var2.getWeek();
//     int var4 = var2.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var5 = var2.next();
//     int var6 = var2.getWeek();
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test337() {}
//   public void test337() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
//     long var3 = var2.getLastMillisecond();
//     long var4 = var2.getFirstMillisecond();
//     long var5 = var2.getFirstMillisecond();
//     int var6 = var2.getWeek();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-61852003200001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-61852608000000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-61852608000000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0);
// 
//   }

  public void test338() {}
//   public void test338() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.previous();
//     java.util.Calendar var8 = null;
//     long var9 = var2.getLastMillisecond(var8);
// 
//   }

  public void test339() {}
//   public void test339() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     int var5 = var4.getWeek();
//     long var6 = var4.getSerialIndex();
//     long var7 = var4.getSerialIndex();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 106793L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 106793L);
// 
//   }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    int var4 = var2.getWeek();
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var11.addSuppressed((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var13);
    boolean var16 = var2.equals((java.lang.Object)var6);
    int var17 = var2.getYearValue();
    java.util.Date var18 = var2.getStart();
    java.util.TimeZone var19 = null;
    java.util.Locale var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var21 = new org.jfree.data.time.Week(var18, var19, var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(0, 10);
//     int var28 = var2.compareTo((java.lang.Object)10);
//     long var29 = var2.getFirstMillisecond();
//     int var30 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var34 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var32.addSuppressed((java.lang.Throwable)var34);
//     org.jfree.data.time.TimePeriodFormatException var37 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var39 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var37.addSuppressed((java.lang.Throwable)var39);
//     java.lang.String var41 = var37.toString();
//     java.lang.String var42 = var37.toString();
//     var34.addSuppressed((java.lang.Throwable)var37);
//     java.lang.String var44 = var37.toString();
//     org.jfree.data.time.TimePeriodFormatException var46 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var48 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var46.addSuppressed((java.lang.Throwable)var48);
//     java.lang.String var50 = var46.toString();
//     java.lang.String var51 = var46.toString();
//     var37.addSuppressed((java.lang.Throwable)var46);
//     org.jfree.data.time.TimePeriodFormatException var54 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     java.lang.Throwable[] var55 = var54.getSuppressed();
//     var37.addSuppressed((java.lang.Throwable)var54);
//     java.lang.Throwable[] var57 = var37.getSuppressed();
//     java.lang.String var58 = var37.toString();
//     int var59 = var2.compareTo((java.lang.Object)var58);
//     int var61 = var2.compareTo((java.lang.Object)1419148799999L);
//     java.util.Calendar var62 = null;
//     long var63 = var2.getLastMillisecond(var62);
// 
//   }

  public void test342() {}
//   public void test342() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     java.util.Date var15 = var11.getEnd();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var15);
//     java.util.TimeZone var17 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var15, var17);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 51, 2014"+ "'", var7.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test343() {}
//   public void test343() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getYearValue();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-1));
// 
//   }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     long var2 = var1.getMiddleMillisecond();
//     java.util.Calendar var3 = null;
//     long var4 = var1.getMiddleMillisecond(var3);
// 
//   }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(100, (-1));
//     int var18 = var16.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var19 = var16.previous();
//     long var20 = var16.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var21 = var16.next();
//     int var22 = var16.getWeek();
//     long var23 = var16.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var24 = var16.next();
//     long var25 = var16.getLastMillisecond();
//     org.jfree.data.time.RegularTimePeriod var26 = var16.next();
//     java.util.Date var27 = var26.getEnd();
//     int var28 = var2.compareTo((java.lang.Object)var27);
//     java.util.TimeZone var29 = null;
//     java.util.Locale var30 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var31 = new org.jfree.data.time.Week(var27, var29, var30);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == 1);
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable[] var11 = var8.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var13.addSuppressed((java.lang.Throwable)var15);
    org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var18.addSuppressed((java.lang.Throwable)var20);
    var13.addSuppressed((java.lang.Throwable)var20);
    java.lang.Throwable[] var23 = var20.getSuppressed();
    org.jfree.data.time.TimePeriodFormatException var25 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var27 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var25.addSuppressed((java.lang.Throwable)var27);
    var20.addSuppressed((java.lang.Throwable)var27);
    var8.addSuppressed((java.lang.Throwable)var27);
    java.lang.String var31 = var8.toString();
    java.lang.String var32 = var8.toString();
    org.jfree.data.time.TimePeriodFormatException var34 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var36 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var34.addSuppressed((java.lang.Throwable)var36);
    org.jfree.data.time.TimePeriodFormatException var39 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var41 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var39.addSuppressed((java.lang.Throwable)var41);
    var34.addSuppressed((java.lang.Throwable)var41);
    var8.addSuppressed((java.lang.Throwable)var41);
    java.lang.Throwable[] var45 = var41.getSuppressed();
    java.lang.String var46 = var41.toString();
    java.lang.String var47 = var41.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var31.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var32.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var46.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var47.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 48);
//     int var4 = var2.compareTo((java.lang.Object)1418241599999L);
//     java.util.Calendar var5 = null;
//     long var6 = var2.getMiddleMillisecond(var5);
// 
//   }

  public void test348() {}
//   public void test348() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 0);
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
//     java.lang.String var4 = var3.toString();
//     long var5 = var3.getMiddleMillisecond();
//     long var6 = var3.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var7 = var3.previous();
//     int var8 = var2.compareTo((java.lang.Object)var3);
//     java.util.Calendar var9 = null;
//     var3.peg(var9);
// 
//   }

  public void test349() {}
//   public void test349() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     int var9 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     java.util.Calendar var11 = null;
//     long var12 = var10.getMiddleMillisecond(var11);
// 
//   }

  public void test350() {}
//   public void test350() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Date var4 = var0.getEnd();
//     java.util.Date var5 = var0.getStart();
//     java.util.Calendar var6 = null;
//     var0.peg(var6);
// 
//   }

  public void test351() {}
//   public void test351() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     long var13 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var2.previous();
//     long var15 = var2.getLastMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-62138678400001L));
// 
//   }

  public void test352() {}
//   public void test352() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getFirstMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var9 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
// 
//   }

  public void test353() {}
//   public void test353() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(100, (-1));
//     int var14 = var12.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var15 = var12.previous();
//     long var16 = var12.getSerialIndex();
//     int var17 = var12.getYearValue();
//     long var18 = var12.getFirstMillisecond();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
//     java.lang.String var20 = var19.toString();
//     long var21 = var19.getMiddleMillisecond();
//     java.util.Date var22 = var19.getEnd();
//     int var23 = var12.compareTo((java.lang.Object)var22);
//     java.util.Date var24 = var12.getStart();
//     int var25 = var2.compareTo((java.lang.Object)var24);
//     org.jfree.data.time.Week var26 = new org.jfree.data.time.Week();
//     java.lang.String var27 = var26.toString();
//     long var28 = var26.getMiddleMillisecond();
//     java.util.Date var29 = var26.getEnd();
//     org.jfree.data.time.Week var32 = new org.jfree.data.time.Week(100, (-1));
//     int var34 = var32.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var35 = var32.previous();
//     long var36 = var32.getSerialIndex();
//     int var37 = var32.getYearValue();
//     long var38 = var32.getFirstMillisecond();
//     int var39 = var32.getYearValue();
//     int var40 = var26.compareTo((java.lang.Object)var39);
//     boolean var41 = var2.equals((java.lang.Object)var40);
//     java.lang.String var42 = var2.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "Week 51, 2014"+ "'", var20.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var27 + "' != '" + "Week 51, 2014"+ "'", var27.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var35);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var36 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var38 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var39 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var40 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var41 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var42 + "' != '" + "Week 100, -1"+ "'", var42.equals("Week 100, -1"));
// 
//   }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var13 = var2.previous();
//     long var14 = var2.getSerialIndex();
//     java.util.Date var15 = var2.getEnd();
//     java.util.TimeZone var16 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var15, var16);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test355() {}
//   public void test355() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5);
//     long var14 = var13.getLastMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-62107228800001L));
// 
//   }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 100);
//     java.lang.Class var3 = null;
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var3, var7, var8);
//     boolean var10 = var2.equals((java.lang.Object)var3);
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test357() {}
//   public void test357() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     java.util.Date var20 = var2.getStart();
//     boolean var22 = var2.equals((java.lang.Object)(-61832649600000L));
//     java.util.Calendar var23 = null;
//     var2.peg(var23);
// 
//   }

  public void test358() {}
//   public void test358() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     boolean var7 = var3.equals((java.lang.Object)(-1L));
//     long var8 = var3.getSerialIndex();
//     boolean var9 = var0.equals((java.lang.Object)var8);
//     java.util.Calendar var10 = null;
//     long var11 = var0.getMiddleMillisecond(var10);
// 
//   }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Calendar var3 = null;
//     long var4 = var0.getMiddleMillisecond(var3);
// 
//   }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, 0);
    org.jfree.data.time.RegularTimePeriod var4 = var3.next();
    java.util.Date var5 = var3.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     int var15 = var13.compareTo((java.lang.Object)0L);
//     boolean var17 = var13.equals((java.lang.Object)(-1L));
//     java.lang.String var18 = var13.toString();
//     long var19 = var13.getMiddleMillisecond();
//     int var20 = var13.getWeek();
//     long var21 = var13.getFirstMillisecond();
//     java.lang.String var22 = var13.toString();
//     long var23 = var13.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var24 = var13.previous();
//     long var25 = var13.getSerialIndex();
//     java.lang.String var26 = var13.toString();
//     boolean var27 = var2.equals((java.lang.Object)var26);
//     java.util.Calendar var28 = null;
//     long var29 = var2.getLastMillisecond(var28);
// 
//   }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var11 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
// 
//   }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     java.util.Date var15 = var11.getEnd();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week();
//     java.lang.String var17 = var16.toString();
//     long var18 = var16.getMiddleMillisecond();
//     long var19 = var16.getFirstMillisecond();
//     int var20 = var16.getYearValue();
//     int var21 = var16.getYearValue();
//     int var22 = var11.compareTo((java.lang.Object)var21);
//     long var23 = var11.getSerialIndex();
//     java.util.Calendar var24 = null;
//     long var25 = var11.getLastMillisecond(var24);
// 
//   }

  public void test364() {}
//   public void test364() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-1));
//     long var3 = var2.getFirstMillisecond();
//     java.util.Calendar var4 = null;
//     long var5 = var2.getFirstMillisecond(var4);
// 
//   }

  public void test365() {}
//   public void test365() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test366() {}
//   public void test366() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     int var6 = var3.getWeek();
//     java.util.Date var7 = var3.getStart();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     long var11 = var10.getSerialIndex();
//     long var12 = var10.getLastMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 101L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-62107228800001L));
// 
//   }

  public void test367() {}
//   public void test367() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     int var10 = var2.getYearValue();
//     long var11 = var2.getSerialIndex();
//     java.lang.Object var12 = null;
//     int var13 = var2.compareTo(var12);
//     java.util.Calendar var14 = null;
//     long var15 = var2.getMiddleMillisecond(var14);
// 
//   }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, (-1));
    int var3 = var2.getWeek();
    int var4 = var2.getYearValue();
    org.jfree.data.time.RegularTimePeriod var5 = var2.next();
    java.util.Date var6 = var5.getStart();
    java.util.TimeZone var7 = null;
    java.util.Locale var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(var6, var7, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test369() {}
//   public void test369() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     long var10 = var2.getSerialIndex();
//     int var11 = var2.getWeek();
//     java.util.Calendar var12 = null;
//     var2.peg(var12);
// 
//   }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 0);
    int var4 = var2.compareTo((java.lang.Object)"org.jfree.data.time.TimePeriodFormatException: ");
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Week 100, 0"+ "'", var5.equals("Week 100, 0"));

  }

  public void test371() {}
//   public void test371() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     java.util.Calendar var4 = null;
//     var0.peg(var4);
// 
//   }

  public void test372() {}
//   public void test372() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     long var13 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var2.previous();
//     java.util.Calendar var15 = null;
//     var2.peg(var15);
// 
//   }

  public void test373() {}
//   public void test373() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     java.util.Date var15 = var11.getEnd();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var15);
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week(100, (-1));
//     int var21 = var19.compareTo((java.lang.Object)0L);
//     boolean var23 = var19.equals((java.lang.Object)(-1L));
//     java.lang.String var24 = var19.toString();
//     long var25 = var19.getMiddleMillisecond();
//     int var26 = var19.getWeek();
//     long var27 = var19.getFirstMillisecond();
//     java.lang.String var28 = var19.toString();
//     org.jfree.data.time.RegularTimePeriod var29 = var19.next();
//     long var30 = var29.getMiddleMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var31 = var16.compareTo((java.lang.Object)var29);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 51, 2014"+ "'", var7.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var24 + "' != '" + "Week 100, -1"+ "'", var24.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var28 + "' != '" + "Week 100, -1"+ "'", var28.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == (-62167406400001L));
// 
//   }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
    java.util.Date var3 = var2.getStart();
    int var4 = var2.getWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: hi!");
//     boolean var16 = var13.equals((java.lang.Object)"org.jfree.data.time.TimePeriodFormatException: hi!");
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     org.jfree.data.time.TimePeriodFormatException var23 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var25 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var23.addSuppressed((java.lang.Throwable)var25);
//     var18.addSuppressed((java.lang.Throwable)var25);
//     java.lang.Throwable[] var28 = var18.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var30 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var30.addSuppressed((java.lang.Throwable)var32);
//     org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var37 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var35.addSuppressed((java.lang.Throwable)var37);
//     java.lang.String var39 = var35.toString();
//     java.lang.String var40 = var35.toString();
//     var32.addSuppressed((java.lang.Throwable)var35);
//     var18.addSuppressed((java.lang.Throwable)var35);
//     java.lang.Throwable[] var43 = var18.getSuppressed();
//     int var44 = var13.compareTo((java.lang.Object)var43);
//     org.jfree.data.time.Week var47 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var48 = var47.getEnd();
//     long var49 = var47.getFirstMillisecond();
//     java.util.Date var50 = var47.getStart();
//     org.jfree.data.time.Week var51 = new org.jfree.data.time.Week(var50);
//     boolean var52 = var13.equals((java.lang.Object)var51);
//     int var53 = var51.getWeek();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var39 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var39.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var40 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var40.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var43);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var44 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var49 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var50);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var52 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var53 == 48);
// 
//   }

  public void test376() {}
//   public void test376() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     java.util.TimeZone var6 = null;
//     org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
//     org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var9 = null;
//     org.jfree.data.time.RegularTimePeriod var10 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var5);
//     boolean var13 = var11.equals((java.lang.Object)530L);
//     java.util.Calendar var14 = null;
//     long var15 = var11.getMiddleMillisecond(var14);
// 
//   }

  public void test377() {}
//   public void test377() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     java.lang.String var5 = var2.toString();
//     org.jfree.data.time.RegularTimePeriod var6 = var2.next();
//     long var7 = var2.getFirstMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var8 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "Week 100, -1"+ "'", var5.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-62139283200000L));
// 
//   }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    long var6 = var2.getSerialIndex();
    org.jfree.data.time.RegularTimePeriod var7 = var2.next();
    java.util.Date var8 = var2.getEnd();
    org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(var8);
    java.util.TimeZone var10 = null;
    java.util.Locale var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var8, var10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 47L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test379() {}
//   public void test379() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var4);
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var4);
//     int var7 = var6.getYearValue();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(100, (-1));
//     int var12 = var10.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var13 = var10.previous();
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week();
//     java.lang.String var15 = var14.toString();
//     long var16 = var14.getMiddleMillisecond();
//     java.util.Date var17 = var14.getEnd();
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var17);
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week(var17);
//     boolean var20 = var10.equals((java.lang.Object)var19);
//     long var21 = var19.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var22 = var19.previous();
//     java.util.Date var23 = var19.getEnd();
//     int var24 = var6.compareTo((java.lang.Object)var23);
//     java.util.TimeZone var25 = null;
//     org.jfree.data.time.RegularTimePeriod var26 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var23, var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "Week 51, 2014"+ "'", var15.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var26);
// 
//   }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.TimePeriodFormatException var5 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     int var6 = var2.compareTo((java.lang.Object)var5);
//     java.util.Date var7 = var2.getStart();
//     long var8 = var2.getFirstMillisecond();
//     java.util.Calendar var9 = null;
//     long var10 = var2.getLastMillisecond(var9);
// 
//   }

  public void test381() {}
//   public void test381() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     java.util.TimeZone var5 = null;
//     org.jfree.data.time.RegularTimePeriod var6 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4);
//     long var8 = var7.getLastMillisecond();
//     long var9 = var7.getSerialIndex();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var10 = var7.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62107228800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 101L);
// 
//   }

  public void test382() {}
//   public void test382() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }
// 
// 
//     org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var1.addSuppressed((java.lang.Throwable)var3);
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     java.lang.String var10 = var6.toString();
//     java.lang.String var11 = var6.toString();
//     var3.addSuppressed((java.lang.Throwable)var6);
//     java.lang.String var13 = var6.toString();
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var15.addSuppressed((java.lang.Throwable)var17);
//     java.lang.String var19 = var15.toString();
//     java.lang.String var20 = var15.toString();
//     var6.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var23 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     java.lang.Throwable[] var24 = var23.getSuppressed();
//     var6.addSuppressed((java.lang.Throwable)var23);
//     java.lang.Throwable[] var26 = var23.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var28 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var30 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var28.addSuppressed((java.lang.Throwable)var30);
//     org.jfree.data.time.TimePeriodFormatException var33 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var35 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var33.addSuppressed((java.lang.Throwable)var35);
//     var28.addSuppressed((java.lang.Throwable)var35);
//     java.lang.Throwable[] var38 = var35.getSuppressed();
//     var23.addSuppressed((java.lang.Throwable)var35);
//     java.lang.Throwable[] var40 = var35.getSuppressed();
//     java.lang.Throwable var41 = null;
//     var35.addSuppressed(var41);
// 
//   }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: org.jfree.data.time.TimePeriodFormatException: hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var5 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var3.addSuppressed((java.lang.Throwable)var5);
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var10 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var8.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var12 = var8.toString();
    java.lang.String var13 = var8.toString();
    var5.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var16 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var12.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var13.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: org.jfree.data.time.TimePeriodFormatException: org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var16.equals("org.jfree.data.time.TimePeriodFormatException: org.jfree.data.time.TimePeriodFormatException: org.jfree.data.time.TimePeriodFormatException: hi!"));

  }

  public void test384() {}
//   public void test384() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     java.util.Calendar var9 = null;
//     var2.peg(var9);
// 
//   }

  public void test385() {}
//   public void test385() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-2015));
//     java.util.Calendar var3 = null;
//     var2.peg(var3);
// 
//   }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    int var5 = var3.getWeek();
    java.util.Date var6 = var3.getEnd();
    java.util.TimeZone var7 = null;
    org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var6, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test387() {}
//   public void test387() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, (-1));
//     int var3 = var2.getWeek();
//     int var4 = var2.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var5 = var2.next();
//     java.util.Date var6 = var2.getEnd();
//     java.util.Calendar var7 = null;
//     long var8 = var2.getMiddleMillisecond(var7);
// 
//   }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     boolean var7 = var3.equals((java.lang.Object)(-1L));
//     java.lang.String var8 = var3.toString();
//     long var9 = var3.getMiddleMillisecond();
//     int var10 = var3.getWeek();
//     long var11 = var3.getFirstMillisecond();
//     java.lang.String var12 = var3.toString();
//     long var13 = var3.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var14 = var3.previous();
//     long var15 = var3.getSerialIndex();
//     java.util.Date var16 = var3.getEnd();
//     java.util.TimeZone var17 = null;
//     org.jfree.data.time.RegularTimePeriod var18 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var16, var17);
//     java.util.TimeZone var19 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var20 = new org.jfree.data.time.Week(var16, var19);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "Week 100, -1"+ "'", var8.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var12 + "' != '" + "Week 100, -1"+ "'", var12.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var18);
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week -1, -1");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     int var15 = var2.getYearValue();
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(100, (-1));
//     int var20 = var18.compareTo((java.lang.Object)0L);
//     boolean var22 = var18.equals((java.lang.Object)(-1L));
//     int var24 = var18.compareTo((java.lang.Object)(-1.0f));
//     long var25 = var18.getFirstMillisecond();
//     int var26 = var18.getYearValue();
//     org.jfree.data.time.Week var29 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var30 = var29.getEnd();
//     int var31 = var29.getWeek();
//     java.util.Date var32 = var29.getEnd();
//     boolean var33 = var18.equals((java.lang.Object)var32);
//     boolean var34 = var2.equals((java.lang.Object)var18);
//     long var35 = var18.getFirstMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 100, -1"+ "'", var14.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == (-62139283200000L));
// 
//   }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-2013), var1);
// 
//   }

  public void test392() {}
//   public void test392() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     int var10 = var2.getYearValue();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var14 = var13.getEnd();
//     int var15 = var13.getWeek();
//     java.util.Date var16 = var13.getEnd();
//     boolean var17 = var2.equals((java.lang.Object)var16);
//     java.util.TimeZone var18 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var19 = new org.jfree.data.time.Week(var16, var18);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
// 
//   }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, (-2015));
    java.util.Date var3 = var2.getStart();
    java.lang.String var4 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var5 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Week 51, -2015"+ "'", var4.equals("Week 51, -2015"));

  }

  public void test394() {}
//   public void test394() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     java.util.Date var15 = var11.getEnd();
//     long var16 = var11.getFirstMillisecond();
//     long var17 = var11.getLastMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 51, 2014"+ "'", var7.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 1419148799999L);
// 
//   }

  public void test395() {}
//   public void test395() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var7 = var5.previous();
//     java.util.Calendar var8 = null;
//     long var9 = var5.getMiddleMillisecond(var8);
// 
//   }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var8 = null;
    org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
    java.util.TimeZone var10 = null;
    org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
    org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(var5, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var5 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var3.addSuppressed((java.lang.Throwable)var5);
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var10 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var8.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var12 = var8.toString();
    java.lang.String var13 = var8.toString();
    var5.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var15 = var8.toString();
    org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var19 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var17.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var21 = var17.toString();
    java.lang.String var22 = var17.toString();
    var8.addSuppressed((java.lang.Throwable)var17);
    var1.addSuppressed((java.lang.Throwable)var17);
    java.lang.Throwable[] var25 = var17.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var12.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var13.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var15.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var21.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var22.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    java.util.Date var4 = var2.getStart();
    java.util.TimeZone var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var4, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test399() {}
//   public void test399() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.lang.Class var3 = null;
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var3, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     java.util.Date var11 = var10.getStart();
//     boolean var12 = var0.equals((java.lang.Object)var11);
//     java.util.TimeZone var13 = null;
//     java.util.Locale var14 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(var11, var13, var14);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
// 
//   }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     java.util.Calendar var5 = null;
//     long var6 = var0.getFirstMillisecond(var5);
// 
//   }

  public void test401() {}
//   public void test401() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: hi!");
//     boolean var16 = var13.equals((java.lang.Object)"org.jfree.data.time.TimePeriodFormatException: hi!");
//     java.util.Calendar var17 = null;
//     long var18 = var13.getFirstMillisecond(var17);
// 
//   }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-2015), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var3 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     boolean var7 = var3.equals((java.lang.Object)(-1L));
//     int var9 = var3.compareTo((java.lang.Object)(-1.0f));
//     long var10 = var3.getFirstMillisecond();
//     java.util.Date var11 = var3.getEnd();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var11);
//     java.util.TimeZone var13 = null;
//     org.jfree.data.time.RegularTimePeriod var14 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var11, var13);
//     java.util.TimeZone var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var11, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var14);
// 
//   }

  public void test404() {}
//   public void test404() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     long var5 = var2.getLastMillisecond();
//     org.jfree.data.time.RegularTimePeriod var6 = var2.next();
//     java.util.Calendar var7 = null;
//     long var8 = var2.getFirstMillisecond(var7);
// 
//   }

  public void test405() {}
//   public void test405() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }
// 
// 
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week();
//     java.lang.String var5 = var4.toString();
//     long var6 = var4.getMiddleMillisecond();
//     long var7 = var4.getFirstMillisecond();
//     int var8 = var4.getYearValue();
//     int var9 = var4.getYearValue();
//     org.jfree.data.time.Year var10 = var4.getYear();
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(10, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(1, var10);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week((-2015), var10);
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(100, var10);
//     java.util.Calendar var15 = null;
//     long var16 = var10.getMiddleMillisecond(var15);
// 
//   }

  public void test406() {}
//   public void test406() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.RegularTimePeriod var5 = var4.next();
//     java.util.Calendar var6 = null;
//     var4.peg(var6);
// 
//   }

  public void test407() {}
//   public void test407() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     org.jfree.data.time.RegularTimePeriod var20 = var2.next();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "Week 100, -1"+ "'", var16.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     long var12 = var2.getSerialIndex();
//     int var13 = var2.getYearValue();
//     long var14 = var2.getLastMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var15 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 100, -1"+ "'", var11.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-62138678400001L));
// 
//   }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.next();
//     int var4 = var0.getWeek();
//     int var5 = var0.getYearValue();
//     long var6 = var0.getSerialIndex();
//     java.util.Calendar var7 = null;
//     long var8 = var0.getLastMillisecond(var7);
// 
//   }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     java.lang.Throwable var17 = null;
//     var6.addSuppressed(var17);
// 
//   }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    int var5 = var3.compareTo((java.lang.Object)0L);
    int var6 = var3.getWeek();
    java.util.Date var7 = var3.getStart();
    org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var7);
    java.util.TimeZone var9 = null;
    org.jfree.data.time.RegularTimePeriod var10 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var7, var9);
    java.util.TimeZone var11 = null;
    java.util.Locale var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var7, var11, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    java.util.Date var4 = var2.getStart();
    java.util.TimeZone var5 = null;
    java.util.Locale var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4, var5, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }
// 
// 
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week();
//     java.lang.String var6 = var5.toString();
//     long var7 = var5.getMiddleMillisecond();
//     long var8 = var5.getFirstMillisecond();
//     int var9 = var5.getYearValue();
//     int var10 = var5.getYearValue();
//     org.jfree.data.time.Year var11 = var5.getYear();
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(10, var11);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(2014, var11);
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(100, var11);
//     org.jfree.data.time.Week var15 = new org.jfree.data.time.Week((-2015), var11);
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week((-2014), var11);
//     int var17 = var16.getWeek();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "Week 51, 2014"+ "'", var6.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 34);
// 
//   }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("org.jfree.data.time.TimePeriodFormatException: Week 0, 1");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("Week 34, 2014");

  }

  public void test416() {}
//   public void test416() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     java.util.Date var10 = var2.getStart();
//     java.util.TimeZone var11 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var10, var11);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 100, -1"+ "'", var7.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
// 
//   }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, 0);
//     org.jfree.data.time.RegularTimePeriod var3 = var2.next();
//     long var4 = var2.getSerialIndex();
//     java.util.Calendar var5 = null;
//     var2.peg(var5);
// 
//   }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week();
//     java.lang.String var7 = var6.toString();
//     long var8 = var6.getMiddleMillisecond();
//     java.util.Date var9 = var6.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9);
//     boolean var12 = var2.equals((java.lang.Object)var11);
//     long var13 = var11.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var11.previous();
//     int var15 = var11.getWeek();
//     int var16 = var11.getWeek();
//     long var17 = var11.getFirstMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "Week 51, 2014"+ "'", var7.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 1418544000000L);
// 
//   }

  public void test419() {}
//   public void test419() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }
// 
// 
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
//     java.lang.String var4 = var3.toString();
//     long var5 = var3.getMiddleMillisecond();
//     long var6 = var3.getFirstMillisecond();
//     int var7 = var3.getYearValue();
//     int var8 = var3.getYearValue();
//     org.jfree.data.time.Year var9 = var3.getYear();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(10, var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week((-2014), var9);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(10, var9);
//     long var13 = var12.getFirstMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var4 + "' != '" + "Week 51, 2014"+ "'", var4.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1393747200000L);
// 
//   }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     int var10 = var2.getYearValue();
//     java.util.Calendar var11 = null;
//     long var12 = var2.getLastMillisecond(var11);
// 
//   }

  public void test421() {}
//   public void test421() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     boolean var7 = var3.equals((java.lang.Object)(-1L));
//     int var9 = var3.compareTo((java.lang.Object)(-1.0f));
//     long var10 = var3.getFirstMillisecond();
//     java.util.Date var11 = var3.getEnd();
//     java.util.TimeZone var12 = null;
//     org.jfree.data.time.RegularTimePeriod var13 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var11, var12);
//     java.util.TimeZone var14 = null;
//     java.util.Locale var15 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(var11, var14, var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var13);
// 
//   }

  public void test422() {}
//   public void test422() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var6 = var3.previous();
//     long var7 = var3.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var8 = var3.next();
//     int var9 = var3.getWeek();
//     long var10 = var3.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var11 = var3.next();
//     long var12 = var3.getSerialIndex();
//     java.util.Date var13 = var3.getEnd();
//     java.util.TimeZone var14 = null;
//     org.jfree.data.time.RegularTimePeriod var15 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var13, var14);
//     java.util.TimeZone var16 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var13, var16);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var15);
// 
//   }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
    int var6 = var5.getYearValue();
    org.jfree.data.time.RegularTimePeriod var7 = var5.previous();
    java.util.Date var8 = var5.getStart();
    java.util.TimeZone var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var8, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getLastMillisecond();
//     java.util.Date var12 = var2.getStart();
//     java.util.TimeZone var13 = null;
//     java.util.Locale var14 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(var12, var13, var14);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
// 
//   }

  public void test425() {}
//   public void test425() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-2015));
//     long var3 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var4 = var2.next();
//     int var5 = var2.getYearValue();
//     int var6 = var2.getWeek();
//     java.util.Calendar var7 = null;
//     long var8 = var2.getLastMillisecond(var7);
// 
//   }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), (-1));
//     java.util.Calendar var3 = null;
//     long var4 = var2.getFirstMillisecond(var3);
// 
//   }

  public void test427() {}
//   public void test427() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
//     int var7 = var5.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var8 = var5.previous();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var12);
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var12);
//     boolean var15 = var5.equals((java.lang.Object)var14);
//     long var16 = var14.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var17 = var14.previous();
//     int var18 = var14.getWeek();
//     int var19 = var14.getWeek();
//     boolean var20 = var0.equals((java.lang.Object)var14);
//     org.jfree.data.time.RegularTimePeriod var21 = var0.previous();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
// 
//   }

  public void test428() {}
//   public void test428() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
//     java.lang.String var14 = var13.toString();
//     long var15 = var13.getMiddleMillisecond();
//     java.util.Date var16 = var13.getEnd();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var16);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var16);
//     boolean var19 = var9.equals((java.lang.Object)var18);
//     long var20 = var18.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     java.util.Date var22 = var18.getEnd();
//     int var23 = var5.compareTo((java.lang.Object)var22);
//     org.jfree.data.time.Week var26 = new org.jfree.data.time.Week(100, (-1));
//     int var28 = var26.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var29 = var26.previous();
//     long var30 = var26.getSerialIndex();
//     int var31 = var26.getYearValue();
//     long var32 = var26.getFirstMillisecond();
//     int var33 = var26.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var34 = var26.next();
//     boolean var35 = var5.equals((java.lang.Object)var34);
//     java.util.Date var36 = var34.getEnd();
//     java.util.TimeZone var37 = null;
//     java.util.Locale var38 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var39 = new org.jfree.data.time.Week(var36, var37, var38);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 51, 2014"+ "'", var14.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var32 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
// 
//   }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }
// 
// 
//     org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var1.addSuppressed((java.lang.Throwable)var3);
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     var1.addSuppressed((java.lang.Throwable)var8);
//     java.lang.Throwable[] var11 = var1.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     java.lang.String var22 = var18.toString();
//     java.lang.String var23 = var18.toString();
//     var15.addSuppressed((java.lang.Throwable)var18);
//     var1.addSuppressed((java.lang.Throwable)var18);
//     org.jfree.data.time.TimePeriodFormatException var27 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var29 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var27.addSuppressed((java.lang.Throwable)var29);
//     org.jfree.data.time.TimePeriodFormatException var32 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var34 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var32.addSuppressed((java.lang.Throwable)var34);
//     java.lang.String var36 = var32.toString();
//     java.lang.String var37 = var32.toString();
//     var29.addSuppressed((java.lang.Throwable)var32);
//     java.lang.String var39 = var32.toString();
//     java.lang.Throwable[] var40 = var32.getSuppressed();
//     var1.addSuppressed((java.lang.Throwable)var32);
//     java.lang.Throwable var42 = null;
//     var32.addSuppressed(var42);
// 
//   }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var6 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     long var9 = var2.getFirstMillisecond();
//     long var10 = var2.getFirstMillisecond();
//     java.util.Date var11 = var2.getStart();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
// 
//   }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, (-2015));
//     java.util.Date var3 = var2.getStart();
//     java.lang.Object var4 = null;
//     int var5 = var2.compareTo(var4);
//     long var6 = var2.getMiddleMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == (-125725838400001L));
// 
//   }

  public void test433() {}
//   public void test433() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
//     java.lang.String var14 = var13.toString();
//     long var15 = var13.getMiddleMillisecond();
//     java.util.Date var16 = var13.getEnd();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var16);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var16);
//     boolean var19 = var9.equals((java.lang.Object)var18);
//     long var20 = var18.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     java.util.Date var22 = var18.getEnd();
//     int var23 = var5.compareTo((java.lang.Object)var22);
//     long var24 = var5.getSerialIndex();
//     java.util.Calendar var25 = null;
//     long var26 = var5.getMiddleMillisecond(var25);
// 
//   }

  public void test434() {}
//   public void test434() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     org.jfree.data.time.RegularTimePeriod var9 = var2.previous();
//     long var10 = var2.getLastMillisecond();
//     java.util.Date var11 = var2.getEnd();
//     java.util.TimeZone var12 = null;
//     java.util.Locale var13 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var11, var12, var13);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
// 
//   }

  public void test435() {}
//   public void test435() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.previous();
//     int var4 = var0.getWeek();
//     long var5 = var0.getFirstMillisecond();
//     java.util.Calendar var6 = null;
//     long var7 = var0.getMiddleMillisecond(var6);
// 
//   }

  public void test436() {}
//   public void test436() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     int var15 = var2.getWeek();
//     java.util.Calendar var16 = null;
//     long var17 = var2.getMiddleMillisecond(var16);
// 
//   }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     int var6 = var3.getWeek();
//     java.util.Date var7 = var3.getStart();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var7);
//     java.util.Calendar var12 = null;
//     var11.peg(var12);
// 
//   }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var11 = var8.toString();
    java.lang.Throwable[] var12 = var8.getSuppressed();
    java.lang.Throwable[] var13 = var8.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var11.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test439() {}
//   public void test439() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     int var4 = var0.getYearValue();
//     java.lang.String var5 = var0.toString();
//     long var6 = var0.getSerialIndex();
//     java.util.Calendar var7 = null;
//     long var8 = var0.getMiddleMillisecond(var7);
// 
//   }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     long var14 = var9.getFirstMillisecond();
//     java.lang.Object var15 = null;
//     boolean var16 = var9.equals(var15);
//     java.lang.String var17 = var9.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-2015));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var17 + "' != '" + "Week 51, 2014"+ "'", var17.equals("Week 51, 2014"));
// 
//   }

  public void test441() {}
//   public void test441() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     int var4 = var0.getYearValue();
//     int var5 = var0.getYearValue();
//     org.jfree.data.time.Year var6 = var0.getYear();
//     java.util.Calendar var7 = null;
//     long var8 = var0.getMiddleMillisecond(var7);
// 
//   }

  public void test442() {}
//   public void test442() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
//     int var6 = var5.getYearValue();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(100, (-1));
//     int var11 = var9.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var12 = var9.previous();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week();
//     java.lang.String var14 = var13.toString();
//     long var15 = var13.getMiddleMillisecond();
//     java.util.Date var16 = var13.getEnd();
//     org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var16);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(var16);
//     boolean var19 = var9.equals((java.lang.Object)var18);
//     long var20 = var18.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     java.util.Date var22 = var18.getEnd();
//     int var23 = var5.compareTo((java.lang.Object)var22);
//     org.jfree.data.time.Week var26 = new org.jfree.data.time.Week(100, (-1));
//     int var28 = var26.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var29 = var26.previous();
//     long var30 = var26.getSerialIndex();
//     int var31 = var26.getYearValue();
//     long var32 = var26.getFirstMillisecond();
//     int var33 = var26.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var34 = var26.next();
//     boolean var35 = var5.equals((java.lang.Object)var34);
//     java.util.Date var36 = var34.getEnd();
//     java.util.Calendar var37 = null;
//     long var38 = var34.getMiddleMillisecond(var37);
// 
//   }

  public void test443() {}
//   public void test443() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var6.addSuppressed((java.lang.Throwable)var8);
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     var6.addSuppressed((java.lang.Throwable)var13);
//     boolean var16 = var2.equals((java.lang.Object)var6);
//     int var17 = var2.getYearValue();
//     java.util.Date var18 = var2.getStart();
//     long var19 = var2.getMiddleMillisecond();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var20 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == (-62138980800001L));
// 
//   }

  public void test444() {}
//   public void test444() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     int var5 = var2.getWeek();
//     org.jfree.data.time.RegularTimePeriod var6 = var2.previous();
//     java.util.Calendar var7 = null;
//     var2.peg(var7);
// 
//   }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var3 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("org.jfree.data.time.TimePeriodFormatException: hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(51, 0);
    java.util.Date var3 = var2.getStart();
    java.util.TimeZone var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var6 = var3.previous();
//     long var7 = var3.getSerialIndex();
//     int var8 = var3.getYearValue();
//     long var9 = var3.getFirstMillisecond();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week();
//     java.lang.String var11 = var10.toString();
//     long var12 = var10.getMiddleMillisecond();
//     java.util.Date var13 = var10.getEnd();
//     int var14 = var3.compareTo((java.lang.Object)var13);
//     java.util.TimeZone var15 = null;
//     org.jfree.data.time.RegularTimePeriod var16 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var13, var15);
//     java.util.TimeZone var17 = null;
//     java.util.Locale var18 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var19 = new org.jfree.data.time.Week(var13, var17, var18);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "Week 51, 2014"+ "'", var11.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var16);
// 
//   }

  public void test449() {}
//   public void test449() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     long var1 = var0.getFirstMillisecond();
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week();
//     java.lang.String var3 = var2.toString();
//     long var4 = var2.getMiddleMillisecond();
//     java.util.Date var5 = var2.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.RegularTimePeriod var7 = var6.next();
//     boolean var8 = var0.equals((java.lang.Object)var7);
//     java.util.Date var9 = var7.getEnd();
//     java.util.TimeZone var10 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var9, var10);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var3 + "' != '" + "Week 51, 2014"+ "'", var3.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
// 
//   }

  public void test450() {}
//   public void test450() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     org.jfree.data.time.RegularTimePeriod var5 = var4.previous();
//     org.jfree.data.time.RegularTimePeriod var6 = var4.previous();
//     long var7 = var4.getFirstMillisecond();
//     java.util.Calendar var8 = null;
//     long var9 = var4.getFirstMillisecond(var8);
// 
//   }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getFirstMillisecond();
//     java.util.Date var9 = var2.getEnd();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week();
//     java.lang.String var11 = var10.toString();
//     long var12 = var10.getMiddleMillisecond();
//     java.util.Date var13 = var10.getEnd();
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var13);
//     java.util.Date var15 = var14.getStart();
//     long var16 = var14.getFirstMillisecond();
//     boolean var17 = var2.equals((java.lang.Object)var16);
//     java.util.Calendar var18 = null;
//     long var19 = var2.getLastMillisecond(var18);
// 
//   }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     boolean var7 = var3.equals((java.lang.Object)(-1L));
//     int var9 = var3.compareTo((java.lang.Object)(-1.0f));
//     org.jfree.data.time.RegularTimePeriod var10 = var3.previous();
//     long var11 = var3.getLastMillisecond();
//     java.util.Date var12 = var3.getEnd();
//     java.util.TimeZone var13 = null;
//     org.jfree.data.time.RegularTimePeriod var14 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var12, var13);
//     java.util.TimeZone var15 = null;
//     java.util.Locale var16 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var17 = new org.jfree.data.time.Week(var12, var15, var16);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var14);
// 
//   }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 51, 0");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test454() {}
//   public void test454() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }
// 
// 
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
//     java.lang.String var4 = var3.toString();
//     long var5 = var3.getMiddleMillisecond();
//     long var6 = var3.getFirstMillisecond();
//     int var7 = var3.getYearValue();
//     int var8 = var3.getYearValue();
//     org.jfree.data.time.Year var9 = var3.getYear();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(0, var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(51, var9);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(0, var9);
//     org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(100, (-1));
//     int var17 = var15.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var18 = var15.previous();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
//     java.lang.String var20 = var19.toString();
//     long var21 = var19.getMiddleMillisecond();
//     java.util.Date var22 = var19.getEnd();
//     org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(var22);
//     org.jfree.data.time.Week var24 = new org.jfree.data.time.Week(var22);
//     boolean var25 = var15.equals((java.lang.Object)var24);
//     long var26 = var24.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var27 = var24.previous();
//     java.util.Date var28 = var24.getEnd();
//     org.jfree.data.time.Week var29 = new org.jfree.data.time.Week(var28);
//     int var30 = var12.compareTo((java.lang.Object)var29);
//     java.util.Calendar var31 = null;
//     long var32 = var29.getLastMillisecond(var31);
// 
//   }

  public void test455() {}
//   public void test455() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     long var3 = var2.getMiddleMillisecond();
//     int var4 = var2.getWeek();
//     org.jfree.data.time.RegularTimePeriod var5 = var2.next();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getLastMillisecond(var6);
// 
//   }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
//     java.util.Date var5 = var4.getStart();
//     long var6 = var4.getMiddleMillisecond();
//     java.lang.String var7 = var4.toString();
//     java.util.Calendar var8 = null;
//     long var9 = var4.getMiddleMillisecond(var8);
// 
//   }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     long var11 = var9.getMiddleMillisecond();
//     java.util.Date var12 = var9.getEnd();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     java.lang.String var14 = var2.toString();
//     java.lang.String var15 = var2.toString();
//     java.util.Date var16 = var2.getEnd();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var17 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "Week 100, -1"+ "'", var14.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "Week 100, -1"+ "'", var15.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
// 
//   }

  public void test458() {}
//   public void test458() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }
// 
// 
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week();
//     java.lang.String var4 = var3.toString();
//     long var5 = var3.getMiddleMillisecond();
//     long var6 = var3.getFirstMillisecond();
//     int var7 = var3.getYearValue();
//     int var8 = var3.getYearValue();
//     org.jfree.data.time.Year var9 = var3.getYear();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(0, var9);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(51, var9);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(0, var9);
//     org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(100, (-1));
//     int var17 = var15.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var18 = var15.previous();
//     org.jfree.data.time.Week var19 = new org.jfree.data.time.Week();
//     java.lang.String var20 = var19.toString();
//     long var21 = var19.getMiddleMillisecond();
//     java.util.Date var22 = var19.getEnd();
//     org.jfree.data.time.Week var23 = new org.jfree.data.time.Week(var22);
//     org.jfree.data.time.Week var24 = new org.jfree.data.time.Week(var22);
//     boolean var25 = var15.equals((java.lang.Object)var24);
//     long var26 = var24.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var27 = var24.previous();
//     java.util.Date var28 = var24.getEnd();
//     org.jfree.data.time.Week var29 = new org.jfree.data.time.Week(var28);
//     int var30 = var12.compareTo((java.lang.Object)var29);
//     java.util.Date var31 = var29.getEnd();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var4 + "' != '" + "Week 51, 2014"+ "'", var4.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "Week 51, 2014"+ "'", var20.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == (-51));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
// 
//   }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var7 = var2.next();
//     int var8 = var2.getWeek();
//     long var9 = var2.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getSerialIndex();
//     java.util.Date var12 = var2.getEnd();
//     java.util.Calendar var13 = null;
//     long var14 = var2.getLastMillisecond(var13);
// 
//   }

  public void test460() {}
//   public void test460() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     long var14 = var9.getFirstMillisecond();
//     java.util.Calendar var15 = null;
//     var9.peg(var15);
// 
//   }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getYearValue();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     int var15 = var13.compareTo((java.lang.Object)0L);
//     boolean var17 = var13.equals((java.lang.Object)(-1L));
//     java.lang.String var18 = var13.toString();
//     long var19 = var13.getMiddleMillisecond();
//     int var20 = var13.getWeek();
//     long var21 = var13.getFirstMillisecond();
//     java.lang.String var22 = var13.toString();
//     long var23 = var13.getSerialIndex();
//     long var24 = var13.getMiddleMillisecond();
//     boolean var25 = var2.equals((java.lang.Object)var13);
//     org.jfree.data.time.RegularTimePeriod var26 = var2.previous();
//     org.jfree.data.time.RegularTimePeriod var27 = var2.previous();
//     java.util.Calendar var28 = null;
//     long var29 = var2.getFirstMillisecond(var28);
// 
//   }

  public void test462() {}
//   public void test462() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var1 = new org.jfree.data.time.Week();
//     java.lang.String var2 = var1.toString();
//     long var3 = var1.getMiddleMillisecond();
//     java.util.Date var4 = var1.getEnd();
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var4);
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var4);
//     java.util.TimeZone var7 = null;
//     org.jfree.data.time.RegularTimePeriod var8 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var4, var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "Week 51, 2014"+ "'", var2.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var8);
// 
//   }

  public void test463() {}
//   public void test463() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(10, 100);
//     java.util.Calendar var3 = null;
//     long var4 = var2.getFirstMillisecond(var3);
// 
//   }

  public void test464() {}
//   public void test464() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     int var5 = var3.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var6 = var3.previous();
//     long var7 = var3.getSerialIndex();
//     int var8 = var3.getYearValue();
//     long var9 = var3.getFirstMillisecond();
//     int var10 = var3.getYearValue();
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     int var15 = var13.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var16 = var13.previous();
//     long var17 = var13.getSerialIndex();
//     int var18 = var13.getYearValue();
//     long var19 = var13.getFirstMillisecond();
//     org.jfree.data.time.Week var20 = new org.jfree.data.time.Week();
//     java.lang.String var21 = var20.toString();
//     long var22 = var20.getMiddleMillisecond();
//     java.util.Date var23 = var20.getEnd();
//     int var24 = var13.compareTo((java.lang.Object)var23);
//     java.util.Date var25 = var13.getStart();
//     int var26 = var3.compareTo((java.lang.Object)var25);
//     org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(var25);
//     java.util.TimeZone var28 = null;
//     org.jfree.data.time.RegularTimePeriod var29 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var25, var28);
//     java.util.TimeZone var30 = null;
//     java.util.Locale var31 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var32 = new org.jfree.data.time.Week(var25, var30, var31);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var21 + "' != '" + "Week 51, 2014"+ "'", var21.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var29);
// 
//   }

  public void test465() {}
//   public void test465() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     int var13 = var12.getYearValue();
//     java.util.Calendar var14 = null;
//     var12.peg(var14);
// 
//   }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }
// 
// 
//     java.lang.Class var0 = null;
//     org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var4 = var3.getEnd();
//     int var5 = var3.getWeek();
//     org.jfree.data.time.TimePeriodFormatException var7 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var9 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var7.addSuppressed((java.lang.Throwable)var9);
//     org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var12.addSuppressed((java.lang.Throwable)var14);
//     var7.addSuppressed((java.lang.Throwable)var14);
//     boolean var17 = var3.equals((java.lang.Object)var7);
//     int var18 = var3.getYearValue();
//     java.util.Date var19 = var3.getStart();
//     long var20 = var3.getLastMillisecond();
//     java.util.Date var21 = var3.getStart();
//     java.util.TimeZone var22 = null;
//     org.jfree.data.time.RegularTimePeriod var23 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var21, var22);
//     java.util.TimeZone var24 = null;
//     java.util.Locale var25 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var26 = new org.jfree.data.time.Week(var21, var24, var25);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == (-62138678400001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var23);
// 
//   }

  public void test467() {}
//   public void test467() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     java.lang.Class var3 = null;
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var7 = var6.getEnd();
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var3, var7, var8);
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(var7);
//     java.util.Date var11 = var10.getStart();
//     boolean var12 = var0.equals((java.lang.Object)var11);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(var11);
//     org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var11);
//     org.jfree.data.time.RegularTimePeriod var15 = var14.previous();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var16 = var14.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
// 
//   }

  public void test468() {}
//   public void test468() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-51), var1);
// 
//   }

  public void test469() {}
//   public void test469() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var10 = var2.next();
//     long var11 = var2.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var12 = var2.next();
//     java.util.Date var13 = var2.getStart();
//     java.util.TimeZone var14 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var15 = new org.jfree.data.time.Week(var13, var14);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
// 
//   }

  public void test470() {}
//   public void test470() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     java.util.Date var2 = var0.getStart();
//     org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
//     int var7 = var5.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var8 = var5.previous();
//     long var9 = var5.getSerialIndex();
//     int var10 = var5.getYearValue();
//     long var11 = var5.getFirstMillisecond();
//     int var12 = var5.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var13 = var5.next();
//     org.jfree.data.time.Week var16 = new org.jfree.data.time.Week(100, (-1));
//     int var18 = var16.compareTo((java.lang.Object)0L);
//     boolean var20 = var16.equals((java.lang.Object)(-1L));
//     java.lang.String var21 = var16.toString();
//     long var22 = var16.getMiddleMillisecond();
//     int var23 = var16.getWeek();
//     long var24 = var16.getFirstMillisecond();
//     java.lang.String var25 = var16.toString();
//     long var26 = var16.getSerialIndex();
//     long var27 = var16.getMiddleMillisecond();
//     boolean var28 = var5.equals((java.lang.Object)var16);
//     boolean var29 = var0.equals((java.lang.Object)var5);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var30 = var5.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var21 + "' != '" + "Week 100, -1"+ "'", var21.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == (-62139283200000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var25 + "' != '" + "Week 100, -1"+ "'", var25.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var28 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var29 == false);
// 
//   }

  public void test471() {}
//   public void test471() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     boolean var15 = var2.equals((java.lang.Object)var13);
//     org.jfree.data.time.Week var18 = new org.jfree.data.time.Week(100, (-1));
//     int var20 = var18.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var21 = var18.previous();
//     long var22 = var18.getSerialIndex();
//     int var24 = var18.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(100, (-1));
//     int var29 = var27.compareTo((java.lang.Object)0L);
//     boolean var31 = var27.equals((java.lang.Object)(-1L));
//     java.lang.String var32 = var27.toString();
//     long var33 = var27.getMiddleMillisecond();
//     int var34 = var27.getWeek();
//     int var35 = var18.compareTo((java.lang.Object)var34);
//     boolean var36 = var2.equals((java.lang.Object)var35);
//     java.util.Calendar var37 = null;
//     long var38 = var2.getLastMillisecond(var37);
// 
//   }

  public void test472() {}
//   public void test472() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     int var8 = var2.compareTo((java.lang.Object)(-1.0f));
//     long var9 = var2.getFirstMillisecond();
//     org.jfree.data.time.TimePeriodFormatException var11 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var11.addSuppressed((java.lang.Throwable)var13);
//     boolean var15 = var2.equals((java.lang.Object)var13);
//     java.lang.Throwable[] var16 = var13.getSuppressed();
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("");
//     var13.addSuppressed((java.lang.Throwable)var18);
//     java.lang.String var20 = var13.toString();
//     java.lang.Throwable var21 = null;
//     var13.addSuppressed(var21);
// 
//   }

  public void test473() {}
//   public void test473() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var7 = var2.getWeek();
//     org.jfree.data.time.Week var10 = new org.jfree.data.time.Week(0, 10);
//     org.jfree.data.time.Week var13 = new org.jfree.data.time.Week(100, (-1));
//     int var15 = var13.compareTo((java.lang.Object)0L);
//     boolean var17 = var13.equals((java.lang.Object)(byte)1);
//     long var18 = var13.getSerialIndex();
//     int var19 = var10.compareTo((java.lang.Object)var18);
//     org.jfree.data.time.Week var20 = new org.jfree.data.time.Week();
//     java.lang.String var21 = var20.toString();
//     org.jfree.data.time.RegularTimePeriod var22 = var20.next();
//     java.util.Date var23 = var20.getStart();
//     org.jfree.data.time.Week var24 = new org.jfree.data.time.Week(var23);
//     long var25 = var24.getSerialIndex();
//     java.util.Date var26 = var24.getStart();
//     int var27 = var10.compareTo((java.lang.Object)var26);
//     org.jfree.data.time.RegularTimePeriod var28 = var10.previous();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var29 = var2.compareTo((java.lang.Object)var10);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var21 + "' != '" + "Week 51, 2014"+ "'", var21.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 106793L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
// 
//   }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     org.jfree.data.time.Week var27 = new org.jfree.data.time.Week(0, 10);
//     int var28 = var2.compareTo((java.lang.Object)10);
//     long var29 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var30 = var2.next();
//     java.util.Calendar var31 = null;
//     long var32 = var2.getMiddleMillisecond(var31);
// 
//   }

  public void test475() {}
//   public void test475() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week((-1), 2014);
//     java.util.Calendar var3 = null;
//     var2.peg(var3);
// 
//   }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    int var4 = var2.compareTo((java.lang.Object)0L);
    org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
    long var6 = var2.getSerialIndex();
    int var7 = var2.getYearValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var8 = var2.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 47L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test477() {}
//   public void test477() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = null;
//     org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var5 = var4.getEnd();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(var5);
//     org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var5);
//     java.util.TimeZone var8 = null;
//     org.jfree.data.time.RegularTimePeriod var9 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var8);
//     java.util.TimeZone var10 = null;
//     org.jfree.data.time.RegularTimePeriod var11 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var10);
//     org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
//     java.util.Calendar var13 = null;
//     long var14 = var12.getMiddleMillisecond(var13);
// 
//   }

  public void test478() {}
//   public void test478() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.next();
//     int var3 = var0.getYearValue();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.next();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 2014);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
// 
//   }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.lang.String var3 = var0.toString();
//     org.jfree.data.time.RegularTimePeriod var4 = var0.previous();
//     java.lang.String var5 = var0.toString();
//     java.util.Calendar var6 = null;
//     long var7 = var0.getLastMillisecond(var6);
// 
//   }

  public void test480() {}
//   public void test480() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     org.jfree.data.time.RegularTimePeriod var2 = var0.previous();
//     long var3 = var0.getLastMillisecond();
//     java.util.Calendar var4 = null;
//     long var5 = var0.getMiddleMillisecond(var4);
// 
//   }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var3 = var2.getEnd();
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(var3);
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(var3);
    int var6 = var5.getYearValue();
    org.jfree.data.time.Week var9 = new org.jfree.data.time.Week(0, 1);
    boolean var10 = var5.equals((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var11 = var9.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test482() {}
//   public void test482() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(1, (-1));
//     long var3 = var2.getFirstMillisecond();
//     org.jfree.data.time.Week var6 = new org.jfree.data.time.Week(100, (-1));
//     int var8 = var6.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var9 = var6.previous();
//     long var10 = var6.getSerialIndex();
//     org.jfree.data.time.RegularTimePeriod var11 = var6.next();
//     long var12 = var6.getMiddleMillisecond();
//     int var13 = var2.compareTo((java.lang.Object)var12);
//     org.jfree.data.time.RegularTimePeriod var14 = var2.next();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-62199158400000L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
// 
//   }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
    org.jfree.data.time.Week var5 = new org.jfree.data.time.Week(100, (-1));
    int var7 = var5.compareTo((java.lang.Object)0L);
    boolean var9 = var5.equals((java.lang.Object)(byte)1);
    long var10 = var5.getSerialIndex();
    int var11 = var2.compareTo((java.lang.Object)var10);
    java.util.Date var12 = var2.getEnd();
    java.util.TimeZone var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var14 = new org.jfree.data.time.Week(var12, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 47L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.jfree.data.time.TimePeriodFormatException var1 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var3 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    org.jfree.data.time.TimePeriodFormatException var6 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var8 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var6.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.toString();
    var3.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var13 = var6.toString();
    org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var17 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var15.addSuppressed((java.lang.Throwable)var17);
    java.lang.String var19 = var15.toString();
    java.lang.String var20 = var15.toString();
    var6.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var22 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var10.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var11.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var13.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var19.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.jfree.data.time.TimePeriodFormatException: hi!"+ "'", var20.equals("org.jfree.data.time.TimePeriodFormatException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(byte)1);
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getFirstMillisecond();
//     int var9 = var2.getYearValue();
//     java.util.Calendar var10 = null;
//     long var11 = var2.getFirstMillisecond(var10);
// 
//   }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("Week 100, 100");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     java.util.Date var3 = var2.getEnd();
//     int var4 = var2.getWeek();
//     java.util.Calendar var5 = null;
//     long var6 = var2.getMiddleMillisecond(var5);
// 
//   }

  public void test488() {}
//   public void test488() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     boolean var6 = var2.equals((java.lang.Object)(-1L));
//     java.lang.String var7 = var2.toString();
//     long var8 = var2.getMiddleMillisecond();
//     int var9 = var2.getWeek();
//     long var10 = var2.getFirstMillisecond();
//     java.lang.String var11 = var2.toString();
//     org.jfree.data.time.TimePeriodFormatException var13 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var15 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var13.addSuppressed((java.lang.Throwable)var15);
//     org.jfree.data.time.TimePeriodFormatException var18 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     org.jfree.data.time.TimePeriodFormatException var20 = new org.jfree.data.time.TimePeriodFormatException("hi!");
//     var18.addSuppressed((java.lang.Throwable)var20);
//     var13.addSuppressed((java.lang.Throwable)var20);
//     java.lang.Throwable[] var23 = var20.getSuppressed();
//     int var24 = var2.compareTo((java.lang.Object)var23);
//     long var25 = var2.getMiddleMillisecond();
//     java.util.Calendar var26 = null;
//     long var27 = var2.getLastMillisecond(var26);
// 
//   }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    java.lang.Class var0 = null;
    org.jfree.data.time.Week var3 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var4 = var3.getEnd();
    int var5 = var3.getWeek();
    org.jfree.data.time.TimePeriodFormatException var7 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var9 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var7.addSuppressed((java.lang.Throwable)var9);
    org.jfree.data.time.TimePeriodFormatException var12 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    org.jfree.data.time.TimePeriodFormatException var14 = new org.jfree.data.time.TimePeriodFormatException("hi!");
    var12.addSuppressed((java.lang.Throwable)var14);
    var7.addSuppressed((java.lang.Throwable)var14);
    boolean var17 = var3.equals((java.lang.Object)var7);
    int var18 = var3.getYearValue();
    java.util.Date var19 = var3.getStart();
    java.util.Date var20 = var3.getStart();
    java.util.TimeZone var21 = null;
    org.jfree.data.time.RegularTimePeriod var22 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var20, var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test490() {}
//   public void test490() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getFirstMillisecond();
//     long var3 = var0.getFirstMillisecond();
//     long var4 = var0.getMiddleMillisecond();
//     java.util.Date var5 = var0.getEnd();
//     int var6 = var0.getYearValue();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1418544000000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 2014);
// 
//   }

  public void test491() {}
//   public void test491() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, 10);
//     long var3 = var2.getLastMillisecond();
//     long var4 = var2.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     java.util.Calendar var6 = null;
//     long var7 = var2.getFirstMillisecond(var6);
// 
//   }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    java.lang.Class var0 = null;
    java.lang.Class var1 = null;
    org.jfree.data.time.Week var4 = new org.jfree.data.time.Week(100, (-1));
    java.util.Date var5 = var4.getEnd();
    java.util.TimeZone var6 = null;
    org.jfree.data.time.RegularTimePeriod var7 = org.jfree.data.time.RegularTimePeriod.createInstance(var1, var5, var6);
    org.jfree.data.time.Week var8 = new org.jfree.data.time.Week(var5);
    java.util.TimeZone var9 = null;
    org.jfree.data.time.RegularTimePeriod var10 = org.jfree.data.time.RegularTimePeriod.createInstance(var0, var5, var9);
    org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(var5);
    org.jfree.data.time.Week var12 = new org.jfree.data.time.Week(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var13 = var12.getYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test493() {}
//   public void test493() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     java.util.Calendar var9 = null;
//     var2.peg(var9);
// 
//   }

  public void test494() {}
//   public void test494() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     org.jfree.data.time.Week var9 = new org.jfree.data.time.Week();
//     java.lang.String var10 = var9.toString();
//     org.jfree.data.time.RegularTimePeriod var11 = var9.next();
//     java.util.Date var12 = var9.getStart();
//     int var13 = var2.compareTo((java.lang.Object)var9);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Year var14 = var2.getYear();
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "Week 51, 2014"+ "'", var10.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-2015));
// 
//   }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     java.util.Date var3 = var0.getEnd();
//     java.util.Calendar var4 = null;
//     var0.peg(var4);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(0, (-2014));

  }

  public void test497() {}
//   public void test497() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     int var8 = var2.compareTo((java.lang.Object)0.0d);
//     org.jfree.data.time.Week var11 = new org.jfree.data.time.Week(100, (-1));
//     int var13 = var11.compareTo((java.lang.Object)0L);
//     boolean var15 = var11.equals((java.lang.Object)(-1L));
//     java.lang.String var16 = var11.toString();
//     long var17 = var11.getMiddleMillisecond();
//     int var18 = var11.getWeek();
//     int var19 = var2.compareTo((java.lang.Object)var18);
//     java.util.Date var20 = var2.getStart();
//     java.util.TimeZone var21 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var22 = new org.jfree.data.time.Week(var20, var21);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 47L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "Week 100, -1"+ "'", var16.equals("Week 100, -1"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-62138980800001L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test498() {}
//   public void test498() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }
// 
// 
//     org.jfree.data.time.Week var0 = new org.jfree.data.time.Week();
//     java.lang.String var1 = var0.toString();
//     long var2 = var0.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var3 = var0.previous();
//     java.util.Date var4 = var3.getStart();
//     java.util.TimeZone var5 = null;
//     java.util.Locale var6 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.time.Week var7 = new org.jfree.data.time.Week(var4, var5, var6);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "Week 51, 2014"+ "'", var1.equals("Week 51, 2014"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1418846399999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
// 
//   }

  public void test499() {}
//   public void test499() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }
// 
// 
//     org.jfree.data.time.Week var2 = new org.jfree.data.time.Week(100, (-1));
//     int var4 = var2.compareTo((java.lang.Object)0L);
//     org.jfree.data.time.RegularTimePeriod var5 = var2.previous();
//     long var6 = var2.getSerialIndex();
//     long var7 = var2.getSerialIndex();
//     long var8 = var2.getMiddleMillisecond();
//     long var9 = var2.getFirstMillisecond();
//     long var10 = var2.getFirstMillisecond();
//     long var11 = var2.getLastMillisecond();
//     java.util.Calendar var12 = null;
//     long var13 = var2.getFirstMillisecond(var12);
// 
//   }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Week var1 = org.jfree.data.time.Week.parseWeek("org.jfree.data.time.TimePeriodFormatException: Week 10, 100");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

}
