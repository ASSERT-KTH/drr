package testgen;

import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class OracleParser
{
    private static Pattern valid_line_ptn;
    static { valid_line_ptn = Pattern.compile(".+:\\d+,\\d+|null\\s*(.+)\\s*"); }
    
    public static List<MethodToBeInstrumented> parse(List<String> input_lines) {

	List<MethodToBeInstrumented> med_instru_list = new ArrayList<MethodToBeInstrumented>();
	if (input_lines == null) { return med_instru_list; }
	int input_lines_size = input_lines.size();	
	for (int i=0; i<input_lines_size; i++) {
	    String input_line = input_lines.get(i).trim();
	    if (!valid_line_ptn.matcher(input_line).matches()) {
		System.err.println("Invalid Line ("+i+") from Oracle Input File: " + input_line);
		return new ArrayList<MethodToBeInstrumented>();
	    }
	    if (input_line.startsWith("null")) {
		int i0 = input_line.indexOf("(");
		int i1 = input_line.indexOf(")");
		String fpath = input_line.substring(i0+1, i1).trim();
		MethodToBeInstrumented med_instru = new MethodToBeInstrumented(fpath, null);
		med_instru_list.add(med_instru);
	    }
	    else {
		String[] items = input_line.split(":");
		String fpath = items[0];
		String mloc = items[1];
		MethodToBeInstrumented med_instru = new MethodToBeInstrumented(fpath, mloc);
		med_instru_list.add(med_instru);
	    }
	}
	
	return med_instru_list;
    }
}
