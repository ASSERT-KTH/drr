

package org.joda.time.convert;


class ConverterSet {
	private final org.joda.time.convert.Converter[] iConverters;

	private org.joda.time.convert.ConverterSet.Entry[] iSelectEntries;

	ConverterSet(org.joda.time.convert.Converter[] converters) {
		iConverters = converters;
		iSelectEntries = new org.joda.time.convert.ConverterSet.Entry[1 << 4];
	}

	org.joda.time.convert.Converter select(java.lang.Class<?> type) throws java.lang.IllegalStateException {
		org.joda.time.convert.ConverterSet.Entry[] entries = iSelectEntries;
		int length = entries.length;
		int index = type == null ? 0 : (type.hashCode()) & (length - 1);
		org.joda.time.convert.ConverterSet.Entry e;
		while ((e = entries[index]) != null) {
			if ((e.iType) == type) {
				return e.iConverter;
			}
			if ((++index) >= length) {
				index = 0;
			}
		} 
		org.joda.time.convert.Converter converter = org.joda.time.convert.ConverterSet.selectSlow(org.joda.time.convert.ConverterSet.this, type);
		e = new org.joda.time.convert.ConverterSet.Entry(type, converter);
		entries = ((org.joda.time.convert.ConverterSet.Entry[]) (entries.clone()));
		entries[index] = e;
		for (int i = 0; i < length; i++) {
			if ((entries[i]) == null) {
				iSelectEntries = entries;
				return converter;
			}
		}
		int newLength = length << 1;
		org.joda.time.convert.ConverterSet.Entry[] newEntries = new org.joda.time.convert.ConverterSet.Entry[newLength];
		for (int i = 0; i < length; i++) {
			e = entries[i];
			type = e.iType;
			index = (type == null) ? 0 : (type.hashCode()) & (newLength - 1);
			while ((newEntries[index]) != null) {
				if ((++index) >= newLength) {
					index = 0;
				}
			} 
			newEntries[index] = e;
		}
		iSelectEntries = newEntries;
		return converter;
	}

	int size() {
		return iConverters.length;
	}

	void copyInto(org.joda.time.convert.Converter[] converters) {
		java.lang.System.arraycopy(iConverters, 0, converters, 0, iConverters.length);
	}

	org.joda.time.convert.ConverterSet add(org.joda.time.convert.Converter converter, org.joda.time.convert.Converter[] removed) {
		org.joda.time.convert.Converter[] converters = iConverters;
		int length = converters.length;
		for (int i = 0; i < length; i++) {
			org.joda.time.convert.Converter existing = converters[i];
			if (converter.equals(existing)) {
				if (removed != null) {
					removed[0] = null;
				}
				return org.joda.time.convert.ConverterSet.this;
			}
			if ((converter.getSupportedType()) == (existing.getSupportedType())) {
				org.joda.time.convert.Converter[] copy = new org.joda.time.convert.Converter[length];
				for (int j = 0; j < length; j++) {
					if (j != i) {
						copy[j] = converters[j];
					}else {
						copy[j] = converter;
					}
				}
				if (removed != null) {
					removed[0] = existing;
				}
				return new org.joda.time.convert.ConverterSet(copy);
			}
		}
		org.joda.time.convert.Converter[] copy = new org.joda.time.convert.Converter[length + 1];
		java.lang.System.arraycopy(converters, 0, copy, 0, length);
		copy[length] = converter;
		if (removed != null) {
			removed[0] = null;
		}
		return new org.joda.time.convert.ConverterSet(copy);
	}

	org.joda.time.convert.ConverterSet remove(org.joda.time.convert.Converter converter, org.joda.time.convert.Converter[] removed) {
		org.joda.time.convert.Converter[] converters = iConverters;
		int length = converters.length;
		for (int i = 0; i < length; i++) {
			if (converter.equals(converters[i])) {
				return remove(i, removed);
			}
		}
		if (removed != null) {
			removed[0] = null;
		}
		return org.joda.time.convert.ConverterSet.this;
	}

	org.joda.time.convert.ConverterSet remove(final int index, org.joda.time.convert.Converter[] removed) {
		org.joda.time.convert.Converter[] converters = iConverters;
		int length = converters.length;
		if (index >= length) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		if (removed != null) {
			removed[0] = converters[index];
		}
		org.joda.time.convert.Converter[] copy = new org.joda.time.convert.Converter[length - 1];
		int j = 0;
		for (int i = 0; i < length; i++) {
			if (i != index) {
				copy[(j++)] = converters[i];
			}
		}
		return new org.joda.time.convert.ConverterSet(copy);
	}

	private static org.joda.time.convert.Converter selectSlow(org.joda.time.convert.ConverterSet set, java.lang.Class<?> type) {
		org.joda.time.convert.Converter[] converters = set.iConverters;
		int length = converters.length;
		org.joda.time.convert.Converter converter;
		for (int i = length; (--i) >= 0;) {
			converter = converters[i];
			java.lang.Class<?> supportedType = converter.getSupportedType();
			if (supportedType == type) {
				return converter;
			}
			if ((supportedType == null) || ((type != null) && (!(supportedType.isAssignableFrom(type))))) {
				set = set.remove(i, null);
				converters = set.iConverters;
				length = converters.length;
			}
		}
		if ((type == null) || (length == 0)) {
			return null;
		}
		if (length == 1) {
			return converters[0];
		}
		for (int i = length; (--i) >= 0;) {
			converter = converters[i];
			java.lang.Class<?> supportedType = converter.getSupportedType();
			for (int j = length; (--j) >= 0;) {
				if ((j != i) && (converters[j].getSupportedType().isAssignableFrom(supportedType))) {
					set = set.remove(j, null);
					converters = set.iConverters;
					length = converters.length;
					i = length - 1;
				}
			}
		}
		if (length == 1) {
			return converters[0];
		}
		java.lang.StringBuffer msg = new java.lang.StringBuffer();
		msg.append("Unable to find best converter for type \"");
		msg.append(type.getName());
		msg.append("\" from remaining set: ");
		for (int i = 0; i < length; i++) {
			converter = converters[i];
			java.lang.Class<?> supportedType = converter.getSupportedType();
			msg.append(converter.getClass().getName());
			msg.append('[');
			msg.append((supportedType == null ? null : supportedType.getName()));
			msg.append("], ");
		}
		throw new java.lang.IllegalStateException(msg.toString());
	}

	static class Entry {
		final java.lang.Class<?> iType;

		final org.joda.time.convert.Converter iConverter;

		Entry(java.lang.Class<?> type, org.joda.time.convert.Converter converter) {
			iType = type;
			iConverter = converter;
		}
	}
}

