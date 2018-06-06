

package org.jfree.data.xml;


public class ItemHandler extends org.xml.sax.helpers.DefaultHandler implements org.jfree.data.xml.DatasetTags {
	private org.jfree.data.xml.RootHandler root;

	private org.xml.sax.helpers.DefaultHandler parent;

	private java.lang.Comparable key;

	private java.lang.Number value;

	public ItemHandler(org.jfree.data.xml.RootHandler root, org.xml.sax.helpers.DefaultHandler parent) {
		org.jfree.data.xml.ItemHandler.this.root = root;
		org.jfree.data.xml.ItemHandler.this.parent = parent;
		org.jfree.data.xml.ItemHandler.this.key = null;
		org.jfree.data.xml.ItemHandler.this.value = null;
	}

	public java.lang.Comparable getKey() {
		return org.jfree.data.xml.ItemHandler.this.key;
	}

	public void setKey(java.lang.Comparable key) {
		org.jfree.data.xml.ItemHandler.this.key = key;
	}

	public java.lang.Number getValue() {
		return org.jfree.data.xml.ItemHandler.this.value;
	}

	public void setValue(java.lang.Number value) {
		org.jfree.data.xml.ItemHandler.this.value = value;
	}

	public void startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
		if (qName.equals(org.jfree.data.xml.DatasetTags.ITEM_TAG)) {
			org.jfree.data.xml.KeyHandler subhandler = new org.jfree.data.xml.KeyHandler(org.jfree.data.xml.ItemHandler.this.root, org.jfree.data.xml.ItemHandler.this);
			org.jfree.data.xml.ItemHandler.this.root.pushSubHandler(subhandler);
		}else
			if (qName.equals(org.jfree.data.xml.DatasetTags.VALUE_TAG)) {
				org.jfree.data.xml.ValueHandler subhandler = new org.jfree.data.xml.ValueHandler(org.jfree.data.xml.ItemHandler.this.root, org.jfree.data.xml.ItemHandler.this);
				org.jfree.data.xml.ItemHandler.this.root.pushSubHandler(subhandler);
			}else {
				throw new org.xml.sax.SAXException(("Expected <Item> or <Value>...found " + qName));
			}
		
	}

	public void endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName) {
		if ((org.jfree.data.xml.ItemHandler.this.parent) instanceof org.jfree.data.xml.PieDatasetHandler) {
			org.jfree.data.xml.PieDatasetHandler handler = ((org.jfree.data.xml.PieDatasetHandler) (org.jfree.data.xml.ItemHandler.this.parent));
			handler.addItem(org.jfree.data.xml.ItemHandler.this.key, org.jfree.data.xml.ItemHandler.this.value);
			org.jfree.data.xml.ItemHandler.this.root.popSubHandler();
		}else
			if ((org.jfree.data.xml.ItemHandler.this.parent) instanceof org.jfree.data.xml.CategorySeriesHandler) {
				org.jfree.data.xml.CategorySeriesHandler handler = ((org.jfree.data.xml.CategorySeriesHandler) (org.jfree.data.xml.ItemHandler.this.parent));
				handler.addItem(org.jfree.data.xml.ItemHandler.this.key, org.jfree.data.xml.ItemHandler.this.value);
				org.jfree.data.xml.ItemHandler.this.root.popSubHandler();
			}
		
	}
}

