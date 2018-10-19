

package org.jfree.data.time;

import org.junit.Assert;
import java.awt.Button;
import org.jfree.data.xy.DefaultWindDataset;
import java.util.List;
import java.awt.Scrollbar;
import org.jfree.data.general.SeriesException;
import org.junit.Test;

public class TimeSeries_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription("Time");
        timeSeries0.hashCode();
        Assert.assertEquals("Time", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setDomainDescription("Unknown data");
        timeSeries0.hashCode();
        Assert.assertEquals("Unknown data", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        Quarter quarter1 = ((Quarter) (quarter0.next()));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter1)), ((RegularTimePeriod) (quarter1)));
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        Quarter quarter1 = ((Quarter) (quarter0.previous()));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter1)), ((RegularTimePeriod) (quarter0)));
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setMaximumItemCount(1);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Second second0 = new Second();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (second0)), "", "=SPk[+n%/O`}[)ul;1", ((Class) (class0)));
        timeSeries0.setRangeDescription("=SPk[+n%/O`}[)ul;1");
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("=SPk[+n%/O`}[)ul;1", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Second second0 = new Second();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (second0)), "", "=SPk[+n%/O`}[)ul;1", ((Class) (class0)));
        timeSeries0.setDomainDescription("");
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("=SPk[+n%/O`}[)ul;1", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((double) (59)), true);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.update(0, ((Number) (1)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (0)));
        Double double0 = ((Double) (timeSeries0.getValue(((RegularTimePeriod) (minute0)))));
        Assert.assertNotNull(double0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        timeSeries0.getNextTimePeriod();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        timeSeries0.getItemCount();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.getIndex(quarter0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setNotify(false);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (quarter0)));
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        try {
            Quarter quarter0 = new Quarter(3, 305);
            TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
            timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
            timeSeries0.setNotify(false);
            TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
            timeSeries1.createCopy(22, 87);
            Assert.assertEquals(1, timeSeries0.getItemCount());
            Assert.assertEquals("Value", timeSeries0.getRangeDescription());
            org.junit.Assert.fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expectedException__IndexOutOfBoundsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (0)), true);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        try {
            timeSeries0.getValue((-1));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Second second0 = new Second();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (second0)), "", "=SPk[+n%/O`)ul;1", ((Class) (class0)));
        Object[][] objectArray0 = new Object[4][8];
        List list0 = DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        timeSeries0.data = list0;
        try {
            timeSeries0.delete(((RegularTimePeriod) (second0)));
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.delete((-1778), Integer.MAX_VALUE);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.removeAgedItems(true);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.getIndex(quarter0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        try {
            timeSeries0.getTimePeriod((-1));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        Month month0 = new Month();
        Class<Scrollbar> class0 = Scrollbar.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (month0)), ((Class) (class0)));
        try {
            timeSeries0.getDataItem((-4043));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.getItemCount();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        Second second0 = new Second();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (second0)), "", "=SPk[+n%/O`)ul;1", ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals("");
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("=SPk[+n%/O`)ul;1", timeSeries0.getRangeDescription());
        Assert.assertFalse(boolean0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        Quarter quarter0 = new Quarter(3, 3);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        Quarter quarter1 = new Quarter(4, 1);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter1)), ((RegularTimePeriod) (quarter1)));
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        try {
            Quarter quarter0 = new Quarter(3, 305);
            TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
            timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
            TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
            timeSeries1.createCopy(22, 87);
            Assert.assertEquals(1, timeSeries0.getItemCount());
            Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
            org.junit.Assert.fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expectedException__IndexOutOfBoundsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        Second second0 = new Second();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (second0)), "", "=SPk[+n%/O`}[)ul;1", ((Class) (class0)));
        timeSeries0.delete(((RegularTimePeriod) (second0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals("=SPk[+n%/O`}[)ul;1", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.clear();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setMaximumItemAge(305);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.removeAgedItems(1392409281320L, true);
        Assert.assertEquals(305L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        Quarter quarter0 = new Quarter(3, 3);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setMaximumItemAge(3);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.removeAgedItems(1392409281320L, false);
        Assert.assertEquals(3L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        Quarter quarter0 = new Quarter(3, 3);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.removeAgedItems(1392409281320L, false);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        Quarter quarter0 = new Quarter(3, 3);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.removeAgedItems(1392409281320L, false);
        timeSeries0.removeAgedItems(71L, true);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        try {
            Quarter quarter0 = new Quarter(3, 3);
            TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
            timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
            TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
            timeSeries1.addAndOrUpdate(timeSeries0);
            Double double0 = ((Double) (timeSeries1.getValue(0)));
            Assert.assertEquals(1, timeSeries0.getItemCount());
            Assert.assertEquals(4.0, ((double) (double0)), 0.01);
            org.junit.Assert.fail("Expecting exception: SeriesException");
        } catch (SeriesException expectedException__SeriesException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Quarter quarter0 = new Quarter(3, 3);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.update(((RegularTimePeriod) (quarter0)), ((Number) (4)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), ((Number) ((byte) (4))));
        Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.clear();
        timeSeries0.add(timeSeriesDataItem0, false);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test71() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.getValue(((RegularTimePeriod) (quarter0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test73() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
        TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test74() throws Throwable {
        Quarter quarter0 = new Quarter(3, 3);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test75() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        timeSeries0.getTimePeriods();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test81() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        TimeSeries timeSeries1 = new TimeSeries(((Comparable) ("Time")));
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test82() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals("Value", string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test83() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        long long0 = timeSeries0.getMaximumItemAge();
        Assert.assertEquals(9223372036854775807L, long0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        timeSeries0.getValue(((RegularTimePeriod) (minute0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        try {
            timeSeries0.getNextTimePeriod();
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test91() throws Throwable {
        Month month0 = new Month();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (month0)));
        Class class0 = timeSeries0.getTimePeriodClass();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertNotNull(class0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test92() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.getItems();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test93() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test95() throws Throwable {
        Minute minute0 = new Minute();
        Day day0 = minute0.getDay();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day0)), ((double) (59)));
        timeSeries0.createCopy(((RegularTimePeriod) (day0)), ((RegularTimePeriod) (day0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test96() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.setDomainDescription("Unknown data");
        timeSeries0.getDomainDescription();
        Assert.assertEquals("Unknown data", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        Quarter quarter0 = new Quarter(3, 305);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (4)));
        TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
        Assert.assertEquals(1, timeSeries1.getItemCount());
        timeSeries1.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (null)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }
}

