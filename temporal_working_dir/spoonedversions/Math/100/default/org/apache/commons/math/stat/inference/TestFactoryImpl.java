

package org.apache.commons.math.stat.inference;


public class TestFactoryImpl extends org.apache.commons.math.stat.inference.TestFactory {
	public TestFactoryImpl() {
		super();
	}

	public org.apache.commons.math.stat.inference.TTest createTTest() {
		return new org.apache.commons.math.stat.inference.TTestImpl();
	}

	public org.apache.commons.math.stat.inference.ChiSquareTest createChiSquareTest() {
		return new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
	}
}

