

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.48060605898810416), 2613);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        bracketingNthOrderBrentSolver0.solve(2613, ((UnivariateFunction) (quinticFunction0)), (-0.48060605898810416), 0.028875925);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1401, ((UnivariateFunction) (sincFunction0)), (-186.588114262), Double.NaN, 0.0, allowedSolution0);
        Assert.assertEquals((-185.3539665617978), double0, 0.01);
        Assert.assertEquals(2, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1287.966789523417), 559);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(559, univariateFunction0, (-1630.0), (-1287.966789523417));
        Assert.assertEquals((-1459.2691023180007), double0, 0.01);
        Assert.assertEquals(559, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1401, ((UnivariateFunction) (sincFunction0)), (-203.76882376144502), ((double) (1401)), 0.0, allowedSolution0);
        Assert.assertEquals(1341.4600630828345, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1762.468924126249), (-1762.468924126249), 4);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (quinticFunction0)), (-1762.468924126249), (-1.0), allowedSolution0);
        Assert.assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(5.0, 2);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2, ((UnivariateFunction) (sinFunction0)), 0.0, ((double) (2)), allowedSolution0);
        Assert.assertEquals(2, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2, ((UnivariateFunction) (quinticFunction0)), (-973.072), ((double) (2)), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1287.966789523417), 559);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(559, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2143830408, ((UnivariateFunction) (sincFunction0)), 1884.6662375, ((double) (2143830408)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(3.492953088356256E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2143830395, ((UnivariateFunction) (sincFunction0)), 1884.6662375, ((double) (2143830395)), allowedSolution0);
        Assert.assertEquals(1.0495766437084446E9, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2143830408, ((UnivariateFunction) (sincFunction0)), 1884.6662375, ((double) (2143830408)), allowedSolution0);
        Assert.assertEquals(3.492953088356256E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1287.966789523417), 559);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(559, ((UnivariateFunction) (sincFunction0)), (-1630.0), (-1287.966789523417));
        Assert.assertEquals(-1388.5839528866886, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(-1388.5839528866886, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2143830408, ((UnivariateFunction) (sincFunction0)), 0.0625, ((double) (2143830408)), allowedSolution0);
        Assert.assertEquals(1.938023472647698E9, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(1.938023472647698E9, double1, 0.01);
    }
}

