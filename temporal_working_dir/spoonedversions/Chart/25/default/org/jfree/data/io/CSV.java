

package org.jfree.data.io;


public class CSV {
	private char fieldDelimiter;

	private char textDelimiter;

	public CSV() {
		this(',', '"');
	}

	public CSV(char fieldDelimiter, char textDelimiter) {
		org.jfree.data.io.CSV.this.fieldDelimiter = fieldDelimiter;
		org.jfree.data.io.CSV.this.textDelimiter = textDelimiter;
	}

	public org.jfree.data.category.CategoryDataset readCategoryDataset(java.io.Reader in) throws java.io.IOException {
		org.jfree.data.category.DefaultCategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
		java.io.BufferedReader reader = new java.io.BufferedReader(in);
		java.util.List columnKeys = null;
		int lineIndex = 0;
		java.lang.String line = reader.readLine();
		while (line != null) {
			if (lineIndex == 0) {
				columnKeys = extractColumnKeys(line);
			}else {
				extractRowKeyAndData(line, dataset, columnKeys);
			}
			line = reader.readLine();
			lineIndex++;
		} 
		return dataset;
	}

	private java.util.List extractColumnKeys(java.lang.String line) {
		java.util.List keys = new java.util.ArrayList();
		int fieldIndex = 0;
		int start = 0;
		for (int i = 0; i < (line.length()); i++) {
			if ((line.charAt(i)) == (org.jfree.data.io.CSV.this.fieldDelimiter)) {
				if (fieldIndex > 0) {
					java.lang.String key = line.substring(start, i);
					keys.add(removeStringDelimiters(key));
				}
				start = i + 1;
				fieldIndex++;
			}
		}
		java.lang.String key = line.substring(start, line.length());
		keys.add(removeStringDelimiters(key));
		return keys;
	}

	private void extractRowKeyAndData(java.lang.String line, org.jfree.data.category.DefaultCategoryDataset dataset, java.util.List columnKeys) {
		java.lang.Comparable rowKey = null;
		int fieldIndex = 0;
		int start = 0;
		for (int i = 0; i < (line.length()); i++) {
			if ((line.charAt(i)) == (org.jfree.data.io.CSV.this.fieldDelimiter)) {
				if (fieldIndex == 0) {
					java.lang.String key = line.substring(start, i);
					rowKey = removeStringDelimiters(key);
				}else {
					java.lang.Double value = java.lang.Double.valueOf(removeStringDelimiters(line.substring(start, i)));
					dataset.addValue(value, rowKey, ((java.lang.Comparable) (columnKeys.get((fieldIndex - 1)))));
				}
				start = i + 1;
				fieldIndex++;
			}
		}
		java.lang.Double value = java.lang.Double.valueOf(removeStringDelimiters(line.substring(start, line.length())));
		dataset.addValue(value, rowKey, ((java.lang.Comparable) (columnKeys.get((fieldIndex - 1)))));
	}

	private java.lang.String removeStringDelimiters(java.lang.String key) {
		java.lang.String k = key.trim();
		if ((k.charAt(0)) == (org.jfree.data.io.CSV.this.textDelimiter)) {
			k = k.substring(1);
		}
		if ((k.charAt(((k.length()) - 1))) == (org.jfree.data.io.CSV.this.textDelimiter)) {
			k = k.substring(0, ((k.length()) - 1));
		}
		return k;
	}
}

