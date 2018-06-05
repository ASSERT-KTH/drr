

package com.google.javascript.rhino;


public class Token {
	public static final boolean printTrees = true;

	public static boolean shouldPrintTrees() {
		return com.google.javascript.rhino.Token.printTrees;
	}

	static final boolean printNames = com.google.javascript.rhino.Token.printTrees;

	public static final int ERROR = -1;

	public static final int EOF = 0;

	public static final int EOL = 1;

	public static final int FIRST_BYTECODE_TOKEN = 2;

	public static final int ENTERWITH = 2;

	public static final int LEAVEWITH = 3;

	public static final int RETURN = 4;

	public static final int GOTO = 5;

	public static final int IFEQ = 6;

	public static final int IFNE = 7;

	public static final int SETNAME = 8;

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

	public static final int SETPROP = 34;

	public static final int GETELEM = 35;

	public static final int SETELEM = 36;

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

	public static final int BINDNAME = 48;

	public static final int THROW = 49;

	public static final int RETHROW = 50;

	public static final int IN = 51;

	public static final int INSTANCEOF = 52;

	public static final int LOCAL_LOAD = 53;

	public static final int GETVAR = 54;

	public static final int SETVAR = 55;

	public static final int CATCH_SCOPE = 56;

	public static final int ENUM_INIT_KEYS = 57;

	public static final int ENUM_INIT_VALUES = 58;

	public static final int ENUM_NEXT = 59;

	public static final int ENUM_ID = 60;

	public static final int THISFN = 61;

	public static final int RETURN_RESULT = 62;

	public static final int ARRAYLIT = 63;

	public static final int OBJECTLIT = 64;

	public static final int GET_REF = 65;

	public static final int SET_REF = 66;

	public static final int DEL_REF = 67;

	public static final int REF_CALL = 68;

	public static final int REF_SPECIAL = 69;

	public static final int DEFAULTNAMESPACE = 70;

	public static final int ESCXMLATTR = 71;

	public static final int ESCXMLTEXT = 72;

	public static final int REF_MEMBER = 73;

	public static final int REF_NS_MEMBER = 74;

	public static final int REF_NAME = 75;

	public static final int REF_NS_NAME = 76;

	public static final int LAST_BYTECODE_TOKEN = com.google.javascript.rhino.Token.REF_NS_NAME;

	public static final int TRY = 77;

	public static final int SEMI = 78;

	public static final int LB = 79;

	public static final int RB = 80;

	public static final int LC = 81;

	public static final int RC = 82;

	public static final int LP = 83;

	public static final int RP = 84;

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

	public static final int FIRST_ASSIGN = com.google.javascript.rhino.Token.ASSIGN;

	public static final int LAST_ASSIGN = com.google.javascript.rhino.Token.ASSIGN_MOD;

	public static final int HOOK = 98;

	public static final int COLON = 99;

	public static final int OR = 100;

	public static final int AND = 101;

	public static final int INC = 102;

	public static final int DEC = 103;

	public static final int DOT = 104;

	public static final int FUNCTION = 105;

	public static final int EXPORT = 106;

	public static final int IMPORT = 107;

	public static final int IF = 108;

	public static final int ELSE = 109;

	public static final int SWITCH = 110;

	public static final int CASE = 111;

	public static final int DEFAULT = 112;

	public static final int WHILE = 113;

	public static final int DO = 114;

	public static final int FOR = 115;

	public static final int BREAK = 116;

	public static final int CONTINUE = 117;

	public static final int VAR = 118;

	public static final int WITH = 119;

	public static final int CATCH = 120;

	public static final int FINALLY = 121;

	public static final int VOID = 122;

	public static final int RESERVED = 123;

	public static final int EMPTY = 124;

	public static final int BLOCK = 125;

	public static final int LABEL = 126;

	public static final int TARGET = 127;

	public static final int LOOP = 128;

	public static final int EXPR_VOID = 129;

	public static final int EXPR_RESULT = 130;

	public static final int JSR = 131;

	public static final int SCRIPT = 132;

	public static final int TYPEOFNAME = 133;

	public static final int USE_STACK = 134;

	public static final int SETPROP_OP = 135;

	public static final int SETELEM_OP = 136;

	public static final int LOCAL_BLOCK = 137;

	public static final int SET_REF_OP = 138;

	public static final int DOTDOT = 139;

	public static final int COLONCOLON = 140;

	public static final int XML = 141;

	public static final int DOTQUERY = 142;

	public static final int XMLATTR = 143;

	public static final int XMLEND = 144;

	public static final int TO_OBJECT = 145;

	public static final int TO_DOUBLE = 146;

	public static final int GET = 147;

	public static final int SET = 148;

	public static final int CONST = 149;

	public static final int SETCONST = 150;

	public static final int SETCONSTVAR = 151;

	public static final int DEBUGGER = 152;

	public static final int LABEL_NAME = 153;

	public static final int LAST_TOKEN = 153;

	public static final int ANNOTATION = 300;

	public static final int PIPE = 301;

	public static final int STAR = 302;

	public static final int EOC = 303;

	public static final int QMARK = 304;

	public static final int ELLIPSIS = 305;

	public static final int BANG = 306;

	public static final int EQUALS = 307;

	public static java.lang.String name(int token) {
		if (!(com.google.javascript.rhino.Token.printNames)) {
			return java.lang.String.valueOf(token);
		}
		switch (token) {
			case com.google.javascript.rhino.Token.ERROR :
				return "ERROR";
			case com.google.javascript.rhino.Token.EOF :
				return "EOF";
			case com.google.javascript.rhino.Token.EOL :
				return "EOL";
			case com.google.javascript.rhino.Token.ENTERWITH :
				return "ENTERWITH";
			case com.google.javascript.rhino.Token.LEAVEWITH :
				return "LEAVEWITH";
			case com.google.javascript.rhino.Token.RETURN :
				return "RETURN";
			case com.google.javascript.rhino.Token.GOTO :
				return "GOTO";
			case com.google.javascript.rhino.Token.IFEQ :
				return "IFEQ";
			case com.google.javascript.rhino.Token.IFNE :
				return "IFNE";
			case com.google.javascript.rhino.Token.SETNAME :
				return "SETNAME";
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
			case com.google.javascript.rhino.Token.SETPROP :
				return "SETPROP";
			case com.google.javascript.rhino.Token.GETELEM :
				return "GETELEM";
			case com.google.javascript.rhino.Token.SETELEM :
				return "SETELEM";
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
			case com.google.javascript.rhino.Token.BINDNAME :
				return "BINDNAME";
			case com.google.javascript.rhino.Token.THROW :
				return "THROW";
			case com.google.javascript.rhino.Token.RETHROW :
				return "RETHROW";
			case com.google.javascript.rhino.Token.IN :
				return "IN";
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return "INSTANCEOF";
			case com.google.javascript.rhino.Token.LOCAL_LOAD :
				return "LOCAL_LOAD";
			case com.google.javascript.rhino.Token.GETVAR :
				return "GETVAR";
			case com.google.javascript.rhino.Token.SETVAR :
				return "SETVAR";
			case com.google.javascript.rhino.Token.CATCH_SCOPE :
				return "CATCH_SCOPE";
			case com.google.javascript.rhino.Token.ENUM_INIT_KEYS :
				return "ENUM_INIT_KEYS";
			case com.google.javascript.rhino.Token.ENUM_INIT_VALUES :
				return "ENUM_INIT_VALUES";
			case com.google.javascript.rhino.Token.ENUM_NEXT :
				return "ENUM_NEXT";
			case com.google.javascript.rhino.Token.ENUM_ID :
				return "ENUM_ID";
			case com.google.javascript.rhino.Token.THISFN :
				return "THISFN";
			case com.google.javascript.rhino.Token.RETURN_RESULT :
				return "RETURN_RESULT";
			case com.google.javascript.rhino.Token.ARRAYLIT :
				return "ARRAYLIT";
			case com.google.javascript.rhino.Token.OBJECTLIT :
				return "OBJECTLIT";
			case com.google.javascript.rhino.Token.GET_REF :
				return "GET_REF";
			case com.google.javascript.rhino.Token.SET_REF :
				return "SET_REF";
			case com.google.javascript.rhino.Token.DEL_REF :
				return "DEL_REF";
			case com.google.javascript.rhino.Token.REF_CALL :
				return "REF_CALL";
			case com.google.javascript.rhino.Token.REF_SPECIAL :
				return "REF_SPECIAL";
			case com.google.javascript.rhino.Token.DEFAULTNAMESPACE :
				return "DEFAULTNAMESPACE";
			case com.google.javascript.rhino.Token.ESCXMLTEXT :
				return "ESCXMLTEXT";
			case com.google.javascript.rhino.Token.ESCXMLATTR :
				return "ESCXMLATTR";
			case com.google.javascript.rhino.Token.REF_MEMBER :
				return "REF_MEMBER";
			case com.google.javascript.rhino.Token.REF_NS_MEMBER :
				return "REF_NS_MEMBER";
			case com.google.javascript.rhino.Token.REF_NAME :
				return "REF_NAME";
			case com.google.javascript.rhino.Token.REF_NS_NAME :
				return "REF_NS_NAME";
			case com.google.javascript.rhino.Token.TRY :
				return "TRY";
			case com.google.javascript.rhino.Token.SEMI :
				return "SEMI";
			case com.google.javascript.rhino.Token.LB :
				return "LB";
			case com.google.javascript.rhino.Token.RB :
				return "RB";
			case com.google.javascript.rhino.Token.LC :
				return "LC";
			case com.google.javascript.rhino.Token.RC :
				return "RC";
			case com.google.javascript.rhino.Token.LP :
				return "LP";
			case com.google.javascript.rhino.Token.RP :
				return "RP";
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
			case com.google.javascript.rhino.Token.DOT :
				return "DOT";
			case com.google.javascript.rhino.Token.FUNCTION :
				return "FUNCTION";
			case com.google.javascript.rhino.Token.EXPORT :
				return "EXPORT";
			case com.google.javascript.rhino.Token.IMPORT :
				return "IMPORT";
			case com.google.javascript.rhino.Token.IF :
				return "IF";
			case com.google.javascript.rhino.Token.ELSE :
				return "ELSE";
			case com.google.javascript.rhino.Token.SWITCH :
				return "SWITCH";
			case com.google.javascript.rhino.Token.CASE :
				return "CASE";
			case com.google.javascript.rhino.Token.DEFAULT :
				return "DEFAULT";
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
			case com.google.javascript.rhino.Token.FINALLY :
				return "FINALLY";
			case com.google.javascript.rhino.Token.RESERVED :
				return "RESERVED";
			case com.google.javascript.rhino.Token.EMPTY :
				return "EMPTY";
			case com.google.javascript.rhino.Token.BLOCK :
				return "BLOCK";
			case com.google.javascript.rhino.Token.LABEL :
				return "LABEL";
			case com.google.javascript.rhino.Token.TARGET :
				return "TARGET";
			case com.google.javascript.rhino.Token.LOOP :
				return "LOOP";
			case com.google.javascript.rhino.Token.EXPR_VOID :
				return "EXPR_VOID";
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return "EXPR_RESULT";
			case com.google.javascript.rhino.Token.JSR :
				return "JSR";
			case com.google.javascript.rhino.Token.SCRIPT :
				return "SCRIPT";
			case com.google.javascript.rhino.Token.TYPEOFNAME :
				return "TYPEOFNAME";
			case com.google.javascript.rhino.Token.USE_STACK :
				return "USE_STACK";
			case com.google.javascript.rhino.Token.SETPROP_OP :
				return "SETPROP_OP";
			case com.google.javascript.rhino.Token.SETELEM_OP :
				return "SETELEM_OP";
			case com.google.javascript.rhino.Token.LOCAL_BLOCK :
				return "LOCAL_BLOCK";
			case com.google.javascript.rhino.Token.SET_REF_OP :
				return "SET_REF_OP";
			case com.google.javascript.rhino.Token.DOTDOT :
				return "DOTDOT";
			case com.google.javascript.rhino.Token.COLONCOLON :
				return "COLONCOLON";
			case com.google.javascript.rhino.Token.XML :
				return "XML";
			case com.google.javascript.rhino.Token.DOTQUERY :
				return "DOTQUERY";
			case com.google.javascript.rhino.Token.XMLATTR :
				return "XMLATTR";
			case com.google.javascript.rhino.Token.XMLEND :
				return "XMLEND";
			case com.google.javascript.rhino.Token.TO_OBJECT :
				return "TO_OBJECT";
			case com.google.javascript.rhino.Token.TO_DOUBLE :
				return "TO_DOUBLE";
			case com.google.javascript.rhino.Token.GET :
				return "GET";
			case com.google.javascript.rhino.Token.SET :
				return "SET";
			case com.google.javascript.rhino.Token.CONST :
				return "CONST";
			case com.google.javascript.rhino.Token.SETCONST :
				return "SETCONST";
			case com.google.javascript.rhino.Token.DEBUGGER :
				return "DEBUGGER";
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

