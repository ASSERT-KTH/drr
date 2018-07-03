
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence)"hi!", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.chomp("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence)"", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"hi!", (java.lang.CharSequence)"hi!", (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object var0 = null;
    int[] var3 = new int[] { 10, 1};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    int[] var5 = null;
    int[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var5);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEquals(var0, (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          "+ "'", var2.equals("          "));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    float[] var0 = null;
    org.apache.commons.lang3.ArrayUtils.reverse(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var7 = org.apache.commons.lang3.ArrayUtils.add(var1, (-1), 1.0f);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.CharSequence var0 = null;
    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf(var0, (java.lang.CharSequence)"          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("", var1);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          "+ "'", var2.equals("          "));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)"          ", (java.lang.CharSequence)"          ", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("hi!", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long[] var0 = null;
    java.lang.Long[] var1 = org.apache.commons.lang3.ArrayUtils.toObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.substringsBetween("          ", "          ", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.CharSequence var0 = null;
    java.lang.CharSequence var1 = null;
    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf(var0, var1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Iterator var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"hi!", (java.lang.CharSequence)"          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[])var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chop("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "         "+ "'", var1.equals("         "));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    char[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("hi!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("hi!", "", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "          h          i          !          "+ "'", var3.equals("          h          i          !          "));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    byte[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence)"          ", (java.lang.CharSequence)"          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("10 1", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "101"+ "'", var2.equals("101"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    long[] var1 = new long[] { 0L};
    int[] var4 = new int[] { 10, 1};
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isEmpty(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var6 = org.apache.commons.lang3.ArrayUtils.removeAll(var1, var4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull("          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h          i          !"+ "'", var1.equals("h          i          !"));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "         "+ "'", var1.equals("         "));

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!", '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeJava("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10 1", "h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 1"+ "'", var2.equals("10 1"));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("hi!", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"101", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double[] var0 = null;
    int[] var3 = new int[] { 10, 1};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    int[] var5 = null;
    int[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var5);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var8 = org.apache.commons.lang3.ArrayUtils.removeAll(var0, var3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    double[] var0 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, 10.0d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    org.apache.commons.lang3.StringEscapeUtils var0 = new org.apache.commons.lang3.StringEscapeUtils();

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    short[] var3 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var4 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    boolean var6 = org.apache.commons.lang3.ArrayUtils.contains(var3, (short)10);
    int[] var9 = new int[] { 10, 1};
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isEmpty(var9);
    int[] var11 = null;
    int[] var12 = org.apache.commons.lang3.ArrayUtils.removeElements(var9, var11);
    java.lang.Integer[] var13 = org.apache.commons.lang3.ArrayUtils.toObject(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var14 = org.apache.commons.lang3.ArrayUtils.removeAll(var3, var9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("h          i          !", 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    java.lang.Object[] var0 = null;
    java.lang.String var1 = org.apache.commons.lang3.StringUtils.join(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("          h          i          !          ", "         ", "101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "101 h101 i101 !101 "+ "'", var3.equals("101 h101 i101 !101 "));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("101 h101 i101 !101 ", "10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "101 h101 i101 !101 "+ "'", var2.equals("101 h101 i101 !101 "));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)" ", "101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"", (java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var6, 'a', 0, 0);
    int[] var14 = new int[] { 10, 1};
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isEmpty(var14);
    int[] var16 = null;
    int[] var17 = org.apache.commons.lang3.ArrayUtils.removeElements(var14, var16);
    java.lang.Integer[] var18 = org.apache.commons.lang3.ArrayUtils.toObject(var14);
    int[] var20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var18, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var21 = org.apache.commons.lang3.ArrayUtils.removeAll(var6, var20);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("hi!", "         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"          ", 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    java.lang.CharSequence var0 = null;
    boolean var1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    int[] var0 = null;
    org.apache.commons.lang3.ArrayUtils.reverse(var0);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)" #a", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("10 1", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 1"+ "'", var2.equals("10 1"));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("101 h101 i101 !101 ", "h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "h          i          !"+ "'", var2.equals("h          i          !"));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    short[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var9 = new int[] { 10, 1};
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isEmpty(var9);
    int[] var11 = null;
    int[] var12 = org.apache.commons.lang3.ArrayUtils.removeElements(var9, var11);
    int[] var15 = new int[] { 10, 1};
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isEmpty(var15);
    int[] var17 = null;
    int[] var18 = org.apache.commons.lang3.ArrayUtils.removeElements(var15, var17);
    java.lang.Integer[] var19 = org.apache.commons.lang3.ArrayUtils.toObject(var15);
    int[] var21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var19, 1);
    int[] var22 = org.apache.commons.lang3.ArrayUtils.removeElements(var11, var21);
    int var23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var6, (java.lang.Object)var11);
    java.lang.String var24 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "{}"+ "'", var24.equals("{}"));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.Integer[] var9 = new java.lang.Integer[] { (-1)};
    int[] var10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var9);
    int[] var13 = new int[] { 10, 1};
    boolean var14 = org.apache.commons.lang3.ArrayUtils.isEmpty(var13);
    int[] var15 = null;
    int[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements(var13, var15);
    java.lang.Integer[] var17 = org.apache.commons.lang3.ArrayUtils.toObject(var13);
    java.lang.String var19 = org.apache.commons.lang3.StringUtils.join(var13, ' ');
    int[] var20 = org.apache.commons.lang3.ArrayUtils.addAll(var10, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var21 = org.apache.commons.lang3.ArrayUtils.removeAll(var2, var13);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 1"+ "'", var19.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    java.lang.Object[] var1 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Object[])var0);
    java.lang.String var2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"+ "'", var2.equals("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"));

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    char[] var5 = new char[] { 'a', ' ', 'a'};
    char[] var7 = org.apache.commons.lang3.ArrayUtils.remove(var5, 0);
    int var8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var7);
    int var9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)" #a", var7);
    int[] var12 = new int[] { 10, 1};
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isEmpty(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var14 = org.apache.commons.lang3.ArrayUtils.removeAll(var7, var12);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var11 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var6, 100, (java.lang.Object)' ');
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    float[] var6 = new float[] { 10.0f};
    float[] var9 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var9, '#', 1, (-1));
    float[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var9);
    java.lang.String var18 = org.apache.commons.lang3.StringUtils.join(var1, ' ', 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    char[] var1 = new char[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var3 = org.apache.commons.lang3.ArrayUtils.remove(var1, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"101", (java.lang.CharSequence)"{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("          ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          "+ "'", var2.equals("          "));

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    short[] var3 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var4 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    boolean var6 = org.apache.commons.lang3.ArrayUtils.contains(var3, (short)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var9 = org.apache.commons.lang3.ArrayUtils.add(var3, 10, (short)0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
    long[] var4 = new long[] { (-1L), 0L};
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var4);
    long[] var8 = org.apache.commons.lang3.ArrayUtils.subarray(var4, 100, 1);
    java.lang.Object[] var9 = new java.lang.Object[] { var4};
    short[] var13 = new short[] { (short)10, (short)(-1), (short)(-1)};
    short[] var14 = org.apache.commons.lang3.ArrayUtils.clone(var13);
    int var15 = org.apache.commons.lang3.ArrayUtils.indexOf(var9, (java.lang.Object)var13);
    short[] var18 = org.apache.commons.lang3.ArrayUtils.add(var13, 0, (short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var19 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var0, (-1), (java.lang.Object)var13);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    java.lang.Integer[] var2 = new java.lang.Integer[] { (-1)};
    int[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var2);
    int[] var6 = new int[] { 10, 1};
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var6);
    int[] var8 = null;
    int[] var9 = org.apache.commons.lang3.ArrayUtils.removeElements(var6, var8);
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isSameLength(var3, var9);
    int[] var12 = org.apache.commons.lang3.ArrayUtils.remove(var9, 0);
    int[] var14 = org.apache.commons.lang3.ArrayUtils.add(var12, 100);
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object)"{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.Integer[] var9 = new java.lang.Integer[] { (-1)};
    int[] var10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var9);
    int[] var13 = new int[] { 10, 1};
    boolean var14 = org.apache.commons.lang3.ArrayUtils.isEmpty(var13);
    int[] var15 = null;
    int[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements(var13, var15);
    boolean var17 = org.apache.commons.lang3.ArrayUtils.isSameLength(var10, var16);
    int var19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var7, (java.lang.Object)var17, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("         ", 'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "         "+ "'", var3.equals("         "));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    char[] var5 = org.apache.commons.lang3.ArrayUtils.remove(var3, 0);
    int var8 = org.apache.commons.lang3.ArrayUtils.indexOf(var5, 'a', 1);
    boolean var9 = org.apache.commons.lang3.ArrayUtils.isEmpty(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    long[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "          h          i          !          "+ "'", var1.equals("          h          i          !          "));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    java.lang.Object[] var0 = null;
    double[] var4 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var4);
    double[] var8 = org.apache.commons.lang3.ArrayUtils.add(var4, 0, 0.0d);
    boolean var10 = org.apache.commons.lang3.ArrayUtils.contains(var4, 100.0d);
    int var11 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    char[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var7 = org.apache.commons.lang3.StringUtils.join(var3, ' ', 1, 0);
    byte[] var10 = new byte[] { (byte)100, (byte)1};
    byte[] var11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var10);
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isSameLength(var3, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = org.apache.commons.lang3.StringUtils.toString(var3, "true");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    short[] var0 = null;
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join(var0, '#', 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var6, 'a', 0, 0);
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    byte[] var2 = new byte[] { (byte)100, (byte)1};
    byte[] var3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var2);
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.join(var2, 'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var7 = org.apache.commons.lang3.ArrayUtils.remove(var2, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100a1"+ "'", var5.equals("100a1"));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    java.lang.String[] var1 = new java.lang.String[] { "         "};
    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.stripAll(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var4 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.Object[])var2, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence)"101 h101 i101 !101 ", (java.lang.CharSequence)"{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeCsv("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("10 1", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)"101 h101 i101 !101 ", (java.lang.CharSequence)"101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    double[] var0 = null;
    boolean var3 = org.apache.commons.lang3.ArrayUtils.contains(var0, (-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = org.apache.commons.lang3.StringUtils.join(var3, '#', 10, 15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var5 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var8 = org.apache.commons.lang3.ArrayUtils.add(var3, (-1), (-1.0d));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.split(" ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)"101 h101 i101 !101 ", (java.lang.CharSequence)"          h          i          !          ", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence)"true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"", (java.lang.CharSequence)"hi!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "True"+ "'", var1.equals("True"));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence)"{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    double[] var8 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    double[] var12 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var12);
    double[] var15 = org.apache.commons.lang3.ArrayUtils.add(var12, 0.0d);
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isSameLength(var8, var15);
    java.lang.Integer[] var18 = new java.lang.Integer[] { (-1)};
    int[] var19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var18);
    int[] var22 = new int[] { 10, 1};
    boolean var23 = org.apache.commons.lang3.ArrayUtils.isEmpty(var22);
    int[] var24 = null;
    int[] var25 = org.apache.commons.lang3.ArrayUtils.removeElements(var22, var24);
    boolean var26 = org.apache.commons.lang3.ArrayUtils.isSameLength(var19, var25);
    int[] var28 = org.apache.commons.lang3.ArrayUtils.remove(var25, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var29 = org.apache.commons.lang3.ArrayUtils.removeAll(var15, var25);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring(" #a", (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a"+ "'", var3.equals("a"));

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase(" #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " #A"+ "'", var1.equals(" #A"));

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var1, 15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase(" #A", var1);
// 
//   }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    char[] var8 = null;
    boolean var9 = org.apache.commons.lang3.ArrayUtils.isSameLength(var6, var8);
    org.apache.commons.lang3.ArrayUtils.reverse(var6);
    java.lang.Character[] var11 = org.apache.commons.lang3.ArrayUtils.toObject(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var14 = org.apache.commons.lang3.ArrayUtils.add(var6, 100, '4');
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.apache.commons.lang3.ArrayUtils var0 = new org.apache.commons.lang3.ArrayUtils();

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var3 = new int[] { 10, 1};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    int[] var5 = null;
    int[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var5);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var3);
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var7, 1);
    java.lang.Object[] var10 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var0, (java.lang.Object[])var7);
    double[] var14 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var14);
    double[] var17 = org.apache.commons.lang3.ArrayUtils.add(var14, 0.0d);
    int var20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var17, 10.0d, (-1.0d));
    boolean var21 = org.apache.commons.lang3.ArrayUtils.contains(var10, (java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"True", (java.lang.CharSequence)"True", (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern("True", "101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "True"+ "'", var2.equals("True"));

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     org.apache.commons.lang3.text.translate.UnicodeUnescaper var0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
//     org.apache.commons.lang3.text.translate.CharSequenceTranslator[] var1 = null;
//     org.apache.commons.lang3.text.translate.CharSequenceTranslator var2 = var0.with(var1);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.add(var3, 1, 100.0d);
    java.lang.String var11 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "1"+ "'", var11.equals("1"));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("101 h101 i101 !101 ", " #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
    int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int[] var5 = new int[] { 10, 1};
    boolean var6 = org.apache.commons.lang3.ArrayUtils.isEmpty(var5);
    int[] var7 = null;
    int[] var8 = org.apache.commons.lang3.ArrayUtils.removeElements(var5, var7);
    java.lang.Integer[] var9 = org.apache.commons.lang3.ArrayUtils.toObject(var5);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var5, ' ');
    int[] var12 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var5);
    int[] var13 = org.apache.commons.lang3.ArrayUtils.clone(var5);
    int var15 = org.apache.commons.lang3.ArrayUtils.indexOf(var13, 100);
    int[] var16 = org.apache.commons.lang3.ArrayUtils.clone(var13);
    java.lang.Integer[] var18 = new java.lang.Integer[] { (-1)};
    int[] var19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var18);
    int[] var22 = new int[] { 10, 1};
    boolean var23 = org.apache.commons.lang3.ArrayUtils.isEmpty(var22);
    int[] var24 = null;
    int[] var25 = org.apache.commons.lang3.ArrayUtils.removeElements(var22, var24);
    java.lang.Integer[] var26 = org.apache.commons.lang3.ArrayUtils.toObject(var22);
    java.lang.String var28 = org.apache.commons.lang3.StringUtils.join(var22, ' ');
    int[] var29 = org.apache.commons.lang3.ArrayUtils.addAll(var19, var22);
    int[] var30 = org.apache.commons.lang3.ArrayUtils.clone(var22);
    int var32 = org.apache.commons.lang3.ArrayUtils.indexOf(var30, 100);
    int[] var33 = org.apache.commons.lang3.ArrayUtils.clone(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var34 = org.apache.commons.lang3.ArrayUtils.removeAll(var13, var33);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 1"+ "'", var11.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "10 1"+ "'", var28.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    java.lang.CharSequence var0 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOf(var0, (java.lang.CharSequence)" #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "          "+ "'", var1.equals("          "));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    java.lang.CharSequence var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"10 1", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 0.0d};
    java.lang.Double[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var1, "101", 0, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    int var9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var6, 10.0d, (-1.0d));
    int var12 = org.apache.commons.lang3.ArrayUtils.indexOf(var6, (-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    long[] var0 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 0L, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    double[] var0 = null;
    double[] var1 = null;
    double[] var2 = org.apache.commons.lang3.ArrayUtils.addAll(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    char[] var0 = null;
    char[] var2 = org.apache.commons.lang3.ArrayUtils.removeElement(var0, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("100a1", "10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ".0"+ "'", var2.equals(".0"));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence)" ", (java.lang.CharSequence)"{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", 2, ".0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"+ "'", var3.equals("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    java.lang.String[] var4 = new java.lang.String[] { "          "};
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var2, var4);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var2);
    java.lang.Object[] var7 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[])var2);
    java.lang.String[] var8 = org.apache.commons.lang3.StringUtils.stripAll(var2);
    java.lang.Short[] var10 = new java.lang.Short[] { (short)1};
    java.lang.Short[] var11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var10);
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[])var8, (java.lang.Object[])var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var13 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[])var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          "+ "'", var5.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean[] var7 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 0, 0);
    boolean[] var11 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var11);
    boolean[] var15 = org.apache.commons.lang3.ArrayUtils.subarray(var11, 0, 0);
    boolean[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements(var7, var15);
    int[] var19 = new int[] { 10, 1};
    boolean var20 = org.apache.commons.lang3.ArrayUtils.isEmpty(var19);
    int[] var21 = null;
    int[] var22 = org.apache.commons.lang3.ArrayUtils.removeElements(var19, var21);
    java.lang.Integer[] var23 = org.apache.commons.lang3.ArrayUtils.toObject(var19);
    java.lang.String var25 = org.apache.commons.lang3.StringUtils.join(var19, ' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var26 = org.apache.commons.lang3.ArrayUtils.removeAll(var15, var19);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 1"+ "'", var25.equals("10 1"));

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern("          h          i          !          ", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    int[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = org.apache.commons.lang3.ArrayUtils.remove(var0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    char[] var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)".0", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    java.lang.Object[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    java.lang.String[] var4 = new java.lang.String[] { "          "};
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var2, var4);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var2);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var2, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          "+ "'", var5.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    char[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    byte[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var2 = org.apache.commons.lang3.ArrayUtils.remove(var0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"          h          i          !          ", (java.lang.CharSequence)"True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          h          i          !          "+ "'", var2.equals("          h          i          !          "));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("True", '4', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "True"+ "'", var3.equals("True"));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    char[] var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("", "          h          i          !          ", 2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "          h          i          !          "+ "'", var4.equals("          h          i          !          "));

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviate("101 h101 i101 !101 ", 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)"          h          i          !          ", (java.lang.CharSequence)"{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    short[] var0 = null;
    short[] var2 = org.apache.commons.lang3.ArrayUtils.removeElement(var0, (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("1", 15, "10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "110 110 110 110"+ "'", var3.equals("110 110 110 110"));

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.lang.Byte[] var1 = new java.lang.Byte[] { (byte)1};
    java.lang.Byte[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    float[] var4 = new float[] { 10.0f};
    float[] var7 = org.apache.commons.lang3.ArrayUtils.subarray(var4, 0, 100);
    float[] var9 = new float[] { 10.0f};
    float[] var12 = org.apache.commons.lang3.ArrayUtils.subarray(var9, 0, 100);
    java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var12, '#', 1, (-1));
    float[] var17 = org.apache.commons.lang3.ArrayUtils.removeElements(var4, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var18 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var1, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("", "{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.split(" ", "", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h          i          !", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "! i h"+ "'", var2.equals("! i h"));

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }
// 
// 
//     org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION var0 = null;
//     org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] var1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { var0};
//     org.apache.commons.lang3.text.translate.NumericEntityUnescaper var2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(var1);
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"100a1", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat('a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"-1a10", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    char[] var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)"          ", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)" #A", (java.lang.CharSequence)"110 110 110 110");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "A"+ "'", var1.equals("A"));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)".0", (java.lang.CharSequence)"          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence)"A", (java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.strip("", "a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    char[] var6 = new char[] { 'a', ' ', 'a'};
    char[] var8 = org.apache.commons.lang3.ArrayUtils.remove(var6, 0);
    int var9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var8);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var8, 'a', 0, 0);
    boolean var14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"101 h101 i101 !101 ", var8);
    int var15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"101", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("101", "-1a10", "! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " h "+ "'", var3.equals(" h "));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6, 1);
    java.lang.Object[] var9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var12 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var6, 10, (java.lang.Object)10.0f);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     org.apache.commons.lang3.text.translate.UnicodeEscaper var2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
//     java.io.Writer var4 = null;
//     boolean var5 = var2.translate(15, var4);
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("", "100a1", 15, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100a1"+ "'", var4.equals("100a1"));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "         "+ "'", var1.equals("         "));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)"100a1", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeXml("! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "! i h"+ "'", var1.equals("! i h"));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("         ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "         "+ "'", var2.equals("         "));

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    java.lang.Float[] var1 = new java.lang.Float[] { 0.0f};
    java.lang.Float[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    java.lang.Object[] var3 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[])var1);
    float[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    java.lang.Integer[] var6 = new java.lang.Integer[] { (-1)};
    int[] var7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6);
    int[] var10 = new int[] { 10, 1};
    boolean var11 = org.apache.commons.lang3.ArrayUtils.isEmpty(var10);
    int[] var12 = null;
    int[] var13 = org.apache.commons.lang3.ArrayUtils.removeElements(var10, var12);
    java.lang.Integer[] var14 = org.apache.commons.lang3.ArrayUtils.toObject(var10);
    java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var10, ' ');
    int[] var17 = org.apache.commons.lang3.ArrayUtils.addAll(var7, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var18 = org.apache.commons.lang3.ArrayUtils.removeAll(var4, var17);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10 1"+ "'", var16.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, " h ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"! i h", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"a", (java.lang.CharSequence)"1", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center(" #A", 0, " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " #A"+ "'", var3.equals(" #A"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)"h          i          !", (java.lang.CharSequence)"1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("True", "1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "True"+ "'", var2.equals("True"));

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    int[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.upperCase("101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101"+ "'", var1.equals("101"));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)".0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("A", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.split("10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviate(".0", 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ".0"+ "'", var3.equals(".0"));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    long[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "         "+ "'", var1.equals("         "));

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"a", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("true", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "true"+ "'", var2.equals("true"));

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "True"+ "'", var1.equals("True"));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    java.util.Iterator var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence)"110 110 110 110", (java.lang.CharSequence)"-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          h          i          !          ", "{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.chomp(" #a", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #a"+ "'", var2.equals(" #a"));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#A"+ "'", var1.equals("#A"));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    org.apache.commons.lang3.text.translate.UnicodeUnescaper var0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    java.io.Writer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.translate((java.lang.CharSequence)"100a1", 10, var3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"+ "'", var1.equals("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("", "1", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("A", "101", "h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "A"+ "'", var3.equals("A"));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int var9 = org.apache.commons.lang3.ArrayUtils.indexOf(var2, 15, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence)"1", (java.lang.CharSequence)"true", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfter(".0", " #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    java.lang.Character[] var0 = null;
    char[] var1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    byte[] var0 = null;
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join(var0, '#', 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("10 1", 0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "10"+ "'", var3.equals("10"));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence)"true", (java.lang.CharSequence)" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence)"{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    float[] var6 = new float[] { 10.0f};
    float[] var9 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var9, '#', 1, (-1));
    float[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var9);
    float[] var15 = null;
    float[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var15);
    int var19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var15, 0.0f, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    char[] var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"100a1", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("          h          i          !          ", "          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"10.0", (java.lang.CharSequence)"True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    java.util.Iterator var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
    int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int var4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var2, 1);
    java.lang.Integer[] var6 = new java.lang.Integer[] { (-1)};
    int[] var7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6);
    int[] var10 = new int[] { 10, 1};
    boolean var11 = org.apache.commons.lang3.ArrayUtils.isEmpty(var10);
    int[] var12 = null;
    int[] var13 = org.apache.commons.lang3.ArrayUtils.removeElements(var10, var12);
    java.lang.Integer[] var14 = org.apache.commons.lang3.ArrayUtils.toObject(var10);
    java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var10, ' ');
    int[] var17 = org.apache.commons.lang3.ArrayUtils.addAll(var7, var10);
    java.lang.String var19 = org.apache.commons.lang3.StringUtils.join(var10, ' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var20 = org.apache.commons.lang3.ArrayUtils.removeAll(var2, var10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10 1"+ "'", var16.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 1"+ "'", var19.equals("10 1"));

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    byte[] var0 = null;
    byte[] var1 = org.apache.commons.lang3.ArrayUtils.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    java.lang.Byte[] var0 = null;
    byte[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var0, (byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.chomp("          h          i          !          ", "1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          h          i          !          "+ "'", var2.equals("          h          i          !          "));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    java.lang.Object[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence)"0.0a100.0a10.0a10.0", (java.lang.CharSequence)"", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 19);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    int[] var0 = null;
    int[] var3 = org.apache.commons.lang3.ArrayUtils.subarray(var0, 1, 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    java.lang.Float[] var1 = new java.lang.Float[] { 0.0f};
    float[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1, (-1.0f));
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.join(var3, '4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var9 = org.apache.commons.lang3.ArrayUtils.add(var3, (-1), 0.0f);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "0.0"+ "'", var6.equals("0.0"));

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    java.lang.Short[] var1 = new java.lang.Short[] { (short)1};
    java.lang.Short[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    java.lang.Object var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var5 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var2, 19, var4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    java.lang.Object[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"! i h", (java.lang.CharSequence)"101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence)"-1a10", (java.lang.CharSequence)"#A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"0.0a100.0a10.0a10.0", (java.lang.CharSequence)"100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    java.lang.Byte[] var0 = null;
    byte[] var1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"         ", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0.0a100.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0a100.0a10.0a10.0"+ "'", var1.equals("0.0a100.0a10.0a10.0"));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    java.lang.CharSequence var0 = null;
    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty(var0, (java.lang.CharSequence)" #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #a"+ "'", var2.equals(" #a"));

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("A", "a", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "A"+ "'", var3.equals("A"));

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.defaultString("-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1a10"+ "'", var1.equals("-1a10"));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.normalizeSpace("          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h i !"+ "'", var1.equals("h i !"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chomp("          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "          h          i          !          "+ "'", var1.equals("          h          i          !          "));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.add(var3, 1, 100.0d);
    double[] var14 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var14);
    double[] var17 = org.apache.commons.lang3.ArrayUtils.add(var14, 0.0d);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.isSameLength(var10, var17);
    double[] var22 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var22);
    double[] var26 = org.apache.commons.lang3.ArrayUtils.add(var22, 0, 0.0d);
    double[] var27 = org.apache.commons.lang3.ArrayUtils.addAll(var17, var22);
    double[] var30 = org.apache.commons.lang3.ArrayUtils.add(var22, 2, 100.0d);
    java.lang.Integer[] var32 = new java.lang.Integer[] { (-1)};
    int[] var33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var32);
    int[] var36 = new int[] { 10, 1};
    boolean var37 = org.apache.commons.lang3.ArrayUtils.isEmpty(var36);
    int[] var38 = null;
    int[] var39 = org.apache.commons.lang3.ArrayUtils.removeElements(var36, var38);
    java.lang.Integer[] var40 = org.apache.commons.lang3.ArrayUtils.toObject(var36);
    java.lang.String var42 = org.apache.commons.lang3.StringUtils.join(var36, ' ');
    int[] var43 = org.apache.commons.lang3.ArrayUtils.addAll(var33, var36);
    int[] var44 = org.apache.commons.lang3.ArrayUtils.clone(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var45 = org.apache.commons.lang3.ArrayUtils.removeAll(var30, var36);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "10 1"+ "'", var42.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("110 110 110 110", (-1), '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "110 110 110 110"+ "'", var3.equals("110 110 110 110"));

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern(" #a", "10041");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #a"+ "'", var2.equals(" #a"));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    float[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var6, 'a', 0, 0);
    char[] var16 = new char[] { 'a', ' ', 'a'};
    char[] var18 = org.apache.commons.lang3.ArrayUtils.remove(var16, 0);
    int var19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var18);
    int var21 = org.apache.commons.lang3.ArrayUtils.indexOf(var18, '#');
    int var23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var18, ' ');
    boolean var24 = org.apache.commons.lang3.ArrayUtils.isSameLength(var6, var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var25 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object)var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("a", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("h i !", "True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "h i !"+ "'", var2.equals("h i !"));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "! i h"+ "'", var1.equals("! i h"));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("0.0", "10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0"+ "'", var2.equals("0.0"));

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence)"#A", (java.lang.CharSequence)"10", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("-1a10", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
    java.lang.String[][] var1 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var2 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    boolean[] var0 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, true, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    java.lang.CharSequence var0 = null;
    char[] var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" #a", "101 h101 i101 !101 ");
    java.lang.Object var3 = null;
    int var4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var2, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chomp("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "          "+ "'", var1.equals("          "));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var3 = new int[] { 10, 1};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    int[] var5 = null;
    int[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var5);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var3);
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var7, 1);
    java.lang.Object[] var10 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var0, (java.lang.Object[])var7);
    java.lang.Byte[] var12 = new java.lang.Byte[] { (byte)100};
    byte[] var14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var12, (byte)1);
    java.lang.Integer[] var16 = new java.lang.Integer[] { (-1)};
    int[] var17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var16);
    int[] var20 = new int[] { 10, 1};
    boolean var21 = org.apache.commons.lang3.ArrayUtils.isEmpty(var20);
    int[] var22 = null;
    int[] var23 = org.apache.commons.lang3.ArrayUtils.removeElements(var20, var22);
    java.lang.Integer[] var24 = org.apache.commons.lang3.ArrayUtils.toObject(var20);
    java.lang.String var26 = org.apache.commons.lang3.StringUtils.join(var20, ' ');
    int[] var27 = org.apache.commons.lang3.ArrayUtils.addAll(var17, var20);
    int var29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var12, (java.lang.Object)var17, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var30 = org.apache.commons.lang3.ArrayUtils.addAll(var10, (java.lang.Object[])var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "10 1"+ "'", var26.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("hi!", 1, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var9 = org.apache.commons.lang3.ArrayUtils.remove(var2, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    java.lang.Object[] var0 = null;
    java.lang.Object var1 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, var1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join(var4, '#', 1, (-1));
    java.lang.String var12 = org.apache.commons.lang3.StringUtils.join(var4, ' ', 0, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var15 = org.apache.commons.lang3.ArrayUtils.add(var4, (-1), 0.0f);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10.0"+ "'", var12.equals("10.0"));

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)10};
    byte[] var4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var3);
    int var7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var4, (byte)0, 100);
    int var9 = org.apache.commons.lang3.ArrayUtils.indexOf(var4, (byte)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var11 = org.apache.commons.lang3.ArrayUtils.remove(var4, 19);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.add(var3, 1, 100.0d);
    int var14 = org.apache.commons.lang3.ArrayUtils.indexOf(var10, 10.0d, 15, 0.0d);
    boolean var17 = org.apache.commons.lang3.ArrayUtils.contains(var10, 100.0d, 10.0d);
    boolean var19 = org.apache.commons.lang3.ArrayUtils.contains(var10, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.add(var3, 1, 100.0d);
    double[] var14 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var14);
    double[] var17 = org.apache.commons.lang3.ArrayUtils.add(var14, 0.0d);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.isSameLength(var10, var17);
    double[] var22 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var22);
    double[] var26 = org.apache.commons.lang3.ArrayUtils.add(var22, 0, 0.0d);
    double[] var27 = org.apache.commons.lang3.ArrayUtils.addAll(var17, var22);
    double[] var30 = org.apache.commons.lang3.ArrayUtils.add(var22, 2, 100.0d);
    boolean var33 = org.apache.commons.lang3.ArrayUtils.contains(var30, 10.0d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    java.lang.CharSequence var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(var0, (java.lang.CharSequence)"hi!", 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"! i h", (java.lang.CharSequence)" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBetween("", "101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("0.0a100.0a10.0a10.0", "a", " h ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0.0 100.0 10.0 10.0"+ "'", var3.equals("0.0 100.0 10.0 10.0"));

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var7 = org.apache.commons.lang3.StringUtils.join(var3, ' ', 1, 0);
    byte[] var9 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (byte)(-1));
    byte[] var10 = org.apache.commons.lang3.ArrayUtils.clone(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var13 = org.apache.commons.lang3.ArrayUtils.add(var9, 100, (byte)10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    java.lang.CharSequence var0 = null;
    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf(var0, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("0.0", "h i !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0"+ "'", var2.equals("0.0"));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.apache.commons.lang3.text.translate.UnicodeEscaper var2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(4, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("          ", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "          "+ "'", var2.equals("          "));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"10.0", (java.lang.CharSequence)"h i !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    float[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("h          i          !", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence)"100a1", (java.lang.CharSequence)"! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("true", "", 4, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid(" #a", 2, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a"+ "'", var3.equals("a"));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
    int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int[] var5 = new int[] { 10, 1};
    boolean var6 = org.apache.commons.lang3.ArrayUtils.isEmpty(var5);
    int[] var7 = null;
    int[] var8 = org.apache.commons.lang3.ArrayUtils.removeElements(var5, var7);
    java.lang.Integer[] var9 = org.apache.commons.lang3.ArrayUtils.toObject(var5);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var5, ' ');
    int[] var12 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var5);
    java.lang.Integer[] var14 = new java.lang.Integer[] { (-1)};
    int[] var15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var14);
    int[] var18 = new int[] { 10, 1};
    boolean var19 = org.apache.commons.lang3.ArrayUtils.isEmpty(var18);
    int[] var20 = null;
    int[] var21 = org.apache.commons.lang3.ArrayUtils.removeElements(var18, var20);
    boolean var22 = org.apache.commons.lang3.ArrayUtils.isSameLength(var15, var21);
    int[] var24 = org.apache.commons.lang3.ArrayUtils.remove(var21, 0);
    int[] var26 = org.apache.commons.lang3.ArrayUtils.add(var24, 100);
    int[] var27 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var24);
    int var29 = org.apache.commons.lang3.ArrayUtils.indexOf(var24, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 1"+ "'", var11.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("110 110 110 110", "-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "110 110 110 110"+ "'", var2.equals("110 110 110 110"));

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    long[] var2 = new long[] { 0L, 0L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var4 = org.apache.commons.lang3.ArrayUtils.remove(var2, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("{}", "1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"          ", "A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull(".0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ".0"+ "'", var1.equals(".0"));

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat("{}", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}{}{}{}"+ "'", var2.equals("{}{}{}{}"));

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
    int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int[] var5 = new int[] { 10, 1};
    boolean var6 = org.apache.commons.lang3.ArrayUtils.isEmpty(var5);
    int[] var7 = null;
    int[] var8 = org.apache.commons.lang3.ArrayUtils.removeElements(var5, var7);
    java.lang.Integer[] var9 = org.apache.commons.lang3.ArrayUtils.toObject(var5);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var5, ' ');
    int[] var12 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var5);
    java.lang.Integer[] var14 = new java.lang.Integer[] { (-1)};
    int[] var15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var14);
    int[] var18 = new int[] { 10, 1};
    boolean var19 = org.apache.commons.lang3.ArrayUtils.isEmpty(var18);
    int[] var20 = null;
    int[] var21 = org.apache.commons.lang3.ArrayUtils.removeElements(var18, var20);
    boolean var22 = org.apache.commons.lang3.ArrayUtils.isSameLength(var15, var21);
    int[] var24 = org.apache.commons.lang3.ArrayUtils.remove(var21, 0);
    int[] var26 = org.apache.commons.lang3.ArrayUtils.add(var24, 100);
    int[] var27 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var24);
    int[] var30 = new int[] { 10, 1};
    boolean var31 = org.apache.commons.lang3.ArrayUtils.isEmpty(var30);
    int[] var32 = null;
    int[] var33 = org.apache.commons.lang3.ArrayUtils.removeElements(var30, var32);
    java.lang.Integer[] var34 = org.apache.commons.lang3.ArrayUtils.toObject(var30);
    int[] var36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var34, 1);
    boolean var37 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[])var34);
    int[] var38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var39 = org.apache.commons.lang3.ArrayUtils.removeAll(var27, var38);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 1"+ "'", var11.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
//     org.apache.commons.lang3.text.translate.LookupTranslator var1 = new org.apache.commons.lang3.text.translate.LookupTranslator((java.lang.CharSequence[][])var0);
//     java.lang.CharSequence var2 = null;
//     java.io.Writer var4 = null;
//     int var5 = var1.translate(var2, 100, var4);
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)"h          i          !", " #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("101", 15, "10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "10110 110 110 1"+ "'", var3.equals("10110 110 110 1"));

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.chomp("h          i          !", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "h          i          !"+ "'", var2.equals("h          i          !"));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = org.apache.commons.lang3.StringUtils.join(var2, 'a', 0, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence)"-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)" #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"10", (java.lang.CharSequence)"-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"true", 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)" #A", (java.lang.CharSequence)"110 110 110 110", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    char[] var8 = null;
    boolean var9 = org.apache.commons.lang3.ArrayUtils.isSameLength(var6, var8);
    org.apache.commons.lang3.ArrayUtils.reverse(var6);
    java.lang.Character[] var11 = org.apache.commons.lang3.ArrayUtils.toObject(var6);
    char[] var13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var11, '4');
    char[] var15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var11, '#');
    int var18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var15, '4', 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"10041", (java.lang.CharSequence)"0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.strip("         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"{}", (java.lang.CharSequence)"101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence)"10110 110 110 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.apache.commons.lang3.text.translate.EntityArrays var0 = new org.apache.commons.lang3.text.translate.EntityArrays();

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    byte[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10 1"+ "'", var1.equals("10 1"));

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    double[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence)"0.0 100.0 10.0 10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    int var3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"          h          i          !          ", (java.lang.CharSequence)" #a", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    short[] var0 = null;
    java.lang.Short[] var1 = org.apache.commons.lang3.ArrayUtils.toObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    java.lang.String var1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFFFFFFF"+ "'", var1.equals("FFFFFFFF"));

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"FFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("10.0", "0.0", "101");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    java.lang.String[] var4 = new java.lang.String[] { "          "};
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var2, var4);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var2);
    java.lang.Object[] var7 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[])var2);
    short[] var11 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var12 = org.apache.commons.lang3.ArrayUtils.clone(var11);
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isEmpty(var12);
    int var16 = org.apache.commons.lang3.ArrayUtils.indexOf(var12, (short)1, 2);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.contains(var12, (short)10);
    int var20 = org.apache.commons.lang3.ArrayUtils.indexOf(var7, (java.lang.Object)(short)10, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          "+ "'", var5.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    long[] var0 = null;
    long[] var3 = org.apache.commons.lang3.ArrayUtils.subarray(var0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("10 1", "          ", "101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "10 1"+ "'", var3.equals("10 1"));

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    java.lang.CharSequence var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"0.0a100.0a10.0a10.0", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    long[] var3 = new long[] { 100L, 100L, 1L};
    long[] var5 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (-1L));
    long[] var6 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join(var6, ' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var11 = org.apache.commons.lang3.ArrayUtils.add(var6, 100, 0L);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100 100 1"+ "'", var8.equals("100 100 1"));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence)"         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    int[] var0 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 19, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat('#', (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    short[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("a# # #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a# # #a"+ "'", var1.equals("a# # #a"));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence)"10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    int var3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"          h          i          !          ", (java.lang.CharSequence)"{}{}{}{}", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence)"-1a10", (java.lang.CharSequence)"true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "101 h101 i101 !101 ", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    short[] var0 = null;
    short[] var2 = org.apache.commons.lang3.ArrayUtils.add(var0, (short)1);
    org.apache.commons.lang3.ArrayUtils.reverse(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.uncapitalize("A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("", 4, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaaa"+ "'", var3.equals("aaaa"));

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviate("", 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    boolean[] var0 = null;
    boolean[] var2 = org.apache.commons.lang3.ArrayUtils.removeElement(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("a# # #a", 19, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaaaaaa# # #aaaaaaa"+ "'", var3.equals("aaaaaaa# # #aaaaaaa"));

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"FFFFFFFF", "1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    char[] var0 = null;
    char[] var3 = org.apache.commons.lang3.ArrayUtils.subarray(var0, 10, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    byte[] var2 = new byte[] { (byte)100, (byte)1};
    byte[] var3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var2);
    byte[] var4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    char[] var5 = org.apache.commons.lang3.ArrayUtils.remove(var3, 0);
    int var8 = org.apache.commons.lang3.ArrayUtils.indexOf(var5, 'a', 1);
    int var10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var5, 'a');
    int var13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var5, '4', 10);
    char[] var14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var16 = org.apache.commons.lang3.ArrayUtils.remove(var5, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("100a1", "! i h", "101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100a1"+ "'", var3.equals("100a1"));

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence)"true", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("#A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#A"+ "'", var1.equals("#A"));

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"100 100 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.apache.commons.lang3.text.translate.OctalUnescaper var0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
    java.lang.String[][] var1 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var4 = new int[] { 10, 1};
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isEmpty(var4);
    int[] var6 = null;
    int[] var7 = org.apache.commons.lang3.ArrayUtils.removeElements(var4, var6);
    java.lang.Integer[] var8 = org.apache.commons.lang3.ArrayUtils.toObject(var4);
    int[] var10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var8, 1);
    java.lang.Object[] var11 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var1, (java.lang.Object[])var8);
    java.util.Map var12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[])var1);
    org.apache.commons.lang3.text.translate.LookupTranslator var13 = new org.apache.commons.lang3.text.translate.LookupTranslator((java.lang.CharSequence[][])var1);
    org.apache.commons.lang3.text.translate.CharSequenceTranslator[] var14 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { var13};
    org.apache.commons.lang3.text.translate.CharSequenceTranslator var15 = var0.with(var14);
    java.io.Writer var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var0.translate((java.lang.CharSequence)"#A", 5, var18);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    java.lang.String[][] var6 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var9 = new int[] { 10, 1};
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isEmpty(var9);
    int[] var11 = null;
    int[] var12 = org.apache.commons.lang3.ArrayUtils.removeElements(var9, var11);
    java.lang.Integer[] var13 = org.apache.commons.lang3.ArrayUtils.toObject(var9);
    int[] var15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var13, 1);
    java.lang.Object[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var6, (java.lang.Object[])var13);
    int[] var17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var13);
    int[] var19 = org.apache.commons.lang3.ArrayUtils.add(var17, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var20 = org.apache.commons.lang3.ArrayUtils.removeAll(var3, var17);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("a", 15, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4444444a4444444"+ "'", var3.equals("4444444a4444444"));

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    short[] var3 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var4 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isEmpty(var4);
    java.lang.Integer[] var7 = new java.lang.Integer[] { (-1)};
    int[] var8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var7);
    int[] var11 = new int[] { 10, 1};
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isEmpty(var11);
    int[] var13 = null;
    int[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var11, var13);
    java.lang.Integer[] var15 = org.apache.commons.lang3.ArrayUtils.toObject(var11);
    java.lang.String var17 = org.apache.commons.lang3.StringUtils.join(var11, ' ');
    int[] var18 = org.apache.commons.lang3.ArrayUtils.addAll(var8, var11);
    int[] var20 = org.apache.commons.lang3.ArrayUtils.removeElement(var8, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var21 = org.apache.commons.lang3.ArrayUtils.removeAll(var4, var8);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10 1"+ "'", var17.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace(" h ", ".0", "True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " h "+ "'", var3.equals(" h "));

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100a1", "10110 110 110 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "100a1"+ "'", var2.equals("100a1"));

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToEmpty("101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101 h101 i101 !101"+ "'", var1.equals("101 h101 i101 !101"));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.substringsBetween("100a1", "h          i          !", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var8 = org.apache.commons.lang3.ArrayUtils.add(var2, 5, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    java.lang.Short[] var1 = new java.lang.Short[] { (short)(-1)};
    short[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1, (short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 2, (short)0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence)"h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    double[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("10.0");
    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence)"! i h", (java.lang.CharSequence[])var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    java.lang.CharSequence var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence)" #a", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.upperCase("aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "AAAA"+ "'", var1.equals("AAAA"));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
    int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int[] var5 = new int[] { 10, 1};
    boolean var6 = org.apache.commons.lang3.ArrayUtils.isEmpty(var5);
    int[] var7 = null;
    int[] var8 = org.apache.commons.lang3.ArrayUtils.removeElements(var5, var7);
    java.lang.Integer[] var9 = org.apache.commons.lang3.ArrayUtils.toObject(var5);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var5, ' ');
    int[] var12 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var5);
    int[] var13 = org.apache.commons.lang3.ArrayUtils.clone(var5);
    boolean var14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var5);
    int[] var17 = org.apache.commons.lang3.ArrayUtils.add(var5, 2, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var20 = org.apache.commons.lang3.ArrayUtils.add(var5, 100, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 1"+ "'", var11.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    char[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("#A", "a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#A"+ "'", var2.equals("#A"));

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence)"#A", (java.lang.CharSequence)"100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("a", 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("110 110 110 110", '4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "110 110 110 110"+ "'", var3.equals("110 110 110 110"));

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence)"{}{}{}{}", (java.lang.CharSequence)"1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101"+ "'", var1.equals("101"));

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.reverse("#A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "A#"+ "'", var1.equals("A#"));

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("101 h101 i101 !101", (-1), "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "101 h101 i101 !101"+ "'", var3.equals("101 h101 i101 !101"));

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeJava("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    java.lang.Long[] var4 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4, 100L);
    java.lang.Integer[] var8 = new java.lang.Integer[] { (-1)};
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var8);
    int[] var12 = new int[] { 10, 1};
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isEmpty(var12);
    int[] var14 = null;
    int[] var15 = org.apache.commons.lang3.ArrayUtils.removeElements(var12, var14);
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isSameLength(var9, var15);
    int[] var18 = org.apache.commons.lang3.ArrayUtils.remove(var15, 0);
    long[] var19 = org.apache.commons.lang3.ArrayUtils.removeAll(var6, var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var21 = org.apache.commons.lang3.ArrayUtils.remove(var19, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern("FFFFFFFF", "#A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "FFFFFFFF"+ "'", var2.equals("FFFFFFFF"));

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    short[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("", "FFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("", "a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    java.lang.CharSequence var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)"110 110 110 110", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("         ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "         "+ "'", var2.equals("         "));

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object)(byte)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h          i          !"+ "'", var1.equals("h          i          !"));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)".0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"          h          i          !          ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    long[] var0 = null;
    long[] var3 = new long[] { (-1L), 0L};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    long[] var7 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 100, 1);
    boolean var8 = org.apache.commons.lang3.ArrayUtils.isSameLength(var0, var3);
    long[] var9 = org.apache.commons.lang3.ArrayUtils.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    char[] var1 = new char[] { '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var3 = org.apache.commons.lang3.ArrayUtils.remove(var1, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence)" ", (java.lang.CharSequence)"  a", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("0.0a100.0a10.0a10.0", 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0a100.0a10.0a10.0"+ "'", var2.equals("0.0a100.0a10.0a10.0"));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { 15};
    java.lang.Integer[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var2, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "15"+ "'", var4.equals("15"));

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var9 = new int[] { 10, 1};
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isEmpty(var9);
    int[] var11 = null;
    int[] var12 = org.apache.commons.lang3.ArrayUtils.removeElements(var9, var11);
    int[] var15 = new int[] { 10, 1};
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isEmpty(var15);
    int[] var17 = null;
    int[] var18 = org.apache.commons.lang3.ArrayUtils.removeElements(var15, var17);
    java.lang.Integer[] var19 = org.apache.commons.lang3.ArrayUtils.toObject(var15);
    int[] var21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var19, 1);
    int[] var22 = org.apache.commons.lang3.ArrayUtils.removeElements(var11, var21);
    int var23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var6, (java.lang.Object)var11);
    int[] var25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6, 4);
    short[] var29 = new short[] { (short)10, (short)(-1), (short)(-1)};
    short[] var30 = org.apache.commons.lang3.ArrayUtils.clone(var29);
    long[] var33 = new long[] { (-1L), 0L};
    boolean var34 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var33);
    long[] var37 = org.apache.commons.lang3.ArrayUtils.subarray(var33, 100, 1);
    java.lang.Object[] var38 = new java.lang.Object[] { var33};
    short[] var42 = new short[] { (short)10, (short)(-1), (short)(-1)};
    short[] var43 = org.apache.commons.lang3.ArrayUtils.clone(var42);
    int var44 = org.apache.commons.lang3.ArrayUtils.indexOf(var38, (java.lang.Object)var42);
    short[] var47 = org.apache.commons.lang3.ArrayUtils.add(var42, 0, (short)0);
    boolean var48 = org.apache.commons.lang3.ArrayUtils.isSameLength(var29, var42);
    boolean var49 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var42);
    short[] var51 = org.apache.commons.lang3.ArrayUtils.add(var42, (short)0);
    short[] var52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var53 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var6, (java.lang.Object)var42);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3(" #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " #A"+ "'", var1.equals(" #A"));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    java.lang.Long[] var4 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4, 100L);
    java.lang.Integer[] var8 = new java.lang.Integer[] { (-1)};
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var8);
    int[] var12 = new int[] { 10, 1};
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isEmpty(var12);
    int[] var14 = null;
    int[] var15 = org.apache.commons.lang3.ArrayUtils.removeElements(var12, var14);
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isSameLength(var9, var15);
    int[] var18 = org.apache.commons.lang3.ArrayUtils.remove(var15, 0);
    long[] var19 = org.apache.commons.lang3.ArrayUtils.removeAll(var6, var18);
    long[] var22 = org.apache.commons.lang3.ArrayUtils.subarray(var19, 100, 19);
    boolean var23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100a1"+ "'", var1.equals("100a1"));

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", " ", 0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"+ "'", var4.equals(" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"));

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.defaultString("h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h          i          !"+ "'", var1.equals("h          i          !"));

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("10 1", 19, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    java.lang.Long[] var4 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4, 100L);
    org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[])var4);
    java.lang.Long[] var8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var4);
    long[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var3 = new int[] { 10, 1};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    int[] var5 = null;
    int[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var5);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var3);
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var7, 1);
    java.lang.Object[] var10 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var0, (java.lang.Object[])var7);
    org.apache.commons.lang3.text.translate.UnicodeEscaper var12 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var13 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var0, (java.lang.Object)0);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)"10041", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"#A", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat("aaaa", 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double[] var0 = null;
    int var4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 0.0d, 1, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "          "+ "'", var1.equals("          "));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("          ", " h ", "{}{}{}{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{{{{{{{{{{"+ "'", var3.equals("{{{{{{{{{{"));

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    int[] var0 = null;
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join(var0, 'a', 0, 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("", 4, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "####"+ "'", var3.equals("####"));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
    int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int[] var5 = new int[] { 10, 1};
    boolean var6 = org.apache.commons.lang3.ArrayUtils.isEmpty(var5);
    int[] var7 = null;
    int[] var8 = org.apache.commons.lang3.ArrayUtils.removeElements(var5, var7);
    java.lang.Integer[] var9 = org.apache.commons.lang3.ArrayUtils.toObject(var5);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var5, ' ');
    int[] var12 = org.apache.commons.lang3.ArrayUtils.addAll(var2, var5);
    int[] var14 = org.apache.commons.lang3.ArrayUtils.removeElement(var2, 0);
    int[] var17 = new int[] { (-1), 0};
    int[] var18 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var17);
    org.apache.commons.lang3.ArrayUtils.reverse(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 1"+ "'", var11.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfter("", "10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    java.lang.CharSequence[] var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence)"#A", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("", " ", 15, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " "+ "'", var4.equals(" "));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("4444444a4444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4444444a4444444"+ "'", var1.equals("4444444a4444444"));

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("#A", "10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#A"+ "'", var2.equals("#A"));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    java.lang.Character[] var0 = null;
    char[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    int var9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var6, 10.0d, (-1.0d));
    double[] var13 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var13);
    double[] var16 = org.apache.commons.lang3.ArrayUtils.add(var13, 0.0d);
    boolean var17 = org.apache.commons.lang3.ArrayUtils.isEmpty(var13);
    double[] var20 = org.apache.commons.lang3.ArrayUtils.add(var13, 1, 100.0d);
    double[] var21 = org.apache.commons.lang3.ArrayUtils.removeElements(var6, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var23 = org.apache.commons.lang3.ArrayUtils.remove(var6, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("h          i          !", "100a1", (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100a1h          i          !"+ "'", var4.equals("100a1h          i          !"));

  }

  public void test434() {}
//   public void test434() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }
// 
// 
//     java.lang.Integer[] var1 = new java.lang.Integer[] { (-1)};
//     int[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
//     boolean var4 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object)var1, (java.lang.Object)10.0f);
//     int[] var5 = null;
//     java.lang.Object[] var6 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Object[])var1, var5);
// 
//   }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"hi!", "10041");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ", " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("h i !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h i !"+ "'", var1.equals("h i !"));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"true", (java.lang.CharSequence)"          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.center("", 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "     "+ "'", var2.equals("     "));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    org.apache.commons.lang3.text.translate.UnicodeUnescaper var0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    java.io.Writer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.translate((java.lang.CharSequence)"10", (-1), var3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)"a# # #a", (java.lang.CharSequence)"10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    char[] var0 = null;
    char[] var1 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.isSameLength(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    java.lang.CharSequence var0 = null;
    int var3 = org.apache.commons.lang3.StringUtils.indexOf(var0, 15, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    short[] var0 = null;
    short[] var2 = org.apache.commons.lang3.ArrayUtils.removeElement(var0, (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    float[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3("0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace(" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", " #A", "         ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"+ "'", var3.equals(" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}"));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    long[] var3 = new long[] { 100L, 100L, 1L};
    long[] var5 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (-1L));
    long[] var6 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join(var6, ' ');
    java.lang.String var12 = org.apache.commons.lang3.StringUtils.join(var6, 'a', 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var14 = org.apache.commons.lang3.ArrayUtils.remove(var6, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100 100 1"+ "'", var8.equals("100 100 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101 H101 I101 !101 "+ "'", var1.equals("101 H101 I101 !101 "));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    byte[] var0 = null;
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join(var0, '#', 100, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    java.lang.CharSequence[] var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence)"10 1", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          h          i          !          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.add(var3, 1, 100.0d);
    double[] var12 = org.apache.commons.lang3.ArrayUtils.remove(var10, 0);
    int var14 = org.apache.commons.lang3.ArrayUtils.indexOf(var12, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    short[] var0 = null;
    short[] var2 = org.apache.commons.lang3.ArrayUtils.add(var0, (short)1);
    short[] var3 = org.apache.commons.lang3.ArrayUtils.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    char[] var6 = new char[] { 'a', ' ', 'a'};
    char[] var8 = org.apache.commons.lang3.ArrayUtils.remove(var6, 0);
    int var9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var8);
    char[] var10 = null;
    boolean var11 = org.apache.commons.lang3.ArrayUtils.isSameLength(var8, var10);
    boolean var12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)"10.0", var8);
    org.apache.commons.lang3.ArrayUtils.reverse(var8);
    int var14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"          h          i          !          ", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)10};
    byte[] var4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var3);
    org.apache.commons.lang3.ArrayUtils.reverse(var4);
    byte[] var8 = new byte[] { (byte)100, (byte)1};
    byte[] var9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var8);
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var8, '4');
    byte[] var12 = org.apache.commons.lang3.ArrayUtils.addAll(var4, var8);
    int[] var15 = new int[] { 10, 1};
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isEmpty(var15);
    int[] var17 = null;
    int[] var18 = org.apache.commons.lang3.ArrayUtils.removeElements(var15, var17);
    java.lang.Integer[] var19 = org.apache.commons.lang3.ArrayUtils.toObject(var15);
    int[] var21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var19, 1);
    boolean var22 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[])var19);
    int[] var23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var19);
    boolean var25 = org.apache.commons.lang3.ArrayUtils.contains(var23, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var26 = org.apache.commons.lang3.ArrayUtils.removeAll(var4, var23);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10041"+ "'", var11.equals("10041"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    byte[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.repeat('#', 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "##"+ "'", var2.equals("##"));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    short[] var0 = null;
    short[] var4 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var5 = org.apache.commons.lang3.ArrayUtils.clone(var4);
    short[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var0, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("A#", (-1), "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "A#"+ "'", var3.equals("A#"));

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101 h101 i101 !101 "+ "'", var1.equals("101 h101 i101 !101 "));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var7 = org.apache.commons.lang3.ArrayUtils.add(var3, 0, 0.0d);
    int var10 = org.apache.commons.lang3.ArrayUtils.indexOf(var7, 1.0d, (-1));
    double[] var14 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var14);
    double[] var17 = org.apache.commons.lang3.ArrayUtils.add(var14, 0.0d);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.isEmpty(var14);
    double[] var21 = org.apache.commons.lang3.ArrayUtils.add(var14, 1, 100.0d);
    double[] var25 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var25);
    double[] var28 = org.apache.commons.lang3.ArrayUtils.add(var25, 0.0d);
    boolean var29 = org.apache.commons.lang3.ArrayUtils.isSameLength(var21, var28);
    double[] var33 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var34 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var33);
    double[] var37 = org.apache.commons.lang3.ArrayUtils.add(var33, 0, 0.0d);
    double[] var38 = org.apache.commons.lang3.ArrayUtils.addAll(var28, var33);
    boolean var39 = org.apache.commons.lang3.ArrayUtils.isSameLength(var7, var28);
    double[] var43 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var43);
    double[] var46 = org.apache.commons.lang3.ArrayUtils.add(var43, 0.0d);
    boolean var47 = org.apache.commons.lang3.ArrayUtils.isEmpty(var43);
    double[] var50 = org.apache.commons.lang3.ArrayUtils.add(var43, 1, 100.0d);
    double[] var54 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var54);
    double[] var57 = org.apache.commons.lang3.ArrayUtils.add(var54, 0.0d);
    boolean var58 = org.apache.commons.lang3.ArrayUtils.isSameLength(var50, var57);
    double[] var59 = org.apache.commons.lang3.ArrayUtils.addAll(var28, var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var62 = org.apache.commons.lang3.ArrayUtils.add(var28, 15, 100.0d);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("{1}", 9, "aaaaaaa# # #aaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{1}aaaaaa"+ "'", var3.equals("{1}aaaaaa"));

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    java.lang.CharSequence var0 = null;
    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfBlank(var0, (java.lang.CharSequence)" #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #a"+ "'", var2.equals(" #a"));

  }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("101 h101 i101 !101", var1);
// 
//   }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    java.lang.CharSequence var0 = null;
    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty(var0, (java.lang.CharSequence)"A#");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "A#"+ "'", var2.equals("A#"));

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToEmpty("! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "! i h"+ "'", var1.equals("! i h"));

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"     ", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    boolean[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    java.lang.Long[] var4 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4, 100L);
    long[] var10 = new long[] { 100L, 100L, 1L};
    long[] var12 = org.apache.commons.lang3.ArrayUtils.removeElement(var10, (-1L));
    long[] var13 = org.apache.commons.lang3.ArrayUtils.removeElements(var6, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var15 = org.apache.commons.lang3.ArrayUtils.remove(var13, 9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    java.lang.CharSequence var0 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(var0, (java.lang.CharSequence)"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)"10110 110 110 1", (java.lang.CharSequence)"a# # #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, 0.0d);
    int var9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var6, 10.0d, (-1.0d));
    double[] var13 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var13);
    double[] var16 = org.apache.commons.lang3.ArrayUtils.add(var13, 0.0d);
    boolean var17 = org.apache.commons.lang3.ArrayUtils.isEmpty(var13);
    double[] var20 = org.apache.commons.lang3.ArrayUtils.add(var13, 1, 100.0d);
    double[] var21 = org.apache.commons.lang3.ArrayUtils.removeElements(var6, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var24 = org.apache.commons.lang3.ArrayUtils.add(var21, 2, 100.0d);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence)"  a", (java.lang.CharSequence)"####");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad(" #a", 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #a            "+ "'", var2.equals(" #a            "));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    byte[] var3 = new byte[] { (byte)0, (byte)(-1), (byte)10};
    byte[] var7 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var7, ' ', 1, 0);
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isSameLength(var3, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = org.apache.commons.lang3.StringUtils.toString(var7, "10 1");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var1.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("####");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "####"+ "'", var1.equals("####"));

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    boolean[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    java.lang.CharSequence var0 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.startsWith(var0, (java.lang.CharSequence)"101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test483() {}
//   public void test483() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("         ", var1);
// 
//   }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    java.util.Iterator var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    java.util.Iterator var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.split("####");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.subarray(var2, 100, 1);
    int[] var9 = new int[] { 10, 1};
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isEmpty(var9);
    int[] var11 = null;
    int[] var12 = org.apache.commons.lang3.ArrayUtils.removeElements(var9, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var13 = org.apache.commons.lang3.ArrayUtils.removeAll(var6, var12);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    java.lang.Long[] var4 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4, 100L);
    int var8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var6, 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var11 = org.apache.commons.lang3.ArrayUtils.add(var6, (-1), 100L);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("A#", "10.0", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "A#"+ "'", var3.equals("A#"));

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    float[] var0 = null;
    float[] var2 = new float[] { 10.0f};
    float[] var5 = org.apache.commons.lang3.ArrayUtils.subarray(var2, 0, 100);
    float[] var7 = new float[] { 10.0f};
    float[] var10 = org.apache.commons.lang3.ArrayUtils.subarray(var7, 0, 100);
    java.lang.String var14 = org.apache.commons.lang3.StringUtils.join(var10, '#', 1, (-1));
    float[] var15 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var10);
    float[] var17 = org.apache.commons.lang3.ArrayUtils.removeElement(var10, 10.0f);
    float[] var20 = org.apache.commons.lang3.ArrayUtils.subarray(var10, 19, 0);
    float[] var22 = new float[] { 10.0f};
    float[] var25 = org.apache.commons.lang3.ArrayUtils.subarray(var22, 0, 100);
    int var28 = org.apache.commons.lang3.ArrayUtils.indexOf(var25, 0.0f, 100);
    float[] var29 = org.apache.commons.lang3.ArrayUtils.addAll(var20, var25);
    boolean var30 = org.apache.commons.lang3.ArrayUtils.isSameLength(var0, var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var33 = org.apache.commons.lang3.ArrayUtils.add(var25, 9, 100.0f);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.overlay("{1}aaaaaa", "aaaaaaa# # #aaaaaaa", 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "aaaaaaa# # #aaaaaaa1}aaaaaa"+ "'", var4.equals("aaaaaaa# # #aaaaaaa1}aaaaaa"));

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    java.lang.CharSequence var0 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(var0, (java.lang.CharSequence)"{}{}{}{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("10.0", "1", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0.0"+ "'", var3.equals("0.0"));

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence)"hi!", (java.lang.CharSequence)"101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace(" #a", "{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", "0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " #a"+ "'", var3.equals(" #a"));

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"{}{}{}{}", (java.lang.CharSequence)"aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    java.lang.CharSequence var1 = null;
    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"aaaa", var1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    java.lang.Boolean[] var0 = null;
    boolean[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("0.0a100.0a10.0a10.0", "-1a10", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

}
