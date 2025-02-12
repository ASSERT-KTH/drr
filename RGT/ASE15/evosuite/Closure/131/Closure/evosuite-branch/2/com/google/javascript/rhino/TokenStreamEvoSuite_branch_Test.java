/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:57:56 GMT 2014
 */

package com.google.javascript.rhino;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.TokenStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class TokenStreamEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = "OYDDI,";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "null";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "[cV";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "?]Lvg5";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "HVbn (I1{";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "tc-+gwT69B";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "imp_eme@bs";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "transient";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "protected";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "inier1ace";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "oY jCE/ ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "finallAy";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "debugger";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "ce)muMy/";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "volatile";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "pv\\+*Z;";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "extends";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "boolean";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "finally";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "default";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = "package";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = "return";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String string0 = "delet{";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = "GNN)jF";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = "typeof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = "export";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      String string0 = "switch";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = "-v=WL5";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String string0 = "public";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      String string0 = "mtN#6_";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String string0 = "`s1*?9";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      String string0 = ">rf|t ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = "zqg!{C";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = "epaulX";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      String string0 = "double";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = "inally";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = "import";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = "hk2EA4";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = "Xj4&cx";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      String string0 = "?iedFa";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = "thro}s";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = "_g\"f,]";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      String string0 = "Ofalse";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = "ge}\\pr";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = "?d1gT=";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      String string0 = "ac{P6&";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      String string0 = "^bL;6 ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      String string0 = "native";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      String string0 = "xloaE";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = "short";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String string0 = "FznK!";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = "const";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      String string0 = "JoFLQ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      String string0 = "retun";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      String string0 = "/*sN>";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      String string0 = ")Pr 7";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = "s7q^q";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      String string0 = "super";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      String string0 = "final";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      String string0 = "QNm]g";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String string0 = "false";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = "VTk}F";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = "?XjX$";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = "while";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = "U6hWM";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = "yagx2";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = "dlfau";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "break";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = "JEdN@";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "_6ctV";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "\"[bps";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "float";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "elee";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "c`7r";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "c`3f";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "5iD}";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "wc]m";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "void";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "ueLr";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "teof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "sF?(";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "rxyD";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "qq@w";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "p'gX";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "o]kM";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "null";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "mX~W";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "long";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "kG24";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "jzG";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = "i!$h";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "h^he";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = "goto";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "fj%}";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "eR}u";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = "dp{|";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "byte";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = "tCy";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "vo0";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = "t*k";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = "nG^";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = "iD{";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "fas";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = "eo";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "in";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = "tn";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = "jf";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = "NZ0tQ\\!JEPp";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = "='$VeaD[r3T";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = "instanceof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = "abstract";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = "sre<54!";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = "cla,ss";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = "class";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = "c<te";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = "[cV";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = "HVbn (I1{";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = "^>";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TokenStream tokenStream0 = new TokenStream();
      assertNotNull(tokenStream0);
  }
}
