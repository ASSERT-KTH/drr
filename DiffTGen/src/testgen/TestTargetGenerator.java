package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import util.*;


public class TestTargetGenerator
{
    public static final String DELTA_NAME = "delta_syn_3nz5e";
    private int delta_id;
    
    public TestTargetGenerator() {
	delta_id = 0;
    }
    
    public List<TestTarget> getTestTargets(List<Modification> mod_list) {
	
	List<TestTarget> tt_list = new ArrayList<TestTarget>();
	//Group the modifications by patch files
	Map<String, List<Modification>> mod_map = new HashMap<String, List<Modification>>();
	for (Modification mod : mod_list) {
	    String pppath = mod.getPPPath();
	    if (pppath == null) { pppath = mod.getDelDummyPath(); }
	    if (pppath == null) { continue; } //Shouldn't happen
	    List<Modification> pppath_mod_list = mod_map.get(pppath);
	    if (pppath_mod_list == null) {
		pppath_mod_list = new ArrayList<Modification>();
		mod_map.put(pppath, pppath_mod_list);
	    }
	    pppath_mod_list.add(mod);
	}

	Iterator mod_map_it = mod_map.entrySet().iterator();
	while (mod_map_it.hasNext()) {
	    Map.Entry<String, List<Modification>> entry = (Map.Entry<String, List<Modification>>) mod_map_it.next();
	    List<Modification> pppath_mod_list = entry.getValue();
	    TestTarget tt = getTestTarget(pppath_mod_list);
	    if (tt != null) { tt_list.add(tt); }
	}

	return tt_list;
    }

    /* Note, the patch files should be identical for all the modications. */
    private TestTarget getTestTarget(List<Modification> mod_list) {

	Modification mod0 = mod_list.get(0);
	String pppath = mod0.getPPPath();
	String fppath = mod0.getFPPath();
	if (pppath == null) { pppath = mod_list.get(0).getDelDummyPath(); }
	if (pppath == null) { return null; }
	if (fppath == null) { fppath = mod_list.get(0).getInsertDummyPath(); }
	if (fppath == null) { return null; }
	File fp = new File(fppath);
	File pp = new File(pppath);
	String fp_ctnt = null, pp_ctnt = null;
	try {
	    fp_ctnt = FileUtils.readFileToString(fp, (String) null);
	    pp_ctnt = FileUtils.readFileToString(pp, (String) null);
	} catch (Throwable t) {
	    System.err.println(t);
	    t.printStackTrace();
	}
	if (fp_ctnt == null || pp_ctnt == null) { return null; }
	
	CompilationUnit fp_cu = (CompilationUnit) ASTNodeLoader.getASTNode(fp);
	CompilationUnit pp_cu = (CompilationUnit) ASTNodeLoader.getASTNode(pp);
	AST fp_ast = fp_cu.getAST();
	AST pp_ast = pp_cu.getAST();
	PackageDeclaration fp_pd = fp_cu.getPackage();
	String fp_pname = fp_pd.getName().getFullyQualifiedName(); //fp package name
	PackageDeclaration pp_pd = pp_cu.getPackage();
	String pp_pname = pp_pd.getName().getFullyQualifiedName(); //pp package name
	String fp_name = fp.getName();
	String pp_name = pp.getName();

	ASTRewrite pp_rw = ASTRewrite.create(pp_ast);
	int mod_list_size = mod_list.size();
	for (int i=0; i<mod_list_size; i++) {
	    Modification mod = mod_list.get(i);
	    String mod_fppath = mod.getFPPath();
	    if (mod_fppath == null) { mod_fppath = mod.getInsertDummyPath(); }
	    if (!fppath.equals(mod_fppath)) {
		System.err.println("The two modification paths are not identical (the one below is ignored).");
		System.err.println(mod_fppath);
		System.err.println(fppath);
		continue;
	    }
	    String mod_pppath = mod.getPPPath();
	    if (mod_pppath == null) { mod_pppath = mod.getDelDummyPath(); }
	    if (!pppath.equals(mod_pppath)) {
		System.err.println("The two modification paths are not identical (the one below is ignored).");
		System.err.println(mod_pppath);
		System.err.println(pppath);
		continue;
	    }

	    String fp_loc = mod.getFPLoc();
	    String pp_loc = mod.getPPLoc();
	    if (fp_loc == null && pp_loc == null) { continue; }

	    //Insertion
	    if (fp_loc == null && pp_loc != null) {
		ASTNode pp_node = ASTNodeFinder.find(pp_cu, pp_loc).get(0);
		if (pp_node instanceof IfStatement) {
		    IfStatement pp_ifstmt = (IfStatement) pp_node;
		    if (pp_ifstmt.getElseStatement() == null) { //Partial
			Statement then_stmt = pp_ifstmt.getThenStatement();
			Statement first_then_stmt = then_stmt;
			if (then_stmt instanceof Block) {
			    first_then_stmt = (Statement) (((Block) then_stmt).statements().get(0));
			}
			Statement pholder_lstmt = getPHolderStatement(pp_ast, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, first_then_stmt);
			continue;
		    }
		}
		Statement pholder_lstmt = getPHolderStatement(pp_ast, DELTA_NAME+"_"+delta_id);
		delta_id += 1;
		pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
		continue;
	    }
	    
	    //Deletion
	    else if (fp_loc != null && pp_loc == null) {
		String del_dummy_ctxtloc = mod.getDelDummyCtxtLoc();
		String del_dummy_info = mod.getDelDummyInfo();
		ASTNode fp_node = ASTNodeFinder.find(fp_cu, fp_loc).get(0);
		if (fp_node instanceof IfStatement) {
		    IfStatement fp_ifstmt = (IfStatement) fp_node;
		    if (fp_ifstmt.getElseStatement() == null) { //Partial
			Expression fp_ifcond_cp = (Expression) ASTNode.copySubtree(pp_ast, fp_ifstmt.getExpression());
			Statement pholder_lstmt = getPHolderStatement(pp_ast, fp_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, pp_cu, del_dummy_ctxtloc, del_dummy_info);
			continue;
		    }
		}

		//Simple Deletion
		Statement pholder_lstmt = getPHolderStatement(pp_ast, DELTA_NAME+"_"+delta_id);
		delta_id += 1;
		pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, pp_cu, del_dummy_ctxtloc, del_dummy_info);
		continue;
	    }

	    else {
		ASTNode fp_node = ASTNodeFinder.find(fp_cu, fp_loc).get(0);
		ASTNode pp_node = ASTNodeFinder.find(pp_cu, pp_loc).get(0);
		boolean is_fp_if = (fp_node instanceof IfStatement);
		boolean is_pp_if = (pp_node instanceof IfStatement);
		
		if (is_fp_if && !is_pp_if) {
		    IfStatement fp_if_stmt  = (IfStatement) fp_node;
		    if (isIdenticalToThenBranch(fp_if_stmt, pp_node)) {
			//If-guard Deletion
			Expression fp_not_ifcond_cp = createNotE(pp_ast, fp_if_stmt.getExpression());
			Statement pholder_lstmt = getPHolderStatement(pp_ast, fp_not_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }
		}

		else if (!is_fp_if && is_pp_if) {
		    IfStatement pp_if_stmt  = (IfStatement) pp_node;
		    if (isIdenticalToThenBranch(pp_if_stmt, fp_node)) {
			//If-guard Insertion
			Expression pp_not_ifcond_cp = createNotE(pp_ast, pp_if_stmt.getExpression());
			Statement pholder_lstmt = getPHolderStatement(pp_ast, pp_not_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }
		}

		else if (is_fp_if && is_pp_if) {
		    IfStatement fp_if_stmt  = (IfStatement) fp_node;
		    IfStatement pp_if_stmt  = (IfStatement) pp_node;
		    Expression e1 = fp_if_stmt.getExpression();
		    Expression e2 = pp_if_stmt.getExpression();
		    Statement fp_then_stmt = fp_if_stmt.getThenStatement();
		    Statement fp_else_stmt = fp_if_stmt.getElseStatement();
		    Statement pp_then_stmt = pp_if_stmt.getThenStatement();
		    Statement pp_else_stmt = pp_if_stmt.getElseStatement();
		    boolean then_then = isEquivalent(fp_then_stmt, pp_then_stmt);
		    boolean else_else = isEquivalent(fp_else_stmt, pp_else_stmt);
		    boolean then_else = isEquivalent(fp_then_stmt, pp_else_stmt);
		    boolean else_then = isEquivalent(fp_else_stmt, pp_then_stmt);
		
		    if (isIdenticalToThenBranch(fp_if_stmt, pp_node)) {
			//If-guard Deletion
			Expression fp_not_ifcond_cp = (Expression) createNotE(pp_ast, fp_if_stmt.getExpression());
			Statement pholder_lstmt = getPHolderStatement(pp_ast, fp_not_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }

		    if (isIdenticalToThenBranch(pp_if_stmt, fp_node)) {
			//If-guard Insertion
			Expression pp_not_ifcond_cp = (Expression) createNotE(pp_ast, pp_if_stmt.getExpression());
			Statement pholder_lstmt = getPHolderStatement(pp_ast, pp_not_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }
		    
		    //Create (!e1 && e2 || e1 && !e2)
		    if (then_then && else_else) {
			Expression new_ifcond_cp = createNotE1E2ORE1NotE2(pp_ast, e1, e2);
			Statement pholder_lstmt = getPHolderStatement(pp_ast, new_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }

		    //!(e1 && e2)
		    else if (then_then) {
			Expression new_ifcond_cp = createNotE1E2(pp_ast, e1, e2);
			Statement pholder_lstmt = getPHolderStatement(pp_ast, new_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }

		    //!(!e1 && !e2) => e1 || e2
		    else if (else_else) {
			Expression new_ifcond_cp = createE1ORE2(pp_ast, e1, e2);
			Statement pholder_lstmt = getPHolderStatement(pp_ast, new_ifcond_cp, DELTA_NAME+"_"+delta_id);
			delta_id += 1;
			pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
			continue;
		    }
		}
	    }


	    //For all other cases
	    ASTNode pp_node = ASTNodeFinder.find(pp_cu, pp_loc).get(0);
	    Statement pholder_lstmt = getPHolderStatement(pp_ast, DELTA_NAME+"_"+delta_id);
	    delta_id += 1;
	    pp_rw = insertPHolderStatement(pp_rw, pholder_lstmt, (Statement) pp_node);
	}

	Document ppdoc = new Document(pp_ctnt);
	TextEdit tedit = pp_rw.rewriteAST(ppdoc, null);
	try { tedit.apply(ppdoc); }
	catch (Throwable t) {
	    System.err.println(t);
	    t.printStackTrace();
	    return null;
	}

	String tt_ctnt = ppdoc.get();
	CompilationUnit tt_cu = (CompilationUnit) ASTNodeLoader.getASTNode(tt_ctnt);
	List<String> tt_locs = getTargetStatementLocs(tt_cu);
	return new TestTarget(pp_pname, pp_name, tt_ctnt, tt_locs);
    }

    /* Need to be Updated! */
    /* A very simple version for comparison. */
    public List<TestTarget> getTestTarget0(List<Modification> mod) {
	return new ArrayList<TestTarget>();
    }

    private boolean isPartialIfStmt(ASTNode node) {
	if (node == null) { return false; }
	if (node instanceof IfStatement) {
	    IfStatement if_stmt = (IfStatement) node;
	    if (if_stmt.getElseStatement() == null) {
		return true;
	    }
	}
	return false;
    }

    private Statement getPHolderStatement(AST ast, Expression e, String delta_syn_name) {
	//"delta_syn_name" is used to create (1) the label (2) the dummy declaration stmt
	IfStatement pholder_ifstmt = ast.newIfStatement();
	pholder_ifstmt.setExpression(e);
	Block pholder_ifstmt_thenblock = ast.newBlock();
	pholder_ifstmt.setThenStatement(pholder_ifstmt_thenblock);
	Statement dummystmt = getPHolderStatement(ast, delta_syn_name); //has a label
	pholder_ifstmt_thenblock.statements().add(dummystmt);
	return pholder_ifstmt;
    }

    /* As I tried, it doesn't work to create a labeled statement as
       "delta_syn_3nz5e_0: int delta_syn_3nz5e_0 = -1;" (the ASTParser would fail
       to load a complete Compilation Unit). So instead, we create a labeled statement 
       as "delta_syn_3nz5e_0: if (true) { int delta_syn_3nz5e_0=-1; }" */
    private Statement getPHolderStatement(AST ast, String delta_syn_name) {
	VariableDeclarationFragment vdf0 = ast.newVariableDeclarationFragment();
	vdf0.setName(ast.newSimpleName(delta_syn_name));
	vdf0.setInitializer(ast.newNumberLiteral("-1"));
	VariableDeclarationStatement dummy_declstmt = ast.newVariableDeclarationStatement(vdf0);
	dummy_declstmt.setType(ast.newPrimitiveType(PrimitiveType.INT));
	IfStatement dummy_ifstmt = ast.newIfStatement();
	dummy_ifstmt.setExpression(ast.newBooleanLiteral(true));
	Block dummy_block = ast.newBlock();
	dummy_block.statements().add(dummy_declstmt);
	dummy_ifstmt.setThenStatement(dummy_block);
	LabeledStatement pholderstmt = ast.newLabeledStatement();
	pholderstmt.setBody(dummy_ifstmt);
	pholderstmt.setLabel(ast.newSimpleName(delta_syn_name)); //Wrap as a label statement
	return pholderstmt;
    }

    /* Insert "pholderstmt" before "dstmt". */
    private ASTRewrite insertPHolderStatement(ASTRewrite rw, Statement pholderstmt, Statement dstmt) {
	ASTNode dstmt_par = dstmt.getParent();
	StructuralPropertyDescriptor spd = dstmt.getLocationInParent();
	if (spd.isChildListProperty()) {
	    ChildListPropertyDescriptor lspd = (ChildListPropertyDescriptor) spd;
	    ListRewrite lrw = rw.getListRewrite(dstmt_par, lspd);
	    lrw.insertBefore(pholderstmt, dstmt, null);
	}
	else if (spd.isChildProperty()) {
	    AST ast = rw.getAST();
	    Block block0 = ast.newBlock();
	    block0.statements().add(pholderstmt);
	    block0.statements().add((Statement) ASTNode.copySubtree(ast, dstmt));
	    rw.set(dstmt_par, spd, block0, null);
	}
	return rw;
    }

    /* Insert "pholderstmt" in "cu" some place around "del_dummy_ctxtloc" 
       according to "del_dummy_info". */
    private ASTRewrite insertPHolderStatement(ASTRewrite rw, Statement pholderstmt, CompilationUnit cu, String del_dummy_ctxtloc, String del_dummy_info) {
	Statement ctxt_stmt = null;
	try { ctxt_stmt = (Statement) ASTNodeFinder.find(cu, del_dummy_ctxtloc).get(0); }
	catch (Throwable t) {
	    System.err.println(t);
	    t.printStackTrace();
	}
	if (ctxt_stmt == null) { return rw; }

	if ("before".equals(del_dummy_info) || "after".equals(del_dummy_info)) {
	    ASTNode ctxt_stmt_par = ctxt_stmt.getParent();
	    StructuralPropertyDescriptor spd = ctxt_stmt.getLocationInParent();
	    if (spd.isChildListProperty()) {
		ChildListPropertyDescriptor lspd = (ChildListPropertyDescriptor) spd;
		ListRewrite lrw = rw.getListRewrite(ctxt_stmt_par, lspd);
		if ("before".equals(del_dummy_info)) {
		    lrw.insertBefore(pholderstmt, ctxt_stmt, null);
		}
		else if ("after".equals(del_dummy_info)) {
		    lrw.insertAfter(pholderstmt, ctxt_stmt, null);
		}
	    }
	    else if (spd.isChildProperty()) {
		AST ast = rw.getAST();
		Block block0 = ast.newBlock();
		if ("before".equals(del_dummy_info)) {
		    block0.statements().add(pholderstmt);
		    block0.statements().add((Statement) ASTNode.copySubtree(ast, ctxt_stmt));
		}
		else if ("after".equals(del_dummy_info)) {
		    block0.statements().add((Statement) ASTNode.copySubtree(ast, ctxt_stmt));
		    block0.statements().add(pholderstmt);
		}
		rw.set(ctxt_stmt_par, spd, block0, null);
	    }
	}
	else {
	    try {
		if ("then-branch".equals(del_dummy_info)) {
		    IfStatement ctxt_ifstmt = (IfStatement) ctxt_stmt;
		    rw.set(ctxt_ifstmt, IfStatement.THEN_STATEMENT_PROPERTY, pholderstmt, null);
		}
		else if ("else-branch".equals(del_dummy_info)) {
		    IfStatement ctxt_ifstmt = (IfStatement) ctxt_stmt;
		    rw.set(ctxt_ifstmt, IfStatement.ELSE_STATEMENT_PROPERTY, pholderstmt, null);
		}
		else if ("block-body".equals(del_dummy_info)) {
		    Block ctxt_blockstmt = (Block) ctxt_stmt;
		    ListRewrite lrw0 = rw.getListRewrite(ctxt_blockstmt, Block.STATEMENTS_PROPERTY);
		    lrw0.insertFirst(pholderstmt, null);
		}
		else if ("do-body".equals(del_dummy_info)) {
		    DoStatement ctxt_dostmt = (DoStatement) ctxt_stmt;
		    rw.set(ctxt_dostmt, DoStatement.BODY_PROPERTY, pholderstmt, null);
		}
		else if ("enhancedfor-body".equals(del_dummy_info)) {
		    EnhancedForStatement ctxt_efs = (EnhancedForStatement) ctxt_stmt;
		    rw.set(ctxt_efs, EnhancedForStatement.BODY_PROPERTY, pholderstmt, null);
		}
		else if ("for-body".equals(del_dummy_info)) {
		    ForStatement ctxt_for = (ForStatement) ctxt_stmt;
		    rw.set(ctxt_for, ForStatement.BODY_PROPERTY, pholderstmt, null);
		}
		else if ("switch-body".equals(del_dummy_info)) {
		    SwitchStatement ctxt_switchstmt = (SwitchStatement) ctxt_stmt;
		    ListRewrite lrw0 = rw.getListRewrite(ctxt_switchstmt, SwitchStatement.STATEMENTS_PROPERTY);
		    lrw0.insertFirst(pholderstmt, null);
		}
		else if ("synchronized-body".equals(del_dummy_info)) {
		    SynchronizedStatement ctxt_synstmt = (SynchronizedStatement) ctxt_stmt;
		    Block synstmt_block = ctxt_synstmt.getBody();
		    ListRewrite lrw0 = rw.getListRewrite(synstmt_block, Block.STATEMENTS_PROPERTY);
		    lrw0.insertFirst(pholderstmt, null);
		}
		else if ("try-body".equals(del_dummy_info)) {
		    TryStatement ctxt_trystmt = (TryStatement) ctxt_stmt;
		    Block trystmt_block = ctxt_trystmt.getBody();
		    ListRewrite lrw0 = rw.getListRewrite(trystmt_block, Block.STATEMENTS_PROPERTY);
		    lrw0.insertFirst(pholderstmt, null);
		}
		else if (del_dummy_info.startsWith("catch-clause-body")) {
		    int i0 = del_dummy_info.indexOf("[");
		    int i1 = del_dummy_info.indexOf("]");
		    if (i0!=-1 && i1!=-1) {
			int cci = Integer.parseInt(del_dummy_info.substring(i0+1,i1).trim());
			TryStatement ctxt_trystmt = (TryStatement) ctxt_stmt;
			CatchClause cc = (CatchClause) ctxt_trystmt.catchClauses().get(cci);
			ListRewrite lrw0 = rw.getListRewrite(cc.getBody(), Block.STATEMENTS_PROPERTY);
			lrw0.insertFirst(pholderstmt, null);
		    }
		}
		else if ("finally-body".equals(del_dummy_info)) {
		    TryStatement ctxt_trystmt = (TryStatement) ctxt_stmt;
		    Block finally_block = ctxt_trystmt.getFinally();
		    ListRewrite lrw0 = rw.getListRewrite(finally_block, Block.STATEMENTS_PROPERTY);
		    lrw0.insertFirst(pholderstmt, null);
		}
		else if ("while-body".equals(del_dummy_info)) {
		    WhileStatement ctxt_wstmt = (WhileStatement) ctxt_stmt;
		    rw.set(ctxt_wstmt, WhileStatement.BODY_PROPERTY, pholderstmt, null);
		}
	    }
	    catch (Throwable t) {
		System.err.println(t);
		t.printStackTrace();
	    }
	}
	return rw;
    }

    private List<String> getTargetStatementLocs(CompilationUnit cu) {
	List<String> target_locs = new ArrayList<String>();
	TargetStatementsFinder tsf = new TargetStatementsFinder();
	cu.accept(tsf);
	List<LabeledStatement> target_stmts = tsf.getTargetStatements();
	for (LabeledStatement target_stmt : target_stmts) {
	    IfStatement body_ifstmt = (IfStatement) target_stmt.getBody();
	    Block body_ifstmt_thenblock = (Block) body_ifstmt.getThenStatement();
	    Statement dummy_declstmt = (Statement) body_ifstmt_thenblock.statements().get(0);
	    int start_pos = dummy_declstmt.getStartPosition();
	    String target_loc = "slc:"+cu.getLineNumber(start_pos)+","+cu.getColumnNumber(start_pos);
	    target_locs.add(target_loc);
	}
	return target_locs;
    }
    
    private boolean isEquivalent(Statement s1, Statement s2) {
	if (s1 == null && s2 == null) { return true; }
	else if (s1 == null && s2 != null) { return false; }
	else if (s1 != null && s2 == null) { return false; }
	else { return s1.toString().equals(s2.toString()); }
    }

    /* ((!e1) && (e2)) || ((e1) && (!e2)) */
    private Expression createNotE1E2ORE1NotE2(AST ast, Expression e1, Expression e2) {
	InfixExpression new_cond = ast.newInfixExpression();
	new_cond.setOperator(InfixExpression.Operator.CONDITIONAL_OR);
	ParenthesizedExpression pe_0 = ast.newParenthesizedExpression();
	ParenthesizedExpression pe_1 = ast.newParenthesizedExpression();
	new_cond.setLeftOperand(pe_0);
	new_cond.setRightOperand(pe_1);
	InfixExpression not_e1_e2 = ast.newInfixExpression();
	InfixExpression e1_not_e2 = ast.newInfixExpression();
	pe_0.setExpression(not_e1_e2);
	pe_1.setExpression(e1_not_e2);
	
	not_e1_e2.setOperator(InfixExpression.Operator.CONDITIONAL_AND);
	ParenthesizedExpression pe_2 = ast.newParenthesizedExpression();
	ParenthesizedExpression pe_3 = ast.newParenthesizedExpression();
	not_e1_e2.setLeftOperand(pe_2);
	not_e1_e2.setRightOperand(pe_3);
	pe_2.setExpression(createNotE(ast, e1));
	pe_3.setExpression((Expression) ASTNode.copySubtree(ast, e2));

	e1_not_e2.setOperator(InfixExpression.Operator.CONDITIONAL_AND);
	ParenthesizedExpression pe_4 = ast.newParenthesizedExpression();
	ParenthesizedExpression pe_5 = ast.newParenthesizedExpression();
	e1_not_e2.setLeftOperand(pe_4);
	e1_not_e2.setRightOperand(pe_5);
	pe_4.setExpression((Expression) ASTNode.copySubtree(ast, e1));
	pe_5.setExpression(createNotE(ast, e2));
	
	return new_cond;
    }

    /* (e1) || (e2) */
    private Expression createE1ORE2(AST ast, Expression e1, Expression e2) {
	InfixExpression e1ore2 = ast.newInfixExpression();
	e1ore2.setOperator(InfixExpression.Operator.CONDITIONAL_OR);
	ParenthesizedExpression pe1 = ast.newParenthesizedExpression();
	ParenthesizedExpression pe2 = ast.newParenthesizedExpression();
	e1ore2.setLeftOperand(pe1);
	e1ore2.setRightOperand(pe2);
	pe1.setExpression((Expression) ASTNode.copySubtree(ast, e1));
	pe2.setExpression((Expression) ASTNode.copySubtree(ast, e2));
	return e1ore2;
    }

    /* !((e1) && (e2)) */
    private Expression createNotE1E2(AST ast, Expression e1, Expression e2) {
	InfixExpression e1e2 = ast.newInfixExpression();
	e1e2.setOperator(InfixExpression.Operator.CONDITIONAL_AND);
	ParenthesizedExpression pe1 = ast.newParenthesizedExpression();
	ParenthesizedExpression pe2 = ast.newParenthesizedExpression();
	e1e2.setLeftOperand(pe1);
	e1e2.setRightOperand(pe2);
	pe1.setExpression((Expression) ASTNode.copySubtree(ast, e1));
	pe2.setExpression((Expression) ASTNode.copySubtree(ast, e2));
	return createNotE(ast, e1e2);
    }

    /* !(e) */
    private Expression createNotE(AST ast, Expression e) {
	PrefixExpression note = ast.newPrefixExpression();
	note.setOperator(PrefixExpression.Operator.NOT);
	ParenthesizedExpression pe = ast.newParenthesizedExpression();
	note.setOperand(pe);
	pe.setExpression((Expression) ASTNode.copySubtree(ast, e));
	return note;
    }

    private boolean isIdenticalToThenBranch(IfStatement if_stmt, ASTNode node) {
	Statement then_stmt = if_stmt.getThenStatement();
	if (then_stmt instanceof Block) {
	    Block then_block = (Block) then_stmt;
	    List then_stmts = then_block.statements();
	    if (then_stmts.isEmpty() || then_stmts.size() > 1) {
		return false;
	    }
	    else {
		Statement first_stmt = (Statement) then_stmts.get(0);
		return first_stmt.toString().equals(node.toString());
	    }
	}
	else {
	    return then_stmt.toString().equals(node.toString());
	}
    }

    private class TargetStatementsFinder extends ASTVisitor {
	private String target_label_prefix;
	List<LabeledStatement> target_stmt_list;
	public TargetStatementsFinder() {
	    target_label_prefix = DELTA_NAME;
	    target_stmt_list = new ArrayList<LabeledStatement>();
	}
	public List<LabeledStatement> getTargetStatements() { return target_stmt_list; }
	@Override public boolean visit(LabeledStatement ls) {
	    if (ls.getLabel().getIdentifier().startsWith(target_label_prefix)) {
		target_stmt_list.add(ls);
	    }
	    return false;
	}
    }
}
