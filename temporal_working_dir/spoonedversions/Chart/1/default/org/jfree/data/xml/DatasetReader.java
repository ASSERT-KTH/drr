

package org.jfree.data.xml;


public class DatasetReader {
	public static org.jfree.data.pie.PieDataset readPieDatasetFromXML(java.io.File file) throws java.io.IOException {
		java.io.InputStream in = new java.io.FileInputStream(file);
		return org.jfree.data.xml.DatasetReader.readPieDatasetFromXML(in);
	}

	public static org.jfree.data.pie.PieDataset readPieDatasetFromXML(java.io.InputStream in) throws java.io.IOException {
		org.jfree.data.pie.PieDataset result = null;
		javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
		try {
			javax.xml.parsers.SAXParser parser = factory.newSAXParser();
			org.jfree.data.xml.PieDatasetHandler handler = new org.jfree.data.xml.PieDatasetHandler();
			parser.parse(in, handler);
			result = handler.getDataset();
		} catch (org.xml.sax.SAXException e) {
			java.lang.System.out.println(e.getMessage());
		} catch (javax.xml.parsers.ParserConfigurationException e2) {
			java.lang.System.out.println(e2.getMessage());
		}
		return result;
	}

	public static org.jfree.data.category.CategoryDataset readCategoryDatasetFromXML(java.io.File file) throws java.io.IOException {
		java.io.InputStream in = new java.io.FileInputStream(file);
		return org.jfree.data.xml.DatasetReader.readCategoryDatasetFromXML(in);
	}

	public static org.jfree.data.category.CategoryDataset readCategoryDatasetFromXML(java.io.InputStream in) throws java.io.IOException {
		org.jfree.data.category.CategoryDataset result = null;
		javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
		try {
			javax.xml.parsers.SAXParser parser = factory.newSAXParser();
			org.jfree.data.xml.CategoryDatasetHandler handler = new org.jfree.data.xml.CategoryDatasetHandler();
			parser.parse(in, handler);
			result = handler.getDataset();
		} catch (org.xml.sax.SAXException e) {
			java.lang.System.out.println(e.getMessage());
		} catch (javax.xml.parsers.ParserConfigurationException e2) {
			java.lang.System.out.println(e2.getMessage());
		}
		return result;
	}
}

