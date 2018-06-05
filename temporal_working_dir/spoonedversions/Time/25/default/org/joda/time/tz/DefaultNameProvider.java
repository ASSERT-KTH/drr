

package org.joda.time.tz;


@java.lang.SuppressWarnings(value = "unchecked")
public class DefaultNameProvider implements org.joda.time.tz.NameProvider {
	private java.util.HashMap<java.util.Locale, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> iByLocaleCache = createCache();

	public DefaultNameProvider() {
	}

	public java.lang.String getShortName(java.util.Locale locale, java.lang.String id, java.lang.String nameKey) {
		java.lang.String[] nameSet = getNameSet(locale, id, nameKey);
		return nameSet == null ? null : nameSet[0];
	}

	public java.lang.String getName(java.util.Locale locale, java.lang.String id, java.lang.String nameKey) {
		java.lang.String[] nameSet = getNameSet(locale, id, nameKey);
		return nameSet == null ? null : nameSet[1];
	}

	private synchronized java.lang.String[] getNameSet(java.util.Locale locale, java.lang.String id, java.lang.String nameKey) {
		if (((locale == null) || (id == null)) || (nameKey == null)) {
			return null;
		}
		java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> byIdCache = iByLocaleCache.get(locale);
		if (byIdCache == null) {
			iByLocaleCache.put(locale, (byIdCache = createCache()));
		}
		java.util.Map<java.lang.String, java.lang.Object> byNameKeyCache = byIdCache.get(id);
		if (byNameKeyCache == null) {
			byIdCache.put(id, (byNameKeyCache = createCache()));
			java.lang.String[][] zoneStrings = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
			for (int i = 0; i < (zoneStrings.length); i++) {
				java.lang.String[] set = zoneStrings[i];
				if (((set != null) && ((set.length) == 5)) && (id.equals(set[0]))) {
					byNameKeyCache.put(set[2], new java.lang.String[]{ set[2] , set[1] });
					if (set[2].equals(set[4])) {
						byNameKeyCache.put(((set[4]) + "-Summer"), new java.lang.String[]{ set[4] , set[3] });
					}else {
						byNameKeyCache.put(set[4], new java.lang.String[]{ set[4] , set[3] });
					}
					break;
				}
			}
		}
		return ((java.lang.String[]) (byNameKeyCache.get(nameKey)));
	}

	private java.util.HashMap createCache() {
		return new java.util.HashMap(7);
	}
}

