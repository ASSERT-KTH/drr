package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.*;
import util.*;

public class ASTHelper
{
    public static String getMethodLoc(String fpath, String loc) {
	File f = new File(fpath);
	CompilationUnit cu = (CompilationUnit) ASTNodeLoader.getASTNode(f);
	List<ASTNode> found_nodes = ASTNodeFinder.find(cu, loc);
	if (found_nodes.isEmpty()) { return null; }
	ASTNode currnode = found_nodes.get(0);
	while (currnode!=null) {
	    if (currnode instanceof MethodDeclaration) {
		int startpos = currnode.getStartPosition();
		int ln = cu.getLineNumber(startpos);
		int cn = cu.getColumnNumber(startpos);
		return ln+","+cn;
	    }
	    currnode = currnode.getParent();
	}
	return null;
    }
}
