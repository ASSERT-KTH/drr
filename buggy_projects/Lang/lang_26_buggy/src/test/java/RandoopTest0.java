
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.TimeZone var2 = null;
    java.util.Locale var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 0, var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     java.text.ParsePosition var4 = null;
//     java.lang.Object var5 = var2.parseObject("", var4);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.TimeZone var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 10, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Locale var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:00:00 PM PST", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     java.util.Date var6 = null;
//     java.lang.String var7 = var2.format(var6);
// 
//   }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.text.ParsePosition var2 = null;
//     java.lang.Object var3 = var0.parseObject("FastDateFormat[MMMM d, yyyy]", var2);
// 
//   }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
//     java.lang.StringBuffer var3 = null;
//     java.lang.StringBuffer var4 = var1.format(100L, var3);
// 
//   }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var1);
//     java.util.Date var3 = null;
//     java.lang.String var4 = var2.format(var3);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.TimeZone var1 = null;
    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var1);
//     java.lang.StringBuffer var4 = null;
//     java.lang.StringBuffer var5 = var2.format(0L, var4);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.TimeZone var2 = null;
    java.util.Locale var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 100, var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.TimeZone var1 = null;
    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.lang.StringBuffer var5 = null;
//     java.lang.StringBuffer var6 = var3.format(100L, var5);
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var2 = null;
    java.util.Locale var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, 1, var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.TimeZone var1 = null;
    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var4 = var2.toString();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.text.AttributedCharacterIterator var6 = var2.formatToCharacterIterator((java.lang.Object)0.0f);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var4 + "' != '" + "FastDateFormat[h:mm:ss a z]"+ "'", var4.equals("FastDateFormat[h:mm:ss a z]"));
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("3:59:59 PM PST");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Locale var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy]", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
//     java.lang.String var2 = var1.toString();
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var4);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var6 = var1.format((java.lang.Object)var4);
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
//     assertTrue("'" + var2 + "' != '" + "FastDateFormat[MMMM d, yyyy]"+ "'", var2.equals("FastDateFormat[MMMM d, yyyy]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.lang.String var4 = var3.toString();
//     java.lang.StringBuffer var6 = null;
//     java.lang.StringBuffer var7 = var3.format(1L, var6);
// 
//   }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format((java.lang.Object)(-1L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var7 = var2.parseObject("FastDateFormat[h:mm:ss a z]");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "3:59:59 PM PST"+ "'", var5.equals("3:59:59 PM PST"));
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.TimeZone var1 = null;
    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:00:00 PM PST", var1, var2);
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
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.StringBuffer var2 = null;
//     java.lang.StringBuffer var3 = var0.format(10L, var2);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Locale var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("3:59:59 PM PST", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy]", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
//     java.lang.String var2 = var1.toString();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var4 = var1.parseObject("3:59:59 PM PST");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "FastDateFormat[MMMM d, yyyy]"+ "'", var2.equals("FastDateFormat[MMMM d, yyyy]"));
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.TimeZone var2 = null;
    java.util.Locale var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), (-1), var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Locale var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     java.lang.StringBuffer var7 = null;
//     java.lang.StringBuffer var8 = var2.format((-1L), var7);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.TimeZone var1 = null;
    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10, var1, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var2);
//     java.lang.Object var4 = var3.clone();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var3.parseObject("M/d/yy h:mm a", var6);
// 
//   }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a]", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var2);
//     java.util.Date var4 = null;
//     java.lang.String var5 = var3.format(var4);
// 
//   }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var1);
//     java.lang.String var3 = var2.toString();
//     java.util.Calendar var4 = null;
//     java.lang.String var5 = var2.format(var4);
// 
//   }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.TimeZone var4 = var3.getTimeZone();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var3.parseObject("", var6);
// 
//   }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.Locale var4 = var3.getLocale();
//     java.lang.String var5 = var3.getPattern();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var7 = var3.parseObject("FastDateFormat[M/d/yy h:mm a]");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "EEEE, MMMM d, yyyy h:mm:ss a z"+ "'", var5.equals("EEEE, MMMM d, yyyy h:mm:ss a z"));
// 
//   }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.TimeZone var5 = var4.getTimeZone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy]", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.lang.String var4 = var3.toString();
//     java.util.Date var5 = null;
//     java.lang.String var6 = var3.format(var5);
// 
//   }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
    java.util.TimeZone var4 = var3.getTimeZone();
    java.lang.StringBuffer var6 = null;
    java.text.FieldPosition var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var8 = var3.format((java.lang.Object)(byte)0, var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     java.lang.String var7 = var2.format(1L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var9 = var2.parseObject("4:00:00 PM PST");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "4:00:00 PM PST"+ "'", var5.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "4:00:00 PM PST"+ "'", var7.equals("4:00:00 PM PST"));
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, 100, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.TimeZone var5 = var4.getTimeZone();
    java.util.Locale var8 = null;
    org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var8);
    java.util.Locale var10 = var9.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, var5, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0);
//     java.util.Date var3 = null;
//     java.lang.String var4 = var2.format(var3);
// 
//   }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.lang.String var4 = var3.toString();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var6 = var3.format((java.lang.Object)(byte)100);
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
//     assertTrue("'" + var4 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]"+ "'", var4.equals("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]"));
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.parseObject("FastDateFormat[M/d/yy h:mm a]");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.TimeZone var5 = var4.getTimeZone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:00 PM", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0);
//     java.util.Calendar var2 = null;
//     java.lang.String var3 = var1.format(var2);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var2);
//     java.lang.Object var4 = var3.clone();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var3.parseObject("FastDateFormat[h:mm:ss a z]", var6);
// 
//   }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.TimeZone var6 = var5.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
    java.util.Locale var4 = var3.getLocale();
    java.lang.StringBuffer var6 = null;
    java.text.FieldPosition var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var8 = var3.format((java.lang.Object)(-1), var6, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z]");
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
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
//     java.util.Calendar var2 = null;
//     java.lang.String var3 = var1.format(var2);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0);
//     java.util.Locale var5 = null;
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
//     java.util.Locale var7 = var6.getLocale();
//     java.lang.String var8 = var6.getPattern();
//     java.lang.StringBuffer var9 = null;
//     java.text.FieldPosition var10 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.StringBuffer var11 = var2.format((java.lang.Object)var8, var9, var10);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "EEEE, MMMM d, yyyy h:mm:ss a z"+ "'", var8.equals("EEEE, MMMM d, yyyy h:mm:ss a z"));
// 
//   }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.util.TimeZone var2 = var0.getTimeZone();
//     java.lang.StringBuffer var4 = null;
//     java.lang.StringBuffer var5 = var0.format(10L, var4);
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.format((java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var2 = var1.getPattern();
//     java.util.TimeZone var3 = var1.getTimeZone();
//     java.util.Locale var7 = null;
//     org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var7);
//     java.util.Locale var9 = var8.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var9);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, var3, var9);
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
//     assertTrue("'" + var2 + "' != '" + "M/d/yy h:mm a"+ "'", var2.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
//     java.lang.String var2 = var1.toString();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var4 = var1.parseObject("");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "FastDateFormat[MMMM d, yyyy]"+ "'", var2.equals("FastDateFormat[MMMM d, yyyy]"));
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.util.TimeZone var2 = var0.getTimeZone();
//     java.text.ParsePosition var4 = null;
//     java.lang.Object var5 = var0.parseObject("FastDateFormat[MMMM d, yyyy]", var4);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    java.util.TimeZone var1 = null;
    org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
    boolean var3 = var2.getTimeZoneOverridesCalendar();
    java.util.TimeZone var4 = var2.getTimeZone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.parseObject("hi!");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18);
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
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var2);
//     java.util.Calendar var4 = null;
//     java.lang.String var5 = var3.format(var4);
// 
//   }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object var6 = var2.parseObject("h:mm:ss a z", var5);
// 
//   }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var4);
//     boolean var6 = var5.getTimeZoneOverridesCalendar();
//     java.lang.String var8 = var5.format(1L);
//     java.lang.String var10 = var5.format(1L);
//     int var11 = var5.getMaxLengthEstimate();
//     java.util.TimeZone var12 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var12);
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 18);
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
//   }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
//     java.lang.String var2 = var1.toString();
//     boolean var3 = var1.getTimeZoneOverridesCalendar();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object var6 = var1.parseObject("3:59:59 PM PST", var5);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var1);
//     java.util.Calendar var3 = null;
//     java.lang.StringBuffer var4 = null;
//     java.lang.StringBuffer var5 = var2.format(var3, var4);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a]", var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.TimeZone var6 = var5.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.Locale var4 = var3.getLocale();
//     java.lang.String var5 = var3.getPattern();
//     java.lang.String var6 = var3.toString();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.text.AttributedCharacterIterator var8 = var3.formatToCharacterIterator((java.lang.Object)"hi!");
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
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "EEEE, MMMM d, yyyy h:mm:ss a z"+ "'", var5.equals("EEEE, MMMM d, yyyy h:mm:ss a z"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]"+ "'", var6.equals("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]"));
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:00 PM");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var4 = var2.toString();
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
//     int var7 = var6.getMaxLengthEstimate();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var8 = var2.format((java.lang.Object)var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var4 + "' != '" + "FastDateFormat[h:mm:ss a z]"+ "'", var4.equals("FastDateFormat[h:mm:ss a z]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 18);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var1);
//     java.text.ParsePosition var4 = null;
//     java.lang.Object var5 = var2.parseObject("12/31/69 4:00 PM", var4);
// 
//   }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     java.util.TimeZone var5 = null;
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var5);
//     boolean var7 = var6.getTimeZoneOverridesCalendar();
//     java.lang.String var9 = var6.format(1L);
//     java.lang.String var11 = var6.format(1L);
//     int var12 = var6.getMaxLengthEstimate();
//     java.util.TimeZone var13 = var6.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var13);
//     org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var13);
//     java.util.Locale var16 = var15.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(18, (-1), var16);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "4:00:00 PM PST"+ "'", var9.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "4:00:00 PM PST"+ "'", var11.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
// 
//   }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     java.lang.String var7 = var2.format(1L);
//     java.util.Locale var8 = var2.getLocale();
//     java.lang.StringBuffer var10 = null;
//     java.lang.StringBuffer var11 = var2.format(1L, var10);
// 
//   }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var4);
//     boolean var6 = var5.getTimeZoneOverridesCalendar();
//     java.lang.String var8 = var5.format(1L);
//     java.lang.String var10 = var5.format(1L);
//     int var11 = var5.getMaxLengthEstimate();
//     java.util.TimeZone var12 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var12);
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var12);
//     java.util.Locale var15 = var14.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), var15);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 18);
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
//     assertNotNull(var15);
// 
//   }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.util.Locale var6 = null;
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var6);
    java.util.TimeZone var8 = var7.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var8);
    java.util.Locale var14 = null;
    org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var14);
    java.util.Locale var16 = var15.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var16);
    java.util.Locale var18 = var17.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", var18);
    org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var8, var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 18, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1);
//     java.util.Calendar var2 = null;
//     java.lang.StringBuffer var3 = null;
//     java.lang.StringBuffer var4 = var1.format(var2, var3);
// 
//   }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var1);
//     java.util.Calendar var3 = null;
//     java.lang.String var4 = var2.format(var3);
// 
//   }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.lang.String var2 = var0.toString();
//     java.util.Locale var5 = null;
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
//     java.util.TimeZone var7 = var6.getTimeZone();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var8 = var0.format((java.lang.Object)var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "M/d/yy h:mm a"+ "'", var1.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "FastDateFormat[M/d/yy h:mm a]"+ "'", var2.equals("FastDateFormat[M/d/yy h:mm a]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
// 
//   }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.util.TimeZone var4 = var2.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var7 = var5.format(10L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.text.AttributedCharacterIterator var8 = var2.formatToCharacterIterator((java.lang.Object)var7);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "12/31/69 4:00 PM"+ "'", var7.equals("12/31/69 4:00 PM"));
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    java.util.Locale var5 = null;
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
    java.util.Locale var7 = var6.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var7);
    org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     java.util.Locale var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
//     java.util.TimeZone var6 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
//     java.util.TimeZone var9 = null;
//     org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var9);
//     boolean var11 = var10.getTimeZoneOverridesCalendar();
//     java.lang.String var13 = var10.format(1L);
//     java.lang.String var15 = var10.format(1L);
//     java.util.Locale var16 = var10.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, var6, var16);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var13 + "' != '" + "4:00:00 PM PST"+ "'", var13.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "4:00:00 PM PST"+ "'", var15.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    java.util.Locale var8 = var7.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy]", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     java.util.TimeZone var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var3);
//     boolean var5 = var4.getTimeZoneOverridesCalendar();
//     java.lang.String var7 = var4.format(1L);
//     java.lang.String var9 = var4.format(1L);
//     int var10 = var4.getMaxLengthEstimate();
//     java.util.TimeZone var11 = var4.getTimeZone();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 0, var11);
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
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "4:00:00 PM PST"+ "'", var7.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "4:00:00 PM PST"+ "'", var9.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
// 
//   }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
//     java.util.Locale var5 = var4.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var5);
//     java.util.Locale var7 = var6.getLocale();
//     java.util.Date var8 = null;
//     java.lang.StringBuffer var9 = null;
//     java.lang.StringBuffer var10 = var6.format(var8, var9);
// 
//   }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.Locale var4 = var3.getLocale();
//     java.util.Date var5 = null;
//     java.lang.StringBuffer var6 = null;
//     java.lang.StringBuffer var7 = var3.format(var5, var6);
// 
//   }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 18, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(50, 100, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    java.util.Locale var5 = null;
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
    java.util.Locale var7 = var6.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var7);
    org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     java.util.TimeZone var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var3);
//     boolean var5 = var4.getTimeZoneOverridesCalendar();
//     java.lang.String var7 = var4.format(1L);
//     java.lang.String var9 = var4.format(1L);
//     int var10 = var4.getMaxLengthEstimate();
//     java.util.TimeZone var11 = var4.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var11);
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var11);
//     java.lang.StringBuffer var15 = null;
//     java.lang.StringBuffer var16 = var13.format(10L, var15);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var5);
    java.lang.Object var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var8 = var6.formatToCharacterIterator(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.Locale var4 = var3.getLocale();
//     java.lang.String var5 = var3.getPattern();
//     java.lang.String var6 = var3.toString();
//     java.lang.Object var7 = var3.clone();
//     java.util.Calendar var8 = null;
//     java.lang.String var9 = var3.format(var8);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var3 = var2.getPattern();
//     java.util.TimeZone var4 = var2.getTimeZone();
//     java.util.Locale var8 = null;
//     org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var8);
//     java.util.Locale var10 = var9.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var10);
//     java.util.Locale var12 = var11.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var4, var12);
//     java.util.TimeZone var15 = null;
//     java.util.TimeZone var19 = null;
//     org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var19);
//     boolean var21 = var20.getTimeZoneOverridesCalendar();
//     java.lang.String var23 = var20.format(1L);
//     java.lang.String var25 = var20.format(1L);
//     int var26 = var20.getMaxLengthEstimate();
//     java.util.TimeZone var27 = var20.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var27);
//     org.apache.commons.lang3.time.FastDateFormat var29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var27);
//     java.util.Locale var30 = var29.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", var15, var30);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, var4, var30);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var3 + "' != '" + "M/d/yy h:mm a"+ "'", var3.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var23 + "' != '" + "4:00:00 PM PST"+ "'", var23.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var25 + "' != '" + "4:00:00 PM PST"+ "'", var25.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    java.util.Locale var2 = null;
    org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var2);
    boolean var4 = var3.getTimeZoneOverridesCalendar();
    java.util.Locale var9 = null;
    org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var9);
    java.util.TimeZone var11 = var10.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var11);
    java.util.Locale var17 = null;
    org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var17);
    java.util.Locale var19 = var18.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var19);
    java.util.Locale var21 = var20.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", var21);
    org.apache.commons.lang3.time.FastDateFormat var23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var11, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var24 = var3.formatToCharacterIterator((java.lang.Object)var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.util.TimeZone var2 = var0.getTimeZone();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var4 = var0.parseObject("hi!");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var1 + "' != '" + "M/d/yy h:mm a"+ "'", var1.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
// 
//   }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.util.Calendar var1 = null;
//     java.lang.String var2 = var0.format(var1);
// 
//   }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    java.util.Locale var5 = null;
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
    java.util.TimeZone var7 = var6.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var7);
    java.util.Locale var9 = var8.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, 0, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.util.TimeZone var2 = var0.getTimeZone();
//     int var3 = var0.getMaxLengthEstimate();
//     java.util.Calendar var4 = null;
//     java.lang.String var5 = var0.format(var4);
// 
//   }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var2 = var1.getPattern();
//     java.util.TimeZone var3 = var1.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var6 = var5.getPattern();
//     java.util.TimeZone var7 = var5.getTimeZone();
//     java.util.Locale var11 = null;
//     org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var11);
//     java.util.Locale var13 = var12.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var13);
//     java.util.Locale var15 = var14.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var7, var15);
//     org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var3, var15);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var19 = var17.parseObject("");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "M/d/yy h:mm a"+ "'", var2.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "M/d/yy h:mm a"+ "'", var6.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
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
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
// 
//   }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var4);
//     boolean var6 = var5.getTimeZoneOverridesCalendar();
//     java.lang.String var8 = var5.format(1L);
//     java.lang.String var10 = var5.format(1L);
//     int var11 = var5.getMaxLengthEstimate();
//     java.util.TimeZone var12 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var12);
//     java.util.Locale var17 = null;
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var17);
//     java.util.TimeZone var19 = var18.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var19);
//     java.util.Locale var21 = var20.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 21, var12, var21);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
// 
//   }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     java.util.TimeZone var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var2);
//     boolean var4 = var3.getTimeZoneOverridesCalendar();
//     java.lang.String var6 = var3.format(1L);
//     java.lang.String var8 = var3.format(1L);
//     java.util.Locale var9 = var3.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(100, var9);
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
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "4:00:00 PM PST"+ "'", var6.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
// 
//   }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var4);
//     boolean var6 = var5.getTimeZoneOverridesCalendar();
//     java.lang.String var8 = var5.format(1L);
//     java.lang.String var10 = var5.format(1L);
//     int var11 = var5.getMaxLengthEstimate();
//     java.util.TimeZone var12 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var12);
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z]", var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 18);
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
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     boolean var7 = var2.equals((java.lang.Object)var6);
//     java.util.TimeZone var13 = null;
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var13);
//     boolean var15 = var14.getTimeZoneOverridesCalendar();
//     java.lang.String var17 = var14.format(1L);
//     java.lang.String var19 = var14.format(1L);
//     int var20 = var14.getMaxLengthEstimate();
//     java.util.TimeZone var21 = var14.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var21);
//     org.apache.commons.lang3.time.FastDateFormat var23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var21);
//     org.apache.commons.lang3.time.FastDateFormat var24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var21);
//     org.apache.commons.lang3.time.FastDateFormat var25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var21);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.text.AttributedCharacterIterator var26 = var6.formatToCharacterIterator((java.lang.Object)var21);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "4:00:00 PM PST"+ "'", var5.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var17 + "' != '" + "4:00:00 PM PST"+ "'", var17.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var19 + "' != '" + "4:00:00 PM PST"+ "'", var19.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    java.util.Locale var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a]", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var1);
//     java.util.Date var3 = null;
//     java.lang.String var4 = var2.format(var3);
// 
//   }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     java.util.TimeZone var5 = null;
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var5);
//     boolean var7 = var6.getTimeZoneOverridesCalendar();
//     java.lang.String var9 = var6.format(1L);
//     java.lang.String var11 = var6.format(1L);
//     int var12 = var6.getMaxLengthEstimate();
//     java.util.TimeZone var13 = var6.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var13);
//     java.util.Locale var17 = null;
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var17);
//     java.util.Locale var19 = var18.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var13, var19);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18, var19);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "4:00:00 PM PST"+ "'", var9.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "4:00:00 PM PST"+ "'", var11.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     java.util.Locale var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
//     java.util.Locale var6 = var5.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
//     java.util.Locale var8 = var7.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", var8);
//     java.lang.Object var10 = var9.clone();
//     java.lang.StringBuffer var12 = null;
//     java.lang.StringBuffer var13 = var9.format(0L, var12);
// 
//   }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }
// 
// 
//     java.util.TimeZone var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var2);
//     boolean var4 = var3.getTimeZoneOverridesCalendar();
//     java.lang.String var6 = var3.format((java.lang.Object)(-1L));
//     java.util.TimeZone var7 = var3.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var9 = var8.getPattern();
//     java.lang.String var10 = var8.toString();
//     java.util.Locale var11 = var8.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy]", var7, var11);
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
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "3:59:59 PM PST"+ "'", var6.equals("3:59:59 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "M/d/yy h:mm a"+ "'", var9.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "FastDateFormat[M/d/yy h:mm a]"+ "'", var10.equals("FastDateFormat[M/d/yy h:mm a]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.lang.String var2 = var0.toString();
//     java.util.Locale var3 = var0.getLocale();
//     java.text.ParsePosition var5 = null;
//     java.lang.Object var6 = var0.parseObject("h:mm:ss a z", var5);
// 
//   }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    java.util.Locale var8 = var7.getLocale();
    java.util.TimeZone var9 = var7.getTimeZone();
    java.util.Locale var14 = null;
    org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var14);
    java.util.Locale var16 = var15.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var16);
    java.util.Locale var18 = var17.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), var9, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var2 = var1.getPattern();
//     java.lang.String var3 = var1.toString();
//     java.util.Locale var4 = var1.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, var4);
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
//     assertTrue("'" + var2 + "' != '" + "M/d/yy h:mm a"+ "'", var2.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var3 + "' != '" + "FastDateFormat[M/d/yy h:mm a]"+ "'", var3.equals("FastDateFormat[M/d/yy h:mm a]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
// 
//   }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     java.util.TimeZone var5 = null;
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var5);
//     boolean var7 = var6.getTimeZoneOverridesCalendar();
//     java.lang.String var9 = var6.format(1L);
//     java.lang.String var11 = var6.format(1L);
//     int var12 = var6.getMaxLengthEstimate();
//     java.util.TimeZone var13 = var6.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var13);
//     org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var13);
//     org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var13);
//     org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var13);
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var20 = var18.format(10L);
//     java.lang.String var21 = var18.toString();
//     java.lang.String var22 = var18.getPattern();
//     java.lang.StringBuffer var23 = null;
//     java.text.FieldPosition var24 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.StringBuffer var25 = var17.format((java.lang.Object)var18, var23, var24);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "4:00:00 PM PST"+ "'", var9.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "4:00:00 PM PST"+ "'", var11.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "12/31/69 4:00 PM"+ "'", var20.equals("12/31/69 4:00 PM"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var21 + "' != '" + "FastDateFormat[M/d/yy h:mm a]"+ "'", var21.equals("FastDateFormat[M/d/yy h:mm a]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var22 + "' != '" + "M/d/yy h:mm a"+ "'", var22.equals("M/d/yy h:mm a"));
// 
//   }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     java.util.TimeZone var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var3);
//     boolean var5 = var4.getTimeZoneOverridesCalendar();
//     java.util.TimeZone var6 = var4.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var6);
//     java.util.TimeZone var9 = null;
//     org.apache.commons.lang3.time.FastDateFormat var10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var9);
//     boolean var11 = var10.getTimeZoneOverridesCalendar();
//     java.lang.String var13 = var10.format(1L);
//     boolean var14 = var10.getTimeZoneOverridesCalendar();
//     boolean var15 = var10.getTimeZoneOverridesCalendar();
//     java.lang.String var17 = var10.format((-1L));
//     java.lang.Object var18 = var10.clone();
//     java.util.Locale var19 = var10.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy]", var6, var19);
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
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var13 + "' != '" + "4:00:00 PM PST"+ "'", var13.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var17 + "' != '" + "3:59:59 PM PST"+ "'", var17.equals("3:59:59 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
// 
//   }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var1 = var0.getPattern();
//     java.util.TimeZone var2 = var0.getTimeZone();
//     java.util.Calendar var3 = null;
//     java.lang.String var4 = var0.format(var3);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var5);
    java.util.Locale var7 = var6.getLocale();
    java.util.Locale var11 = null;
    org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var11);
    java.util.TimeZone var13 = var12.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var13);
    java.lang.StringBuffer var15 = null;
    java.text.FieldPosition var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var17 = var6.format((java.lang.Object)"", var15, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(18, 18, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.TimeZone var6 = var5.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    java.util.Locale var8 = var7.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    java.util.Locale var3 = null;
    org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
    java.util.Locale var5 = var4.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.util.Locale var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, 100, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var3 = var2.getPattern();
//     java.util.TimeZone var4 = var2.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
//     java.lang.String var7 = var6.getPattern();
//     java.util.TimeZone var8 = var6.getTimeZone();
//     java.util.Locale var12 = null;
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var12);
//     java.util.Locale var14 = var13.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var14);
//     java.util.Locale var16 = var15.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var8, var16);
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var4, var16);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:00 PM", var4);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var3 + "' != '" + "M/d/yy h:mm a"+ "'", var3.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "M/d/yy h:mm a"+ "'", var7.equals("M/d/yy h:mm a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
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

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.Locale var4 = var3.getLocale();
//     java.lang.String var5 = var3.getPattern();
//     java.text.ParsePosition var7 = null;
//     java.lang.Object var8 = var3.parseObject("M/d/yy h:mm a", var7);
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     java.util.TimeZone var5 = null;
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var5);
//     boolean var7 = var6.getTimeZoneOverridesCalendar();
//     java.lang.String var9 = var6.format(1L);
//     java.lang.String var11 = var6.format(1L);
//     int var12 = var6.getMaxLengthEstimate();
//     java.util.TimeZone var13 = var6.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var13);
//     java.util.Locale var17 = null;
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var17);
//     java.util.Locale var19 = var18.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var13, var19);
//     java.util.Locale var21 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, var13, var21);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "4:00:00 PM PST"+ "'", var9.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "4:00:00 PM PST"+ "'", var11.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     java.lang.String var7 = var2.format(1L);
//     java.util.Calendar var8 = null;
//     java.lang.StringBuffer var9 = null;
//     java.lang.StringBuffer var10 = var2.format(var8, var9);
// 
//   }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    java.util.TimeZone var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, 1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var4);
//     boolean var6 = var5.getTimeZoneOverridesCalendar();
//     java.lang.String var8 = var5.format(1L);
//     java.lang.String var10 = var5.format(1L);
//     int var11 = var5.getMaxLengthEstimate();
//     java.util.TimeZone var12 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var12);
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var12);
//     java.util.TimeZone var16 = null;
//     org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var16);
//     boolean var18 = var17.getTimeZoneOverridesCalendar();
//     java.lang.String var20 = var17.format(1L);
//     java.lang.String var22 = var17.format(1L);
//     java.util.Locale var23 = var17.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, var12, var23);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 18);
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
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var20 + "' != '" + "4:00:00 PM PST"+ "'", var20.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var22 + "' != '" + "4:00:00 PM PST"+ "'", var22.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    java.util.Locale var4 = null;
    org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var4);
    java.util.Locale var6 = var5.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var6);
    java.util.Locale var8 = var7.getLocale();
    java.util.TimeZone var9 = var7.getTimeZone();
    java.util.Locale var15 = null;
    org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var15);
    java.util.TimeZone var17 = var16.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var17);
    java.util.Locale var19 = var18.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var19);
    java.util.Locale var21 = var20.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("3:59:59 PM PST", var9, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     java.util.TimeZone var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var3);
//     boolean var5 = var4.getTimeZoneOverridesCalendar();
//     java.lang.String var7 = var4.format(1L);
//     java.lang.String var9 = var4.format(1L);
//     int var10 = var4.getMaxLengthEstimate();
//     java.util.TimeZone var11 = var4.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var11);
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var11);
//     java.util.Calendar var14 = null;
//     java.lang.StringBuffer var15 = null;
//     java.lang.StringBuffer var16 = var13.format(var14, var15);
// 
//   }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     java.util.TimeZone var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var2);
//     boolean var4 = var3.getTimeZoneOverridesCalendar();
//     java.lang.String var6 = var3.format(1L);
//     java.lang.String var8 = var3.format(1L);
//     int var9 = var3.getMaxLengthEstimate();
//     java.util.TimeZone var10 = var3.getTimeZone();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, var10);
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
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "4:00:00 PM PST"+ "'", var6.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     java.util.TimeZone var4 = null;
//     org.apache.commons.lang3.time.FastDateFormat var5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var4);
//     boolean var6 = var5.getTimeZoneOverridesCalendar();
//     java.lang.String var8 = var5.format(1L);
//     java.lang.String var10 = var5.format(1L);
//     int var11 = var5.getMaxLengthEstimate();
//     java.util.TimeZone var12 = var5.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var12);
//     org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(18, var12);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4:00:00 PM PST"+ "'", var8.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 18);
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
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    java.util.Locale var5 = null;
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
    java.util.TimeZone var7 = var6.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(50, (-1), var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
//     java.util.TimeZone var5 = var4.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var5);
//     java.lang.String var8 = var6.format((-1L));
//     java.util.Calendar var9 = null;
//     java.lang.String var10 = var6.format(var9);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     java.util.TimeZone var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var3);
//     boolean var5 = var4.getTimeZoneOverridesCalendar();
//     java.lang.String var7 = var4.format(1L);
//     java.lang.String var9 = var4.format(1L);
//     int var10 = var4.getMaxLengthEstimate();
//     java.util.TimeZone var11 = var4.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var11);
//     java.util.TimeZone var14 = null;
//     java.util.TimeZone var18 = null;
//     org.apache.commons.lang3.time.FastDateFormat var19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var18);
//     boolean var20 = var19.getTimeZoneOverridesCalendar();
//     java.lang.String var22 = var19.format(1L);
//     java.lang.String var24 = var19.format(1L);
//     int var25 = var19.getMaxLengthEstimate();
//     java.util.TimeZone var26 = var19.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var26);
//     org.apache.commons.lang3.time.FastDateFormat var28 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var26);
//     java.util.Locale var29 = var28.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", var14, var29);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(50, var11, var29);
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
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "4:00:00 PM PST"+ "'", var7.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "4:00:00 PM PST"+ "'", var9.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var22 + "' != '" + "4:00:00 PM PST"+ "'", var22.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var24 + "' != '" + "4:00:00 PM PST"+ "'", var24.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     java.util.TimeZone var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var3);
//     boolean var5 = var4.getTimeZoneOverridesCalendar();
//     java.util.TimeZone var6 = var4.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var6);
//     java.util.TimeZone var11 = null;
//     org.apache.commons.lang3.time.FastDateFormat var12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var11);
//     boolean var13 = var12.getTimeZoneOverridesCalendar();
//     java.lang.String var15 = var12.format(1L);
//     java.lang.String var17 = var12.format(1L);
//     int var18 = var12.getMaxLengthEstimate();
//     java.util.TimeZone var19 = var12.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var19);
//     org.apache.commons.lang3.time.FastDateFormat var21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var19);
//     java.util.Locale var22 = var21.getLocale();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z]", var6, var22);
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
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "4:00:00 PM PST"+ "'", var15.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var17 + "' != '" + "4:00:00 PM PST"+ "'", var17.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
// 
//   }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     java.util.Locale var2 = null;
//     org.apache.commons.lang3.time.FastDateFormat var3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var2);
//     java.util.Locale var4 = var3.getLocale();
//     java.lang.String var5 = var3.getPattern();
//     java.lang.String var6 = var3.toString();
//     java.lang.Object var7 = var3.clone();
//     int var8 = var3.getMaxLengthEstimate();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Object var10 = var3.parseObject("EEEE, MMMM d, yyyy h:mm:ss a z");
//       fail("Expected exception of type java.text.ParseException");
//     } catch (java.text.ParseException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "EEEE, MMMM d, yyyy h:mm:ss a z"+ "'", var5.equals("EEEE, MMMM d, yyyy h:mm:ss a z"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]"+ "'", var6.equals("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 50);
// 
//   }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     java.util.TimeZone var1 = null;
//     org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var1);
//     boolean var3 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var5 = var2.format(1L);
//     boolean var6 = var2.getTimeZoneOverridesCalendar();
//     boolean var7 = var2.getTimeZoneOverridesCalendar();
//     java.lang.String var9 = var2.format((-1L));
//     java.lang.Object var10 = var2.clone();
//     java.lang.StringBuffer var12 = null;
//     java.lang.StringBuffer var13 = var2.format(10L, var12);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     java.util.Locale var3 = null;
//     org.apache.commons.lang3.time.FastDateFormat var4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var3);
//     java.util.Locale var5 = var4.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var5);
//     java.util.Locale var7 = var6.getLocale();
//     java.util.TimeZone var12 = null;
//     org.apache.commons.lang3.time.FastDateFormat var13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var12);
//     boolean var14 = var13.getTimeZoneOverridesCalendar();
//     java.lang.String var16 = var13.format(1L);
//     java.lang.String var18 = var13.format(1L);
//     int var19 = var13.getMaxLengthEstimate();
//     java.util.TimeZone var20 = var13.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var20);
//     java.util.Locale var24 = null;
//     org.apache.commons.lang3.time.FastDateFormat var25 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var24);
//     java.util.Locale var26 = var25.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, var20, var26);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.text.AttributedCharacterIterator var28 = var6.formatToCharacterIterator((java.lang.Object)1);
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
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "4:00:00 PM PST"+ "'", var16.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var18 + "' != '" + "4:00:00 PM PST"+ "'", var18.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 18);
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
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
// 
//   }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }
// 
// 
//     java.util.TimeZone var7 = null;
//     org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var7);
//     boolean var9 = var8.getTimeZoneOverridesCalendar();
//     java.lang.String var11 = var8.format(1L);
//     java.lang.String var13 = var8.format(1L);
//     int var14 = var8.getMaxLengthEstimate();
//     java.util.TimeZone var15 = var8.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var15);
//     org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var15);
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var15);
//     org.apache.commons.lang3.time.FastDateFormat var19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var15);
//     org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, var15);
//     java.util.Locale var25 = null;
//     org.apache.commons.lang3.time.FastDateFormat var26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var25);
//     java.util.Locale var27 = var26.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var28 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var27);
//     org.apache.commons.lang3.time.FastDateFormat var29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, var27);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, var15, var27);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var11 + "' != '" + "4:00:00 PM PST"+ "'", var11.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var13 + "' != '" + "4:00:00 PM PST"+ "'", var13.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
// 
//   }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     java.util.TimeZone var6 = null;
//     org.apache.commons.lang3.time.FastDateFormat var7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var6);
//     boolean var8 = var7.getTimeZoneOverridesCalendar();
//     java.lang.String var10 = var7.format(1L);
//     java.lang.String var12 = var7.format(1L);
//     int var13 = var7.getMaxLengthEstimate();
//     java.util.TimeZone var14 = var7.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var14);
//     org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var14);
//     org.apache.commons.lang3.time.FastDateFormat var17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, var14);
//     org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var14);
//     java.util.Locale var23 = null;
//     org.apache.commons.lang3.time.FastDateFormat var24 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var23);
//     java.util.TimeZone var25 = var24.getTimeZone();
//     org.apache.commons.lang3.time.FastDateFormat var26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var25);
//     java.util.Locale var27 = var26.getLocale();
//     org.apache.commons.lang3.time.FastDateFormat var28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, var27);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.apache.commons.lang3.time.FastDateFormat var29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, var14, var27);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "4:00:00 PM PST"+ "'", var10.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var12 + "' != '" + "4:00:00 PM PST"+ "'", var12.equals("4:00:00 PM PST"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.util.Locale var5 = null;
    org.apache.commons.lang3.time.FastDateFormat var6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var5);
    java.util.TimeZone var7 = var6.getTimeZone();
    org.apache.commons.lang3.time.FastDateFormat var8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var7);
    java.util.Locale var13 = null;
    org.apache.commons.lang3.time.FastDateFormat var14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, var13);
    java.util.Locale var15 = var14.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", var15);
    java.util.Locale var17 = var16.getLocale();
    org.apache.commons.lang3.time.FastDateFormat var18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", var17);
    org.apache.commons.lang3.time.FastDateFormat var19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, var7, var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z]", var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    java.util.Locale var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.lang3.time.FastDateFormat var2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     java.util.Time