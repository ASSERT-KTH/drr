
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)10, (short)0, (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)10);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    byte var2 = org.apache.commons.lang3.math.NumberUtils.toByte("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    double var3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 10.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.strip("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToNull("HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HAAAAAAAAA"+ "'", var1.equals("HAAAAAAAAA"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf("", "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    float var3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), 0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0f));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!ih!ih!...!ih!ih!ih!..."+ "'", var1.equals("!ih!ih!...!ih!ih!ih!..."));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"", (java.lang.CharSequence)"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 200);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    java.lang.CharSequence var0 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly(var0, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "aaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var2.equals("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih!ih!...             ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!ih!ih!...             "+ "'", var1.equals("!ih!ih!...             "));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "44"+ "'", var1.equals("44"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "hi!", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    short var2 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var2.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)(-1), (short)(-1), (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)100);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih!ih!...!ih!ih!ih!...", "44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"I!HI!HI!HI", (java.lang.CharSequence)"!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "I!HI!HI!HI"+ "'", var2.equals("I!HI!HI!HI"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte var1 = org.apache.commons.lang3.math.NumberUtils.min(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    java.lang.CharSequence var0 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone(var0, "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", var1);
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var2.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "hi!", "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4", "haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.strip("!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!ih!ih!...!ih!ih!ih!..."+ "'", var1.equals("!ih!ih!...!ih!ih!ih!..."));

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", var1);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence)"haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    long var2 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    char[] var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"+ "'", var1.equals("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence)"i!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.split("H");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = org.apache.commons.lang3.math.NumberUtils.max(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chomp("HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HAAAAAAAAA"+ "'", var1.equals("HAAAAAAAAA"));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "i!hi!hi!hi"+ "'", var1.equals("i!hi!hi!hi"));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    java.lang.String[] var4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "!ih", 10);
    java.lang.String[] var7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", "iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", var4, var7);
    java.lang.String var10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var4, "!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var8.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "h"+ "'", var10.equals("h"));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("          ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)"!ih", "44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "i!", "H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var3.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence)"H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"hi!", (java.lang.CharSequence)"Hi!!ihHi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "", 100);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    short var1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches("", "aaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    double var3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    short var1 = org.apache.commons.lang3.math.NumberUtils.toShort("haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence)"HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HAAAAAAAAA"+ "'", var1.equals("HAAAAAAAAA"));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence)"4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence)"HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("i!hi!hi!hi", 1, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "i!hi!hi!hi"+ "'", var3.equals("i!hi!hi!hi"));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence)"!ih!ih!...             ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith("", "iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.substringsBetween("I!HI!HI!HI", "i!", "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var3.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.split("44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("!ih!ih!...!ih!ih!ih!...", 7, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trim("HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HAAAAAAAAA"+ "'", var1.equals("HAAAAAAAAA"));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "i!hi!hi!hi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 286);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    int var3 = org.apache.commons.lang3.math.NumberUtils.min(200, (-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    byte var3 = org.apache.commons.lang3.math.NumberUtils.min((byte)1, (byte)0, (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (byte)0);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull("haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "haaaaaaaaa"+ "'", var1.equals("haaaaaaaaa"));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    float var3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, 1.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0f);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence)"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", 286, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"+ "'", var3.equals("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"+ "'", var2.equals("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    java.lang.String[] var4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "!ih!ih!...", 2);
    int var5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!!ihHi!h!ih!ih!...", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    double[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.lang3.math.NumberUtils.max(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!ih!ih!..."+ "'", var1.equals("!ih!ih!..."));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.replace("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", "!ih!ih!...             ", "h", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"+ "'", var4.equals("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"));

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaa", "!ih!ih!...             ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaaaa"+ "'", var2.equals("aaaaaaaaa"));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!!ihHi!h", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h"+ "'", var2.equals("Hi!!ihHi!h"));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaaaaaaaa"+ "'", var3.equals("aaaaaaaaa"));

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    byte var1 = org.apache.commons.lang3.math.NumberUtils.toByte("Haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    double var3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, (-1.0d), 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    byte var2 = org.apache.commons.lang3.math.NumberUtils.toByte("I", (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)1);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("!ih!ih!...", 200, 286);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviate("i!", (-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "i!"+ "'", var3.equals("i!"));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    short var1 = org.apache.commons.lang3.math.NumberUtils.toShort("i!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("", 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    long var2 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", var1);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!", "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", '4');
    int var4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaa", var3);
    int var5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+ "'", var2.equals("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBetween("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    short var2 = org.apache.commons.lang3.math.NumberUtils.toShort("i!hi!hi!hi", (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)(-1));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    long var3 = org.apache.commons.lang3.math.NumberUtils.min(1L, (-1L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    double var2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence)"Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence)"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf("H", 200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"i!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    long var3 = org.apache.commons.lang3.math.NumberUtils.max(10L, 1L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10L);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    java.lang.String[] var1 = null;
    java.lang.String[] var5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "!ih!ih!...", 2);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.replaceEach("", var1, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    long var3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+ "'", var2.equals("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("I", 0, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "I"+ "'", var3.equals("I"));

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "", 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"aaaaaaaaa", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith("", "Hi!!ihHi!h!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    byte var3 = org.apache.commons.lang3.math.NumberUtils.min((byte)100, (byte)0, (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (byte)0);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Haaaaaaaaa");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!...             ", "Haaaaaaaaa", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.strip("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"i!hi!hi!hi", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("I", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "I"+ "'", var2.equals("I"));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny("          ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHH", "i!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.min((short)0, (short)100, (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)0);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("i!hi!hi!hi", "Hi!!ihHi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!!ihHi!h!ih!ih!...", var1);
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    float var3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), 10.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0f));

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)0, (short)(-1), (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)0);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Hi!!ihHi!h", "!ih!ih!...             ", 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("4", "aaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    float var1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    int var3 = org.apache.commons.lang3.math.NumberUtils.max(0, (-1), 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 300);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"i!hi!hi!hi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWith("Hi!!ihHi!h!ih!ih!...", "iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var2.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hhhh..."+ "'", var2.equals("hhhh..."));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.replace("haaaaaaaaa", "", "aaaaaaaaa", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "haaaaaaaaa"+ "'", var4.equals("haaaaaaaaa"));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    float var1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    double var1 = org.apache.commons.lang3.math.NumberUtils.toDouble("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi!!ihHi!h", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h"+ "'", var2.equals("Hi!!ihHi!h"));

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "I!HI!HI!HI", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.replace("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var4.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("I!HI!HI!HI", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!...", 2, "h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!ih!ih!..."+ "'", var3.equals("!ih!ih!..."));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("Haaaaaaaaa", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Haaaaaaaaa"+ "'", var2.equals("Haaaaaaaaa"));

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith("hhhh...", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!!ihHi!h", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!!ihHi!h"+ "'", var3.equals("Hi!!ihHi!h"));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("hi!", 1, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("!ih!ih!...", "I", 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "I"+ "'", var4.equals("I"));

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    byte var1 = org.apache.commons.lang3.math.NumberUtils.toByte("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "Hi!!ihHi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "!ih!ih!...", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence)"I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!hi!hi!hi", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "i!hi!hi!hi"+ "'", var2.equals("i!hi!hi!hi"));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH"+ "'", var1.equals("HHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", "I!HI!HI!HI", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chomp("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var2.equals("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.defaultString("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "H", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var3.equals("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("I!HI!HI!HI", "!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", var1);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence)"Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    double var3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0d), 100.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100.0d);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)10, (short)10, (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)10);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"+ "'", var2.equals("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"));

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    long var3 = org.apache.commons.lang3.math.NumberUtils.max(1L, 1L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100L);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"h", (java.lang.CharSequence)"Hi!!ihHi!h!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "h"+ "'", var2.equals("h"));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("I!HI!HI!HI", "i!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    double var3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("Hi!!ihHi!h", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h"+ "'", var2.equals("Hi!!ihHi!h"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (java.lang.CharSequence)"IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+ "'", var2.equals("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    int var1 = org.apache.commons.lang3.math.NumberUtils.toInt("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Haaaaaaaaa");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"+ "'", var3.equals("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"+ "'", var2.equals("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var1.equals("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh "+ "'", var2.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh "));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaa", 7, "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaaaaaaaa"+ "'", var3.equals("aaaaaaaaa"));

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEnd("hhhh...", "Hi!!ihHi!h!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hhhh..."+ "'", var2.equals("hhhh..."));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    int var2 = org.apache.commons.lang3.math.NumberUtils.toInt("!ih!ih!...!ih!ih!ih!...", 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 23);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ", "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)1, (short)1, (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)10);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HAAAAAAAAA", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!ih!ih!..."+ "'", var1.equals("!ih!ih!..."));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("", 286, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("I!HI!HI!HI", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "I!HI!HI!HI"+ "'", var2.equals("I!HI!HI!HI"));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("I!HI!HI!HI", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "I!HI!HI!HI"+ "'", var2.equals("I!HI!HI!HI"));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    int var2 = org.apache.commons.lang3.math.NumberUtils.toInt("haaaaaaaaa", 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny("I", "I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "I!HI!HI!HI"+ "'", var1.equals("I!HI!HI!HI"));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfter("!ih!ih!...             ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("i!", "iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    float var1 = org.apache.commons.lang3.math.NumberUtils.toFloat("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf("Haaaaaaaaa", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var2.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("I!HI!HI!HI", (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "I"+ "'", var3.equals("I"));

  }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", var1);
// 
//   }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "Hi!!ihHi!h!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches("hhhh...", "h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains("h", 286);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", 300, 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    java.lang.CharSequence var0 = null;
    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    boolean var1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+ "'", var2.equals("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!!ihHi!h!ih!ih!...", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h!ih!ih!..."+ "'", var2.equals("Hi!!ihHi!h!ih!ih!..."));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("Hi!!ihHi!h!ih!ih!...", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!!ihHi!h!ih!ih!..."+ "'", var3.equals("Hi!!ihHi!h!ih!ih!..."));

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Hi!!ihHi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh "+ "'", var2.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh "));

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.upperCase("h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "H"+ "'", var1.equals("H"));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!IH"+ "'", var1.equals("!IH"));

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "44"+ "'", var1.equals("44"));

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("!IH", "Hi!!ihHi!h!ih!ih!...", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!IH"+ "'", var3.equals("!IH"));

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"Haaaaaaaaa", "!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    java.lang.String[] var4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", '4');
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var4);
    java.lang.String[] var8 = org.apache.commons.lang3.StringUtils.split("i!", "Haaaaaaaaa");
    java.lang.String var9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", var4, var8);
    boolean var10 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "h"+ "'", var5.equals("h"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWith("", "Hi!!ihHi!h!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    byte var2 = org.apache.commons.lang3.math.NumberUtils.toByte("Haaaaaaaaa", (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)10);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    java.lang.String[] var5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "haaaaaaaaa", 0);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var5);
    java.lang.String[] var7 = null;
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.replaceEach("", var5, var7);
    int var9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hhhh...", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var6.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 7, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var3.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("I", var1);
// 
//   }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.min((short)1, (short)10, (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)1);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("", 100, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!"+ "'", var3.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!!ihHi!h!ih!ih!...", "h", "44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!!i4Hi!4!i4!i4!..."+ "'", var3.equals("Hi!!i4Hi!4!i4!i4!..."));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    java.lang.CharSequence var0 = null;
    boolean var1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    byte var1 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhh...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("", 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "                                                                                                                                                                                                        "+ "'", var2.equals("                                                                                                                                                                                                        "));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence)"i!hi!hi!hi", (java.lang.CharSequence)"h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaa", 300, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "###################################################################################################################################################################################################################################################################################################aaaaaaaaa"+ "'", var3.equals("###################################################################################################################################################################################################################################################################################################aaaaaaaaa"));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "hhhh...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+ "'", var2.equals("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfter("i!hi!hi!hi", "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 300);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("Haaaaaaaaa", 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "                                                                                               Haaaaaaaaa                                                                                               "+ "'", var2.equals("                                                                                               Haaaaaaaaa                                                                                               "));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.strip("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 4, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var3.equals("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.strip("44", "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "44"+ "'", var2.equals("44"));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToNull("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", var1);
// 
//   }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    int var3 = org.apache.commons.lang3.math.NumberUtils.min(2, 23, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    java.lang.CharSequence var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence)"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!", (-1), 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    double[] var0 = new double[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.lang3.math.NumberUtils.min(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    short var1 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    boolean var1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("", "Hi!!i4Hi!4!i4!i4!...", "i!hi!hi!hi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    java.lang.CharSequence var0 = null;
    java.lang.String var1 = org.apache.commons.lang3.StringUtils.uncapitalize(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                        ", "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "                                                                                                                                                                                                        "+ "'", var2.equals("                                                                                                                                                                                                        "));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence)"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("Haaaaaaaaa", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH!iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Haaaaaaaaa"+ "'", var2.equals("Haaaaaaaaa"));

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "###################################################################################################################################################################################################################################################################################################aaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HAAAAAAAAA", "I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var1.equals("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("4", "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToEmpty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("!ih!ih!...!ih!ih!ih!...", 7, "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!ih!ih!...!ih!ih!ih!..."+ "'", var3.equals("!ih!ih!...!ih!ih!ih!..."));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains("44", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat("!ih!ih!...!ih!ih!ih!...", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!..."+ "'", var2.equals("!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!..."));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"haaaaaaaaa", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence)"!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var1.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var1.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"                                                                                                                                                                                                        ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    boolean var1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ", "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44", '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "H", "haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var3.equals("haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("I", "!ih", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "I!HI!HI!HI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test309() {}
//   public void test309() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("i!hi!hi!hi", var1);
// 
//   }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    java.lang.CharSequence var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"H", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!..."+ "'", var2.equals("!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!..."));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chop("HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHH"+ "'", var1.equals("HHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence)"Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("4", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH!iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("Hi!!ihHi!h!ih!ih!...", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h!ih!ih!..."+ "'", var2.equals("Hi!!ihHi!h!ih!ih!..."));

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("4", "                                                                                               Haaaaaaaaa                                                                                               ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i!hi!hi!hi", "Hi!!ihHi!h", 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.chomp("", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("i!hi!hi!hi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "i!hi!hi!hi"+ "'", var1.equals("i!hi!hi!hi"));

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+ "'", var2.equals("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 300, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var3.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence)"H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h"+ "'", var1.equals("h"));

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", "4");
    int var4 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!...", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!..."+ "'", var2.equals("!ih!ih!..."));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trim("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.strip("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var2.equals("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Float var1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HAAAAAAAAA");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence)"HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("haaaaaaaaa", 200, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.min((short)10, (short)0, (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)0);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    long var1 = org.apache.commons.lang3.math.NumberUtils.toLong("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!!ihHi!h", "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    double var1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "H!"+ "'", var2.equals("H!"));

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!ih!ih!...!ih!ih!ih!...", "", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 23);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("Hi!!ihHi!h!ih!ih!...", 200, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 4, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    int var3 = org.apache.commons.lang3.math.NumberUtils.max(0, 2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!!ihHi!h", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h"+ "'", var2.equals("Hi!!ihHi!h"));

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"###################################################################################################################################################################################################################################################################################################aaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    java.math.BigInteger var1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence)"!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.strip("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", "###################################################################################################################################################################################################################################################################################################aaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"+ "'", var2.equals("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih"));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    char[] var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"H!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("", 100, "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!..."+ "'", var3.equals("!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!..."));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4", "h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                               Haaaaaaaaa                                                                                               ", 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var4.equals("                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf("HAAAAAAAAA", "haaaaaaaaa", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("hhhh...", 2, "H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hhhh..."+ "'", var3.equals("hhhh..."));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches("Hi!!i4Hi!4!i4!i4!...", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaa", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", (java.lang.CharSequence)"haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"+ "'", var2.equals("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"Haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var3.equals("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    float var3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, 100.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100.0f);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.leftPad("4", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 286, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var3.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    java.util.Iterator var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    long var2 = org.apache.commons.lang3.math.NumberUtils.toLong("44", 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 44L);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("", 0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.leftPad("H", 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "                      H"+ "'", var2.equals("                      H"));

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("!ih!ih!...!ih!ih!ih!...", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!..."+ "'", var3.equals("!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!..."));

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...", 200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    double var1 = org.apache.commons.lang3.math.NumberUtils.toDouble("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 4, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..."+ "'", var3.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..."));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("HHHHHHHHHHHHHHHHHHHHHH", "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!..."+ "'", var2.equals("!ih!ih!..."));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    java.lang.CharSequence var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(var0, (java.lang.CharSequence)"haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...!ih!ih!...!ih!ih!ih!...", (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"+ "'", var2.equals("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi"));

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    long var3 = org.apache.commons.lang3.math.NumberUtils.max(1L, 0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1L);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trim("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("I!HI!HI!HI", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                      H", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                        ", "HHHHHHHHHHHHHHHHHHHHHH", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence)"Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("Haaaaaaaaa", var1);
// 
//   }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var1.equals("Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4", "hhhh...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.upperCase("!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!IH"+ "'", var1.equals("!IH"));

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("H!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "H!"+ "'", var2.equals("H!"));

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence)"i!hi!hi!hi", (java.lang.CharSequence)"IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var2.equals("!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("h", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...", 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    double var1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    boolean var1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!ih!ih!...             ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var3.equals("                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    long var2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!..."+ "'", var2.equals("!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!..."));

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ", 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaa", "I");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    double var2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    boolean var1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                               Haaaaaaaaa                                                                                               ", "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("!ih!ih!...", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!..."+ "'", var2.equals("!ih!ih!..."));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var1 = org.apache.commons.lang3.math.NumberUtils.createNumber("H!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "                      H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"+ "'", var2.equals("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"));

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)100, (short)(-1), (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)100);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence)"HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence)"!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"+ "'", var1.equals("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH"));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    boolean var1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"          ", "Haaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    double var2 = org.apache.commons.lang3.math.NumberUtils.toDouble("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                      H");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 2, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var3.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HAAAAAAAAA", "h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviate("", 2, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence)"IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    short var1 = org.apache.commons.lang3.math.NumberUtils.toShort("!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi!!ihHi!h", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!!ihHi!h"+ "'", var2.equals("Hi!!ihHi!h"));

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    java.lang.CharSequence var1 = null;
    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH"+ "'", var2.equals("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH"));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    byte var1 = org.apache.commons.lang3.math.NumberUtils.toByte("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.left("HHHHHHHHHHHHHHHHHHHHHH", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "HH"+ "'", var2.equals("HH"));

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "i!", 0);
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var4.equals("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                        ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    int var1 = org.apache.commons.lang3.math.NumberUtils.toInt("HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"                                                                                                                                                                                                        ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chop("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH!iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH!iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var1.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH!iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("          ", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          "+ "'", var2.equals("          "));

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("Hi!!ihHi!h!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!!ihHi!h!ih!ih!..."+ "'", var1.equals("Hi!!ihHi!h!ih!ih!..."));

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "H!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var2.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    java.lang.String[] var0 = null;
    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.stripAll(var0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.strip("!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH!iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("Hi!!i4Hi!4!i4!i4!...", "haaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                               Haaaaaaaaa                                                                                               ", "!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    double var2 = org.apache.commons.lang3.math.NumberUtils.toDouble("i!", 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!ih!ih!...             ", 200);
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var3, '#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var3, "", 2, 300);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var5.equals("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var2.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"I", "!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfter("iIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIHiIH", "!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.replace("h", "haaaaaaaaa", "!IH", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "h"+ "'", var4.equals("h"));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "Haaaaaaaaa", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence)"!ih!ih!...             ", (java.lang.CharSequence)"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    long var1 = org.apache.commons.lang3.math.NumberUtils.toLong("                      H");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    java.lang.CharSequence var0 = null;
    boolean var1 = org.apache.commons.lang3.StringUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"+ "'", var1.equals("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"));

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44", 200, 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var3.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"HH", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"HHHHHHHHHHHHHHHHHHHHHHH", "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                      H", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 286);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"+ "'", var4.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (java.lang.CharSequence)"HAAAAAAAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"+ "'", var2.equals("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"));

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!!i4Hi!4!i4!i4!...", "", "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!!i4Hi!4!i4!i4!..."+ "'", var3.equals("Hi!!i4Hi!4!i4!i4!..."));

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.upperCase("!IH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "!IH"+ "'", var1.equals("!IH"));

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", 0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("Hi!!ihHi!h", 10, "Hi!!ihHi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Hi!!ihHi!h"+ "'", var3.equals("Hi!!ihHi!h"));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"+ "'", var2.equals("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith("", "HHHHHHHHHHHHHHHHHHHHHHH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaa", "", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaaaaaaaa"+ "'", var3.equals("aaaaaaaaa"));

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    short var2 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi!!ihHi!h", (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)10);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!IH", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "!IH"+ "'", var3.equals("!IH"));

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


    int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence)"!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 200);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Haaaaaaaaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Haaaaaaaaa"+ "'", var2.equals("Haaaaaaaaa"));

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }


    float var3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 1.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0f));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "!ih!ih!...!ih!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "!ih!ih!...!ih!ih!ih!..."+ "'", var2.equals("!ih!ih!...!ih!ih!ih!..."));

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("IihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIihIih", "!ih!ih!...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }


    long var3 = org.apache.commons.lang3.math.NumberUtils.max(100L, 0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100L);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    float var2 = org.apache.commons.lang3.math.NumberUtils.toFloat("          ", 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var1.equals("                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = org.apache.commons.lang3.math.NumberUtils.createInteger("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    long var2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    short var3 = org.apache.commons.lang3.math.NumberUtils.max((short)0, (short)1, (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)100);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence)"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..."+ "'", var1.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..."));

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"                                                                                               Haaaaaaaaa                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chop("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    byte var3 = org.apache.commons.lang3.math.NumberUtils.min((byte)(-1), (byte)10, (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (byte)(-1));

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("          ", "HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


    java.lang.Object[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'", var3.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    java.lang.String[] var4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", '4');
    int var5 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", var4);
    java.lang.String[] var8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", '4');
    java.lang.String var12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var8, "h", 0, 1);
    java.lang.String[] var14 = org.apache.commons.lang3.StringUtils.stripAll(var8, "!ih!ih!...");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", var4, var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HH");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "HH"+ "'", var1.equals("HH"));

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence)"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"+ "'", var1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h"));

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("h", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIiHIi", "i!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

}
