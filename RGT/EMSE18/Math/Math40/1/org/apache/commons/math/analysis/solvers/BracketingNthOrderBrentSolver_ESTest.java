

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(861.14, Double.NaN, 3);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(3, univariateFunction0, (-1152.58443416), ((double) (3)), 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(3, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2759);
        SincFunction sincFunction0 = new SincFunction();
        try {
            bracketingNthOrderBrentSolver0.solve(2759, ((UnivariateFunction) (sincFunction0)), (-2244.1), (-3.1989450260797914E-30), ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        try {
            bracketingNthOrderBrentSolver0.solve(635, ((UnivariateFunction) (sincFunction0)), (-1996.4265206669588), Double.NaN, 0.0595084804376466, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2759);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2759, univariateFunction0, (-1.4291517981101049E-8), ((double) (2759)), allowedSolution0);
        Assert.assertEquals(1.0008479783940239E-8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, 474);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(474, ((UnivariateFunction) (sinFunction0)), (-2587.127213121), (-1.0), allowedSolution0);
        Assert.assertEquals((-1090.132650795499), double0, 0.01);
        Assert.assertEquals(474, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1996.4265206669588), (-1996.4265206669588), 635);
        double double0 = bracketingNthOrderBrentSolver0.solve(635, ((UnivariateFunction) (sincFunction0)), (-1996.4265206669588), 389.93447, 0.0595084804376466, allowedSolution0);
        Assert.assertEquals((-1994.9113350295177), double0, 0.01);
        Assert.assertEquals(635, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-239.9723), 5);
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (expm1Function0)), (-2525.096348), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-15, 1.0E-15, 635);
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(635, ((UnivariateFunction) (sincFunction0)), (-1996.4265206669588), 389.93447, (-9.693721577387622), allowedSolution0);
        Assert.assertEquals(376.9911184307752, double0, 0.01);
        Assert.assertEquals(635, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, (-703.4282695400998), 2493);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(2493, ((UnivariateFunction) (expm1Function0)), 0.0, 4742.6407598301885);
        Assert.assertEquals(2493, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(635, ((UnivariateFunction) (sincFunction0)), (-1996.4265206669588), Double.NaN, 0.0595084804376466, allowedSolution0);
        Assert.assertEquals(0.0595084804376466, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1994.91133503867), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2759);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2759, ((UnivariateFunction) (sincFunction0)), (-1.4291517981101049E-8), ((double) (2759)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1379.1591749259192, double0, 0.01);
        Assert.assertEquals(2759, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2759);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2759, int0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2759);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2759, ((UnivariateFunction) (sincFunction0)), (-2244.1), (-3.1989450260797914E-30), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(-1859.8228509251749, double0, 0.01);
        Assert.assertEquals(2759, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, 474);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(474, ((UnivariateFunction) (sinFunction0)), 1.0E-6, ((double) (474)), allowedSolution0);
        Assert.assertEquals(235.6194490192329, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(918, univariateFunction0, (-597.0763901), 5.7455368446308694E197);
        Assert.assertEquals(2.6955815241789595E197, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(918, ((UnivariateFunction) (sinFunction0)), (-597.0763901), 5.7455368446308694E197);
        Assert.assertEquals(5.5364369200719745E197, double0, 0.01);
    }
}

