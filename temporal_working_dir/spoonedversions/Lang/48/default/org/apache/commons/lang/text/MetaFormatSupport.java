

package org.apache.commons.lang.text;


public abstract class MetaFormatSupport extends java.text.Format {
	private static final char END_FE = '}';

	private static final char START_FE = '{';

	private static final char QUOTE = '\'';

	protected java.util.Map invert(java.util.Map map) {
		java.util.Map result = new java.util.HashMap(map.size());
		for (java.util.Iterator iter = map.entrySet().iterator(); iter.hasNext();) {
			java.util.Map.Entry entry = ((java.util.Map.Entry) (iter.next()));
			result.put(entry.getValue(), entry.getKey());
		}
		return result;
	}

	protected void seekFormatElementEnd(java.lang.String source, java.text.ParsePosition pos) {
		int depth = 1;
		boolean quote = false;
		for (; (pos.getIndex()) < (source.length()); next(pos)) {
			switch (source.charAt(pos.getIndex())) {
				case org.apache.commons.lang.text.MetaFormatSupport.QUOTE :
					quote ^= true;
					break;
				case org.apache.commons.lang.text.MetaFormatSupport.START_FE :
					depth += (quote) ? 0 : 1;
					break;
				case org.apache.commons.lang.text.MetaFormatSupport.END_FE :
					depth -= (quote) ? 0 : 1;
					if (depth == 0) {
						return ;
					}
					break;
			}
		}
	}

	protected java.text.ParsePosition next(java.text.ParsePosition pos) {
		pos.setIndex(((pos.getIndex()) + 1));
		return pos;
	}

	public abstract java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos);

	public abstract java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
}

