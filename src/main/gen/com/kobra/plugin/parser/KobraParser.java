// This is a generated file. Not intended for manual editing.
package com.kobra.plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kobra.plugin.kobraplugin.psi.KobraTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class KobraParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // '+'
  public static boolean ADD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ADD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD, "<add>");
    r = consumeToken(b, "+");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '->'
  public static boolean ARROW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARROW")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARROW, "<arrow>");
    r = consumeToken(b, "->");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'as'
  public static boolean AS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS, "<as>");
    r = consumeToken(b, "as");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '='
  public static boolean ASSIGNMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGNMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = consumeToken(b, "=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'as?'
  public static boolean AS_SAFE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AS_SAFE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_SAFE, "<as safe>");
    r = consumeToken(b, "as?");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'break'
  public static boolean BREAK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BREAK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BREAK, "<break>");
    r = consumeToken(b, "break");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'true'| 'false'
  public static boolean BooleanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'catch'
  public static boolean CATCH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CATCH")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATCH, "<catch>");
    r = consumeToken(b, "catch");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'class'
  public static boolean CLASS_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_, "<class>");
    r = consumeToken(b, "class");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':'
  public static boolean COLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLON, "<colon>");
    r = consumeToken(b, ":");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '::'
  public static boolean COLONCOLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COLONCOLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLONCOLON, "<coloncolon>");
    r = consumeToken(b, "::");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ','
  public static boolean COMMA(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMA")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA, "<comma>");
    r = consumeToken(b, ",");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '&&'
  public static boolean CONJ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONJ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJ, "<conj>");
    r = consumeToken(b, "&&");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'constructor'
  public static boolean CONSTRUCTOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONSTRUCTOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR, "<constructor>");
    r = consumeToken(b, "constructor");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'continue'
  public static boolean CONTINUE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONTINUE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE, "<continue>");
    r = consumeToken(b, "continue");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '--'
  public static boolean DECR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECR, "<decr>");
    r = consumeToken(b, "--");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '||'
  public static boolean DISJ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DISJ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJ, "<disj>");
    r = consumeToken(b, "||");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '/'
  public static boolean DIV(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIV")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIV, "<div>");
    r = consumeToken(b, "/");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '.'
  public static boolean DOT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT, "<dot>");
    r = consumeToken(b, ".");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean DelimitedComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelimitedComment")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    exit_section_(b, m, DELIMITED_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
  public static boolean Digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIGIT, "<digit>");
    r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'else'
  public static boolean ELSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE, "<else>");
    r = consumeToken(b, "else");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '=='
  public static boolean EQEQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EQEQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQEQ, "<eqeq>");
    r = consumeToken(b, "==");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '!='
  public static boolean EXCL_EQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXCL_EQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCL_EQ, "<excl eq>");
    r = consumeToken(b, "!=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '!'
  public static boolean EXCL_NO_WS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXCL_NO_WS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCL_NO_WS, "<excl no ws>");
    r = consumeToken(b, "!");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '!' Hidden
  public static boolean EXCL_WS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXCL_WS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCL_WS, "<excl ws>");
    r = consumeToken(b, "!");
    r = r && Hidden(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'finally'
  public static boolean FINALLY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FINALLY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FINALLY, "<finally>");
    r = consumeToken(b, "finally");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for'
  public static boolean FOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR, "<for>");
    r = consumeToken(b, "for");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'fun'
  public static boolean FUN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN, "<fun>");
    r = consumeToken(b, "fun");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>='
  public static boolean GE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GE, "<ge>");
    r = consumeToken(b, ">=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DelimitedComment | LineComment | WS
  public static boolean Hidden(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hidden")) return false;
    if (!nextTokenIs(b, "<hidden>", COMMENT, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HIDDEN, "<hidden>");
    r = DelimitedComment(b, l + 1);
    if (!r) r = LineComment(b, l + 1);
    if (!r) r = consumeToken(b, WS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'if'
  public static boolean IF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IF")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF, "<if>");
    r = consumeToken(b, "if");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'import'
  public static boolean IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IMPORT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT, "<import>");
    r = consumeToken(b, "import");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'in'
  public static boolean IN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN, "<in>");
    r = consumeToken(b, "in");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '++'
  public static boolean INCR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INCR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCR, "<incr>");
    r = consumeToken(b, "++");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'interface'
  public static boolean INTERFACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INTERFACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE, "<interface>");
    r = consumeToken(b, "interface");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'is'
  public static boolean IS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IS, "<is>");
    r = consumeToken(b, "is");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Letter [{'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'} | Letter]
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = Letter(b, l + 1);
    r = r && Identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [{'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'} | Letter]
  private static boolean Identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1")) return false;
    Identifier_1_0(b, l + 1);
    return true;
  }

  // {'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'} | Letter
  private static boolean Identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier_1_0_0(b, l + 1);
    if (!r) r = Letter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
  private static boolean Identifier_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    return r;
  }

  /* ********************************************************** */
  // '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
  //         [{'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'}]
  //     | '0'
  public static boolean IntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = IntegerLiteral_8(b, l + 1);
    if (!r) r = consumeToken(b, "0");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '9'
  //         [{'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'}]
  private static boolean IntegerLiteral_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "9");
    r = r && IntegerLiteral_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [{'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'}]
  private static boolean IntegerLiteral_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral_8_1")) return false;
    IntegerLiteral_8_1_0(b, l + 1);
    return true;
  }

  // '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
  private static boolean IntegerLiteral_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral_8_1_0")) return false;
    boolean r;
    r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    return r;
  }

  /* ********************************************************** */
  // '<'
  public static boolean LANGLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LANGLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LANGLE, "<langle>");
    r = consumeToken(b, "<");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{'
  public static boolean LCURL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LCURL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LCURL, "<lcurl>");
    r = consumeToken(b, "{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<='
  public static boolean LE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LE, "<le>");
    r = consumeToken(b, "<=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '('
  public static boolean LPAREN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LPAREN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LPAREN, "<lparen>");
    r = consumeToken(b, "(");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '['
  public static boolean LSQUARE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LSQUARE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LSQUARE, "<lsquare>");
    r = consumeToken(b, "[");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N"
  //          | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b"
  //          | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p"
  //          | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
  public static boolean Letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "B");
    if (!r) r = consumeToken(b, "C");
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "G");
    if (!r) r = consumeToken(b, "H");
    if (!r) r = consumeToken(b, "I");
    if (!r) r = consumeToken(b, "J");
    if (!r) r = consumeToken(b, "K");
    if (!r) r = consumeToken(b, "L");
    if (!r) r = consumeToken(b, "M");
    if (!r) r = consumeToken(b, "N");
    if (!r) r = consumeToken(b, "O");
    if (!r) r = consumeToken(b, "P");
    if (!r) r = consumeToken(b, "Q");
    if (!r) r = consumeToken(b, "R");
    if (!r) r = consumeToken(b, "S");
    if (!r) r = consumeToken(b, "T");
    if (!r) r = consumeToken(b, "U");
    if (!r) r = consumeToken(b, "V");
    if (!r) r = consumeToken(b, "W");
    if (!r) r = consumeToken(b, "X");
    if (!r) r = consumeToken(b, "Y");
    if (!r) r = consumeToken(b, "Z");
    if (!r) r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "b");
    if (!r) r = consumeToken(b, "c");
    if (!r) r = consumeToken(b, "d");
    if (!r) r = consumeToken(b, "e");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "g");
    if (!r) r = consumeToken(b, "h");
    if (!r) r = consumeToken(b, "i");
    if (!r) r = consumeToken(b, "j");
    if (!r) r = consumeToken(b, "k");
    if (!r) r = consumeToken(b, "l");
    if (!r) r = consumeToken(b, "m");
    if (!r) r = consumeToken(b, "n");
    if (!r) r = consumeToken(b, "o");
    if (!r) r = consumeToken(b, "p");
    if (!r) r = consumeToken(b, "q");
    if (!r) r = consumeToken(b, "r");
    if (!r) r = consumeToken(b, "s");
    if (!r) r = consumeToken(b, "t");
    if (!r) r = consumeToken(b, "u");
    if (!r) r = consumeToken(b, "v");
    if (!r) r = consumeToken(b, "w");
    if (!r) r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "y");
    if (!r) r = consumeToken(b, "z");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean LineComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LineComment")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    exit_section_(b, m, LINE_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // '%'
  public static boolean MOD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MOD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MOD, "<mod>");
    r = consumeToken(b, "%");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*'
  public static boolean MULT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULT, "<mult>");
    r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '\n' | '\r' '\n'?
  public static boolean NL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NL, "<nl>");
    r = consumeToken(b, "\\n");
    if (!r) r = NL_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '\r' '\n'?
  private static boolean NL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NL_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "\\r");
    r = r && NL_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '\n'?
  private static boolean NL_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NL_1_1")) return false;
    consumeToken(b, "\\n");
    return true;
  }

  /* ********************************************************** */
  // '!in' (Hidden | NL)
  public static boolean NOT_IN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT_IN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT_IN, "<not in>");
    r = consumeToken(b, "!in");
    r = r && NOT_IN_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Hidden | NL
  private static boolean NOT_IN_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT_IN_1")) return false;
    boolean r;
    r = Hidden(b, l + 1);
    if (!r) r = NL(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '!is' (Hidden | NL)
  public static boolean NOT_IS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT_IS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT_IS, "<not is>");
    r = consumeToken(b, "!is");
    r = r && NOT_IS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Hidden | NL
  private static boolean NOT_IS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT_IS_1")) return false;
    boolean r;
    r = Hidden(b, l + 1);
    if (!r) r = NL(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'null'
  public static boolean NullLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NullLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULL_LITERAL, "<null literal>");
    r = consumeToken(b, "null");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'private'
  public static boolean PRIVATE_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PRIVATE_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIVATE_, "<private>");
    r = consumeToken(b, "private");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'protected'
  public static boolean PROTECTED(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROTECTED")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTECTED, "<protected>");
    r = consumeToken(b, "protected");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'public'
  public static boolean PUBLIC(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PUBLIC")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PUBLIC, "<public>");
    r = consumeToken(b, "public");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?' Hidden
  public static boolean QUEST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUEST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUEST, "<quest>");
    r = consumeToken(b, "?");
    r = r && Hidden(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?'
  public static boolean QUEST_NO_WS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUEST_NO_WS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUEST_NO_WS, "<quest no ws>");
    r = consumeToken(b, "?");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '"'
  public static boolean QUOTE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUOTE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUOTE, "<quote>");
    r = consumeToken(b, "\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '..'
  public static boolean RANGE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RANGE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE, "<range>");
    r = consumeToken(b, "..");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>'
  public static boolean RANGLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RANGLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGLE, "<rangle>");
    r = consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}'
  public static boolean RCURL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RCURL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RCURL, "<rcurl>");
    r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'return'
  public static boolean RETURN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN, "<return>");
    r = consumeToken(b, "return");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean RPAREN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RPAREN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RPAREN, "<rparen>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ']'
  public static boolean RSQUARE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RSQUARE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RSQUARE, "<rsquare>");
    r = consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean SEMICOLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMICOLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMICOLON, "<semicolon>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '"' [{Letter | Symbol | Digit}] '"'
  public static boolean STRING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, "\"");
    r = r && STRING_1(b, l + 1);
    r = r && consumeToken(b, "\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [{Letter | Symbol | Digit}]
  private static boolean STRING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING_1")) return false;
    STRING_1_0(b, l + 1);
    return true;
  }

  // Letter | Symbol | Digit
  private static boolean STRING_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING_1_0")) return false;
    boolean r;
    r = Letter(b, l + 1);
    if (!r) r = Symbol(b, l + 1);
    if (!r) r = Digit(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '-'
  public static boolean SUB(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUB")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUB, "<sub>");
    r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'super'
  public static boolean SUPER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUPER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPER, "<super>");
    r = consumeToken(b, "super");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = STRING(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "|" | " " | "!" | "#" | "$" | "%" | "&" | "(" | ")" | "*" | "+" | "," | "-" | "."
  //           | "/" | ":" | ";" | ">" | "=" | "<" | "?" | "@" | "[" | "\\" | "]" | "^" | "_" | "`"
  //           | "{" | "}" | "~"
  public static boolean Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = consumeToken(b, "|");
    if (!r) r = consumeToken(b, " ");
    if (!r) r = consumeToken(b, "!");
    if (!r) r = consumeToken(b, "#");
    if (!r) r = consumeToken(b, "$");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "&");
    if (!r) r = consumeToken(b, "(");
    if (!r) r = consumeToken(b, ")");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, ",");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, ".");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, ":");
    if (!r) r = consumeToken(b, ";");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "?");
    if (!r) r = consumeToken(b, "@");
    if (!r) r = consumeToken(b, "[");
    if (!r) r = consumeToken(b, "\\");
    if (!r) r = consumeToken(b, "]");
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, "_");
    if (!r) r = consumeToken(b, "`");
    if (!r) r = consumeToken(b, "{");
    if (!r) r = consumeToken(b, "}");
    if (!r) r = consumeToken(b, "~");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'this'
  public static boolean THIS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THIS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THIS, "<this>");
    r = consumeToken(b, "this");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'throw'
  public static boolean THROW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THROW")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THROW, "<throw>");
    r = consumeToken(b, "throw");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'try'
  public static boolean TRY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TRY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY, "<try>");
    r = consumeToken(b, "try");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'val'
  public static boolean VAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAL, "<val>");
    r = consumeToken(b, "val");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'var'
  public static boolean VAR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VAR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR, "<var>");
    r = consumeToken(b, "var");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'when'
  public static boolean WHEN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHEN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN, "<when>");
    r = consumeToken(b, "when");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // multiplicativeExpression (additiveOperator NL* multiplicativeExpression)*
  public static boolean additiveExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    r = multiplicativeExpression(b, l + 1);
    r = r && additiveExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (additiveOperator NL* multiplicativeExpression)*
  private static boolean additiveExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additiveExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additiveExpression_1", c)) break;
    }
    return true;
  }

  // additiveOperator NL* multiplicativeExpression
  private static boolean additiveExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveOperator(b, l + 1);
    r = r && additiveExpression_1_0_1(b, l + 1);
    r = r && multiplicativeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean additiveExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additiveExpression_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ADD
  //     | SUB
  public static boolean additiveOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_OPERATOR, "<additive operator>");
    r = ADD(b, l + 1);
    if (!r) r = SUB(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // prefixUnaryExpression (NL* asOperator NL* type)*
  public static boolean asExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_EXPRESSION, "<as expression>");
    r = prefixUnaryExpression(b, l + 1);
    r = r && asExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* asOperator NL* type)*
  private static boolean asExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!asExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "asExpression_1", c)) break;
    }
    return true;
  }

  // NL* asOperator NL* type
  private static boolean asExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asExpression_1_0_0(b, l + 1);
    r = r && asOperator(b, l + 1);
    r = r && asExpression_1_0_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean asExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "asExpression_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean asExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "asExpression_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AS
  //     | AS_SAFE
  public static boolean asOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_OPERATOR, "<as operator>");
    r = AS(b, l + 1);
    if (!r) r = AS_SAFE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ASSIGNMENT expression NL*
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = identifier(b, l + 1);
    r = r && ASSIGNMENT(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && assignment_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignment_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LCURL NL* statements NL* RCURL
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = LCURL(b, l + 1);
    r = r && block_1(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && block_3(b, l + 1);
    r = r && RCURL(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // valueArguments
  public static boolean callSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_SUFFIX, "<call suffix>");
    r = valueArguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CATCH NL* LPAREN simpleIdentifier COLON type (NL* COMMA)? RPAREN NL* block
  public static boolean catchBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATCH_BLOCK, "<catch block>");
    r = CATCH(b, l + 1);
    r = r && catchBlock_1(b, l + 1);
    r = r && LPAREN(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && COLON(b, l + 1);
    r = r && type(b, l + 1);
    r = r && catchBlock_6(b, l + 1);
    r = r && RPAREN(b, l + 1);
    r = r && catchBlock_8(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean catchBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catchBlock_1", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean catchBlock_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchBlock_6")) return false;
    catchBlock_6_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean catchBlock_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchBlock_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catchBlock_6_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean catchBlock_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchBlock_6_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catchBlock_6_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean catchBlock_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchBlock_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catchBlock_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LCURL NL* classMemberDeclarations NL* RCURL
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY, "<class body>");
    r = LCURL(b, l + 1);
    r = r && classBody_1(b, l + 1);
    r = r && classMemberDeclarations(b, l + 1);
    r = r && classBody_3(b, l + 1);
    r = r && RCURL(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean classBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBody_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBody_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CLASS_ simpleIdentifier (primaryConstructor?)
  //     (COLON delegationSpecifiers)?
  //     (NL* classBody)?
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = CLASS_(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && classDeclaration_2(b, l + 1);
    r = r && classDeclaration_3(b, l + 1);
    r = r && classDeclaration_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // primaryConstructor?
  private static boolean classDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2")) return false;
    primaryConstructor(b, l + 1);
    return true;
  }

  // (COLON delegationSpecifiers)?
  private static boolean classDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3")) return false;
    classDeclaration_3_0(b, l + 1);
    return true;
  }

  // COLON delegationSpecifiers
  private static boolean classDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COLON(b, l + 1);
    r = r && delegationSpecifiers(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* classBody)?
  private static boolean classDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4")) return false;
    classDeclaration_4_0(b, l + 1);
    return true;
  }

  // NL* classBody
  private static boolean classDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration_4_0_0(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classDeclaration_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_4_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // declaration
  public static boolean classMemberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMemberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER_DECLARATION, "<class member declaration>");
    r = declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (classMemberDeclaration NL*)*
  public static boolean classMemberDeclarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMemberDeclarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER_DECLARATIONS, "<class member declarations>");
    while (true) {
      int c = current_position_(b);
      if (!classMemberDeclarations_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classMemberDeclarations", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // classMemberDeclaration NL*
  private static boolean classMemberDeclarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMemberDeclarations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classMemberDeclaration(b, l + 1);
    r = r && classMemberDeclarations_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classMemberDeclarations_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMemberDeclarations_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classMemberDeclarations_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (VAL | VAR)? simpleIdentifier COLON NL* type (NL* ASSIGNMENT NL* expression)?
  public static boolean classParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_PARAMETER, "<class parameter>");
    r = classParameter_0(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && COLON(b, l + 1);
    r = r && classParameter_3(b, l + 1);
    r = r && type(b, l + 1);
    r = r && classParameter_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (VAL | VAR)?
  private static boolean classParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_0")) return false;
    classParameter_0_0(b, l + 1);
    return true;
  }

  // VAL | VAR
  private static boolean classParameter_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_0_0")) return false;
    boolean r;
    r = VAL(b, l + 1);
    if (!r) r = VAR(b, l + 1);
    return r;
  }

  // NL*
  private static boolean classParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_3", c)) break;
    }
    return true;
  }

  // (NL* ASSIGNMENT NL* expression)?
  private static boolean classParameter_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_5")) return false;
    classParameter_5_0(b, l + 1);
    return true;
  }

  // NL* ASSIGNMENT NL* expression
  private static boolean classParameter_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameter_5_0_0(b, l + 1);
    r = r && ASSIGNMENT(b, l + 1);
    r = r && classParameter_5_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classParameter_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_5_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classParameter_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameter_5_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameter_5_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* (classParameter (NL* COMMA NL* classParameter)* (NL* COMMA)?)? NL* RPAREN
  public static boolean classParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_PARAMETERS, "<class parameters>");
    r = LPAREN(b, l + 1);
    r = r && classParameters_1(b, l + 1);
    r = r && classParameters_2(b, l + 1);
    r = r && classParameters_3(b, l + 1);
    r = r && RPAREN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean classParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_1", c)) break;
    }
    return true;
  }

  // (classParameter (NL* COMMA NL* classParameter)* (NL* COMMA)?)?
  private static boolean classParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2")) return false;
    classParameters_2_0(b, l + 1);
    return true;
  }

  // classParameter (NL* COMMA NL* classParameter)* (NL* COMMA)?
  private static boolean classParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameter(b, l + 1);
    r = r && classParameters_2_0_1(b, l + 1);
    r = r && classParameters_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* classParameter)*
  private static boolean classParameters_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classParameters_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* classParameter
  private static boolean classParameters_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameters_2_0_1_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    r = r && classParameters_2_0_1_0_2(b, l + 1);
    r = r && classParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classParameters_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classParameters_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean classParameters_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_2")) return false;
    classParameters_2_0_2_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean classParameters_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classParameters_2_0_2_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean classParameters_2_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_2_0_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_2_0_2_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean classParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classParameters_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classParameters_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LSQUARE NL* (expression (NL* COMMA NL* expression)* (NL* COMMA)? NL*)? RSQUARE
  public static boolean collectionLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLLECTION_LITERAL, "<collection literal>");
    r = LSQUARE(b, l + 1);
    r = r && collectionLiteral_1(b, l + 1);
    r = r && collectionLiteral_2(b, l + 1);
    r = r && RSQUARE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean collectionLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_1", c)) break;
    }
    return true;
  }

  // (expression (NL* COMMA NL* expression)* (NL* COMMA)? NL*)?
  private static boolean collectionLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2")) return false;
    collectionLiteral_2_0(b, l + 1);
    return true;
  }

  // expression (NL* COMMA NL* expression)* (NL* COMMA)? NL*
  private static boolean collectionLiteral_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && collectionLiteral_2_0_1(b, l + 1);
    r = r && collectionLiteral_2_0_2(b, l + 1);
    r = r && collectionLiteral_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* expression)*
  private static boolean collectionLiteral_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!collectionLiteral_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* expression
  private static boolean collectionLiteral_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = collectionLiteral_2_0_1_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    r = r && collectionLiteral_2_0_1_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean collectionLiteral_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean collectionLiteral_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean collectionLiteral_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_2")) return false;
    collectionLiteral_2_0_2_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean collectionLiteral_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = collectionLiteral_2_0_2_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean collectionLiteral_2_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_2_0_2_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean collectionLiteral_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collectionLiteral_2_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "collectionLiteral_2_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // genericCallLikeComparison (comparisonOperator NL* genericCallLikeComparison)*
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = genericCallLikeComparison(b, l + 1);
    r = r && comparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comparisonOperator NL* genericCallLikeComparison)*
  private static boolean comparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparison_1", c)) break;
    }
    return true;
  }

  // comparisonOperator NL* genericCallLikeComparison
  private static boolean comparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparisonOperator(b, l + 1);
    r = r && comparison_1_0_1(b, l + 1);
    r = r && genericCallLikeComparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean comparison_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparison_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LANGLE
  //     | RANGLE
  //     | LE
  //     | GE
  public static boolean comparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = LANGLE(b, l + 1);
    if (!r) r = RANGLE(b, l + 1);
    if (!r) r = LE(b, l + 1);
    if (!r) r = GE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // equality (NL* CONJ NL* equality)*
  public static boolean conjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCTION, "<conjunction>");
    r = equality(b, l + 1);
    r = r && conjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* CONJ NL* equality)*
  private static boolean conjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conjunction_1", c)) break;
    }
    return true;
  }

  // NL* CONJ NL* equality
  private static boolean conjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conjunction_1_0_0(b, l + 1);
    r = r && CONJ(b, l + 1);
    r = r && conjunction_1_0_2(b, l + 1);
    r = r && equality(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean conjunction_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conjunction_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean conjunction_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conjunction_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // functionParameters
  public static boolean constructorInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorInvocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_INVOCATION, "<constructor invocation>");
    r = functionParameters(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block
  //     | statement
  public static boolean controlStructureBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "controlStructureBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE_BODY, "<control structure body>");
    r = block(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // classDeclaration | functionDeclaration | propertyDeclaration
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = classDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = propertyDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simpleIdentifier constructorInvocation
  public static boolean delegationSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATION_SPECIFIER, "<delegation specifier>");
    r = simpleIdentifier(b, l + 1);
    r = r && constructorInvocation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // delegationSpecifier (NL* COMMA NL* delegationSpecifier)*
  public static boolean delegationSpecifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATION_SPECIFIERS, "<delegation specifiers>");
    r = delegationSpecifier(b, l + 1);
    r = r && delegationSpecifiers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* COMMA NL* delegationSpecifier)*
  private static boolean delegationSpecifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!delegationSpecifiers_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* delegationSpecifier
  private static boolean delegationSpecifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delegationSpecifiers_1_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    r = r && delegationSpecifiers_1_0_2(b, l + 1);
    r = r && delegationSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean delegationSpecifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean delegationSpecifiers_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegationSpecifiers_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegationSpecifiers_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // conjunction (NL* DISJ NL* conjunction)*
  public static boolean disjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION, "<disjunction>");
    r = conjunction(b, l + 1);
    r = r && disjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* DISJ NL* conjunction)*
  private static boolean disjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!disjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "disjunction_1", c)) break;
    }
    return true;
  }

  // NL* DISJ NL* conjunction
  private static boolean disjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = disjunction_1_0_0(b, l + 1);
    r = r && DISJ(b, l + 1);
    r = r && disjunction_1_0_2(b, l + 1);
    r = r && conjunction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean disjunction_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "disjunction_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean disjunction_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "disjunction_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // QUEST_NO_WS COLON
  public static boolean elvis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELVIS, "<elvis>");
    r = QUEST_NO_WS(b, l + 1);
    r = r && COLON(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // infixFunctionCall (NL* elvis NL* infixFunctionCall)*
  public static boolean elvisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELVIS_EXPRESSION, "<elvis expression>");
    r = infixFunctionCall(b, l + 1);
    r = r && elvisExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* elvis NL* infixFunctionCall)*
  private static boolean elvisExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elvisExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elvisExpression_1", c)) break;
    }
    return true;
  }

  // NL* elvis NL* infixFunctionCall
  private static boolean elvisExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elvisExpression_1_0_0(b, l + 1);
    r = r && elvis(b, l + 1);
    r = r && elvisExpression_1_0_2(b, l + 1);
    r = r && infixFunctionCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean elvisExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elvisExpression_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean elvisExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elvisExpression_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elvisExpression_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // comparison (equalityOperator NL* comparison)*
  public static boolean equality(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY, "<equality>");
    r = comparison(b, l + 1);
    r = r && equality_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (equalityOperator NL* comparison)*
  private static boolean equality_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equality_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equality_1", c)) break;
    }
    return true;
  }

  // equalityOperator NL* comparison
  private static boolean equality_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equalityOperator(b, l + 1);
    r = r && equality_1_0_1(b, l + 1);
    r = r && comparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean equality_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equality_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // EXCL_EQ
  //     | EQEQ
  public static boolean equalityOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_OPERATOR, "<equality operator>");
    r = EXCL_EQ(b, l + 1);
    if (!r) r = EQEQ(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXCL_NO_WS
  //     | EXCL_WS
  public static boolean excl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "excl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCL, "<excl>");
    r = EXCL_NO_WS(b, l + 1);
    if (!r) r = EXCL_WS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // disjunction
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = disjunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FINALLY NL* block
  public static boolean finallyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FINALLY_BLOCK, "<finally block>");
    r = FINALLY(b, l + 1);
    r = r && finallyBlock_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean finallyBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "finallyBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // block | ASSIGNMENT NL* expression
  public static boolean functionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    r = block(b, l + 1);
    if (!r) r = functionBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ASSIGNMENT NL* expression
  private static boolean functionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGNMENT(b, l + 1);
    r = r && functionBody_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionBody_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FUN simpleIdentifier functionParameters (COLON NL* type)? functionBody
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = FUN(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && functionParameters(b, l + 1);
    r = r && functionDeclaration_3(b, l + 1);
    r = r && functionBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COLON NL* type)?
  private static boolean functionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3")) return false;
    functionDeclaration_3_0(b, l + 1);
    return true;
  }

  // COLON NL* type
  private static boolean functionDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COLON(b, l + 1);
    r = r && functionDeclaration_3_0_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionDeclaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_3_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier COLON identifier
  public static boolean functionParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER, "<function parameter>");
    r = identifier(b, l + 1);
    r = r && COLON(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN (functionParameter (NL* COMMA NL* functionParameter)* (NL* COMMA)?)? NL* RPAREN
  public static boolean functionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETERS, "<function parameters>");
    r = LPAREN(b, l + 1);
    r = r && functionParameters_1(b, l + 1);
    r = r && functionParameters_2(b, l + 1);
    r = r && RPAREN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (functionParameter (NL* COMMA NL* functionParameter)* (NL* COMMA)?)?
  private static boolean functionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1")) return false;
    functionParameters_1_0(b, l + 1);
    return true;
  }

  // functionParameter (NL* COMMA NL* functionParameter)* (NL* COMMA)?
  private static boolean functionParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionParameter(b, l + 1);
    r = r && functionParameters_1_0_1(b, l + 1);
    r = r && functionParameters_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* functionParameter)*
  private static boolean functionParameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionParameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionParameters_1_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* functionParameter
  private static boolean functionParameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionParameters_1_0_1_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    r = r && functionParameters_1_0_1_0_2(b, l + 1);
    r = r && functionParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionParameters_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionParameters_1_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionParameters_1_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionParameters_1_0_1_0_2", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean functionParameters_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_2")) return false;
    functionParameters_1_0_2_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean functionParameters_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionParameters_1_0_2_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean functionParameters_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionParameters_1_0_2_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean functionParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionParameters_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // infixOperation
  public static boolean genericCallLikeComparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericCallLikeComparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_CALL_LIKE_COMPARISON, "<generic call like comparison>");
    r = infixOperation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simpleIdentifier (NL* DOT simpleIdentifier)*
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = simpleIdentifier(b, l + 1);
    r = r && identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* DOT simpleIdentifier)*
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_1", c)) break;
    }
    return true;
  }

  // NL* DOT simpleIdentifier
  private static boolean identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_1_0_0(b, l + 1);
    r = r && DOT(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean identifier_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_1_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IF NL* LPAREN NL* expression NL* RPAREN NL*
  //       ( controlStructureBody? NL* SEMICOLON? NL* ELSE NL* (SEMICOLON | controlStructureBody)
  //       | SEMICOLON
  //       | controlStructureBody
  //       )
  public static boolean ifExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPRESSION, "<if expression>");
    r = IF(b, l + 1);
    r = r && ifExpression_1(b, l + 1);
    r = r && LPAREN(b, l + 1);
    r = r && ifExpression_3(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && ifExpression_5(b, l + 1);
    r = r && RPAREN(b, l + 1);
    r = r && ifExpression_7(b, l + 1);
    r = r && ifExpression_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean ifExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_5", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_7", c)) break;
    }
    return true;
  }

  // controlStructureBody? NL* SEMICOLON? NL* ELSE NL* (SEMICOLON | controlStructureBody)
  //       | SEMICOLON
  //       | controlStructureBody
  private static boolean ifExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifExpression_8_0(b, l + 1);
    if (!r) r = SEMICOLON(b, l + 1);
    if (!r) r = controlStructureBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // controlStructureBody? NL* SEMICOLON? NL* ELSE NL* (SEMICOLON | controlStructureBody)
  private static boolean ifExpression_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifExpression_8_0_0(b, l + 1);
    r = r && ifExpression_8_0_1(b, l + 1);
    r = r && ifExpression_8_0_2(b, l + 1);
    r = r && ifExpression_8_0_3(b, l + 1);
    r = r && ELSE(b, l + 1);
    r = r && ifExpression_8_0_5(b, l + 1);
    r = r && ifExpression_8_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // controlStructureBody?
  private static boolean ifExpression_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0_0")) return false;
    controlStructureBody(b, l + 1);
    return true;
  }

  // NL*
  private static boolean ifExpression_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_8_0_1", c)) break;
    }
    return true;
  }

  // SEMICOLON?
  private static boolean ifExpression_8_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0_2")) return false;
    SEMICOLON(b, l + 1);
    return true;
  }

  // NL*
  private static boolean ifExpression_8_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_8_0_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean ifExpression_8_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpression_8_0_5", c)) break;
    }
    return true;
  }

  // SEMICOLON | controlStructureBody
  private static boolean ifExpression_8_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_8_0_6")) return false;
    boolean r;
    r = SEMICOLON(b, l + 1);
    if (!r) r = controlStructureBody(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // AS simpleIdentifier
  public static boolean importAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importAlias")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_ALIAS, "<import alias>");
    r = AS(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IMPORT identifier (DOT MULT | importAlias)? semi?
  public static boolean importHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_HEADER, "<import header>");
    r = IMPORT(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && importHeader_2(b, l + 1);
    r = r && importHeader_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT MULT | importAlias)?
  private static boolean importHeader_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_2")) return false;
    importHeader_2_0(b, l + 1);
    return true;
  }

  // DOT MULT | importAlias
  private static boolean importHeader_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importHeader_2_0_0(b, l + 1);
    if (!r) r = importAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT MULT
  private static boolean importHeader_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DOT(b, l + 1);
    r = r && MULT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // semi?
  private static boolean importHeader_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importHeader_3")) return false;
    semi(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // importHeader*
  public static boolean importList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importList")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_LIST, "<import list>");
    while (true) {
      int c = current_position_(b);
      if (!importHeader(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IN
  //     | NOT_IN
  public static boolean inOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_OPERATOR, "<in operator>");
    r = IN(b, l + 1);
    if (!r) r = NOT_IN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // rangeExpression (simpleIdentifier NL* rangeExpression)*
  public static boolean infixFunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_FUNCTION_CALL, "<infix function call>");
    r = rangeExpression(b, l + 1);
    r = r && infixFunctionCall_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (simpleIdentifier NL* rangeExpression)*
  private static boolean infixFunctionCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!infixFunctionCall_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixFunctionCall_1", c)) break;
    }
    return true;
  }

  // simpleIdentifier NL* rangeExpression
  private static boolean infixFunctionCall_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleIdentifier(b, l + 1);
    r = r && infixFunctionCall_1_0_1(b, l + 1);
    r = r && rangeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean infixFunctionCall_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixFunctionCall_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixFunctionCall_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // elvisExpression (inOperator NL* elvisExpression | isOperator NL* type)*
  public static boolean infixOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_OPERATION, "<infix operation>");
    r = elvisExpression(b, l + 1);
    r = r && infixOperation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (inOperator NL* elvisExpression | isOperator NL* type)*
  private static boolean infixOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!infixOperation_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixOperation_1", c)) break;
    }
    return true;
  }

  // inOperator NL* elvisExpression | isOperator NL* type
  private static boolean infixOperation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixOperation_1_0_0(b, l + 1);
    if (!r) r = infixOperation_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inOperator NL* elvisExpression
  private static boolean infixOperation_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inOperator(b, l + 1);
    r = r && infixOperation_1_0_0_1(b, l + 1);
    r = r && elvisExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean infixOperation_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation_1_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixOperation_1_0_0_1", c)) break;
    }
    return true;
  }

  // isOperator NL* type
  private static boolean infixOperation_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isOperator(b, l + 1);
    r = r && infixOperation_1_0_1_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean infixOperation_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperation_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixOperation_1_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IS
  //     | NOT_IS
  public static boolean isOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IS_OPERATOR, "<is operator>");
    r = IS(b, l + 1);
    if (!r) r = NOT_IS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // THROW NL* expression
  //     | RETURN expression?
  //     | CONTINUE
  //     | BREAK
  public static boolean jumpExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JUMP_EXPRESSION, "<jump expression>");
    r = jumpExpression_0(b, l + 1);
    if (!r) r = jumpExpression_1(b, l + 1);
    if (!r) r = CONTINUE(b, l + 1);
    if (!r) r = BREAK(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // THROW NL* expression
  private static boolean jumpExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = THROW(b, l + 1);
    r = r && jumpExpression_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean jumpExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "jumpExpression_0_1", c)) break;
    }
    return true;
  }

  // RETURN expression?
  private static boolean jumpExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RETURN(b, l + 1);
    r = r && jumpExpression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean jumpExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jumpExpression_1_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BooleanLiteral
  //     | IntegerLiteral
  //     | NullLiteral
  public static boolean literalConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_CONSTANT, "<literal constant>");
    r = BooleanLiteral(b, l + 1);
    if (!r) r = IntegerLiteral(b, l + 1);
    if (!r) r = NullLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NL* DOT
  //     | COLONCOLON
  public static boolean memberAccessOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccessOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_ACCESS_OPERATOR, "<member access operator>");
    r = memberAccessOperator_0(b, l + 1);
    if (!r) r = COLONCOLON(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL* DOT
  private static boolean memberAccessOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccessOperator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memberAccessOperator_0_0(b, l + 1);
    r = r && DOT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean memberAccessOperator_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccessOperator_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "memberAccessOperator_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // asExpression (multiplicativeOperator NL* asExpression)*
  public static boolean multiplicativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    r = asExpression(b, l + 1);
    r = r && multiplicativeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (multiplicativeOperator NL* asExpression)*
  private static boolean multiplicativeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicativeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicativeExpression_1", c)) break;
    }
    return true;
  }

  // multiplicativeOperator NL* asExpression
  private static boolean multiplicativeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeOperator(b, l + 1);
    r = r && multiplicativeExpression_1_0_1(b, l + 1);
    r = r && asExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean multiplicativeExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicativeExpression_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MULT
  //     | DIV
  //     | MOD
  public static boolean multiplicativeOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_OPERATOR, "<multiplicative operator>");
    r = MULT(b, l + 1);
    if (!r) r = DIV(b, l + 1);
    if (!r) r = MOD(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // memberAccessOperator NL* (CLASS_ | parenthesizedExpression | simpleIdentifier)
  public static boolean navigationSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "navigationSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAVIGATION_SUFFIX, "<navigation suffix>");
    r = memberAccessOperator(b, l + 1);
    r = r && navigationSuffix_1(b, l + 1);
    r = r && navigationSuffix_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean navigationSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "navigationSuffix_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "navigationSuffix_1", c)) break;
    }
    return true;
  }

  // CLASS_ | parenthesizedExpression | simpleIdentifier
  private static boolean navigationSuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "navigationSuffix_2")) return false;
    boolean r;
    r = CLASS_(b, l + 1);
    if (!r) r = parenthesizedExpression(b, l + 1);
    if (!r) r = simpleIdentifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAREN NL* expression NL* RPAREN
  public static boolean parenthesizedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARENTHESIZED_EXPRESSION, "<parenthesized expression>");
    r = LPAREN(b, l + 1);
    r = r && parenthesizedExpression_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && parenthesizedExpression_3(b, l + 1);
    r = r && RPAREN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean parenthesizedExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parenthesizedExpression_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean parenthesizedExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parenthesizedExpression_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // primaryExpression postfixUnarySuffix*
  public static boolean postfixUnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_EXPRESSION, "<postfix unary expression>");
    r = primaryExpression(b, l + 1);
    r = r && postfixUnaryExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // postfixUnarySuffix*
  private static boolean postfixUnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postfixUnarySuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postfixUnaryExpression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // INCR
  //     | DECR
  //     | EXCL_NO_WS
  public static boolean postfixUnaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_OPERATOR, "<postfix unary operator>");
    r = INCR(b, l + 1);
    if (!r) r = DECR(b, l + 1);
    if (!r) r = EXCL_NO_WS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // postfixUnaryOperator
  //     | callSuffix
  //     | navigationSuffix
  public static boolean postfixUnarySuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnarySuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_SUFFIX, "<postfix unary suffix>");
    r = postfixUnaryOperator(b, l + 1);
    if (!r) r = callSuffix(b, l + 1);
    if (!r) r = navigationSuffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unaryPrefix* postfixUnaryExpression
  public static boolean prefixUnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_UNARY_EXPRESSION, "<prefix unary expression>");
    r = prefixUnaryExpression_0(b, l + 1);
    r = r && postfixUnaryExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unaryPrefix*
  private static boolean prefixUnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryExpression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unaryPrefix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prefixUnaryExpression_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SUB
  //     | ADD
  //     | excl
  public static boolean prefixUnaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_UNARY_OPERATOR, "<prefix unary operator>");
    r = SUB(b, l + 1);
    if (!r) r = ADD(b, l + 1);
    if (!r) r = excl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONSTRUCTOR? classParameters
  public static boolean primaryConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_CONSTRUCTOR, "<primary constructor>");
    r = primaryConstructor_0(b, l + 1);
    r = r && classParameters(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CONSTRUCTOR?
  private static boolean primaryConstructor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryConstructor_0")) return false;
    CONSTRUCTOR(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // parenthesizedExpression
  //     | literalConstant
  //     | stringLiteral
  //     | collectionLiteral
  //     | thisExpression
  //     | superExpression
  //     | ifExpression
  //     | whenExpression
  //     | tryExpression
  //     | jumpExpression
  //     | simpleIdentifier
  public static boolean primaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = parenthesizedExpression(b, l + 1);
    if (!r) r = literalConstant(b, l + 1);
    if (!r) r = stringLiteral(b, l + 1);
    if (!r) r = collectionLiteral(b, l + 1);
    if (!r) r = thisExpression(b, l + 1);
    if (!r) r = superExpression(b, l + 1);
    if (!r) r = ifExpression(b, l + 1);
    if (!r) r = whenExpression(b, l + 1);
    if (!r) r = tryExpression(b, l + 1);
    if (!r) r = jumpExpression(b, l + 1);
    if (!r) r = simpleIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NL* importList statements NL* EOF
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_0(b, l + 1);
    r = r && importList(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && program_3(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean program_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (VAL | VAR) simpleIdentifier (COLON NL* type)? (NL* (ASSIGNMENT NL* expression))?
  public static boolean propertyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION, "<property declaration>");
    r = propertyDeclaration_0(b, l + 1);
    r = r && simpleIdentifier(b, l + 1);
    r = r && propertyDeclaration_2(b, l + 1);
    r = r && propertyDeclaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VAL | VAR
  private static boolean propertyDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_0")) return false;
    boolean r;
    r = VAL(b, l + 1);
    if (!r) r = VAR(b, l + 1);
    return r;
  }

  // (COLON NL* type)?
  private static boolean propertyDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_2")) return false;
    propertyDeclaration_2_0(b, l + 1);
    return true;
  }

  // COLON NL* type
  private static boolean propertyDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COLON(b, l + 1);
    r = r && propertyDeclaration_2_0_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean propertyDeclaration_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "propertyDeclaration_2_0_1", c)) break;
    }
    return true;
  }

  // (NL* (ASSIGNMENT NL* expression))?
  private static boolean propertyDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_3")) return false;
    propertyDeclaration_3_0(b, l + 1);
    return true;
  }

  // NL* (ASSIGNMENT NL* expression)
  private static boolean propertyDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = propertyDeclaration_3_0_0(b, l + 1);
    r = r && propertyDeclaration_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean propertyDeclaration_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "propertyDeclaration_3_0_0", c)) break;
    }
    return true;
  }

  // ASSIGNMENT NL* expression
  private static boolean propertyDeclaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGNMENT(b, l + 1);
    r = r && propertyDeclaration_3_0_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean propertyDeclaration_3_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_3_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "propertyDeclaration_3_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // additiveExpression (RANGE NL* additiveExpression)*
  public static boolean rangeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_EXPRESSION, "<range expression>");
    r = additiveExpression(b, l + 1);
    r = r && rangeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (RANGE NL* additiveExpression)*
  private static boolean rangeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rangeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rangeExpression_1", c)) break;
    }
    return true;
  }

  // RANGE NL* additiveExpression
  private static boolean rangeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RANGE(b, l + 1);
    r = r && rangeExpression_1_0_1(b, l + 1);
    r = r && additiveExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean rangeExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rangeExpression_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // inOperator NL* expression
  public static boolean rangeTest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeTest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_TEST, "<range test>");
    r = inOperator(b, l + 1);
    r = r && rangeTest_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean rangeTest_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeTest_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rangeTest_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (SEMICOLON | NL) NL*
  public static boolean semi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMI, "<semi>");
    r = semi_0(b, l + 1);
    r = r && semi_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON | NL
  private static boolean semi_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_0")) return false;
    boolean r;
    r = SEMICOLON(b, l + 1);
    if (!r) r = NL(b, l + 1);
    return r;
  }

  // NL*
  private static boolean semi_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "semi_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (SEMICOLON | NL)+
  public static boolean semis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMIS, "<semis>");
    r = semis_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!semis_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "semis", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON | NL
  private static boolean semis_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semis_0")) return false;
    boolean r;
    r = SEMICOLON(b, l + 1);
    if (!r) r = NL(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean simpleIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_IDENTIFIER, "<simple identifier>");
    r = Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // declaration | assignment | expression
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = declaration(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (statement (semis statement)*)? semis?
  public static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENTS, "<statements>");
    r = statements_0(b, l + 1);
    r = r && statements_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (statement (semis statement)*)?
  private static boolean statements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_0")) return false;
    statements_0_0(b, l + 1);
    return true;
  }

  // statement (semis statement)*
  private static boolean statements_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && statements_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (semis statement)*
  private static boolean statements_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_0_0_1", c)) break;
    }
    return true;
  }

  // semis statement
  private static boolean statements_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semis(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // semis?
  private static boolean statements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1")) return false;
    semis(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // StringLiteral
  public static boolean stringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = StringLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SUPER (LANGLE NL* type NL* RANGLE)?
  public static boolean superExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPER_EXPRESSION, "<super expression>");
    r = SUPER(b, l + 1);
    r = r && superExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LANGLE NL* type NL* RANGLE)?
  private static boolean superExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1")) return false;
    superExpression_1_0(b, l + 1);
    return true;
  }

  // LANGLE NL* type NL* RANGLE
  private static boolean superExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LANGLE(b, l + 1);
    r = r && superExpression_1_0_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && superExpression_1_0_3(b, l + 1);
    r = r && RANGLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean superExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "superExpression_1_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean superExpression_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression_1_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "superExpression_1_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // THIS
  public static boolean thisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "thisExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THIS_EXPRESSION, "<this expression>");
    r = THIS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRY NL* block ((NL* catchBlock)+ (NL* finallyBlock)? | NL* finallyBlock)
  public static boolean tryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_EXPRESSION, "<try expression>");
    r = TRY(b, l + 1);
    r = r && tryExpression_1(b, l + 1);
    r = r && block(b, l + 1);
    r = r && tryExpression_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean tryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_1", c)) break;
    }
    return true;
  }

  // (NL* catchBlock)+ (NL* finallyBlock)? | NL* finallyBlock
  private static boolean tryExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_0(b, l + 1);
    if (!r) r = tryExpression_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* catchBlock)+ (NL* finallyBlock)?
  private static boolean tryExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_0_0(b, l + 1);
    r = r && tryExpression_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* catchBlock)+
  private static boolean tryExpression_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!tryExpression_3_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_3_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NL* catchBlock
  private static boolean tryExpression_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_0_0_0_0(b, l + 1);
    r = r && catchBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean tryExpression_3_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_0_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_3_0_0_0_0", c)) break;
    }
    return true;
  }

  // (NL* finallyBlock)?
  private static boolean tryExpression_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_1")) return false;
    tryExpression_3_0_1_0(b, l + 1);
    return true;
  }

  // NL* finallyBlock
  private static boolean tryExpression_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_0_1_0_0(b, l + 1);
    r = r && finallyBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean tryExpression_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_3_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL* finallyBlock
  private static boolean tryExpression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryExpression_3_1_0(b, l + 1);
    r = r && finallyBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean tryExpression_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryExpression_3_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryExpression_3_1_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simpleIdentifier QUEST?
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = simpleIdentifier(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QUEST?
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    QUEST(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // isOperator NL* type
  public static boolean typeTest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeTest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_TEST, "<type test>");
    r = isOperator(b, l + 1);
    r = r && typeTest_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean typeTest_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeTest_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeTest_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // prefixUnaryOperator NL*
  public static boolean unaryPrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_PREFIX, "<unary prefix>");
    r = prefixUnaryOperator(b, l + 1);
    r = r && unaryPrefix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean unaryPrefix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefix_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unaryPrefix_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (simpleIdentifier NL* ASSIGNMENT NL*)? MULT? NL* expression
  public static boolean valueArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ARGUMENT, "<value argument>");
    r = valueArgument_0(b, l + 1);
    r = r && valueArgument_1(b, l + 1);
    r = r && valueArgument_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (simpleIdentifier NL* ASSIGNMENT NL*)?
  private static boolean valueArgument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0")) return false;
    valueArgument_0_0(b, l + 1);
    return true;
  }

  // simpleIdentifier NL* ASSIGNMENT NL*
  private static boolean valueArgument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleIdentifier(b, l + 1);
    r = r && valueArgument_0_0_1(b, l + 1);
    r = r && ASSIGNMENT(b, l + 1);
    r = r && valueArgument_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean valueArgument_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArgument_0_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean valueArgument_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_0_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArgument_0_0_3", c)) break;
    }
    return true;
  }

  // MULT?
  private static boolean valueArgument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_1")) return false;
    MULT(b, l + 1);
    return true;
  }

  // NL*
  private static boolean valueArgument_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArgument_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArgument_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NL* (valueArgument (NL* COMMA NL* valueArgument)* (NL* COMMA)? NL*)? RPAREN
  public static boolean valueArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ARGUMENTS, "<value arguments>");
    r = LPAREN(b, l + 1);
    r = r && valueArguments_1(b, l + 1);
    r = r && valueArguments_2(b, l + 1);
    r = r && RPAREN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean valueArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_1", c)) break;
    }
    return true;
  }

  // (valueArgument (NL* COMMA NL* valueArgument)* (NL* COMMA)? NL*)?
  private static boolean valueArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2")) return false;
    valueArguments_2_0(b, l + 1);
    return true;
  }

  // valueArgument (NL* COMMA NL* valueArgument)* (NL* COMMA)? NL*
  private static boolean valueArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueArgument(b, l + 1);
    r = r && valueArguments_2_0_1(b, l + 1);
    r = r && valueArguments_2_0_2(b, l + 1);
    r = r && valueArguments_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* valueArgument)*
  private static boolean valueArguments_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueArguments_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* valueArgument
  private static boolean valueArguments_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueArguments_2_0_1_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    r = r && valueArguments_2_0_1_0_2(b, l + 1);
    r = r && valueArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean valueArguments_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean valueArguments_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_1_0_2", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean valueArguments_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_2")) return false;
    valueArguments_2_0_2_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean valueArguments_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueArguments_2_0_2_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean valueArguments_2_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_2_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean valueArguments_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueArguments_2_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueArguments_2_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simpleIdentifier (NL* COLON NL* type)?
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = simpleIdentifier(b, l + 1);
    r = r && variableDeclaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* COLON NL* type)?
  private static boolean variableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1")) return false;
    variableDeclaration_1_0(b, l + 1);
    return true;
  }

  // NL* COLON NL* type
  private static boolean variableDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclaration_1_0_0(b, l + 1);
    r = r && COLON(b, l + 1);
    r = r && variableDeclaration_1_0_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean variableDeclaration_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclaration_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean variableDeclaration_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclaration_1_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // rangeTest
  //     | typeTest
  //     | expression
  public static boolean whenCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_CONDITION, "<when condition>");
    r = rangeTest(b, l + 1);
    if (!r) r = typeTest(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // whenCondition (NL* COMMA NL* whenCondition)* (NL* COMMA)? NL* ARROW NL* controlStructureBody semi?
  //     | ELSE NL* ARROW NL* controlStructureBody semi?
  public static boolean whenEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_ENTRY, "<when entry>");
    r = whenEntry_0(b, l + 1);
    if (!r) r = whenEntry_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // whenCondition (NL* COMMA NL* whenCondition)* (NL* COMMA)? NL* ARROW NL* controlStructureBody semi?
  private static boolean whenEntry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenCondition(b, l + 1);
    r = r && whenEntry_0_1(b, l + 1);
    r = r && whenEntry_0_2(b, l + 1);
    r = r && whenEntry_0_3(b, l + 1);
    r = r && ARROW(b, l + 1);
    r = r && whenEntry_0_5(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    r = r && whenEntry_0_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NL* COMMA NL* whenCondition)*
  private static boolean whenEntry_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenEntry_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_0_1", c)) break;
    }
    return true;
  }

  // NL* COMMA NL* whenCondition
  private static boolean whenEntry_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenEntry_0_1_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    r = r && whenEntry_0_1_0_2(b, l + 1);
    r = r && whenCondition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean whenEntry_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_0_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenEntry_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_0_1_0_2", c)) break;
    }
    return true;
  }

  // (NL* COMMA)?
  private static boolean whenEntry_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_2")) return false;
    whenEntry_0_2_0(b, l + 1);
    return true;
  }

  // NL* COMMA
  private static boolean whenEntry_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenEntry_0_2_0_0(b, l + 1);
    r = r && COMMA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean whenEntry_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_0_2_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenEntry_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_0_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenEntry_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_0_5", c)) break;
    }
    return true;
  }

  // semi?
  private static boolean whenEntry_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_0_7")) return false;
    semi(b, l + 1);
    return true;
  }

  // ELSE NL* ARROW NL* controlStructureBody semi?
  private static boolean whenEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELSE(b, l + 1);
    r = r && whenEntry_1_1(b, l + 1);
    r = r && ARROW(b, l + 1);
    r = r && whenEntry_1_3(b, l + 1);
    r = r && controlStructureBody(b, l + 1);
    r = r && whenEntry_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean whenEntry_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_1_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenEntry_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenEntry_1_3", c)) break;
    }
    return true;
  }

  // semi?
  private static boolean whenEntry_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenEntry_1_5")) return false;
    semi(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WHEN NL* whenSubject? NL* LCURL NL* (whenEntry NL*)* NL* RCURL
  public static boolean whenExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_EXPRESSION, "<when expression>");
    r = WHEN(b, l + 1);
    r = r && whenExpression_1(b, l + 1);
    r = r && whenExpression_2(b, l + 1);
    r = r && whenExpression_3(b, l + 1);
    r = r && LCURL(b, l + 1);
    r = r && whenExpression_5(b, l + 1);
    r = r && whenExpression_6(b, l + 1);
    r = r && whenExpression_7(b, l + 1);
    r = r && RCURL(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NL*
  private static boolean whenExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenExpression_1", c)) break;
    }
    return true;
  }

  // whenSubject?
  private static boolean whenExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_2")) return false;
    whenSubject(b, l + 1);
    return true;
  }

  // NL*
  private static boolean whenExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenExpression_3", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenExpression_5", c)) break;
    }
    return true;
  }

  // (whenEntry NL*)*
  private static boolean whenExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenExpression_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenExpression_6", c)) break;
    }
    return true;
  }

  // whenEntry NL*
  private static boolean whenExpression_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenEntry(b, l + 1);
    r = r && whenExpression_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean whenExpression_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenExpression_6_0_1", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenExpression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenExpression_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN (NL* VAL NL* variableDeclaration NL* ASSIGNMENT NL*)? expression RPAREN
  public static boolean whenSubject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_SUBJECT, "<when subject>");
    r = LPAREN(b, l + 1);
    r = r && whenSubject_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && RPAREN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NL* VAL NL* variableDeclaration NL* ASSIGNMENT NL*)?
  private static boolean whenSubject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject_1")) return false;
    whenSubject_1_0(b, l + 1);
    return true;
  }

  // NL* VAL NL* variableDeclaration NL* ASSIGNMENT NL*
  private static boolean whenSubject_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenSubject_1_0_0(b, l + 1);
    r = r && VAL(b, l + 1);
    r = r && whenSubject_1_0_2(b, l + 1);
    r = r && variableDeclaration(b, l + 1);
    r = r && whenSubject_1_0_4(b, l + 1);
    r = r && ASSIGNMENT(b, l + 1);
    r = r && whenSubject_1_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NL*
  private static boolean whenSubject_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenSubject_1_0_0", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenSubject_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenSubject_1_0_2", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenSubject_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject_1_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenSubject_1_0_4", c)) break;
    }
    return true;
  }

  // NL*
  private static boolean whenSubject_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenSubject_1_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenSubject_1_0_6", c)) break;
    }
    return true;
  }

}
