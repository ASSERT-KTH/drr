

package org.jfree.data.xml;


public class PieDatasetHandler extends org.jfree.data.xml.RootHandler implements org.jfree.data.xml.DatasetTags {
	private org.jfree.data.pie.DefaultPieDataset dataset;

	public PieDatasetHandler() {
		org.jfree.data.xml.PieDatasetHandler.this.dataset = null;
	}

	public org.jfree.data.pie.PieDataset getDataset() {
		return org.jfree.data.xml.PieDatasetHandler.this.dataset;
	}

	public void addItem(java.lang.Comparable key, java.lang.Number value) {
		org.jfree.data.xml.PieDatasetHandler.this.dataset.setValue(key, value);
	}

	public void startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
		org.xml.sax.helpers.DefaultHandler current = getCurrentHandler();
		if (current != (org.jfree.data.xml.PieDatasetHandler.this)) {
			current.startElement(namespaceURI, localName, qName, atts);
		}else
			if (qName.equals(org.jfree.data.xml.DatasetTags.PIEDATASET_TAG)) {
				org.jfree.data.xml.PieDatasetHandler.this.dataset = new org.jfree.data.pie.DefaultPieDataset();
			}else
				if (qName.equals(org.jfree.data.xml.DatasetTags.ITEM_TAG)) {
					org.jfree.data.xml.ItemHandler subhandler = new org.jfree.data.xml.ItemHandler(org.jfree.data.xml.PieDatasetHandler.this, org.jfree.data.xml.PieDatasetHandler.this);
					getSubHandlers().push(subhandler);
					subhandler.startElement(namespaceURI, localName, qName, atts);
				}
			
		
	}

	public void endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
		org.xml.sax.helpers.DefaultHandler current = getCurrentHandler();
		if (current != (org.jfree.data.xml.PieDatasetHandler.this)) {
			current.endElement(namespaceURI, localName, qName);
		}
	}
}

