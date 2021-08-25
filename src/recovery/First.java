package recovery;

import parser.*;

public class First 
{ //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet start = new RecoverySet();
    static public final RecoverySet Block = new RecoverySet();
    static public final RecoverySet Command = Block;
    static public final RecoverySet VariableAssignment = new RecoverySet().union(Command);
    static public final RecoverySet DataType = new RecoverySet();
    static public final RecoverySet IDList = new RecoverySet().union(DataType);
    static public final RecoverySet VariableInit = new RecoverySet().union(IDList);
    static public final RecoverySet Y = VariableInit;
    static public final RecoverySet W = Y;
    static public final RecoverySet DoMath = new RecoverySet().union(Y); 
    static public final RecoverySet If = Command;
    static public final RecoverySet ForTo = Command;
    static public final RecoverySet While = Command;
    static public final RecoverySet LogicExpression = new RecoverySet();
    static public final RecoverySet ExpressionArguments = new RecoverySet().union(DoMath).union(LogicExpression);
    static public final RecoverySet MathOperator = new RecoverySet();
    static public final RecoverySet LogicOperator = MathOperator;
    static public final RecoverySet UsingDeclaration = new RecoverySet();
    static public final RecoverySet VariableDeclaration = new RecoverySet();


    static 
    {
    	start.add(new Integer(FreshMeatConstants.EOF));
    	
    	Block.add(new Integer(FreshMeatConstants.RBRACE));
    	Block.add(new Integer(FreshMeatConstants.INTEGERTYPE));
    	Block.add(new Integer(FreshMeatConstants.STRINGTYPE));
    	Block.add(new Integer(FreshMeatConstants.BOOLTYPE));
    	Block.add(new Integer(FreshMeatConstants.ID));
    	
    	VariableAssignment.add(new Integer(FreshMeatConstants.TO));

    	VariableInit.add(new Integer(FreshMeatConstants.SEMICOLON));
    	VariableInit.add(new Integer(FreshMeatConstants.ASSIGN));

    	DoMath.add(new Integer(FreshMeatConstants.SUM));
    	DoMath.add(new Integer(FreshMeatConstants.MINUS));
    	DoMath.add(new Integer(FreshMeatConstants.PLUS));
    	DoMath.add(new Integer(FreshMeatConstants.DIVIDE));   	

    	LogicExpression.add(new Integer(FreshMeatConstants.THEN)); 
    	LogicExpression.add(new Integer(FreshMeatConstants.LBRACE));    
    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.LBRACE));    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.GREATER));    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.LESS));    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.GREATEREQUAL));    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.LESSEQUAL));    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.DIFFERENCE));    	
    	ExpressionArguments.add(new Integer(FreshMeatConstants.EQUAL));    	
    		
    	MathOperator.add(new Integer(FreshMeatConstants.ID));  
    	MathOperator.add(new Integer(FreshMeatConstants.NUMBER)); 
    	
    	UsingDeclaration.add(new Integer(FreshMeatConstants.STARTSCRIPT));
    	UsingDeclaration.add(new Integer(FreshMeatConstants.USING));
    	
     	VariableDeclaration.add(new Integer(FreshMeatConstants.ID)); 
     	VariableDeclaration.add(new Integer(FreshMeatConstants.IF)); 
     	VariableDeclaration.add(new Integer(FreshMeatConstants.FOR));
     	VariableDeclaration.add(new Integer(FreshMeatConstants.WHILE)); 
     	VariableDeclaration.add(new Integer(FreshMeatConstants.INTEGERTYPE));
     	VariableDeclaration.add(new Integer(FreshMeatConstants.STRINGTYPE));
     	VariableDeclaration.add(new Integer(FreshMeatConstants.BOOLTYPE));
     	
     	DataType.add(new Integer(FreshMeatConstants.ID));
     	DataType.add(new Integer(FreshMeatConstants.COMMA));

     	IDList.add(new Integer(FreshMeatConstants.SEMICOLON));




    	
    	

    	
    	
    	

    	
  	
    }
}
