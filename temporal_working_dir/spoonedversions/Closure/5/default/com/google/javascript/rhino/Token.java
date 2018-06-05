

package com.google.javascript.rhino;


public class Token {
	public static final int ERROR = -1;

	public static final int RETURN = 4;

	public static final int BITOR = 9;

	public static final int BITXOR = 10;

	public static final int BITAND = 11;

	public static final int EQ = 12;

	public static final int NE = 13;

	public static final int LT = 14;

	public static final int LE = 15;

	public static final int GT = 16;

	public static final int GE = 17;

	public static final int LSH = 18;

	public static final int RSH = 19;

	public static final int URSH = 20;

	public static final int ADD = 21;

	public static final int SUB = 22;

	public static final int MUL = 23;

	public static final int DIV = 24;

	public static final int MOD = 25;

	public static final int NOT = 26;

	public static final int BITNOT = 27;

	public static final int POS = 28;

	public static final int NEG = 29;

	public static final int NEW = 30;

	public static final int DELPROP = 31;

	public static final int TYPEOF = 32;

	public static final int GETPROP = 33;

	public static final int GETELEM = 35;

	public static final int CALL = 37;

	public static final int NAME = 38;

	public static final int NUMBER = 39;

	public static final int STRING = 40;

	public static final int NULL = 41;

	public static final int THIS = 42;

	public static final int FALSE = 43;

	public static final int TRUE = 44;

	public static final int SHEQ = 45;

	public static final int SHNE = 46;

	public static final int REGEXP = 47;

	public static final int THROW = 49;

	public static final int IN = 51;

	public static final int INSTANCEOF = 52;

	public static final int ARRAYLIT = 63;

	public static final int OBJECTLIT = 64;

	public static final int TRY = 77;

	public static final int PARAM_LIST = 83;

	public static final int COMMA = 85;

	public static final int ASSIGN = 86;

	public static final int ASSIGN_BITOR = 87;

	public static final int ASSIGN_BITXOR = 88;

	public static final int ASSIGN_BITAND = 89;

	public static final int ASSIGN_LSH = 90;

	public static final int ASSIGN_RSH = 91;

	public static final int ASSIGN_URSH = 92;

	public static final int ASSIGN_ADD = 93;

	public static final int ASSIGN_SUB = 94;

	public static final int ASSIGN_MUL = 95;

	public static final int ASSIGN_DIV = 96;

	public static final int ASSIGN_MOD = 97;

	public static final int HOOK = 98;

	public static final int OR = 100;

	public static final int AND = 101;

	public static final int INC = 102;

	public static final int DEC = 103;

	public static final int FUNCTION = 105;

	public static final int IF = 108;

	public static final int SWITCH = 110;

	public static final int CASE = 111;

	public static final int DEFAULT_CASE = 112;

	public static final int WHILE = 113;

	public static final int DO = 114;

	public static final int FOR = 115;

	public static final int BREAK = 116;

	public static final int CONTINUE = 117;

	public static final int VAR = 118;

	public static final int WITH = 119;

	public static final int CATCH = 120;

	public static final int VOID = 122;

	public static final int EMPTY = 124;

	public static final int BLOCK = 125;

	public static final int LABEL = 126;

	public static final int EXPR_RESULT = 130;

	public static final int SCRIPT = 132;

	public static final int GETTER_DEF = 147;

	public static final int SETTER_DEF = 148;

	public static final int CONST = 149;

	public static final int DEBUGGER = 152;

	public static final int LABEL_NAME = 153;

	public static final int STRING_KEY = 154;

	public static final int CAST = 155;

	public static final int ANNOTATION = 300;

	public static final int PIPE = 301;

	public static final int STAR = 302;

	public static final int EOC = 303;

	public static final int QMARK = 304;

	public static final int ELLIPSIS = 305;

	public static final int BANG = 306;

	public static final int EQUALS = 307;

	public static final int LB = 308;

	public static final int LC = 309;

	public static final int COLON = 310;

	public static final int DEFAULT = com.google.javascript.rhino.Token.DEFAULT_CASE;

	public static final int GET = com.google.javascript.rhino.Token.GETTER_DEF;

	public static final int LP = com.google.javascript.rhino.Token.PARAM_LIST;

	public static final int SET = com.google.javascript.rhino.Token.SETTER_DEF;

	public static java.lang.String name(int token) {
		switch (token) {
			case com.google.javascript.rhino.Token.ERROR :
				return "ERROR";
			case com.google.javascript.rhino.Token.RETURN :
				return "RETURN";
			case com.google.javascript.rhino.Token.BITOR :
				return "BITOR";
			case com.google.javascript.rhino.Token.BITXOR :
				return "BITXOR";
			case com.google.javascript.rhino.Token.BITAND :
				return "BITAND";
			case com.google.javascript.rhino.Token.EQ :
				return "EQ";
			case com.google.javascript.rhino.Token.NE :
				return "NE";
			case com.google.javascript.rhino.Token.LT :
				return "LT";
			case com.google.javascript.rhino.Token.LE :
				return "LE";
			case com.google.javascript.rhino.Token.GT :
				return "GT";
			case com.google.javascript.rhino.Token.GE :
				return "GE";
			case com.google.javascript.rhino.Token.LSH :
				return "LSH";
			case com.google.javascript.rhino.Token.RSH :
				return "RSH";
			case com.google.javascript.rhino.Token.URSH :
				return "URSH";
			case com.google.javascript.rhino.Token.ADD :
				return "ADD";
			case com.google.javascript.rhino.Token.SUB :
				return "SUB";
			case com.google.javascript.rhino.Token.MUL :
				return "MUL";
			case com.google.javascript.rhino.Token.DIV :
				return "DIV";
			case com.google.javascript.rhino.Token.MOD :
				return "MOD";
			case com.google.javascript.rhino.Token.NOT :
				return "NOT";
			case com.google.javascript.rhino.Token.BITNOT :
				return "BITNOT";
			case com.google.javascript.rhino.Token.POS :
				return "POS";
			case com.google.javascript.rhino.Token.NEG :
				return "NEG";
			case com.google.javascript.rhino.Token.NEW :
				return "NEW";
			case com.google.javascript.rhino.Token.DELPROP :
				return "DELPROP";
			case com.google.javascript.rhino.Token.TYPEOF :
				return "TYPEOF";
			case com.google.javascript.rhino.Token.GETPROP :
				return "GETPROP";
			case com.google.javascript.rhino.Token.GETELEM :
				return "GETELEM";
			case com.google.javascript.rhino.Token.CALL :
				return "CALL";
			case com.google.javascript.rhino.Token.NAME :
				return "NAME";
			case com.google.javascript.rhino.Token.LABEL_NAME :
				return "LABEL_NAME";
			case com.google.javascript.rhino.Token.NUMBER :
				return "NUMBER";
			case com.google.javascript.rhino.Token.STRING :
				return "STRING";
			case com.google.javascript.rhino.Token.STRING_KEY :
				return "STRING_KEY";
			case com.google.javascript.rhino.Token.NULL :
				return "NULL";
			case com.google.javascript.rhino.Token.THIS :
				return "THIS";
			case com.google.javascript.rhino.Token.FALSE :
				return "FALSE";
			case com.google.javascript.rhino.Token.TRUE :
				return "TRUE";
			case com.google.javascript.rhino.Token.SHEQ :
				return "SHEQ";
			case com.google.javascript.rhino.Token.SHNE :
				return "SHNE";
			case com.google.javascript.rhino.Token.REGEXP :
				return "REGEXP";
			case com.google.javascript.rhino.Token.THROW :
				return "THROW";
			case com.google.javascript.rhino.Token.IN :
				return "IN";
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return "INSTANCEOF";
			case com.google.javascript.rhino.Token.ARRAYLIT :
				return "ARRAYLIT";
			case com.google.javascript.rhino.Token.OBJECTLIT :
				return "OBJECTLIT";
			case com.google.javascript.rhino.Token.TRY :
				return "TRY";
			case com.google.javascript.rhino.Token.PARAM_LIST :
				return "PARAM_LIST";
			case com.google.javascript.rhino.Token.COMMA :
				return "COMMA";
			case com.google.javascript.rhino.Token.ASSIGN :
				return "ASSIGN";
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				return "ASSIGN_BITOR";
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				return "ASSIGN_BITXOR";
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				return "ASSIGN_BITAND";
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
				return "ASSIGN_LSH";
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
				return "ASSIGN_RSH";
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
				return "ASSIGN_URSH";
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
				return "ASSIGN_ADD";
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
				return "ASSIGN_SUB";
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
				return "ASSIGN_MUL";
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				return "ASSIGN_DIV";
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				return "ASSIGN_MOD";
			case com.google.javascript.rhino.Token.HOOK :
				return "HOOK";
			case com.google.javascript.rhino.Token.COLON :
				return "COLON";
			case com.google.javascript.rhino.Token.OR :
				return "OR";
			case com.google.javascript.rhino.Token.AND :
				return "AND";
			case com.google.javascript.rhino.Token.INC :
				return "INC";
			case com.google.javascript.rhino.Token.DEC :
				return "DEC";
			case com.google.javascript.rhino.Token.FUNCTION :
				return "FUNCTION";
			case com.google.javascript.rhino.Token.IF :
				return "IF";
			case com.google.javascript.rhino.Token.SWITCH :
				return "SWITCH";
			case com.google.javascript.rhino.Token.CASE :
				return "CASE";
			case com.google.javascript.rhino.Token.DEFAULT_CASE :
				return "DEFAULT_CASE";
			case com.google.javascript.rhino.Token.WHILE :
				return "WHILE";
			case com.google.javascript.rhino.Token.DO :
				return "DO";
			case com.google.javascript.rhino.Token.FOR :
				return "FOR";
			case com.google.javascript.rhino.Token.BREAK :
				return "BREAK";
			case com.google.javascript.rhino.Token.CONTINUE :
				return "CONTINUE";
			case com.google.javascript.rhino.Token.VAR :
				return "VAR";
			case com.google.javascript.rhino.Token.WITH :
				return "WITH";
			case com.google.javascript.rhino.Token.CATCH :
				return "CATCH";
			case com.google.javascript.rhino.Token.EMPTY :
				return "EMPTY";
			case com.google.javascript.rhino.Token.BLOCK :
				return "BLOCK";
			case com.google.javascript.rhino.Token.LABEL :
				return "LABEL";
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return "EXPR_RESULT";
			case com.google.javascript.rhino.Token.SCRIPT :
				return "SCRIPT";
			case com.google.javascript.rhino.Token.GETTER_DEF :
				return "GETTER_DEF";
			case com.google.javascript.rhino.Token.SETTER_DEF :
				return "SETTER_DEF";
			case com.google.javascript.rhino.Token.CONST :
				return "CONST";
			case com.google.javascript.rhino.Token.DEBUGGER :
				return "DEBUGGER";
			case com.google.javascript.rhino.Token.CAST :
				return "CAST";
			case com.google.javascript.rhino.Token.ANNOTATION :
				return "ANNOTATION";
			case com.google.javascript.rhino.Token.PIPE :
				return "PIPE";
			case com.google.javascript.rhino.Token.STAR :
				return "STAR";
			case com.google.javascript.rhino.Token.EOC :
				return "EOC";
			case com.google.javascript.rhino.Token.QMARK :
				return "QMARK";
			case com.google.javascript.rhino.Token.ELLIPSIS :
				return "ELLIPSIS";
			case com.google.javascript.rhino.Token.BANG :
				return "BANG";
			case com.google.javascript.rhino.Token.VOID :
				return "VOID";
			case com.google.javascript.rhino.Token.EQUALS :
				return "EQUALS";
		}
		throw new java.lang.IllegalStateException(java.lang.String.valueOf(token));
	}
}

