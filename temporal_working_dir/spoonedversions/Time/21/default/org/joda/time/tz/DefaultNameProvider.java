

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
			java.lang.String[][] zoneStringsLoc = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
			java.lang.String[] setLoc = null;
			for (java.lang.String[] strings : zoneStringsLoc) {
				if (((strings != null) && ((strings.length) == 5)) && (id.equals(strings[0]))) {
					setLoc = strings;
					byNameKeyCache.put(setLoc[2], new java.lang.String[]{ setLoc[2] , setLoc[1] });
					if (setLoc[2].equals(setLoc[4])) {
						byNameKeyCache.put(((setLoc[4]) + "-Summer"), new java.lang.String[]{ setLoc[4] , setLoc[3] });
					}else {
						byNameKeyCache.put(setLoc[4], new java.lang.String[]{ setLoc[4] , setLoc[3] });
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

