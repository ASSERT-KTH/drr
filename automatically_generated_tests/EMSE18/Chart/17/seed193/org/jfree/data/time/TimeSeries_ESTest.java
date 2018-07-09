

package org.jfree.data.time;

import org.junit.Assert;
import java.awt.Button;
import java.awt.Choice;
import org.jfree.data.xy.DefaultWindDataset;
import java.awt.Dialog;
import java.util.List;
import java.awt.Scrollbar;
import org.junit.Test;

public class TimeSeries_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("org.jfree.data.time.Day", timeSeries0.getDomainDescription());
        Assert.assertEquals("java.util.TimeZone", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        Week week1 = new Week(1, 53);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (week1)), ((RegularTimePeriod) (week0)));
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        timeSeries0.setMaximumItemAge(12L);
        Assert.assertEquals(12L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("SwingDisplayedMnemonicIndexKey")));
        timeSeries0.setMaximumItemCount(1768);
        Assert.assertEquals(1768, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        Assert.assertEquals("F", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        Assert.assertNull(timeSeriesDataItem0);
        Integer integer0 = ((Integer) (timeSeries0.getValue(((RegularTimePeriod) (week0)))));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertNotNull(integer0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((String) (null)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertNull(string0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getNextTimePeriod();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        timeSeries0.getMaximumItemAge();
        Assert.assertEquals("F", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getItemCount();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getIndex(week0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (quarter0)));
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        timeSeries0.setNotify(false);
        TimeSeries timeSeries1 = timeSeries0.createCopy(4, 3275);
        Assert.assertNotSame(timeSeries1, timeSeries0);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("F", timeSeries1.getDomainDescription());
        Assert.assertEquals("", timeSeries1.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), 4118.1);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), 3957.158853);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
        List list0 = timeSeriesCollection0.getSeries();
        timeSeries0.data = list0;
        try {
            timeSeries0.delete(((RegularTimePeriod) (week0)));
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (millisecond0)), ((Class) (class0)));
        try {
            timeSeries0.delete((-7), 0);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        Object[][] objectArray0 = new Object[6][7];
        List list0 = DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        timeSeries0.data = list0;
        try {
            timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), 4118.1);
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        Day day0 = new Day();
        Class<Dialog> class0 = Dialog.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)), ((Class) (class0)));
        timeSeries0.delete((-2), Integer.MAX_VALUE);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (millisecond0)), ((Class) (class0)));
        timeSeries0.removeAgedItems(true);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.getIndex(week0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        Day day0 = new Day();
        Class<Dialog> class0 = Dialog.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)), ((Class) (class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        Minute minute0 = new Minute();
        Class<Millisecond> class0 = Millisecond.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, long0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals("", string0);
        Assert.assertEquals("F", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("F", string0);
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)));
        try {
            timeSeries0.getDataItem((-199));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        timeSeries0.getItemCount();
        Assert.assertEquals("F", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        timeSeries0.hashCode();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Week week0 = new Week();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (null)));
        timeSeries0.hashCode();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("selectionModel")));
        TimeSeries timeSeries1 = new TimeSeries(((Comparable) ("selectionModel")));
        timeSeries0.setRangeDescription("selectionModel");
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertEquals("selectionModel", timeSeries0.getRangeDescription());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals("java.util.TimeZone");
        Assert.assertEquals("java.util.TimeZone", timeSeries0.getRangeDescription());
        Assert.assertFalse(boolean0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("org.jfree.data.time.Day", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(1494, 1494);
        Assert.assertTrue(timeSeries1.equals(((Object) (timeSeries0))));
        Week week0 = new Week(1477, Integer.MAX_VALUE);
        timeSeries1.setKey(week0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertFalse(boolean0);
        Assert.assertFalse(timeSeries1.equals(((Object) (timeSeries0))));
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), 4118.1);
        Second second0 = new Second();
        timeSeries0.createCopy(((RegularTimePeriod) (second0)), ((RegularTimePeriod) (second0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        timeSeries0.delete(((RegularTimePeriod) (week0)));
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.delete(((RegularTimePeriod) (week0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), 4118.1);
        timeSeries0.clear();
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (millisecond0)), ((Class) (class0)));
        timeSeries0.clear();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (1392409281320L)));
        timeSeries0.removeAgedItems(3327L, false);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        timeSeries0.removeAgedItems(3327L, false);
        timeSeries0.removeAgedItems(((long) (1)), true);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        timeSeries0.getValue(((RegularTimePeriod) (quarter0)));
        Assert.assertEquals("F", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), "org.jfree.data.time.Day", "java.util.TimeZone", ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (fixedMillisecond0)), 4118.1);
        timeSeries0.getTimePeriods();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        Class<Scrollbar> class0 = Scrollbar.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (millisecond0)), ((Class) (class0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (millisecond0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        TimeSeries timeSeries1 = timeSeries0.createCopy(1494, 1494);
        Assert.assertNotSame(timeSeries0, timeSeries1);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Class<Minute> class0 = Minute.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("UPPER_LEFT_CORNER")), ((Class) (class0)));
        Object[][] objectArray0 = new Object[11][8];
        List list0 = DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        timeSeries0.data = list0;
        timeSeries0.setMaximumItemCount(2);
        Assert.assertEquals(2, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((String) (null)));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        Class<Scrollbar> class0 = Scrollbar.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (millisecond0)), ((Class) (class0)));
        try {
            timeSeries0.getNextTimePeriod();
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
        Class<Dialog> class0 = Dialog.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (simpleTimePeriod0)), ((Class) (class0)));
        timeSeries0.getTimePeriodClass();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.getItems();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((double) (3275)));
        timeSeries0.getValue(((RegularTimePeriod) (quarter0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        Class<Scrollbar> class0 = Scrollbar.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (millisecond0)), ((Class) (class0)));
        try {
            timeSeries0.update((-2150), ((Number) (0)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        Week week0 = new Week();
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        timeSeries0.setDomainDescription("F");
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("F", timeSeries0.getDomainDescription());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Button> class0 = Button.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), "F", "", ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(1494, 1494);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertEquals("", timeSeries1.getRangeDescription());
        Assert.assertNotSame(timeSeries1, timeSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertEquals("F", timeSeries1.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Week week0 = new Week();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (week0)), ((Class) (null)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (week0)), ((Number) (53)));
        {
            timeSeries0.clone();
        }
    }
}

