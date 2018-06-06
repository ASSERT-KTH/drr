

package org.apache.commons.math.stat.inference;


public abstract class TestFactory {
	protected TestFactory() {
		super();
	}

	public static org.apache.commons.math.stat.inference.TestFactory newInstance() {
		org.apache.commons.math.stat.inference.TestFactory factory = null;
		try {
			org.apache.commons.discovery.tools.DiscoverClass dc = new org.apache.commons.discovery.tools.DiscoverClass();
			factory = ((org.apache.commons.math.stat.inference.TestFactory) (dc.newInstance(org.apache.commons.math.stat.inference.TestFactory.class, "org.apache.commons.math.stat.inference.TestFactoryImpl")));
		} catch (java.lang.Throwable t) {
			return new org.apache.commons.math.stat.inference.TestFactoryImpl();
		}
		return factory;
	}

	public abstract org.apache.commons.math.stat.inference.TTest createTTest();

	public abstract org.apache.commons.math.stat.inference.ChiSquareTest createChiSquareTest();
}

