/* Generated By:JJTree&JavaCC: Do not edit this line. FreshMeat.java */
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
      jj_consume_token(OPENBLOCK);
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
      jj_consume_token(CLOSEBLOCK);
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
        Assignment();
        break;
      default:
        jj_la1[4] = jj_gen;
        if (jj_2_1(2)) {
          jj_consume_token(IF);
          LogicExpression();
          jj_consume_token(THEN);
          jj_consume_token(OPENBLOCK);
          Command();
          jj_consume_token(CLOSEBLOCK);
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case ELSE:
            jj_consume_token(ELSE);
            jj_consume_token(OPENBLOCK);
            Command();
            jj_consume_token(CLOSEBLOCK);
            break;
          default:
            jj_la1[3] = jj_gen;
            ;
          }
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case FOR:
            ForTo();
            break;
          case WHILE:
            While();
            break;
          default:
            jj_la1[5] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
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

  static final public void Variable() throws ParseException {
                  /*@bgen(jjtree) Variable */
  SimpleNode jjtn000 = new SimpleNode(JJTVARIABLE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ID);
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public void Assignment() throws ParseException {
                    /*@bgen(jjtree) Assignment */
  SimpleNode jjtn000 = new SimpleNode(JJTASSIGNMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ID);
      Inicialization();
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

  static final public void Inicialization() throws ParseException {
                        /*@bgen(jjtree) Inicialization */
  SimpleNode jjtn000 = new SimpleNode(JJTINICIALIZATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(ASSIGNMENT);
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
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
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
      Assignment();
      jj_consume_token(TO);
      ExpressionArguments();
      jj_consume_token(OPENBLOCK);
      Command();
      jj_consume_token(CLOSEBLOCK);
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
      jj_consume_token(OPENBLOCK);
      Command();
      jj_consume_token(CLOSEBLOCK);
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
          jj_la1[7] = jj_gen;
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
          jj_la1[8] = jj_gen;
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
        jj_la1[11] = jj_gen;
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
        case ID:
        case COMMA:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
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
  jjtree.openNodeScope(jjtn000);
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
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
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
        case ASSIGNMENT:
          Inicialization();
          break;
        default:
          jj_la1[14] = jj_gen;
          ;
        }
        break;
      case COMMA:
        jj_consume_token(COMMA);
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ASSIGNMENT:
          Inicialization();
          break;
        default:
          jj_la1[15] = jj_gen;
          ;
        }
        break;
      default:
        jj_la1[16] = jj_gen;
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

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_3_1() {
    if (jj_scan_token(IF)) return true;
    if (jj_3R_7()) return true;
    return false;
  }

  static private boolean jj_3R_7() {
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3R_8() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(31)) {
    jj_scanpos = xsp;
    if (jj_scan_token(16)) return true;
    }
    return false;
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
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[17];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x200,0x8000a5c0,0x1c0,0x1000,0x80000000,0xa000,0x10000,0x7e000000,0xf00000,0x80010000,0xf00000,0x7e000000,0x80000000,0x1c0,0x1000000,0x1000000,0x80000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x2,0x0,0x0,0x0,0x0,0x0,0x8,0x0,0x0,0x0,0x8,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[1];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

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
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
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
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
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
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
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
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(FreshMeatTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
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
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[40];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 17; i++) {
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
    for (int i = 0; i < 40; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
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

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
