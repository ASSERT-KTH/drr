/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 03:27:51 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class FastMath_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      double double0 = FastMath.asinh(0.2499999997677497);
      assertEquals(0.24746646132194766, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double double0 = FastMath.toRadians((-198.91));
      assertEquals((-3.4716344151419207), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = FastMath.ulp(1.1730463525082348E-7);
      assertEquals(1.3234889800848443E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = FastMath.cos(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      long long0 = FastMath.round(5.261908426442558E-7);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = FastMath.round(1.0F);
      assertEquals(1, int0);
  }

//  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = FastMath.atan(3520);
      assertEquals(1.5705122358934485, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = FastMath.acosh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      double double0 = FastMath.nextUp(3520);
      assertEquals(3520.0000000000005, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double double0 = FastMath.cosh(14.136832902969902);
      assertEquals(689475.0034545574, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = FastMath.cosh(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = FastMath.cosh(32.10582739339);
      assertEquals(4.388879713209137E13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = FastMath.cosh((-2729.4965517347));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      double double0 = FastMath.cosh((-1.0F));
      assertEquals(1.5430806348152437, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      double double0 = FastMath.sinh(1663.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = FastMath.sinh(2.3608884526143124E-8);
      assertEquals(2.3608884526143127E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = FastMath.sinh((-2047.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = FastMath.sinh((-18.457971236441537));
      assertEquals((-5.189972533271694E7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = FastMath.tanh(1303.7327);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = FastMath.tanh((-2336.732446608));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      double double0 = FastMath.tanh((-0.05417713522911072));
      assertEquals((-0.05412419116547036), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = FastMath.tanh(5.041915256481364);
      assertEquals(0.9999165051062541, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = FastMath.asinh((-3.141592653589793));
      assertEquals((-1.8622957433108482), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = FastMath.asinh(3.4620039155736807E-7);
      assertEquals(3.4620039155736113E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = FastMath.asinh(0.14285714285714285);
      assertEquals(0.14237564316780438, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = FastMath.asinh(0.058823529411764705);
      assertEquals(0.058789658521402235, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = FastMath.asinh(0.008333333333329196);
      assertEquals(0.008333236885725868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = FastMath.atanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double double0 = FastMath.atanh(0.1428571343421936);
      assertEquals(0.14384102753354644, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double double0 = FastMath.atanh(0.06136966806296879);
      assertEquals(0.061446886853699575, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = FastMath.atanh(0.008336750013465571);
      assertEquals(0.008336943160121329, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = FastMath.signum(0.8775825500488281);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = FastMath.signum((-2404.231063));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = FastMath.signum(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = FastMath.pow((-1236.395729), (-386));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double double0 = FastMath.exp((-740L));
      assertEquals(4.2E-322, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double double0 = FastMath.pow(0.5403023058681398, 1152.614149342771);
      assertEquals(6.814231264631473E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double double0 = FastMath.expm1(4513.3219263539795);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double double0 = FastMath.expm1(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double double0 = FastMath.expm1((-1.2246467991473532E-16));
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = FastMath.atanh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = FastMath.log(-0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double double0 = FastMath.log1p((-386));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 1396.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = FastMath.acosh(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = FastMath.log1p(1.0);
      assertEquals(0.6931471805599453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double double0 = FastMath.pow(113236205062349959L, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 0.99);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-881));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1.2407979368823836));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-868));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 0.7969718115930393);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 3294198.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 0.041666666666666664);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-0.1666666567325592));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double double0 = FastMath.pow((-656.86668123), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double double0 = FastMath.pow((-0.5889935012260539), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 0.49999999999999994);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-2376.454));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-2397.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-868.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 555);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 530);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = FastMath.pow(619.3429, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = FastMath.pow((-4.9E-324), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), 1.633123935319537E16);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = FastMath.pow((-2892.9938), (-4.503599627370496E15));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = FastMath.pow((-3367.05), (-2643.0525256));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), 1);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = FastMath.pow(1713.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = FastMath.pow(721.096155497, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = FastMath.sin(5.261908426442558E-7);
      assertEquals(5.261908426442315E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = FastMath.tan(8.049811654094134);
      assertEquals((-5.041025199400424), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = FastMath.sin((-9.332331908520372E18));
      assertEquals(0.639113652976922, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = FastMath.sin(8.0E298);
      assertEquals(0.042338395486962485, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = FastMath.tan((-1.37575208327034675E18));
      assertEquals((-0.20162437746447717), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = FastMath.sin((-5283443.238218137));
      assertEquals((-0.6272406122040909), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = FastMath.cos(5283461.831832344);
      assertEquals(0.9122456207495536, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = FastMath.cos(1.61048166E9F);
      assertEquals((-0.8624613273574877), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = FastMath.tan(1.1729245859999998E9);
      assertEquals(11.26997686507483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = FastMath.sin((-480.033863179));
      assertEquals((-0.5889935012260539), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = FastMath.cos((-1757.083013254));
      assertEquals((-0.5956514497191718), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      double double0 = FastMath.cos((-735.0));
      assertEquals(0.9912107893779389, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double double0 = FastMath.tan(0.9912107893779389);
      assertEquals(1.527705923101875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = FastMath.atan2(20.0, 9.832443508779437E-17);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      double double0 = FastMath.atan2((-1.6577769360677824E22), 0.7035595658419141);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0), 1.633123935319537E16);
      assertEquals((-6.123233995736766E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      double double0 = FastMath.atan2((-4677.2), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-1.5707963267948966));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, 3.940510424527919E-20);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1170.5461165780744));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 5.964080503363963);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      double double0 = FastMath.atan2((-0.1666666567325592), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      double double0 = FastMath.atan2(307.8956230822249, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      double double0 = FastMath.atan2((-4047.030469374548), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      double double0 = FastMath.atan2((-6.032174644509064E-23), 0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      double double0 = FastMath.atan2(2.091052705683212, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      double double0 = FastMath.atan2(1.0, 1.0185916357881302E299);
      assertEquals(9.817477042468104E-300, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      double double0 = FastMath.atan2(0.5658777362720316, (-2.5296487279267212E299));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      double double0 = FastMath.asin(619.3429);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      double double0 = FastMath.asin((-2.2805288177061128E14));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      double double0 = FastMath.asin(3.4620039155736807E-7);
      assertEquals(3.46200391557375E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      double double0 = FastMath.acos(1.1730463525082348E-7);
      assertEquals(1.5707962094902614, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      double double0 = FastMath.acos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      double double0 = FastMath.acos((-2459.48952));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      double double0 = FastMath.acos(0L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      double double0 = FastMath.acos((-0.7109738706064436));
      assertEquals(2.361678444825543, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      double double0 = FastMath.cbrt((-2132.3190486));
      assertEquals((-12.871151302278331), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      double double0 = FastMath.cbrt(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      int int0 = FastMath.abs(3125);
      assertEquals(3125, int0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      int int0 = FastMath.abs((-2339));
      assertEquals(2339, int0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      long long0 = FastMath.abs((-969L));
      assertEquals(969L, long0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      float float0 = FastMath.abs((-1107.2522F));
      assertEquals(1107.2522F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      double double0 = FastMath.abs(1180.871802241779);
      assertEquals(1180.871802241779, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 634.1999637);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.06436385102666196);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      double double0 = FastMath.nextAfter(-0.0, (-1.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      double double0 = FastMath.nextUp(0.0);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      double double0 = FastMath.nextAfter(337.98753490577417, 0.058823529411764705);
      assertEquals(337.9875349057741, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      double double0 = FastMath.nextAfter((-0.9999999999999999), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.0, 0.19999954120254515);
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      double double0 = FastMath.rint(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      double double0 = FastMath.ceil(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      long long0 = FastMath.round(Double.NEGATIVE_INFINITY);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      double double0 = FastMath.rint((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      double double0 = FastMath.ceil(1.2331016983979697);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      double double0 = FastMath.ceil((-4.469603409122654E-6));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      double double0 = FastMath.rint((-5878.14092722));
      assertEquals((-5878.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      double double0 = FastMath.rint(1.5);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      int int0 = FastMath.min(1056788253, 2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      int int0 = FastMath.min(64, 64);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      long long0 = FastMath.min(1030L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      long long0 = FastMath.min(0L, 1149L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      float float0 = FastMath.min((float) 1713, 668.14F);
      assertEquals(668.14F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      float float0 = FastMath.min(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      double double0 = FastMath.min(3686.5, 0.8109631538391113);
      assertEquals(0.8109631538391113, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      double double0 = FastMath.min(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (-1.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      int int0 = FastMath.max(753287405, (-1179));
      assertEquals(753287405, int0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      int int0 = FastMath.max((-2339), 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      long long0 = FastMath.max(0L, (-160L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      long long0 = FastMath.max(812L, 812L);
      assertEquals(812L, long0);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      float float0 = FastMath.max(1.0F, 0.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      float float0 = FastMath.max((float) 0L, (float) 1);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      float float0 = FastMath.max((-901.85046F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      double double0 = FastMath.max(1.1730463525082348E-7, (-1558.1553366469113));
      assertEquals(1.1730463525082348E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      double double0 = FastMath.max(0.4342944622039795, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      double double0 = FastMath.max((-137.0), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
