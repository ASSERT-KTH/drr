

package org.jfree.data.time;


public abstract class RegularTimePeriod implements java.lang.Comparable , org.jfree.data.time.MonthConstants , org.jfree.data.time.TimePeriod {
	public static org.jfree.data.time.RegularTimePeriod createInstance(java.lang.Class c, java.util.Date millisecond, java.util.TimeZone zone) {
		org.jfree.data.time.RegularTimePeriod result = null;
		try {
			java.lang.reflect.Constructor constructor = c.getDeclaredConstructor(new java.lang.Class[]{ java.util.Date.class , java.util.TimeZone.class });
			result = ((org.jfree.data.time.RegularTimePeriod) (constructor.newInstance(new java.lang.Object[]{ millisecond , zone })));
		} catch (java.lang.Exception e) {
		}
		return result;
	}

	public static java.lang.Class downsize(java.lang.Class c) {
		if (c.equals(org.jfree.data.time.Year.class)) {
			return org.jfree.data.time.Quarter.class;
		}else
			if (c.equals(org.jfree.data.time.Quarter.class)) {
				return org.jfree.data.time.Month.class;
			}else
				if (c.equals(org.jfree.data.time.Month.class)) {
					return org.jfree.data.time.Day.class;
				}else
					if (c.equals(org.jfree.data.time.Day.class)) {
						return org.jfree.data.time.Hour.class;
					}else
						if (c.equals(org.jfree.data.time.Hour.class)) {
							return org.jfree.data.time.Minute.class;
						}else
							if (c.equals(org.jfree.data.time.Minute.class)) {
								return org.jfree.data.time.Second.class;
							}else
								if (c.equals(org.jfree.data.time.Second.class)) {
									return org.jfree.data.time.Millisecond.class;
								}else {
									return org.jfree.data.time.Millisecond.class;
								}
							
						
					
				
			
		
	}

	public abstract org.jfree.data.time.RegularTimePeriod previous();

	public abstract org.jfree.data.time.RegularTimePeriod next();

	public abstract long getSerialIndex();

	public abstract void peg(java.util.Calendar calendar);

	public java.util.Date getStart() {
		return new java.util.Date(getFirstMillisecond());
	}

	public java.util.Date getEnd() {
		return new java.util.Date(getLastMillisecond());
	}

	public abstract long getFirstMillisecond();

	public abstract long getFirstMillisecond(java.util.Calendar calendar);

	public abstract long getLastMillisecond();

	public abstract long getLastMillisecond(java.util.Calendar calendar);

	public long getMiddleMillisecond() {
		long m1 = getFirstMillisecond();
		long m2 = getLastMillisecond();
		return m1 + ((m2 - m1) / 2);
	}

	public long getMiddleMillisecond(java.util.Calendar calendar) {
		long m1 = getFirstMillisecond(calendar);
		long m2 = getLastMillisecond(calendar);
		return m1 + ((m2 - m1) / 2);
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(getStart());
	}
}

