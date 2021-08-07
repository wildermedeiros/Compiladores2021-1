/* Generated By:JJTree&JavaCC: Do not edit this line. FreshMeatConstants.java */
package parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface FreshMeatConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int STARTSCRIPT = 5;
  /** RegularExpression Id. */
  int INTEGERTYPE = 6;
  /** RegularExpression Id. */
  int STRINGTYPE = 7;
  /** RegularExpression Id. */
  int BOOLTYPE = 8;
  /** RegularExpression Id. */
  int USING = 9;
  /** RegularExpression Id. */
  int IF = 10;
  /** RegularExpression Id. */
  int THEN = 11;
  /** RegularExpression Id. */
  int ELSE = 12;
  /** RegularExpression Id. */
  int FOR = 13;
  /** RegularExpression Id. */
  int TO = 14;
  /** RegularExpression Id. */
  int WHILE = 15;
  /** RegularExpression Id. */
  int SUM = 16;
  /** RegularExpression Id. */
  int MINUS = 17;
  /** RegularExpression Id. */
  int PLUS = 18;
  /** RegularExpression Id. */
  int DIVIDE = 19;
  /** RegularExpression Id. */
  int ASSIGNMENT = 20;
  /** RegularExpression Id. */
  int GREATER = 21;
  /** RegularExpression Id. */
  int LESS = 22;
  /** RegularExpression Id. */
  int GREATEREQUAL = 23;
  /** RegularExpression Id. */
  int LESSEQUAL = 24;
  /** RegularExpression Id. */
  int DIFFERENCE = 25;
  /** RegularExpression Id. */
  int EQUAL = 26;
  /** RegularExpression Id. */
  int OPENBLOCK = 27;
  /** RegularExpression Id. */
  int CLOSEBLOCK = 28;
  /** RegularExpression Id. */
  int VARCHARDELIMITER = 29;
  /** RegularExpression Id. */
  int SEMICOLON = 30;
  /** RegularExpression Id. */
  int COMMA = 31;
  /** RegularExpression Id. */
  int DOUBLEPOINTS = 32;
  /** RegularExpression Id. */
  int LEFTPARENT = 33;
  /** RegularExpression Id. */
  int RIGHTPARENT = 34;
  /** RegularExpression Id. */
  int HASHTAG = 35;
  /** RegularExpression Id. */
  int ID = 36;
  /** RegularExpression Id. */
  int LETTER = 37;
  /** RegularExpression Id. */
  int NUMBER = 38;
  /** RegularExpression Id. */
  int DIGIT = 39;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int multilinecomment = 1;
  /** Lexical state. */
  int singlelinecomment = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"Start\"",
    "\"int\"",
    "\"string\"",
    "\"bool\"",
    "\"using\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"for\"",
    "\"to\"",
    "\"while\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"!=\"",
    "\"==\"",
    "\"{\"",
    "\"}\"",
    "\"\\\'\"",
    "\";\"",
    "\",\"",
    "\":\"",
    "\"(\"",
    "\")\"",
    "\"#\"",
    "<ID>",
    "<LETTER>",
    "<NUMBER>",
    "<DIGIT>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 42>",
    "\"//\"",
    "<token of kind 44>",
    "<token of kind 45>",
  };

}
