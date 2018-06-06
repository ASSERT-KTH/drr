

package org.jfree.chart.servlet;


public class DisplayChart extends javax.servlet.http.HttpServlet {
	public DisplayChart() {
		super();
	}

	public void init() throws javax.servlet.ServletException {
		return ;
	}

	public void service(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
		javax.servlet.http.HttpSession session = request.getSession();
		java.lang.String filename = request.getParameter("filename");
		if (filename == null) {
			throw new javax.servlet.ServletException("Parameter 'filename' must be supplied");
		}
		filename = org.jfree.chart.servlet.ServletUtilities.searchReplace(filename, "..", "");
		java.io.File file = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"), filename);
		if (!(file.exists())) {
			throw new javax.servlet.ServletException((("File '" + (file.getAbsolutePath())) + "' does not exist"));
		}
		boolean isChartInUserList = false;
		org.jfree.chart.servlet.ChartDeleter chartDeleter = ((org.jfree.chart.servlet.ChartDeleter) (session.getAttribute("JFreeChart_Deleter")));
		if (chartDeleter != null) {
			isChartInUserList = chartDeleter.isChartAvailable(filename);
		}
		boolean isChartPublic = false;
		if ((filename.length()) >= 6) {
			if (filename.substring(0, 6).equals("public")) {
				isChartPublic = true;
			}
		}
		boolean isOneTimeChart = false;
		if (filename.startsWith(org.jfree.chart.servlet.ServletUtilities.getTempOneTimeFilePrefix())) {
			isOneTimeChart = true;
		}
		if ((isChartInUserList || isChartPublic) || isOneTimeChart) {
			org.jfree.chart.servlet.ServletUtilities.sendTempFile(file, response);
			if (isOneTimeChart) {
				file.delete();
			}
		}else {
			throw new javax.servlet.ServletException("Chart image not found");
		}
		return ;
	}
}

