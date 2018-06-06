

package org.apache.commons.math.random;


public class ValueServer {
	private int mode = 5;

	private java.net.URL valuesFileURL = null;

	private double mu = 0.0;

	private double sigma = 0.0;

	private org.apache.commons.math.random.EmpiricalDistribution empiricalDistribution = null;

	private java.io.BufferedReader filePointer = null;

	private org.apache.commons.math.random.RandomData randomData = new org.apache.commons.math.random.RandomDataImpl();

	public static final int DIGEST_MODE = 0;

	public static final int REPLAY_MODE = 1;

	public static final int UNIFORM_MODE = 2;

	public static final int EXPONENTIAL_MODE = 3;

	public static final int GAUSSIAN_MODE = 4;

	public static final int CONSTANT_MODE = 5;

	public ValueServer() {
	}

	public double getNext() throws java.io.IOException {
		switch (mode) {
			case org.apache.commons.math.random.ValueServer.DIGEST_MODE :
				return getNextDigest();
			case org.apache.commons.math.random.ValueServer.REPLAY_MODE :
				return getNextReplay();
			case org.apache.commons.math.random.ValueServer.UNIFORM_MODE :
				return getNextUniform();
			case org.apache.commons.math.random.ValueServer.EXPONENTIAL_MODE :
				return getNextExponential();
			case org.apache.commons.math.random.ValueServer.GAUSSIAN_MODE :
				return getNextGaussian();
			case org.apache.commons.math.random.ValueServer.CONSTANT_MODE :
				return mu;
			default :
				throw org.apache.commons.math.MathRuntimeException.createIllegalStateException(("unknown mode {0}, known modes: " + "{1} ({2}), {3} ({4}), {5} ({6}), {7} ({8}), {9} ({10}) and {11} ({12})"), mode, "DIGEST_MODE", org.apache.commons.math.random.ValueServer.DIGEST_MODE, "REPLAY_MODE", org.apache.commons.math.random.ValueServer.REPLAY_MODE, "UNIFORM_MODE", org.apache.commons.math.random.ValueServer.UNIFORM_MODE, "EXPONENTIAL_MODE", org.apache.commons.math.random.ValueServer.EXPONENTIAL_MODE, "GAUSSIAN_MODE", org.apache.commons.math.random.ValueServer.GAUSSIAN_MODE, "CONSTANT_MODE", org.apache.commons.math.random.ValueServer.CONSTANT_MODE);
		}
	}

	public void fill(double[] values) throws java.io.IOException {
		for (int i = 0; i < (values.length); i++) {
			values[i] = getNext();
		}
	}

	public double[] fill(int length) throws java.io.IOException {
		double[] out = new double[length];
		for (int i = 0; i < length; i++) {
			out[i] = getNext();
		}
		return out;
	}

	public void computeDistribution() throws java.io.IOException {
		empiricalDistribution = new org.apache.commons.math.random.EmpiricalDistributionImpl();
		empiricalDistribution.load(valuesFileURL);
	}

	public void computeDistribution(int binCount) throws java.io.IOException {
		empiricalDistribution = new org.apache.commons.math.random.EmpiricalDistributionImpl(binCount);
		empiricalDistribution.load(valuesFileURL);
		mu = empiricalDistribution.getSampleStats().getMean();
		sigma = empiricalDistribution.getSampleStats().getStandardDeviation();
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		org.apache.commons.math.random.ValueServer.this.mode = mode;
	}

	public java.net.URL getValuesFileURL() {
		return valuesFileURL;
	}

	public void setValuesFileURL(java.lang.String url) throws java.net.MalformedURLException {
		org.apache.commons.math.random.ValueServer.this.valuesFileURL = new java.net.URL(url);
	}

	public void setValuesFileURL(java.net.URL url) {
		org.apache.commons.math.random.ValueServer.this.valuesFileURL = url;
	}

	public org.apache.commons.math.random.EmpiricalDistribution getEmpiricalDistribution() {
		return empiricalDistribution;
	}

	public void resetReplayFile() throws java.io.IOException {
		if ((filePointer) != null) {
			try {
				filePointer.close();
				filePointer = null;
			} catch (java.io.IOException ex) {
			}
		}
		filePointer = new java.io.BufferedReader(new java.io.InputStreamReader(valuesFileURL.openStream()));
	}

	public void closeReplayFile() throws java.io.IOException {
		if ((filePointer) != null) {
			filePointer.close();
			filePointer = null;
		}
	}

	public double getMu() {
		return mu;
	}

	public void setMu(double mu) {
		org.apache.commons.math.random.ValueServer.this.mu = mu;
	}

	public double getSigma() {
		return sigma;
	}

	public void setSigma(double sigma) {
		org.apache.commons.math.random.ValueServer.this.sigma = sigma;
	}

	private double getNextDigest() {
		if (((empiricalDistribution) == null) || ((empiricalDistribution.getBinStats().size()) == 0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("digest not initialized");
		}
		return empiricalDistribution.getNextValue();
	}

	private double getNextReplay() throws java.io.IOException {
		java.lang.String str = null;
		if ((filePointer) == null) {
			resetReplayFile();
		}
		if ((str = filePointer.readLine()) == null) {
			closeReplayFile();
			resetReplayFile();
			if ((str = filePointer.readLine()) == null) {
				throw org.apache.commons.math.MathRuntimeException.createEOFException("URL {0} contains no data", valuesFileURL);
			}
		}
		return java.lang.Double.valueOf(str).doubleValue();
	}

	private double getNextUniform() {
		return randomData.nextUniform(0, (2 * (mu)));
	}

	private double getNextExponential() {
		return randomData.nextExponential(mu);
	}

	private double getNextGaussian() {
		return randomData.nextGaussian(mu, sigma);
	}

	public ValueServer(org.apache.commons.math.random.RandomData randomData) {
		super();
		org.apache.commons.math.random.ValueServer.this.randomData = randomData;
	}
}

