package com.kobra.plugin.kobraplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.kobra.plugin.kobraplugin.psi.KobraTypes;

%%

%class KobraLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return
%eof}

// SECTION=keywords

IMPORT='import'
CLASS_='class'
INTERFACE='interface'
FUN='fun'
CONSTRUCTOR='constructor'
IF='if'
ELSE='else'
TRY='try'
CATCH='catch'
FINALLY='finally'
FOR='for'
RETURN='return'
IS='is'
IN='in'
NOT_IS='\!is' (Hidden | NL)
NOT_IN='\!in' (Hidden | NL)
AS='as'
AS_SAFE='as\?'
THIS='this'
SUPER='super'
THROW='throw'
CONTINUE='continue'
BREAK='break'
WHEN='when'

// SECTION=lexicalModifiers

PUBLIC='public'
PRIVATE_='private'
PROTECTED='protected'

VAL='val'
VAR='var'

STRING=\" [^\r\n]* \"

LPAREN='\('
RPAREN='\)'
LCURL='\{'
RCURL='\}'
COMMA=','
COLON=':'
COLONCOLON='::'
ASSIGNMENT='='
QUEST='\?' Hidden
CONJ='&&'
DISJ='\|\|'
SEMICOLON=';'
DOT='\.'
QUOTE='\"'
EQEQ='=='
EXCL_EQ='\!='
LANGLE='<'
RANGLE='>'
LE='<='
GE='>='
QUEST_NO_WS='\?'
ADD='\+'
SUB='-'
MULT='\*'
DIV='\/'
MOD='%'
INCR='\+\+'
DECR='--'
EXCL_WS='\!' Hidden
EXCL_NO_WS='\!'
ARROW='->'
LSQUARE='\['
RSQUARE=']'
RANGE='\.\.'

NL='\n' | '\r' '\n'?

Hidden= DelimitedComment | LineComment | WS

LineComment= '\/\/' [^\r\n]*
DelimitedComment='\/\*' ( DelimitedComment | . )*? '\*\/'

WS=	(\ | \t | \u000C)

//FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
//VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
//END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
//KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%state WAITING_VALUE

%%

<YYINITIAL> {LineComment} { yybegin(YYINITIAL); return KobraTypes.COMMENT; }

({WS})+                   { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
