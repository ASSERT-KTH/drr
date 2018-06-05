

package org.jfree.data.xml;


public class CategorySeriesHandler extends org.xml.sax.helpers.DefaultHandler implements org.jfree.data.xml.DatasetTags {
	private org.jfree.data.xml.RootHandler root;

	private java.lang.Comparable seriesKey;

	private org.jfree.data.DefaultKeyedValues values;

	public CategorySeriesHandler(org.jfree.data.xml.RootHandler root) {
		org.jfree.data.xml.CategorySeriesHandler.this.root = root;
		org.jfree.data.xml.CategorySeriesHandler.this.values = new org.jfree.data.DefaultKeyedValues();
	}

	public void setSeriesKey(java.lang.Comparable key) {
		org.jfree.data.xml.CategorySeriesHandler.this.seriesKey = key;
	}

	public void addItem(java.lang.Comparable key, final java.lang.Number value) {
		org.jfree.data.xml.CategorySeriesHandler.this.values.addValue(key, value);
	}

	public void startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
		if (qName.equals(org.jfree.data.xml.DatasetTags.SERIES_TAG)) {
			setSeriesKey(atts.getValue("name"));
			org.jfree.data.xml.ItemHandler subhandler = new org.jfree.data.xml.ItemHandler(org.jfree.data.xml.CategorySeriesHandler.this.root, org.jfree.data.xml.CategorySeriesHandler.this);
			org.jfree.data.xml.CategorySeriesHandler.this.root.pushSubHandler(subhandler);
		}else
			if (qName.equals(org.jfree.data.xml.DatasetTags.ITEM_TAG)) {
				org.jfree.data.xml.ItemHandler subhandler = new org.jfree.data.xml.ItemHandler(org.jfree.data.xml.CategorySeriesHandler.this.root, org.jfree.data.xml.CategorySeriesHandler.this);
				org.jfree.data.xml.CategorySeriesHandler.this.root.pushSubHandler(subhandler);
				subhandler.startElement(namespaceURI, localName, qName, atts);
			}else {
				throw new org.xml.sax.SAXException(("Expecting <Series> or <Item> tag...found " + qName));
			}
		
	}

	public void endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName) {
		if ((org.jfree.data.xml.CategorySeriesHandler.this.root) instanceof org.jfree.data.xml.CategoryDatasetHandler) {
			org.jfree.data.xml.CategoryDatasetHandler handler = ((org.jfree.data.xml.CategoryDatasetHandler) (org.jfree.data.xml.CategorySeriesHandler.this.root));
			java.util.Iterator iterator = org.jfree.data.xml.CategorySeriesHandler.this.values.getKeys().iterator();
			while (iterator.hasNext()) {
				java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
				java.lang.Number value = org.jfree.data.xml.CategorySeriesHandler.this.values.getValue(key);
				handler.addItem(org.jfree.data.xml.CategorySeriesHandler.this.seriesKey, key, value);
			} 
			org.jfree.data.xml.CategorySeriesHandler.this.root.popSubHandler();
		}
	}
}

