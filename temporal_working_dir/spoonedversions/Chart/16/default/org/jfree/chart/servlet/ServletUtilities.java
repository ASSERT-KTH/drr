

package org.jfree.chart.servlet;


public class ServletUtilities {
	private static java.lang.String tempFilePrefix = "jfreechart-";

	private static java.lang.String tempOneTimeFilePrefix = "jfreechart-onetime-";

	public static java.lang.String getTempFilePrefix() {
		return org.jfree.chart.servlet.ServletUtilities.tempFilePrefix;
	}

	public static void setTempFilePrefix(java.lang.String prefix) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		org.jfree.chart.servlet.ServletUtilities.tempFilePrefix = prefix;
	}

	public static java.lang.String getTempOneTimeFilePrefix() {
		return org.jfree.chart.servlet.ServletUtilities.tempOneTimeFilePrefix;
	}

	public static void setTempOneTimeFilePrefix(java.lang.String prefix) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		org.jfree.chart.servlet.ServletUtilities.tempOneTimeFilePrefix = prefix;
	}

	public static java.lang.String saveChartAsPNG(org.jfree.chart.JFreeChart chart, int width, int height, javax.servlet.http.HttpSession session) throws java.io.IOException {
		return org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(chart, width, height, null, session);
	}

	public static java.lang.String saveChartAsPNG(org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info, javax.servlet.http.HttpSession session) throws java.io.IOException {
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		org.jfree.chart.servlet.ServletUtilities.createTempDir();
		java.lang.String prefix = org.jfree.chart.servlet.ServletUtilities.tempFilePrefix;
		if (session == null) {
			prefix = org.jfree.chart.servlet.ServletUtilities.tempOneTimeFilePrefix;
		}
		java.io.File tempFile = java.io.File.createTempFile(prefix, ".png", new java.io.File(java.lang.System.getProperty("java.io.tmpdir")));
		org.jfree.chart.ChartUtilities.saveChartAsPNG(tempFile, chart, width, height, info);
		if (session != null) {
			org.jfree.chart.servlet.ServletUtilities.registerChartForDeletion(tempFile, session);
		}
		return tempFile.getName();
	}

	public static java.lang.String saveChartAsJPEG(org.jfree.chart.JFreeChart chart, int width, int height, javax.servlet.http.HttpSession session) throws java.io.IOException {
		return org.jfree.chart.servlet.ServletUtilities.saveChartAsJPEG(chart, width, height, null, session);
	}

	public static java.lang.String saveChartAsJPEG(org.jfree.chart.JFreeChart chart, int width, int height, org.jfree.chart.ChartRenderingInfo info, javax.servlet.http.HttpSession session) throws java.io.IOException {
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		org.jfree.chart.servlet.ServletUtilities.createTempDir();
		java.lang.String prefix = org.jfree.chart.servlet.ServletUtilities.tempFilePrefix;
		if (session == null) {
			prefix = org.jfree.chart.servlet.ServletUtilities.tempOneTimeFilePrefix;
		}
		java.io.File tempFile = java.io.File.createTempFile(prefix, ".jpeg", new java.io.File(java.lang.System.getProperty("java.io.tmpdir")));
		org.jfree.chart.ChartUtilities.saveChartAsJPEG(tempFile, chart, width, height, info);
		if (session != null) {
			org.jfree.chart.servlet.ServletUtilities.registerChartForDeletion(tempFile, session);
		}
		return tempFile.getName();
	}

	protected static void createTempDir() {
		java.lang.String tempDirName = java.lang.System.getProperty("java.io.tmpdir");
		if (tempDirName == null) {
			throw new java.lang.RuntimeException(("Temporary directory system property " + "(java.io.tmpdir) is null."));
		}
		java.io.File tempDir = new java.io.File(tempDirName);
		if (!(tempDir.exists())) {
			tempDir.mkdirs();
		}
	}

	protected static void registerChartForDeletion(java.io.File tempFile, javax.servlet.http.HttpSession session) {
		if (session != null) {
			org.jfree.chart.servlet.ChartDeleter chartDeleter = ((org.jfree.chart.servlet.ChartDeleter) (session.getAttribute("JFreeChart_Deleter")));
			if (chartDeleter == null) {
				chartDeleter = new org.jfree.chart.servlet.ChartDeleter();
				session.setAttribute("JFreeChart_Deleter", chartDeleter);
			}
			chartDeleter.addChart(tempFile.getName());
		}else {
			java.lang.System.out.println("Session is null - chart will not be deleted");
		}
	}

	public static void sendTempFile(java.lang.String filename, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
		java.io.File file = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"), filename);
		org.jfree.chart.servlet.ServletUtilities.sendTempFile(file, response);
	}

	public static void sendTempFile(java.io.File file, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
		java.lang.String mimeType = null;
		java.lang.String filename = file.getName();
		if ((filename.length()) > 5) {
			if (filename.substring(((filename.length()) - 5), filename.length()).equals(".jpeg")) {
				mimeType = "image/jpeg";
			}else
				if (filename.substring(((filename.length()) - 4), filename.length()).equals(".png")) {
					mimeType = "image/png";
				}
			
		}
		org.jfree.chart.servlet.ServletUtilities.sendTempFile(file, response, mimeType);
	}

	public static void sendTempFile(java.io.File file, javax.servlet.http.HttpServletResponse response, java.lang.String mimeType) throws java.io.IOException {
		if (file.exists()) {
			java.io.BufferedInputStream bis = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
			if (mimeType != null) {
				response.setHeader("Content-Type", mimeType);
			}
			response.setHeader("Content-Length", java.lang.String.valueOf(file.length()));
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.ENGLISH);
			sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
			response.setHeader("Last-Modified", sdf.format(new java.util.Date(file.lastModified())));
			java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(response.getOutputStream());
			byte[] input = new byte[1024];
			boolean eof = false;
			while (!eof) {
				int length = bis.read(input);
				if (length == (-1)) {
					eof = true;
				}else {
					bos.write(input, 0, length);
				}
			} 
			bos.flush();
			bis.close();
			bos.close();
		}else {
			throw new java.io.FileNotFoundException(file.getAbsolutePath());
		}
		return ;
	}

	public static java.lang.String searchReplace(java.lang.String inputString, java.lang.String searchString, java.lang.String replaceString) {
		int i = inputString.indexOf(searchString);
		if (i == (-1)) {
			return inputString;
		}
		java.lang.String r = "";
		r += (inputString.substring(0, i)) + replaceString;
		if ((i + (searchString.length())) < (inputString.length())) {
			r += org.jfree.chart.servlet.ServletUtilities.searchReplace(inputString.substring((i + (searchString.length()))), searchString, replaceString);
		}
		return r;
	}
}

