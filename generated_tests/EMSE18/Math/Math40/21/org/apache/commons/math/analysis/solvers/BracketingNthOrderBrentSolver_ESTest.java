

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.8050544360646619, 1.8050544360646619, 1.8050544360646619, 3380);
        SincFunction sincFunction0 = new SincFunction();
        bracketingNthOrderBrentSolver0.solve(3380, ((UnivariateFunction) (sincFunction0)), 1.8050544360646619, 613.905);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(307.8550272180323, double0, 0.01);
        Assert.assertEquals(3380, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1402, ((UnivariateFunction) (expm1Function0)), (-1580.66983), ((double) (1402)), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (22)), 1610.681, 22);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(22, ((UnivariateFunction) (xMinus5Function0)), 0.0, 1610.681, 0.1309533376025487, allowedSolution0);
        Assert.assertEquals(1610.681, double0, 0.01);
        Assert.assertEquals(22, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1831, ((UnivariateFunction) (sincFunction0)), (-8.269235578021753E-33), ((double) (783)), allowedSolution0);
        Assert.assertEquals(650.3096793242769, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1415, ((UnivariateFunction) (expm1Function0)), (-1580.66983), ((double) (1415)), allowedSolution0);
        Assert.assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-6.938893903907228E-18), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (708)), ((double) (708)), (-1583.3729443547973), 708);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1415, ((UnivariateFunction) (expm1Function0)), (-1583.3729443547973), ((double) (1415)), allowedSolution0);
        Assert.assertEquals(1415.0, double0, 0.01);
        Assert.assertEquals(708, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 5);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (expm1Function0)), (-7.219344506270708E-4), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(717, univariateFunction0, (-8.269235578021753E-33), ((double) (717)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-8.269235578021753E-33), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(672, ((UnivariateFunction) (expm1Function0)), (-1580.66983), ((double) (672)), 0.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (672)), (-1580.66983), (-1580.66983), 672);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (expm1Function0)), (-657.0097389219655), ((double) (672)), (-454.33491500000014), allowedSolution0);
        Assert.assertEquals((-454.33491500000014), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-454.33491500000014), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 708);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(708, ((UnivariateFunction) (quinticFunction0)), (-1580.66983), ((double) (708)), allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(3380, ((UnivariateFunction) (sincFunction0)), 1.8050544360646619, 613.905);
        Assert.assertEquals(172.78759595124401, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(717, ((UnivariateFunction) (sincFunction0)), (-2520.0), (-8.269235578021753E-33), allowedSolution0);
        Assert.assertEquals(-1652.4777357938324, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3897.9), (-470.820587644989), 386);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(386, ((UnivariateFunction) (sincFunction0)), (-3897.9), (-2170.2692));
        Assert.assertEquals(-3851.5925933010867, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(386, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(-3851.5925933010867, double1, 0.01);
    }
}

