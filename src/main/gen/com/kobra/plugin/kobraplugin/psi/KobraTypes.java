// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.kobraplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kobra.plugin.kobraplugin.psi.impl.*;

public interface KobraTypes {

  IElementType ADD = new KobraElementType("ADD");
  IElementType ADDITIVE_EXPRESSION = new KobraElementType("ADDITIVE_EXPRESSION");
  IElementType ADDITIVE_OPERATOR = new KobraElementType("ADDITIVE_OPERATOR");
  IElementType ARROW = new KobraElementType("ARROW");
  IElementType AS = new KobraElementType("AS");
  IElementType ASSIGNMENT = new KobraElementType("ASSIGNMENT");
  IElementType AS_EXPRESSION = new KobraElementType("AS_EXPRESSION");
  IElementType AS_OPERATOR = new KobraElementType("AS_OPERATOR");
  IElementType AS_SAFE = new KobraElementType("AS_SAFE");
  IElementType BLOCK = new KobraElementType("BLOCK");
  IElementType BOOLEAN_LITERAL = new KobraElementType("BOOLEAN_LITERAL");
  IElementType BREAK = new KobraElementType("BREAK");
  IElementType CALL_SUFFIX = new KobraElementType("CALL_SUFFIX");
  IElementType CATCH = new KobraElementType("CATCH");
  IElementType CATCH_BLOCK = new KobraElementType("CATCH_BLOCK");
  IElementType CLASS_ = new KobraElementType("CLASS_");
  IElementType CLASS_BODY = new KobraElementType("CLASS_BODY");
  IElementType CLASS_DECLARATION = new KobraElementType("CLASS_DECLARATION");
  IElementType CLASS_MEMBER_DECLARATION = new KobraElementType("CLASS_MEMBER_DECLARATION");
  IElementType CLASS_MEMBER_DECLARATIONS = new KobraElementType("CLASS_MEMBER_DECLARATIONS");
  IElementType CLASS_PARAMETER = new KobraElementType("CLASS_PARAMETER");
  IElementType CLASS_PARAMETERS = new KobraElementType("CLASS_PARAMETERS");
  IElementType COLLECTION_LITERAL = new KobraElementType("COLLECTION_LITERAL");
  IElementType COLON = new KobraElementType("COLON");
  IElementType COLONCOLON = new KobraElementType("COLONCOLON");
  IElementType COMMA = new KobraElementType("COMMA");
  IElementType COMPARISON = new KobraElementType("COMPARISON");
  IElementType COMPARISON_OPERATOR = new KobraElementType("COMPARISON_OPERATOR");
  IElementType CONJ = new KobraElementType("CONJ");
  IElementType CONJUNCTION = new KobraElementType("CONJUNCTION");
  IElementType CONSTRUCTOR = new KobraElementType("CONSTRUCTOR");
  IElementType CONSTRUCTOR_INVOCATION = new KobraElementType("CONSTRUCTOR_INVOCATION");
  IElementType CONTINUE = new KobraElementType("CONTINUE");
  IElementType CONTROL_STRUCTURE_BODY = new KobraElementType("CONTROL_STRUCTURE_BODY");
  IElementType DECLARATION = new KobraElementType("DECLARATION");
  IElementType DECR = new KobraElementType("DECR");
  IElementType DELEGATION_SPECIFIER = new KobraElementType("DELEGATION_SPECIFIER");
  IElementType DELEGATION_SPECIFIERS = new KobraElementType("DELEGATION_SPECIFIERS");
  IElementType DELIMITED_COMMENT = new KobraElementType("DELIMITED_COMMENT");
  IElementType DIGIT = new KobraElementType("DIGIT");
  IElementType DISJ = new KobraElementType("DISJ");
  IElementType DISJUNCTION = new KobraElementType("DISJUNCTION");
  IElementType DIV = new KobraElementType("DIV");
  IElementType DOT = new KobraElementType("DOT");
  IElementType ELSE = new KobraElementType("ELSE");
  IElementType ELVIS = new KobraElementType("ELVIS");
  IElementType ELVIS_EXPRESSION = new KobraElementType("ELVIS_EXPRESSION");
  IElementType EQEQ = new KobraElementType("EQEQ");
  IElementType EQUALITY = new KobraElementType("EQUALITY");
  IElementType EQUALITY_OPERATOR = new KobraElementType("EQUALITY_OPERATOR");
  IElementType EXCL = new KobraElementType("EXCL");
  IElementType EXCL_EQ = new KobraElementType("EXCL_EQ");
  IElementType EXCL_NO_WS = new KobraElementType("EXCL_NO_WS");
  IElementType EXCL_WS = new KobraElementType("EXCL_WS");
  IElementType EXPRESSION = new KobraElementType("EXPRESSION");
  IElementType FINALLY = new KobraElementType("FINALLY");
  IElementType FINALLY_BLOCK = new KobraElementType("FINALLY_BLOCK");
  IElementType FOR = new KobraElementType("FOR");
  IElementType FUN = new KobraElementType("FUN");
  IElementType FUNCTION_BODY = new KobraElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new KobraElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_PARAMETER = new KobraElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new KobraElementType("FUNCTION_PARAMETERS");
  IElementType GE = new KobraElementType("GE");
  IElementType GENERIC_CALL_LIKE_COMPARISON = new KobraElementType("GENERIC_CALL_LIKE_COMPARISON");
  IElementType HIDDEN = new KobraElementType("HIDDEN");
  IElementType IDENTIFIER = new KobraElementType("IDENTIFIER");
  IElementType IF = new KobraElementType("IF");
  IElementType IF_EXPRESSION = new KobraElementType("IF_EXPRESSION");
  IElementType IMPORT = new KobraElementType("IMPORT");
  IElementType IMPORT_ALIAS = new KobraElementType("IMPORT_ALIAS");
  IElementType IMPORT_HEADER = new KobraElementType("IMPORT_HEADER");
  IElementType IMPORT_LIST = new KobraElementType("IMPORT_LIST");
  IElementType IN = new KobraElementType("IN");
  IElementType INCR = new KobraElementType("INCR");
  IElementType INFIX_FUNCTION_CALL = new KobraElementType("INFIX_FUNCTION_CALL");
  IElementType INFIX_OPERATION = new KobraElementType("INFIX_OPERATION");
  IElementType INTEGER_LITERAL = new KobraElementType("INTEGER_LITERAL");
  IElementType INTERFACE = new KobraElementType("INTERFACE");
  IElementType IN_OPERATOR = new KobraElementType("IN_OPERATOR");
  IElementType IS = new KobraElementType("IS");
  IElementType IS_OPERATOR = new KobraElementType("IS_OPERATOR");
  IElementType JUMP_EXPRESSION = new KobraElementType("JUMP_EXPRESSION");
  IElementType LANGLE = new KobraElementType("LANGLE");
  IElementType LCURL = new KobraElementType("LCURL");
  IElementType LE = new KobraElementType("LE");
  IElementType LETTER = new KobraElementType("LETTER");
  IElementType LINE_COMMENT = new KobraElementType("LINE_COMMENT");
  IElementType LITERAL_CONSTANT = new KobraElementType("LITERAL_CONSTANT");
  IElementType LPAREN = new KobraElementType("LPAREN");
  IElementType LSQUARE = new KobraElementType("LSQUARE");
  IElementType MEMBER_ACCESS_OPERATOR = new KobraElementType("MEMBER_ACCESS_OPERATOR");
  IElementType MOD = new KobraElementType("MOD");
  IElementType MULT = new KobraElementType("MULT");
  IElementType MULTIPLICATIVE_EXPRESSION = new KobraElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType MULTIPLICATIVE_OPERATOR = new KobraElementType("MULTIPLICATIVE_OPERATOR");
  IElementType NAVIGATION_SUFFIX = new KobraElementType("NAVIGATION_SUFFIX");
  IElementType NL = new KobraElementType("NL");
  IElementType NOT_IN = new KobraElementType("NOT_IN");
  IElementType NOT_IS = new KobraElementType("NOT_IS");
  IElementType NULL_LITERAL = new KobraElementType("NULL_LITERAL");
  IElementType PARENTHESIZED_EXPRESSION = new KobraElementType("PARENTHESIZED_EXPRESSION");
  IElementType POSTFIX_UNARY_EXPRESSION = new KobraElementType("POSTFIX_UNARY_EXPRESSION");
  IElementType POSTFIX_UNARY_OPERATOR = new KobraElementType("POSTFIX_UNARY_OPERATOR");
  IElementType POSTFIX_UNARY_SUFFIX = new KobraElementType("POSTFIX_UNARY_SUFFIX");
  IElementType PREFIX_UNARY_EXPRESSION = new KobraElementType("PREFIX_UNARY_EXPRESSION");
  IElementType PREFIX_UNARY_OPERATOR = new KobraElementType("PREFIX_UNARY_OPERATOR");
  IElementType PRIMARY_CONSTRUCTOR = new KobraElementType("PRIMARY_CONSTRUCTOR");
  IElementType PRIMARY_EXPRESSION = new KobraElementType("PRIMARY_EXPRESSION");
  IElementType PRIVATE_ = new KobraElementType("PRIVATE_");
  IElementType PROPERTY_DECLARATION = new KobraElementType("PROPERTY_DECLARATION");
  IElementType PROTECTED = new KobraElementType("PROTECTED");
  IElementType PUBLIC = new KobraElementType("PUBLIC");
  IElementType QUEST = new KobraElementType("QUEST");
  IElementType QUEST_NO_WS = new KobraElementType("QUEST_NO_WS");
  IElementType QUOTE = new KobraElementType("QUOTE");
  IElementType RANGE = new KobraElementType("RANGE");
  IElementType RANGE_EXPRESSION = new KobraElementType("RANGE_EXPRESSION");
  IElementType RANGE_TEST = new KobraElementType("RANGE_TEST");
  IElementType RANGLE = new KobraElementType("RANGLE");
  IElementType RCURL = new KobraElementType("RCURL");
  IElementType RETURN = new KobraElementType("RETURN");
  IElementType RPAREN = new KobraElementType("RPAREN");
  IElementType RSQUARE = new KobraElementType("RSQUARE");
  IElementType SEMI = new KobraElementType("SEMI");
  IElementType SEMICOLON = new KobraElementType("SEMICOLON");
  IElementType SEMIS = new KobraElementType("SEMIS");
  IElementType SIMPLE_IDENTIFIER = new KobraElementType("SIMPLE_IDENTIFIER");
  IElementType STATEMENT = new KobraElementType("STATEMENT");
  IElementType STATEMENTS = new KobraElementType("STATEMENTS");
  IElementType STRING = new KobraElementType("STRING");
  IElementType STRING_LITERAL = new KobraElementType("STRING_LITERAL");
  IElementType SUB = new KobraElementType("SUB");
  IElementType SUPER = new KobraElementType("SUPER");
  IElementType SUPER_EXPRESSION = new KobraElementType("SUPER_EXPRESSION");
  IElementType SYMBOL = new KobraElementType("SYMBOL");
  IElementType THIS = new KobraElementType("THIS");
  IElementType THIS_EXPRESSION = new KobraElementType("THIS_EXPRESSION");
  IElementType THROW = new KobraElementType("THROW");
  IElementType TRY = new KobraElementType("TRY");
  IElementType TRY_EXPRESSION = new KobraElementType("TRY_EXPRESSION");
  IElementType TYPE = new KobraElementType("TYPE");
  IElementType TYPE_TEST = new KobraElementType("TYPE_TEST");
  IElementType UNARY_PREFIX = new KobraElementType("UNARY_PREFIX");
  IElementType VAL = new KobraElementType("VAL");
  IElementType VALUE_ARGUMENT = new KobraElementType("VALUE_ARGUMENT");
  IElementType VALUE_ARGUMENTS = new KobraElementType("VALUE_ARGUMENTS");
  IElementType VAR = new KobraElementType("VAR");
  IElementType VARIABLE_DECLARATION = new KobraElementType("VARIABLE_DECLARATION");
  IElementType WHEN = new KobraElementType("WHEN");
  IElementType WHEN_CONDITION = new KobraElementType("WHEN_CONDITION");
  IElementType WHEN_ENTRY = new KobraElementType("WHEN_ENTRY");
  IElementType WHEN_EXPRESSION = new KobraElementType("WHEN_EXPRESSION");
  IElementType WHEN_SUBJECT = new KobraElementType("WHEN_SUBJECT");

  IElementType COMMENT = new KobraTokenType("COMMENT");
  IElementType EOF = new KobraTokenType("EOF");
  IElementType WS = new KobraTokenType("WS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD) {
        return new KobraAddImpl(node);
      }
      else if (type == ADDITIVE_EXPRESSION) {
        return new KobraAdditiveExpressionImpl(node);
      }
      else if (type == ADDITIVE_OPERATOR) {
        return new KobraAdditiveOperatorImpl(node);
      }
      else if (type == ARROW) {
        return new KobraArrowImpl(node);
      }
      else if (type == AS) {
        return new KobraAsImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new KobraAssignmentImpl(node);
      }
      else if (type == AS_EXPRESSION) {
        return new KobraAsExpressionImpl(node);
      }
      else if (type == AS_OPERATOR) {
        return new KobraAsOperatorImpl(node);
      }
      else if (type == AS_SAFE) {
        return new KobraAsSafeImpl(node);
      }
      else if (type == BLOCK) {
        return new KobraBlockImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new KobraBooleanLiteralImpl(node);
      }
      else if (type == BREAK) {
        return new KobraBreakImpl(node);
      }
      else if (type == CALL_SUFFIX) {
        return new KobraCallSuffixImpl(node);
      }
      else if (type == CATCH) {
        return new KobraCatchImpl(node);
      }
      else if (type == CATCH_BLOCK) {
        return new KobraCatchBlockImpl(node);
      }
      else if (type == CLASS_) {
        return new KobraClass_Impl(node);
      }
      else if (type == CLASS_BODY) {
        return new KobraClassBodyImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new KobraClassDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER_DECLARATION) {
        return new KobraClassMemberDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER_DECLARATIONS) {
        return new KobraClassMemberDeclarationsImpl(node);
      }
      else if (type == CLASS_PARAMETER) {
        return new KobraClassParameterImpl(node);
      }
      else if (type == CLASS_PARAMETERS) {
        return new KobraClassParametersImpl(node);
      }
      else if (type == COLLECTION_LITERAL) {
        return new KobraCollectionLiteralImpl(node);
      }
      else if (type == COLON) {
        return new KobraColonImpl(node);
      }
      else if (type == COLONCOLON) {
        return new KobraColoncolonImpl(node);
      }
      else if (type == COMMA) {
        return new KobraCommaImpl(node);
      }
      else if (type == COMPARISON) {
        return new KobraComparisonImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new KobraComparisonOperatorImpl(node);
      }
      else if (type == CONJ) {
        return new KobraConjImpl(node);
      }
      else if (type == CONJUNCTION) {
        return new KobraConjunctionImpl(node);
      }
      else if (type == CONSTRUCTOR) {
        return new KobraConstructorImpl(node);
      }
      else if (type == CONSTRUCTOR_INVOCATION) {
        return new KobraConstructorInvocationImpl(node);
      }
      else if (type == CONTINUE) {
        return new KobraContinueImpl(node);
      }
      else if (type == CONTROL_STRUCTURE_BODY) {
        return new KobraControlStructureBodyImpl(node);
      }
      else if (type == DECLARATION) {
        return new KobraDeclarationImpl(node);
      }
      else if (type == DECR) {
        return new KobraDecrImpl(node);
      }
      else if (type == DELEGATION_SPECIFIER) {
        return new KobraDelegationSpecifierImpl(node);
      }
      else if (type == DELEGATION_SPECIFIERS) {
        return new KobraDelegationSpecifiersImpl(node);
      }
      else if (type == DELIMITED_COMMENT) {
        return new KobraDelimitedCommentImpl(node);
      }
      else if (type == DIGIT) {
        return new KobraDigitImpl(node);
      }
      else if (type == DISJ) {
        return new KobraDisjImpl(node);
      }
      else if (type == DISJUNCTION) {
        return new KobraDisjunctionImpl(node);
      }
      else if (type == DIV) {
        return new KobraDivImpl(node);
      }
      else if (type == DOT) {
        return new KobraDotImpl(node);
      }
      else if (type == ELSE) {
        return new KobraElseImpl(node);
      }
      else if (type == ELVIS) {
        return new KobraElvisImpl(node);
      }
      else if (type == ELVIS_EXPRESSION) {
        return new KobraElvisExpressionImpl(node);
      }
      else if (type == EQEQ) {
        return new KobraEqeqImpl(node);
      }
      else if (type == EQUALITY) {
        return new KobraEqualityImpl(node);
      }
      else if (type == EQUALITY_OPERATOR) {
        return new KobraEqualityOperatorImpl(node);
      }
      else if (type == EXCL) {
        return new KobraExclImpl(node);
      }
      else if (type == EXCL_EQ) {
        return new KobraExclEqImpl(node);
      }
      else if (type == EXCL_NO_WS) {
        return new KobraExclNoWsImpl(node);
      }
      else if (type == EXCL_WS) {
        return new KobraExclWsImpl(node);
      }
      else if (type == EXPRESSION) {
        return new KobraExpressionImpl(node);
      }
      else if (type == FINALLY) {
        return new KobraFinallyImpl(node);
      }
      else if (type == FINALLY_BLOCK) {
        return new KobraFinallyBlockImpl(node);
      }
      else if (type == FOR) {
        return new KobraForImpl(node);
      }
      else if (type == FUN) {
        return new KobraFunImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new KobraFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new KobraFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new KobraFunctionParameterImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new KobraFunctionParametersImpl(node);
      }
      else if (type == GE) {
        return new KobraGeImpl(node);
      }
      else if (type == GENERIC_CALL_LIKE_COMPARISON) {
        return new KobraGenericCallLikeComparisonImpl(node);
      }
      else if (type == HIDDEN) {
        return new KobraHiddenImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new KobraIdentifierImpl(node);
      }
      else if (type == IF) {
        return new KobraIfImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new KobraIfExpressionImpl(node);
      }
      else if (type == IMPORT) {
        return new KobraImportImpl(node);
      }
      else if (type == IMPORT_ALIAS) {
        return new KobraImportAliasImpl(node);
      }
      else if (type == IMPORT_HEADER) {
        return new KobraImportHeaderImpl(node);
      }
      else if (type == IMPORT_LIST) {
        return new KobraImportListImpl(node);
      }
      else if (type == IN) {
        return new KobraInImpl(node);
      }
      else if (type == INCR) {
        return new KobraIncrImpl(node);
      }
      else if (type == INFIX_FUNCTION_CALL) {
        return new KobraInfixFunctionCallImpl(node);
      }
      else if (type == INFIX_OPERATION) {
        return new KobraInfixOperationImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new KobraIntegerLiteralImpl(node);
      }
      else if (type == INTERFACE) {
        return new KobraInterfaceImpl(node);
      }
      else if (type == IN_OPERATOR) {
        return new KobraInOperatorImpl(node);
      }
      else if (type == IS) {
        return new KobraIsImpl(node);
      }
      else if (type == IS_OPERATOR) {
        return new KobraIsOperatorImpl(node);
      }
      else if (type == JUMP_EXPRESSION) {
        return new KobraJumpExpressionImpl(node);
      }
      else if (type == LANGLE) {
        return new KobraLangleImpl(node);
      }
      else if (type == LCURL) {
        return new KobraLcurlImpl(node);
      }
      else if (type == LE) {
        return new KobraLeImpl(node);
      }
      else if (type == LETTER) {
        return new KobraLetterImpl(node);
      }
      else if (type == LINE_COMMENT) {
        return new KobraLineCommentImpl(node);
      }
      else if (type == LITERAL_CONSTANT) {
        return new KobraLiteralConstantImpl(node);
      }
      else if (type == LPAREN) {
        return new KobraLparenImpl(node);
      }
      else if (type == LSQUARE) {
        return new KobraLsquareImpl(node);
      }
      else if (type == MEMBER_ACCESS_OPERATOR) {
        return new KobraMemberAccessOperatorImpl(node);
      }
      else if (type == MOD) {
        return new KobraModImpl(node);
      }
      else if (type == MULT) {
        return new KobraMultImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new KobraMultiplicativeExpressionImpl(node);
      }
      else if (type == MULTIPLICATIVE_OPERATOR) {
        return new KobraMultiplicativeOperatorImpl(node);
      }
      else if (type == NAVIGATION_SUFFIX) {
        return new KobraNavigationSuffixImpl(node);
      }
      else if (type == NL) {
        return new KobraNlImpl(node);
      }
      else if (type == NOT_IN) {
        return new KobraNotInImpl(node);
      }
      else if (type == NOT_IS) {
        return new KobraNotIsImpl(node);
      }
      else if (type == NULL_LITERAL) {
        return new KobraNullLiteralImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new KobraParenthesizedExpressionImpl(node);
      }
      else if (type == POSTFIX_UNARY_EXPRESSION) {
        return new KobraPostfixUnaryExpressionImpl(node);
      }
      else if (type == POSTFIX_UNARY_OPERATOR) {
        return new KobraPostfixUnaryOperatorImpl(node);
      }
      else if (type == POSTFIX_UNARY_SUFFIX) {
        return new KobraPostfixUnarySuffixImpl(node);
      }
      else if (type == PREFIX_UNARY_EXPRESSION) {
        return new KobraPrefixUnaryExpressionImpl(node);
      }
      else if (type == PREFIX_UNARY_OPERATOR) {
        return new KobraPrefixUnaryOperatorImpl(node);
      }
      else if (type == PRIMARY_CONSTRUCTOR) {
        return new KobraPrimaryConstructorImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new KobraPrimaryExpressionImpl(node);
      }
      else if (type == PRIVATE_) {
        return new KobraPrivate_Impl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new KobraPropertyDeclarationImpl(node);
      }
      else if (type == PROTECTED) {
        return new KobraProtectedImpl(node);
      }
      else if (type == PUBLIC) {
        return new KobraPublicImpl(node);
      }
      else if (type == QUEST) {
        return new KobraQuestImpl(node);
      }
      else if (type == QUEST_NO_WS) {
        return new KobraQuestNoWsImpl(node);
      }
      else if (type == QUOTE) {
        return new KobraQuoteImpl(node);
      }
      else if (type == RANGE) {
        return new KobraRangeImpl(node);
      }
      else if (type == RANGE_EXPRESSION) {
        return new KobraRangeExpressionImpl(node);
      }
      else if (type == RANGE_TEST) {
        return new KobraRangeTestImpl(node);
      }
      else if (type == RANGLE) {
        return new KobraRangleImpl(node);
      }
      else if (type == RCURL) {
        return new KobraRcurlImpl(node);
      }
      else if (type == RETURN) {
        return new KobraReturnImpl(node);
      }
      else if (type == RPAREN) {
        return new KobraRparenImpl(node);
      }
      else if (type == RSQUARE) {
        return new KobraRsquareImpl(node);
      }
      else if (type == SEMI) {
        return new KobraSemiImpl(node);
      }
      else if (type == SEMICOLON) {
        return new KobraSemicolonImpl(node);
      }
      else if (type == SEMIS) {
        return new KobraSemisImpl(node);
      }
      else if (type == SIMPLE_IDENTIFIER) {
        return new KobraSimpleIdentifierImpl(node);
      }
      else if (type == STATEMENT) {
        return new KobraStatementImpl(node);
      }
      else if (type == STATEMENTS) {
        return new KobraStatementsImpl(node);
      }
      else if (type == STRING) {
        return new KobraStringImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new KobraStringLiteralImpl(node);
      }
      else if (type == SUB) {
        return new KobraSubImpl(node);
      }
      else if (type == SUPER) {
        return new KobraSuperImpl(node);
      }
      else if (type == SUPER_EXPRESSION) {
        return new KobraSuperExpressionImpl(node);
      }
      else if (type == SYMBOL) {
        return new KobraSymbolImpl(node);
      }
      else if (type == THIS) {
        return new KobraThisImpl(node);
      }
      else if (type == THIS_EXPRESSION) {
        return new KobraThisExpressionImpl(node);
      }
      else if (type == THROW) {
        return new KobraThrowImpl(node);
      }
      else if (type == TRY) {
        return new KobraTryImpl(node);
      }
      else if (type == TRY_EXPRESSION) {
        return new KobraTryExpressionImpl(node);
      }
      else if (type == TYPE) {
        return new KobraTypeImpl(node);
      }
      else if (type == TYPE_TEST) {
        return new KobraTypeTestImpl(node);
      }
      else if (type == UNARY_PREFIX) {
        return new KobraUnaryPrefixImpl(node);
      }
      else if (type == VAL) {
        return new KobraValImpl(node);
      }
      else if (type == VALUE_ARGUMENT) {
        return new KobraValueArgumentImpl(node);
      }
      else if (type == VALUE_ARGUMENTS) {
        return new KobraValueArgumentsImpl(node);
      }
      else if (type == VAR) {
        return new KobraVarImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new KobraVariableDeclarationImpl(node);
      }
      else if (type == WHEN) {
        return new KobraWhenImpl(node);
      }
      else if (type == WHEN_CONDITION) {
        return new KobraWhenConditionImpl(node);
      }
      else if (type == WHEN_ENTRY) {
        return new KobraWhenEntryImpl(node);
      }
      else if (type == WHEN_EXPRESSION) {
        return new KobraWhenExpressionImpl(node);
      }
      else if (type == WHEN_SUBJECT) {
        return new KobraWhenSubjectImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
