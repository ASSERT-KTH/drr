package util;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ASTVisitor;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ASTNodeFinder
{
    public static List<ASTNode> find(CompilationUnit cu, String loc) {
	List<ASTNode> rslt_list = new ArrayList<ASTNode>();
	if (cu == null||loc==null) { return rslt_list; }
	String[] sublocs = loc.split(";");
	for (String subloc : sublocs) {
	    String[] subloc_items = subloc.split(":");
	    String subloc_ctnt = null;
	    int subloc_items_size = subloc_items.length;
	    if (subloc_items_size == 1) { subloc_ctnt = subloc_items[0]; }
	    else if (subloc_items_size == 2) { subloc_ctnt = subloc_items[1]; }
	    else {
		System.err.println("Unknown loc: " + subloc);
		return new ArrayList<ASTNode>();
	    }
	    ASTNode found_node = findNode(cu, subloc_ctnt);
	    rslt_list.add(found_node);
	}
	return rslt_list;
    }

    private static ASTNode findNode(CompilationUnit cu, String loc_ctnt) {
	String[] rc = loc_ctnt.split(",");
	int sln = -1, scn = -1;
	try {
	    sln = Integer.parseInt(rc[0].trim()); //start line number
	    scn = Integer.parseInt(rc[1].trim()); //start column number
	} catch (Exception e) {
	    System.err.println("Parsing Error: " + loc_ctnt);
	}
	if (sln == -1 || scn == -1) { return null; }
	int charseq = cu.getPosition(sln, scn);
	NodeFindVisitor nfv = new NodeFindVisitor(charseq);
	cu.accept(nfv);
	return nfv.getFoundNode();
    }

    private static class NodeFindVisitor extends ASTVisitor
    {
	private int charseq;
	private ASTNode found_node;

	public NodeFindVisitor(int charseq) { this.charseq = charseq; }

	public ASTNode getFoundNode() { return found_node; }

	@Override public boolean preVisit2(ASTNode node) {
	    int node_charseq = node.getStartPosition();
	    if (node_charseq == charseq) {
		found_node = node;
		return false;
	    }
	    else if (node_charseq > charseq) {
		return false; //unlikely to find the target
	    }
	    else {
		return true; //Still need to visit the children
	    }
	}
    }
}
