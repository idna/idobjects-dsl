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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'entity'", "';'", "'.'", "'String'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'"
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
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:184:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleEntityProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:187:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleEntityProperty ) )* otherlv_4= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:188:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleEntityProperty ) )* otherlv_4= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:188:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleEntityProperty ) )* otherlv_4= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:188:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleEntityProperty ) )* otherlv_4= '}'
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity397); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:214:1: ( (lv_properties_3_0= ruleEntityProperty ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:215:1: (lv_properties_3_0= ruleEntityProperty )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:215:1: (lv_properties_3_0= ruleEntityProperty )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:216:3: lv_properties_3_0= ruleEntityProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityProperty_in_ruleEntity418);
            	    lv_properties_3_0=ruleEntityProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"EntityProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity431); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleEntityProperty"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:244:1: entryRuleEntityProperty returns [EObject current=null] : iv_ruleEntityProperty= ruleEntityProperty EOF ;
    public final EObject entryRuleEntityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityProperty = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:245:2: (iv_ruleEntityProperty= ruleEntityProperty EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:246:2: iv_ruleEntityProperty= ruleEntityProperty EOF
            {
             newCompositeNode(grammarAccess.getEntityPropertyRule()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty467);
            iv_ruleEntityProperty=ruleEntityProperty();

            state._fsp--;

             current =iv_ruleEntityProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityProperty477); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:253:1: ruleEntityProperty returns [EObject current=null] : ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_propertyName_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleEntityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_propertyType_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:256:28: ( ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_propertyName_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:257:1: ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_propertyName_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:257:1: ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_propertyName_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:257:2: ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_propertyName_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:257:2: ( (lv_propertyType_0_0= ruleBasicType ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:258:1: (lv_propertyType_0_0= ruleBasicType )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:258:1: (lv_propertyType_0_0= ruleBasicType )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:259:3: lv_propertyType_0_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleEntityProperty523);
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

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:275:2: ( (lv_propertyName_1_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:276:1: (lv_propertyName_1_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:276:1: (lv_propertyName_1_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:277:3: lv_propertyName_1_0= RULE_ID
            {
            lv_propertyName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityProperty540); 

            			newLeafNode(lv_propertyName_1_0, grammarAccess.getEntityPropertyAccess().getPropertyNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntityProperty557); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:305:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:306:2: (iv_rulePackageName= rulePackageName EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:307:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName594);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName605); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:314:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:317:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:318:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:318:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:318:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName645); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:325:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:326:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_rulePackageName664); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName679); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:346:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:347:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:348:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType727);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType738); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:355:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveTypes_0 = null;

        AntlrDatatypeRuleToken this_WrapperTypes_1 = null;

        AntlrDatatypeRuleToken this_DirectSupportedTypes_2 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:358:28: ( (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:359:1: (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:359:1: (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt5=1;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:360:5: this_PrimitiveTypes_0= rulePrimitiveTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_ruleBasicType785);
                    this_PrimitiveTypes_0=rulePrimitiveTypes();

                    state._fsp--;


                    		current.merge(this_PrimitiveTypes_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:372:5: this_WrapperTypes_1= ruleWrapperTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWrapperTypes_in_ruleBasicType818);
                    this_WrapperTypes_1=ruleWrapperTypes();

                    state._fsp--;


                    		current.merge(this_WrapperTypes_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:384:5: this_DirectSupportedTypes_2= ruleDirectSupportedTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_ruleBasicType851);
                    this_DirectSupportedTypes_2=ruleDirectSupportedTypes();

                    state._fsp--;


                    		current.merge(this_DirectSupportedTypes_2);
                        
                     
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


    // $ANTLR start "entryRuleDirectSupportedTypes"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:402:1: entryRuleDirectSupportedTypes returns [String current=null] : iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF ;
    public final String entryRuleDirectSupportedTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirectSupportedTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:403:2: (iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:404:2: iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF
            {
             newCompositeNode(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes897);
            iv_ruleDirectSupportedTypes=ruleDirectSupportedTypes();

            state._fsp--;

             current =iv_ruleDirectSupportedTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes908); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:411:1: ruleDirectSupportedTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleDirectSupportedTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:414:28: (kw= 'String' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:416:2: kw= 'String'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleDirectSupportedTypes945); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:429:1: entryRuleWrapperTypes returns [String current=null] : iv_ruleWrapperTypes= ruleWrapperTypes EOF ;
    public final String entryRuleWrapperTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWrapperTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:430:2: (iv_ruleWrapperTypes= ruleWrapperTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:431:2: iv_ruleWrapperTypes= ruleWrapperTypes EOF
            {
             newCompositeNode(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes985);
            iv_ruleWrapperTypes=ruleWrapperTypes();

            state._fsp--;

             current =iv_ruleWrapperTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes996); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:438:1: ruleWrapperTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' ) ;
    public final AntlrDatatypeRuleToken ruleWrapperTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:441:28: ( (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:442:1: (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:442:1: (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:443:2: kw= 'Byte'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleWrapperTypes1034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:450:2: kw= 'Short'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleWrapperTypes1053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:457:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleWrapperTypes1072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:464:2: kw= 'Long'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleWrapperTypes1091); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:471:2: kw= 'Float'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleWrapperTypes1110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:478:2: kw= 'Double'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleWrapperTypes1129); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:485:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleWrapperTypes1148); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:492:2: kw= 'Character'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleWrapperTypes1167); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:505:1: entryRulePrimitiveTypes returns [String current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final String entryRulePrimitiveTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:506:2: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:507:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes1208);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();

            state._fsp--;

             current =iv_rulePrimitiveTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes1219); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:514:1: rulePrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:517:28: ( (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:518:1: (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:518:1: (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 31:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            case 33:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:519:2: kw= 'byte'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveTypes1257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:526:2: kw= 'short'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveTypes1276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:533:2: kw= 'int'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulePrimitiveTypes1295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:540:2: kw= 'long'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulePrimitiveTypes1314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:547:2: kw= 'float'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveTypes1333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:554:2: kw= 'double'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulePrimitiveTypes1352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:561:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulePrimitiveTypes1371); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:568:2: kw= 'char'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulePrimitiveTypes1390); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity380 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity397 = new BitSet(new long[]{0x00000003FFFE2000L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_ruleEntity418 = new BitSet(new long[]{0x00000003FFFE2000L});
    public static final BitSet FOLLOW_13_in_ruleEntity431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityProperty477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleEntityProperty523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityProperty540 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntityProperty557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName645 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rulePackageName664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName679 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_ruleBasicType785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_ruleBasicType818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_ruleBasicType851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDirectSupportedTypes945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWrapperTypes1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWrapperTypes1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWrapperTypes1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWrapperTypes1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWrapperTypes1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWrapperTypes1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWrapperTypes1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWrapperTypes1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveTypes1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveTypes1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveTypes1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveTypes1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimitiveTypes1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrimitiveTypes1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrimitiveTypes1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimitiveTypes1390 = new BitSet(new long[]{0x0000000000000002L});

}