package parser;
/* Cont�m uma matriz usada para identifica��o dos token
 * sendo que esta matriz foi criada baseada no n�mero de identifica��o
 * do token (vide AnalisadorLexicoConstants.java)
 */
public interface TipoToken {
	String[] nomeToken = { "<EOF>", "\" \"", "\"\\r\"", "\"\\t\"", "\"\\n\"",
			"\"STARTSCRIPT\"", "\"INTEGERTYPE\"", "\"STRINGTYPE\"", "\"BOOLTYPE\"",
			"\"USING\"", "\"IF\"", "\"THEN\"", "\"ELSE\"", "\"FOR\"", "\"TO\"",
			"<WHILE>", "<SUM>", "<MINUS>", "\"PLUS\"", "\"DIVIDE\"",
			"\"ASSIGN\"", "\"GREATER\"", "\"LESS\"", "\"GREATEREQUAL\"",
			"\"LESSEQUAL\"", "\"DIFFERENCE\"", "\"EQUAL\"", "\"LBRACE\"",
			"\"RBRACE\"", "\"VARCHARDELIMITER\"", "\"SEMICOLON\"", "<COMMA>",
			"\"\\DOUBLEPOINTS\"", "\"LPARENT", "\"RPARENT\"", "\"HASHTAG\"",
			"\"ID\"", "\"LETTER\"", "\"NUMBER\"", "\"DIGIT\"",
			"\"(\"", "\")\"", };

}
