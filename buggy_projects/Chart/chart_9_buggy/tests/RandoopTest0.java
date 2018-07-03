
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    org.jfree.data.time.SerialDate var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Day var1 = new org.jfree.data.time.Day(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = org.jfree.data.time.SerialDate.weekInMonthToString(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Last"+ "'", var1.equals("Last"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    org.jfree.data.time.SerialDate var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getNearestDayOfWeek(10, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var2 = org.jfree.data.time.SerialDate.monthCodeToString(1, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "January"+ "'", var2.equals("January"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var1 = org.jfree.data.time.SerialDate.stringToMonthCode("Last");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = org.jfree.data.time.SerialDate.weekdayCodeToString(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String[] var1 = org.jfree.data.time.SerialDate.getMonths(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = org.jfree.data.time.RegularTimePeriod.downsize(var0);
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.TimeSeriesDataItem var4 = var2.getDataItem(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var1 = org.jfree.data.time.Month.parseMonth("");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var1 = new org.jfree.data.time.Year(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    java.lang.Class var3 = var2.getTimePeriodClass();
    java.lang.Class var5 = null;
    org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
    java.lang.Class var7 = var6.getTimePeriodClass();
    java.util.Collection var8 = var2.getTimePeriodsUniqueToOtherSeries(var6);
    org.jfree.data.time.RegularTimePeriod var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var10 = var6.getValue(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var1 = org.jfree.data.time.SerialDate.isLeapYear((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    org.jfree.data.time.RegularTimePeriod var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.TimeSeriesDataItem var2 = new org.jfree.data.time.TimeSeriesDataItem(var0, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    int var3 = var2.getItemCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.RegularTimePeriod var4 = var2.getNextTimePeriod();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(10, var1);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     org.jfree.data.time.FixedMillisecond var0 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     java.util.Calendar var2 = null;
//     long var3 = var0.getMiddleMillisecond(var2);
//     java.util.Calendar var4 = null;
//     long var5 = var0.getLastMillisecond(var4);
//     java.util.Calendar var6 = null;
//     var0.peg(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1419139747368L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1419139747368L);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    org.jfree.data.general.SeriesChangeListener var3 = null;
    var2.addChangeListener(var3);
    org.jfree.data.time.TimeSeriesDataItem var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(var5, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    int var1 = org.jfree.data.time.SerialDate.leapYearCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-435));

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addDays(10, var1);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.data.time.Year var1 = new org.jfree.data.time.Year(var0);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     java.lang.Class var3 = var2.getTimePeriodClass();
//     java.lang.Class var5 = null;
//     org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
//     org.jfree.data.time.FixedMillisecond var7 = new org.jfree.data.time.FixedMillisecond();
//     var6.delete((org.jfree.data.time.RegularTimePeriod)var7);
//     var2.add((org.jfree.data.time.RegularTimePeriod)var7, 0.0d);
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = org.jfree.data.time.SerialDate.monthCodeToQuarter(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addDays(0, var1);
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var0 = null;
    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Day var2 = new org.jfree.data.time.Day(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     org.jfree.data.time.Year var0 = new org.jfree.data.time.Year();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.next();
//     java.util.Calendar var2 = null;
//     long var3 = var0.getFirstMillisecond(var2);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekdayCode(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.jfree.data.time.SerialDate.lastDayOfMonth((-435), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     org.jfree.data.general.SeriesException var1 = new org.jfree.data.general.SeriesException("");
//     java.lang.Throwable[] var2 = var1.getSuppressed();
//     java.lang.Throwable var3 = null;
//     var1.addSuppressed(var3);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    int var3 = var2.getItemCount();
    java.lang.String var4 = var2.getDescription();
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setMaximumItemAge((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     int var3 = var2.getItemCount();
//     java.lang.String var4 = var2.getDescription();
//     var2.clear();
//     org.jfree.data.time.TimeSeries var6 = null;
//     org.jfree.data.time.TimeSeries var7 = var2.addAndOrUpdate(var6);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    int var3 = var2.getItemCount();
    java.lang.String var4 = var2.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.update(1, (java.lang.Number)(short)10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     org.jfree.data.time.FixedMillisecond var3 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var4 = var3.previous();
//     java.util.Calendar var5 = null;
//     long var6 = var3.getMiddleMillisecond(var5);
//     java.lang.Number var7 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var2.update((org.jfree.data.time.RegularTimePeriod)var3, var7);
//       fail("Expected exception of type org.jfree.data.general.SeriesException");
//     } catch (org.jfree.data.general.SeriesException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1419139747484L);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     java.util.Date var0 = null;
//     java.util.TimeZone var1 = null;
//     org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(var0, var1);
// 
//   }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.data.time.SerialDate var1 = org.jfree.data.time.SerialDate.createInstance(var0);
// 
//   }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     org.jfree.data.time.FixedMillisecond var0 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var1 = var0.previous();
//     java.lang.String var2 = var1.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "Sat Dec 20 21:29:07 PST 2014"+ "'", var2.equals("Sat Dec 20 21:29:07 PST 2014"));
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    java.lang.Class var3 = var2.getTimePeriodClass();
    java.lang.Class var5 = null;
    org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
    java.lang.Class var7 = var6.getTimePeriodClass();
    java.util.Collection var8 = var2.getTimePeriodsUniqueToOtherSeries(var6);
    java.lang.String var9 = var6.getDomainDescription();
    var6.setNotify(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.delete(2147483647, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Time"+ "'", var9.equals("Time"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.jfree.data.time.SerialDate.lastDayOfMonth(100, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     java.util.Date var0 = null;
//     java.util.TimeZone var1 = null;
//     org.jfree.data.time.Year var2 = new org.jfree.data.time.Year(var0, var1);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = org.jfree.data.time.SerialDate.monthCodeToQuarter((-435));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = org.jfree.data.time.SerialDate.monthCodeToString((-435), false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.jfree.data.time.Day var1 = org.jfree.data.time.Day.parseDay("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(100, (-435));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekInMonthCode(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.RegularTimePeriod var4 = var2.getTimePeriod(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addYears(0, var1);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekInMonthCode(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var2 = new org.jfree.data.time.Month((-435), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     int var3 = var2.getItemCount();
//     java.lang.Class var5 = null;
//     org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
//     org.jfree.data.time.FixedMillisecond var7 = new org.jfree.data.time.FixedMillisecond();
//     var6.delete((org.jfree.data.time.RegularTimePeriod)var7);
//     java.lang.Class var10 = null;
//     org.jfree.data.time.TimeSeries var11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var10);
//     org.jfree.data.time.FixedMillisecond var12 = new org.jfree.data.time.FixedMillisecond();
//     var11.delete((org.jfree.data.time.RegularTimePeriod)var12);
//     java.lang.Number var14 = var6.getValue((org.jfree.data.time.RegularTimePeriod)var12);
//     org.jfree.data.time.TimeSeriesDataItem var15 = var2.getDataItem((org.jfree.data.time.RegularTimePeriod)var12);
//     org.jfree.data.time.Year var16 = new org.jfree.data.time.Year();
//     org.jfree.data.time.RegularTimePeriod var17 = var16.next();
//     var2.add((org.jfree.data.time.RegularTimePeriod)var16, 100.0d, true);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.jfree.data.general.SeriesChangeEvent var1 = new org.jfree.data.general.SeriesChangeEvent((java.lang.Object)1419139747407L);
    java.lang.Object var2 = var1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 1419139747407L+ "'", var2.equals(1419139747407L));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    int var2 = org.jfree.data.time.SerialDate.lastDayOfMonth(10, 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 31);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = org.jfree.data.time.SerialDate.weekdayCodeToString((-435));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addYears(2147483647, var1);
// 
//   }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     boolean var3 = var2.getNotify();
//     boolean var4 = var2.getNotify();
//     org.jfree.data.time.FixedMillisecond var5 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var6 = var5.previous();
//     java.util.Calendar var7 = null;
//     long var8 = var5.getMiddleMillisecond(var7);
//     java.util.Calendar var9 = null;
//     long var10 = var5.getLastMillisecond(var9);
//     var2.add((org.jfree.data.time.RegularTimePeriod)var5, 10.0d);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.jfree.data.time.Day var1 = org.jfree.data.time.Day.parseDay("Time");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.jfree.data.time.Day var1 = org.jfree.data.time.Day.parseDay("Last");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SpreadsheetDate var3 = new org.jfree.data.time.SpreadsheetDate(0, 0, (-435));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SpreadsheetDate var1 = new org.jfree.data.time.SpreadsheetDate(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Day var3 = new org.jfree.data.time.Day(2147483647, (-435), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     java.lang.Class var3 = null;
//     org.jfree.data.time.TimeSeries var4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)10, "", "Value", var3);
//     java.lang.Class var6 = null;
//     org.jfree.data.time.TimeSeries var7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var6);
//     java.lang.Class var8 = var7.getTimePeriodClass();
//     java.util.List var9 = var7.getItems();
//     org.jfree.data.time.Year var10 = new org.jfree.data.time.Year();
//     org.jfree.data.time.FixedMillisecond var11 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var12 = var11.previous();
//     org.jfree.data.time.TimeSeries var13 = var7.createCopy((org.jfree.data.time.RegularTimePeriod)var10, var12);
//     long var14 = var10.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var15 = var10.next();
//     long var16 = var15.getMiddleMillisecond();
//     var4.add(var15, (java.lang.Number)1419139747636L);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekInMonthCode((-435));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekInMonthCode(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addDays(100, var1);
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.jfree.data.time.SerialDate var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getFollowingDayOfWeek(2147483647, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     int var3 = var2.getItemCount();
//     java.lang.String var4 = var2.getDescription();
//     java.beans.PropertyChangeListener var5 = null;
//     var2.removePropertyChangeListener(var5);
//     java.lang.Class var8 = null;
//     org.jfree.data.time.TimeSeries var9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var8);
//     java.lang.Class var10 = var9.getTimePeriodClass();
//     java.util.List var11 = var9.getItems();
//     org.jfree.data.time.Year var12 = new org.jfree.data.time.Year();
//     org.jfree.data.time.FixedMillisecond var13 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var14 = var13.previous();
//     org.jfree.data.time.TimeSeries var15 = var9.createCopy((org.jfree.data.time.RegularTimePeriod)var12, var14);
//     long var16 = var12.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var17 = var12.next();
//     long var18 = var17.getMiddleMillisecond();
//     var2.add(var17, (java.lang.Number)1419139747630L);
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    java.lang.Class var3 = var2.getTimePeriodClass();
    java.util.List var4 = var2.getItems();
    org.jfree.data.time.Year var5 = new org.jfree.data.time.Year();
    org.jfree.data.time.FixedMillisecond var6 = new org.jfree.data.time.FixedMillisecond();
    org.jfree.data.time.RegularTimePeriod var7 = var6.previous();
    org.jfree.data.time.TimeSeries var8 = var2.createCopy((org.jfree.data.time.RegularTimePeriod)var5, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.TimeSeriesDataItem var10 = var2.getDataItem(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var1 = org.jfree.data.time.Month.parseMonth("2014");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     java.lang.Class var3 = var2.getTimePeriodClass();
//     java.util.List var4 = var2.getItems();
//     org.jfree.data.time.Year var5 = new org.jfree.data.time.Year();
//     org.jfree.data.time.FixedMillisecond var6 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var7 = var6.previous();
//     org.jfree.data.time.TimeSeries var8 = var2.createCopy((org.jfree.data.time.RegularTimePeriod)var5, var7);
//     long var9 = var5.getFirstMillisecond();
//     long var10 = var5.getSerialIndex();
//     java.util.Calendar var11 = null;
//     long var12 = var5.getLastMillisecond(var11);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     java.lang.Class var3 = var2.getTimePeriodClass();
//     java.lang.Class var5 = null;
//     org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
//     java.lang.Class var7 = var6.getTimePeriodClass();
//     java.util.Collection var8 = var2.getTimePeriodsUniqueToOtherSeries(var6);
//     var2.removeAgedItems(1L, true);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.jfree.data.time.SerialDate var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getPreviousDayOfWeek(2147483647, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.data.time.FixedMillisecond var1 = new org.jfree.data.time.FixedMillisecond(var0);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekdayCode(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    java.lang.String var1 = org.jfree.data.time.SerialDate.weekdayCodeToString(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addMonths(2147483647, var1);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    org.jfree.data.time.FixedMillisecond var3 = new org.jfree.data.time.FixedMillisecond();
    var2.delete((org.jfree.data.time.RegularTimePeriod)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.delete(31, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    boolean var3 = var2.getNotify();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.TimeSeriesDataItem var5 = var2.getDataItem(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     java.lang.Class var3 = var2.getTimePeriodClass();
//     java.lang.Class var5 = null;
//     org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
//     java.lang.Class var7 = var6.getTimePeriodClass();
//     java.util.Collection var8 = var2.getTimePeriodsUniqueToOtherSeries(var6);
//     int var9 = var6.getMaximumItemCount();
//     org.jfree.data.time.Year var10 = new org.jfree.data.time.Year();
//     org.jfree.data.time.RegularTimePeriod var11 = var10.next();
//     org.jfree.data.time.TimeSeriesDataItem var12 = var6.getDataItem(var11);
//     java.lang.Class var14 = null;
//     org.jfree.data.time.TimeSeries var15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var14);
//     int var16 = var15.getItemCount();
//     java.lang.Class var18 = null;
//     org.jfree.data.time.TimeSeries var19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var18);
//     org.jfree.data.time.FixedMillisecond var20 = new org.jfree.data.time.FixedMillisecond();
//     var19.delete((org.jfree.data.time.RegularTimePeriod)var20);
//     java.lang.Class var23 = null;
//     org.jfree.data.time.TimeSeries var24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var23);
//     org.jfree.data.time.FixedMillisecond var25 = new org.jfree.data.time.FixedMillisecond();
//     var24.delete((org.jfree.data.time.RegularTimePeriod)var25);
//     java.lang.Number var27 = var19.getValue((org.jfree.data.time.RegularTimePeriod)var25);
//     org.jfree.data.time.TimeSeriesDataItem var28 = var15.getDataItem((org.jfree.data.time.RegularTimePeriod)var25);
//     int var29 = var6.getIndex((org.jfree.data.time.RegularTimePeriod)var25);
//     org.jfree.data.time.FixedMillisecond var30 = new org.jfree.data.time.FixedMillisecond();
//     long var31 = var30.getLastMillisecond();
//     var6.add((org.jfree.data.time.RegularTimePeriod)var30, 1.0d);
// 
//   }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addYears((-1), var1);
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var3 = org.jfree.data.time.SerialDate.createInstance((-435), 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     org.jfree.data.time.FixedMillisecond var3 = new org.jfree.data.time.FixedMillisecond();
//     var2.delete((org.jfree.data.time.RegularTimePeriod)var3);
//     java.util.Calendar var5 = null;
//     long var6 = var3.getMiddleMillisecond(var5);
//     java.lang.Class var7 = null;
//     org.jfree.data.time.TimeSeries var8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)var3, var7);
//     java.lang.Class var10 = null;
//     org.jfree.data.time.TimeSeries var11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var10);
//     java.lang.Class var12 = var11.getTimePeriodClass();
//     java.util.List var13 = var11.getItems();
//     org.jfree.data.time.Year var14 = new org.jfree.data.time.Year();
//     org.jfree.data.time.FixedMillisecond var15 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var16 = var15.previous();
//     org.jfree.data.time.TimeSeries var17 = var11.createCopy((org.jfree.data.time.RegularTimePeriod)var14, var16);
//     org.jfree.data.time.TimeSeriesDataItem var19 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod)var14, (java.lang.Number)(short)100);
//     int var21 = var19.compareTo((java.lang.Object)' ');
//     var8.add(var19);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     org.jfree.data.time.SpreadsheetDate var1 = new org.jfree.data.time.SpreadsheetDate(31);
//     java.lang.Class var3 = null;
//     org.jfree.data.time.TimeSeries var4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var3);
//     java.lang.Class var5 = var4.getTimePeriodClass();
//     java.lang.Class var7 = null;
//     org.jfree.data.time.TimeSeries var8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var7);
//     java.lang.Class var9 = var8.getTimePeriodClass();
//     java.util.Collection var10 = var4.getTimePeriodsUniqueToOtherSeries(var8);
//     int var11 = var8.getMaximumItemCount();
//     org.jfree.data.time.Year var12 = new org.jfree.data.time.Year();
//     org.jfree.data.time.RegularTimePeriod var13 = var12.next();
//     org.jfree.data.time.TimeSeriesDataItem var14 = var8.getDataItem(var13);
//     java.lang.Class var16 = null;
//     org.jfree.data.time.TimeSeries var17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var16);
//     int var18 = var17.getItemCount();
//     java.lang.Class var20 = null;
//     org.jfree.data.time.TimeSeries var21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var20);
//     org.jfree.data.time.FixedMillisecond var22 = new org.jfree.data.time.FixedMillisecond();
//     var21.delete((org.jfree.data.time.RegularTimePeriod)var22);
//     java.lang.Class var25 = null;
//     org.jfree.data.time.TimeSeries var26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var25);
//     org.jfree.data.time.FixedMillisecond var27 = new org.jfree.data.time.FixedMillisecond();
//     var26.delete((org.jfree.data.time.RegularTimePeriod)var27);
//     java.lang.Number var29 = var21.getValue((org.jfree.data.time.RegularTimePeriod)var27);
//     org.jfree.data.time.TimeSeriesDataItem var30 = var17.getDataItem((org.jfree.data.time.RegularTimePeriod)var27);
//     int var31 = var8.getIndex((org.jfree.data.time.RegularTimePeriod)var27);
//     java.lang.String var32 = var8.getDomainDescription();
//     java.lang.Class var34 = null;
//     org.jfree.data.time.TimeSeries var35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var34);
//     java.lang.Class var36 = var35.getTimePeriodClass();
//     java.util.List var37 = var35.getItems();
//     org.jfree.data.time.Year var38 = new org.jfree.data.time.Year();
//     org.jfree.data.time.FixedMillisecond var39 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var40 = var39.previous();
//     org.jfree.data.time.TimeSeries var41 = var35.createCopy((org.jfree.data.time.RegularTimePeriod)var38, var40);
//     long var42 = var38.getFirstMillisecond();
//     org.jfree.data.time.RegularTimePeriod var43 = var38.next();
//     long var44 = var38.getFirstMillisecond();
//     org.jfree.data.time.Year var45 = new org.jfree.data.time.Year();
//     org.jfree.data.time.RegularTimePeriod var46 = var45.previous();
//     java.lang.Class var48 = null;
//     org.jfree.data.time.TimeSeries var49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var48);
//     java.lang.Class var50 = var49.getTimePeriodClass();
//     java.util.List var51 = var49.getItems();
//     org.jfree.data.time.Year var52 = new org.jfree.data.time.Year();
//     org.jfree.data.time.FixedMillisecond var53 = new org.jfree.data.time.FixedMillisecond();
//     org.jfree.data.time.RegularTimePeriod var54 = var53.previous();
//     org.jfree.data.time.TimeSeries var55 = var49.createCopy((org.jfree.data.time.RegularTimePeriod)var52, var54);
//     boolean var56 = var45.equals((java.lang.Object)var54);
//     org.jfree.data.time.RegularTimePeriod var57 = var45.previous();
//     org.jfree.data.time.TimeSeries var58 = var8.createCopy((org.jfree.data.time.RegularTimePeriod)var38, (org.jfree.data.time.RegularTimePeriod)var45);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var59 = var1.compareTo((java.lang.Object)var45);
//       fail("Expected exception of type java.lang.ClassCastException");
//     } catch (java.lang.ClassCastException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 2147483647);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var32 + "' != '" + "Time"+ "'", var32.equals("Time"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var37);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var42 == 1388563200000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var43);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var44 == 1388563200000L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var50);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var54);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var55);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var56 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = org.jfree.data.time.SerialDate.monthCodeToString(2147483647);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    java.lang.Class var1 = null;
    org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
    java.lang.Class var3 = var2.getTimePeriodClass();
    java.lang.Class var5 = null;
    org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
    java.lang.Class var7 = var6.getTimePeriodClass();
    java.util.Collection var8 = var2.getTimePeriodsUniqueToOtherSeries(var6);
    int var9 = var6.getMaximumItemCount();
    org.jfree.data.time.Year var10 = new org.jfree.data.time.Year();
    org.jfree.data.time.RegularTimePeriod var11 = var10.next();
    org.jfree.data.time.TimeSeriesDataItem var12 = var6.getDataItem(var11);
    java.lang.Class var14 = null;
    org.jfree.data.time.TimeSeries var15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var14);
    int var16 = var15.getItemCount();
    java.lang.Class var18 = null;
    org.jfree.data.time.TimeSeries var19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var18);
    org.jfree.data.time.FixedMillisecond var20 = new org.jfree.data.time.FixedMillisecond();
    var19.delete((org.jfree.data.time.RegularTimePeriod)var20);
    java.lang.Class var23 = null;
    org.jfree.data.time.TimeSeries var24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var23);
    org.jfree.data.time.FixedMillisecond var25 = new org.jfree.data.time.FixedMillisecond();
    var24.delete((org.jfree.data.time.RegularTimePeriod)var25);
    java.lang.Number var27 = var19.getValue((org.jfree.data.time.RegularTimePeriod)var25);
    org.jfree.data.time.TimeSeriesDataItem var28 = var15.getDataItem((org.jfree.data.time.RegularTimePeriod)var25);
    int var29 = var6.getIndex((org.jfree.data.time.RegularTimePeriod)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.TimeSeriesDataItem var31 = var6.getDataItem(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    java.lang.String[] var1 = org.jfree.data.time.SerialDate.getMonths(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     java.lang.Class var3 = var2.getTimePeriodClass();
//     java.lang.Class var5 = null;
//     org.jfree.data.time.TimeSeries var6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var5);
//     java.lang.Class var7 = var6.getTimePeriodClass();
//     java.util.Collection var8 = var2.getTimePeriodsUniqueToOtherSeries(var6);
//     java.lang.String var9 = var6.getDomainDescription();
//     var6.setNotify(true);
//     java.lang.Class var13 = null;
//     org.jfree.data.time.TimeSeries var14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var13);
//     int var15 = var14.getItemCount();
//     java.lang.Class var17 = null;
//     org.jfree.data.time.TimeSeries var18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var17);
//     org.jfree.data.time.FixedMillisecond var19 = new org.jfree.data.time.FixedMillisecond();
//     var18.delete((org.jfree.data.time.RegularTimePeriod)var19);
//     java.lang.Class var22 = null;
//     org.jfree.data.time.TimeSeries var23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var22);
//     org.jfree.data.time.FixedMillisecond var24 = new org.jfree.data.time.FixedMillisecond();
//     var23.delete((org.jfree.data.time.RegularTimePeriod)var24);
//     java.lang.Number var26 = var18.getValue((org.jfree.data.time.RegularTimePeriod)var24);
//     org.jfree.data.time.TimeSeriesDataItem var27 = var14.getDataItem((org.jfree.data.time.RegularTimePeriod)var24);
//     var6.add((org.jfree.data.time.RegularTimePeriod)var24, (-1.0d));
// 
//   }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     java.lang.Class var1 = null;
//     org.jfree.data.time.TimeSeries var2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)(short)100, var1);
//     org.jfree.data.time.FixedMillisecond var3 = new org.jfre