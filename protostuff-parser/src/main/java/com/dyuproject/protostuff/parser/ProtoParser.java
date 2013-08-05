// $ANTLR 3.2 Sep 23, 2009 14:05:07 com/dyuproject/protostuff/parser/ProtoParser.g 2012-12-27 15:15:45

    package com.dyuproject.protostuff.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class ProtoParser extends AbstractParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "AT", "LEFTCURLY", "RIGHTCURLY", "LEFTPAREN", "RIGHTPAREN", "LEFTSQUARE", "RIGHTSQUARE", "SEMICOLON", "COMMA", "PLUS", "MINUS", "TO", "TRUE", "FALSE", "PKG", "SYNTAX", "IMPORT", "OPTION", "MESSAGE", "SERVICE", "ENUM", "REQUIRED", "OPTIONAL", "REPEATED", "EXTENSIONS", "EXTEND", "GROUP", "RPC", "RETURNS", "INT32", "INT64", "UINT32", "UINT64", "SINT32", "SINT64", "FIXED32", "FIXED64", "SFIXED32", "SFIXED64", "FLOAT", "DOUBLE", "BOOL", "STRING", "BYTES", "DEFAULT", "MAX", "VOID", "ID", "FULL_ID", "NUMINT", "EXP", "NUMFLOAT", "NUMDOUBLE", "HEX_DIGIT", "HEX", "OCTAL", "COMMENT", "WS", "ESC_SEQ", "STRING_LITERAL", "UNICODE_ESC", "OCTAL_ESC"
    };
    public static final int OPTION=22;
    public static final int FULL_ID=53;
    public static final int OCTAL_ESC=66;
    public static final int PKG=19;
    public static final int NUMFLOAT=56;
    public static final int MAX=50;
    public static final int FLOAT=44;
    public static final int FIXED64=41;
    public static final int ID=52;
    public static final int EOF=-1;
    public static final int AT=5;
    public static final int SYNTAX=20;
    public static final int LEFTPAREN=8;
    public static final int EXTEND=30;
    public static final int IMPORT=21;
    public static final int ESC_SEQ=63;
    public static final int STRING_LITERAL=64;
    public static final int EXTENSIONS=29;
    public static final int SINT64=39;
    public static final int LEFTCURLY=6;
    public static final int EXP=55;
    public static final int HEX=59;
    public static final int COMMA=13;
    public static final int FIXED32=40;
    public static final int RIGHTCURLY=7;
    public static final int SFIXED32=42;
    public static final int DOUBLE=45;
    public static final int MESSAGE=23;
    public static final int PLUS=14;
    public static final int VOID=51;
    public static final int NUMDOUBLE=57;
    public static final int COMMENT=61;
    public static final int NUMINT=54;
    public static final int SINT32=38;
    public static final int RETURNS=33;
    public static final int TO=16;
    public static final int INT64=35;
    public static final int RIGHTSQUARE=11;
    public static final int UNICODE_ESC=65;
    public static final int DEFAULT=49;
    public static final int BOOL=46;
    public static final int REPEATED=28;
    public static final int HEX_DIGIT=58;
    public static final int SEMICOLON=12;
    public static final int REQUIRED=26;
    public static final int MINUS=15;
    public static final int TRUE=17;
    public static final int UINT64=37;
    public static final int OPTIONAL=27;
    public static final int INT32=34;
    public static final int GROUP=31;
    public static final int WS=62;
    public static final int ENUM=25;
    public static final int SERVICE=24;
    public static final int RIGHTPAREN=9;
    public static final int LEFTSQUARE=10;
    public static final int SFIXED64=43;
    public static final int BYTES=48;
    public static final int ASSIGN=4;
    public static final int RPC=32;
    public static final int OCTAL=60;
    public static final int UINT32=36;
    public static final int FALSE=18;
    public static final int STRING=47;

    // delegates
    // delegators


        public ProtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ProtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ProtoParser.tokenNames; }
    public String getGrammarFileName() { return "com/dyuproject/protostuff/parser/ProtoParser.g"; }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // com/dyuproject/protostuff/parser/ProtoParser.g:52:1: parse[Proto proto] : ( statement[proto] )+ EOF ;
    public final ProtoParser.parse_return parse(Proto proto) throws RecognitionException {
        ProtoParser.parse_return retval = new ProtoParser.parse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        ProtoParser.statement_return statement1 = null;


        Object EOF2_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:53:5: ( ( statement[proto] )+ EOF )
            // com/dyuproject/protostuff/parser/ProtoParser.g:53:9: ( statement[proto] )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // com/dyuproject/protostuff/parser/ProtoParser.g:53:9: ( statement[proto] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case AT:
                case PKG:
                case SYNTAX:
                case IMPORT:
                case OPTION:
                case MESSAGE:
                case SERVICE:
                case ENUM:
                case EXTEND:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:53:10: statement[proto]
            	    {
            	    pushFollow(FOLLOW_statement_in_parse178);
            	    statement1=statement(proto);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                          
                          proto.postParse();
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parse"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // com/dyuproject/protostuff/parser/ProtoParser.g:61:1: statement[Proto proto] : ( header_syntax[proto] | header_package[proto] | header_import[proto] | message_block[proto, null] | enum_block[proto, null] | extend_block[proto, null] | service_block[proto] | annotation_entry[proto] | option_entry[proto, proto] );
    public final ProtoParser.statement_return statement(Proto proto) throws RecognitionException {
        ProtoParser.statement_return retval = new ProtoParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProtoParser.header_syntax_return header_syntax3 = null;

        ProtoParser.header_package_return header_package4 = null;

        ProtoParser.header_import_return header_import5 = null;

        ProtoParser.message_block_return message_block6 = null;

        ProtoParser.enum_block_return enum_block7 = null;

        ProtoParser.extend_block_return extend_block8 = null;

        ProtoParser.service_block_return service_block9 = null;

        ProtoParser.annotation_entry_return annotation_entry10 = null;

        ProtoParser.option_entry_return option_entry11 = null;



        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:62:5: ( header_syntax[proto] | header_package[proto] | header_import[proto] | message_block[proto, null] | enum_block[proto, null] | extend_block[proto, null] | service_block[proto] | annotation_entry[proto] | option_entry[proto, proto] )
            int alt2=9;
            switch ( input.LA(1) ) {
            case SYNTAX:
                {
                alt2=1;
                }
                break;
            case PKG:
                {
                alt2=2;
                }
                break;
            case IMPORT:
                {
                alt2=3;
                }
                break;
            case MESSAGE:
                {
                alt2=4;
                }
                break;
            case ENUM:
                {
                alt2=5;
                }
                break;
            case EXTEND:
                {
                alt2=6;
                }
                break;
            case SERVICE:
                {
                alt2=7;
                }
                break;
            case AT:
                {
                alt2=8;
                }
                break;
            case OPTION:
                {
                alt2=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:62:9: header_syntax[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_header_syntax_in_statement211);
                    header_syntax3=header_syntax(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, header_syntax3.getTree());

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:63:9: header_package[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_header_package_in_statement222);
                    header_package4=header_package(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, header_package4.getTree());

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:64:9: header_import[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_header_import_in_statement233);
                    header_import5=header_import(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, header_import5.getTree());

                    }
                    break;
                case 4 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:65:9: message_block[proto, null]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_message_block_in_statement244);
                    message_block6=message_block(proto, null);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_block6.getTree());

                    }
                    break;
                case 5 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:66:9: enum_block[proto, null]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enum_block_in_statement255);
                    enum_block7=enum_block(proto, null);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_block7.getTree());

                    }
                    break;
                case 6 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:67:9: extend_block[proto, null]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_extend_block_in_statement266);
                    extend_block8=extend_block(proto, null);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extend_block8.getTree());

                    }
                    break;
                case 7 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:68:9: service_block[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_service_block_in_statement277);
                    service_block9=service_block(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, service_block9.getTree());

                    }
                    break;
                case 8 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:69:9: annotation_entry[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_annotation_entry_in_statement288);
                    annotation_entry10=annotation_entry(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_entry10.getTree());

                    }
                    break;
                case 9 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:70:9: option_entry[proto, proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_option_entry_in_statement299);
                    option_entry11=option_entry(proto, proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, option_entry11.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // com/dyuproject/protostuff/parser/ProtoParser.g:74:1: var : ( ID | TO | PKG | SYNTAX | IMPORT | OPTION | MESSAGE | SERVICE | ENUM | REQUIRED | OPTIONAL | REPEATED | EXTENSIONS | EXTEND | GROUP | RPC | RETURNS | INT32 | INT64 | UINT32 | UINT64 | SINT32 | SINT64 | FIXED32 | FIXED64 | SFIXED32 | SFIXED64 | FLOAT | DOUBLE | BOOL | STRING | BYTES | DEFAULT | MAX | VOID );
    public final ProtoParser.var_return var() throws RecognitionException {
        ProtoParser.var_return retval = new ProtoParser.var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:75:5: ( ID | TO | PKG | SYNTAX | IMPORT | OPTION | MESSAGE | SERVICE | ENUM | REQUIRED | OPTIONAL | REPEATED | EXTENSIONS | EXTEND | GROUP | RPC | RETURNS | INT32 | INT64 | UINT32 | UINT64 | SINT32 | SINT64 | FIXED32 | FIXED64 | SFIXED32 | SFIXED64 | FLOAT | DOUBLE | BOOL | STRING | BYTES | DEFAULT | MAX | VOID )
            // com/dyuproject/protostuff/parser/ProtoParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( input.LA(1)==TO||(input.LA(1)>=PKG && input.LA(1)<=ID) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set12));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class annotation_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation_entry"
    // com/dyuproject/protostuff/parser/ProtoParser.g:82:1: annotation_entry[Proto proto] : AT var ( LEFTPAREN annotation_keyval[proto, annotation] ( COMMA annotation_keyval[proto, annotation] )* RIGHTPAREN )? ;
    public final ProtoParser.annotation_entry_return annotation_entry(Proto proto) throws RecognitionException {
        ProtoParser.annotation_entry_return retval = new ProtoParser.annotation_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT13=null;
        Token LEFTPAREN15=null;
        Token COMMA17=null;
        Token RIGHTPAREN19=null;
        ProtoParser.var_return var14 = null;

        ProtoParser.annotation_keyval_return annotation_keyval16 = null;

        ProtoParser.annotation_keyval_return annotation_keyval18 = null;


        Object AT13_tree=null;
        Object LEFTPAREN15_tree=null;
        Object COMMA17_tree=null;
        Object RIGHTPAREN19_tree=null;


            Annotation annotation = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:86:5: ( AT var ( LEFTPAREN annotation_keyval[proto, annotation] ( COMMA annotation_keyval[proto, annotation] )* RIGHTPAREN )? )
            // com/dyuproject/protostuff/parser/ProtoParser.g:86:9: AT var ( LEFTPAREN annotation_keyval[proto, annotation] ( COMMA annotation_keyval[proto, annotation] )* RIGHTPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            AT13=(Token)match(input,AT,FOLLOW_AT_in_annotation_entry519); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT13_tree = (Object)adaptor.create(AT13);
            adaptor.addChild(root_0, AT13_tree);
            }
            pushFollow(FOLLOW_var_in_annotation_entry521);
            var14=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var14.getTree());
            if ( state.backtracking==0 ) {
               annotation = new Annotation((var14!=null?input.toString(var14.start,var14.stop):null)); 
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:87:9: ( LEFTPAREN annotation_keyval[proto, annotation] ( COMMA annotation_keyval[proto, annotation] )* RIGHTPAREN )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case LEFTPAREN:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:87:10: LEFTPAREN annotation_keyval[proto, annotation] ( COMMA annotation_keyval[proto, annotation] )* RIGHTPAREN
                    {
                    LEFTPAREN15=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_annotation_entry534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LEFTPAREN15_tree = (Object)adaptor.create(LEFTPAREN15);
                    adaptor.addChild(root_0, LEFTPAREN15_tree);
                    }
                    pushFollow(FOLLOW_annotation_keyval_in_annotation_entry545);
                    annotation_keyval16=annotation_keyval(proto, annotation);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_keyval16.getTree());
                    // com/dyuproject/protostuff/parser/ProtoParser.g:88:46: ( COMMA annotation_keyval[proto, annotation] )*
                    loop3:
                    do {
                        int alt3=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt3=1;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // com/dyuproject/protostuff/parser/ProtoParser.g:88:47: COMMA annotation_keyval[proto, annotation]
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotation_entry549); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA17_tree = (Object)adaptor.create(COMMA17);
                    	    adaptor.addChild(root_0, COMMA17_tree);
                    	    }
                    	    pushFollow(FOLLOW_annotation_keyval_in_annotation_entry551);
                    	    annotation_keyval18=annotation_keyval(proto, annotation);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_keyval18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    RIGHTPAREN19=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_annotation_entry565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RIGHTPAREN19_tree = (Object)adaptor.create(RIGHTPAREN19);
                    adaptor.addChild(root_0, RIGHTPAREN19_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          proto.add(annotation);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotation_entry"

    public static class annotation_keyval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation_keyval"
    // com/dyuproject/protostuff/parser/ProtoParser.g:94:1: annotation_keyval[Proto proto, Annotation annotation] : k= var ASSIGN ( ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL | v= var ) ;
    public final ProtoParser.annotation_keyval_return annotation_keyval(Proto proto, Annotation annotation) throws RecognitionException {
        ProtoParser.annotation_keyval_return retval = new ProtoParser.annotation_keyval_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token fid=null;
        Token ASSIGN20=null;
        Token ID21=null;
        Token NUMFLOAT22=null;
        Token NUMINT23=null;
        Token NUMDOUBLE24=null;
        Token TRUE25=null;
        Token FALSE26=null;
        Token STRING_LITERAL27=null;
        ProtoParser.var_return k = null;

        ProtoParser.var_return v = null;


        Object fid_tree=null;
        Object ASSIGN20_tree=null;
        Object ID21_tree=null;
        Object NUMFLOAT22_tree=null;
        Object NUMINT23_tree=null;
        Object NUMDOUBLE24_tree=null;
        Object TRUE25_tree=null;
        Object FALSE26_tree=null;
        Object STRING_LITERAL27_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:95:5: (k= var ASSIGN ( ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL | v= var ) )
            // com/dyuproject/protostuff/parser/ProtoParser.g:95:9: k= var ASSIGN ( ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL | v= var )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_in_annotation_keyval592);
            k=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, k.getTree());
            ASSIGN20=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotation_keyval594); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN20_tree = (Object)adaptor.create(ASSIGN20);
            adaptor.addChild(root_0, ASSIGN20_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:95:22: ( ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL | v= var )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:96:17: ID
                    {
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_annotation_keyval614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID21_tree = (Object)adaptor.create(ID21);
                    adaptor.addChild(root_0, ID21_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.putRef((k!=null?input.toString(k.start,k.stop):null), (ID21!=null?ID21.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:97:17: fid= FULL_ID
                    {
                    fid=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_annotation_keyval636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    fid_tree = (Object)adaptor.create(fid);
                    adaptor.addChild(root_0, fid_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.putRef((k!=null?input.toString(k.start,k.stop):null), (fid!=null?fid.getText():null)); 
                    }

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:98:17: NUMFLOAT
                    {
                    NUMFLOAT22=(Token)match(input,NUMFLOAT,FOLLOW_NUMFLOAT_in_annotation_keyval656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMFLOAT22_tree = (Object)adaptor.create(NUMFLOAT22);
                    adaptor.addChild(root_0, NUMFLOAT22_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), Float.valueOf((NUMFLOAT22!=null?NUMFLOAT22.getText():null))); 
                    }

                    }
                    break;
                case 4 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:99:17: NUMINT
                    {
                    NUMINT23=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_annotation_keyval676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMINT23_tree = (Object)adaptor.create(NUMINT23);
                    adaptor.addChild(root_0, NUMINT23_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), Integer.valueOf((NUMINT23!=null?NUMINT23.getText():null))); 
                    }

                    }
                    break;
                case 5 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:100:17: NUMDOUBLE
                    {
                    NUMDOUBLE24=(Token)match(input,NUMDOUBLE,FOLLOW_NUMDOUBLE_in_annotation_keyval696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMDOUBLE24_tree = (Object)adaptor.create(NUMDOUBLE24);
                    adaptor.addChild(root_0, NUMDOUBLE24_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), Double.valueOf((NUMDOUBLE24!=null?NUMDOUBLE24.getText():null))); 
                    }

                    }
                    break;
                case 6 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:101:17: TRUE
                    {
                    TRUE25=(Token)match(input,TRUE,FOLLOW_TRUE_in_annotation_keyval716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE25_tree = (Object)adaptor.create(TRUE25);
                    adaptor.addChild(root_0, TRUE25_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), Boolean.TRUE); 
                    }

                    }
                    break;
                case 7 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:102:17: FALSE
                    {
                    FALSE26=(Token)match(input,FALSE,FOLLOW_FALSE_in_annotation_keyval736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE26_tree = (Object)adaptor.create(FALSE26);
                    adaptor.addChild(root_0, FALSE26_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), Boolean.FALSE); 
                    }

                    }
                    break;
                case 8 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:103:17: STRING_LITERAL
                    {
                    STRING_LITERAL27=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_annotation_keyval756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL27_tree = (Object)adaptor.create(STRING_LITERAL27);
                    adaptor.addChild(root_0, STRING_LITERAL27_tree);
                    }
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), getStringFromStringLiteral((STRING_LITERAL27!=null?STRING_LITERAL27.getText():null))); 
                    }

                    }
                    break;
                case 9 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:104:17: v= var
                    {
                    pushFollow(FOLLOW_var_in_annotation_keyval778);
                    v=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, v.getTree());
                    if ( state.backtracking==0 ) {
                       annotation.put((k!=null?input.toString(k.start,k.stop):null), (v!=null?input.toString(v.start,v.stop):null)); 
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotation_keyval"

    public static class header_syntax_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header_syntax"
    // com/dyuproject/protostuff/parser/ProtoParser.g:108:1: header_syntax[Proto proto] : SYNTAX ASSIGN STRING_LITERAL SEMICOLON ;
    public final ProtoParser.header_syntax_return header_syntax(Proto proto) throws RecognitionException {
        ProtoParser.header_syntax_return retval = new ProtoParser.header_syntax_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SYNTAX28=null;
        Token ASSIGN29=null;
        Token STRING_LITERAL30=null;
        Token SEMICOLON31=null;

        Object SYNTAX28_tree=null;
        Object ASSIGN29_tree=null;
        Object STRING_LITERAL30_tree=null;
        Object SEMICOLON31_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:109:5: ( SYNTAX ASSIGN STRING_LITERAL SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:109:9: SYNTAX ASSIGN STRING_LITERAL SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            SYNTAX28=(Token)match(input,SYNTAX,FOLLOW_SYNTAX_in_header_syntax811); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SYNTAX28_tree = (Object)adaptor.create(SYNTAX28);
            adaptor.addChild(root_0, SYNTAX28_tree);
            }
            ASSIGN29=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_header_syntax813); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN29_tree = (Object)adaptor.create(ASSIGN29);
            adaptor.addChild(root_0, ASSIGN29_tree);
            }
            STRING_LITERAL30=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_header_syntax815); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL30_tree = (Object)adaptor.create(STRING_LITERAL30);
            adaptor.addChild(root_0, STRING_LITERAL30_tree);
            }
            SEMICOLON31=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_header_syntax817); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          if(!"proto2".equals(getStringFromStringLiteral((STRING_LITERAL30!=null?STRING_LITERAL30.getText():null)))) {
                              throw new IllegalStateException("Syntax isn't proto2: '" +
                                getStringFromStringLiteral((STRING_LITERAL30!=null?STRING_LITERAL30.getText():null))+"'");
                          }
                                
                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "header_syntax"

    public static class header_package_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header_package"
    // com/dyuproject/protostuff/parser/ProtoParser.g:120:1: header_package[Proto proto] : PKG ( FULL_ID | var ) SEMICOLON ;
    public final ProtoParser.header_package_return header_package(Proto proto) throws RecognitionException {
        ProtoParser.header_package_return retval = new ProtoParser.header_package_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PKG32=null;
        Token FULL_ID33=null;
        Token SEMICOLON35=null;
        ProtoParser.var_return var34 = null;


        Object PKG32_tree=null;
        Object FULL_ID33_tree=null;
        Object SEMICOLON35_tree=null;


            String value = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:124:5: ( PKG ( FULL_ID | var ) SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:124:9: PKG ( FULL_ID | var ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            PKG32=(Token)match(input,PKG,FOLLOW_PKG_in_header_package846); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PKG32_tree = (Object)adaptor.create(PKG32);
            adaptor.addChild(root_0, PKG32_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:124:13: ( FULL_ID | var )
            int alt6=2;
            switch ( input.LA(1) ) {
            case FULL_ID:
                {
                alt6=1;
                }
                break;
            case TO:
            case PKG:
            case SYNTAX:
            case IMPORT:
            case OPTION:
            case MESSAGE:
            case SERVICE:
            case ENUM:
            case REQUIRED:
            case OPTIONAL:
            case REPEATED:
            case EXTENSIONS:
            case EXTEND:
            case GROUP:
            case RPC:
            case RETURNS:
            case INT32:
            case INT64:
            case UINT32:
            case UINT64:
            case SINT32:
            case SINT64:
            case FIXED32:
            case FIXED64:
            case SFIXED32:
            case SFIXED64:
            case FLOAT:
            case DOUBLE:
            case BOOL:
            case STRING:
            case BYTES:
            case DEFAULT:
            case MAX:
            case VOID:
            case ID:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:124:14: FULL_ID
                    {
                    FULL_ID33=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_header_package849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FULL_ID33_tree = (Object)adaptor.create(FULL_ID33);
                    adaptor.addChild(root_0, FULL_ID33_tree);
                    }
                    if ( state.backtracking==0 ) {
                       value = (FULL_ID33!=null?FULL_ID33.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:124:51: var
                    {
                    pushFollow(FOLLOW_var_in_header_package855);
                    var34=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var34.getTree());
                    if ( state.backtracking==0 ) {
                       value = (var34!=null?input.toString(var34.start,var34.stop):null); 
                    }

                    }
                    break;

            }

            SEMICOLON35=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_header_package860); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          if(proto.getPackageName() != null)
                              throw new IllegalStateException("Multiple package definitions.");
                          
                          proto.setPackageName(value);
                          
                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "header_package"

    public static class header_import_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header_import"
    // com/dyuproject/protostuff/parser/ProtoParser.g:135:1: header_import[Proto proto] : IMPORT STRING_LITERAL SEMICOLON ;
    public final ProtoParser.header_import_return header_import(Proto proto) throws RecognitionException {
        ProtoParser.header_import_return retval = new ProtoParser.header_import_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT36=null;
        Token STRING_LITERAL37=null;
        Token SEMICOLON38=null;

        Object IMPORT36_tree=null;
        Object STRING_LITERAL37_tree=null;
        Object SEMICOLON38_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:136:5: ( IMPORT STRING_LITERAL SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:136:9: IMPORT STRING_LITERAL SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            IMPORT36=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_header_import888); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT36_tree = (Object)adaptor.create(IMPORT36);
            adaptor.addChild(root_0, IMPORT36_tree);
            }
            STRING_LITERAL37=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_header_import890); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL37_tree = (Object)adaptor.create(STRING_LITERAL37);
            adaptor.addChild(root_0, STRING_LITERAL37_tree);
            }
            SEMICOLON38=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_header_import892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          proto.importProto(getStringFromStringLiteral((STRING_LITERAL37!=null?STRING_LITERAL37.getText():null)));
                          
                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "header_import"

    public static class option_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option_entry"
    // com/dyuproject/protostuff/parser/ProtoParser.g:144:1: option_entry[Proto proto, HasOptions ho] : OPTION ( LEFTPAREN )? k= ( ID | FULL_ID ) ( RIGHTPAREN )? ASSIGN (id= ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL ) SEMICOLON ;
    public final ProtoParser.option_entry_return option_entry(Proto proto, HasOptions ho) throws RecognitionException {
        ProtoParser.option_entry_return retval = new ProtoParser.option_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token id=null;
        Token fid=null;
        Token OPTION39=null;
        Token LEFTPAREN40=null;
        Token RIGHTPAREN41=null;
        Token ASSIGN42=null;
        Token NUMFLOAT43=null;
        Token NUMINT44=null;
        Token NUMDOUBLE45=null;
        Token TRUE46=null;
        Token FALSE47=null;
        Token STRING_LITERAL48=null;
        Token SEMICOLON49=null;

        Object k_tree=null;
        Object id_tree=null;
        Object fid_tree=null;
        Object OPTION39_tree=null;
        Object LEFTPAREN40_tree=null;
        Object RIGHTPAREN41_tree=null;
        Object ASSIGN42_tree=null;
        Object NUMFLOAT43_tree=null;
        Object NUMINT44_tree=null;
        Object NUMDOUBLE45_tree=null;
        Object TRUE46_tree=null;
        Object FALSE47_tree=null;
        Object STRING_LITERAL48_tree=null;
        Object SEMICOLON49_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:145:5: ( OPTION ( LEFTPAREN )? k= ( ID | FULL_ID ) ( RIGHTPAREN )? ASSIGN (id= ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL ) SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:145:9: OPTION ( LEFTPAREN )? k= ( ID | FULL_ID ) ( RIGHTPAREN )? ASSIGN (id= ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            OPTION39=(Token)match(input,OPTION,FOLLOW_OPTION_in_option_entry916); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPTION39_tree = (Object)adaptor.create(OPTION39);
            adaptor.addChild(root_0, OPTION39_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:145:16: ( LEFTPAREN )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case LEFTPAREN:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:145:16: LEFTPAREN
                    {
                    LEFTPAREN40=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_option_entry918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LEFTPAREN40_tree = (Object)adaptor.create(LEFTPAREN40);
                    adaptor.addChild(root_0, LEFTPAREN40_tree);
                    }

                    }
                    break;

            }

            k=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=FULL_ID) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(k));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // com/dyuproject/protostuff/parser/ProtoParser.g:145:42: ( RIGHTPAREN )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case RIGHTPAREN:
                    {
                    alt8=1;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:145:42: RIGHTPAREN
                    {
                    RIGHTPAREN41=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_option_entry929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RIGHTPAREN41_tree = (Object)adaptor.create(RIGHTPAREN41);
                    adaptor.addChild(root_0, RIGHTPAREN41_tree);
                    }

                    }
                    break;

            }

            ASSIGN42=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_option_entry932); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN42_tree = (Object)adaptor.create(ASSIGN42);
            adaptor.addChild(root_0, ASSIGN42_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:145:61: (id= ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL )
            int alt9=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case FULL_ID:
                {
                alt9=2;
                }
                break;
            case NUMFLOAT:
                {
                alt9=3;
                }
                break;
            case NUMINT:
                {
                alt9=4;
                }
                break;
            case NUMDOUBLE:
                {
                alt9=5;
                }
                break;
            case TRUE:
                {
                alt9=6;
                }
                break;
            case FALSE:
                {
                alt9=7;
                }
                break;
            case STRING_LITERAL:
                {
                alt9=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:146:17: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_option_entry954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    id_tree = (Object)adaptor.create(id);
                    adaptor.addChild(root_0, id_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putStandardOption((k!=null?k.getText():null), (id!=null?id.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:147:17: fid= FULL_ID
                    {
                    fid=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_option_entry976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    fid_tree = (Object)adaptor.create(fid);
                    adaptor.addChild(root_0, fid_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putStandardOption((k!=null?k.getText():null), (fid!=null?fid.getText():null)); 
                    }

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:148:17: NUMFLOAT
                    {
                    NUMFLOAT43=(Token)match(input,NUMFLOAT,FOLLOW_NUMFLOAT_in_option_entry996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMFLOAT43_tree = (Object)adaptor.create(NUMFLOAT43);
                    adaptor.addChild(root_0, NUMFLOAT43_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putExtraOption((k!=null?k.getText():null), Float.valueOf((NUMFLOAT43!=null?NUMFLOAT43.getText():null))); 
                    }

                    }
                    break;
                case 4 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:149:17: NUMINT
                    {
                    NUMINT44=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_option_entry1016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMINT44_tree = (Object)adaptor.create(NUMINT44);
                    adaptor.addChild(root_0, NUMINT44_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putExtraOption((k!=null?k.getText():null), Integer.valueOf((NUMINT44!=null?NUMINT44.getText():null))); 
                    }

                    }
                    break;
                case 5 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:150:17: NUMDOUBLE
                    {
                    NUMDOUBLE45=(Token)match(input,NUMDOUBLE,FOLLOW_NUMDOUBLE_in_option_entry1036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMDOUBLE45_tree = (Object)adaptor.create(NUMDOUBLE45);
                    adaptor.addChild(root_0, NUMDOUBLE45_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putExtraOption((k!=null?k.getText():null), Double.valueOf((NUMDOUBLE45!=null?NUMDOUBLE45.getText():null))); 
                    }

                    }
                    break;
                case 6 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:151:17: TRUE
                    {
                    TRUE46=(Token)match(input,TRUE,FOLLOW_TRUE_in_option_entry1056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE46_tree = (Object)adaptor.create(TRUE46);
                    adaptor.addChild(root_0, TRUE46_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putExtraOption((k!=null?k.getText():null), Boolean.TRUE); 
                    }

                    }
                    break;
                case 7 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:152:17: FALSE
                    {
                    FALSE47=(Token)match(input,FALSE,FOLLOW_FALSE_in_option_entry1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE47_tree = (Object)adaptor.create(FALSE47);
                    adaptor.addChild(root_0, FALSE47_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putExtraOption((k!=null?k.getText():null), Boolean.FALSE); 
                    }

                    }
                    break;
                case 8 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:153:17: STRING_LITERAL
                    {
                    STRING_LITERAL48=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_option_entry1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL48_tree = (Object)adaptor.create(STRING_LITERAL48);
                    adaptor.addChild(root_0, STRING_LITERAL48_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ho.putExtraOption((k!=null?k.getText():null), getStringFromStringLiteral((STRING_LITERAL48!=null?STRING_LITERAL48.getText():null))); 
                    }

                    }
                    break;

            }

            SEMICOLON49=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_option_entry1110); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option_entry"

    public static class message_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:160:1: message_block[Proto proto, Message parent] : MESSAGE ID LEFTCURLY ( message_body[proto, message] )* RIGHTCURLY ;
    public final ProtoParser.message_block_return message_block(Proto proto, Message parent) throws RecognitionException {
        ProtoParser.message_block_return retval = new ProtoParser.message_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MESSAGE50=null;
        Token ID51=null;
        Token LEFTCURLY52=null;
        Token RIGHTCURLY54=null;
        ProtoParser.message_body_return message_body53 = null;


        Object MESSAGE50_tree=null;
        Object ID51_tree=null;
        Object LEFTCURLY52_tree=null;
        Object RIGHTCURLY54_tree=null;


            Message message = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:164:5: ( MESSAGE ID LEFTCURLY ( message_body[proto, message] )* RIGHTCURLY )
            // com/dyuproject/protostuff/parser/ProtoParser.g:164:9: MESSAGE ID LEFTCURLY ( message_body[proto, message] )* RIGHTCURLY
            {
            root_0 = (Object)adaptor.nil();

            MESSAGE50=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_block1143); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MESSAGE50_tree = (Object)adaptor.create(MESSAGE50);
            adaptor.addChild(root_0, MESSAGE50_tree);
            }
            ID51=(Token)match(input,ID,FOLLOW_ID_in_message_block1145); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID51_tree = (Object)adaptor.create(ID51);
            adaptor.addChild(root_0, ID51_tree);
            }
            if ( state.backtracking==0 ) {
               
                          message = new Message((ID51!=null?ID51.getText():null));
                          if(parent==null)
                              proto.addMessage(message);
                          else
                              parent.addNestedMessage(message);
                              
                          proto.addAnnotationsTo(message);
                      
            }
            LEFTCURLY52=(Token)match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_message_block1158); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTCURLY52_tree = (Object)adaptor.create(LEFTCURLY52);
            adaptor.addChild(root_0, LEFTCURLY52_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:173:19: ( message_body[proto, message] )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case AT:
                case OPTION:
                case MESSAGE:
                case ENUM:
                case REQUIRED:
                case OPTIONAL:
                case REPEATED:
                case EXTENSIONS:
                case EXTEND:
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:173:20: message_body[proto, message]
            	    {
            	    pushFollow(FOLLOW_message_body_in_message_block1161);
            	    message_body53=message_body(proto, message);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_body53.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            RIGHTCURLY54=(Token)match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_message_block1166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTCURLY54_tree = (Object)adaptor.create(RIGHTCURLY54);
            adaptor.addChild(root_0, RIGHTCURLY54_tree);
            }
            if ( state.backtracking==0 ) {

                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_block"

    public static class message_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_body"
    // com/dyuproject/protostuff/parser/ProtoParser.g:179:1: message_body[Proto proto, Message message] : ( message_block[proto, message] | message_field[proto, message] | enum_block[proto, message] | extend_block[proto, message] | extensions_range[proto, message] | annotation_entry[proto] | option_entry[proto, message] );
    public final ProtoParser.message_body_return message_body(Proto proto, Message message) throws RecognitionException {
        ProtoParser.message_body_return retval = new ProtoParser.message_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProtoParser.message_block_return message_block55 = null;

        ProtoParser.message_field_return message_field56 = null;

        ProtoParser.enum_block_return enum_block57 = null;

        ProtoParser.extend_block_return extend_block58 = null;

        ProtoParser.extensions_range_return extensions_range59 = null;

        ProtoParser.annotation_entry_return annotation_entry60 = null;

        ProtoParser.option_entry_return option_entry61 = null;



        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:180:5: ( message_block[proto, message] | message_field[proto, message] | enum_block[proto, message] | extend_block[proto, message] | extensions_range[proto, message] | annotation_entry[proto] | option_entry[proto, message] )
            int alt11=7;
            switch ( input.LA(1) ) {
            case MESSAGE:
                {
                alt11=1;
                }
                break;
            case REQUIRED:
            case OPTIONAL:
            case REPEATED:
                {
                alt11=2;
                }
                break;
            case ENUM:
                {
                alt11=3;
                }
                break;
            case EXTEND:
                {
                alt11=4;
                }
                break;
            case EXTENSIONS:
                {
                alt11=5;
                }
                break;
            case AT:
                {
                alt11=6;
                }
                break;
            case OPTION:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:180:9: message_block[proto, message]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_message_block_in_message_body1189);
                    message_block55=message_block(proto, message);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_block55.getTree());

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:181:9: message_field[proto, message]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_body1200);
                    message_field56=message_field(proto, message);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_field56.getTree());

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:182:9: enum_block[proto, message]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enum_block_in_message_body1211);
                    enum_block57=enum_block(proto, message);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_block57.getTree());

                    }
                    break;
                case 4 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:183:9: extend_block[proto, message]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_extend_block_in_message_body1222);
                    extend_block58=extend_block(proto, message);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extend_block58.getTree());

                    }
                    break;
                case 5 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:184:9: extensions_range[proto, message]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_extensions_range_in_message_body1233);
                    extensions_range59=extensions_range(proto, message);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extensions_range59.getTree());

                    }
                    break;
                case 6 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:185:9: annotation_entry[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_annotation_entry_in_message_body1244);
                    annotation_entry60=annotation_entry(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_entry60.getTree());

                    }
                    break;
                case 7 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:186:9: option_entry[proto, message]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_option_entry_in_message_body1255);
                    option_entry61=option_entry(proto, message);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, option_entry61.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_body"

    public static class extensions_range_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extensions_range"
    // com/dyuproject/protostuff/parser/ProtoParser.g:189:1: extensions_range[Proto proto, Message message] : EXTENSIONS f= NUMINT ( TO (l= NUMINT | MAX ) )? SEMICOLON ;
    public final ProtoParser.extensions_range_return extensions_range(Proto proto, Message message) throws RecognitionException {
        ProtoParser.extensions_range_return retval = new ProtoParser.extensions_range_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token f=null;
        Token l=null;
        Token EXTENSIONS62=null;
        Token TO63=null;
        Token MAX64=null;
        Token SEMICOLON65=null;

        Object f_tree=null;
        Object l_tree=null;
        Object EXTENSIONS62_tree=null;
        Object TO63_tree=null;
        Object MAX64_tree=null;
        Object SEMICOLON65_tree=null;


          int first = -1;
          int last = -1;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:194:5: ( EXTENSIONS f= NUMINT ( TO (l= NUMINT | MAX ) )? SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:194:9: EXTENSIONS f= NUMINT ( TO (l= NUMINT | MAX ) )? SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            EXTENSIONS62=(Token)match(input,EXTENSIONS,FOLLOW_EXTENSIONS_in_extensions_range1286); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENSIONS62_tree = (Object)adaptor.create(EXTENSIONS62);
            adaptor.addChild(root_0, EXTENSIONS62_tree);
            }
            f=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_extensions_range1290); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            f_tree = (Object)adaptor.create(f);
            adaptor.addChild(root_0, f_tree);
            }
            if ( state.backtracking==0 ) {
               first = Integer.parseInt((f!=null?f.getText():null)); last = first;
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:195:9: ( TO (l= NUMINT | MAX ) )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case TO:
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:195:11: TO (l= NUMINT | MAX )
                    {
                    TO63=(Token)match(input,TO,FOLLOW_TO_in_extensions_range1304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TO63_tree = (Object)adaptor.create(TO63);
                    adaptor.addChild(root_0, TO63_tree);
                    }
                    // com/dyuproject/protostuff/parser/ProtoParser.g:195:14: (l= NUMINT | MAX )
                    int alt12=2;
                    switch ( input.LA(1) ) {
                    case NUMINT:
                        {
                        alt12=1;
                        }
                        break;
                    case MAX:
                        {
                        alt12=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // com/dyuproject/protostuff/parser/ProtoParser.g:195:16: l= NUMINT
                            {
                            l=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_extensions_range1310); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            l_tree = (Object)adaptor.create(l);
                            adaptor.addChild(root_0, l_tree);
                            }
                            if ( state.backtracking==0 ) {
                               last = Integer.parseInt((l!=null?l.getText():null)); 
                            }

                            }
                            break;
                        case 2 :
                            // com/dyuproject/protostuff/parser/ProtoParser.g:195:65: MAX
                            {
                            MAX64=(Token)match(input,MAX,FOLLOW_MAX_in_extensions_range1316); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MAX64_tree = (Object)adaptor.create(MAX64);
                            adaptor.addChild(root_0, MAX64_tree);
                            }
                            if ( state.backtracking==0 ) {
                              last = 536870911; 
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            SEMICOLON65=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_extensions_range1333); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          message.defineExtensionRange(first, last);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extensions_range"

    public static class message_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_field"
    // com/dyuproject/protostuff/parser/ProtoParser.g:201:1: message_field[Proto proto, HasFields message] : ( OPTIONAL | REQUIRED | REPEATED ) field_type[proto, message, fieldHolder] var ASSIGN NUMINT ( field_options[proto, message, fieldHolder.field] )? ( SEMICOLON | ignore_block ) ;
    public final ProtoParser.message_field_return message_field(Proto proto, HasFields message) throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPTIONAL66=null;
        Token REQUIRED67=null;
        Token REPEATED68=null;
        Token ASSIGN71=null;
        Token NUMINT72=null;
        Token SEMICOLON74=null;
        ProtoParser.field_type_return field_type69 = null;

        ProtoParser.var_return var70 = null;

        ProtoParser.field_options_return field_options73 = null;

        ProtoParser.ignore_block_return ignore_block75 = null;


        Object OPTIONAL66_tree=null;
        Object REQUIRED67_tree=null;
        Object REPEATED68_tree=null;
        Object ASSIGN71_tree=null;
        Object NUMINT72_tree=null;
        Object SEMICOLON74_tree=null;


            Field.Modifier modifier = null;
            FieldHolder fieldHolder = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:206:5: ( ( OPTIONAL | REQUIRED | REPEATED ) field_type[proto, message, fieldHolder] var ASSIGN NUMINT ( field_options[proto, message, fieldHolder.field] )? ( SEMICOLON | ignore_block ) )
            // com/dyuproject/protostuff/parser/ProtoParser.g:206:9: ( OPTIONAL | REQUIRED | REPEATED ) field_type[proto, message, fieldHolder] var ASSIGN NUMINT ( field_options[proto, message, fieldHolder.field] )? ( SEMICOLON | ignore_block )
            {
            root_0 = (Object)adaptor.nil();

            // com/dyuproject/protostuff/parser/ProtoParser.g:206:9: ( OPTIONAL | REQUIRED | REPEATED )
            int alt14=3;
            switch ( input.LA(1) ) {
            case OPTIONAL:
                {
                alt14=1;
                }
                break;
            case REQUIRED:
                {
                alt14=2;
                }
                break;
            case REPEATED:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:206:10: OPTIONAL
                    {
                    OPTIONAL66=(Token)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_message_field1367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPTIONAL66_tree = (Object)adaptor.create(OPTIONAL66);
                    adaptor.addChild(root_0, OPTIONAL66_tree);
                    }
                    if ( state.backtracking==0 ) {
                       modifier = Field.Modifier.OPTIONAL;  
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:207:13: REQUIRED
                    {
                    REQUIRED67=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_message_field1384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REQUIRED67_tree = (Object)adaptor.create(REQUIRED67);
                    adaptor.addChild(root_0, REQUIRED67_tree);
                    }
                    if ( state.backtracking==0 ) {
                       modifier = Field.Modifier.REQUIRED; 
                    }

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:208:13: REPEATED
                    {
                    REPEATED68=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_message_field1401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REPEATED68_tree = (Object)adaptor.create(REPEATED68);
                    adaptor.addChild(root_0, REPEATED68_tree);
                    }
                    if ( state.backtracking==0 ) {
                       modifier = Field.Modifier.REPEATED; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          fieldHolder = new FieldHolder();
                      
            }
            pushFollow(FOLLOW_field_type_in_message_field1416);
            field_type69=field_type(proto, message, fieldHolder);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, field_type69.getTree());
            pushFollow(FOLLOW_var_in_message_field1428);
            var70=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var70.getTree());
            ASSIGN71=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_message_field1430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN71_tree = (Object)adaptor.create(ASSIGN71);
            adaptor.addChild(root_0, ASSIGN71_tree);
            }
            NUMINT72=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_message_field1432); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMINT72_tree = (Object)adaptor.create(NUMINT72);
            adaptor.addChild(root_0, NUMINT72_tree);
            }
            if ( state.backtracking==0 ) {

                          if(fieldHolder.field != null) {
                              fieldHolder.field.modifier = modifier;
                              fieldHolder.field.name = (var70!=null?input.toString(var70.start,var70.stop):null);
                              fieldHolder.field.number = Integer.parseInt((NUMINT72!=null?NUMINT72.getText():null));
                          }
                      
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:219:9: ( field_options[proto, message, fieldHolder.field] )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case LEFTSQUARE:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:219:10: field_options[proto, message, fieldHolder.field]
                    {
                    pushFollow(FOLLOW_field_options_in_message_field1446);
                    field_options73=field_options(proto, message, fieldHolder.field);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_options73.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          if(fieldHolder.field != null) {
                              proto.addAnnotationsTo(fieldHolder.field, message.getEnclosingNamespace());
                              message.addField(fieldHolder.field);
                          }
                      
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:225:9: ( SEMICOLON | ignore_block )
            int alt16=2;
            switch ( input.LA(1) ) {
            case SEMICOLON:
                {
                alt16=1;
                }
                break;
            case LEFTCURLY:
                {
                alt16=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:225:10: SEMICOLON
                    {
                    SEMICOLON74=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_message_field1462); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:225:23: ignore_block
                    {
                    pushFollow(FOLLOW_ignore_block_in_message_field1467);
                    ignore_block75=ignore_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ignore_block75.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_field"

    public static class field_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_type"
    // com/dyuproject/protostuff/parser/ProtoParser.g:228:1: field_type[Proto proto, HasFields message, FieldHolder fieldHolder] : ( INT32 | UINT32 | SINT32 | FIXED32 | SFIXED32 | INT64 | UINT64 | SINT64 | FIXED64 | SFIXED64 | FLOAT | DOUBLE | BOOL | STRING | BYTES | GROUP | FULL_ID | ID );
    public final ProtoParser.field_type_return field_type(Proto proto, HasFields message, FieldHolder fieldHolder) throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT3276=null;
        Token UINT3277=null;
        Token SINT3278=null;
        Token FIXED3279=null;
        Token SFIXED3280=null;
        Token INT6481=null;
        Token UINT6482=null;
        Token SINT6483=null;
        Token FIXED6484=null;
        Token SFIXED6485=null;
        Token FLOAT86=null;
        Token DOUBLE87=null;
        Token BOOL88=null;
        Token STRING89=null;
        Token BYTES90=null;
        Token GROUP91=null;
        Token FULL_ID92=null;
        Token ID93=null;

        Object INT3276_tree=null;
        Object UINT3277_tree=null;
        Object SINT3278_tree=null;
        Object FIXED3279_tree=null;
        Object SFIXED3280_tree=null;
        Object INT6481_tree=null;
        Object UINT6482_tree=null;
        Object SINT6483_tree=null;
        Object FIXED6484_tree=null;
        Object SFIXED6485_tree=null;
        Object FLOAT86_tree=null;
        Object DOUBLE87_tree=null;
        Object BOOL88_tree=null;
        Object STRING89_tree=null;
        Object BYTES90_tree=null;
        Object GROUP91_tree=null;
        Object FULL_ID92_tree=null;
        Object ID93_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:229:5: ( INT32 | UINT32 | SINT32 | FIXED32 | SFIXED32 | INT64 | UINT64 | SINT64 | FIXED64 | SFIXED64 | FLOAT | DOUBLE | BOOL | STRING | BYTES | GROUP | FULL_ID | ID )
            int alt17=18;
            switch ( input.LA(1) ) {
            case INT32:
                {
                alt17=1;
                }
                break;
            case UINT32:
                {
                alt17=2;
                }
                break;
            case SINT32:
                {
                alt17=3;
                }
                break;
            case FIXED32:
                {
                alt17=4;
                }
                break;
            case SFIXED32:
                {
                alt17=5;
                }
                break;
            case INT64:
                {
                alt17=6;
                }
                break;
            case UINT64:
                {
                alt17=7;
                }
                break;
            case SINT64:
                {
                alt17=8;
                }
                break;
            case FIXED64:
                {
                alt17=9;
                }
                break;
            case SFIXED64:
                {
                alt17=10;
                }
                break;
            case FLOAT:
                {
                alt17=11;
                }
                break;
            case DOUBLE:
                {
                alt17=12;
                }
                break;
            case BOOL:
                {
                alt17=13;
                }
                break;
            case STRING:
                {
                alt17=14;
                }
                break;
            case BYTES:
                {
                alt17=15;
                }
                break;
            case GROUP:
                {
                alt17=16;
                }
                break;
            case FULL_ID:
                {
                alt17=17;
                }
                break;
            case ID:
                {
                alt17=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:229:9: INT32
                    {
                    root_0 = (Object)adaptor.nil();

                    INT3276=(Token)match(input,INT32,FOLLOW_INT32_in_field_type1493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT3276_tree = (Object)adaptor.create(INT3276);
                    adaptor.addChild(root_0, INT3276_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Int32()); 
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:230:9: UINT32
                    {
                    root_0 = (Object)adaptor.nil();

                    UINT3277=(Token)match(input,UINT32,FOLLOW_UINT32_in_field_type1505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT3277_tree = (Object)adaptor.create(UINT3277);
                    adaptor.addChild(root_0, UINT3277_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.UInt32()); 
                    }

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:231:9: SINT32
                    {
                    root_0 = (Object)adaptor.nil();

                    SINT3278=(Token)match(input,SINT32,FOLLOW_SINT32_in_field_type1517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SINT3278_tree = (Object)adaptor.create(SINT3278);
                    adaptor.addChild(root_0, SINT3278_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.SInt32()); 
                    }

                    }
                    break;
                case 4 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:232:9: FIXED32
                    {
                    root_0 = (Object)adaptor.nil();

                    FIXED3279=(Token)match(input,FIXED32,FOLLOW_FIXED32_in_field_type1529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FIXED3279_tree = (Object)adaptor.create(FIXED3279);
                    adaptor.addChild(root_0, FIXED3279_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Fixed32()); 
                    }

                    }
                    break;
                case 5 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:233:9: SFIXED32
                    {
                    root_0 = (Object)adaptor.nil();

                    SFIXED3280=(Token)match(input,SFIXED32,FOLLOW_SFIXED32_in_field_type1541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SFIXED3280_tree = (Object)adaptor.create(SFIXED3280);
                    adaptor.addChild(root_0, SFIXED3280_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.SFixed32()); 
                    }

                    }
                    break;
                case 6 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:234:9: INT64
                    {
                    root_0 = (Object)adaptor.nil();

                    INT6481=(Token)match(input,INT64,FOLLOW_INT64_in_field_type1553); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT6481_tree = (Object)adaptor.create(INT6481);
                    adaptor.addChild(root_0, INT6481_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Int64()); 
                    }

                    }
                    break;
                case 7 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:235:9: UINT64
                    {
                    root_0 = (Object)adaptor.nil();

                    UINT6482=(Token)match(input,UINT64,FOLLOW_UINT64_in_field_type1565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UINT6482_tree = (Object)adaptor.create(UINT6482);
                    adaptor.addChild(root_0, UINT6482_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.UInt64()); 
                    }

                    }
                    break;
                case 8 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:236:9: SINT64
                    {
                    root_0 = (Object)adaptor.nil();

                    SINT6483=(Token)match(input,SINT64,FOLLOW_SINT64_in_field_type1577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SINT6483_tree = (Object)adaptor.create(SINT6483);
                    adaptor.addChild(root_0, SINT6483_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.SInt64()); 
                    }

                    }
                    break;
                case 9 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:237:9: FIXED64
                    {
                    root_0 = (Object)adaptor.nil();

                    FIXED6484=(Token)match(input,FIXED64,FOLLOW_FIXED64_in_field_type1589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FIXED6484_tree = (Object)adaptor.create(FIXED6484);
                    adaptor.addChild(root_0, FIXED6484_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Fixed64()); 
                    }

                    }
                    break;
                case 10 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:238:9: SFIXED64
                    {
                    root_0 = (Object)adaptor.nil();

                    SFIXED6485=(Token)match(input,SFIXED64,FOLLOW_SFIXED64_in_field_type1601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SFIXED6485_tree = (Object)adaptor.create(SFIXED6485);
                    adaptor.addChild(root_0, SFIXED6485_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.SFixed64()); 
                    }

                    }
                    break;
                case 11 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:239:9: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT86=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_field_type1613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT86_tree = (Object)adaptor.create(FLOAT86);
                    adaptor.addChild(root_0, FLOAT86_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Float()); 
                    }

                    }
                    break;
                case 12 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:240:9: DOUBLE
                    {
                    root_0 = (Object)adaptor.nil();

                    DOUBLE87=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_field_type1625); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE87_tree = (Object)adaptor.create(DOUBLE87);
                    adaptor.addChild(root_0, DOUBLE87_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Double()); 
                    }

                    }
                    break;
                case 13 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:241:9: BOOL
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOL88=(Token)match(input,BOOL,FOLLOW_BOOL_in_field_type1637); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOL88_tree = (Object)adaptor.create(BOOL88);
                    adaptor.addChild(root_0, BOOL88_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Bool()); 
                    }

                    }
                    break;
                case 14 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:242:9: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_field_type1649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING89_tree = (Object)adaptor.create(STRING89);
                    adaptor.addChild(root_0, STRING89_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.String()); 
                    }

                    }
                    break;
                case 15 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:243:9: BYTES
                    {
                    root_0 = (Object)adaptor.nil();

                    BYTES90=(Token)match(input,BYTES,FOLLOW_BYTES_in_field_type1661); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTES90_tree = (Object)adaptor.create(BYTES90);
                    adaptor.addChild(root_0, BYTES90_tree);
                    }
                    if ( state.backtracking==0 ) {
                       fieldHolder.setField(new Field.Bytes()); 
                    }

                    }
                    break;
                case 16 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:244:9: GROUP
                    {
                    root_0 = (Object)adaptor.nil();

                    GROUP91=(Token)match(input,GROUP,FOLLOW_GROUP_in_field_type1673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GROUP91_tree = (Object)adaptor.create(GROUP91);
                    adaptor.addChild(root_0, GROUP91_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  String suffix = proto.getFile()==null ? "" : " of " + proto.getFile().getName();
                                  warn("'group' not supported @ line " + (GROUP91!=null?GROUP91.getLine():0) + suffix);
                              
                    }

                    }
                    break;
                case 17 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:248:9: FULL_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    FULL_ID92=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_field_type1685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FULL_ID92_tree = (Object)adaptor.create(FULL_ID92);
                    adaptor.addChild(root_0, FULL_ID92_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  String fullType = (FULL_ID92!=null?FULL_ID92.getText():null);
                                  int lastDot = fullType.lastIndexOf('.');
                                  String packageName = fullType.substring(0, lastDot); 
                                  String type = fullType.substring(lastDot+1);
                                  fieldHolder.setField(new Field.Reference(packageName, type, message));
                              
                    }

                    }
                    break;
                case 18 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:255:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID93=(Token)match(input,ID,FOLLOW_ID_in_field_type1697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID93_tree = (Object)adaptor.create(ID93);
                    adaptor.addChild(root_0, ID93_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                                  String type = (ID93!=null?ID93.getText():null);
                                  fieldHolder.setField(new Field.Reference(null, type, message));
                              
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_type"

    public static class field_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_options"
    // com/dyuproject/protostuff/parser/ProtoParser.g:261:1: field_options[Proto proto, HasFields message, Field field] : LEFTSQUARE field_options_keyval[proto, message, field] ( COMMA field_options_keyval[proto, message, field] )* RIGHTSQUARE ;
    public final ProtoParser.field_options_return field_options(Proto proto, HasFields message, Field field) throws RecognitionException {
        ProtoParser.field_options_return retval = new ProtoParser.field_options_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFTSQUARE94=null;
        Token COMMA96=null;
        Token RIGHTSQUARE98=null;
        ProtoParser.field_options_keyval_return field_options_keyval95 = null;

        ProtoParser.field_options_keyval_return field_options_keyval97 = null;


        Object LEFTSQUARE94_tree=null;
        Object COMMA96_tree=null;
        Object RIGHTSQUARE98_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:262:5: ( LEFTSQUARE field_options_keyval[proto, message, field] ( COMMA field_options_keyval[proto, message, field] )* RIGHTSQUARE )
            // com/dyuproject/protostuff/parser/ProtoParser.g:262:9: LEFTSQUARE field_options_keyval[proto, message, field] ( COMMA field_options_keyval[proto, message, field] )* RIGHTSQUARE
            {
            root_0 = (Object)adaptor.nil();

            LEFTSQUARE94=(Token)match(input,LEFTSQUARE,FOLLOW_LEFTSQUARE_in_field_options1724); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTSQUARE94_tree = (Object)adaptor.create(LEFTSQUARE94);
            adaptor.addChild(root_0, LEFTSQUARE94_tree);
            }
            pushFollow(FOLLOW_field_options_keyval_in_field_options1726);
            field_options_keyval95=field_options_keyval(proto, message, field);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, field_options_keyval95.getTree());
            // com/dyuproject/protostuff/parser/ProtoParser.g:263:9: ( COMMA field_options_keyval[proto, message, field] )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:263:10: COMMA field_options_keyval[proto, message, field]
            	    {
            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_field_options1739); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA96_tree = (Object)adaptor.create(COMMA96);
            	    adaptor.addChild(root_0, COMMA96_tree);
            	    }
            	    pushFollow(FOLLOW_field_options_keyval_in_field_options1741);
            	    field_options_keyval97=field_options_keyval(proto, message, field);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_options_keyval97.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            RIGHTSQUARE98=(Token)match(input,RIGHTSQUARE,FOLLOW_RIGHTSQUARE_in_field_options1746); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTSQUARE98_tree = (Object)adaptor.create(RIGHTSQUARE98);
            adaptor.addChild(root_0, RIGHTSQUARE98_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_options"

    public static class field_options_keyval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_options_keyval"
    // com/dyuproject/protostuff/parser/ProtoParser.g:266:1: field_options_keyval[Proto proto, HasFields message, Field field] : key= ( DEFAULT | ID ) ASSIGN ( STRING_LITERAL | NUMFLOAT | NUMINT | NUMDOUBLE | HEX | OCTAL | TRUE | FALSE | val= ID | FULL_ID | EXP | signed_constant[proto, message, field, $key.text] ) ;
    public final ProtoParser.field_options_keyval_return field_options_keyval(Proto proto, HasFields message, Field field) throws RecognitionException {
        ProtoParser.field_options_keyval_return retval = new ProtoParser.field_options_keyval_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token key=null;
        Token val=null;
        Token ASSIGN99=null;
        Token STRING_LITERAL100=null;
        Token NUMFLOAT101=null;
        Token NUMINT102=null;
        Token NUMDOUBLE103=null;
        Token HEX104=null;
        Token OCTAL105=null;
        Token TRUE106=null;
        Token FALSE107=null;
        Token FULL_ID108=null;
        Token EXP109=null;
        ProtoParser.signed_constant_return signed_constant110 = null;


        Object key_tree=null;
        Object val_tree=null;
        Object ASSIGN99_tree=null;
        Object STRING_LITERAL100_tree=null;
        Object NUMFLOAT101_tree=null;
        Object NUMINT102_tree=null;
        Object NUMDOUBLE103_tree=null;
        Object HEX104_tree=null;
        Object OCTAL105_tree=null;
        Object TRUE106_tree=null;
        Object FALSE107_tree=null;
        Object FULL_ID108_tree=null;
        Object EXP109_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:267:5: (key= ( DEFAULT | ID ) ASSIGN ( STRING_LITERAL | NUMFLOAT | NUMINT | NUMDOUBLE | HEX | OCTAL | TRUE | FALSE | val= ID | FULL_ID | EXP | signed_constant[proto, message, field, $key.text] ) )
            // com/dyuproject/protostuff/parser/ProtoParser.g:267:9: key= ( DEFAULT | ID ) ASSIGN ( STRING_LITERAL | NUMFLOAT | NUMINT | NUMDOUBLE | HEX | OCTAL | TRUE | FALSE | val= ID | FULL_ID | EXP | signed_constant[proto, message, field, $key.text] )
            {
            root_0 = (Object)adaptor.nil();

            key=(Token)input.LT(1);
            if ( input.LA(1)==DEFAULT||input.LA(1)==ID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(key));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            ASSIGN99=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_field_options_keyval1779); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN99_tree = (Object)adaptor.create(ASSIGN99);
            adaptor.addChild(root_0, ASSIGN99_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:267:33: ( STRING_LITERAL | NUMFLOAT | NUMINT | NUMDOUBLE | HEX | OCTAL | TRUE | FALSE | val= ID | FULL_ID | EXP | signed_constant[proto, message, field, $key.text] )
            int alt19=12;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt19=1;
                }
                break;
            case NUMFLOAT:
                {
                alt19=2;
                }
                break;
            case NUMINT:
                {
                alt19=3;
                }
                break;
            case NUMDOUBLE:
                {
                alt19=4;
                }
                break;
            case HEX:
                {
                alt19=5;
                }
                break;
            case OCTAL:
                {
                alt19=6;
                }
                break;
            case TRUE:
                {
                alt19=7;
                }
                break;
            case FALSE:
                {
                alt19=8;
                }
                break;
            case ID:
                {
                alt19=9;
                }
                break;
            case FULL_ID:
                {
                alt19=10;
                }
                break;
            case EXP:
                {
                alt19=11;
                }
                break;
            case MINUS:
                {
                alt19=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:267:34: STRING_LITERAL
                    {
                    STRING_LITERAL100=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_field_options_keyval1782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL100_tree = (Object)adaptor.create(STRING_LITERAL100);
                    adaptor.addChild(root_0, STRING_LITERAL100_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.String)
                                          field.defaultValue = getStringFromStringLiteral((STRING_LITERAL100!=null?STRING_LITERAL100.getText():null));
                                      else if(field instanceof Field.Bytes)
                                          field.defaultValue = getBytesFromStringLiteral((STRING_LITERAL100!=null?STRING_LITERAL100.getText():null));
                                      else
                                          throw new IllegalStateException("Invalid string default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), getStringFromStringLiteral((STRING_LITERAL100!=null?STRING_LITERAL100.getText():null)));
                              
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:282:9: NUMFLOAT
                    {
                    NUMFLOAT101=(Token)match(input,NUMFLOAT,FOLLOW_NUMFLOAT_in_field_options_keyval1795); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMFLOAT101_tree = (Object)adaptor.create(NUMFLOAT101);
                    adaptor.addChild(root_0, NUMFLOAT101_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Float)
                                          field.defaultValue = Float.valueOf((NUMFLOAT101!=null?NUMFLOAT101.getText():null));
                                      else if(field instanceof Field.Double) 
                                          field.defaultValue = Double.valueOf((NUMFLOAT101!=null?NUMFLOAT101.getText():null));
                                      else
                                          throw new IllegalStateException("Invalid float default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), Float.valueOf((NUMFLOAT101!=null?NUMFLOAT101.getText():null)));
                              
                    }

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:297:9: NUMINT
                    {
                    NUMINT102=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_field_options_keyval1808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMINT102_tree = (Object)adaptor.create(NUMINT102);
                    adaptor.addChild(root_0, NUMINT102_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Number) {
                                          if(field.getClass().getSimpleName().endsWith("32"))
                                              field.defaultValue = Integer.valueOf((NUMINT102!=null?NUMINT102.getText():null));
                                          else if(field.getClass().getSimpleName().endsWith("64"))
                                              field.defaultValue = Long.valueOf((NUMINT102!=null?NUMINT102.getText():null));
                                          else if(field instanceof Field.Float)
                                              field.defaultValue = Float.valueOf((NUMINT102!=null?NUMINT102.getText():null));
                                          else if(field instanceof Field.Double) 
                                              field.defaultValue = Double.valueOf((NUMINT102!=null?NUMINT102.getText():null));
                                          else
                                              throw new IllegalStateException("Invalid numeric default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                      }
                                      else
                                          throw new IllegalStateException("Invalid numeric default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), Integer.valueOf((NUMINT102!=null?NUMINT102.getText():null)));
                              
                    }

                    }
                    break;
                case 4 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:320:9: NUMDOUBLE
                    {
                    NUMDOUBLE103=(Token)match(input,NUMDOUBLE,FOLLOW_NUMDOUBLE_in_field_options_keyval1820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMDOUBLE103_tree = (Object)adaptor.create(NUMDOUBLE103);
                    adaptor.addChild(root_0, NUMDOUBLE103_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");

                                      if(field instanceof Field.Float)
                                          field.defaultValue = Float.valueOf((NUMDOUBLE103!=null?NUMDOUBLE103.getText():null));
                                      else if(field instanceof Field.Double) 
                                          field.defaultValue = Double.valueOf((NUMDOUBLE103!=null?NUMDOUBLE103.getText():null));
                                      else
                                          throw new IllegalStateException("Invalid numeric default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), Double.valueOf((NUMDOUBLE103!=null?NUMDOUBLE103.getText():null)));
                              
                    }

                    }
                    break;
                case 5 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:335:9: HEX
                    {
                    HEX104=(Token)match(input,HEX,FOLLOW_HEX_in_field_options_keyval1832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX104_tree = (Object)adaptor.create(HEX104);
                    adaptor.addChild(root_0, HEX104_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Number) {
                                          if(field instanceof Field.Int32)
                                              field.defaultValue = new Integer(TextFormat.parseInt32((HEX104!=null?HEX104.getText():null)));
                                          else if(field instanceof Field.UInt32)
                                              field.defaultValue = new Integer(TextFormat.parseUInt32((HEX104!=null?HEX104.getText():null)));
                                          else if(field instanceof Field.Int64)
                                              field.defaultValue = new Long(TextFormat.parseInt64((HEX104!=null?HEX104.getText():null)));
                                          else if(field instanceof Field.UInt64)
                                              field.defaultValue = new Long(TextFormat.parseUInt64((HEX104!=null?HEX104.getText():null)));
                                          else if(field instanceof Field.Float)
                                              field.defaultValue = new Float(Long.decode((HEX104!=null?HEX104.getText():null)).floatValue());
                                          else if(field instanceof Field.Double) 
                                              field.defaultValue = new Double(Long.decode((HEX104!=null?HEX104.getText():null)).doubleValue());
                                      }
                                      else if(field instanceof Field.Bytes) {
                                          field.defaultValue = getBytesFromHexString((HEX104!=null?HEX104.getText():null));
                                      }
                                      else
                                          throw new IllegalStateException("Invalid numeric default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                      
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), (HEX104!=null?HEX104.getText():null));
                              
                    }

                    }
                    break;
                case 6 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:364:9: OCTAL
                    {
                    OCTAL105=(Token)match(input,OCTAL,FOLLOW_OCTAL_in_field_options_keyval1844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OCTAL105_tree = (Object)adaptor.create(OCTAL105);
                    adaptor.addChild(root_0, OCTAL105_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Number) {
                                          if(field instanceof Field.Int32)
                                              field.defaultValue = new Integer(TextFormat.parseInt32((OCTAL105!=null?OCTAL105.getText():null)));
                                          else if(field instanceof Field.UInt32)
                                              field.defaultValue = new Integer(TextFormat.parseUInt32((OCTAL105!=null?OCTAL105.getText():null)));
                                          else if(field instanceof Field.Int64)
                                              field.defaultValue = new Long(TextFormat.parseInt64((OCTAL105!=null?OCTAL105.getText():null)));
                                          else if(field instanceof Field.UInt64)
                                              field.defaultValue = new Long(TextFormat.parseUInt64((OCTAL105!=null?OCTAL105.getText():null)));
                                          else if(field instanceof Field.Float)
                                              field.defaultValue = new Float(Long.decode((OCTAL105!=null?OCTAL105.getText():null)).floatValue());
                                          else if(field instanceof Field.Double) 
                                              field.defaultValue = new Double(Long.decode((OCTAL105!=null?OCTAL105.getText():null)).doubleValue());
                                      }
                                      else
                                          throw new IllegalStateException("Invalid numeric default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), (OCTAL105!=null?OCTAL105.getText():null));
                              
                    }

                    }
                    break;
                case 7 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:389:9: TRUE
                    {
                    TRUE106=(Token)match(input,TRUE,FOLLOW_TRUE_in_field_options_keyval1856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE106_tree = (Object)adaptor.create(TRUE106);
                    adaptor.addChild(root_0, TRUE106_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Bool)
                                          field.defaultValue = Boolean.TRUE;
                                      else
                                          throw new IllegalStateException("invalid boolean default value for the non-boolean field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), Boolean.TRUE);
                              
                    }

                    }
                    break;
                case 8 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:402:9: FALSE
                    {
                    FALSE107=(Token)match(input,FALSE,FOLLOW_FALSE_in_field_options_keyval1872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE107_tree = (Object)adaptor.create(FALSE107);
                    adaptor.addChild(root_0, FALSE107_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Bool)
                                          field.defaultValue = Boolean.FALSE;
                                      else
                                          throw new IllegalStateException("invalid boolean default value for the non-boolean field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), Boolean.FALSE);
                              
                    }

                    }
                    break;
                case 9 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:415:9: val= ID
                    {
                    val=(Token)match(input,ID,FOLLOW_ID_in_field_options_keyval1886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  boolean refOption = false;
                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      String refName = (val!=null?val.getText():null);
                                      if(field instanceof Field.Reference)
                                          field.defaultValue = refName;
                                      else if(field instanceof Field.Float) {
                                          if("inf".equals(refName)) {
                                              field.defaultValue = Float.POSITIVE_INFINITY;
                                              field.defaultValueConstant = "Float.POSITIVE_INFINITY";
                                          }
                                          else if("nan".equals(refName)) {
                                              field.defaultValue = Float.NaN;
                                              field.defaultValueConstant = "Float.NaN";
                                          }
                                          else
                                              throw new IllegalStateException("Invalid float default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                      }
                                      else if(field instanceof Field.Double) {
                                          if("inf".equals(refName)) {
                                              field.defaultValue = Double.POSITIVE_INFINITY;
                                              field.defaultValueConstant = "Double.POSITIVE_INFINITY";
                                          }
                                          else if("nan".equals(refName)) {
                                              field.defaultValue = Double.NaN;
                                              field.defaultValueConstant = "Double.NaN";
                                          }
                                          else
                                              throw new IllegalStateException("Invalid double default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                      }   
                                      else {
                                          refOption = true;
                                          //throw new IllegalStateException("invalid field value '" + refName + "' for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                      }
                                  }
                                  else {
                                      refOption = true;
                                  }
                                  
                                  if(refOption)
                                      field.putStandardOption((key!=null?key.getText():null), (val!=null?val.getText():null));
                                  else
                                      field.putExtraOption((key!=null?key.getText():null), (val!=null?val.getText():null));
                              
                    }

                    }
                    break;
                case 10 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:462:9: FULL_ID
                    {
                    FULL_ID108=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_field_options_keyval1898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FULL_ID108_tree = (Object)adaptor.create(FULL_ID108);
                    adaptor.addChild(root_0, FULL_ID108_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  field.putStandardOption((key!=null?key.getText():null), (FULL_ID108!=null?FULL_ID108.getText():null));
                              
                    }

                    }
                    break;
                case 11 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:465:9: EXP
                    {
                    EXP109=(Token)match(input,EXP,FOLLOW_EXP_in_field_options_keyval1910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXP109_tree = (Object)adaptor.create(EXP109);
                    adaptor.addChild(root_0, EXP109_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  if("default".equals((key!=null?key.getText():null))) {
                                      if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                          throw new IllegalStateException("a field can only have a single default value");
                                      
                                      if(field instanceof Field.Float)
                                          field.defaultValue = Float.valueOf((EXP109!=null?EXP109.getText():null));
                                      else if(field instanceof Field.Double) 
                                          field.defaultValue = Double.valueOf((EXP109!=null?EXP109.getText():null));
                                      else
                                          throw new IllegalStateException("Invalid float default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                                  }
                                  
                                  field.putExtraOption((key!=null?key.getText():null), (EXP109!=null?EXP109.getText():null));
                              
                    }

                    }
                    break;
                case 12 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:480:9: signed_constant[proto, message, field, $key.text]
                    {
                    pushFollow(FOLLOW_signed_constant_in_field_options_keyval1922);
                    signed_constant110=signed_constant(proto, message, field, (key!=null?key.getText():null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, signed_constant110.getTree());
                    if ( state.backtracking==0 ) {

                                  field.putExtraOption((key!=null?key.getText():null), (signed_constant110!=null?input.toString(signed_constant110.start,signed_constant110.stop):null));
                              
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_options_keyval"

    public static class signed_constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_constant"
    // com/dyuproject/protostuff/parser/ProtoParser.g:486:1: signed_constant[Proto proto, HasFields message, Field field, String key] : MINUS ID ;
    public final ProtoParser.signed_constant_return signed_constant(Proto proto, HasFields message, Field field, String key) throws RecognitionException {
        ProtoParser.signed_constant_return retval = new ProtoParser.signed_constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS111=null;
        Token ID112=null;

        Object MINUS111_tree=null;
        Object ID112_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:487:5: ( MINUS ID )
            // com/dyuproject/protostuff/parser/ProtoParser.g:487:9: MINUS ID
            {
            root_0 = (Object)adaptor.nil();

            MINUS111=(Token)match(input,MINUS,FOLLOW_MINUS_in_signed_constant1960); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MINUS111_tree = (Object)adaptor.create(MINUS111);
            adaptor.addChild(root_0, MINUS111_tree);
            }
            ID112=(Token)match(input,ID,FOLLOW_ID_in_signed_constant1962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID112_tree = (Object)adaptor.create(ID112);
            adaptor.addChild(root_0, ID112_tree);
            }
            if ( state.backtracking==0 ) {

                          if("default".equals(key)) {
                              if(field.defaultValue!=null || field.modifier == Field.Modifier.REPEATED)
                                  throw new IllegalStateException("a field can only have a single default value");
                              
                              String refName = (ID112!=null?ID112.getText():null);
                              if(field instanceof Field.Float) {
                                  if("inf".equals(refName)) {
                                      field.defaultValue = Float.NEGATIVE_INFINITY;
                                      field.defaultValueConstant = "Float.NEGATIVE_INFINITY";
                                  }
                                  else
                                      throw new IllegalStateException("Invalid float default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                              }
                              else if(field instanceof Field.Double) {
                                  if("inf".equals(refName)) {
                                      field.defaultValue = Double.NEGATIVE_INFINITY;
                                      field.defaultValueConstant = "Double.NEGATIVE_INFINITY";
                                  }
                                  else
                                      throw new IllegalStateException("Invalid double default value for the field: " + field.getClass().getSimpleName() + " " + field.name);
                              }   
                              else
                                  throw new IllegalStateException("invalid field value '" + refName + "' for the field: " + field.getClass().getSimpleName() + " " + field.name);
                          }
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signed_constant"

    public static class enum_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enum_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:515:1: enum_block[Proto proto, Message message] : ENUM ID LEFTCURLY ( enum_body[proto, message, enumGroup] )* RIGHTCURLY ( ( SEMICOLON )? ) ;
    public final ProtoParser.enum_block_return enum_block(Proto proto, Message message) throws RecognitionException {
        ProtoParser.enum_block_return retval = new ProtoParser.enum_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM113=null;
        Token ID114=null;
        Token LEFTCURLY115=null;
        Token RIGHTCURLY117=null;
        Token SEMICOLON118=null;
        ProtoParser.enum_body_return enum_body116 = null;


        Object ENUM113_tree=null;
        Object ID114_tree=null;
        Object LEFTCURLY115_tree=null;
        Object RIGHTCURLY117_tree=null;
        Object SEMICOLON118_tree=null;


            EnumGroup enumGroup = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:519:5: ( ENUM ID LEFTCURLY ( enum_body[proto, message, enumGroup] )* RIGHTCURLY ( ( SEMICOLON )? ) )
            // com/dyuproject/protostuff/parser/ProtoParser.g:519:9: ENUM ID LEFTCURLY ( enum_body[proto, message, enumGroup] )* RIGHTCURLY ( ( SEMICOLON )? )
            {
            root_0 = (Object)adaptor.nil();

            ENUM113=(Token)match(input,ENUM,FOLLOW_ENUM_in_enum_block1994); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ENUM113_tree = (Object)adaptor.create(ENUM113);
            adaptor.addChild(root_0, ENUM113_tree);
            }
            ID114=(Token)match(input,ID,FOLLOW_ID_in_enum_block1996); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID114_tree = (Object)adaptor.create(ID114);
            adaptor.addChild(root_0, ID114_tree);
            }
            if ( state.backtracking==0 ) {
               
                          enumGroup = new EnumGroup((ID114!=null?ID114.getText():null)); 
                          if(message==null)
                              proto.addEnumGroup(enumGroup);
                          else
                              message.addNestedEnumGroup(enumGroup);
                          
                          proto.addAnnotationsTo(enumGroup);
                      
            }
            LEFTCURLY115=(Token)match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_enum_block2009); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTCURLY115_tree = (Object)adaptor.create(LEFTCURLY115);
            adaptor.addChild(root_0, LEFTCURLY115_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:528:19: ( enum_body[proto, message, enumGroup] )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case AT:
                case OPTION:
                case ID:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:528:20: enum_body[proto, message, enumGroup]
            	    {
            	    pushFollow(FOLLOW_enum_body_in_enum_block2012);
            	    enum_body116=enum_body(proto, message, enumGroup);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_body116.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            RIGHTCURLY117=(Token)match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_enum_block2017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTCURLY117_tree = (Object)adaptor.create(RIGHTCURLY117);
            adaptor.addChild(root_0, RIGHTCURLY117_tree);
            }
            if ( state.backtracking==0 ) {

                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:531:11: ( ( SEMICOLON )? )
            // com/dyuproject/protostuff/parser/ProtoParser.g:531:12: ( SEMICOLON )?
            {
            // com/dyuproject/protostuff/parser/ProtoParser.g:531:12: ( SEMICOLON )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt21=1;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:531:12: SEMICOLON
                    {
                    SEMICOLON118=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_enum_block2022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON118_tree = (Object)adaptor.create(SEMICOLON118);
                    adaptor.addChild(root_0, SEMICOLON118_tree);
                    }

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enum_block"

    public static class enum_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enum_body"
    // com/dyuproject/protostuff/parser/ProtoParser.g:534:1: enum_body[Proto proto, Message message, EnumGroup enumGroup] : ( enum_field[proto, message, enumGroup] | annotation_entry[proto] | option_entry[proto, enumGroup] );
    public final ProtoParser.enum_body_return enum_body(Proto proto, Message message, EnumGroup enumGroup) throws RecognitionException {
        ProtoParser.enum_body_return retval = new ProtoParser.enum_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProtoParser.enum_field_return enum_field119 = null;

        ProtoParser.annotation_entry_return annotation_entry120 = null;

        ProtoParser.option_entry_return option_entry121 = null;



        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:535:5: ( enum_field[proto, message, enumGroup] | annotation_entry[proto] | option_entry[proto, enumGroup] )
            int alt22=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt22=1;
                }
                break;
            case AT:
                {
                alt22=2;
                }
                break;
            case OPTION:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:535:9: enum_field[proto, message, enumGroup]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enum_field_in_enum_body2050);
                    enum_field119=enum_field(proto, message, enumGroup);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_field119.getTree());

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:536:9: annotation_entry[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_annotation_entry_in_enum_body2061);
                    annotation_entry120=annotation_entry(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_entry120.getTree());

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:537:9: option_entry[proto, enumGroup]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_option_entry_in_enum_body2072);
                    option_entry121=option_entry(proto, enumGroup);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, option_entry121.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enum_body"

    public static class enum_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enum_field"
    // com/dyuproject/protostuff/parser/ProtoParser.g:540:1: enum_field[Proto proto, Message message, EnumGroup enumGroup] : ID ASSIGN NUMINT SEMICOLON ;
    public final ProtoParser.enum_field_return enum_field(Proto proto, Message message, EnumGroup enumGroup) throws RecognitionException {
        ProtoParser.enum_field_return retval = new ProtoParser.enum_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID122=null;
        Token ASSIGN123=null;
        Token NUMINT124=null;
        Token SEMICOLON125=null;

        Object ID122_tree=null;
        Object ASSIGN123_tree=null;
        Object NUMINT124_tree=null;
        Object SEMICOLON125_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:541:5: ( ID ASSIGN NUMINT SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:541:9: ID ASSIGN NUMINT SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            ID122=(Token)match(input,ID,FOLLOW_ID_in_enum_field2094); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID122_tree = (Object)adaptor.create(ID122);
            adaptor.addChild(root_0, ID122_tree);
            }
            ASSIGN123=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enum_field2096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN123_tree = (Object)adaptor.create(ASSIGN123);
            adaptor.addChild(root_0, ASSIGN123_tree);
            }
            NUMINT124=(Token)match(input,NUMINT,FOLLOW_NUMINT_in_enum_field2098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMINT124_tree = (Object)adaptor.create(NUMINT124);
            adaptor.addChild(root_0, NUMINT124_tree);
            }
            SEMICOLON125=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_enum_field2100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          EnumGroup.Value v = new EnumGroup.Value((ID122!=null?ID122.getText():null), Integer.parseInt((NUMINT124!=null?NUMINT124.getText():null)));
                          enumGroup.add(v);
                          proto.addAnnotationsTo(v);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enum_field"

    public static class service_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "service_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:548:1: service_block[Proto proto] : SERVICE ID LEFTCURLY ( service_body[proto, service] )+ RIGHTCURLY ( ( SEMICOLON )? ) ;
    public final ProtoParser.service_block_return service_block(Proto proto) throws RecognitionException {
        ProtoParser.service_block_return retval = new ProtoParser.service_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SERVICE126=null;
        Token ID127=null;
        Token LEFTCURLY128=null;
        Token RIGHTCURLY130=null;
        Token SEMICOLON131=null;
        ProtoParser.service_body_return service_body129 = null;


        Object SERVICE126_tree=null;
        Object ID127_tree=null;
        Object LEFTCURLY128_tree=null;
        Object RIGHTCURLY130_tree=null;
        Object SEMICOLON131_tree=null;


            Service service = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:552:5: ( SERVICE ID LEFTCURLY ( service_body[proto, service] )+ RIGHTCURLY ( ( SEMICOLON )? ) )
            // com/dyuproject/protostuff/parser/ProtoParser.g:552:9: SERVICE ID LEFTCURLY ( service_body[proto, service] )+ RIGHTCURLY ( ( SEMICOLON )? )
            {
            root_0 = (Object)adaptor.nil();

            SERVICE126=(Token)match(input,SERVICE,FOLLOW_SERVICE_in_service_block2133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SERVICE126_tree = (Object)adaptor.create(SERVICE126);
            adaptor.addChild(root_0, SERVICE126_tree);
            }
            ID127=(Token)match(input,ID,FOLLOW_ID_in_service_block2135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID127_tree = (Object)adaptor.create(ID127);
            adaptor.addChild(root_0, ID127_tree);
            }
            if ( state.backtracking==0 ) {
               
                          service = new Service((ID127!=null?ID127.getText():null), proto); 
                          proto.addAnnotationsTo(service);
                      
            }
            LEFTCURLY128=(Token)match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_service_block2139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTCURLY128_tree = (Object)adaptor.create(LEFTCURLY128);
            adaptor.addChild(root_0, LEFTCURLY128_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:556:9: ( service_body[proto, service] )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case AT:
                case OPTION:
                case RPC:
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:556:10: service_body[proto, service]
            	    {
            	    pushFollow(FOLLOW_service_body_in_service_block2150);
            	    service_body129=service_body(proto, service);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, service_body129.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            RIGHTCURLY130=(Token)match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_service_block2155); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTCURLY130_tree = (Object)adaptor.create(RIGHTCURLY130);
            adaptor.addChild(root_0, RIGHTCURLY130_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:556:52: ( ( SEMICOLON )? )
            // com/dyuproject/protostuff/parser/ProtoParser.g:556:53: ( SEMICOLON )?
            {
            // com/dyuproject/protostuff/parser/ProtoParser.g:556:53: ( SEMICOLON )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt24=1;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:556:53: SEMICOLON
                    {
                    SEMICOLON131=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_service_block2158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON131_tree = (Object)adaptor.create(SEMICOLON131);
                    adaptor.addChild(root_0, SEMICOLON131_tree);
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

                          if(service.rpcMethods.isEmpty())
                              throw new IllegalStateException("Empty Service block: " + service.getName());
                              
                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "service_block"

    public static class service_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "service_body"
    // com/dyuproject/protostuff/parser/ProtoParser.g:565:1: service_body[Proto proto, Service service] : ( rpc_block[proto, service] | annotation_entry[proto] | option_entry[proto, service] );
    public final ProtoParser.service_body_return service_body(Proto proto, Service service) throws RecognitionException {
        ProtoParser.service_body_return retval = new ProtoParser.service_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProtoParser.rpc_block_return rpc_block132 = null;

        ProtoParser.annotation_entry_return annotation_entry133 = null;

        ProtoParser.option_entry_return option_entry134 = null;



        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:566:5: ( rpc_block[proto, service] | annotation_entry[proto] | option_entry[proto, service] )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RPC:
                {
                alt25=1;
                }
                break;
            case AT:
                {
                alt25=2;
                }
                break;
            case OPTION:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:566:9: rpc_block[proto, service]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rpc_block_in_service_body2188);
                    rpc_block132=rpc_block(proto, service);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpc_block132.getTree());

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:567:9: annotation_entry[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_annotation_entry_in_service_body2199);
                    annotation_entry133=annotation_entry(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_entry133.getTree());

                    }
                    break;
                case 3 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:568:9: option_entry[proto, service]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_option_entry_in_service_body2210);
                    option_entry134=option_entry(proto, service);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, option_entry134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "service_body"

    public static class rpc_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rpc_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:571:1: rpc_block[Proto proto, Service service] : RPC n= ID LEFTPAREN (ap= FULL_ID | a= ( VOID | ID ) ) RIGHTPAREN RETURNS LEFTPAREN (rp= FULL_ID | r= ( VOID | ID ) ) RIGHTPAREN ( rpc_body_block[proto, rm] )? SEMICOLON ;
    public final ProtoParser.rpc_block_return rpc_block(Proto proto, Service service) throws RecognitionException {
        ProtoParser.rpc_block_return retval = new ProtoParser.rpc_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token n=null;
        Token ap=null;
        Token a=null;
        Token rp=null;
        Token r=null;
        Token RPC135=null;
        Token LEFTPAREN136=null;
        Token RIGHTPAREN137=null;
        Token RETURNS138=null;
        Token LEFTPAREN139=null;
        Token RIGHTPAREN140=null;
        Token SEMICOLON142=null;
        ProtoParser.rpc_body_block_return rpc_body_block141 = null;


        Object n_tree=null;
        Object ap_tree=null;
        Object a_tree=null;
        Object rp_tree=null;
        Object r_tree=null;
        Object RPC135_tree=null;
        Object LEFTPAREN136_tree=null;
        Object RIGHTPAREN137_tree=null;
        Object RETURNS138_tree=null;
        Object LEFTPAREN139_tree=null;
        Object RIGHTPAREN140_tree=null;
        Object SEMICOLON142_tree=null;


            String argName = null, argPackage = null, retName = null, retPackage = null;
            Service.RpcMethod rm = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:576:5: ( RPC n= ID LEFTPAREN (ap= FULL_ID | a= ( VOID | ID ) ) RIGHTPAREN RETURNS LEFTPAREN (rp= FULL_ID | r= ( VOID | ID ) ) RIGHTPAREN ( rpc_body_block[proto, rm] )? SEMICOLON )
            // com/dyuproject/protostuff/parser/ProtoParser.g:576:9: RPC n= ID LEFTPAREN (ap= FULL_ID | a= ( VOID | ID ) ) RIGHTPAREN RETURNS LEFTPAREN (rp= FULL_ID | r= ( VOID | ID ) ) RIGHTPAREN ( rpc_body_block[proto, rm] )? SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RPC135=(Token)match(input,RPC,FOLLOW_RPC_in_rpc_block2241); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPC135_tree = (Object)adaptor.create(RPC135);
            adaptor.addChild(root_0, RPC135_tree);
            }
            n=(Token)match(input,ID,FOLLOW_ID_in_rpc_block2245); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            n_tree = (Object)adaptor.create(n);
            adaptor.addChild(root_0, n_tree);
            }
            LEFTPAREN136=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_rpc_block2247); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTPAREN136_tree = (Object)adaptor.create(LEFTPAREN136);
            adaptor.addChild(root_0, LEFTPAREN136_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:576:28: (ap= FULL_ID | a= ( VOID | ID ) )
            int alt26=2;
            switch ( input.LA(1) ) {
            case FULL_ID:
                {
                alt26=1;
                }
                break;
            case VOID:
            case ID:
                {
                alt26=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:576:29: ap= FULL_ID
                    {
                    ap=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_rpc_block2252); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ap_tree = (Object)adaptor.create(ap);
                    adaptor.addChild(root_0, ap_tree);
                    }
                    if ( state.backtracking==0 ) {
                        
                                  String argFull = (ap!=null?ap.getText():null);
                                  int lastDot = argFull.lastIndexOf('.');
                                  argPackage = argFull.substring(0, lastDot); 
                                  argName = argFull.substring(lastDot+1);
                              
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:581:13: a= ( VOID | ID )
                    {
                    a=(Token)input.LT(1);
                    if ( (input.LA(1)>=VOID && input.LA(1)<=ID) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(a));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    if ( state.backtracking==0 ) {
                       argName = (a!=null?a.getText():null); 
                    }

                    }
                    break;

            }

            RIGHTPAREN137=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_rpc_block2269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTPAREN137_tree = (Object)adaptor.create(RIGHTPAREN137);
            adaptor.addChild(root_0, RIGHTPAREN137_tree);
            }
            RETURNS138=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_rpc_block2280); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RETURNS138_tree = (Object)adaptor.create(RETURNS138);
            adaptor.addChild(root_0, RETURNS138_tree);
            }
            LEFTPAREN139=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_rpc_block2282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTPAREN139_tree = (Object)adaptor.create(LEFTPAREN139);
            adaptor.addChild(root_0, LEFTPAREN139_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:582:27: (rp= FULL_ID | r= ( VOID | ID ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case FULL_ID:
                {
                alt27=1;
                }
                break;
            case VOID:
            case ID:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:582:28: rp= FULL_ID
                    {
                    rp=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_rpc_block2287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rp_tree = (Object)adaptor.create(rp);
                    adaptor.addChild(root_0, rp_tree);
                    }
                    if ( state.backtracking==0 ) {
                        
                                  String retFull = (rp!=null?rp.getText():null);
                                  int lastDot = retFull.lastIndexOf('.');
                                  retPackage = retFull.substring(0, lastDot); 
                                  retName = retFull.substring(lastDot+1);
                              
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:587:13: r= ( VOID | ID )
                    {
                    r=(Token)input.LT(1);
                    if ( (input.LA(1)>=VOID && input.LA(1)<=ID) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(r));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    if ( state.backtracking==0 ) {
                       retName = (r!=null?r.getText():null); 
                    }

                    }
                    break;

            }

            RIGHTPAREN140=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_rpc_block2304); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTPAREN140_tree = (Object)adaptor.create(RIGHTPAREN140);
            adaptor.addChild(root_0, RIGHTPAREN140_tree);
            }
            if ( state.backtracking==0 ) {

                          rm = service.addRpcMethod((n!=null?n.getText():null), argName, argPackage, retName, retPackage);
                          proto.addAnnotationsTo(rm);
                      
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:590:11: ( rpc_body_block[proto, rm] )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case LEFTCURLY:
                    {
                    alt28=1;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:590:11: rpc_body_block[proto, rm]
                    {
                    pushFollow(FOLLOW_rpc_body_block_in_rpc_block2308);
                    rpc_body_block141=rpc_body_block(proto, rm);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpc_body_block141.getTree());

                    }
                    break;

            }

            SEMICOLON142=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rpc_block2312); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rpc_block"

    public static class rpc_body_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rpc_body_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:593:1: rpc_body_block[Proto proto, Service.RpcMethod rm] : LEFTCURLY ( option_entry[proto, rm] )* RIGHTCURLY ;
    public final ProtoParser.rpc_body_block_return rpc_body_block(Proto proto, Service.RpcMethod rm) throws RecognitionException {
        ProtoParser.rpc_body_block_return retval = new ProtoParser.rpc_body_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFTCURLY143=null;
        Token RIGHTCURLY145=null;
        ProtoParser.option_entry_return option_entry144 = null;


        Object LEFTCURLY143_tree=null;
        Object RIGHTCURLY145_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:594:5: ( LEFTCURLY ( option_entry[proto, rm] )* RIGHTCURLY )
            // com/dyuproject/protostuff/parser/ProtoParser.g:594:9: LEFTCURLY ( option_entry[proto, rm] )* RIGHTCURLY
            {
            root_0 = (Object)adaptor.nil();

            LEFTCURLY143=(Token)match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_rpc_body_block2338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTCURLY143_tree = (Object)adaptor.create(LEFTCURLY143);
            adaptor.addChild(root_0, LEFTCURLY143_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:594:19: ( option_entry[proto, rm] )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case OPTION:
                    {
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:594:19: option_entry[proto, rm]
            	    {
            	    pushFollow(FOLLOW_option_entry_in_rpc_body_block2340);
            	    option_entry144=option_entry(proto, rm);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, option_entry144.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            RIGHTCURLY145=(Token)match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_rpc_body_block2344); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTCURLY145_tree = (Object)adaptor.create(RIGHTCURLY145);
            adaptor.addChild(root_0, RIGHTCURLY145_tree);
            }
            if ( state.backtracking==0 ) {

                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                      
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rpc_body_block"

    public static class extend_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extend_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:600:1: extend_block[Proto proto, Message parent] : EXTEND ( FULL_ID | ID ) LEFTCURLY ( extend_body[proto, extension] )* RIGHTCURLY ( ( SEMICOLON )? ) ;
    public final ProtoParser.extend_block_return extend_block(Proto proto, Message parent) throws RecognitionException {
        ProtoParser.extend_block_return retval = new ProtoParser.extend_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXTEND146=null;
        Token FULL_ID147=null;
        Token ID148=null;
        Token LEFTCURLY149=null;
        Token RIGHTCURLY151=null;
        Token SEMICOLON152=null;
        ProtoParser.extend_body_return extend_body150 = null;


        Object EXTEND146_tree=null;
        Object FULL_ID147_tree=null;
        Object ID148_tree=null;
        Object LEFTCURLY149_tree=null;
        Object RIGHTCURLY151_tree=null;
        Object SEMICOLON152_tree=null;


            Extension extension = null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:604:5: ( EXTEND ( FULL_ID | ID ) LEFTCURLY ( extend_body[proto, extension] )* RIGHTCURLY ( ( SEMICOLON )? ) )
            // com/dyuproject/protostuff/parser/ProtoParser.g:604:9: EXTEND ( FULL_ID | ID ) LEFTCURLY ( extend_body[proto, extension] )* RIGHTCURLY ( ( SEMICOLON )? )
            {
            root_0 = (Object)adaptor.nil();

            EXTEND146=(Token)match(input,EXTEND,FOLLOW_EXTEND_in_extend_block2376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTEND146_tree = (Object)adaptor.create(EXTEND146);
            adaptor.addChild(root_0, EXTEND146_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:604:16: ( FULL_ID | ID )
            int alt30=2;
            switch ( input.LA(1) ) {
            case FULL_ID:
                {
                alt30=1;
                }
                break;
            case ID:
                {
                alt30=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:605:9: FULL_ID
                    {
                    FULL_ID147=(Token)match(input,FULL_ID,FOLLOW_FULL_ID_in_extend_block2388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FULL_ID147_tree = (Object)adaptor.create(FULL_ID147);
                    adaptor.addChild(root_0, FULL_ID147_tree);
                    }
                    if ( state.backtracking==0 ) {

                                  String fullType = (FULL_ID147!=null?FULL_ID147.getText():null);
                                  int lastDot = fullType.lastIndexOf('.');
                                  String packageName = fullType.substring(0, lastDot); 
                                  String type = fullType.substring(lastDot+1);
                                  extension = new Extension(proto, parent, packageName, type);
                              
                    }

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:611:13: ID
                    {
                    ID148=(Token)match(input,ID,FOLLOW_ID_in_extend_block2394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID148_tree = (Object)adaptor.create(ID148);
                    adaptor.addChild(root_0, ID148_tree);
                    }
                    if ( state.backtracking==0 ) {
                       extension = new Extension(proto, parent, null, (ID148!=null?ID148.getText():null)); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          if(parent==null)
                              proto.addExtension(extension);
                          else
                              parent.addNestedExtension(extension);
                              
                          proto.addAnnotationsTo(extension);
                      
            }
            LEFTCURLY149=(Token)match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_extend_block2410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTCURLY149_tree = (Object)adaptor.create(LEFTCURLY149);
            adaptor.addChild(root_0, LEFTCURLY149_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:619:19: ( extend_body[proto, extension] )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case AT:
                case REQUIRED:
                case OPTIONAL:
                case REPEATED:
                    {
                    alt31=1;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:619:20: extend_body[proto, extension]
            	    {
            	    pushFollow(FOLLOW_extend_body_in_extend_block2413);
            	    extend_body150=extend_body(proto, extension);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, extend_body150.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            RIGHTCURLY151=(Token)match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_extend_block2418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTCURLY151_tree = (Object)adaptor.create(RIGHTCURLY151);
            adaptor.addChild(root_0, RIGHTCURLY151_tree);
            }
            if ( state.backtracking==0 ) {

                          if(!proto.annotations.isEmpty())
                              throw new IllegalStateException("Misplaced annotations: " + proto.annotations);
                              
                      
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:623:11: ( ( SEMICOLON )? )
            // com/dyuproject/protostuff/parser/ProtoParser.g:623:12: ( SEMICOLON )?
            {
            // com/dyuproject/protostuff/parser/ProtoParser.g:623:12: ( SEMICOLON )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt32=1;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:623:12: SEMICOLON
                    {
                    SEMICOLON152=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_extend_block2423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON152_tree = (Object)adaptor.create(SEMICOLON152);
                    adaptor.addChild(root_0, SEMICOLON152_tree);
                    }

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extend_block"

    public static class extend_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extend_body"
    // com/dyuproject/protostuff/parser/ProtoParser.g:626:1: extend_body[Proto proto, Extension extension] : ( message_field[proto, extension] | annotation_entry[proto] );
    public final ProtoParser.extend_body_return extend_body(Proto proto, Extension extension) throws RecognitionException {
        ProtoParser.extend_body_return retval = new ProtoParser.extend_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProtoParser.message_field_return message_field153 = null;

        ProtoParser.annotation_entry_return annotation_entry154 = null;



        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:627:5: ( message_field[proto, extension] | annotation_entry[proto] )
            int alt33=2;
            switch ( input.LA(1) ) {
            case REQUIRED:
            case OPTIONAL:
            case REPEATED:
                {
                alt33=1;
                }
                break;
            case AT:
                {
                alt33=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:627:9: message_field[proto, extension]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_extend_body2451);
                    message_field153=message_field(proto, extension);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_field153.getTree());

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:628:9: annotation_entry[proto]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_annotation_entry_in_extend_body2462);
                    annotation_entry154=annotation_entry(proto);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation_entry154.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extend_body"

    public static class ignore_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ignore_block"
    // com/dyuproject/protostuff/parser/ProtoParser.g:631:1: ignore_block : LEFTCURLY ( ignore_block_body )* RIGHTCURLY ;
    public final ProtoParser.ignore_block_return ignore_block() throws RecognitionException {
        ProtoParser.ignore_block_return retval = new ProtoParser.ignore_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFTCURLY155=null;
        Token RIGHTCURLY157=null;
        ProtoParser.ignore_block_body_return ignore_block_body156 = null;


        Object LEFTCURLY155_tree=null;
        Object RIGHTCURLY157_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:632:5: ( LEFTCURLY ( ignore_block_body )* RIGHTCURLY )
            // com/dyuproject/protostuff/parser/ProtoParser.g:632:9: LEFTCURLY ( ignore_block_body )* RIGHTCURLY
            {
            root_0 = (Object)adaptor.nil();

            LEFTCURLY155=(Token)match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_ignore_block2486); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFTCURLY155_tree = (Object)adaptor.create(LEFTCURLY155);
            adaptor.addChild(root_0, LEFTCURLY155_tree);
            }
            // com/dyuproject/protostuff/parser/ProtoParser.g:632:19: ( ignore_block_body )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case ASSIGN:
                case AT:
                case LEFTCURLY:
                case LEFTPAREN:
                case RIGHTPAREN:
                case LEFTSQUARE:
                case RIGHTSQUARE:
                case SEMICOLON:
                case COMMA:
                case PLUS:
                case MINUS:
                case TO:
                case TRUE:
                case FALSE:
                case PKG:
                case SYNTAX:
                case IMPORT:
                case OPTION:
                case MESSAGE:
                case SERVICE:
                case ENUM:
                case REQUIRED:
                case OPTIONAL:
                case REPEATED:
                case EXTENSIONS:
                case EXTEND:
                case GROUP:
                case RPC:
                case RETURNS:
                case INT32:
                case INT64:
                case UINT32:
                case UINT64:
                case SINT32:
                case SINT64:
                case FIXED32:
                case FIXED64:
                case SFIXED32:
                case SFIXED64:
                case FLOAT:
                case DOUBLE:
                case BOOL:
                case STRING:
                case BYTES:
                case DEFAULT:
                case MAX:
                case VOID:
                case ID:
                case FULL_ID:
                case NUMINT:
                case EXP:
                case NUMFLOAT:
                case NUMDOUBLE:
                case HEX_DIGIT:
                case HEX:
                case OCTAL:
                case COMMENT:
                case WS:
                case ESC_SEQ:
                case STRING_LITERAL:
                case UNICODE_ESC:
                case OCTAL_ESC:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // com/dyuproject/protostuff/parser/ProtoParser.g:632:19: ignore_block_body
            	    {
            	    pushFollow(FOLLOW_ignore_block_body_in_ignore_block2488);
            	    ignore_block_body156=ignore_block_body();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ignore_block_body156.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            RIGHTCURLY157=(Token)match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_ignore_block2491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHTCURLY157_tree = (Object)adaptor.create(RIGHTCURLY157);
            adaptor.addChild(root_0, RIGHTCURLY157_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ignore_block"

    public static class ignore_block_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ignore_block_body"
    // com/dyuproject/protostuff/parser/ProtoParser.g:635:1: ignore_block_body : ( ( LEFTCURLY )=> ignore_block | ~ RIGHTCURLY );
    public final ProtoParser.ignore_block_body_return ignore_block_body() throws RecognitionException {
        ProtoParser.ignore_block_body_return retval = new ProtoParser.ignore_block_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set159=null;
        ProtoParser.ignore_block_return ignore_block158 = null;


        Object set159_tree=null;

        try {
            // com/dyuproject/protostuff/parser/ProtoParser.g:636:5: ( ( LEFTCURLY )=> ignore_block | ~ RIGHTCURLY )
            int alt35=2;
            switch ( input.LA(1) ) {
            case LEFTCURLY:
                {
                int LA35_1 = input.LA(2);

                if ( (synpred1_ProtoParser()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case ASSIGN:
            case AT:
            case LEFTPAREN:
            case RIGHTPAREN:
            case LEFTSQUARE:
            case RIGHTSQUARE:
            case SEMICOLON:
            case COMMA:
            case PLUS:
            case MINUS:
            case TO:
            case TRUE:
            case FALSE:
            case PKG:
            case SYNTAX:
            case IMPORT:
            case OPTION:
            case MESSAGE:
            case SERVICE:
            case ENUM:
            case REQUIRED:
            case OPTIONAL:
            case REPEATED:
            case EXTENSIONS:
            case EXTEND:
            case GROUP:
            case RPC:
            case RETURNS:
            case INT32:
            case INT64:
            case UINT32:
            case UINT64:
            case SINT32:
            case SINT64:
            case FIXED32:
            case FIXED64:
            case SFIXED32:
            case SFIXED64:
            case FLOAT:
            case DOUBLE:
            case BOOL:
            case STRING:
            case BYTES:
            case DEFAULT:
            case MAX:
            case VOID:
            case ID:
            case FULL_ID:
            case NUMINT:
            case EXP:
            case NUMFLOAT:
            case NUMDOUBLE:
            case HEX_DIGIT:
            case HEX:
            case OCTAL:
            case COMMENT:
            case WS:
            case ESC_SEQ:
            case STRING_LITERAL:
            case UNICODE_ESC:
            case OCTAL_ESC:
                {
                alt35=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:636:9: ( LEFTCURLY )=> ignore_block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ignore_block_in_ignore_block_body2519);
                    ignore_block158=ignore_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ignore_block158.getTree());

                    }
                    break;
                case 2 :
                    // com/dyuproject/protostuff/parser/ProtoParser.g:637:9: ~ RIGHTCURLY
                    {
                    root_0 = (Object)adaptor.nil();

                    set159=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=LEFTCURLY)||(input.LA(1)>=LEFTPAREN && input.LA(1)<=OCTAL_ESC) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set159));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ignore_block_body"

    // $ANTLR start synpred1_ProtoParser
    public final void synpred1_ProtoParser_fragment() throws RecognitionException {   
        // com/dyuproject/protostuff/parser/ProtoParser.g:636:9: ( LEFTCURLY )
        // com/dyuproject/protostuff/parser/ProtoParser.g:636:10: LEFTCURLY
        {
        match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_synpred1_ProtoParser2515); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ProtoParser

    // Delegated rules

    public final boolean synpred1_ProtoParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ProtoParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\20\11\uffff";
    static final String DFA5_maxS =
        "\1\100\11\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\11\1\6\1\7\41\11\1\1\1\2\1\4\1\uffff\1\3\1\5\6\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "95:22: ( ID | fid= FULL_ID | NUMFLOAT | NUMINT | NUMDOUBLE | TRUE | FALSE | STRING_LITERAL | v= var )";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_parse178 = new BitSet(new long[]{0x0000000043F80020L});
    public static final BitSet FOLLOW_EOF_in_parse183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_syntax_in_statement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_package_in_statement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_import_in_statement233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_block_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_block_in_statement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extend_block_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_service_block_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_entry_in_statement288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_entry_in_statement299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_annotation_entry519 = new BitSet(new long[]{0x001FFFFFFFF90000L});
    public static final BitSet FOLLOW_var_in_annotation_entry521 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LEFTPAREN_in_annotation_entry534 = new BitSet(new long[]{0x001FFFFFFFF90000L});
    public static final BitSet FOLLOW_annotation_keyval_in_annotation_entry545 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COMMA_in_annotation_entry549 = new BitSet(new long[]{0x001FFFFFFFF90000L});
    public static final BitSet FOLLOW_annotation_keyval_in_annotation_entry551 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_annotation_entry565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_annotation_keyval592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_annotation_keyval594 = new BitSet(new long[]{0x037FFFFFFFFF0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ID_in_annotation_keyval614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_ID_in_annotation_keyval636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMFLOAT_in_annotation_keyval656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMINT_in_annotation_keyval676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMDOUBLE_in_annotation_keyval696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_annotation_keyval716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_annotation_keyval736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_annotation_keyval756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_annotation_keyval778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNTAX_in_header_syntax811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_header_syntax813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_header_syntax815 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_header_syntax817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PKG_in_header_package846 = new BitSet(new long[]{0x003FFFFFFFF90000L});
    public static final BitSet FOLLOW_FULL_ID_in_header_package849 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_var_in_header_package855 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_header_package860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_header_import888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_header_import890 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_header_import892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_option_entry916 = new BitSet(new long[]{0x0030000000000100L});
    public static final BitSet FOLLOW_LEFTPAREN_in_option_entry918 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_set_in_option_entry923 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_option_entry929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_option_entry932 = new BitSet(new long[]{0x0370000000060000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ID_in_option_entry954 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_FULL_ID_in_option_entry976 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMFLOAT_in_option_entry996 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMINT_in_option_entry1016 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMDOUBLE_in_option_entry1036 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TRUE_in_option_entry1056 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_FALSE_in_option_entry1076 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_option_entry1096 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_option_entry1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_block1143 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_message_block1145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTCURLY_in_message_block1158 = new BitSet(new long[]{0x000000007FF800A0L});
    public static final BitSet FOLLOW_message_body_in_message_block1161 = new BitSet(new long[]{0x000000007FF800A0L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_message_block1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_block_in_message_body1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_body1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_block_in_message_body1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extend_block_in_message_body1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensions_range_in_message_body1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_entry_in_message_body1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_entry_in_message_body1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSIONS_in_extensions_range1286 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NUMINT_in_extensions_range1290 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_TO_in_extensions_range1304 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_NUMINT_in_extensions_range1310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_MAX_in_extensions_range1316 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_extensions_range1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_message_field1367 = new BitSet(new long[]{0x0031FFFC80000000L});
    public static final BitSet FOLLOW_REQUIRED_in_message_field1384 = new BitSet(new long[]{0x0031FFFC80000000L});
    public static final BitSet FOLLOW_REPEATED_in_message_field1401 = new BitSet(new long[]{0x0031FFFC80000000L});
    public static final BitSet FOLLOW_field_type_in_message_field1416 = new BitSet(new long[]{0x001FFFFFFFF90000L});
    public static final BitSet FOLLOW_var_in_message_field1428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_message_field1430 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NUMINT_in_message_field1432 = new BitSet(new long[]{0x0000000000001440L});
    public static final BitSet FOLLOW_field_options_in_message_field1446 = new BitSet(new long[]{0x0000000000001440L});
    public static final BitSet FOLLOW_SEMICOLON_in_message_field1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignore_block_in_message_field1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_in_field_type1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT32_in_field_type1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINT32_in_field_type1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED32_in_field_type1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SFIXED32_in_field_type1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT64_in_field_type1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UINT64_in_field_type1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINT64_in_field_type1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED64_in_field_type1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SFIXED64_in_field_type1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_field_type1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_field_type1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_field_type1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_field_type1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTES_in_field_type1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_field_type1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_ID_in_field_type1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_type1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTSQUARE_in_field_options1724 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_field_options_keyval_in_field_options1726 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_COMMA_in_field_options1739 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_field_options_keyval_in_field_options1741 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_RIGHTSQUARE_in_field_options1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_field_options_keyval1773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_field_options_keyval1779 = new BitSet(new long[]{0x1BF0000000068000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_field_options_keyval1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMFLOAT_in_field_options_keyval1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMINT_in_field_options_keyval1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMDOUBLE_in_field_options_keyval1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_in_field_options_keyval1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTAL_in_field_options_keyval1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_field_options_keyval1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_field_options_keyval1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_options_keyval1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_ID_in_field_options_keyval1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_in_field_options_keyval1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_constant_in_field_options_keyval1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_signed_constant1960 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_signed_constant1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enum_block1994 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_enum_block1996 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTCURLY_in_enum_block2009 = new BitSet(new long[]{0x0010000043F800A0L});
    public static final BitSet FOLLOW_enum_body_in_enum_block2012 = new BitSet(new long[]{0x0010000043F800A0L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_enum_block2017 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_SEMICOLON_in_enum_block2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_field_in_enum_body2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_entry_in_enum_body2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_entry_in_enum_body2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_enum_field2094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_enum_field2096 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NUMINT_in_enum_field2098 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_enum_field2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERVICE_in_service_block2133 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_service_block2135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTCURLY_in_service_block2139 = new BitSet(new long[]{0x0000000143F80020L});
    public static final BitSet FOLLOW_service_body_in_service_block2150 = new BitSet(new long[]{0x0000000143F800A0L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_service_block2155 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_SEMICOLON_in_service_block2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rpc_block_in_service_body2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_entry_in_service_body2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_entry_in_service_body2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPC_in_rpc_block2241 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_rpc_block2245 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFTPAREN_in_rpc_block2247 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_FULL_ID_in_rpc_block2252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_rpc_block2260 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_rpc_block2269 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RETURNS_in_rpc_block2280 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFTPAREN_in_rpc_block2282 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_FULL_ID_in_rpc_block2287 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_rpc_block2295 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_rpc_block2304 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_rpc_body_block_in_rpc_block2308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SEMICOLON_in_rpc_block2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTCURLY_in_rpc_body_block2338 = new BitSet(new long[]{0x0000000043F800A0L});
    public static final BitSet FOLLOW_option_entry_in_rpc_body_block2340 = new BitSet(new long[]{0x0000000043F800A0L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_rpc_body_block2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTEND_in_extend_block2376 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_FULL_ID_in_extend_block2388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_extend_block2394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTCURLY_in_extend_block2410 = new BitSet(new long[]{0x000000001C0000A0L});
    public static final BitSet FOLLOW_extend_body_in_extend_block2413 = new BitSet(new long[]{0x000000001C0000A0L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_extend_block2418 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_SEMICOLON_in_extend_block2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_extend_body2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_entry_in_extend_body2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTCURLY_in_ignore_block2486 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_ignore_block_body_in_ignore_block2488 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_ignore_block2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignore_block_in_ignore_block_body2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ignore_block_body2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTCURLY_in_synpred1_ProtoParser2515 = new BitSet(new long[]{0x0000000000000002L});

}