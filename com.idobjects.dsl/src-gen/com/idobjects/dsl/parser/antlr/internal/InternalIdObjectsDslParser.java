package com.idobjects.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.idobjects.dsl.services.IdObjectsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdObjectsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'entity'", "'extends'", "'List['", "']'", "'[inverse='", "';'", "'.'", "'DateTime'", "'Instant'", "'String'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalIdObjectsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIdObjectsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIdObjectsDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g"; }



     	private IdObjectsDslGrammarAccess grammarAccess;
     	
        public InternalIdObjectsDslParser(TokenStream input, IdObjectsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected IdObjectsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_packages_0_0= rulePackage ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:79:28: ( ( (lv_packages_0_0= rulePackage ) )* )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:80:1: ( (lv_packages_0_0= rulePackage ) )*
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:80:1: ( (lv_packages_0_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:81:1: (lv_packages_0_0= rulePackage )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:81:1: (lv_packages_0_0= rulePackage )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:82:3: lv_packages_0_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel130);
            	    lv_packages_0_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_0_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:106:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:107:2: (iv_rulePackage= rulePackage EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:108:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage166);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:115:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage213); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:123:1: ( (lv_name_1_0= rulePackageName ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:124:1: (lv_name_1_0= rulePackageName )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:124:1: (lv_name_1_0= rulePackageName )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:125:3: lv_name_1_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_rulePackage234);
            lv_name_1_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackage246); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:145:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:146:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:146:1: (lv_entities_3_0= ruleEntity )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:147:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_rulePackage267);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_3_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePackage280); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEntity"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:175:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:176:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:177:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity316);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:184:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= ruleEntityProperty ) ) | ( (lv_references_6_0= ruleEntityReference ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_properties_5_0 = null;

        EObject lv_references_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:187:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= ruleEntityProperty ) ) | ( (lv_references_6_0= ruleEntityReference ) ) )* otherlv_7= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:188:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= ruleEntityProperty ) ) | ( (lv_references_6_0= ruleEntityReference ) ) )* otherlv_7= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:188:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= ruleEntityProperty ) ) | ( (lv_references_6_0= ruleEntityReference ) ) )* otherlv_7= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:188:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= ruleEntityProperty ) ) | ( (lv_references_6_0= ruleEntityReference ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEntity363); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:192:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:193:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:193:1: (lv_name_1_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:194:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity380); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:210:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:210:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntity398); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:214:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:215:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:215:1: (otherlv_3= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:216:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity418); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleEntity432); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:231:1: ( ( (lv_properties_5_0= ruleEntityProperty ) ) | ( (lv_references_6_0= ruleEntityReference ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=39)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==RULE_ID||LA4_0==16) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:231:2: ( (lv_properties_5_0= ruleEntityProperty ) )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:231:2: ( (lv_properties_5_0= ruleEntityProperty ) )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:232:1: (lv_properties_5_0= ruleEntityProperty )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:232:1: (lv_properties_5_0= ruleEntityProperty )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:233:3: lv_properties_5_0= ruleEntityProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityProperty_in_ruleEntity454);
            	    lv_properties_5_0=ruleEntityProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"EntityProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:250:6: ( (lv_references_6_0= ruleEntityReference ) )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:250:6: ( (lv_references_6_0= ruleEntityReference ) )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:251:1: (lv_references_6_0= ruleEntityReference )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:251:1: (lv_references_6_0= ruleEntityReference )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:252:3: lv_references_6_0= ruleEntityReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityReference_in_ruleEntity481);
            	    lv_references_6_0=ruleEntityReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"references",
            	            		lv_references_6_0, 
            	            		"EntityReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleEntity495); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityReference"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:280:1: entryRuleEntityReference returns [EObject current=null] : iv_ruleEntityReference= ruleEntityReference EOF ;
    public final EObject entryRuleEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReference = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:281:2: (iv_ruleEntityReference= ruleEntityReference EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:282:2: iv_ruleEntityReference= ruleEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference531);
            iv_ruleEntityReference=ruleEntityReference();

            state._fsp--;

             current =iv_ruleEntityReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityReference"


    // $ANTLR start "ruleEntityReference"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:289:1: ruleEntityReference returns [EObject current=null] : ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleEntityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_inverseName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:292:28: ( ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:1: ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:1: ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:2: ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:2: ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:3: (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:3: (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:293:5: otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEntityReference580); 

                        	newLeafNode(otherlv_0, grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0());
                        
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:297:1: ( (otherlv_1= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:298:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:298:1: (otherlv_1= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:299:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityReferenceRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference600); 

                    		newLeafNode(otherlv_1, grammarAccess.getEntityReferenceAccess().getListDestinationEntityCrossReference_0_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEntityReference612); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:315:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:315:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:316:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:316:1: (otherlv_3= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:317:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityReferenceRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference639); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:328:3: ( (lv_name_4_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:329:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:329:1: (lv_name_4_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:330:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference657); 

            			newLeafNode(lv_name_4_0, grammarAccess.getEntityReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:346:2: (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:346:4: otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEntityReference675); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0());
                        
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:350:1: ( (lv_inverseName_6_0= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:351:1: (lv_inverseName_6_0= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:351:1: (lv_inverseName_6_0= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:352:3: lv_inverseName_6_0= RULE_ID
                    {
                    lv_inverseName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference692); 

                    			newLeafNode(lv_inverseName_6_0, grammarAccess.getEntityReferenceAccess().getInverseNameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"inverseName",
                            		lv_inverseName_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEntityReference709); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEntityReference723); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityReferenceAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityReference"


    // $ANTLR start "entryRuleEntityProperty"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:386:1: entryRuleEntityProperty returns [EObject current=null] : iv_ruleEntityProperty= ruleEntityProperty EOF ;
    public final EObject entryRuleEntityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityProperty = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:387:2: (iv_ruleEntityProperty= ruleEntityProperty EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:388:2: iv_ruleEntityProperty= ruleEntityProperty EOF
            {
             newCompositeNode(grammarAccess.getEntityPropertyRule()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty761);
            iv_ruleEntityProperty=ruleEntityProperty();

            state._fsp--;

             current =iv_ruleEntityProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityProperty771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityProperty"


    // $ANTLR start "ruleEntityProperty"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:395:1: ruleEntityProperty returns [EObject current=null] : ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleEntityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_propertyType_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:398:28: ( ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:399:1: ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:399:1: ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:399:2: ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:399:2: ( (lv_propertyType_0_0= ruleBasicType ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:400:1: (lv_propertyType_0_0= ruleBasicType )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:400:1: (lv_propertyType_0_0= ruleBasicType )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:401:3: lv_propertyType_0_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleEntityProperty817);
            lv_propertyType_0_0=ruleBasicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"propertyType",
                    		lv_propertyType_0_0, 
                    		"BasicType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:417:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:418:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:418:1: (lv_name_1_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:419:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityProperty834); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEntityProperty851); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityProperty"


    // $ANTLR start "entryRulePackageName"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:447:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:448:2: (iv_rulePackageName= rulePackageName EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:449:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName888);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:456:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:459:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:460:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:460:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:460:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName939); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:467:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:468:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_rulePackageName958); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName973); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleBasicType"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:488:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:489:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:490:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1021);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:497:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveTypes_0 = null;

        AntlrDatatypeRuleToken this_WrapperTypes_1 = null;

        AntlrDatatypeRuleToken this_DirectSupportedTypes_2 = null;

        AntlrDatatypeRuleToken this_JodaTimeTypes_3 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:500:28: ( (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:501:1: (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:501:1: (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt8=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 21:
            case 22:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:502:5: this_PrimitiveTypes_0= rulePrimitiveTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_ruleBasicType1079);
                    this_PrimitiveTypes_0=rulePrimitiveTypes();

                    state._fsp--;


                    		current.merge(this_PrimitiveTypes_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:514:5: this_WrapperTypes_1= ruleWrapperTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWrapperTypes_in_ruleBasicType1112);
                    this_WrapperTypes_1=ruleWrapperTypes();

                    state._fsp--;


                    		current.merge(this_WrapperTypes_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:526:5: this_DirectSupportedTypes_2= ruleDirectSupportedTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_ruleBasicType1145);
                    this_DirectSupportedTypes_2=ruleDirectSupportedTypes();

                    state._fsp--;


                    		current.merge(this_DirectSupportedTypes_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:538:5: this_JodaTimeTypes_3= ruleJodaTimeTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getJodaTimeTypesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleJodaTimeTypes_in_ruleBasicType1178);
                    this_JodaTimeTypes_3=ruleJodaTimeTypes();

                    state._fsp--;


                    		current.merge(this_JodaTimeTypes_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleJodaTimeTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:556:1: entryRuleJodaTimeTypes returns [String current=null] : iv_ruleJodaTimeTypes= ruleJodaTimeTypes EOF ;
    public final String entryRuleJodaTimeTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJodaTimeTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:557:2: (iv_ruleJodaTimeTypes= ruleJodaTimeTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:558:2: iv_ruleJodaTimeTypes= ruleJodaTimeTypes EOF
            {
             newCompositeNode(grammarAccess.getJodaTimeTypesRule()); 
            pushFollow(FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes1224);
            iv_ruleJodaTimeTypes=ruleJodaTimeTypes();

            state._fsp--;

             current =iv_ruleJodaTimeTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJodaTimeTypes1235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJodaTimeTypes"


    // $ANTLR start "ruleJodaTimeTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:565:1: ruleJodaTimeTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DateTime' | kw= 'Instant' ) ;
    public final AntlrDatatypeRuleToken ruleJodaTimeTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:568:28: ( (kw= 'DateTime' | kw= 'Instant' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:569:1: (kw= 'DateTime' | kw= 'Instant' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:569:1: (kw= 'DateTime' | kw= 'Instant' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:570:2: kw= 'DateTime'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleJodaTimeTypes1273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:577:2: kw= 'Instant'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleJodaTimeTypes1292); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJodaTimeTypesAccess().getInstantKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJodaTimeTypes"


    // $ANTLR start "entryRuleDirectSupportedTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:590:1: entryRuleDirectSupportedTypes returns [String current=null] : iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF ;
    public final String entryRuleDirectSupportedTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirectSupportedTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:591:2: (iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:592:2: iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF
            {
             newCompositeNode(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes1333);
            iv_ruleDirectSupportedTypes=ruleDirectSupportedTypes();

            state._fsp--;

             current =iv_ruleDirectSupportedTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes1344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectSupportedTypes"


    // $ANTLR start "ruleDirectSupportedTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:599:1: ruleDirectSupportedTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleDirectSupportedTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:602:28: (kw= 'String' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:604:2: kw= 'String'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleDirectSupportedTypes1381); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectSupportedTypes"


    // $ANTLR start "entryRuleWrapperTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:617:1: entryRuleWrapperTypes returns [String current=null] : iv_ruleWrapperTypes= ruleWrapperTypes EOF ;
    public final String entryRuleWrapperTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWrapperTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:618:2: (iv_ruleWrapperTypes= ruleWrapperTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:619:2: iv_ruleWrapperTypes= ruleWrapperTypes EOF
            {
             newCompositeNode(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes1421);
            iv_ruleWrapperTypes=ruleWrapperTypes();

            state._fsp--;

             current =iv_ruleWrapperTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes1432); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrapperTypes"


    // $ANTLR start "ruleWrapperTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:626:1: ruleWrapperTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' ) ;
    public final AntlrDatatypeRuleToken ruleWrapperTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:629:28: ( (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:630:1: (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:630:1: (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            case 30:
                {
                alt10=7;
                }
                break;
            case 31:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:631:2: kw= 'Byte'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleWrapperTypes1470); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:638:2: kw= 'Short'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleWrapperTypes1489); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:645:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleWrapperTypes1508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:652:2: kw= 'Long'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleWrapperTypes1527); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:659:2: kw= 'Float'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleWrapperTypes1546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:666:2: kw= 'Double'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleWrapperTypes1565); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:673:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleWrapperTypes1584); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:680:2: kw= 'Character'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleWrapperTypes1603); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrapperTypes"


    // $ANTLR start "entryRulePrimitiveTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:693:1: entryRulePrimitiveTypes returns [String current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final String entryRulePrimitiveTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:694:2: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:695:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes1644);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();

            state._fsp--;

             current =iv_rulePrimitiveTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes1655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:702:1: rulePrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:705:28: ( (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:706:1: (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:706:1: (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            case 36:
                {
                alt11=5;
                }
                break;
            case 37:
                {
                alt11=6;
                }
                break;
            case 38:
                {
                alt11=7;
                }
                break;
            case 39:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:707:2: kw= 'byte'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulePrimitiveTypes1693); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:714:2: kw= 'short'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulePrimitiveTypes1712); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:721:2: kw= 'int'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulePrimitiveTypes1731); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:728:2: kw= 'long'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulePrimitiveTypes1750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:735:2: kw= 'float'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulePrimitiveTypes1769); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:742:2: kw= 'double'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePrimitiveTypes1788); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:749:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulePrimitiveTypes1807); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:756:2: kw= 'char'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulePrimitiveTypes1826); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePackage234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage246 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackage267 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePackage280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEntity363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity380 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleEntity398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity418 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity432 = new BitSet(new long[]{0x000000FFFFE12010L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_ruleEntity454 = new BitSet(new long[]{0x000000FFFFE12010L});
    public static final BitSet FOLLOW_ruleEntityReference_in_ruleEntity481 = new BitSet(new long[]{0x000000FFFFE12010L});
    public static final BitSet FOLLOW_13_in_ruleEntity495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEntityReference580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference600 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntityReference612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference657 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleEntityReference675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference692 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntityReference709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEntityReference723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityProperty771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleEntityProperty817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityProperty834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEntityProperty851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName939 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePackageName958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName973 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_ruleBasicType1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_ruleBasicType1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_ruleBasicType1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_ruleBasicType1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJodaTimeTypes1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJodaTimeTypes1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJodaTimeTypes1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDirectSupportedTypes1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWrapperTypes1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWrapperTypes1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleWrapperTypes1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleWrapperTypes1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleWrapperTypes1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleWrapperTypes1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleWrapperTypes1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleWrapperTypes1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrimitiveTypes1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimitiveTypes1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimitiveTypes1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimitiveTypes1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimitiveTypes1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimitiveTypes1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitiveTypes1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimitiveTypes1826 = new BitSet(new long[]{0x0000000000000002L});

}