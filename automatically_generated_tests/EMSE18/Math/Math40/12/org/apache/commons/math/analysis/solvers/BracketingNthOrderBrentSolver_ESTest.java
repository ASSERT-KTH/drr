

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
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 3);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(405, ((UnivariateFunction) (sinFunction0)), 0.0, 1.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(3, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(346016, ((UnivariateFunction) (quinticFunction0)), (-1841.6), ((double) (346016)), 1.611607427262039E-4);
        Assert.assertEquals(0.0, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(672, ((UnivariateFunction) (sincFunction0)), (-354.0), 1187.0203463722328, (-1.0), allowedSolution0);
        Assert.assertEquals(983.3185005392523, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(4079.482249488038, (-31.651271771373302), 0.5, 763);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        bracketingNthOrderBrentSolver0.solve(2164, ((UnivariateFunction) (quinticFunction0)), (-31.651271771373302), 4079.482249488038, 111.2759906, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(763, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(111.2759906, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1822, ((UnivariateFunction) (sincFunction0)), (-2900.505988867238), 1807.424317283, 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-2899.6900192633793), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (1328)), 1269.8627929, 1328);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(1328, ((UnivariateFunction) (expm1Function0)), (-30.93825231068972), 854.3736659969);
        Assert.assertEquals(1328, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-30.93825231068972), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateFunction univariateFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(932.241974, 1729);
        bracketingNthOrderBrentSolver0.solve(4, univariateFunction0, (-2056.9571376973), 62.98177394257244, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-996.9876818773637), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-996.9876818773637), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (1328)), 1269.8627929, 1328);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4101580, ((UnivariateFunction) (expm1Function0)), (-30.93825231068972), 0.0, (-5.468175655175594E-8), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(1328, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (1328)), 1269.8627929, 1328);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(1328, int0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1269, ((UnivariateFunction) (sincFunction0)), ((double) (1269)), 4430.14056, allowedSolution0);
        Assert.assertEquals(3901.858075758522, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2410.8114531991364), (-2410.8114531991364), 1292);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1292, ((UnivariateFunction) (sincFunction0)), (-2410.8114531991364), ((double) (1292)), allowedSolution0);
        Assert.assertEquals(-1429.424657383356, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(672, ((UnivariateFunction) (sincFunction0)), (-354.0), 1186.8506237754546, (-1.0), allowedSolution0);
        Assert.assertEquals(-1.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1159.2476891746337, double0, 0.01);
    }
}

