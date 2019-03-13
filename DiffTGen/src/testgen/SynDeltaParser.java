package testgen;

import java.util.List;
import java.util.ArrayList;


public class SynDeltaParser
{
    public static List<Modification> parse(List<String> input_lines) {

	List<Modification> mod_list = new ArrayList<Modification>();
	if (input_lines == null) { return mod_list; }
	int input_lines_size = input_lines.size();
	for (int i=0; i<input_lines_size; i+=2) {
	    String fp_input_line = input_lines.get(i).trim();
	    if (i+1 >= input_lines_size) {
		System.err.println("Error: the input file has no lines after the " + i + "-th line: " + input_lines.get(i));
		return new ArrayList<Modification>();
	    }
	    String pp_input_line = input_lines.get(i+1).trim();

	    String fppath = null, fploc = null;
	    String pppath = null, pploc = null;
	    String insert_dummy_path = null, insert_dummy_ctxtloc = null, insert_dummy_info = null;
	    String del_dummy_path = null, del_dummy_ctxtloc = null, del_dummy_info = null;
	    if (!fp_input_line.startsWith("null")) {
		String[] items = fp_input_line.split(":");
		fppath = items[0];
		fploc = items[1];
	    }
	    else {
		//e.g., null(path:37,12;before)
		if (!("null".equals(fp_input_line))) {
		    int start0 = fp_input_line.indexOf("(");
		    int end0 = fp_input_line.indexOf(")");
		    String dummy_str = fp_input_line.substring(start0+1,end0).trim();
		    int sep_index0 = dummy_str.indexOf(":");
		    int sep_index1 = dummy_str.indexOf(";");
		    insert_dummy_path = dummy_str.substring(0, sep_index0);
		    insert_dummy_ctxtloc = dummy_str.substring(sep_index0+1, sep_index1);
		    insert_dummy_info = dummy_str.substring(sep_index1+1);
		}
	    }
	    
	    if (!pp_input_line.startsWith("null")) {
		String[] items = pp_input_line.split(":");
		pppath = items[0];
		pploc = items[1];
	    }
	    else {
		//e.g., null(path:36,12;after)	    
		if (!("null".equals(pp_input_line))) {
		    int start0 = pp_input_line.indexOf("(");
		    int end0 = pp_input_line.indexOf(")");
		    String dummy_str = pp_input_line.substring(start0+1,end0).trim();
		    int sep_index0 = dummy_str.indexOf(":");
		    int sep_index1 = dummy_str.indexOf(";");
		    del_dummy_path = dummy_str.substring(0, sep_index0);
		    del_dummy_ctxtloc = dummy_str.substring(sep_index0+1, sep_index1);
		    del_dummy_info = dummy_str.substring(sep_index1+1);
		}
	    }
	    
	    if (fploc == null && pploc == null) {
		System.err.println("Error: the input file contains a modification with both statements being null");
		return new ArrayList<Modification>();
	    }

	    Modification mod = new Modification(fppath, fploc, pppath, pploc, insert_dummy_path, insert_dummy_ctxtloc, insert_dummy_info, del_dummy_path, del_dummy_ctxtloc, del_dummy_info);
	    mod_list.add(mod);
	}
	return mod_list;
    }
}
