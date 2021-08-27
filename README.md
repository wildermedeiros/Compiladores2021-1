# Compiladores: lingugaem Askella
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" /> <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" />

### Disciplina:	Construções de Compiladores

### Docente: Jorge Aikes Junior

### Acadêmicos:
* Felipe Beskow
* Romário Ferreira
* Wilder Siqueira Medeiros

### Objetivo:
Construi um compilador usando conhecimentos aprendidos durante a disciplina durante o 1º semestre de 2021.

## Materiais utilizados:
* Eclipse
  * JavaCC
* Python3
  * pygraphviz

## Palavras Reservadas:
* Start: inicia o programa, logo apos esta declaração deve haver um sinal de dois e um identificador relativo ao nome do seu programa;
* int: Tipo de variavel inteiro;
* string: Tipo de variavel string, cadeia de caracteres;
* bool: Tipo de variavel boolean, true or false;
* using: Pode ser usado para agregar o codigo de diferentes namespaces,  ́e usado antes do start do programa;
* IF: inicio declarac ̧ao de desvio condicional;
* THEN: a partir dessa declaração, ocorre o desvio caso a expressão condicional seja verdadeira;
* ELSE: a para partir dessa declarac ̧ao, ocorre o desvio caso a expressão condicional não seja verdadeira;
* FOR: indica a declaração de um laço de repetição contado;
* TO: anterior a essa declaração está uma expressão, e esta deve ser acrescida ou decrementada ate ficar igual a expressão posterior a esta declaração;
* While: Indica a declaraçao de um laço de repetição com condição lágica de parada;
* {: Delimitador de bloco inicial;
* }: Final de delimitador de bloco;
* ‘: Delimitador de strings;
* ;: Final de linha de instrução;
* :: Dois pontos, por hora, utilizado para início do programa;
* ,: Separador de tokens.

## Operadores:
* +: Soma;
* −: Subtração;
* ∗: Multiplicação;  
* /: Divisao; 
* ==: Comparac ̧ao de igualdade;  
* =: Atribuição
* >: Comparação maior;
* <: Comparação menor;
* ! =: Diferente;
* <=: Comparação menor ou igual; 
* >=: Comparação maior ou igual;

## Gramatica na forma Backus-Naur:
```
BNF
<S> ::= 	(<UsingDeclaration>)*
		Start : <ID> 
{ 
		(<Block>)+ 
	}

<ID> ::= <LETTER> ( <LETTER> | <DIGIT> )*

<NUMBER> ::= (<DIGIT>)+ ( “.” (<DIGIT>)+ )? 

<DIGIT> ::= 0|1|2|3|4|5|6|7|8|9

<LETTER> ::= a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z|A|B|C|D|E| F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z

<Block> ::= (<VariableDeclaration>)* 
		<Command> 

<VariableDeclaration> ::=  <DataType>  (<IDList>) + <SEMICOLON>

<IDList> ::= <ID> (<Inicialization>)? | <COMMA> <ID> (<Inicialization>)?

<DataType> ::= < INTEGERTYPE > | < STRINGTYPE > | < BOOLTYPE >

<Command> ::= 

	<Assignment>
|
<IF> <LogicExpression> <THEN>
 	(<OPENBLOCK>    
<Command>    
<CLOSEBLOCK> )
(<ELSE>   	 
<OPENBLOCK>   	 
<Command>
<CLOSEBLOCK> )?
|
<ForTo>
|
<While>

<Assignment> ::= <ID> <Inicialization> <SEMICOLON>

<Inicialization> ::= <ASSIGNMENT> (<NUMBER> | <VARCHARDELIMITER> <ID> <VARCHARDELIMITER>)


<ForTo> ::= 
<FOR> <Assignment> <TO> <ExpressionArguments>
	 (<OPENBLOCK>
		 <Command>
	 <CLOSEBLOCK> )

<While> ::= 
	<WHILE> <LogicExpression>
	 (<OPENBLOCK>
		 <Command>
	 <CLOSEBLOCK> )

<LogicExpression> ::= <ExpressionArguments> (<LogicOperator> <ExpressionArguments>)+

<MathExpression> ::= <ExpressionArguments> (<MathOperator> <ExpressionArguments>)+

<ExpressionArguments> ::= < ID > | < NUMBER >



<MathOperator> ::=   
    	< SUM >
    |    < MINUS >
    |    < PLUS >
    |    < DIVIDE >	

<LogicOperator> ::= 
      	< GREATER >
    |    < LESS>
    |    < GREATEREQUAL>
    |    < LESSEQUAL>
    |    < DIFFERENCE>
    |    < EQUAL>

<UsingDeclaration> ::= (<USING> <ID> <SEMICOLON>)

<VariableDeclaration> ::= (<DataType> (<IDList>)+ <SEMICOLON>)

<DataType> ::= < INTEGERTYPE > | < STRINGTYPE > | < BOOLTYPE >

<IDList> ::= <ID> (<Inicialization>)? | <COMMA> <ID> (<Inicialization>)?

```

## Hello World:
Um exemplo de como programar em Askella
```
using talnamespace;
Start: script
{
  int numero = 2, otnunero = 3, varisnumeros = 4;
  numero = 1;
  if isfalse > istrue then
  {
    numero = 1;
  }
  else
  {
    otonumero = 2;
  }
  for numero = 1; to 5
  {
    meuotonumero = 3;
  }
  while isTrue > isFalse
  {
    aqueleNumeroCabuloso = 4;
  }
}
```
