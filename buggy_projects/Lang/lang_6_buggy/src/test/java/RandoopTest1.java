
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    short[] var0 = null;
    short[] var1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("4444444a4444444", 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "44a4444444"+ "'", var2.equals("44a4444444"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    java.lang.Boolean[] var1 = new java.lang.Boolean[] { true};
    java.lang.Boolean[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    boolean[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var2, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var7 = org.apache.commons.lang3.ArrayUtils.add(var4, 19, false);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"10110 110 110 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var3.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    java.lang.Boolean[] var1 = new java.lang.Boolean[] { true};
    java.lang.Boolean[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    boolean[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1, true);
    boolean var6 = org.apache.commons.lang3.ArrayUtils.contains(var4, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    char[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToNull("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence)"10 1", (java.lang.CharSequence)"a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


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
    int var20 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object)var19);
    java.lang.String[][] var21 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var24 = new int[] { 10, 1};
    boolean var25 = org.apache.commons.lang3.ArrayUtils.isEmpty(var24);
    int[] var26 = null;
    int[] var27 = org.apache.commons.lang3.ArrayUtils.removeElements(var24, var26);
    java.lang.Integer[] var28 = org.apache.commons.lang3.ArrayUtils.toObject(var24);
    int[] var30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var28, 1);
    java.lang.Object[] var31 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var21, (java.lang.Object[])var28);
    int[] var32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var28);
    int[] var34 = org.apache.commons.lang3.ArrayUtils.add(var32, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var35 = org.apache.commons.lang3.ArrayUtils.removeAll(var19, var32);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence)"10041", (java.lang.CharSequence)"110 110 110 110");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    byte[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A#", "FFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "A#"+ "'", var2.equals("A#"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    double[] var0 = null;
    double[] var1 = org.apache.commons.lang3.ArrayUtils.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaa# # #aaaaaaa", "100 100 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaa# # #aaaaaaa"+ "'", var2.equals("aaaaaaa# # #aaaaaaa"));

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }
// 
// 
//     byte[] var0 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.toString(var0, " ");
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("44a4444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "44a4444444"+ "'", var1.equals("44a4444444"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.swapCase("10110 110 110 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10110 110 110 1"+ "'", var1.equals("10110 110 110 1"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    org.apache.commons.lang3.text.translate.UnicodeEscaper var1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(9);
    java.lang.CharSequence var2 = null;
    java.io.Writer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.translate(var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    char[] var5 = org.apache.commons.lang3.ArrayUtils.remove(var3, 0);
    int var8 = org.apache.commons.lang3.ArrayUtils.indexOf(var5, 'a', 1);
    int var10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var5, 'a');
    int var13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var5, '4', 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var15 = org.apache.commons.lang3.ArrayUtils.remove(var5, 19);
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    java.lang.CharSequence var0 = null;
    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf(var0, 10, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    org.apache.commons.lang3.text.translate.UnicodeUnescaper var0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    java.io.Writer var3 = null;
    int var4 = var0.translate((java.lang.CharSequence)"h i !", 4, var3);
    java.io.Writer var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.translate((java.lang.CharSequence)"100a1", 9, var7);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var7 = org.apache.commons.lang3.ArrayUtils.add(var3, 0, 0.0d);
    boolean var9 = org.apache.commons.lang3.ArrayUtils.contains(var3, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence)"100 100 1", (java.lang.CharSequence)"100 100 1", 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("110 110 110 110", 4, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "110 110 110 110"+ "'", var3.equals("110 110 110 110"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"{}", (java.lang.CharSequence)"{1}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    org.apache.commons.lang3.text.translate.LookupTranslator var1 = new org.apache.commons.lang3.text.translate.LookupTranslator((java.lang.CharSequence[][])var0);
    java.io.Writer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.translate((java.lang.CharSequence)"aaaa", var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"101 H101 I101 !101 ", (java.lang.CharSequence)"1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    boolean[] var8 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 15, 19);
    int[] var11 = new int[] { 10, 1};
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isEmpty(var11);
    int[] var13 = null;
    int[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var11, var13);
    java.lang.Integer[] var15 = org.apache.commons.lang3.ArrayUtils.toObject(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var16 = org.apache.commons.lang3.ArrayUtils.removeAll(var8, var11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    float[] var6 = new float[] { 10.0f};
    float[] var9 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var9, '#', 1, (-1));
    float[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var9);
    int var16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var14, 0.0f);
    org.apache.commons.lang3.ArrayUtils.reverse(var14);
    
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
    assertTrue(var16 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.repeat("0.0a100.0a10.0a10.0", "####", 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0"+ "'", var3.equals("0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    float[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var3 = org.apache.commons.lang3.ArrayUtils.add(var0, 2, 0.0f);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    byte[] var3 = new byte[] { (byte)0, (byte)(-1), (byte)10};
    byte[] var7 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var11 = org.apache.commons.lang3.StringUtils.join(var7, ' ', 1, 0);
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isSameLength(var3, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var14 = org.apache.commons.lang3.ArrayUtils.remove(var3, 9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence)"101 h101 i101 !101", (java.lang.CharSequence)"0a-1a0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    int var2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence)"110 110 110 110", (java.lang.CharSequence)"100#100#1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)"aaaa", (java.lang.CharSequence)"0.0a100.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("", 100, " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&"+ "'", var3.equals(" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&"));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"100 100 1", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    short[] var3 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var4 = org.apache.commons.lang3.ArrayUtils.clone(var3);
    org.apache.commons.lang3.ArrayUtils.reverse(var4);
    short[] var9 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var10 = org.apache.commons.lang3.ArrayUtils.clone(var9);
    boolean var11 = org.apache.commons.lang3.ArrayUtils.isEmpty(var10);
    int var14 = org.apache.commons.lang3.ArrayUtils.indexOf(var10, (short)1, 2);
    boolean var16 = org.apache.commons.lang3.ArrayUtils.contains(var10, (short)10);
    short[] var17 = org.apache.commons.lang3.ArrayUtils.removeElements(var4, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var19 = org.apache.commons.lang3.ArrayUtils.remove(var4, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    char[] var8 = null;
    boolean var9 = org.apache.commons.lang3.ArrayUtils.isSameLength(var6, var8);
    org.apache.commons.lang3.ArrayUtils.reverse(var6);
    java.lang.Character[] var11 = org.apache.commons.lang3.ArrayUtils.toObject(var6);
    char[] var13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var11, '4');
    char[] var17 = new char[] { 'a', ' ', 'a'};
    char[] var19 = org.apache.commons.lang3.ArrayUtils.remove(var17, 0);
    int var22 = org.apache.commons.lang3.ArrayUtils.indexOf(var19, 'a', 1);
    int var24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var19, 'a');
    int var27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var19, '4', 10);
    char[] var28 = org.apache.commons.lang3.ArrayUtils.addAll(var13, var19);
    java.lang.Character[] var29 = org.apache.commons.lang3.ArrayUtils.toObject(var13);
    int[] var32 = new int[] { 10, 1};
    boolean var33 = org.apache.commons.lang3.ArrayUtils.isEmpty(var32);
    int[] var34 = null;
    int[] var35 = org.apache.commons.lang3.ArrayUtils.removeElements(var32, var34);
    java.lang.Integer[] var36 = org.apache.commons.lang3.ArrayUtils.toObject(var32);
    int[] var38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var36, 1);
    java.lang.Object[] var39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[])var36);
    long[] var42 = new long[] { (-1L), 0L};
    boolean var43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var42);
    java.lang.Object[] var44 = new java.lang.Object[] { var43};
    java.lang.String var46 = org.apache.commons.lang3.StringUtils.join(var44, 'a');
    java.lang.Object[] var47 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var36, var44);
    long[] var50 = new long[] { (-1L), 0L};
    boolean var51 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var50);
    java.lang.Long[] var52 = org.apache.commons.lang3.ArrayUtils.toObject(var50);
    java.lang.Object[] var53 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Object[])var52);
    long[] var55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var52, 0L);
    java.lang.String[] var58 = new java.lang.String[] { "hi!"};
    java.lang.String[] var60 = new java.lang.String[] { "          "};
    java.lang.String var61 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var58, var60);
    boolean var62 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[])var52, (java.lang.Object[])var58);
    java.lang.Object[] var63 = org.apache.commons.lang3.ArrayUtils.removeElements(var47, (java.lang.Object[])var58);
    int var64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var29, (java.lang.Object)var47);
    java.lang.String[] var65 = null;
    java.lang.String[] var66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var65);
    java.lang.Object[] var67 = org.apache.commons.lang3.ArrayUtils.removeElement(var47, (java.lang.Object)var65);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "true"+ "'", var46.equals("true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "          "+ "'", var61.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    java.lang.CharSequence var0 = null;
    int var1 = org.apache.commons.lang3.StringUtils.length(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chop("10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10 "+ "'", var1.equals("10 "));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    byte[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var2 = org.apache.commons.lang3.ArrayUtils.remove(var0, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("h i !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "h i !"+ "'", var1.equals("h i !"));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


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
    int[] var27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var28 = org.apache.commons.lang3.ArrayUtils.removeAll(var8, var19);
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
    assertNotNull(var27);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    int var3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence)"0.0 100.0 10.0 10.0", (java.lang.CharSequence)"101 h101 i101 !101", 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    int var2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence)"44a4444444", (java.lang.CharSequence)"101 h101 i101 !101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 18);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    float[] var0 = null;
    java.lang.Float[] var1 = org.apache.commons.lang3.ArrayUtils.toObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0", "100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0"+ "'", var2.equals("0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0"));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "44a4444444", "101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("10.0");
    java.lang.Integer[] var3 = new java.lang.Integer[] { (-1)};
    int[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var3);
    int[] var7 = new int[] { 10, 1};
    boolean var8 = org.apache.commons.lang3.ArrayUtils.isEmpty(var7);
    int[] var9 = null;
    int[] var10 = org.apache.commons.lang3.ArrayUtils.removeElements(var7, var9);
    java.lang.Integer[] var11 = org.apache.commons.lang3.ArrayUtils.toObject(var7);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var7, ' ');
    int[] var14 = org.apache.commons.lang3.ArrayUtils.addAll(var4, var7);
    int[] var16 = org.apache.commons.lang3.ArrayUtils.removeElement(var4, 0);
    int[] var19 = new int[] { (-1), 0};
    int[] var20 = org.apache.commons.lang3.ArrayUtils.removeElements(var4, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var21 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var1, (java.lang.Object)var19);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 1"+ "'", var13.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBetween("h i !", "100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.split("", '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("{}{}{}{}", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}{}{}{}"+ "'", var2.equals("{}{}{}{}"));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" #a", "101 h101 i101 !101 ");
    boolean var4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence)" h ", (java.lang.CharSequence[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    java.lang.Object[] var0 = null;
    boolean[] var4 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var4);
    boolean[] var8 = org.apache.commons.lang3.ArrayUtils.subarray(var4, 0, 0);
    boolean[] var12 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var12);
    boolean[] var16 = org.apache.commons.lang3.ArrayUtils.subarray(var12, 0, 0);
    boolean[] var17 = org.apache.commons.lang3.ArrayUtils.removeElements(var8, var16);
    java.lang.Object[] var18 = org.apache.commons.lang3.ArrayUtils.add(var0, (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var21 = org.apache.commons.lang3.ArrayUtils.add(var8, 4, false);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence)"true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    java.lang.String[] var1 = new java.lang.String[] { "         "};
    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.stripAll(var1);
    org.apache.commons.lang3.StringUtils var3 = new org.apache.commons.lang3.StringUtils();
    int var4 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[])var1, (java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join(var4, '#', 1, (-1));
    float[] var9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var12 = org.apache.commons.lang3.ArrayUtils.add(var4, 3, 1.0f);
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
    assertNotNull(var9);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("{}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }
// 
// 
//     org.apache.commons.lang3.text.translate.UnicodeEscaper var2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
//     java.io.Writer var5 = null;
//     int var6 = var2.translate((java.lang.CharSequence)"100a1h          i          !", 3, var5);
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("          h          i          !          ", 9, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "          h          i          !          "+ "'", var3.equals("          h          i          !          "));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.subarray(var2, 100, 1);
    java.lang.Object[] var7 = new java.lang.Object[] { var2};
    short[] var11 = new short[] { (short)10, (short)(-1), (short)(-1)};
    short[] var12 = org.apache.commons.lang3.ArrayUtils.clone(var11);
    int var13 = org.apache.commons.lang3.ArrayUtils.indexOf(var7, (java.lang.Object)var11);
    short[] var14 = org.apache.commons.lang3.ArrayUtils.clone(var11);
    short[] var17 = org.apache.commons.lang3.ArrayUtils.add(var11, 1, (short)1);
    short[] var19 = org.apache.commons.lang3.ArrayUtils.remove(var17, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var22 = org.apache.commons.lang3.ArrayUtils.add(var19, 19, (short)10);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    byte[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    java.lang.String[] var4 = new java.lang.String[] { "          "};
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var2, var4);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[])var2, (java.lang.Object)' ');
    java.lang.String[] var8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var2);
    java.lang.String var9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          "+ "'", var5.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    java.lang.Boolean[] var1 = new java.lang.Boolean[] { true};
    java.lang.Boolean[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    boolean[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var2, false);
    boolean[] var6 = org.apache.commons.lang3.ArrayUtils.removeElement(var4, false);
    java.lang.Integer[] var8 = new java.lang.Integer[] { (-1)};
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var8);
    int[] var12 = new int[] { 10, 1};
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isEmpty(var12);
    int[] var14 = null;
    int[] var15 = org.apache.commons.lang3.ArrayUtils.removeElements(var12, var14);
    java.lang.Integer[] var16 = org.apache.commons.lang3.ArrayUtils.toObject(var12);
    java.lang.String var18 = org.apache.commons.lang3.StringUtils.join(var12, ' ');
    int[] var19 = org.apache.commons.lang3.ArrayUtils.addAll(var9, var12);
    int[] var20 = org.apache.commons.lang3.ArrayUtils.clone(var12);
    int var22 = org.apache.commons.lang3.ArrayUtils.indexOf(var20, 100);
    int[] var23 = org.apache.commons.lang3.ArrayUtils.clone(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var24 = org.apache.commons.lang3.ArrayUtils.removeAll(var4, var23);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10 1"+ "'", var18.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart("10 ", "0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 "+ "'", var2.equals("10 "));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence)"100410041", (java.lang.CharSequence)"a# # #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("h i !", "15", "15");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "h i !"+ "'", var3.equals("h i !"));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("{1}aaaaaa", "#A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{1}aaaaaa"+ "'", var2.equals("{1}aaaaaa"));

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    java.lang.CharSequence var0 = null;
    java.lang.String[] var3 = new java.lang.String[] { "hi!"};
    java.lang.String[] var5 = new java.lang.String[] { "          "};
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var3, var5);
    boolean var8 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[])var3, (java.lang.Object)' ');
    int var9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(var0, (java.lang.CharSequence[])var3);
    short[] var13 = new short[] { (short)0, (short)(-1), (short)0};
    short[] var14 = org.apache.commons.lang3.ArrayUtils.clone(var13);
    short[] var17 = org.apache.commons.lang3.ArrayUtils.add(var14, 0, (short)1);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object)var9, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "          "+ "'", var6.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     org.apache.commons.lang3.text.translate.UnicodeEscaper var2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
//     java.io.Writer var4 = null;
//     boolean var5 = var2.translate(10, var4);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence)"10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)10};
    byte[] var4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var3);
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    byte[] var7 = org.apache.commons.lang3.ArrayUtils.add(var3, (byte)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var9 = org.apache.commons.lang3.ArrayUtils.remove(var3, 5);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    int[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var3 = org.apache.commons.lang3.ArrayUtils.add(var0, 9, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replace("100a1", "-1a10", "100a1h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100a1"+ "'", var3.equals("100a1"));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("10110 110 110 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10110 110 110 1"+ "'", var1.equals("10110 110 110 1"));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"100410041", (java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaa# # #aaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    java.lang.String[] var4 = new java.lang.String[] { "          "};
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var2, var4);
    java.lang.String var6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var2);
    java.lang.Object var7 = null;
    int var9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var2, var7, 1);
    java.lang.Float[] var11 = new java.lang.Float[] { 0.0f};
    float[] var13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var11, (-1.0f));
    org.apache.commons.lang3.ArrayUtils.reverse(var13);
    java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var13, '4');
    float[] var17 = org.apache.commons.lang3.ArrayUtils.clone(var13);
    java.lang.String var19 = org.apache.commons.lang3.StringUtils.join(var17, '4');
    int var21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var2, (java.lang.Object)'4', 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          "+ "'", var5.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "0.0"+ "'", var16.equals("0.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "0.0"+ "'", var19.equals("0.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("15", " h ", "0.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "15"+ "'", var3.equals("15"));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence)"10 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)"10 ", (java.lang.CharSequence)"AAAA");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 "+ "'", var2.equals("10 "));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3(" #a            ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " #a            "+ "'", var1.equals(" #a            "));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring(" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&", 5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,"+ "'", var3.equals("nof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,"));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern("", "1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence)"44a4444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


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
    int var20 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object)var19);
    long[] var21 = null;
    long[] var24 = new long[] { (-1L), 0L};
    boolean var25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var24);
    long[] var28 = org.apache.commons.lang3.ArrayUtils.subarray(var24, 100, 1);
    boolean var29 = org.apache.commons.lang3.ArrayUtils.isSameLength(var21, var24);
    long[] var30 = org.apache.commons.lang3.ArrayUtils.removeElements(var19, var24);
    int var32 = org.apache.commons.lang3.ArrayUtils.indexOf(var30, 0L);
    
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
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents(" #a            ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " #a            "+ "'", var1.equals(" #a            "));

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    char[] var0 = null;
    org.apache.commons.lang3.ArrayUtils.reverse(var0);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    char[] var5 = new char[] { 'a', ' ', 'a'};
    char[] var7 = org.apache.commons.lang3.ArrayUtils.remove(var5, 0);
    int var8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var7);
    char[] var9 = null;
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isSameLength(var7, var9);
    boolean var11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"  a", var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    java.lang.CharSequence[] var2 = new java.lang.CharSequence[] { ""};
    boolean var3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence)"10 1", var2);
    org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[])var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    org.apache.commons.lang3.text.translate.UnicodeEscaper var1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("0.0a10.0a10.0", 2, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    double[] var0 = null;
    java.lang.Double[] var1 = org.apache.commons.lang3.ArrayUtils.toObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    org.apache.commons.lang3.text.translate.UnicodeEscaper var0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
    org.apache.commons.lang3.text.translate.UnicodeUnescaper var1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    org.apache.commons.lang3.text.translate.CharSequenceTranslator[] var2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { var1};
    org.apache.commons.lang3.text.translate.CharSequenceTranslator var3 = var0.with(var2);
    org.apache.commons.lang3.text.translate.AggregateTranslator var4 = new org.apache.commons.lang3.text.translate.AggregateTranslator(var2);
    java.io.Writer var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var4.translate((java.lang.CharSequence)" #a            ", 19, var7);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaa# # #aaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "aaaaaaa# # #aaaaaaa"+ "'", var1.equals("aaaaaaa# # #aaaaaaa"));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("#A", 9, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "   #A    "+ "'", var3.equals("   #A    "));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var7 = org.apache.commons.lang3.ArrayUtils.add(var3, 0, 0.0d);
    double[] var11 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var11);
    double[] var14 = org.apache.commons.lang3.ArrayUtils.add(var11, 0.0d);
    boolean var15 = org.apache.commons.lang3.ArrayUtils.isEmpty(var11);
    double[] var18 = org.apache.commons.lang3.ArrayUtils.add(var11, 1, 100.0d);
    double[] var22 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var22);
    double[] var25 = org.apache.commons.lang3.ArrayUtils.add(var22, 0.0d);
    boolean var26 = org.apache.commons.lang3.ArrayUtils.isSameLength(var18, var25);
    double[] var30 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var30);
    double[] var34 = org.apache.commons.lang3.ArrayUtils.add(var30, 0, 0.0d);
    double[] var35 = org.apache.commons.lang3.ArrayUtils.addAll(var25, var30);
    double[] var38 = org.apache.commons.lang3.ArrayUtils.add(var30, 2, 100.0d);
    boolean var39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var30);
    boolean var40 = org.apache.commons.lang3.ArrayUtils.isSameLength(var7, var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var44 = org.apache.commons.lang3.StringUtils.join(var7, '#', 10, 15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    boolean[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"100", (java.lang.CharSequence)"aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean[] var7 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 0, 0);
    boolean var8 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    boolean[] var11 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 0, (-1));
    boolean[] var12 = org.apache.commons.lang3.ArrayUtils.clone(var11);
    boolean[] var13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var15 = org.apache.commons.lang3.ArrayUtils.remove(var13, 18);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    byte[] var0 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, (byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull("a# # #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a# # #a"+ "'", var1.equals("a# # #a"));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4("FFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFFFFFFF"+ "'", var1.equals("FFFFFFFF"));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"h          i          !", 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


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
      int var19 = var0.translate((java.lang.CharSequence)"AAAA", 18, var18);
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

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("100410041", 15, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100410041      "+ "'", var3.equals("100410041      "));

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.strip("041410410", "0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4141041"+ "'", var2.equals("4141041"));

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence)"-1a0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.leftPad("0.0", 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "      0.0"+ "'", var2.equals("      0.0"));

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    char[] var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substring("10110 110 110 1", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 110 110 1"+ "'", var2.equals("10 110 110 1"));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    boolean[] var0 = null;
    java.lang.Integer[] var2 = new java.lang.Integer[] { (-1)};
    int[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var2);
    int[] var6 = new int[] { 10, 1};
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var6);
    int[] var8 = null;
    int[] var9 = org.apache.commons.lang3.ArrayUtils.removeElements(var6, var8);
    java.lang.Integer[] var10 = org.apache.commons.lang3.ArrayUtils.toObject(var6);
    java.lang.String var12 = org.apache.commons.lang3.StringUtils.join(var6, ' ');
    int[] var13 = org.apache.commons.lang3.ArrayUtils.addAll(var3, var6);
    int[] var14 = org.apache.commons.lang3.ArrayUtils.clone(var6);
    java.lang.String var18 = org.apache.commons.lang3.StringUtils.join(var14, '#', 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean[] var19 = org.apache.commons.lang3.ArrayUtils.removeAll(var0, var14);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 1"+ "'", var12.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence)"#A", (java.lang.CharSequence)"{1}", 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern(" #A", "h i !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #A"+ "'", var2.equals(" #A"));

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaa# # #aaaaaaa1}aaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "aaaaaa}1aaaaaaa# # #aaaaaaa"+ "'", var1.equals("aaaaaa}1aaaaaaa# # #aaaaaaa"));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.split("          ");
    float[] var3 = new float[] { 10.0f};
    float[] var6 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 0, 100);
    float[] var8 = new float[] { 10.0f};
    float[] var11 = org.apache.commons.lang3.ArrayUtils.subarray(var8, 0, 100);
    java.lang.String var15 = org.apache.commons.lang3.StringUtils.join(var11, '#', 1, (-1));
    float[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var11);
    java.lang.String var18 = org.apache.commons.lang3.StringUtils.join(var3, 'a');
    java.lang.Object[] var19 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var1, (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10.0"+ "'", var18.equals("10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)"10 110 110 1", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("      0.0", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "      0.0 "+ "'", var2.equals("      0.0 "));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    long[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.right("", 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    java.lang.String var4 = org.apache.commons.lang3.StringUtils.replace("100#100#1", "", "0", 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100#100#1"+ "'", var4.equals("100#100#1"));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence)"101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0.0", "101", 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0.0"+ "'", var3.equals("0.0"));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("A", 0, " #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "A"+ "'", var3.equals("A"));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.difference("10.0", "aaaaaaa# # #aaaaaaa1}aaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaa# # #aaaaaaa1}aaaaaa"+ "'", var2.equals("aaaaaaa# # #aaaaaaa1}aaaaaa"));

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    long[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence)"110 110 110 110");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeCsv("FFFFFFFF");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "FFFFFFFF"+ "'", var1.equals("FFFFFFFF"));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence)"{{{{{{{{{{", (java.lang.CharSequence)"100#100#1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


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
    int var33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var30, 100.0d, 0.0d);
    double[] var36 = org.apache.commons.lang3.ArrayUtils.add(var30, 0, 100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var40 = org.apache.commons.lang3.StringUtils.join(var36, '#', 0, 19);
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
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.lowerCase("{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", var1);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"10#1", (java.lang.CharSequence)"-1a0", 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("h i !", "True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "h i !"+ "'", var2.equals("h i !"));

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence)"! i h", (java.lang.CharSequence)" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var7 = org.apache.commons.lang3.StringUtils.join(var3, ' ', 1, 0);
    boolean var8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    int[] var0 = null;
    int[] var1 = org.apache.commons.lang3.ArrayUtils.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    java.lang.String[] var1 = null;
    java.lang.String[] var5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" ", '4');
    boolean var6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence)"101", (java.lang.CharSequence[])var5);
    java.lang.String var7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", var1, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


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
    java.lang.Integer[] var29 = new java.lang.Integer[] { (-1)};
    int[] var30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var29);
    int[] var33 = new int[] { 10, 1};
    boolean var34 = org.apache.commons.lang3.ArrayUtils.isEmpty(var33);
    int[] var35 = null;
    int[] var36 = org.apache.commons.lang3.ArrayUtils.removeElements(var33, var35);
    java.lang.Integer[] var37 = org.apache.commons.lang3.ArrayUtils.toObject(var33);
    java.lang.String var39 = org.apache.commons.lang3.StringUtils.join(var33, ' ');
    int[] var40 = org.apache.commons.lang3.ArrayUtils.addAll(var30, var33);
    java.lang.Integer[] var42 = new java.lang.Integer[] { (-1)};
    int[] var43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var42);
    int[] var46 = new int[] { 10, 1};
    boolean var47 = org.apache.commons.lang3.ArrayUtils.isEmpty(var46);
    int[] var48 = null;
    int[] var49 = org.apache.commons.lang3.ArrayUtils.removeElements(var46, var48);
    boolean var50 = org.apache.commons.lang3.ArrayUtils.isSameLength(var43, var49);
    int[] var52 = org.apache.commons.lang3.ArrayUtils.remove(var49, 0);
    int[] var54 = org.apache.commons.lang3.ArrayUtils.add(var52, 100);
    int[] var55 = org.apache.commons.lang3.ArrayUtils.addAll(var30, var52);
    boolean var56 = org.apache.commons.lang3.ArrayUtils.isSameLength(var2, var55);
    int[] var58 = org.apache.commons.lang3.ArrayUtils.removeElement(var2, 2);
    int[] var61 = new int[] { 10, 1};
    boolean var62 = org.apache.commons.lang3.ArrayUtils.isEmpty(var61);
    java.lang.String var66 = org.apache.commons.lang3.StringUtils.join(var61, 'a', 2, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var67 = org.apache.commons.lang3.ArrayUtils.removeAll(var58, var61);
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "10 1"+ "'", var39.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    float[] var6 = new float[] { 10.0f};
    float[] var9 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var9, '#', 1, (-1));
    float[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var9);
    float[] var16 = org.apache.commons.lang3.ArrayUtils.removeElement(var9, 10.0f);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.contains(var16, 100.0f);
    org.apache.commons.lang3.ArrayUtils.reverse(var16);
    
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
    assertTrue(var18 == false);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("", 1, "      0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " "+ "'", var3.equals(" "));

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    long[] var0 = null;
    int var2 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence)"-1a10", (java.lang.CharSequence)"A#");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"100a1h          i          !", (java.lang.CharSequence)"aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.substringsBetween("A", "A#", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    float[] var6 = new float[] { 10.0f};
    float[] var9 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var9, '#', 1, (-1));
    float[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var9);
    float[] var16 = org.apache.commons.lang3.ArrayUtils.removeElement(var9, 10.0f);
    float[] var18 = new float[] { 10.0f};
    float[] var21 = org.apache.commons.lang3.ArrayUtils.subarray(var18, 0, 100);
    float[] var23 = new float[] { 10.0f};
    float[] var26 = org.apache.commons.lang3.ArrayUtils.subarray(var23, 0, 100);
    java.lang.String var30 = org.apache.commons.lang3.StringUtils.join(var26, '#', 1, (-1));
    float[] var31 = org.apache.commons.lang3.ArrayUtils.removeElements(var18, var26);
    float[] var32 = null;
    float[] var33 = org.apache.commons.lang3.ArrayUtils.removeElements(var18, var32);
    int var35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var33, 10.0f);
    boolean var36 = org.apache.commons.lang3.ArrayUtils.isSameLength(var9, var33);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    java.lang.CharSequence var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence)"{}", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence)" #A", "0.0 100.0 10.0 10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence)"{1}aaaaaa", (java.lang.CharSequence)"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    java.lang.Long[] var4 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.String[] var7 = new java.lang.String[] { "hi!"};
    java.lang.String[] var9 = new java.lang.String[] { "          "};
    java.lang.String var10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var7, var9);
    java.lang.String[] var11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var7);
    int var13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var4, (java.lang.Object)var7, 0);
    long[] var15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var4, 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var16 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[])var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "          "+ "'", var10.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "4141041");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    int[] var0 = null;
    boolean var2 = org.apache.commons.lang3.ArrayUtils.contains(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var30 = org.apache.commons.lang3.ArrayUtils.add(var24, 15, 0);
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

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var7 = org.apache.commons.lang3.ArrayUtils.add(var3, 0, 0.0d);
    boolean var9 = org.apache.commons.lang3.ArrayUtils.contains(var3, 100.0d);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var3);
    double[] var13 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 19, 3);
    int var15 = org.apache.commons.lang3.ArrayUtils.indexOf(var3, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100a1"+ "'", var1.equals("100a1"));

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    java.lang.Byte[] var1 = new java.lang.Byte[] { (byte)100};
    byte[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    byte[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1, (byte)100);
    boolean var5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("0.0", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0"+ "'", var2.equals("0.0"));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove(" #a", "100410041");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " #a"+ "'", var2.equals(" #a"));

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 0.0d};
    java.lang.Double[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    double[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int[] var6 = new int[] { 10, 1};
    boolean var7 = org.apache.commons.lang3.ArrayUtils.isEmpty(var6);
    int[] var8 = null;
    int[] var9 = org.apache.commons.lang3.ArrayUtils.removeElements(var6, var8);
    java.lang.Integer[] var10 = org.apache.commons.lang3.ArrayUtils.toObject(var6);
    int[] var13 = new int[] { 10, 1};
    boolean var14 = org.apache.commons.lang3.ArrayUtils.isEmpty(var13);
    int[] var15 = null;
    int[] var16 = org.apache.commons.lang3.ArrayUtils.removeElements(var13, var15);
    int[] var19 = new int[] { 10, 1};
    boolean var20 = org.apache.commons.lang3.ArrayUtils.isEmpty(var19);
    int[] var21 = null;
    int[] var22 = org.apache.commons.lang3.ArrayUtils.removeElements(var19, var21);
    java.lang.Integer[] var23 = org.apache.commons.lang3.ArrayUtils.toObject(var19);
    int[] var25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var23, 1);
    int[] var26 = org.apache.commons.lang3.ArrayUtils.removeElements(var15, var25);
    int var27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[])var10, (java.lang.Object)var15);
    int[] var29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var10, 4);
    java.lang.Object[] var30 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.Object[])var1, (java.lang.Object)4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var31 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object)4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("100#100#1", "{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100#100#1"+ "'", var3.equals("100#100#1"));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    char[] var5 = org.apache.commons.lang3.ArrayUtils.remove(var3, 0);
    int var8 = org.apache.commons.lang3.ArrayUtils.indexOf(var5, 'a', 1);
    java.lang.String var10 = org.apache.commons.lang3.StringUtils.join(var5, ' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var12 = org.apache.commons.lang3.ArrayUtils.remove(var5, 3);
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
    assertTrue("'" + var10 + "' != '" + "  a"+ "'", var10.equals("  a"));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.leftPad("true", 15, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaaaaaaaaaatrue"+ "'", var3.equals("aaaaaaaaaaatrue"));

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10 ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 "+ "'", var2.equals("10 "));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444a4444444", 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    long[] var2 = new long[] { 10L, (-1L)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var5 = org.apache.commons.lang3.ArrayUtils.add(var2, (-1), 10L);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }
// 
// 
//     org.apache.commons.lang3.text.translate.UnicodeEscaper var1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
//     java.lang.CharSequence var2 = null;
//     java.io.Writer var4 = null;
//     int var5 = var1.translate(var2, 15, var4);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    java.lang.Byte[] var1 = new java.lang.Byte[] { (byte)100};
    byte[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1, (byte)1);
    byte[] var7 = new byte[] { (byte)0, (byte)(-1), (byte)10};
    byte[] var11 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var15 = org.apache.commons.lang3.StringUtils.join(var11, ' ', 1, 0);
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isSameLength(var7, var11);
    boolean var17 = org.apache.commons.lang3.ArrayUtils.isSameLength(var3, var11);
    boolean var18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBefore("{0.0,100.0,10.0,10.0}", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence)"10 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }
// 
// 
//     java.lang.Byte[] var1 = new java.lang.Byte[] { (byte)100};
//     byte[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
//     java.lang.String var4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var1, "          ");
//     java.lang.Integer[] var6 = new java.lang.Integer[] { (-1)};
//     int[] var7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6);
//     int[] var10 = new int[] { 10, 1};
//     boolean var11 = org.apache.commons.lang3.ArrayUtils.isEmpty(var10);
//     int[] var12 = null;
//     int[] var13 = org.apache.commons.lang3.ArrayUtils.removeElements(var10, var12);
//     java.lang.Integer[] var14 = org.apache.commons.lang3.ArrayUtils.toObject(var10);
//     java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var10, ' ');
//     int[] var17 = org.apache.commons.lang3.ArrayUtils.addAll(var7, var10);
//     int[] var18 = org.apache.commons.lang3.ArrayUtils.clone(var10);
//     boolean var20 = org.apache.commons.lang3.ArrayUtils.contains(var10, 5);
//     int[] var21 = null;
//     int[] var22 = org.apache.commons.lang3.ArrayUtils.addAll(var10, var21);
//     java.lang.Object[] var23 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Object[])var1, var21);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0.0a10.0a10.0", "100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0a10.0a10.0"+ "'", var2.equals("0.0a10.0a10.0"));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 0.0d};
    java.lang.Double[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    double[] var4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1, 10.0d);
    java.lang.Object var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var7 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var1, 3, var6);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444a4444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4444444a4444444"+ "'", var1.equals("4444444a4444444"));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("   #A    ", 15, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "###   #A    ###"+ "'", var3.equals("###   #A    ###"));

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    java.lang.Short[] var1 = new java.lang.Short[] { (short)1};
    java.lang.Short[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    short[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var2);
    byte[] var8 = new byte[] { (byte)10, (byte)1, (byte)10};
    byte[] var9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var8);
    org.apache.commons.lang3.ArrayUtils.reverse(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var11 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[])var2, 100, (java.lang.Object)var9);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    java.lang.String[] var3 = org.apache.commons.lang3.StringUtils.split("hi!", "          ");
    java.lang.String[] var6 = new java.lang.String[] { "hi!"};
    java.lang.String[] var8 = new java.lang.String[] { "          "};
    java.lang.String var9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var6, var8);
    java.lang.String var10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(var6);
    java.lang.Object[] var11 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[])var6);
    java.lang.String[] var12 = org.apache.commons.lang3.StringUtils.stripAll(var6);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.replaceEach("a", var3, var12);
    java.lang.Object[] var14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[])var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "          "+ "'", var9.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    java.lang.CharSequence var1 = null;
    boolean var2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence)"          h          i          !          ", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 0.0d};
    java.lang.Double[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    double[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    java.lang.Double[] var4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var1, '4', 18, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.capitalize("True");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "True"+ "'", var1.equals("True"));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6, 1);
    java.lang.Object[] var9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[])var6);
    long[] var12 = new long[] { (-1L), 0L};
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var12);
    java.lang.Object[] var14 = new java.lang.Object[] { var13};
    java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var14, 'a');
    java.lang.Object[] var17 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var6, var14);
    long[] var20 = new long[] { (-1L), 0L};
    boolean var21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var20);
    java.lang.Long[] var22 = org.apache.commons.lang3.ArrayUtils.toObject(var20);
    java.lang.Object[] var23 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Object[])var22);
    long[] var25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var22, 0L);
    java.lang.String[] var28 = new java.lang.String[] { "hi!"};
    java.lang.String[] var30 = new java.lang.String[] { "          "};
    java.lang.String var31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var28, var30);
    boolean var32 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[])var22, (java.lang.Object[])var28);
    java.lang.Object[] var33 = org.apache.commons.lang3.ArrayUtils.removeElements(var17, (java.lang.Object[])var28);
    java.lang.Object[] var35 = org.apache.commons.lang3.ArrayUtils.removeElement(var33, (java.lang.Object)"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "true"+ "'", var16.equals("true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "          "+ "'", var31.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    long[] var3 = new long[] { 100L, 100L, 1L};
    long[] var5 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var8 = org.apache.commons.lang3.ArrayUtils.add(var5, 10, 0L);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence)"          h          i          !          ", (java.lang.CharSequence)"aaaaaaa# # #aaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripAccents("0.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0a10.0a10.0"+ "'", var1.equals("0.0a10.0a10.0"));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 0.0d};
    java.lang.Double[] var2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var1);
    double[] var3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var1);
    int var7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var3, 100.0d, 1, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var10 = org.apache.commons.lang3.ArrayUtils.add(var3, 9, 0.0d);
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
    assertTrue(var7 == (-1));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


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
    int var25 = org.apache.commons.lang3.ArrayUtils.indexOf(var22, 100L, 5);
    long[] var27 = org.apache.commons.lang3.ArrayUtils.removeElement(var22, 10L);
    boolean var29 = org.apache.commons.lang3.ArrayUtils.contains(var27, 1L);
    
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
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence)" #A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"4444444a4444444", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeEnd("  a", "-1a0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "  a"+ "'", var2.equals("  a"));

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("101 h101 i101 !101", 2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean[] var7 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 0, 0);
    boolean[] var9 = org.apache.commons.lang3.ArrayUtils.add(var3, true);
    boolean[] var12 = org.apache.commons.lang3.ArrayUtils.subarray(var9, 100, 1);
    boolean[] var15 = org.apache.commons.lang3.ArrayUtils.add(var9, 2, true);
    boolean var16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var15);
    boolean[] var17 = org.apache.commons.lang3.ArrayUtils.clone(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.left("0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0", 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0.0a100.0a10.0a10."+ "'", var2.equals("0.0a100.0a10.0a10."));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    java.lang.String var1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "F"+ "'", var1.equals("F"));

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean[] var7 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 0, 0);
    boolean[] var9 = org.apache.commons.lang3.ArrayUtils.add(var3, true);
    boolean[] var12 = org.apache.commons.lang3.ArrayUtils.subarray(var9, 100, 1);
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isEmpty(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.center("  a", 18, "{1}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{1}{1}{  a{1}{1}{1"+ "'", var3.equals("{1}{1}{  a{1}{1}{1"));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.escapeXml("-1a0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1a0"+ "'", var1.equals("-1a0"));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.reverse("101 H101 I101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " 101! 101I 101H 101"+ "'", var1.equals(" 101! 101I 101H 101"));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceOnce("0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0", "A#", "{0.0,100.0,10.0,10.0}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0"+ "'", var3.equals("0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0"));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    java.lang.CharSequence var1 = null;
    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"10 ", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence)".0", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"{0.0,100.0,10.0,10.0}", (java.lang.CharSequence)"100a1h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" #a", "101 h101 i101 !101 ");
    org.apache.commons.lang3.text.translate.UnicodeEscaper var3 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
    int var4 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[])var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = null;
    java.lang.Object[] var6 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Object[])var2, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("44a4444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "44a4444444"+ "'", var1.equals("44a4444444"));

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    java.lang.Byte[] var0 = null;
    byte[] var2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var0, (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    java.lang.String[] var1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence)"{}{}{}{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"100a1h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 28);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "{1}{1}{  a{1}{1}{1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)" #A", (java.lang.CharSequence)"Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.stripStart(" ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    float[] var1 = new float[] { 10.0f};
    float[] var4 = org.apache.commons.lang3.ArrayUtils.subarray(var1, 0, 100);
    float[] var6 = new float[] { 10.0f};
    float[] var9 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    java.lang.String var13 = org.apache.commons.lang3.StringUtils.join(var9, '#', 1, (-1));
    float[] var14 = org.apache.commons.lang3.ArrayUtils.removeElements(var1, var9);
    java.lang.String var16 = org.apache.commons.lang3.StringUtils.join(var1, 'a');
    int var19 = org.apache.commons.lang3.ArrayUtils.indexOf(var1, 10.0f, 28);
    
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
    assertTrue("'" + var16 + "' != '" + "10.0"+ "'", var16.equals("10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence)"  a", (java.lang.CharSequence)"a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0", var1);
// 
//   }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = org.apache.commons.lang3.StringUtils.join(var18, ' ', 28, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6, 1);
    java.lang.String var9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object)var6);
    
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
    assertTrue("'" + var9 + "' != '" + "{10,1}"+ "'", var9.equals("{10,1}"));

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    java.lang.String[] var4 = new java.lang.String[] { "          "};
    java.lang.String var5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", var2, var4);
    boolean var7 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[])var2, (java.lang.Object)' ');
    java.lang.String[] var8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var2);
    java.lang.String var10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[])var8, "     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          "+ "'", var5.equals("          "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removePattern("-1a0", "{1}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1a0"+ "'", var2.equals("-1a0"));

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"   #A    ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("0", "aaaa", "\\u0031");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.rightPad("A", 0, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "A"+ "'", var3.equals("A"));

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 10.0d};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var3);
    double[] var7 = org.apache.commons.lang3.ArrayUtils.add(var3, 0, 0.0d);
    boolean var9 = org.apache.commons.lang3.ArrayUtils.contains(var3, 100.0d);
    double[] var10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var3);
    int var14 = org.apache.commons.lang3.ArrayUtils.indexOf(var10, 10.0d, 2, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("-1a0", "h          i          !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1a0"+ "'", var2.equals("-1a0"));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    double[] var0 = null;
    boolean var1 = org.apache.commons.lang3.ArrayUtils.isEmpty(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    java.lang.String var8 = org.apache.commons.lang3.StringUtils.join(var2, ' ');
    int var10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var2, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 1"+ "'", var8.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToNull("! i h");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "! i h"+ "'", var1.equals("! i h"));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    java.lang.String[] var2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("101 h101 i101 !101 ", "0.0a100.0a10.0a10.0");
    java.lang.String[] var3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var4 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[])var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replaceChars("100#100#1", "10110 110 110 1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aaa#aaa#a"+ "'", var3.equals("aaa#aaa#a"));

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.remove("{1}aaaaaa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{1}"+ "'", var2.equals("{1}"));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var7 = org.apache.commons.lang3.StringUtils.join(var3, ' ', 1, 0);
    byte[] var9 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (byte)(-1));
    byte[] var10 = org.apache.commons.lang3.ArrayUtils.clone(var9);
    int var12 = org.apache.commons.lang3.ArrayUtils.indexOf(var10, (byte)100);
    boolean var13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = org.apache.commons.lang3.StringUtils.toString(var10, "a");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    java.lang.Iterable var0 = null;
    java.lang.String var2 = org.apache.commons.lang3.StringUtils.join(var0, "101 H101 I101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.lowerCase("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3(" #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " #a"+ "'", var1.equals(" #a"));

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    java.lang.CharSequence var2 = org.apache.commons.lang3.StringUtils.<java.lang.CharSequence>defaultIfEmpty((java.lang.CharSequence)" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&", (java.lang.CharSequence)"0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0####0.0a100.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&"+ "'", var2.equals(" \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,& \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&"));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    char[] var4 = new char[] { 'a', ' ', 'a'};
    char[] var6 = org.apache.commons.lang3.ArrayUtils.remove(var4, 0);
    int var7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var6);
    int var9 = org.apache.commons.lang3.ArrayUtils.indexOf(var6, '#');
    char[] var14 = new char[] { 'a', ' ', 'a'};
    char[] var16 = org.apache.commons.lang3.ArrayUtils.remove(var14, 0);
    int var17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var16);
    char[] var18 = null;
    boolean var19 = org.apache.commons.lang3.ArrayUtils.isSameLength(var16, var18);
    org.apache.commons.lang3.ArrayUtils.reverse(var16);
    java.lang.Character[] var21 = org.apache.commons.lang3.ArrayUtils.toObject(var16);
    char[] var23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var21, '4');
    char[] var25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var21, '#');
    char[] var29 = new char[] { 'a', ' ', 'a'};
    char[] var31 = org.apache.commons.lang3.ArrayUtils.remove(var29, 0);
    int var34 = org.apache.commons.lang3.ArrayUtils.indexOf(var31, 'a', 1);
    char[] var35 = org.apache.commons.lang3.ArrayUtils.removeElements(var25, var31);
    int var38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var31, '4', 1);
    boolean var39 = org.apache.commons.lang3.ArrayUtils.isSameLength(var6, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var41 = org.apache.commons.lang3.ArrayUtils.remove(var31, 4);
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
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.left("101 H101 I101 !101 ", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    java.lang.String var7 = org.apache.commons.lang3.StringUtils.join(var3, ' ', 1, 0);
    byte[] var9 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (byte)(-1));
    boolean var10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = org.apache.commons.lang3.StringUtils.toString(var9, "h          i          !");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.abbreviate("h i !", 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "h i !"+ "'", var2.equals("h i !"));

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("a", " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}", "0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToNull("101 h101 i101 !101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101 h101 i101 !101"+ "'", var1.equals("101 h101 i101 !101"));

  }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }
// 
// 
//     org.apache.commons.lang3.text.translate.UnicodeEscaper var1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
//     java.lang.String var3 = var1.translate((java.lang.CharSequence)"1");
//     java.io.Writer var5 = null;
//     boolean var6 = var1.translate(15, var5);
// 
//   }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.replacePattern("", "101 H101 I101 !101 ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    java.lang.String[][] var0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
    int[] var3 = new int[] { 10, 1};
    boolean var4 = org.apache.commons.lang3.ArrayUtils.isEmpty(var3);
    int[] var5 = null;
    int[] var6 = org.apache.commons.lang3.ArrayUtils.removeElements(var3, var5);
    java.lang.Integer[] var7 = org.apache.commons.lang3.ArrayUtils.toObject(var3);
    int[] var9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var7, 1);
    java.lang.Object[] var10 = org.apache.commons.lang3.ArrayUtils.removeElements((java.lang.Object[])var0, (java.lang.Object[])var7);
    int[] var11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var7);
    int[] var13 = org.apache.commons.lang3.ArrayUtils.add(var11, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var15 = org.apache.commons.lang3.ArrayUtils.remove(var13, 28);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.trimToEmpty("101");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "101"+ "'", var1.equals("101"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    char[] var0 = null;
    java.lang.String var4 = org.apache.commons.lang3.StringUtils.join(var0, 'a', 3, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("15", " \u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "15"+ "'", var2.equals("15"));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    char[] var5 = org.apache.commons.lang3.ArrayUtils.remove(var3, 0);
    int var8 = org.apache.commons.lang3.ArrayUtils.indexOf(var3, ' ', 1);
    char[] var11 = org.apache.commons.lang3.ArrayUtils.subarray(var3, 15, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var14 = org.apache.commons.lang3.ArrayUtils.add(var11, 1, ' ');
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
    assertNotNull(var11);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    char[] var5 = org.apache.commons.lang3.ArrayUtils.remove(var3, 0);
    int var8 = org.apache.commons.lang3.ArrayUtils.indexOf(var5, 'a', 1);
    java.lang.String var10 = org.apache.commons.lang3.StringUtils.join(var5, '#');
    char[] var13 = org.apache.commons.lang3.ArrayUtils.subarray(var5, 9, 10);
    char[] var18 = new char[] { 'a', ' ', 'a'};
    char[] var20 = org.apache.commons.lang3.ArrayUtils.remove(var18, 0);
    int var21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var20);
    java.lang.String var25 = org.apache.commons.lang3.StringUtils.join(var20, 'a', 0, 0);
    char[] var30 = new char[] { 'a', ' ', 'a'};
    char[] var32 = org.apache.commons.lang3.ArrayUtils.remove(var30, 0);
    int var33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"hi!", var32);
    int var35 = org.apache.commons.lang3.ArrayUtils.indexOf(var32, '#');
    int var37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var32, ' ');
    boolean var38 = org.apache.commons.lang3.ArrayUtils.isSameLength(var20, var32);
    java.lang.Character[] var39 = org.apache.commons.lang3.ArrayUtils.toObject(var20);
    char[] var40 = org.apache.commons.lang3.ArrayUtils.removeElements(var5, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var43 = org.apache.commons.lang3.ArrayUtils.add(var40, 28, 'a');
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
    assertTrue("'" + var10 + "' != '" + " #a"+ "'", var10.equals(" #a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    java.lang.CharSequence var0 = null;
    boolean var1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"101 h101 i101 !101", 19, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("{10,1}", 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{10,1}            "+ "'", var2.equals("{10,1}            "));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


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
      long[] var16 = org.apache.commons.lang3.ArrayUtils.add(var10, 19, 0L);
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

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = org.apache.commons.lang3.ArrayUtils.clone(var2);
    int[] var5 = org.apache.commons.lang3.ArrayUtils.clone(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence)"A", "-1a10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    java.lang.CharSequence var0 = null;
    int var3 = org.apache.commons.lang3.StringUtils.lastIndexOf(var0, (java.lang.CharSequence)"aaaaaaa# # #aaaaaaa1}aaaaaa", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.String var2 = org.apache.commons.lang3.StringUtils.upperCase("4141041", var1);
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substringBetween("15", "0.0 100.0 10.0 10.0", "10041");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    int[] var2 = new int[] { 10, 1};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isEmpty(var2);
    int[] var4 = null;
    int[] var5 = org.apache.commons.lang3.ArrayUtils.removeElements(var2, var4);
    java.lang.Integer[] var6 = org.apache.commons.lang3.ArrayUtils.toObject(var2);
    int[] var8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6, 1);
    boolean var9 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[])var6);
    int[] var10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var6);
    boolean var12 = org.apache.commons.lang3.ArrayUtils.contains(var10, 0);
    int[] var13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var10);
    int[] var14 = null;
    int[] var15 = org.apache.commons.lang3.ArrayUtils.addAll(var10, var14);
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence)"aaaaaaa# # #aaaaaaa", (java.lang.CharSequence)"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence)"{1}aaaaaa", "aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    long[] var3 = new long[] { 100L, 100L, 1L};
    long[] var5 = org.apache.commons.lang3.ArrayUtils.removeElement(var3, (-1L));
    int var8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(var3, 1L, 28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    java.lang.String var1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "64"+ "'", var1.equals("64"));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


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
    int var20 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object)var19);
    long[] var21 = null;
    long[] var24 = new long[] { (-1L), 0L};
    boolean var25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var24);
    long[] var28 = org.apache.commons.lang3.ArrayUtils.subarray(var24, 100, 1);
    boolean var29 = org.apache.commons.lang3.ArrayUtils.isSameLength(var21, var24);
    long[] var30 = org.apache.commons.lang3.ArrayUtils.removeElements(var19, var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var34 = org.apache.commons.lang3.StringUtils.join(var30, 'a', 0, 28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.mid("101", 2, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    short[] var0 = null;
    int var3 = org.apache.commons.lang3.ArrayUtils.indexOf(var0, (short)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    int var1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence)"F");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence)"-1#0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"-1a0", (java.lang.CharSequence)"h i !");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = org.apache.commons.lang3.StringUtils.join(var2, ' ', 7, 9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    java.lang.CharSequence var0 = null;
    boolean var1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    int var3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence)"10.0", (java.lang.CharSequence)"         ", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToNull("100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    int var2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence)"15", (java.lang.CharSequence)"aaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    java.lang.String var1 = org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript("10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4141041");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4141041"+ "'", var1.equals("4141041"));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    boolean[] var0 = null;
    java.lang.Boolean[] var1 = org.apache.commons.lang3.ArrayUtils.toObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"100a1", (java.lang.CharSequence)" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    java.lang.String var1 = org.apache.commons.lang3.StringUtils.chop("a# # #a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a# # #"+ "'", var1.equals("a# # #"));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence)"100a1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence)"0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0####0.0a.0a10.0a10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    java.lang.String var3 = org.apache.commons.lang3.StringUtils.substring("####", 4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence)"aaaaaaa# # #aaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    org.apache.commons.lang3.text.translate.UnicodeUnescaper var0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    java.io.Writer var3 = null;
    int var4 = var0.translate((java.lang.CharSequence)"####", 2, var3);
    java.io.Writer var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.translate((java.lang.CharSequence)"hi!", 19, var7);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    boolean var2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence)"aaa#aaa#a", (java.lang.CharSequence)"101 H101 I101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("", "101 h101 i101 !101 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    org.apache.commons.lang3.text.translate.UnicodeUnescaper var0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
    java.io.Writer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.translate((java.lang.CharSequence)"   #A    ", 9, var3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    boolean var1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence)"   #A    ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.removeStart("10 ", "{{\u0192,&fnof;},{\u0391,&Alpha;},{\u0392,&Beta;},{\u0393,&Gamma;},{\u0394,&Delta;},{\u0395,&Epsilon;},{\u0396,&Zeta;},{\u0397,&Eta;},{\u0398,&Theta;},{\u0399,&Iota;},{\u039A,&Kappa;},{\u039B,&Lambda;},{\u039C,&Mu;},{\u039D,&Nu;},{\u039E,&Xi;},{\u039F,&Omicron;},{\u03A0,&Pi;},{\u03A1,&Rho;},{\u03A3,&Sigma;},{\u03A4,&Tau;},{\u03A5,&Upsilon;},{\u03A6,&Phi;},{\u03A7,&Chi;},{\u03A8,&Psi;},{\u03A9,&Omega;},{\u03B1,&alpha;},{\u03B2,&beta;},{\u03B3,&gamma;},{\u03B4,&delta;},{\u03B5,&epsilon;},{\u03B6,&zeta;},{\u03B7,&eta;},{\u03B8,&theta;},{\u03B9,&iota;},{\u03BA,&kappa;},{\u03BB,&lambda;},{\u03BC,&mu;},{\u03BD,&nu;},{\u03BE,&xi;},{\u03BF,&omicron;},{\u03C0,&pi;},{\u03C1,&rho;},{\u03C2,&sigmaf;},{\u03C3,&sigma;},{\u03C4,&tau;},{\u03C5,&upsilon;},{\u03C6,&phi;},{\u03C7,&chi;},{\u03C8,&psi;},{\u03C9,&omega;},{\u03D1,&thetasym;},{\u03D2,&upsih;},{\u03D6,&piv;},{\u2022,&bull;},{\u2026,&hellip;},{\u2032,&prime;},{\u2033,&Prime;},{\u203E,&oline;},{\u2044,&frasl;},{\u2118,&weierp;},{\u2111,&image;},{\u211C,&real;},{\u2122,&trade;},{\u2135,&alefsym;},{\u2190,&larr;},{\u2191,&uarr;},{\u2192,&rarr;},{\u2193,&darr;},{\u2194,&harr;},{\u21B5,&crarr;},{\u21D0,&lArr;},{\u21D1,&uArr;},{\u21D2,&rArr;},{\u21D3,&dArr;},{\u21D4,&hArr;},{\u2200,&forall;},{\u2202,&part;},{\u2203,&exist;},{\u2205,&empty;},{\u2207,&nabla;},{\u2208,&isin;},{\u2209,&notin;},{\u220B,&ni;},{\u220F,&prod;},{\u2211,&sum;},{\u2212,&minus;},{\u2217,&lowast;},{\u221A,&radic;},{\u221D,&prop;},{\u221E,&infin;},{\u2220,&ang;},{\u2227,&and;},{\u2228,&or;},{\u2229,&cap;},{\u222A,&cup;},{\u222B,&int;},{\u2234,&there4;},{\u223C,&sim;},{\u2245,&cong;},{\u2248,&asymp;},{\u2260,&ne;},{\u2261,&equiv;},{\u2264,&le;},{\u2265,&ge;},{\u2282,&sub;},{\u2283,&sup;},{\u2286,&sube;},{\u2287,&supe;},{\u2295,&oplus;},{\u2297,&otimes;},{\u22A5,&perp;},{\u22C5,&sdot;},{\u2308,&lceil;},{\u2309,&rceil;},{\u230A,&lfloor;},{\u230B,&rfloor;},{\u2329,&lang;},{\u232A,&rang;},{\u25CA,&loz;},{\u2660,&spades;},{\u2663,&clubs;},{\u2665,&hearts;},{\u2666,&diams;},{\u0152,&OElig;},{\u0153,&oelig;},{\u0160,&Scaron;},{\u0161,&scaron;},{\u0178,&Yuml;},{\u02C6,&circ;},{\u02DC,&tilde;},{\u2002,&ensp;},{\u2003,&emsp;},{\u2009,&thinsp;},{\u200C,&zwnj;},{\u200D,&zwj;},{\u200E,&lrm;},{\u200F,&rlm;},{\u2013,&ndash;},{\u2014,&mdash;},{\u2018,&lsquo;},{\u2019,&rsquo;},{\u201A,&sbquo;},{\u201C,&ldquo;},{\u201D,&rdquo;},{\u201E,&bdquo;},{\u2020,&dagger;},{\u2021,&Dagger;},{\u2030,&permil;},{\u2039,&lsaquo;},{\u203A,&rsaquo;},{\u20AC,&euro;}}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 "+ "'", var2.equals("10 "));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    int var2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence)"h          i          !", (java.lang.CharSequence)"10110 110 110 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.defaultString("AAAA", " 4a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "AAAA"+ "'", var2.equals("AAAA"));

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


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
    java.lang.Long[] var23 = org.apache.commons.lang3.ArrayUtils.toObject(var19);
    java.lang.Integer[] var25 = new java.lang.Integer[] { (-1)};
    int[] var26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var25);
    int[] var29 = new int[] { 10, 1};
    boolean var30 = org.apache.commons.lang3.ArrayUtils.isEmpty(var29);
    int[] var31 = null;
    int[] var32 = org.apache.commons.lang3.ArrayUtils.removeElements(var29, var31);
    boolean var33 = org.apache.commons.lang3.ArrayUtils.isSameLength(var26, var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long[] var34 = org.apache.commons.lang3.ArrayUtils.removeAll(var19, var32);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    long[] var2 = new long[] { (-1L), 0L};
    boolean var3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(var2);
    long[] var6 = org.apache.commons.lang3.ArrayUtils.subarray(var2, 100, 1);
    java.lang.Object[] var7 = new java.lang.Object[] { var2};
    short[] var11 = new short[] { (short)10, (short)(-1), (short)(-1)};
    short[] var12 = org.apache.commons.lang3.ArrayUtils.clone(var11);
    int var13 = org.apache.commons.lang3.ArrayUtils.indexOf(var7, (java.lang.Object)var11);
    short[] var14 = org.apache.commons.lang3.ArrayUtils.clone(var11);
    short[] var17 = org.apache.commons.lang3.ArrayUtils.add(var11, 1, (short)1);
    java.lang.Short[] var18 = org.apache.commons.lang3.ArrayUtils.toObject(var17);
    java.lang.Short[] var19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var18);
    java.lang.Short[] var20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(var18);
    java.lang.Integer[] var22 = new java.lang.Integer[] { (-1)};
    int[] var23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(var22);
    int[] var26 = new int[] { 10, 1};
    boolean var27 = org.apache.commons.lang3.ArrayUtils.isEmpty(var26);
    int[] var28 = null;
    int[] var29 = org.apache.commons.lang3.ArrayUtils.removeElements(var26, var28);
    java.lang.Integer[] var30 = org.apache.commons.lang3.ArrayUtils.toObject(var26);
    java.lang.String var32 = org.apache.commons.lang3.StringUtils.join(var26, ' ');
    int[] var33 = org.apache.commons.lang3.ArrayUtils.addAll(var23, var26);
    int[] var34 = org.apache.commons.lang3.ArrayUtils.clone(var26);
    java.lang.String var38 = org.apache.commons.lang3.StringUtils.join(var34, '#', 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var39 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Object[])var18, var34);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "10 1"+ "'", var32.equals("10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    java.lang.String var2 = org.apache.commons.lang3.StringUtils.rightPad("F", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "F"+ "'", var2.equals("F"));

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    boolean[] var3 = new boolean[] { true, false, true};
    org.apache.commons.lang3.ArrayUtils.reverse(var3);
    boolean[] var6 = org.apache.commons.lang3.ArrayUtils.add(var3, false);
    boolean[] var7 = org.apache.commons.lang3.ArrayUtils.clone(var6);
    boolean var8 = org.apache.commons.lang3.ArrayUtils.isEmpty(var6);
    boolean[] var9 = org.apache.commons.lang3.ArrayUtils.clone(var6);
    boolean[] var12 = org.apache.commons.lang3.ArrayUtils.subarray(var6, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    /