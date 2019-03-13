package util;

import org.eclipse.jdt.core.dom.*;
import ptns.*;


/*
  Generate regularized strings for almost all types of AST nodes
  with all the tokens unchanged and connected with blanks.
*/

public class ASTNodeStringRegularizer extends PatternGenerator
{

    @Override protected String getPatternOfVSN(SimpleName sn) {

	return sn.getIdentifier();
    }

    @Override protected String getPatternOfTSN(SimpleName tsn) {

	return tsn.getIdentifier();
    }

    @Override protected String getPatternOfMSN(SimpleName msn) {

	return msn.getIdentifier();
    }

    @Override protected String getPattern(BooleanLiteral bl) {

	return bl.toString();
    }

    @Override protected String getPattern(CharacterLiteral cl) {

	return cl.toString();
    }

    @Override protected String getPattern(NullLiteral nl) {

	return nl.toString();
    }

    @Override protected String getPattern(NumberLiteral nl) {

	return nl.toString();
    }

    @Override protected String getPattern(PrimitiveType pt) {

	return pt.toString();
    }
    
    @Override protected String getPattern(StringLiteral sl) {

	return sl.toString();
    }

    @Override protected String getPattern(WildcardType wct) {

	return wct.toString();
    }
}
