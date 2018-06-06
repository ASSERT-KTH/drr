

package org.joda.time.format;


public interface DateTimeParser {
	int estimateParsedLength();

	int parseInto(org.joda.time.format.DateTimeParserBucket bucket, java.lang.String text, int position);
}

