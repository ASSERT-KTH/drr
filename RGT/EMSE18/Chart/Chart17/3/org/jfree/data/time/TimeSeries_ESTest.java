

package org.jfree.data.time;

import org.junit.Assert;
import java.awt.Choice;
import java.awt.Container;
import org.junit.Test;

public class TimeSeries_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "d^", "d^", ((Class) (class0)));
        timeSeries0.hashCode();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("d^", timeSeries0.getRangeDescription());
        Assert.assertEquals("d^", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        Quarter quarter1 = ((Quarter) (quarter0.next()));
        timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (quarter1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Quarter quarter0 = new Quarter();
        Quarter quarter1 = ((Quarter) (quarter0.previous()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter1)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter1)), ((RegularTimePeriod) (quarter0)));
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(0, 4178);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("", timeSeries1.getDomainDescription());
        Assert.assertEquals("", timeSeries1.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (week0)), (-100.0));
        timeSeries0.add(timeSeriesDataItem0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        timeSeries0.add(((RegularTimePeriod) (week0)), (-100.0));
        timeSeries0.clone();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        timeSeries0.add(((RegularTimePeriod) (week0)), ((Number) (null)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281320L)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getNextTimePeriod();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        timeSeries0.add(((RegularTimePeriod) (week0)), (-100.0));
        timeSeries0.getIndex(year0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "d^", "d^", ((Class) (class0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("d^", string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("d^", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        Year year0 = quarter0.getYear();
        timeSeries0.setNotify(false);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((RegularTimePeriod) (year0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        try {
            FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
            TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
            timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281319L)));
            TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
            timeSeries1.setNotify(false);
            timeSeries1.createCopy(4239, 4239);
            Assert.assertEquals(1, timeSeries0.getItemCount());
            Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
            org.junit.Assert.fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expectedException__IndexOutOfBoundsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(0, 0);
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        Year year0 = quarter0.getYear();
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((double) (1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        try {
            timeSeries0.getValue((-1619));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        try {
            timeSeries0.getTimePeriod((-2061));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        try {
            timeSeries0.getDataItem((-3467));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (null)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (minute0)), ((Number) (59)));
        try {
            timeSeries0.add(timeSeriesDataItem0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        try {
            timeSeries0.delete((-1), (-1));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        timeSeries0.removeAgedItems(false);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        Year year0 = quarter0.getYear();
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((Number) (4)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.getTimePeriodClass();
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        timeSeries0.add(((RegularTimePeriod) (week0)), (-100.0));
        timeSeries0.hashCode();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        Assert.assertTrue(timeSeries1.equals(((Object) (timeSeries0))));
        timeSeries1.setRangeDescription(((String) (null)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertFalse(timeSeries1.equals(((Object) (timeSeries0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("", timeSeries1.getRangeDescription());
        Assert.assertEquals("", timeSeries1.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertTrue(boolean0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals("");
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertFalse(boolean0);
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        Quarter quarter0 = new Quarter();
        Quarter quarter1 = ((Quarter) (quarter0.previous()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter1)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        Assert.assertNull(timeSeriesDataItem0);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter1)), ((RegularTimePeriod) (quarter1)));
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        Year year0 = quarter0.getYear();
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((Number) (4)));
        timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281320L)));
        timeSeries0.delete(((RegularTimePeriod) (fixedMillisecond0)));
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281320L)));
        timeSeries0.clear();
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.clear();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        timeSeries0.removeAgedItems(((long) (1)), false);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.removeAgedItems(((long) (1)), false);
        timeSeries0.removeAgedItems(((long) (1)), true);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((Number) (1649693251)));
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        Week week0 = new Week(0, 0);
        timeSeries1.add(((RegularTimePeriod) (week0)), (-100.0));
        timeSeries0.addAndOrUpdate(timeSeries1);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281320L)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.update(((RegularTimePeriod) (fixedMillisecond0)), ((Number) (-1)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.getValue(((RegularTimePeriod) (year0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281319L)));
        TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281319L)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getTimePeriods();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1)));
        Assert.assertNull(timeSeriesDataItem0);
        TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(((RegularTimePeriod) (quarter0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertNotNull(timeSeriesDataItem1);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (quarter0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        timeSeries0.setMaximumItemAge(1392409281319L);
        Assert.assertEquals(1392409281319L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Container> class0 = Container.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(1);
        Assert.assertEquals(1, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("", string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        long long0 = timeSeries0.getMaximumItemAge();
        Assert.assertEquals(9223372036854775807L, long0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        timeSeries0.add(((RegularTimePeriod) (week0)), ((Number) (14)), false);
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        Week week0 = new Week(0, 0);
        timeSeries0.add(((RegularTimePeriod) (week0)), (-100.0));
        timeSeries0.setMaximumItemCount(0);
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281319L)));
        Assert.assertNull(timeSeriesDataItem0);
        Double double0 = ((Double) (timeSeries0.getValue(((RegularTimePeriod) (fixedMillisecond0)))));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(1.392409281319E12, ((double) (double0)), 0.01);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertNotNull(double0);
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        try {
            timeSeries0.getNextTimePeriod();
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertFalse(boolean0);
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        timeSeries0.getItems();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        Minute minute0 = new Minute();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals(Integer.MAX_VALUE, int0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        try {
            timeSeries0.update((-518), ((Number) ((byte) (124))));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), ((double) (1392409281320L)));
        TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
        timeSeries1.delete(((RegularTimePeriod) (fixedMillisecond0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test106() throws Throwable {
        Year year0 = new Year();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)), "", "", ((Class) (class0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", string0);
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }
}

