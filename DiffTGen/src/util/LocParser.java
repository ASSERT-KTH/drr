package util;

import java.util.List;
import java.util.ArrayList;

/* No support for nested locs. */
public class LocParser
{
    /* List item could be NULL! */
    public static List<Loc> getLocList(String loc_str) {
	List<Loc> loc_list = new ArrayList<Loc>();
	if (loc_str == null) { return loc_list; }
	String[] slc_strs = loc_str.split(";");
	for (String slc_str : slc_strs) {
	    if (slc_str == null) { loc_list.add(null); }
	    else {
		boolean parse_good = true;
		int ln = -1, cn = -1;
		try {
		    String[] lncn_strs = slc_str.substring(slc_str.indexOf(":")+1).split(",");
		    ln = Integer.parseInt(lncn_strs[0]);
		    cn = Integer.parseInt(lncn_strs[1]);
		}
		catch (Throwable t) {
		    System.err.println("Parsing Loc Error!");
		    System.err.println(t);
		    t.printStackTrace();
		    parse_good = false;
		}
		if (parse_good) {
		    loc_list.add(new Loc(ln, cn));
		}
		else {
		    loc_list.add(null);
		}
	    }
	}
	return loc_list;
    }
}
