

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0, Double.NaN, 988);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        bracketingNthOrderBrentSolver0.solve(988, ((UnivariateFunction) (quinticFunction0)), 3.09768273342776E-42, 1.0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(988, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 2.9719228210674055E-7, 3114);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        bracketingNthOrderBrentSolver0.setup(3114, univariateFunction0, (-1.0), 3114, 2.9719228210674055E-7);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(3114, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1.0056457222518134E-8), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0, Double.NaN, 988);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(988, univariateFunction0, 3.09768273342776E-42, 1.0);
        Assert.assertEquals(988, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.271956127951169, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1473.5819863385016, 2351);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2351, ((UnivariateFunction) (sincFunction0)), 1473.5819863385016, ((double) (2351)));
        Assert.assertEquals(1473.5819863385016, double0, 0.01);
        Assert.assertEquals(2351, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(538, ((UnivariateFunction) (sincFunction0)), (-1878.9674), 1035.4605000000001, allowedSolution0);
        Assert.assertEquals(738.2742735936013, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3.544454505759402E-4, 210);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(815, ((UnivariateFunction) (sinFunction0)), 431.09869947, ((double) (815)), allowedSolution0);
        Assert.assertEquals(431.09869947, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(571.7698624388956, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 927.8084912530232, 5);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (sincFunction0)), ((double) (5)), 361.29, allowedSolution0);
        Assert.assertEquals(5.0, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(183.145, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(289, univariateFunction0, (-343.494948663488), (-3.5392250480081715E-9), ((double) (-161)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-3.5392250480081715E-9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(368, ((UnivariateFunction) (sinFunction0)), 0.0, ((double) (368)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 927.8084912530232, 5);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (-522.0), 361.29, 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(977.5039968952651, 9.423976538577447E138, 8664);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(158651375, ((UnivariateFunction) (expm1Function0)), (-3295.324167567), 9.423976538577447E138, ((double) (8664)), allowedSolution0);
        Assert.assertEquals(8664, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(8664.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(289, ((UnivariateFunction) (sincFunction0)), (-343.494948663488), (-3.5392250480081715E-9), ((double) (-161)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-160.22122533307953), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 927.8084912530232, 5);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(368, ((UnivariateFunction) (sinFunction0)), (-343.494948663488), ((double) (368)), allowedSolution0);
        Assert.assertEquals(-59.69026041819921, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(7562, univariateFunction0, ((double) (538)), 1068.1, 1035.4605, allowedSolution0);
        Assert.assertEquals(972.321897820417, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}

