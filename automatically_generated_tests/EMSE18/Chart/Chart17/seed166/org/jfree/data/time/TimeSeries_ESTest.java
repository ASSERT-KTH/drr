

package org.jfree.data.time;

import org.junit.Assert;
import java.awt.FileDialog;
import java.awt.List;
import org.junit.Test;

public class TimeSeries_ESTest  {
    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(20, 20);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        Minute minute1 = ((Minute) (timeSeries0.getNextTimePeriod()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (0)));
        timeSeries0.setMaximumItemAge(490);
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        Minute minute1 = ((Minute) (timeSeries0.getNextTimePeriod()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (44)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        Minute minute1 = ((Minute) (timeSeries0.getNextTimePeriod()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (0)));
        timeSeries0.update(((RegularTimePeriod) (minute1)), ((Number) (59)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        Minute minute1 = ((Minute) (timeSeries0.getNextTimePeriod()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (minute1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("")));
        Day day0 = new Day();
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (null)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        timeSeries0.getItemCount();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("")));
        try {
            timeSeries0.getDataItem((-758));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (null)));
        try {
            timeSeries0.add(((RegularTimePeriod) (minute0)), ((Number) (59)), false);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (null)));
        try {
            timeSeries0.add(((RegularTimePeriod) (minute0)), ((Number) (59)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        Minute minute1 = ((Minute) (timeSeries0.getNextTimePeriod()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (0)));
        timeSeries0.createCopy(0, 1);
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        try {
            timeSeries0.delete((-16), 490);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        try {
            timeSeries0.getValue((-360));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2485.5835147065927));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (null)));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Minute minute0 = new Minute();
        Class<FileDialog> class0 = FileDialog.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals(class0);
        Assert.assertFalse(boolean0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (6)), ((Class) (class0)));
        Week week0 = new Week();
        timeSeries0.delete(((RegularTimePeriod) (week0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.clear();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Month month0 = new Month();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (month0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (month0)), ((Number) (17)));
        timeSeries0.removeAgedItems(((long) (0)), false);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        Month month0 = new Month();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (month0)));
        timeSeries0.removeAgedItems(((long) (0)), false);
        timeSeries0.removeAgedItems(((long) (0)), false);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2497.8902855555316));
        Minute minute1 = ((Minute) (timeSeries0.getNextTimePeriod()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute1)), ((Number) (0)));
        timeSeries0.hashCode();
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("")));
        Day day0 = new Day();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        Minute minute0 = new Minute();
        Class<FileDialog> class0 = FileDialog.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (minute0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.setRangeDescription("Null 'start' argument.");
        timeSeries0.setRangeDescription("9|%1QMe>S)vgUI");
        Assert.assertEquals("9|%1QMe>S)vgUI", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Minute minute0 = new Minute();
        Class<List> class0 = List.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (minute0)), (-2497.8902855555316));
        TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
        Assert.assertEquals(1, timeSeries1.getItemCount());
        timeSeries1.addAndOrUpdate(timeSeries0);
        Assert.assertEquals(1, timeSeries1.getItemCount());
    }
}

