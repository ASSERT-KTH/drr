

package org.jfree.data.xy;

import org.junit.Assert;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.time.FixedMillisecond;
import java.util.List;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.SimpleTimePeriod;
import org.junit.Test;
import java.awt.TextComponent;
import java.util.Vector;
import org.jfree.data.time.Year;

public class XYSeries_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (24)));
        xYSeries0.add((-3412.557623190304), ((Number) ((byte) (113))));
        xYSeries0.add(((Number) (19)), ((Number) (6)), false);
        xYSeries0.add(((Number) (960711762)), ((Number) (8)), true);
        xYSeries0.add(((Number) ((byte) (121))), ((Number) (1212961568)), false);
        xYSeries0.add(((Number) (0)), ((Number) ((byte) (22))), false);
        xYSeries0.hashCode();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.addOrUpdate((-2468.76481647), (-2468.76481647));
        Assert.assertEquals(1, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), true, false);
        xYSeries0.add(((Number) (2)), ((Number) (null)), false);
        xYSeries0.add(((double) (6)), ((Number) (2)), true);
        xYSeries0.update(6, 0.5F);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.addOrUpdate(((double) (0)), ((double) (59)));
        XYDataItem xYDataItem0 = xYSeries0.remove(((Number) (0)));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), true);
        xYSeries0.add(((Number) (-9999)), ((Number) (9999)));
        XYDataItem xYDataItem0 = xYSeries0.remove(((Number) (-9999)));
        Assert.assertEquals(9999.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        xYSeries0.add(((double) (0L)), ((double) (0L)));
        xYSeries0.remove(0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1671L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        xYSeries0.add(((double) (1671L)), 1.0);
        XYDataItem xYDataItem0 = xYSeries0.remove(0);
        Assert.assertEquals(1.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(1671.0, xYDataItem0.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        xYSeries0.add(((double) (0L)), ((double) (0L)));
        xYSeries0.getY(0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.add(86.424542896, ((Number) (59)), false);
        xYSeries0.getItemCount();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(((double) (0)), ((double) (0)));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), false);
        xYSeries0.getAutoSort();
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
        Assert.assertTrue(boolean0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        xYSeries0.setNotify(false);
        XYSeries xYSeries1 = xYSeries0.createCopy(883, 883);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true, true);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        xYSeries0.setMaximumItemCount(0);
        XYSeries xYSeries1 = xYSeries0.createCopy(59, 59);
        Assert.assertNotSame(xYSeries0, xYSeries1);
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(((Number) ((byte) (0))), ((Number) (1200)));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), false, false);
        XYSeries xYSeries1 = xYSeries0.createCopy(2342, 2342);
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        xYSeries0.add(((double) (0L)), ((double) (0L)));
        xYSeries0.addOrUpdate(((double) (0L)), ((double) (0L)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (21)), false, false);
        xYSeries0.addOrUpdate(Double.NEGATIVE_INFINITY, ((double) (21)));
        xYSeries0.addOrUpdate(Double.NEGATIVE_INFINITY, (-392.4544686815814));
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        try {
            xYSeries0.updateByIndex((-9999), (-9999));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (24)));
        Object[] objectArray0 = new Object[2];
        DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, ((int) ((byte) (113))));
        Vector vector0 = defaultTableModel0.getDataVector();
        xYSeries0.data = ((List) (vector0));
        try {
            xYSeries0.indexOf(2);
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)));
        try {
            xYSeries0.getY((-9999));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (1)), false, true);
        try {
            xYSeries0.getDataItem((-4632));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.add(86.424542896, ((Number) (59)), false);
        try {
            xYSeries0.createCopy((-514), 59);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        Double double0 = new Double(((double) (6)));
        xYSeries0.add(((double) (6)), ((Number) (2)), true);
        int int0 = xYSeries0.indexOf(double0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.indexOf(59);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        Double double0 = new Double(((double) (6)));
        int int0 = xYSeries0.indexOf(double0);
        Assert.assertEquals((-1), int0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true, true);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((Number) (59)), ((Number) (59)));
        Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        xYSeries0.add(((double) (0L)), (-1.0));
        XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        xYSeries0.setMaximumItemCount(0);
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
        xYSeries0.add(xYDataItem0, false);
        Assert.assertEquals((-1.0), xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        xYSeries0.add(((double) (0L)), 1.0);
        XYDataItem xYDataItem0 = xYSeries0.remove(0);
        xYSeries0.add(xYDataItem0, true);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
        Assert.assertEquals(1.0, xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.add(86.424542896, ((Number) (59)), false);
        xYSeries0.addOrUpdate(((double) (0)), ((double) (59)));
        XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        xYSeries0.add(xYDataItem0, true);
        Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.add(86.424542896, ((Number) (59)), false);
        xYSeries0.addOrUpdate(((double) (0)), ((double) (59)));
        XYDataItem xYDataItem0 = xYSeries0.getDataItem(1);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        xYSeries0.add(xYDataItem0, false);
        Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(86.424542896, xYDataItem0.getXValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        XYDataItem xYDataItem0 = new XYDataItem(((double) (59)), ((double) (0)));
        xYSeries0.add(xYDataItem0, true);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        xYSeries0.add(((double) (0L)), 1.0);
        XYDataItem xYDataItem0 = xYSeries0.remove(0);
        xYSeries0.add(xYDataItem0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(1.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.getItemCount();
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), true, false);
        xYSeries0.hashCode();
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1670L, 1670L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleTimePeriod0)), false);
        xYSeries0.add(((double) (-3501)), ((Number) (893602898)));
        xYSeries0.add(((double) (893602898)), ((double) (-3501)), false);
        xYSeries0.hashCode();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1670L, 1670L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleTimePeriod0)), false);
        XYSeries xYSeries1 = xYSeries0.createCopy((-3217), (-3501));
        Assert.assertTrue(xYSeries1.equals(((Object) (xYSeries0))));
        xYSeries1.add(((double) (-3501)), ((Number) (893602898)));
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1670L, 1670L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleTimePeriod0)), false);
        XYSeries xYSeries1 = xYSeries0.createCopy((-3217), (-3501));
        Assert.assertTrue(xYSeries1.equals(((Object) (xYSeries0))));
        xYSeries1.setDescription("org.jfree.data.xy.XYIntervalDataItem");
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertFalse(boolean0);
        Assert.assertFalse(xYSeries1.equals(((Object) (xYSeries0))));
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1670L, 1670L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleTimePeriod0)), false);
        XYSeries xYSeries1 = xYSeries0.createCopy((-3217), (-3501));
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1670L, 1670L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleTimePeriod0)), false);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        boolean boolean0 = xYSeries0.equals(((Object) (null)));
        Assert.assertFalse(boolean0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.add(86.424542896, ((Number) (59)), false);
        xYSeries0.addOrUpdate(((double) (0)), ((double) (59)));
        xYSeries0.createCopy(0, 1);
        Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (24)));
        xYSeries0.addOrUpdate(((Number) ((byte) (112))), ((Number) (null)));
        xYSeries0.toArray();
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (24)));
        xYSeries0.add((-3412.557623190304), ((Number) ((byte) (113))));
        xYSeries0.toArray();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (21)), false, false);
        xYSeries0.addOrUpdate(Double.NEGATIVE_INFINITY, ((double) (21)));
        int int0 = xYSeries0.indexOf(4);
        Assert.assertEquals(1, xYSeries0.getItemCount());
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), true, false);
        xYSeries0.add(((double) (6)), ((Number) (2)), true);
        Assert.assertTrue(xYSeries0.getAutoSort());
        xYSeries0.update(6, 0.5F);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        xYSeries0.add(((double) (0L)), 1.0);
        xYSeries0.clear();
        Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        xYSeries0.clear();
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (24)));
        xYSeries0.delete(1045, 833);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test091() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        xYSeries0.add(((double) (0L)), (-1.0));
        Double double0 = ((Double) (xYSeries0.getY(0)));
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.add(((Number) (double0)), ((Number) (double0)));
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        boolean boolean0 = xYSeries0.getAutoSort();
        Assert.assertTrue(boolean0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, false);
        boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(boolean0);
        Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        try {
            xYSeries0.remove(((Number) (0)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)));
        xYSeries0.addOrUpdate(((double) (0)), ((double) (59)));
        XYDataItem xYDataItem0 = new XYDataItem(((double) (59)), ((double) (0)));
        xYSeries0.add(xYDataItem0, true);
        int int0 = xYSeries0.indexOf(59);
        Assert.assertEquals(2, xYSeries0.getItemCount());
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)), true, false);
        try {
            xYSeries0.getX((-1424));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        int int0 = xYSeries0.getMaximumItemCount();
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        Month month0 = new Month();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (month0)));
        XYSeries xYSeries1 = ((XYSeries) (xYSeries0.clone()));
        Assert.assertTrue(xYSeries1.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @Test(timeout = 4000)
    public void test106() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-9L));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)), false, true);
        xYSeries0.add(((double) (-9L)), 1.0);
        Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.remove(0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (24)));
        XYSeries xYSeries1 = xYSeries0.createCopy(24, 978);
        Vector<TextComponent> vector0 = new Vector<TextComponent>();
        xYSeries1.data = ((List) (vector0));
        xYSeries1.add(((Number) (0)), ((Number) ((byte) (22))), false);
        {
            xYSeries1.addOrUpdate(((Number) (0)), ((Number) ((byte) (14))));
        }
    }
}

