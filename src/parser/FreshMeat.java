/* Generated By:JJTree&JavaCC: Do not edit this line. FreshMeat.java */
package parser;
import recovery.*;

public class FreshMeat/*@bgen(jjtree)*/implements FreshMeatTreeConstants, FreshMeatConstants {/*@bgen(jjtree)*/
  protected static JJTFreshMeatState jjtree = new JJTFreshMeatState();public static void main(String args []) throws ParseException
  {
    FreshMeat parser = new FreshMeat(System.in);
    while (true)
    {
      System.out.println("Lendo atrav\u00e9s da entrada padr\u00e3o...");
      System.out.print("Digite uma express\u00e3o:");

      SimpleNode simpleNode = FreshMeat.start();
      simpleNode.dump("");
      try
      {
        /*switch (FreshMeat.start())
        {
          case 0 : 
          System.out.println("OK.");
          break;
          case 1 : 
          System.out.println("Tchau.");
          break;
          default : 
          break;
        }*/
      }
      catch (Exception e)
      {
        System.out.println("Exception: A express\u00e3o inserida n\u00e3o est\u00e1 correta, verifique por favor com as instru\u00e7\u00f5es abaixo e tente novamente.");
        System.out.println(e.getMessage());
        FreshMeat.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Error: A entrada inserida n\u00e3o \u00e9 um token v\u00e1lido, revise por favor e tente novamente");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static public String im(int x)
  {
    int k;
        String s;
    s = tokenImage[x];
    k = s.lastIndexOf("\u005c"");
    try {
      s = s.substring(1,k);
    }
   catch (StringIndexOutOfBoundsException e)
           {}
   return s;
  }

  static Token lastError = null;
  static boolean eof;    // vari�vel que indica se EOF foi alcan�ado

  // o m�todo abaixo consome tokens at� alcan�ar um que perten�a ao conjunto
  // de sincroniza��o
  static void consumeUntil(RecoverySet g,
                         ParseException e,
                         String met) throws ParseEOFException,
                                            ParseException
  {
        Token tok;
        System.out.println();
        System.out.println("*** " + met + " ***");
        System.out.println("     Conjunto de sincroniza\u00e7\u00e3o: " + g);

        if (g == null) throw e; // se o conjunto � null, propaga a exce��o

        tok = getToken(1); // pega token corrente
        while ( ! eof ) { // se n�o chegou ao fim do arquivo
          if ( g.contains(tok.kind)) {//achou um token no conjunto
            System.out.println("     Encontrado token de sincroniza\u00e7\u00e3o: " +
                               im(tok.kind));
            break;
          }
          System.out.println("     Ignorando o token: " + im(tok.kind));
          getNextToken();     // pega pr�ximo token       
      tok = getToken(1);
          if (tok.kind == EOF && ! g.contains(EOF) ) // fim da entrada?   
              eof = true;
        }
    if ( tok != lastError)  {
          System.out.println(e.getMessage());
          lastError = tok;

        }
        if ( eof )
          throw new ParseEOFException("Encontrei EOF onde n\u00e3o deveria.");
  }

  static final public SimpleNode start() throws ParseException {
                     /*@bgen(jjtree) start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case USING:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        UsingDeclaration();
      }
      jj_consume_token(STARTSCRIPT);
      jj_consume_token(DOUBLEPOINTS);
      jj_consume_token(ID);
      jj_consume_token(LBRACE);
      label_2:
      while (true) {
        Block();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEGERTYPE:
        case STRINGTYPE:
        case BOOLTYPE:
        case IF:
        case FOR:
        case WHILE:
        case ID:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
      jj_consume_token(RBRACE);
  jjtree.closeNodeScope(jjtn000, true);
  jjtc000 = false;
  {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void Block() throws ParseException {
               /*@bgen(jjtree) Block */
  SimpleNode jjtn000 = new SimpleNode(JJTBLOCK);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEGERTYPE:
        case STRINGTYPE:
        case BOOLTYPE:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        VariableDeclaration();
      }
      Command();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void Command() throws ParseException {
                 /*@bgen(jjtree) Command */
  SimpleNode jjtn000 = new SimpleNode(JJTCOMMAND);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        VariableAssignment();
        break;
      case IF:
        If();
        break;
      case FOR:
        ForTo();
        break;
      case WHILE:
        While();
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void VariableAssignment() throws ParseException {
                            /*@bgen(jjtree) VariableAssignment */
  SimpleNode jjtn000 = new SimpleNode(JJTVARIABLEASSIGNMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ID);
      VariableInicialization();
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

// | MathAssign()
  static final public void VariableInicialization() throws ParseException {
                                /*@bgen(jjtree) VariableInicialization */
  SimpleNode jjtn000 = new SimpleNode(JJTVARIABLEINICIALIZATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ASSIGN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
        jj_consume_token(NUMBER);
        break;
      case VARCHARDELIMITER:
        jj_consume_token(VARCHARDELIMITER);
        jj_consume_token(ID);
        jj_consume_token(VARCHARDELIMITER);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void MathAssign() throws ParseException {
                    /*@bgen(jjtree) MathAssign */
  SimpleNode jjtn000 = new SimpleNode(JJTMATHASSIGN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ASSIGN);
      MathExpression();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void If() throws ParseException {
            /*@bgen(jjtree) If */
  SimpleNode jjtn000 = new SimpleNode(JJTIF);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IF);
      LogicExpression();
      jj_consume_token(THEN);
      jj_consume_token(LBRACE);
      Command();
      jj_consume_token(RBRACE);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
        jj_consume_token(ELSE);
        jj_consume_token(LBRACE);
        Command();
        jj_consume_token(RBRACE);
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void ForTo() throws ParseException {
               /*@bgen(jjtree) ForTo */
  SimpleNode jjtn000 = new SimpleNode(JJTFORTO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FOR);
      VariableAssignment();
      jj_consume_token(TO);
      ExpressionArguments();
      jj_consume_token(LBRACE);
      Command();
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void While() throws ParseException {
               /*@bgen(jjtree) While */
  SimpleNode jjtn000 = new SimpleNode(JJTWHILE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(WHILE);
      LogicExpression();
      jj_consume_token(LBRACE);
      Command();
      jj_consume_token(RBRACE);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void LogicExpression() throws ParseException {
                         /*@bgen(jjtree) LogicExpression */
  SimpleNode jjtn000 = new SimpleNode(JJTLOGICEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ExpressionArguments();
      label_4:
      while (true) {
        LogicOperator();
        ExpressionArguments();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case GREATER:
        case LESS:
        case GREATEREQUAL:
        case LESSEQUAL:
        case DIFFERENCE:
        case EQUAL:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_4;
        }
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void MathExpression() throws ParseException {
                         /*@bgen(jjtree) MathExpression */
  SimpleNode jjtn000 = new SimpleNode(JJTMATHEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ExpressionArguments();
      label_5:
      while (true) {
        MathOperator();
        ExpressionArguments();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SUM:
        case MINUS:
        case PLUS:
        case DIVIDE:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_5;
        }
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void ExpressionArguments() throws ParseException {
                             /*@bgen(jjtree) ExpressionArguments */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSIONARGUMENTS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        jj_consume_token(ID);
        break;
      case NUMBER:
        jj_consume_token(NUMBER);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void MathOperator() throws ParseException {
                      /*@bgen(jjtree) MathOperator */
  SimpleNode jjtn000 = new SimpleNode(JJTMATHOPERATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUM:
        jj_consume_token(SUM);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
                  if (jjtc000) {
                    jjtree.closeNodeScope(jjtn000, true);
                  }
    }
  }

  static final public void LogicOperator() throws ParseException {
                       /*@bgen(jjtree) LogicOperator */
  SimpleNode jjtn000 = new SimpleNode(JJTLOGICOPERATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case GREATER:
        jj_consume_token(GREATER);
        break;
      case LESS:
        jj_consume_token(LESS);
        break;
      case GREATEREQUAL:
        jj_consume_token(GREATEREQUAL);
        break;
      case LESSEQUAL:
        jj_consume_token(LESSEQUAL);
        break;
      case DIFFERENCE:
        jj_consume_token(DIFFERENCE);
        break;
      case EQUAL:
        jj_consume_token(EQUAL);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
                  if (jjtc000) {
                    jjtree.closeNodeScope(jjtn000, true);
                  }
    }
  }

  static final public void UsingDeclaration() throws ParseException {
                          /*@bgen(jjtree) UsingDeclaration */
  SimpleNode jjtn000 = new SimpleNode(JJTUSINGDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(USING);
      jj_consume_token(ID);
      jj_consume_token(SEMICOLON);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void VariableDeclaration() throws ParseException {
                             /*@bgen(jjtree) VariableDeclaration */
  SimpleNode jjtn000 = new SimpleNode(JJTVARIABLEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      DataType();
      label_6:
      while (true) {
        IDList();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
        case ID:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          break label_6;
        }
      }
      jj_consume_token(SEMICOLON);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void DataType() throws ParseException {
                  /*@bgen(jjtree) DataType */
                   SimpleNode jjtn000 = new SimpleNode(JJTDATATYPE);
                   boolean jjtc000 = true;
                   jjtree.openNodeScope(jjtn000);RecoverySet recoverySet = First.DataType;
    try {
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEGERTYPE:
          jj_consume_token(INTEGERTYPE);
          break;
        case STRINGTYPE:
          jj_consume_token(STRINGTYPE);
          break;
        case BOOLTYPE:
          jj_consume_token(BOOLTYPE);
          break;
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (ParseException e) {
                consumeUntil(recoverySet, e, "DataType");
      }
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void IDList() throws ParseException {
                /*@bgen(jjtree) IDList */
  SimpleNode jjtn000 = new SimpleNode(JJTIDLIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ASSIGN:
          VariableInicialization();
          break;
        default:
          jj_la1[13] = jj_gen;
          ;
        }
        break;
      case COMMA:
        jj_consume_token(COMMA);
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ASSIGN:
          VariableInicialization();
          break;
        default:
          jj_la1[14] = jj_gen;
          ;
        }
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
           if (jjtc000) {
             jjtree.clearNodeScope(jjtn000);
             jjtc000 = false;
           } else {
             jjtree.popNode();
           }
           if (jjte000 instanceof RuntimeException) {
             {if (true) throw (RuntimeException)jjte000;}
           }
           if (jjte000 instanceof ParseException) {
             {if (true) throw (ParseException)jjte000;}
           }
           {if (true) throw (Error)jjte000;}
    } finally {
           if (jjtc000) {
             jjtree.closeNodeScope(jjtn000, true);
           }
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public FreshMeatTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[16];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x200,0xa5c0,0x1c0,0xa400,0x20000000,0x1000,0x7e00000,0xf0000,0x0,0xf0000,0x7e00000,0x80000000,0x1c0,0x100000,0x100000,0x80000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x10,0x0,0x10,0x40,0x0,0x0,0x0,0x50,0x0,0x0,0x10,0x0,0x0,0x0,0x10,};
   }

  /** Constructor with InputStream. */
  public FreshMeat(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public FreshMeat(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new FreshMeatTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public FreshMeat(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new FreshMeatTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public FreshMeat(FreshMeatTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(FreshMeatTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[46];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 16; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 46; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
