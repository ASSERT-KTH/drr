

package org.apache.commons.lang.builder;


public abstract class ToStringStyle implements java.io.Serializable {
	public static final org.apache.commons.lang.builder.ToStringStyle DEFAULT_STYLE = new org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle();

	public static final org.apache.commons.lang.builder.ToStringStyle MULTI_LINE_STYLE = new org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle();

	public static final org.apache.commons.lang.builder.ToStringStyle NO_FIELD_NAMES_STYLE = new org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle();

	public static final org.apache.commons.lang.builder.ToStringStyle SHORT_PREFIX_STYLE = new org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle();

	public static final org.apache.commons.lang.builder.ToStringStyle SIMPLE_STYLE = new org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle();

	private static java.lang.ThreadLocal registry = new java.lang.ThreadLocal() {
		protected java.lang.Object initialValue() {
			return new java.util.HashSet();
		}
	};

	static java.util.Set getRegistry() {
		return ((java.util.Set) (org.apache.commons.lang.builder.ToStringStyle.registry.get()));
	}

	static boolean isRegistered(java.lang.Object value) {
		return org.apache.commons.lang.builder.ToStringStyle.getRegistry().contains(value);
	}

	static void register(java.lang.Object value) {
		if (value != null) {
			org.apache.commons.lang.builder.ToStringStyle.getRegistry().add(value);
		}
	}

	static void unregister(java.lang.Object value) {
		org.apache.commons.lang.builder.ToStringStyle.getRegistry().remove(value);
	}

	private boolean useFieldNames = true;

	private boolean useClassName = true;

	private boolean useShortClassName = false;

	private boolean useIdentityHashCode = true;

	private java.lang.String contentStart = "[";

	private java.lang.String contentEnd = "]";

	private java.lang.String fieldNameValueSeparator = "=";

	private boolean fieldSeparatorAtStart = false;

	private boolean fieldSeparatorAtEnd = false;

	private java.lang.String fieldSeparator = ",";

	private java.lang.String arrayStart = "{";

	private java.lang.String arraySeparator = ",";

	private boolean arrayContentDetail = true;

	private java.lang.String arrayEnd = "}";

	private boolean defaultFullDetail = true;

	private java.lang.String nullText = "<null>";

	private java.lang.String sizeStartText = "<size=";

	private java.lang.String sizeEndText = ">";

	private java.lang.String summaryObjectStartText = "<";

	private java.lang.String summaryObjectEndText = ">";

	protected ToStringStyle() {
		super();
	}

	public void appendSuper(java.lang.StringBuffer buffer, java.lang.String superToString) {
		appendToString(buffer, superToString);
	}

	public void appendToString(java.lang.StringBuffer buffer, java.lang.String toString) {
		if (toString != null) {
			int pos1 = (toString.indexOf(contentStart)) + (contentStart.length());
			int pos2 = toString.lastIndexOf(contentEnd);
			if (((pos1 != pos2) && (pos1 >= 0)) && (pos2 >= 0)) {
				java.lang.String data = toString.substring(pos1, pos2);
				if (fieldSeparatorAtStart) {
					removeLastFieldSeparator(buffer);
				}
				buffer.append(data);
				appendFieldSeparator(buffer);
			}
		}
	}

	public void appendStart(java.lang.StringBuffer buffer, java.lang.Object object) {
		if (object != null) {
			appendClassName(buffer, object);
			appendIdentityHashCode(buffer, object);
			appendContentStart(buffer);
			if (fieldSeparatorAtStart) {
				appendFieldSeparator(buffer);
			}
		}
	}

	public void appendEnd(java.lang.StringBuffer buffer, java.lang.Object object) {
		if ((org.apache.commons.lang.builder.ToStringStyle.this.fieldSeparatorAtEnd) == false) {
			removeLastFieldSeparator(buffer);
		}
		appendContentEnd(buffer);
		org.apache.commons.lang.builder.ToStringStyle.unregister(object);
	}

	protected void removeLastFieldSeparator(java.lang.StringBuffer buffer) {
		int len = buffer.length();
		int sepLen = fieldSeparator.length();
		if (((len > 0) && (sepLen > 0)) && (len >= sepLen)) {
			boolean match = true;
			for (int i = 0; i < sepLen; i++) {
				if ((buffer.charAt(((len - 1) - i))) != (fieldSeparator.charAt(((sepLen - 1) - i)))) {
					match = false;
					break;
				}
			}
			if (match) {
				buffer.setLength((len - sepLen));
			}
		}
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (value == null) {
			appendNullText(buffer, fieldName);
		}else {
			appendInternal(buffer, fieldName, value, isFullDetail(fullDetail));
		}
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendInternal(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value, boolean detail) {
		if ((org.apache.commons.lang.builder.ToStringStyle.isRegistered(value)) && (!(((value instanceof java.lang.Number) || (value instanceof java.lang.Boolean)) || (value instanceof java.lang.Character)))) {
			appendCyclicObject(buffer, fieldName, value);
			return ;
		}
		org.apache.commons.lang.builder.ToStringStyle.register(value);
		try {
			if (value instanceof java.util.Collection) {
				if (detail) {
					appendDetail(buffer, fieldName, ((java.util.Collection) (value)));
				}else {
					appendSummarySize(buffer, fieldName, ((java.util.Collection) (value)).size());
				}
			}else
				if (value instanceof java.util.Map) {
					if (detail) {
						appendDetail(buffer, fieldName, ((java.util.Map) (value)));
					}else {
						appendSummarySize(buffer, fieldName, ((java.util.Map) (value)).size());
					}
				}else
					if (value instanceof long[]) {
						if (detail) {
							appendDetail(buffer, fieldName, ((long[]) (value)));
						}else {
							appendSummary(buffer, fieldName, ((long[]) (value)));
						}
					}else
						if (value instanceof int[]) {
							if (detail) {
								appendDetail(buffer, fieldName, ((int[]) (value)));
							}else {
								appendSummary(buffer, fieldName, ((int[]) (value)));
							}
						}else
							if (value instanceof short[]) {
								if (detail) {
									appendDetail(buffer, fieldName, ((short[]) (value)));
								}else {
									appendSummary(buffer, fieldName, ((short[]) (value)));
								}
							}else
								if (value instanceof byte[]) {
									if (detail) {
										appendDetail(buffer, fieldName, ((byte[]) (value)));
									}else {
										appendSummary(buffer, fieldName, ((byte[]) (value)));
									}
								}else
									if (value instanceof char[]) {
										if (detail) {
											appendDetail(buffer, fieldName, ((char[]) (value)));
										}else {
											appendSummary(buffer, fieldName, ((char[]) (value)));
										}
									}else
										if (value instanceof double[]) {
											if (detail) {
												appendDetail(buffer, fieldName, ((double[]) (value)));
											}else {
												appendSummary(buffer, fieldName, ((double[]) (value)));
											}
										}else
											if (value instanceof float[]) {
												if (detail) {
													appendDetail(buffer, fieldName, ((float[]) (value)));
												}else {
													appendSummary(buffer, fieldName, ((float[]) (value)));
												}
											}else
												if (value instanceof boolean[]) {
													if (detail) {
														appendDetail(buffer, fieldName, ((boolean[]) (value)));
													}else {
														appendSummary(buffer, fieldName, ((boolean[]) (value)));
													}
												}else
													if (value.getClass().isArray()) {
														if (detail) {
															appendDetail(buffer, fieldName, ((java.lang.Object[]) (value)));
														}else {
															appendSummary(buffer, fieldName, ((java.lang.Object[]) (value)));
														}
													}else {
														if (detail) {
															appendDetail(buffer, fieldName, value);
														}else {
															appendSummary(buffer, fieldName, value);
														}
													}
												
											
										
									
								
							
						
					
				
			
		} finally {
			org.apache.commons.lang.builder.ToStringStyle.unregister(value);
		}
	}

	protected void appendCyclicObject(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value) {
		org.apache.commons.lang.ObjectUtils.appendIdentityToString(buffer, value);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value) {
		buffer.append(value);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.util.Collection coll) {
		buffer.append(coll);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.util.Map map) {
		buffer.append(map);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value) {
		buffer.append(summaryObjectStartText);
		buffer.append(getShortClassName(value.getClass()));
		buffer.append(summaryObjectEndText);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, long value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, long value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, int value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, int value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, short value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, short value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, byte value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, byte value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, char value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, char value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, double value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, double value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, float value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, float value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, boolean value) {
		appendFieldStart(buffer, fieldName);
		appendDetail(buffer, fieldName, value);
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, boolean value) {
		buffer.append(value);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			java.lang.Object item = array[i];
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			if (item == null) {
				appendNullText(buffer, fieldName);
			}else {
				appendInternal(buffer, fieldName, item, arrayContentDetail);
			}
		}
		buffer.append(arrayEnd);
	}

	protected void reflectionAppendArrayDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object array) {
		buffer.append(arrayStart);
		int length = java.lang.reflect.Array.getLength(array);
		for (int i = 0; i < length; i++) {
			java.lang.Object item = java.lang.reflect.Array.get(array, i);
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			if (item == null) {
				appendNullText(buffer, fieldName);
			}else {
				appendInternal(buffer, fieldName, item, arrayContentDetail);
			}
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, long[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, long[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, long[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, int[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, int[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, int[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, short[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, short[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, short[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, byte[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, byte[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, byte[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, char[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, char[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, char[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, double[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, double[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, double[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, float[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, float[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, float[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, boolean[] array, java.lang.Boolean fullDetail) {
		appendFieldStart(buffer, fieldName);
		if (array == null) {
			appendNullText(buffer, fieldName);
		}else
			if (isFullDetail(fullDetail)) {
				appendDetail(buffer, fieldName, array);
			}else {
				appendSummary(buffer, fieldName, array);
			}
		
		appendFieldEnd(buffer, fieldName);
	}

	protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, boolean[] array) {
		buffer.append(arrayStart);
		for (int i = 0; i < (array.length); i++) {
			if (i > 0) {
				buffer.append(arraySeparator);
			}
			appendDetail(buffer, fieldName, array[i]);
		}
		buffer.append(arrayEnd);
	}

	protected void appendSummary(java.lang.StringBuffer buffer, java.lang.String fieldName, boolean[] array) {
		appendSummarySize(buffer, fieldName, array.length);
	}

	protected void appendClassName(java.lang.StringBuffer buffer, java.lang.Object object) {
		if ((useClassName) && (object != null)) {
			org.apache.commons.lang.builder.ToStringStyle.register(object);
			if (useShortClassName) {
				buffer.append(getShortClassName(object.getClass()));
			}else {
				buffer.append(object.getClass().getName());
			}
		}
	}

	protected void appendIdentityHashCode(java.lang.StringBuffer buffer, java.lang.Object object) {
		if ((org.apache.commons.lang.builder.ToStringStyle.this.isUseIdentityHashCode()) && (object != null)) {
			org.apache.commons.lang.builder.ToStringStyle.register(object);
			buffer.append('@');
			buffer.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(object)));
		}
	}

	protected void appendContentStart(java.lang.StringBuffer buffer) {
		buffer.append(contentStart);
	}

	protected void appendContentEnd(java.lang.StringBuffer buffer) {
		buffer.append(contentEnd);
	}

	protected void appendNullText(java.lang.StringBuffer buffer, java.lang.String fieldName) {
		buffer.append(nullText);
	}

	protected void appendFieldSeparator(java.lang.StringBuffer buffer) {
		buffer.append(fieldSeparator);
	}

	protected void appendFieldStart(java.lang.StringBuffer buffer, java.lang.String fieldName) {
		if ((useFieldNames) && (fieldName != null)) {
			buffer.append(fieldName);
			buffer.append(fieldNameValueSeparator);
		}
	}

	protected void appendFieldEnd(java.lang.StringBuffer buffer, java.lang.String fieldName) {
		appendFieldSeparator(buffer);
	}

	protected void appendSummarySize(java.lang.StringBuffer buffer, java.lang.String fieldName, int size) {
		buffer.append(sizeStartText);
		buffer.append(size);
		buffer.append(sizeEndText);
	}

	protected boolean isFullDetail(java.lang.Boolean fullDetailRequest) {
		if (fullDetailRequest == null) {
			return defaultFullDetail;
		}
		return fullDetailRequest.booleanValue();
	}

	protected java.lang.String getShortClassName(java.lang.Class cls) {
		return org.apache.commons.lang.ClassUtils.getShortClassName(cls);
	}

	protected boolean isUseClassName() {
		return useClassName;
	}

	protected void setUseClassName(boolean useClassName) {
		org.apache.commons.lang.builder.ToStringStyle.this.useClassName = useClassName;
	}

	protected boolean isUseShortClassName() {
		return useShortClassName;
	}

	protected boolean isShortClassName() {
		return useShortClassName;
	}

	protected void setUseShortClassName(boolean useShortClassName) {
		org.apache.commons.lang.builder.ToStringStyle.this.useShortClassName = useShortClassName;
	}

	protected void setShortClassName(boolean shortClassName) {
		org.apache.commons.lang.builder.ToStringStyle.this.useShortClassName = shortClassName;
	}

	protected boolean isUseIdentityHashCode() {
		return useIdentityHashCode;
	}

	protected void setUseIdentityHashCode(boolean useIdentityHashCode) {
		org.apache.commons.lang.builder.ToStringStyle.this.useIdentityHashCode = useIdentityHashCode;
	}

	protected boolean isUseFieldNames() {
		return useFieldNames;
	}

	protected void setUseFieldNames(boolean useFieldNames) {
		org.apache.commons.lang.builder.ToStringStyle.this.useFieldNames = useFieldNames;
	}

	protected boolean isDefaultFullDetail() {
		return defaultFullDetail;
	}

	protected void setDefaultFullDetail(boolean defaultFullDetail) {
		org.apache.commons.lang.builder.ToStringStyle.this.defaultFullDetail = defaultFullDetail;
	}

	protected boolean isArrayContentDetail() {
		return arrayContentDetail;
	}

	protected void setArrayContentDetail(boolean arrayContentDetail) {
		org.apache.commons.lang.builder.ToStringStyle.this.arrayContentDetail = arrayContentDetail;
	}

	protected java.lang.String getArrayStart() {
		return arrayStart;
	}

	protected void setArrayStart(java.lang.String arrayStart) {
		if (arrayStart == null) {
			arrayStart = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.arrayStart = arrayStart;
	}

	protected java.lang.String getArrayEnd() {
		return arrayEnd;
	}

	protected void setArrayEnd(java.lang.String arrayEnd) {
		if (arrayEnd == null) {
			arrayEnd = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.arrayEnd = arrayEnd;
	}

	protected java.lang.String getArraySeparator() {
		return arraySeparator;
	}

	protected void setArraySeparator(java.lang.String arraySeparator) {
		if (arraySeparator == null) {
			arraySeparator = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.arraySeparator = arraySeparator;
	}

	protected java.lang.String getContentStart() {
		return contentStart;
	}

	protected void setContentStart(java.lang.String contentStart) {
		if (contentStart == null) {
			contentStart = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.contentStart = contentStart;
	}

	protected java.lang.String getContentEnd() {
		return contentEnd;
	}

	protected void setContentEnd(java.lang.String contentEnd) {
		if (contentEnd == null) {
			contentEnd = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.contentEnd = contentEnd;
	}

	protected java.lang.String getFieldNameValueSeparator() {
		return fieldNameValueSeparator;
	}

	protected void setFieldNameValueSeparator(java.lang.String fieldNameValueSeparator) {
		if (fieldNameValueSeparator == null) {
			fieldNameValueSeparator = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.fieldNameValueSeparator = fieldNameValueSeparator;
	}

	protected java.lang.String getFieldSeparator() {
		return fieldSeparator;
	}

	protected void setFieldSeparator(java.lang.String fieldSeparator) {
		if (fieldSeparator == null) {
			fieldSeparator = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.fieldSeparator = fieldSeparator;
	}

	protected boolean isFieldSeparatorAtStart() {
		return fieldSeparatorAtStart;
	}

	protected void setFieldSeparatorAtStart(boolean fieldSeparatorAtStart) {
		org.apache.commons.lang.builder.ToStringStyle.this.fieldSeparatorAtStart = fieldSeparatorAtStart;
	}

	protected boolean isFieldSeparatorAtEnd() {
		return fieldSeparatorAtEnd;
	}

	protected void setFieldSeparatorAtEnd(boolean fieldSeparatorAtEnd) {
		org.apache.commons.lang.builder.ToStringStyle.this.fieldSeparatorAtEnd = fieldSeparatorAtEnd;
	}

	protected java.lang.String getNullText() {
		return nullText;
	}

	protected void setNullText(java.lang.String nullText) {
		if (nullText == null) {
			nullText = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.nullText = nullText;
	}

	protected java.lang.String getSizeStartText() {
		return sizeStartText;
	}

	protected void setSizeStartText(java.lang.String sizeStartText) {
		if (sizeStartText == null) {
			sizeStartText = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.sizeStartText = sizeStartText;
	}

	protected java.lang.String getSizeEndText() {
		return sizeEndText;
	}

	protected void setSizeEndText(java.lang.String sizeEndText) {
		if (sizeEndText == null) {
			sizeEndText = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.sizeEndText = sizeEndText;
	}

	protected java.lang.String getSummaryObjectStartText() {
		return summaryObjectStartText;
	}

	protected void setSummaryObjectStartText(java.lang.String summaryObjectStartText) {
		if (summaryObjectStartText == null) {
			summaryObjectStartText = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.summaryObjectStartText = summaryObjectStartText;
	}

	protected java.lang.String getSummaryObjectEndText() {
		return summaryObjectEndText;
	}

	protected void setSummaryObjectEndText(java.lang.String summaryObjectEndText) {
		if (summaryObjectEndText == null) {
			summaryObjectEndText = "";
		}
		org.apache.commons.lang.builder.ToStringStyle.this.summaryObjectEndText = summaryObjectEndText;
	}

	private static final class DefaultToStringStyle extends org.apache.commons.lang.builder.ToStringStyle {
		private static final long serialVersionUID = 1L;

		DefaultToStringStyle() {
			super();
		}

		private java.lang.Object readResolve() {
			return org.apache.commons.lang.builder.ToStringStyle.DEFAULT_STYLE;
		}
	}

	private static final class NoFieldNameToStringStyle extends org.apache.commons.lang.builder.ToStringStyle {
		private static final long serialVersionUID = 1L;

		NoFieldNameToStringStyle() {
			super();
			org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.this.setUseFieldNames(false);
		}

		private java.lang.Object readResolve() {
			return org.apache.commons.lang.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
		}
	}

	private static final class ShortPrefixToStringStyle extends org.apache.commons.lang.builder.ToStringStyle {
		private static final long serialVersionUID = 1L;

		ShortPrefixToStringStyle() {
			super();
			org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.this.setUseShortClassName(true);
			org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.this.setUseIdentityHashCode(false);
		}

		private java.lang.Object readResolve() {
			return org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE;
		}
	}

	private static final class SimpleToStringStyle extends org.apache.commons.lang.builder.ToStringStyle {
		private static final long serialVersionUID = 1L;

		SimpleToStringStyle() {
			super();
			org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.this.setUseClassName(false);
			org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.this.setUseIdentityHashCode(false);
			org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.this.setUseFieldNames(false);
			org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.this.setContentStart("");
			org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.this.setContentEnd("");
		}

		private java.lang.Object readResolve() {
			return org.apache.commons.lang.builder.ToStringStyle.SIMPLE_STYLE;
		}
	}

	private static final class MultiLineToStringStyle extends org.apache.commons.lang.builder.ToStringStyle {
		private static final long serialVersionUID = 1L;

		MultiLineToStringStyle() {
			super();
			org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.this.setContentStart("[");
			org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.this.setFieldSeparator(((org.apache.commons.lang.SystemUtils.LINE_SEPARATOR) + "  "));
			org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.this.setFieldSeparatorAtStart(true);
			org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.this.setContentEnd(((org.apache.commons.lang.SystemUtils.LINE_SEPARATOR) + "]"));
		}

		private java.lang.Object readResolve() {
			return org.apache.commons.lang.builder.ToStringStyle.MULTI_LINE_STYLE;
		}
	}
}

