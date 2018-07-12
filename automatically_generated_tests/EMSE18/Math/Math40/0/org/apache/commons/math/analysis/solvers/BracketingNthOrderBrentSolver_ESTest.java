

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2620, ((UnivariateFunction) (quinticFunction0)), 0.0, ((double) (2620)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (4)), 4);
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (quinticFunction0)), ((double) (-1)), (-0.0625), Double.NaN, allowedSolution0);
        Assert.assertEquals((-1.0), double0, 0.01);
        Assert.assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1222.1337102778218), 0.0, (-0.0625), 5);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (xMinus5Function0)), ((double) (4)), 1597.5012006012, allowedSolution0);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(883, univariateFunction0, (-1.0), 2578.5363884, 2455.97998825, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2489.712177969911, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(883, univariateFunction0, (-1.0), 2578.5363884, 2455.97998825, allowedSolution0);
        Assert.assertEquals(2489.712178018308, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (2)), ((double) (2)), 559.0, 2);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, 559.0, 916.39334489);
        Assert.assertEquals(737.696672445, double0, 0.01);
        Assert.assertEquals(2, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (4)), ((double) (4)), ((double) (4)), 4);
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (quinticFunction0)), (-2.7609457648450225E-8), ((double) (4)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-2.7609457648450225E-8), double0, 0.01);
        Assert.assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(439.82, 0.030293552747650665, 0.030293552747650665, 904);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(904, ((UnivariateFunction) (sinFunction0)), ((double) (904)), Double.NaN, 1941.843367002399, allowedSolution0);
        Assert.assertEquals(1941.843367002399, double0, 0.01);
        Assert.assertEquals(904, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 934);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(934, ((UnivariateFunction) (sincFunction0)), (-1.0), 4842.0, 0.9793667819514931);
        Assert.assertEquals(4841.194279181871, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (5)), ((double) (5)), 5);
        double double0 = bracketingNthOrderBrentSolver0.solve(681, ((UnivariateFunction) (xMinus5Function0)), 3.264215162645896, ((double) (5)));
        Assert.assertEquals(5.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 6.523324373119976E-6, 253.8095759731252, 5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (quinticFunction0)), ((double) (0)), 439.84935705825836, 253.8095759731252, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 6.523324373119976E-6, 253.8095759731252, 5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (quinticFunction0)), (-7317.761042), Double.NaN, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(883, ((UnivariateFunction) (sinFunction0)), (-1.0), 2578.5363884, 2455.97998825, allowedSolution0);
        Assert.assertEquals((-1.0), bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(2544.690049407735, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(462, ((UnivariateFunction) (sinFunction0)), ((double) (462)), 2578.5363884, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2255.6635252851142, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(462, ((UnivariateFunction) (sinFunction0)), (-1.0), 2578.5363884, allowedSolution0);
        Assert.assertEquals(471.23889803202826, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}

