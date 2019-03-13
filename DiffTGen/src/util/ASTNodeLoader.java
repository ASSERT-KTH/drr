package util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.dom.*;
import edu.brown.cs.ivy.jcomp.*;


public class ASTNodeLoader
{
    private static JcompControl jcc = new JcompControl();
    
    public static ASTNode getASTNode(File f) {
	String fctnt = null;
	try { fctnt = FileUtils.readFileToString(f, (String)null); }
	catch (IOException e) {
	    System.err.println(e);
	    e.printStackTrace();
	}
	return getASTNode(fctnt);
    }

    public static ASTNode getASTNode(String fctnt) {
	if (fctnt == null) { return null; }
	ASTParser parser = ASTParser.newParser(AST.JLS4);
	parser.setKind(ASTParser.K_COMPILATION_UNIT);
	parser.setSource(fctnt.toCharArray());
	return parser.createAST(null);
    }
    
    public static ASTNode getResolvedASTNode(File f) {
	String fpath = f.getAbsolutePath();
	String fctnt = null;
	try { fctnt = FileUtils.readFileToString(f, (String)null); }
	catch (IOException e) {
	    System.err.println(e);
	    e.printStackTrace();
	}
	return getResolvedASTNode(fpath, fctnt);
    }

    public static ASTNode getResolvedASTNode(String fpath, String fctnt) {
	if (fpath == null || fctnt == null) { return null; }
	ASTSource ast_src = new ASTSource(fpath, fctnt);
	List<JcompSource> jcs_list = new ArrayList<JcompSource>();
	jcs_list.add(ast_src);
	JcompProject jcp = jcc.getProject(jcs_list);
	jcp.resolve();
	JcompSemantics semdata = jcc.getSemanticData(ast_src);
	ASTNode node = semdata.getAstNode();
	jcc.freeProject(jcp);
	return node;
    }
    
    private static class ASTSource implements JcompSource
    {
	String fpath;
	String ftext;

	public ASTSource(String fpath, String ftext) {
	    this.fpath = fpath;
	    this.ftext = ftext;
	}

	@Override public String getFileContents() { return ftext; }

	@Override public String getFileName() { return fpath; }
    }
}
