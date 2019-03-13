package util;

import org.eclipse.jdt.core.dom.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class ASTNodeHeightCalculator
{
    private static int LARGE_HEIGHT = 1000;

    public static int calculate(ASTNode node) {

	if (node == null) { return 0; }
	
	if (node instanceof AnonymousClassDeclaration) {
	    return calculate((AnonymousClassDeclaration) node);
	}
	else if (node instanceof BodyDeclaration) {
	    return calculate((BodyDeclaration) node);
	}
	else if (node instanceof CatchClause) {
	    return calculate((CatchClause) node);
	}
	else if (node instanceof CompilationUnit) {
	    return calculate((CompilationUnit) node);
	}
	else if (node instanceof Expression) {
	    return calculate((Expression) node);
	}
	else if (node instanceof ImportDeclaration) {
	    return calculate((ImportDeclaration) node);
	}
	else if (node instanceof PackageDeclaration) {
	    return calculate((PackageDeclaration) node);
	}
	else if (node instanceof Statement) {
	    return calculate((Statement) node);
	}
	else if (node instanceof Type) {
	    return calculate((Type) node);
	}
	else if (node instanceof VariableDeclaration) {
	    return calculate((VariableDeclaration) node);
	}
	else {
	    return 1;
	}
	
    }
    
    public static int calculate(AnonymousClassDeclaration acd) {

	if (acd == null) { return 0; }
	
	int height = 0;
	List body_decl_obj_list = acd.bodyDeclarations();
	for (Object body_decl_obj : body_decl_obj_list) {
	    int height0 = calculate((BodyDeclaration) body_decl_obj);
	    if (height0 > height) {
		height = height0;
	    }
	}
	return height + 1;
    }

    public static int calculate(BodyDeclaration bd) {

	if (bd == null) { return 0; }

	if (bd instanceof AbstractTypeDeclaration) {

	    return LARGE_HEIGHT;
	} else if (bd instanceof AnnotationTypeMemberDeclaration) {

	    return LARGE_HEIGHT;
	} else if (bd instanceof MethodDeclaration) {

	    return calculate((MethodDeclaration) bd);
	} else if (bd instanceof FieldDeclaration) {

	    return calculate((FieldDeclaration) bd);
	} else if (bd instanceof Initializer) {

	    return calculate((Initializer) bd);
	} else if (bd instanceof EnumConstantDeclaration) {

	    return LARGE_HEIGHT;
	} else {

	    return LARGE_HEIGHT;
	}
    }

    public static int calculate(CompilationUnit cu) {

	if (cu == null) { return 0; }
	return LARGE_HEIGHT;
    }
    
    public static int calculate(MethodDeclaration md) {

	if (md == null) { return 0; }
	int h0 = calculateSVDList(md.parameters());
	int h1 = calculate(md.getBody());
	int h2 = calculate(md.getReturnType2());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }
    
    public static int calculate(FieldDeclaration fd) {

	if (fd == null) { return 0; }
	int h0 = calculateVDFList(fd.fragments());
	int h1 = calculate(fd.getType());
	return (h0 >= h1) ? h0 : h1;
    }

    public static int calculate(Initializer init) {

	if (init == null) { return 0; }
	return calculate(init.getBody());
    }

    public static int calculate(CatchClause cc) {

	if (cc == null) { return 0; }
	int arg_height = calculate(cc.getException());
	int body_height = calculate(cc.getBody());
	return (arg_height >= body_height) ? arg_height+1 : body_height+1;
    }

    public static int calculate(Expression exp) {

	if (exp == null) { return 0; }

	if (exp instanceof Annotation) {
	    return 1;
	}
	else if (exp instanceof ArrayAccess) {
	    return calculate((ArrayAccess) exp);
	}
	else if (exp instanceof ArrayCreation) {
	    return calculate((ArrayCreation) exp);
	}
	else if (exp instanceof ArrayInitializer) {
	    return calculate((ArrayInitializer) exp);	    
	}
	else if (exp instanceof Assignment) {
	    return calculate((Assignment) exp);	    
	}
	else if (exp instanceof BooleanLiteral) {
	    return 1;
	}
	else if (exp instanceof CastExpression) {
	    return calculate((CastExpression) exp);	    
	}
	else if (exp instanceof CharacterLiteral) {
	    return 1;
	}
	else if (exp instanceof ClassInstanceCreation) {
	    return calculate((ClassInstanceCreation) exp);
	}
	else if (exp instanceof ConditionalExpression) {
	    return calculate((ConditionalExpression) exp);
	}
	else if (exp instanceof FieldAccess) {
	    return calculate((FieldAccess) exp);	    
	}
	else if (exp instanceof InfixExpression) {
	    return calculate((InfixExpression) exp);	    
	}
	else if (exp instanceof InstanceofExpression) {
	    return calculate((InstanceofExpression) exp);	    
	}
	else if (exp instanceof MethodInvocation) {
	    return calculate((MethodInvocation) exp);	    
	}
	else if (exp instanceof Name) {
	    return calculate((Name) exp);
	}
	else if (exp instanceof NullLiteral) {
	    return 1;
	}
	else if (exp instanceof NumberLiteral) {
	    return 1;
	}
	else if (exp instanceof ParenthesizedExpression) {
	    return calculate((ParenthesizedExpression) exp);
	}
	else if (exp instanceof PostfixExpression) {
	    return calculate((PostfixExpression) exp);	    
	}
	else if (exp instanceof PrefixExpression) {
	    return calculate((PrefixExpression) exp);	    
	}
	else if (exp instanceof StringLiteral) {
	    return 1;
	}
	else if (exp instanceof SuperFieldAccess) {
	    return calculate((SuperFieldAccess) exp);	    
	}
	else if (exp instanceof SuperMethodInvocation) {
	    return calculate((SuperMethodInvocation) exp);	    
	}
	else if (exp instanceof ThisExpression) {
	    return calculate((ThisExpression) exp);	    
	}
	else if (exp instanceof TypeLiteral) {
	    return calculate((TypeLiteral) exp);
	}
	else if (exp instanceof VariableDeclarationExpression) {
	    return calculate((VariableDeclarationExpression) exp);
	}
	else {
	    return 1;
	}
    }

    public static int calculate(ImportDeclaration id) {

	if (id == null) { return 0; }
	return 1;
    }

    public static int calculate(PackageDeclaration pd) {

	if (pd == null) { return 0; }
	return 1;
    }

    public static int calculate(Statement stmt) {

	if (stmt == null) { return 0; }

	if (stmt instanceof AssertStatement) {
	    return calculate((AssertStatement) stmt);
	}
	else if (stmt instanceof Block) {
	    return calculate((Block) stmt);	    
	}
	else if (stmt instanceof BreakStatement) {
	    return calculate((BreakStatement) stmt);	    
	}
	else if (stmt instanceof ConstructorInvocation) {
	    return calculate((ConstructorInvocation) stmt);	    	    
	}
	else if (stmt instanceof ContinueStatement) {
	    return calculate((ContinueStatement) stmt);	    	    
	}
	else if (stmt instanceof DoStatement) {
	    return calculate((DoStatement) stmt);	    	    
	}
	else if (stmt instanceof EmptyStatement) {
	    return 0;
	}
	else if (stmt instanceof EnhancedForStatement) {
	    return calculate((EnhancedForStatement) stmt);
	}
	else if (stmt instanceof ExpressionStatement) {
	    ExpressionStatement es = (ExpressionStatement) stmt;
	    return calculate(es.getExpression());
	}
	else if (stmt instanceof ForStatement) {
	    return calculate((ForStatement) stmt);	    	    
	}
	else if (stmt instanceof IfStatement) {
	    return calculate((IfStatement) stmt);
	}
	else if (stmt instanceof LabeledStatement) {
	    return calculate((LabeledStatement) stmt);
	}
	else if (stmt instanceof ReturnStatement) {
	    return calculate((ReturnStatement) stmt);
	}
	else if (stmt instanceof SuperConstructorInvocation) {
	    return calculate((SuperConstructorInvocation) stmt);	    	    
	}
	else if (stmt instanceof SwitchCase) {
	    return calculate((SwitchCase) stmt);
	}
	else if (stmt instanceof SwitchStatement) {
	    return calculate((SwitchStatement) stmt);	    	    
	}
	else if (stmt instanceof SynchronizedStatement) {
	    return calculate((SynchronizedStatement) stmt);
	}
	else if (stmt instanceof ThrowStatement) {
	    return calculate((ThrowStatement) stmt);	    	    
	}
	else if (stmt instanceof TryStatement) {
	    return calculate((TryStatement) stmt);	    	    
	}
	else if (stmt instanceof TypeDeclarationStatement) {
	    return calculate((TypeDeclarationStatement) stmt);  	    
	}
	else if (stmt instanceof VariableDeclarationStatement) {
	    return calculate((VariableDeclarationStatement) stmt);
	}
	else if (stmt instanceof WhileStatement) {
	    return calculate((WhileStatement) stmt);
	}
	else {
	    return 1;
	}
    }

    public static int calculate(Type type) {

	if (type == null) { return 0; }
	if (type.isArrayType()) {
	    ArrayType at = (ArrayType) type;
	    return calculate(at.getComponentType()) + 1;
	}
	else if (type.isParameterizedType()) {
	    ParameterizedType pt = (ParameterizedType) type;
	    return calculate(pt.getType());
	}
	else if (type.isPrimitiveType()) {
	    return 1;
	}
	else if (type.isQualifiedType()) {
	    return calculate((QualifiedType) type);
	}
	else if (type.isSimpleType()) {
	    return 1;
	}
	else if (type.isUnionType()) {
	    return 1;
	}
	else if (type.isWildcardType()) {
	    return 1;
	}
	else {
	    return 1;
	}
	
    }

    public static int calculate(VariableDeclaration vd) {

	if (vd == null) { return 0; }
	if (vd instanceof SingleVariableDeclaration) {
	    return calculate((SingleVariableDeclaration) vd);
	}
	else if (vd instanceof VariableDeclarationFragment){
	    return calculate((VariableDeclarationFragment) vd);
	}
	else {
	    return 1;
	}
    }

    public static int calculate(SingleVariableDeclaration svd) {

	if (svd == null) { return 0; }
	int h0 = calculate(svd.getType());
	int h1 = calculate(svd.getName());
	int h2 = calculate(svd.getInitializer());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }    

    public static int calculate(VariableDeclarationFragment vdf) {

	if (vdf == null) { return 0; }
	int h0 = calculate(vdf.getName());
	int h1 = calculate(vdf.getInitializer());
	return (h0 >= h1) ? h0+1 : h1+1;
    }
    
    public static int calculate(ArrayAccess aa) {

	if (aa == null) { return 0; }
	int h0 = calculate(aa.getArray());
	int h1 = calculate(aa.getIndex());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(ArrayCreation ac) {

	if (ac == null) { return 0; }
	int h0 = calculate(ac.getType());
	int h1 = calculate(ac.getInitializer());
	return (h0 >= h1) ? h0+1 : h1+1;
    }
    

    public static int calculate(ArrayInitializer ai) {

	if (ai == null) { return 0; }
	List exp_list = ai.expressions();
	return calculateExpList(exp_list);
    }

    public static int calculate(Assignment assign) {

	if (assign == null) { return 0; }
	int h0 = calculate(assign.getLeftHandSide());
	int h1 = 1;
	int h2 = calculate(assign.getRightHandSide());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }

    public static int calculate(BooleanLiteral bl) {

	if (bl == null) { return 0; }
	return 1;
    }

    public static int calculate(CastExpression ce) {

	if (ce == null) { return 0; }
	int h0 = calculate(ce.getType());
	int h1 = calculate(ce.getExpression());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(CharacterLiteral cl) {

	if (cl == null) { return 0; }
	return 1;
    }
    
    public static int calculate(ClassInstanceCreation cic) {

	if (cic == null) { return 0; }
	int h0 = calculate(cic.getType());
	int h1 = calculate(cic.getExpression());
	int h2 = calculate(cic.getAnonymousClassDeclaration());
	int h3 = calculateExpList(cic.arguments());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	h = (h >= h3) ? h : h3;
	return h + 1;
    }

    public static int calculate(ConditionalExpression ce) {

	if (ce == null) { return 0; }
	int h0 = calculate(ce.getElseExpression());
	int h1 = calculate(ce.getExpression());
	int h2 = calculate(ce.getThenExpression());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }

    public static int calculate(FieldAccess fa) {

	if (fa == null) { return 0; }
	int h0 = calculate(fa.getExpression());
	int h1 = calculate(fa.getName());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(InfixExpression ie) {

	if (ie == null) { return 0; }
	int h0 = calculate(ie.getLeftOperand());
	int h1 = 1;
	int h2 = calculate(ie.getRightOperand());
	int h3 = calculateExpList(ie.extendedOperands());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	h = (h >= h3) ? h : h3;
	return h+1;
    }

    public static int calculate(InstanceofExpression ie) {

	if (ie == null) { return 0; }
	int h0 = calculate(ie.getLeftOperand());
	int h1 = calculate(ie.getRightOperand());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(MethodInvocation mi) {

	if (mi == null) { return 0; }
	int h0 = calculate(mi.getExpression());
	int h1 = calculate(mi.getName());
	int h2 = calculateExpList(mi.arguments());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }
    
    public static int calculate(Name name) {

	if (name == null) { return 0; }
	if (name.isSimpleName()) {
	    return calculate((SimpleName) name);
	}
	else if (name.isQualifiedName()) {
	    return calculate((QualifiedName) name);
	}
	else {
	    return 1;
	}
    }

    public static int calculate(NullLiteral nl) {

	if (nl == null) { return 0; }
	return 1;
    }

    public static int calculate(NumberLiteral nl) {

	if (nl == null) { return 0; }
	return 1;
    }

    public static int calculate(ParenthesizedExpression pe) {

	if (pe == null) { return 0; }
	return calculate(pe.getExpression()) + 1;
    }

    public static int calculate(PostfixExpression pe) {

	if (pe == null) { return 0; }
	return calculate(pe.getOperand()) + 1;
    }

    public static int calculate(PrefixExpression pe) {

	if (pe == null) { return 0; }
	return calculate(pe.getOperand()) + 1;
    }

    public static int calculate(StringLiteral sl) {

	if (sl == null) { return 0; }
	return 1;
    }

    public static int calculate(SuperFieldAccess sfa) {

	if (sfa == null) { return 0; }
	int h0 = calculate(sfa.getName());
	int h1 = calculate(sfa.getQualifier());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(SuperMethodInvocation smi) {

	if (smi == null) { return 0; }
	int h0 = calculate(smi.getName());
	int h1 = calculate(smi.getQualifier());
	int h2 = calculateExpList(smi.arguments());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }

    public static int calculate(ThisExpression te) {

	if (te == null) { return 0; }
	int h0 = calculate(te.getQualifier());
	return h0+1;
    }    

    public static int calculate(TypeLiteral tl) {

	if (tl == null) { return 0; }
	int h0 = calculate(tl.getType());
	return h0+1;
    }    

    public static int calculate(VariableDeclarationExpression vde) {

	if (vde == null) { return 0; }
	int h0 = calculateVDFList(vde.fragments());
	int h1 = calculate(vde.getType());
	return (h0 >= h1) ? h0 : h1; //No plus one!!!
    }    

    
    
    public static int calculate(SimpleName sname) {

	if (sname == null) { return 0; }
	return 1;
    }

    public static int calculate(QualifiedName qname) {

	if (qname == null) { return 0; }
	int h0 = calculate(qname.getQualifier());
	int h1 = calculate(qname.getName());
	return (h0 >= h1) ? h0 : h1; //No plus 1!!!
    }

    public static int calculate(AssertStatement as) {

	if (as == null) { return 0; }
	return calculate(as.getExpression()) + 1;
    }
    
    public static int calculate(Block block) {

	if (block == null) { return 0; }
	return calculateStmtList(block.statements()); //NO plus one!!!
    }

    public static int calculate(BreakStatement bs) {

	if (bs == null) { return 0; }
	return calculate(bs.getLabel()) + 1;
    }

    public static int calculate(ConstructorInvocation ci) {

	if (ci == null) { return 0; }
	return calculateExpList(ci.arguments()) + 1;
    }

    public static int calculate(ContinueStatement cs) {

	if (cs == null) { return 0; }
	return calculate(cs.getLabel()) + 1;
    }
    

    public static int calculate(DoStatement ds) {

	if (ds == null) { return 0; }
	int h0 = calculate(ds.getBody());
	int h1 = calculate(ds.getExpression());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(EnhancedForStatement efs) {

	if (efs == null) { return 0; }
	int h0 = calculate(efs.getParameter());	
	int h1 = calculate(efs.getExpression());
	int h2 = calculate(efs.getBody());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }
    
    public static int calculate(ForStatement fs) {

	if (fs == null) { return 0; }
	int h0 = calculateExpList(fs.initializers());
	int h1 = calculate(fs.getExpression());
	int h2 = calculateExpList(fs.updaters());
	int h3 = calculate(fs.getBody());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	h = (h >= h3) ? h : h3;
	return h+1;
    }

    public static int calculate(IfStatement is) {

	if (is == null) { return 0; }
	int h0 = calculate(is.getExpression());
	int h1 = calculate(is.getThenStatement());
	int h2 = calculate(is.getElseStatement());
	int h = (h0 >= h1) ? h0 : h1;
	h = (h >= h2) ? h : h2;
	return h+1;
    }

    public static int calculate(LabeledStatement ls) {

	if (ls == null) { return 0; }
	int h0 = calculate(ls.getLabel());
	int h1 = calculate(ls.getBody());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(ReturnStatement rs) {

	if (rs == null) { return 0; }
	return calculate(rs.getExpression()) + 1;
    }

    public static int calculate(SuperConstructorInvocation sci) {

	if (sci == null) { return 0; }
	int h0 = calculate(sci.getExpression());
	int h1 = calculateExpList(sci.arguments());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(SwitchCase sc) {

	if (sc == null) { return 0; }
	if (sc.isDefault()) { return 1; }
	else { return calculate(sc.getExpression()) + 1; }
    }

    public static int calculate(SwitchStatement ss) {

	if (ss == null) { return 0; }
	int h0 = calculate(ss.getExpression());
	int h1 = calculateStmtList(ss.statements());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(SynchronizedStatement ss) {

	if (ss == null) { return 0; }
	int h0 = calculate(ss.getExpression());
	int h1 = calculate(ss.getBody());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    public static int calculate(ThrowStatement ts) {

	if (ts == null) { return 0; }
	return calculate(ts.getExpression()) + 1;
    }

    public static int calculate(TryStatement ts) {

	if (ts == null) { return 0; }
	int h = calculate(ts.getBody());
	List cc_list = ts.catchClauses();
	for (Object cc_obj : cc_list) {
	    CatchClause cc = (CatchClause) cc_obj;
	    int h0 = calculate(cc);
	    if (h < h0) {
		h = h0;
	    }
	}
	int h0 = calculate(ts.getFinally());
	if (h < h0) {
	    h = h0;
	}
	return h+1;
    }

    public static int calculate(TypeDeclarationStatement tds) {

	if (tds == null) { return 0; }
	return LARGE_HEIGHT;
    }

    public static int calculate(VariableDeclarationStatement vds) {

	if (vds == null) { return 0; }
	int h0 = calculate(vds.getType());
	int h1 = calculateVDFList(vds.fragments());
	return (h0 >= h1) ? h0 : h1; //No plus one!!!
    }

    public static int calculate(WhileStatement ws) {

	if (ws == null) { return 0; }
	int h0 = calculate(ws.getExpression());
	int h1 = calculate(ws.getBody());
	return (h0 >= h1) ? h0+1 : h1+1;
    }

    private static int calculateSVDList(List svd_list) {

	int height = 0;
	for (Object svd_obj : svd_list) {
	    SingleVariableDeclaration svd = (SingleVariableDeclaration) svd_obj;
	    int height0 = calculate(svd);
	    if (height0 > height) {
		height = height0;
	    }
	}
	return height;
    }

    private static int calculateVDFList(List vdf_list) {

	int height = 0;
	for (Object fragment : vdf_list) {
	    VariableDeclarationFragment vdf = (VariableDeclarationFragment) fragment;
	    int height0 = calculate(vdf);
	    if (height0 > height) {
		height = height0;
	    }
	}
	return height;
    }

    private static int calculateExpList(List exp_list) {

	int height = 0;
	for (Object exp_obj : exp_list) {
	    Expression exp = (Expression) exp_obj;
	    int height0 = calculate(exp);
	    if (height0 > height) {
		height = height0;
	    }
	}
	return height;
    }

    private static int calculateStmtList(List stmt_list) {

	int height = 0;
	for (Object stmt_obj : stmt_list) {
	    Statement stmt = (Statement) stmt_obj;
	    int height0 = calculate(stmt);
	    if (height0 > height) {
		height = height0;
	    }
	}
	return height;
    }
    
}
