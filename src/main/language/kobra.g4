grammar kobra;

// SECTION: general

program
    : NL* importList statements NL* EOF
    ;

importList
    : importHeader*
    ;

importHeader
    : IMPORT identifier (DOT MULT | importAlias)? semi?
    ;

importAlias
    : AS simpleIdentifier
    ;

declaration
    : classDeclaration
    | functionDeclaration
    | propertyDeclaration
    ;

propertyDeclaration
    : (VAL | VAR) simpleIdentifier (COLON NL* type)? (NL* (ASSIGNMENT NL* expression))?
    ;

functionDeclaration // todo: modifiers
    : FUN simpleIdentifier functionParameters (COLON NL* type)? functionBody
    ;

variableDeclaration
    : simpleIdentifier (NL* COLON NL* type)?
    ;

functionBody
    : block
    | ASSIGNMENT NL* expression
    ;

functionParameters
    : LPAREN (functionParameter (NL* COMMA NL* functionParameter)* (NL* COMMA)?)? NL* RPAREN
    ;

functionParameter
    : identifier COLON identifier
    ;

// SECTION: statements

statement // todo
    : declaration | assignment | expression
    ;

assignment
    : identifier ASSIGNMENT expression NL*
    ;

statements
    : (statement (semis statement)*)? semis?
    ;

block
    : LCURL NL* statements NL* RCURL
    ;

// SECTION: classes

classDeclaration
    : CLASS simpleIdentifier (primaryConstructor?)
    (COLON delegationSpecifiers)?
    (NL* classBody)?
    ;

classBody: LCURL NL* classMemberDeclarations NL* RCURL;

classMemberDeclarations: (classMemberDeclaration NL*)*;

classMemberDeclaration: declaration;

primaryConstructor
    : CONSTRUCTOR? classParameters
    ;

classParameters
    : LPAREN NL* (classParameter (NL* COMMA NL* classParameter)* (NL* COMMA)?)? NL* RPAREN
    ;

classParameter
    : (VAL | VAR)? simpleIdentifier COLON NL* type (NL* ASSIGNMENT NL* expression)?
    ;

delegationSpecifiers
    : delegationSpecifier (NL* COMMA NL* delegationSpecifier)*
    ;

delegationSpecifier
    : simpleIdentifier constructorInvocation
    ;

constructorInvocation
    : functionParameters
    ;

// SECTION: expressions

expression
    : disjunction
    ;

disjunction
    : conjunction (NL* DISJ NL* conjunction)*
    ;

conjunction
    : equality (NL* CONJ NL* equality)*
    ;

equality
    : comparison (equalityOperator NL* comparison)*
    ;

comparison
    : genericCallLikeComparison (comparisonOperator NL* genericCallLikeComparison)*
    ;

genericCallLikeComparison
    : infixOperation
    ;

infixOperation
    : elvisExpression (inOperator NL* elvisExpression | isOperator NL* type)*
    ;

elvisExpression
    : infixFunctionCall (NL* elvis NL* infixFunctionCall)*
    ;

infixFunctionCall
    : rangeExpression (simpleIdentifier NL* rangeExpression)*
    ;

rangeExpression
    : additiveExpression (RANGE NL* additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression (additiveOperator NL* multiplicativeExpression)*
    ;

multiplicativeExpression
    : asExpression (multiplicativeOperator NL* asExpression)*
    ;

asExpression
    : prefixUnaryExpression (NL* asOperator NL* type)*
    ;

prefixUnaryExpression
    : unaryPrefix* postfixUnaryExpression
    ;

postfixUnaryExpression
    : primaryExpression postfixUnarySuffix*
    ;

postfixUnarySuffix // todo
    : postfixUnaryOperator
    | callSuffix
    | navigationSuffix
    ;

navigationSuffix
    : memberAccessOperator NL* (simpleIdentifier | parenthesizedExpression | CLASS)
    ;

unaryPrefix
    : prefixUnaryOperator NL*
    ;

primaryExpression
    : parenthesizedExpression
    | simpleIdentifier
    | literalConstant
    | stringLiteral
    | collectionLiteral
    | thisExpression
    | superExpression
    | ifExpression
    | whenExpression
    | tryExpression
    | jumpExpression
    ;

parenthesizedExpression
    : LPAREN NL* expression NL* RPAREN
    ;

literalConstant
    : BooleanLiteral
    | IntegerLiteral
    | NullLiteral
    ;

stringLiteral
    : StringLiteral
    ;

collectionLiteral
    : LSQUARE NL* (expression (NL* COMMA NL* expression)* (NL* COMMA)? NL*)? RSQUARE
    ;

thisExpression
    : THIS
    ;

superExpression
    : SUPER (LANGLE NL* type NL* RANGLE)?
    ;

ifExpression
    : IF NL* LPAREN NL* expression NL* RPAREN NL*
      ( controlStructureBody
      | controlStructureBody? NL* SEMICOLON? NL* ELSE NL* (controlStructureBody | SEMICOLON)
      | SEMICOLON)
    ;

controlStructureBody
    : block
    | statement
    ;

whenExpression
    : WHEN NL* whenSubject? NL* LCURL NL* (whenEntry NL*)* NL* RCURL
    ;

whenSubject
    : LPAREN (NL* VAL NL* variableDeclaration NL* ASSIGNMENT NL*)? expression RPAREN
    ;

whenEntry
    : whenCondition (NL* COMMA NL* whenCondition)* (NL* COMMA)? NL* ARROW NL* controlStructureBody semi?
    | ELSE NL* ARROW NL* controlStructureBody semi?
    ;

whenCondition
    : expression
    | rangeTest
    | typeTest
    ;

rangeTest
    : inOperator NL* expression
    ;

typeTest
    : isOperator NL* type
    ;

tryExpression
    : TRY NL* block ((NL* catchBlock)+ (NL* finallyBlock)? | NL* finallyBlock)
    ;

catchBlock
    : CATCH NL* LPAREN simpleIdentifier COLON type (NL* COMMA)? RPAREN NL* block
    ;

finallyBlock
    : FINALLY NL* block
    ;

jumpExpression
    : THROW NL* expression
    | RETURN expression?
    | CONTINUE
    | BREAK
    ;

callSuffix
    : valueArguments
    ;

valueArguments
    : LPAREN NL* (valueArgument (NL* COMMA NL* valueArgument)* (NL* COMMA)? NL*)? RPAREN
    ;

valueArgument
    : (simpleIdentifier NL* ASSIGNMENT NL*)? MULT? NL* expression
    ;

elvis
    : QUEST_NO_WS COLON
    ;

equalityOperator
    : EXCL_EQ
    | EQEQ
    ;

comparisonOperator
    : LANGLE
    | RANGLE
    | LE
    | GE
    ;

inOperator
    : IN
    | NOT_IN
    ;

isOperator
    : IS
    | NOT_IS
    ;

asOperator
    : AS
    | AS_SAFE
    ;

additiveOperator
    : ADD
    | SUB
    ;

multiplicativeOperator
    : MULT
    | DIV
    | MOD
    ;

prefixUnaryOperator
    : SUB
    | ADD
    | excl
    ;

postfixUnaryOperator
    : INCR
    | DECR
    | EXCL_NO_WS
    ;

excl
    : EXCL_NO_WS
    | EXCL_WS
    ;

semi
    : (SEMICOLON | NL) NL*
    ;

memberAccessOperator
    : NL* DOT
    | COLONCOLON
    ;

semis
    : (SEMICOLON | NL)+
    ;

// SECTION: types

type
    : simpleIdentifier QUEST?
    ;

// SECTION: characters

fragment Letter
    : [a-zA-Z]
    ;

// SECTION: literals

BooleanLiteral: 'true'| 'false';

NullLiteral: 'null';

IntegerLiteral
    : '1'..'9' ('0'..'9')*
    | '0'
    ;

StringLiteral
    : STRING
    ;

// SECTION: keywords

IMPORT: 'import';
CLASS: 'class';
INTERFACE: 'interface';
FUN: 'fun';
CONSTRUCTOR: 'constructor';
IF: 'if';
ELSE: 'else';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
FOR: 'for';
RETURN: 'return';
IS: 'is';
IN: 'in';
NOT_IS: '!is' (Hidden | NL);
NOT_IN: '!in' (Hidden | NL);
AS: 'as';
AS_SAFE: 'as?';
THIS: 'this';
SUPER: 'super';
THROW: 'throw';
CONTINUE: 'continue';
BREAK: 'break';
WHEN: 'when';

// SECTION: lexicalModifiers

PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';

VAL: 'val';
VAR: 'var';

STRING: '"' (~[\r\n"])* '"';

LPAREN: '(';
RPAREN: ')';
LCURL: '{';
RCURL: '}';
COMMA: ',';
COLON: ':';
COLONCOLON: '::';
ASSIGNMENT: '=';
QUEST: '?' Hidden;
CONJ: '&&';
DISJ: '||';
SEMICOLON: ';';
DOT: '.';
QUOTE: '"';
EQEQ: '==';
EXCL_EQ: '!=';
LANGLE: '<';
RANGLE: '>';
LE: '<=';
GE: '>=';
QUEST_NO_WS: '?';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
MOD: '%';
INCR: '++';
DECR: '--';
EXCL_WS: '!' Hidden;
EXCL_NO_WS: '!';
ARROW: '->';
LSQUARE: '['; // todo
RSQUARE: ']';
RANGE: '..';

NL: '\n' | '\r' '\n'?;

fragment Hidden: DelimitedComment | LineComment | WS;


LineComment
    : '//' ~[\r\n]*
      -> channel(HIDDEN)
    ;

DelimitedComment
    : '/*' ( DelimitedComment | . )*? '*/'
      -> channel(HIDDEN)
    ;

WS	: 	(' '| '\t' | '\u000C') -> channel(HIDDEN)
	;

// SECTION: lexicalIdentifiers

identifier
    : simpleIdentifier (NL* DOT simpleIdentifier)*
    ;

simpleIdentifier
    : Identifier
    ;

Identifier
    : Letter (Letter | [0-9])*
    | '`' ~([\r\n] | '`')+ '`'
    ;

/** "catch all" rule for any char not matche in a token rule of your
 *  grammar. Lexers in Intellij must return all tokens good and bad.
 *  There must be a token to cover all characters, which makes sense, for
 *  an IDE. The parser however should not see these bad tokens because
 *  it just confuses the issue. Hence, the hidden channel.
 */
ERRCHAR
	:	.	-> channel(HIDDEN)
	;