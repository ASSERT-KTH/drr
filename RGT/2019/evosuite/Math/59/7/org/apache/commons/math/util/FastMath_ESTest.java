/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 03:05:17 GMT 2019
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
      double double0 = FastMath.acos(5.669184079525E-24);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1640.101));
      assertEquals((-93970.86527518583), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = FastMath.ulp(1580.3551508815);
      assertEquals(2.2737367544323206E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = FastMath.sin(0.875);
      assertEquals(0.7675435022360271, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = FastMath.round((-2048.0F));
      assertEquals((-2048), int0);
  }

//  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = FastMath.cosh((-532.4268163063695));
      assertEquals(8.491772360877413E230, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = FastMath.atan((-1538.0));
      assertEquals((-1.5701461318280032), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double double0 = FastMath.cosh(76.11517);
      assertEquals(5.693355787532914E32, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = FastMath.cosh((-1.0));
      assertEquals(1.5430806348152437, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = FastMath.cosh(0.19454771280288696);
      assertEquals(1.018984170493248, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = FastMath.sinh(1324.2258214484202);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      double double0 = FastMath.sinh((-85.95104273851));
      assertEquals((-1.0642253005811493E37), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = FastMath.sinh(0.5403022766113281);
      assertEquals(0.566976760750662, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = FastMath.sinh(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = FastMath.sinh((-0.02976064528098811));
      assertEquals((-0.02976503862299307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = FastMath.tanh(0.9315964599440725);
      assertEquals(0.7313373499316717, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      double double0 = FastMath.tanh(491.299028443);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double double0 = FastMath.tanh((-4273));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = FastMath.tanh((-0.016472379144251176));
      assertEquals((-0.016470889438134236), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      double double0 = FastMath.asinh(1185.9997164405);
      assertEquals(7.771488698762718, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = FastMath.asinh((-0.016470889438134236));
      assertEquals((-0.016470144797224945), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = FastMath.asinh(0.10526403784751892);
      assertEquals(0.10507060413752747, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = FastMath.asinh(0.07834223130580949);
      assertEquals(0.07826231418884746, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = FastMath.atanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = FastMath.atanh(0.09647698591534888);
      assertEquals(0.09677799855284619, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = FastMath.atanh(0.031009936063096846);
      assertEquals(0.031019881687002027, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double double0 = FastMath.signum(2484.106);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = FastMath.signum((-5511.62));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = FastMath.expm1((-1321.005843));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = FastMath.exp((-1.0));
      assertEquals(0.36787944117144233, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 0.9999999999999977);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double double0 = FastMath.expm1((-744.029592152));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double double0 = FastMath.pow(0.7815385335850918, 2876.6022794036335);
      assertEquals(1.1504405858256656E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double double0 = FastMath.expm1(2541);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double double0 = FastMath.expm1((-0.05417713522911072));
      assertEquals((-0.05273570223859513), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double double0 = FastMath.acosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = FastMath.log(-0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = FastMath.log1p((-4273));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double double0 = FastMath.atanh((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double double0 = FastMath.log10(0.0F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = FastMath.atanh(0.25736000643127993);
      assertEquals(0.263279086225664, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = FastMath.log10(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      double double0 = FastMath.log1p(0.7853981633974483);
      assertEquals(0.5796414510841191, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double double0 = FastMath.log1p(3.410491133089812E-7);
      assertEquals(3.410490551517456E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = FastMath.pow((-2340.78489438569), 0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 1.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 2.718281828459045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1.5709777616523481));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-700));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 2.85040095144011776E17);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 1.5774012453280881);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-89.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double double0 = FastMath.pow((-3045.388108452), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double double0 = FastMath.pow((-0.4855348677422206), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 595.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1612.78));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-2142751042));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 0.9023552334539984);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 4.503599627370496E15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = FastMath.pow(1.5, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = FastMath.pow((-0.8048177824611888), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = FastMath.pow((-398.71953439), 1583.446338902);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = FastMath.pow((-18.457971236441537), 8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double double0 = FastMath.pow((-4680.7376), (-4.503599627370496E15));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = FastMath.pow((-2340.78489438569), 19L);
      assertEquals((-1.0420021561084864E64), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = FastMath.pow((-16), 8);
      assertEquals(4.294967296E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = FastMath.pow(2083.0, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = FastMath.tan((-0.9854595087020511));
      assertEquals((-1.5086986062602172), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = FastMath.tan(7.386729717774709E15);
      assertEquals((-0.6760643808027943), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = FastMath.tan(2.156744471485179E38);
      assertEquals((-1.113862486889557), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = FastMath.tan((-5626025.7009722));
      assertEquals(3.059894909905242, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = FastMath.cos((-1.0642253005811493E37));
      assertEquals(0.23245856400948067, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = FastMath.sin((-1087346408));
      assertEquals(0.9212536500763898, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = FastMath.sin(1003734390);
      assertEquals((-0.982084502778963), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = FastMath.tan(2.932443165507508E132);
      assertEquals(3.8490576581513847, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = FastMath.sin(879.0);
      assertEquals((-0.6019517262811898), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = FastMath.cos(0.1);
      assertEquals(0.9950041652780258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = FastMath.cos(3196.08437454);
      assertEquals((-0.46722585825412616), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      double double0 = FastMath.tan((-1259.69441534));
      assertEquals(0.08443857413100744, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double double0 = FastMath.atan2((-1644), (-1.6746370513529506E-18));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = FastMath.atan2(2.718281828459045, (-3094.65703));
      assertEquals(3.1407142747894894, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      double double0 = FastMath.atan2(0.9305076599121094, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 1.5774012453280881);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-830.9));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, (-1148.3152770300153));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-1410.93913978));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      double double0 = FastMath.atan2((-700), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      double double0 = FastMath.atan2(0.7815385335850918, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      double double0 = FastMath.atan2(2230.64, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      double double0 = FastMath.atan2((-3283.2929), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      double double0 = FastMath.atan2(1047.3667531, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      double double0 = FastMath.atan2((-202.610601142), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      double double0 = FastMath.atan2(4.4116660549148E299, 4.4116660549148E299);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      double double0 = FastMath.atan2((-1.570796326794384), (-3.3055691406347258E299));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      double double0 = FastMath.asin(677.01111);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      double double0 = FastMath.asin((-9223372036854775808L));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      double double0 = FastMath.asin(1L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      double double0 = FastMath.asin((-1));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      double double0 = FastMath.acos(1.5574077246549023);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      double double0 = FastMath.acos((-1.570614891937445));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      double double0 = FastMath.acos((-1L));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      double double0 = FastMath.acos((-0.8200920321704472));
      assertEquals(2.5323681572988477, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      double double0 = FastMath.cbrt(5);
      assertEquals(1.709975946676697, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      double double0 = FastMath.cbrt(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      int int0 = FastMath.abs(646981381);
      assertEquals(646981381, int0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      int int0 = FastMath.abs((-4273));
      assertEquals(4273, int0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      long long0 = FastMath.abs((long) 646981381);
      assertEquals(646981381L, long0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      long long0 = FastMath.abs((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      float float0 = FastMath.abs(4405.0F);
      assertEquals(4405.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      float float0 = FastMath.abs((-1.0F));
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      double double0 = FastMath.ulp(1.0F);
      assertEquals(2.220446049250313E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      double double0 = FastMath.nextUp(646981381);
      assertEquals(6.469813810000001E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 636.5166666666667);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-1.2623372105183894));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      double double0 = FastMath.nextAfter(969.0, 9.220590270857665E-9);
      assertEquals(968.9999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      double double0 = FastMath.nextAfter((-0.49999999999999994), (-2191.8));
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      double double0 = FastMath.nextAfter(1024.0, 886.1907);
      assertEquals(1023.9999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      long long0 = FastMath.round(Double.NEGATIVE_INFINITY);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      double double0 = FastMath.floor((-700));
      assertEquals((-700.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      double double0 = FastMath.ceil(0.7051975685975542);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      double double0 = FastMath.ceil(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      double double0 = FastMath.ceil((-1.4210854715202004E-14));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      double double0 = FastMath.rint((-4.469603409122654E-6));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      double double0 = FastMath.rint(1.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      int int0 = FastMath.min(646981381, 4);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      int int0 = FastMath.min(646981381, 646981381);
      assertEquals(646981381, int0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      long long0 = FastMath.min(343L, (long) 5);
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      long long0 = FastMath.min(0L, 343L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      float float0 = FastMath.min(1633.2839F, (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      float float0 = FastMath.min((-1126.3003F), (float) (-700));
      assertEquals((-1126.3003F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 0.0F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      double double0 = FastMath.min(0.0, 2.718281828459045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      double double0 = FastMath.min(799.5879180322, 1.2331016983979697);
      assertEquals(1.2331016983979697, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      int int0 = FastMath.max(8, (-16));
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      int int0 = FastMath.max(5, 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      long long0 = FastMath.max((long) 2061584302, 0L);
      assertEquals(2061584302L, long0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      long long0 = FastMath.max((-9223372036854775808L), (-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, (-828.6F));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      float float0 = FastMath.max((float) 5, 4405.0F);
      assertEquals(4405.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      float float0 = FastMath.max(1.0F, (float) (-1));
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      double double0 = FastMath.max((-476.15027), (-3094.65703));
      assertEquals((-476.15027), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      double double0 = FastMath.max((-3653.80124235646), (double) 3588L);
      assertEquals(3588.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (double) 0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
