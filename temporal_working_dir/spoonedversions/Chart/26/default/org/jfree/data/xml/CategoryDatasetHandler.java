

package org.jfree.data.xml;


public class CategoryDatasetHandler extends org.jfree.data.xml.RootHandler implements org.jfree.data.xml.DatasetTags {
	private org.jfree.data.category.DefaultCategoryDataset dataset;

	public CategoryDatasetHandler() {
		org.jfree.data.xml.CategoryDatasetHandler.this.dataset = null;
	}

	public org.jfree.data.category.CategoryDataset getDataset() {
		return org.jfree.data.xml.CategoryDatasetHandler.this.dataset;
	}

	public void addItem(java.lang.Comparable rowKey, java.lang.Comparable columnKey, java.lang.Number value) {
		org.jfree.data.xml.CategoryDatasetHandler.this.dataset.addValue(value, rowKey, columnKey);
	}

	public void startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
		org.xml.sax.helpers.DefaultHandler current = getCurrentHandler();
		if (current != (org.jfree.data.xml.CategoryDatasetHandler.this)) {
			current.startElement(namespaceURI, localName, qName, atts);
		}else
			if (qName.equals(org.jfree.data.xml.DatasetTags.CATEGORYDATASET_TAG)) {
				org.jfree.data.xml.CategoryDatasetHandler.this.dataset = new org.jfree.data.category.DefaultCategoryDataset();
			}else
				if (qName.equals(org.jfree.data.xml.DatasetTags.SERIES_TAG)) {
					org.jfree.data.xml.CategorySeriesHandler subhandler = new org.jfree.data.xml.CategorySeriesHandler(org.jfree.data.xml.CategoryDatasetHandler.this);
					getSubHandlers().push(subhandler);
					subhandler.startElement(namespaceURI, localName, qName, atts);
				}else {
					throw new org.xml.sax.SAXException(("Element not recognised: " + qName));
				}
			
		
	}

	public void endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
		org.xml.sax.helpers.DefaultHandler current = getCurrentHandler();
		if (current != (org.jfree.data.xml.CategoryDatasetHandler.this)) {
			current.endElement(namespaceURI, localName, qName);
		}
	}
}

