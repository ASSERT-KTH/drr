

package org.apache.commons.lang;


class Entities {
	private static final java.lang.String[][] BASIC_ARRAY = new java.lang.String[][]{ new java.lang.String[]{ "quot" , "34" } , new java.lang.String[]{ "amp" , "38" } , new java.lang.String[]{ "lt" , "60" } , new java.lang.String[]{ "gt" , "62" } };

	private static final java.lang.String[][] APOS_ARRAY = new java.lang.String[][]{ new java.lang.String[]{ "apos" , "39" } };

	static final java.lang.String[][] ISO8859_1_ARRAY = new java.lang.String[][]{ new java.lang.String[]{ "nbsp" , "160" } , new java.lang.String[]{ "iexcl" , "161" } , new java.lang.String[]{ "cent" , "162" } , new java.lang.String[]{ "pound" , "163" } , new java.lang.String[]{ "curren" , "164" } , new java.lang.String[]{ "yen" , "165" } , new java.lang.String[]{ "brvbar" , "166" } , new java.lang.String[]{ "sect" , "167" } , new java.lang.String[]{ "uml" , "168" } , new java.lang.String[]{ "copy" , "169" } , new java.lang.String[]{ "ordf" , "170" } , new java.lang.String[]{ "laquo" , "171" } , new java.lang.String[]{ "not" , "172" } , new java.lang.String[]{ "shy" , "173" } , new java.lang.String[]{ "reg" , "174" } , new java.lang.String[]{ "macr" , "175" } , new java.lang.String[]{ "deg" , "176" } , new java.lang.String[]{ "plusmn" , "177" } , new java.lang.String[]{ "sup2" , "178" } , new java.lang.String[]{ "sup3" , "179" } , new java.lang.String[]{ "acute" , "180" } , new java.lang.String[]{ "micro" , "181" } , new java.lang.String[]{ "para" , "182" } , new java.lang.String[]{ "middot" , "183" } , new java.lang.String[]{ "cedil" , "184" } , new java.lang.String[]{ "sup1" , "185" } , new java.lang.String[]{ "ordm" , "186" } , new java.lang.String[]{ "raquo" , "187" } , new java.lang.String[]{ "frac14" , "188" } , new java.lang.String[]{ "frac12" , "189" } , new java.lang.String[]{ "frac34" , "190" } , new java.lang.String[]{ "iquest" , "191" } , new java.lang.String[]{ "Agrave" , "192" } , new java.lang.String[]{ "Aacute" , "193" } , new java.lang.String[]{ "Acirc" , "194" } , new java.lang.String[]{ "Atilde" , "195" } , new java.lang.String[]{ "Auml" , "196" } , new java.lang.String[]{ "Aring" , "197" } , new java.lang.String[]{ "AElig" , "198" } , new java.lang.String[]{ "Ccedil" , "199" } , new java.lang.String[]{ "Egrave" , "200" } , new java.lang.String[]{ "Eacute" , "201" } , new java.lang.String[]{ "Ecirc" , "202" } , new java.lang.String[]{ "Euml" , "203" } , new java.lang.String[]{ "Igrave" , "204" } , new java.lang.String[]{ "Iacute" , "205" } , new java.lang.String[]{ "Icirc" , "206" } , new java.lang.String[]{ "Iuml" , "207" } , new java.lang.String[]{ "ETH" , "208" } , new java.lang.String[]{ "Ntilde" , "209" } , new java.lang.String[]{ "Ograve" , "210" } , new java.lang.String[]{ "Oacute" , "211" } , new java.lang.String[]{ "Ocirc" , "212" } , new java.lang.String[]{ "Otilde" , "213" } , new java.lang.String[]{ "Ouml" , "214" } , new java.lang.String[]{ "times" , "215" } , new java.lang.String[]{ "Oslash" , "216" } , new java.lang.String[]{ "Ugrave" , "217" } , new java.lang.String[]{ "Uacute" , "218" } , new java.lang.String[]{ "Ucirc" , "219" } , new java.lang.String[]{ "Uuml" , "220" } , new java.lang.String[]{ "Yacute" , "221" } , new java.lang.String[]{ "THORN" , "222" } , new java.lang.String[]{ "szlig" , "223" } , new java.lang.String[]{ "agrave" , "224" } , new java.lang.String[]{ "aacute" , "225" } , new java.lang.String[]{ "acirc" , "226" } , new java.lang.String[]{ "atilde" , "227" } , new java.lang.String[]{ "auml" , "228" } , new java.lang.String[]{ "aring" , "229" } , new java.lang.String[]{ "aelig" , "230" } , new java.lang.String[]{ "ccedil" , "231" } , new java.lang.String[]{ "egrave" , "232" } , new java.lang.String[]{ "eacute" , "233" } , new java.lang.String[]{ "ecirc" , "234" } , new java.lang.String[]{ "euml" , "235" } , new java.lang.String[]{ "igrave" , "236" } , new java.lang.String[]{ "iacute" , "237" } , new java.lang.String[]{ "icirc" , "238" } , new java.lang.String[]{ "iuml" , "239" } , new java.lang.String[]{ "eth" , "240" } , new java.lang.String[]{ "ntilde" , "241" } , new java.lang.String[]{ "ograve" , "242" } , new java.lang.String[]{ "oacute" , "243" } , new java.lang.String[]{ "ocirc" , "244" } , new java.lang.String[]{ "otilde" , "245" } , new java.lang.String[]{ "ouml" , "246" } , new java.lang.String[]{ "divide" , "247" } , new java.lang.String[]{ "oslash" , "248" } , new java.lang.String[]{ "ugrave" , "249" } , new java.lang.String[]{ "uacute" , "250" } , new java.lang.String[]{ "ucirc" , "251" } , new java.lang.String[]{ "uuml" , "252" } , new java.lang.String[]{ "yacute" , "253" } , new java.lang.String[]{ "thorn" , "254" } , new java.lang.String[]{ "yuml" , "255" } };

	static final java.lang.String[][] HTML40_ARRAY = new java.lang.String[][]{ new java.lang.String[]{ "fnof" , "402" } , new java.lang.String[]{ "Alpha" , "913" } , new java.lang.String[]{ "Beta" , "914" } , new java.lang.String[]{ "Gamma" , "915" } , new java.lang.String[]{ "Delta" , "916" } , new java.lang.String[]{ "Epsilon" , "917" } , new java.lang.String[]{ "Zeta" , "918" } , new java.lang.String[]{ "Eta" , "919" } , new java.lang.String[]{ "Theta" , "920" } , new java.lang.String[]{ "Iota" , "921" } , new java.lang.String[]{ "Kappa" , "922" } , new java.lang.String[]{ "Lambda" , "923" } , new java.lang.String[]{ "Mu" , "924" } , new java.lang.String[]{ "Nu" , "925" } , new java.lang.String[]{ "Xi" , "926" } , new java.lang.String[]{ "Omicron" , "927" } , new java.lang.String[]{ "Pi" , "928" } , new java.lang.String[]{ "Rho" , "929" } , new java.lang.String[]{ "Sigma" , "931" } , new java.lang.String[]{ "Tau" , "932" } , new java.lang.String[]{ "Upsilon" , "933" } , new java.lang.String[]{ "Phi" , "934" } , new java.lang.String[]{ "Chi" , "935" } , new java.lang.String[]{ "Psi" , "936" } , new java.lang.String[]{ "Omega" , "937" } , new java.lang.String[]{ "alpha" , "945" } , new java.lang.String[]{ "beta" , "946" } , new java.lang.String[]{ "gamma" , "947" } , new java.lang.String[]{ "delta" , "948" } , new java.lang.String[]{ "epsilon" , "949" } , new java.lang.String[]{ "zeta" , "950" } , new java.lang.String[]{ "eta" , "951" } , new java.lang.String[]{ "theta" , "952" } , new java.lang.String[]{ "iota" , "953" } , new java.lang.String[]{ "kappa" , "954" } , new java.lang.String[]{ "lambda" , "955" } , new java.lang.String[]{ "mu" , "956" } , new java.lang.String[]{ "nu" , "957" } , new java.lang.String[]{ "xi" , "958" } , new java.lang.String[]{ "omicron" , "959" } , new java.lang.String[]{ "pi" , "960" } , new java.lang.String[]{ "rho" , "961" } , new java.lang.String[]{ "sigmaf" , "962" } , new java.lang.String[]{ "sigma" , "963" } , new java.lang.String[]{ "tau" , "964" } , new java.lang.String[]{ "upsilon" , "965" } , new java.lang.String[]{ "phi" , "966" } , new java.lang.String[]{ "chi" , "967" } , new java.lang.String[]{ "psi" , "968" } , new java.lang.String[]{ "omega" , "969" } , new java.lang.String[]{ "thetasym" , "977" } , new java.lang.String[]{ "upsih" , "978" } , new java.lang.String[]{ "piv" , "982" } , new java.lang.String[]{ "bull" , "8226" } , new java.lang.String[]{ "hellip" , "8230" } , new java.lang.String[]{ "prime" , "8242" } , new java.lang.String[]{ "Prime" , "8243" } , new java.lang.String[]{ "oline" , "8254" } , new java.lang.String[]{ "frasl" , "8260" } , new java.lang.String[]{ "weierp" , "8472" } , new java.lang.String[]{ "image" , "8465" } , new java.lang.String[]{ "real" , "8476" } , new java.lang.String[]{ "trade" , "8482" } , new java.lang.String[]{ "alefsym" , "8501" } , new java.lang.String[]{ "larr" , "8592" } , new java.lang.String[]{ "uarr" , "8593" } , new java.lang.String[]{ "rarr" , "8594" } , new java.lang.String[]{ "darr" , "8595" } , new java.lang.String[]{ "harr" , "8596" } , new java.lang.String[]{ "crarr" , "8629" } , new java.lang.String[]{ "lArr" , "8656" } , new java.lang.String[]{ "uArr" , "8657" } , new java.lang.String[]{ "rArr" , "8658" } , new java.lang.String[]{ "dArr" , "8659" } , new java.lang.String[]{ "hArr" , "8660" } , new java.lang.String[]{ "forall" , "8704" } , new java.lang.String[]{ "part" , "8706" } , new java.lang.String[]{ "exist" , "8707" } , new java.lang.String[]{ "empty" , "8709" } , new java.lang.String[]{ "nabla" , "8711" } , new java.lang.String[]{ "isin" , "8712" } , new java.lang.String[]{ "notin" , "8713" } , new java.lang.String[]{ "ni" , "8715" } , new java.lang.String[]{ "prod" , "8719" } , new java.lang.String[]{ "sum" , "8721" } , new java.lang.String[]{ "minus" , "8722" } , new java.lang.String[]{ "lowast" , "8727" } , new java.lang.String[]{ "radic" , "8730" } , new java.lang.String[]{ "prop" , "8733" } , new java.lang.String[]{ "infin" , "8734" } , new java.lang.String[]{ "ang" , "8736" } , new java.lang.String[]{ "and" , "8743" } , new java.lang.String[]{ "or" , "8744" } , new java.lang.String[]{ "cap" , "8745" } , new java.lang.String[]{ "cup" , "8746" } , new java.lang.String[]{ "int" , "8747" } , new java.lang.String[]{ "there4" , "8756" } , new java.lang.String[]{ "sim" , "8764" } , new java.lang.String[]{ "cong" , "8773" } , new java.lang.String[]{ "asymp" , "8776" } , new java.lang.String[]{ "ne" , "8800" } , new java.lang.String[]{ "equiv" , "8801" } , new java.lang.String[]{ "le" , "8804" } , new java.lang.String[]{ "ge" , "8805" } , new java.lang.String[]{ "sub" , "8834" } , new java.lang.String[]{ "sup" , "8835" } , new java.lang.String[]{ "sube" , "8838" } , new java.lang.String[]{ "supe" , "8839" } , new java.lang.String[]{ "oplus" , "8853" } , new java.lang.String[]{ "otimes" , "8855" } , new java.lang.String[]{ "perp" , "8869" } , new java.lang.String[]{ "sdot" , "8901" } , new java.lang.String[]{ "lceil" , "8968" } , new java.lang.String[]{ "rceil" , "8969" } , new java.lang.String[]{ "lfloor" , "8970" } , new java.lang.String[]{ "rfloor" , "8971" } , new java.lang.String[]{ "lang" , "9001" } , new java.lang.String[]{ "rang" , "9002" } , new java.lang.String[]{ "loz" , "9674" } , new java.lang.String[]{ "spades" , "9824" } , new java.lang.String[]{ "clubs" , "9827" } , new java.lang.String[]{ "hearts" , "9829" } , new java.lang.String[]{ "diams" , "9830" } , new java.lang.String[]{ "OElig" , "338" } , new java.lang.String[]{ "oelig" , "339" } , new java.lang.String[]{ "Scaron" , "352" } , new java.lang.String[]{ "scaron" , "353" } , new java.lang.String[]{ "Yuml" , "376" } , new java.lang.String[]{ "circ" , "710" } , new java.lang.String[]{ "tilde" , "732" } , new java.lang.String[]{ "ensp" , "8194" } , new java.lang.String[]{ "emsp" , "8195" } , new java.lang.String[]{ "thinsp" , "8201" } , new java.lang.String[]{ "zwnj" , "8204" } , new java.lang.String[]{ "zwj" , "8205" } , new java.lang.String[]{ "lrm" , "8206" } , new java.lang.String[]{ "rlm" , "8207" } , new java.lang.String[]{ "ndash" , "8211" } , new java.lang.String[]{ "mdash" , "8212" } , new java.lang.String[]{ "lsquo" , "8216" } , new java.lang.String[]{ "rsquo" , "8217" } , new java.lang.String[]{ "sbquo" , "8218" } , new java.lang.String[]{ "ldquo" , "8220" } , new java.lang.String[]{ "rdquo" , "8221" } , new java.lang.String[]{ "bdquo" , "8222" } , new java.lang.String[]{ "dagger" , "8224" } , new java.lang.String[]{ "Dagger" , "8225" } , new java.lang.String[]{ "permil" , "8240" } , new java.lang.String[]{ "lsaquo" , "8249" } , new java.lang.String[]{ "rsaquo" , "8250" } , new java.lang.String[]{ "euro" , "8364" } };

	public static final org.apache.commons.lang.Entities XML;

	public static final org.apache.commons.lang.Entities HTML32;

	public static final org.apache.commons.lang.Entities HTML40;

	static {
		XML = new org.apache.commons.lang.Entities();
		org.apache.commons.lang.Entities.XML.addEntities(org.apache.commons.lang.Entities.BASIC_ARRAY);
		org.apache.commons.lang.Entities.XML.addEntities(org.apache.commons.lang.Entities.APOS_ARRAY);
	}

	static {
		HTML32 = new org.apache.commons.lang.Entities();
		org.apache.commons.lang.Entities.HTML32.addEntities(org.apache.commons.lang.Entities.BASIC_ARRAY);
		org.apache.commons.lang.Entities.HTML32.addEntities(org.apache.commons.lang.Entities.ISO8859_1_ARRAY);
	}

	static {
		HTML40 = new org.apache.commons.lang.Entities();
		org.apache.commons.lang.Entities.fillWithHtml40Entities(org.apache.commons.lang.Entities.HTML40);
	}

	static void fillWithHtml40Entities(org.apache.commons.lang.Entities entities) {
		entities.addEntities(org.apache.commons.lang.Entities.BASIC_ARRAY);
		entities.addEntities(org.apache.commons.lang.Entities.ISO8859_1_ARRAY);
		entities.addEntities(org.apache.commons.lang.Entities.HTML40_ARRAY);
	}

	static interface EntityMap {
		void add(java.lang.String name, int value);

		java.lang.String name(int value);

		int value(java.lang.String name);
	}

	static class PrimitiveEntityMap implements org.apache.commons.lang.Entities.EntityMap {
		private java.util.Map mapNameToValue = new java.util.HashMap();

		private org.apache.commons.lang.IntHashMap mapValueToName = new org.apache.commons.lang.IntHashMap();

		public void add(java.lang.String name, int value) {
			mapNameToValue.put(name, new java.lang.Integer(value));
			mapValueToName.put(value, name);
		}

		public java.lang.String name(int value) {
			return ((java.lang.String) (mapValueToName.get(value)));
		}

		public int value(java.lang.String name) {
			java.lang.Object value = mapNameToValue.get(name);
			if (value == null) {
				return -1;
			}
			return ((java.lang.Integer) (value)).intValue();
		}
	}

	abstract static class MapIntMap implements org.apache.commons.lang.Entities.EntityMap {
		protected java.util.Map mapNameToValue;

		protected java.util.Map mapValueToName;

		public void add(java.lang.String name, int value) {
			mapNameToValue.put(name, new java.lang.Integer(value));
			mapValueToName.put(new java.lang.Integer(value), name);
		}

		public java.lang.String name(int value) {
			return ((java.lang.String) (mapValueToName.get(new java.lang.Integer(value))));
		}

		public int value(java.lang.String name) {
			java.lang.Object value = mapNameToValue.get(name);
			if (value == null) {
				return -1;
			}
			return ((java.lang.Integer) (value)).intValue();
		}
	}

	static class HashEntityMap extends org.apache.commons.lang.Entities.MapIntMap {
		public HashEntityMap() {
			mapNameToValue = new java.util.HashMap();
			mapValueToName = new java.util.HashMap();
		}
	}

	static class TreeEntityMap extends org.apache.commons.lang.Entities.MapIntMap {
		public TreeEntityMap() {
			mapNameToValue = new java.util.TreeMap();
			mapValueToName = new java.util.TreeMap();
		}
	}

	static class LookupEntityMap extends org.apache.commons.lang.Entities.PrimitiveEntityMap {
		private java.lang.String[] lookupTable;

		private int LOOKUP_TABLE_SIZE = 256;

		public java.lang.String name(int value) {
			if (value < (LOOKUP_TABLE_SIZE)) {
				return lookupTable()[value];
			}
			return super.name(value);
		}

		private java.lang.String[] lookupTable() {
			if ((lookupTable) == null) {
				createLookupTable();
			}
			return lookupTable;
		}

		private void createLookupTable() {
			lookupTable = new java.lang.String[LOOKUP_TABLE_SIZE];
			for (int i = 0; i < (LOOKUP_TABLE_SIZE); ++i) {
				lookupTable[i] = super.name(i);
			}
		}
	}

	static class ArrayEntityMap implements org.apache.commons.lang.Entities.EntityMap {
		protected int growBy = 100;

		protected int size = 0;

		protected java.lang.String[] names;

		protected int[] values;

		public ArrayEntityMap() {
			names = new java.lang.String[growBy];
			values = new int[growBy];
		}

		public ArrayEntityMap(int growBy) {
			org.apache.commons.lang.Entities.ArrayEntityMap.this.growBy = growBy;
			names = new java.lang.String[growBy];
			values = new int[growBy];
		}

		public void add(java.lang.String name, int value) {
			ensureCapacity(((size) + 1));
			names[size] = name;
			values[size] = value;
			(size)++;
		}

		protected void ensureCapacity(int capacity) {
			if (capacity > (names.length)) {
				int newSize = java.lang.Math.max(capacity, ((size) + (growBy)));
				java.lang.String[] newNames = new java.lang.String[newSize];
				java.lang.System.arraycopy(names, 0, newNames, 0, size);
				names = newNames;
				int[] newValues = new int[newSize];
				java.lang.System.arraycopy(values, 0, newValues, 0, size);
				values = newValues;
			}
		}

		public java.lang.String name(int value) {
			for (int i = 0; i < (size); ++i) {
				if ((values[i]) == value) {
					return names[i];
				}
			}
			return null;
		}

		public int value(java.lang.String name) {
			for (int i = 0; i < (size); ++i) {
				if (names[i].equals(name)) {
					return values[i];
				}
			}
			return -1;
		}
	}

	static class BinaryEntityMap extends org.apache.commons.lang.Entities.ArrayEntityMap {
		public BinaryEntityMap() {
			super();
		}

		public BinaryEntityMap(int growBy) {
			super(growBy);
		}

		private int binarySearch(int key) {
			int low = 0;
			int high = (size) - 1;
			while (low <= high) {
				int mid = (low + high) >> 1;
				int midVal = values[mid];
				if (midVal < key) {
					low = mid + 1;
				}else
					if (midVal > key) {
						high = mid - 1;
					}else {
						return mid;
					}
				
			} 
			return -(low + 1);
		}

		public void add(java.lang.String name, int value) {
			ensureCapacity(((size) + 1));
			int insertAt = binarySearch(value);
			if (insertAt > 0) {
				return ;
			}
			insertAt = -(insertAt + 1);
			java.lang.System.arraycopy(values, insertAt, values, (insertAt + 1), ((size) - insertAt));
			values[insertAt] = value;
			java.lang.System.arraycopy(names, insertAt, names, (insertAt + 1), ((size) - insertAt));
			names[insertAt] = name;
			(size)++;
		}

		public java.lang.String name(int value) {
			int index = binarySearch(value);
			if (index < 0) {
				return null;
			}
			return names[index];
		}
	}

	org.apache.commons.lang.Entities.EntityMap map = new org.apache.commons.lang.Entities.LookupEntityMap();

	public void addEntities(java.lang.String[][] entityArray) {
		for (int i = 0; i < (entityArray.length); ++i) {
			addEntity(entityArray[i][0], java.lang.Integer.parseInt(entityArray[i][1]));
		}
	}

	public void addEntity(java.lang.String name, int value) {
		map.add(name, value);
	}

	public java.lang.String entityName(int value) {
		return map.name(value);
	}

	public int entityValue(java.lang.String name) {
		return map.value(name);
	}

	public java.lang.String escape(java.lang.String str) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer(((str.length()) * 2));
		int i;
		for (i = 0; i < (str.length()); ++i) {
			char ch = str.charAt(i);
			java.lang.String entityName = org.apache.commons.lang.Entities.this.entityName(ch);
			if (entityName == null) {
				if (ch > 127) {
					int intValue = ch;
					buf.append("&#");
					buf.append(intValue);
					buf.append(';');
				}else {
					buf.append(ch);
				}
			}else {
				buf.append('&');
				buf.append(entityName);
				buf.append(';');
			}
		}
		return buf.toString();
	}

	public void escape(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			java.lang.String entityName = org.apache.commons.lang.Entities.this.entityName(c);
			if (entityName == null) {
				if (c > 127) {
					writer.write("&#");
					writer.write(java.lang.Integer.toString(c, 10));
					writer.write(';');
				}else {
					writer.write(c);
				}
			}else {
				writer.write('&');
				writer.write(entityName);
				writer.write(';');
			}
		}
	}

	public java.lang.String unescape(java.lang.String str) {
		int firstAmp = str.indexOf('&');
		if (firstAmp < 0) {
			return str;
		}
		java.lang.StringBuffer buf = new java.lang.StringBuffer(str.length());
		buf.append(str.substring(0, firstAmp));
		for (int i = firstAmp; i < (str.length()); ++i) {
			char ch = str.charAt(i);
			if (ch == '&') {
				int semi = str.indexOf(';', (i + 1));
				if (semi == (-1)) {
					buf.append(ch);
					continue;
				}
				int amph = str.indexOf('&', (i + 1));
				if ((amph != (-1)) && (amph < semi)) {
					buf.append(ch);
					continue;
				}
				java.lang.String entityName = str.substring((i + 1), semi);
				int entityValue;
				if ((entityName.length()) == 0) {
					entityValue = -1;
				}else
					if ((entityName.charAt(0)) == '#') {
						if ((entityName.length()) == 1) {
							entityValue = -1;
						}else {
							char charAt1 = entityName.charAt(1);
							try {
								if ((charAt1 == 'x') || (charAt1 == 'X')) {
									entityValue = java.lang.Integer.valueOf(entityName.substring(2), 16).intValue();
								}else {
									entityValue = java.lang.Integer.parseInt(entityName.substring(1));
								}
							} catch (java.lang.NumberFormatException ex) {
								entityValue = -1;
							}
						}
					}else {
						entityValue = org.apache.commons.lang.Entities.this.entityValue(entityName);
					}
				
				if (entityValue == (-1)) {
					buf.append('&');
					buf.append(entityName);
					buf.append(';');
				}else {
					buf.append(((char) (entityValue)));
				}
				i = semi;
			}else {
				buf.append(ch);
			}
		}
		return buf.toString();
	}

	public void unescape(java.io.Writer writer, java.lang.String string) throws java.io.IOException {
		int firstAmp = string.indexOf('&');
		if (firstAmp < 0) {
			writer.write(string);
			return ;
		}
		writer.write(string, 0, firstAmp);
		int len = string.length();
		for (int i = firstAmp; i < len; i++) {
			char c = string.charAt(i);
			if (c == '&') {
				int nextIdx = i + 1;
				int semiColonIdx = string.indexOf(';', nextIdx);
				if (semiColonIdx == (-1)) {
					writer.write(c);
					continue;
				}
				int amphersandIdx = string.indexOf('&', (i + 1));
				if ((amphersandIdx != (-1)) && (amphersandIdx < semiColonIdx)) {
					writer.write(c);
					continue;
				}
				java.lang.String entityContent = string.substring(nextIdx, semiColonIdx);
				int entityValue = -1;
				int entityContentLen = entityContent.length();
				if (entityContentLen > 0) {
					if ((entityContent.charAt(0)) == '#') {
						if (entityContentLen > 1) {
							char isHexChar = entityContent.charAt(1);
							try {
								switch (isHexChar) {
									case 'X' :
									case 'x' :
										{
											entityValue = java.lang.Integer.parseInt(entityContent.substring(2), 16);
										}
									default :
										{
											entityValue = java.lang.Integer.parseInt(entityContent.substring(1), 10);
										}
								}
							} catch (java.lang.NumberFormatException e) {
							}
						}
					}else {
						entityValue = org.apache.commons.lang.Entities.this.entityValue(entityContent);
					}
				}
				if (entityValue == (-1)) {
					writer.write('&');
					writer.write(entityContent);
					writer.write(';');
				}else {
					writer.write(entityValue);
				}
				i = semiColonIdx;
			}else {
				writer.write(c);
			}
		}
	}
}

