package util;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadInputs {

	public static List<String> readLine(String inputfpath) {
		List<String> input = null;
		try {
			input = FileUtils.readLines(new File(inputfpath), (String) null);
		} catch (Throwable t) {
			System.err.println(t);
			t.printStackTrace();
			throw new RuntimeException("Errors in reading file: " + inputfpath);
		}
		if (input == null) {
			throw new RuntimeException("Errors in reading file: " + inputfpath);
		}
		return input;
	}
}
