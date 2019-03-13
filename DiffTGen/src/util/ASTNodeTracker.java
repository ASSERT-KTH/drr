package util;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ASTNodeTracker
{
    public static List<TrackLoc> getTrackLocs(ASTNode node) {
	List<TrackLoc> track_locs = new ArrayList<TrackLoc>();
	ASTNode curr_node = node;
	StructuralPropertyDescriptor curr_spd = curr_node.getLocationInParent();
	while (curr_spd != null) {
	    ASTNode par = curr_node.getParent();
	    if (curr_spd.isChildListProperty()) {
		List node_list = (List) par.getStructuralProperty(curr_spd);
		int node_list_size = node_list.size();
		int index = -1;
		for (int i=0; i<node_list_size; i++) {
		    if (curr_node == node_list.get(i)) {
			index = i;
			break;
		    }
		}
		if (index == -1) {
		    //this shouldn't happen.
		    return new ArrayList<TrackLoc>();
		}
		track_locs.add(new TrackLoc(curr_spd, index));
	    }
	    else {
		track_locs.add(new TrackLoc(curr_spd, -1));
	    }
	    curr_node = par;
	    curr_spd = curr_node.getLocationInParent();
	}
	Collections.reverse(track_locs);
	return track_locs;
    }

    public static ASTNode track(CompilationUnit cu, List<TrackLoc> track_locs) {
	ASTNode curr_node = cu;
	for (TrackLoc track_loc : track_locs) {
	    StructuralPropertyDescriptor spd = track_loc.getStructuralPropertyDescriptor();
	    int index = track_loc.getIndex();
	    Object child_obj = curr_node.getStructuralProperty(spd);
	    if (spd.isChildListProperty()) {
		List child_list = (List) child_obj;
		if (index != -1) {
		    curr_node = (ASTNode) child_list.get(index);
		}
		else {
		    return null;
		}
	    }
	    else if (spd.isChildProperty()) {
		curr_node = (ASTNode) child_obj;
	    }
	    else {
		//We don't handle SimpleProperty.
		return null;
	    }
	}
	return curr_node;
    }
    
}
