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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model-id'", "'='", "'package'", "'{'", "'}'", "'entity'", "'List['", "']'", "'[inverse='", "';'", "'persistence'", "'('", "','", "')'", "'.'", "'DateTime'", "'Instant'", "'String'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model-id' otherlv_1= '=' ( (lv_name_2_0= rulePackageName ) ) ( (lv_packages_3_0= rulePackage ) )* ( (lv_persistenceModel_4_0= rulePersistence ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_packages_3_0 = null;

        EObject lv_persistenceModel_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:79:28: ( (otherlv_0= 'model-id' otherlv_1= '=' ( (lv_name_2_0= rulePackageName ) ) ( (lv_packages_3_0= rulePackage ) )* ( (lv_persistenceModel_4_0= rulePersistence ) )? ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:80:1: (otherlv_0= 'model-id' otherlv_1= '=' ( (lv_name_2_0= rulePackageName ) ) ( (lv_packages_3_0= rulePackage ) )* ( (lv_persistenceModel_4_0= rulePersistence ) )? )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:80:1: (otherlv_0= 'model-id' otherlv_1= '=' ( (lv_name_2_0= rulePackageName ) ) ( (lv_packages_3_0= rulePackage ) )* ( (lv_persistenceModel_4_0= rulePersistence ) )? )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:80:3: otherlv_0= 'model-id' otherlv_1= '=' ( (lv_name_2_0= rulePackageName ) ) ( (lv_packages_3_0= rulePackage ) )* ( (lv_persistenceModel_4_0= rulePersistence ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelIdKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getEqualsSignKeyword_1());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:88:1: ( (lv_name_2_0= rulePackageName ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:89:1: (lv_name_2_0= rulePackageName )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:89:1: (lv_name_2_0= rulePackageName )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:90:3: lv_name_2_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNamePackageNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_ruleModel155);
            lv_name_2_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:106:2: ( (lv_packages_3_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:107:1: (lv_packages_3_0= rulePackage )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:107:1: (lv_packages_3_0= rulePackage )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:108:3: lv_packages_3_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel176);
            	    lv_packages_3_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_3_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:124:3: ( (lv_persistenceModel_4_0= rulePersistence ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:125:1: (lv_persistenceModel_4_0= rulePersistence )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:125:1: (lv_persistenceModel_4_0= rulePersistence )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:126:3: lv_persistenceModel_4_0= rulePersistence
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPersistenceModelPersistenceParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePersistence_in_ruleModel198);
                    lv_persistenceModel_4_0=rulePersistence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"persistenceModel",
                            		lv_persistenceModel_4_0, 
                            		"Persistence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:150:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:151:2: (iv_rulePackage= rulePackage EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:152:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage235);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage245); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:159:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:162:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:163:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:163:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:163:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackage282); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:167:1: ( (lv_name_1_0= rulePackageName ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:168:1: (lv_name_1_0= rulePackageName )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:168:1: (lv_name_1_0= rulePackageName )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:169:3: lv_name_1_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_rulePackage303);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackage315); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:189:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:190:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:190:1: (lv_entities_3_0= ruleEntity )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:191:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_rulePackage336);
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
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePackage349); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:219:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:220:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:221:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity385);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity395); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:228:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= ruleEntityProperty ) ) | ( (lv_references_4_0= ruleEntityReference ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_properties_3_0 = null;

        EObject lv_references_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:231:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= ruleEntityProperty ) ) | ( (lv_references_4_0= ruleEntityReference ) ) )* otherlv_5= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:232:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= ruleEntityProperty ) ) | ( (lv_references_4_0= ruleEntityReference ) ) )* otherlv_5= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:232:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= ruleEntityProperty ) ) | ( (lv_references_4_0= ruleEntityReference ) ) )* otherlv_5= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:232:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= ruleEntityProperty ) ) | ( (lv_references_4_0= ruleEntityReference ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEntity432); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:236:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:237:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:237:1: (lv_name_1_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:238:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity449); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEntity466); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:258:1: ( ( (lv_properties_3_0= ruleEntityProperty ) ) | ( (lv_references_4_0= ruleEntityReference ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=26 && LA4_0<=44)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==RULE_ID||LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:258:2: ( (lv_properties_3_0= ruleEntityProperty ) )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:258:2: ( (lv_properties_3_0= ruleEntityProperty ) )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:259:1: (lv_properties_3_0= ruleEntityProperty )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:259:1: (lv_properties_3_0= ruleEntityProperty )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:260:3: lv_properties_3_0= ruleEntityProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityProperty_in_ruleEntity488);
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


            	    }
            	    break;
            	case 2 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:277:6: ( (lv_references_4_0= ruleEntityReference ) )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:277:6: ( (lv_references_4_0= ruleEntityReference ) )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:278:1: (lv_references_4_0= ruleEntityReference )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:278:1: (lv_references_4_0= ruleEntityReference )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:279:3: lv_references_4_0= ruleEntityReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityReference_in_ruleEntity515);
            	    lv_references_4_0=ruleEntityReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"references",
            	            		lv_references_4_0, 
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEntity529); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:307:1: entryRuleEntityReference returns [EObject current=null] : iv_ruleEntityReference= ruleEntityReference EOF ;
    public final EObject entryRuleEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReference = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:308:2: (iv_ruleEntityReference= ruleEntityReference EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:309:2: iv_ruleEntityReference= ruleEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference565);
            iv_ruleEntityReference=ruleEntityReference();

            state._fsp--;

             current =iv_ruleEntityReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference575); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:316:1: ruleEntityReference returns [EObject current=null] : ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:319:28: ( ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:1: ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:1: ( ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:2: ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:2: ( (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) | ( (otherlv_3= RULE_ID ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
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
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:3: (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:3: (otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:320:5: otherlv_0= 'List[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEntityReference614); 

                        	newLeafNode(otherlv_0, grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0());
                        
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:324:1: ( (otherlv_1= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:325:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:325:1: (otherlv_1= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:326:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityReferenceRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference634); 

                    		newLeafNode(otherlv_1, grammarAccess.getEntityReferenceAccess().getListDestinationEntityCrossReference_0_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEntityReference646); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:342:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:342:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:343:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:343:1: (otherlv_3= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:344:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityReferenceRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference673); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:355:3: ( (lv_name_4_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:356:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:356:1: (lv_name_4_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:357:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference691); 

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

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:373:2: (otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:373:4: otherlv_5= '[inverse=' ( (lv_inverseName_6_0= RULE_ID ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEntityReference709); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0());
                        
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:377:1: ( (lv_inverseName_6_0= RULE_ID ) )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:378:1: (lv_inverseName_6_0= RULE_ID )
                    {
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:378:1: (lv_inverseName_6_0= RULE_ID )
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:379:3: lv_inverseName_6_0= RULE_ID
                    {
                    lv_inverseName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityReference726); 

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

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEntityReference743); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleEntityReference757); 

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


    // $ANTLR start "entryRulePersistence"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:411:1: entryRulePersistence returns [EObject current=null] : iv_rulePersistence= rulePersistence EOF ;
    public final EObject entryRulePersistence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistence = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:412:2: (iv_rulePersistence= rulePersistence EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:413:2: iv_rulePersistence= rulePersistence EOF
            {
             newCompositeNode(grammarAccess.getPersistenceRule()); 
            pushFollow(FOLLOW_rulePersistence_in_entryRulePersistence793);
            iv_rulePersistence=rulePersistence();

            state._fsp--;

             current =iv_rulePersistence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistence803); 

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
    // $ANTLR end "entryRulePersistence"


    // $ANTLR start "rulePersistence"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:420:1: rulePersistence returns [EObject current=null] : (otherlv_0= 'persistence' otherlv_1= '{' ( (lv_persistencePackage_2_0= rulePersistencePackage ) )+ otherlv_3= '}' ) ;
    public final EObject rulePersistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_persistencePackage_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:423:28: ( (otherlv_0= 'persistence' otherlv_1= '{' ( (lv_persistencePackage_2_0= rulePersistencePackage ) )+ otherlv_3= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:424:1: (otherlv_0= 'persistence' otherlv_1= '{' ( (lv_persistencePackage_2_0= rulePersistencePackage ) )+ otherlv_3= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:424:1: (otherlv_0= 'persistence' otherlv_1= '{' ( (lv_persistencePackage_2_0= rulePersistencePackage ) )+ otherlv_3= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:424:3: otherlv_0= 'persistence' otherlv_1= '{' ( (lv_persistencePackage_2_0= rulePersistencePackage ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePersistence840); 

                	newLeafNode(otherlv_0, grammarAccess.getPersistenceAccess().getPersistenceKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePersistence852); 

                	newLeafNode(otherlv_1, grammarAccess.getPersistenceAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:432:1: ( (lv_persistencePackage_2_0= rulePersistencePackage ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:433:1: (lv_persistencePackage_2_0= rulePersistencePackage )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:433:1: (lv_persistencePackage_2_0= rulePersistencePackage )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:434:3: lv_persistencePackage_2_0= rulePersistencePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersistenceAccess().getPersistencePackagePersistencePackageParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePersistencePackage_in_rulePersistence873);
            	    lv_persistencePackage_2_0=rulePersistencePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersistenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persistencePackage",
            	            		lv_persistencePackage_2_0, 
            	            		"PersistencePackage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePersistence886); 

                	newLeafNode(otherlv_3, grammarAccess.getPersistenceAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "rulePersistence"


    // $ANTLR start "entryRulePersistencePackage"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:462:1: entryRulePersistencePackage returns [EObject current=null] : iv_rulePersistencePackage= rulePersistencePackage EOF ;
    public final EObject entryRulePersistencePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistencePackage = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:463:2: (iv_rulePersistencePackage= rulePersistencePackage EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:464:2: iv_rulePersistencePackage= rulePersistencePackage EOF
            {
             newCompositeNode(grammarAccess.getPersistencePackageRule()); 
            pushFollow(FOLLOW_rulePersistencePackage_in_entryRulePersistencePackage922);
            iv_rulePersistencePackage=rulePersistencePackage();

            state._fsp--;

             current =iv_rulePersistencePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistencePackage932); 

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
    // $ANTLR end "entryRulePersistencePackage"


    // $ANTLR start "rulePersistencePackage"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:471:1: rulePersistencePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )+ otherlv_4= '}' ) ;
    public final EObject rulePersistencePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_persistenceEntities_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:474:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )+ otherlv_4= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:475:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )+ otherlv_4= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:475:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )+ otherlv_4= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:475:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePersistencePackage969); 

                	newLeafNode(otherlv_0, grammarAccess.getPersistencePackageAccess().getPackageKeyword_0());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:479:1: ( (lv_name_1_0= rulePackageName ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:480:1: (lv_name_1_0= rulePackageName )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:480:1: (lv_name_1_0= rulePackageName )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:481:3: lv_name_1_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getPersistencePackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_rulePersistencePackage990);
            lv_name_1_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersistencePackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePersistencePackage1002); 

                	newLeafNode(otherlv_2, grammarAccess.getPersistencePackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:501:1: ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:502:1: (lv_persistenceEntities_3_0= rulePersistenceEntity )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:502:1: (lv_persistenceEntities_3_0= rulePersistenceEntity )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:503:3: lv_persistenceEntities_3_0= rulePersistenceEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePersistenceEntity_in_rulePersistencePackage1023);
            	    lv_persistenceEntities_3_0=rulePersistenceEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersistencePackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persistenceEntities",
            	            		lv_persistenceEntities_3_0, 
            	            		"PersistenceEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePersistencePackage1036); 

                	newLeafNode(otherlv_4, grammarAccess.getPersistencePackageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePersistencePackage"


    // $ANTLR start "entryRulePersistenceEntity"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:531:1: entryRulePersistenceEntity returns [EObject current=null] : iv_rulePersistenceEntity= rulePersistenceEntity EOF ;
    public final EObject entryRulePersistenceEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceEntity = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:532:2: (iv_rulePersistenceEntity= rulePersistenceEntity EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:533:2: iv_rulePersistenceEntity= rulePersistenceEntity EOF
            {
             newCompositeNode(grammarAccess.getPersistenceEntityRule()); 
            pushFollow(FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity1072);
            iv_rulePersistenceEntity=rulePersistenceEntity();

            state._fsp--;

             current =iv_rulePersistenceEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceEntity1082); 

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
    // $ANTLR end "entryRulePersistenceEntity"


    // $ANTLR start "rulePersistenceEntity"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:540:1: rulePersistenceEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceProperties_3_0= rulePersistenceProperty ) )+ otherlv_4= '}' ) ;
    public final EObject rulePersistenceEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_persistenceProperties_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:543:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceProperties_3_0= rulePersistenceProperty ) )+ otherlv_4= '}' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:544:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceProperties_3_0= rulePersistenceProperty ) )+ otherlv_4= '}' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:544:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceProperties_3_0= rulePersistenceProperty ) )+ otherlv_4= '}' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:544:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceProperties_3_0= rulePersistenceProperty ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePersistenceEntity1119); 

                	newLeafNode(otherlv_0, grammarAccess.getPersistenceEntityAccess().getEntityKeyword_0());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:548:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:549:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:549:1: (lv_name_1_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:550:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersistenceEntity1136); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersistenceEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePersistenceEntity1153); 

                	newLeafNode(otherlv_2, grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:570:1: ( (lv_persistenceProperties_3_0= rulePersistenceProperty ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:571:1: (lv_persistenceProperties_3_0= rulePersistenceProperty )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:571:1: (lv_persistenceProperties_3_0= rulePersistenceProperty )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:572:3: lv_persistenceProperties_3_0= rulePersistenceProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesPersistencePropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePersistenceProperty_in_rulePersistenceEntity1174);
            	    lv_persistenceProperties_3_0=rulePersistenceProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersistenceEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persistenceProperties",
            	            		lv_persistenceProperties_3_0, 
            	            		"PersistenceProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePersistenceEntity1187); 

                	newLeafNode(otherlv_4, grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePersistenceEntity"


    // $ANTLR start "entryRulePersistenceProperty"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:600:1: entryRulePersistenceProperty returns [EObject current=null] : iv_rulePersistenceProperty= rulePersistenceProperty EOF ;
    public final EObject entryRulePersistenceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceProperty = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:601:2: (iv_rulePersistenceProperty= rulePersistenceProperty EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:602:2: iv_rulePersistenceProperty= rulePersistenceProperty EOF
            {
             newCompositeNode(grammarAccess.getPersistencePropertyRule()); 
            pushFollow(FOLLOW_rulePersistenceProperty_in_entryRulePersistenceProperty1223);
            iv_rulePersistenceProperty=rulePersistenceProperty();

            state._fsp--;

             current =iv_rulePersistenceProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceProperty1233); 

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
    // $ANTLR end "entryRulePersistenceProperty"


    // $ANTLR start "rulePersistenceProperty"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:609:1: rulePersistenceProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_config_2_0= rulePersistencePropertyConfig ) ) (otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePersistenceProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_config_2_0 = null;

        EObject lv_config_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:612:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_config_2_0= rulePersistencePropertyConfig ) ) (otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) ) )* otherlv_5= ')' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_config_2_0= rulePersistencePropertyConfig ) ) (otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) ) )* otherlv_5= ')' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_config_2_0= rulePersistencePropertyConfig ) ) (otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) ) )* otherlv_5= ')' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:613:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_config_2_0= rulePersistencePropertyConfig ) ) (otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) ) )* otherlv_5= ')'
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:613:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:614:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:614:1: (lv_name_0_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:615:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersistenceProperty1275); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPersistencePropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersistencePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePersistenceProperty1292); 

                	newLeafNode(otherlv_1, grammarAccess.getPersistencePropertyAccess().getLeftParenthesisKeyword_1());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:635:1: ( (lv_config_2_0= rulePersistencePropertyConfig ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:636:1: (lv_config_2_0= rulePersistencePropertyConfig )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:636:1: (lv_config_2_0= rulePersistencePropertyConfig )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:637:3: lv_config_2_0= rulePersistencePropertyConfig
            {
             
            	        newCompositeNode(grammarAccess.getPersistencePropertyAccess().getConfigPersistencePropertyConfigParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePersistencePropertyConfig_in_rulePersistenceProperty1313);
            lv_config_2_0=rulePersistencePropertyConfig();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersistencePropertyRule());
            	        }
                   		add(
                   			current, 
                   			"config",
                    		lv_config_2_0, 
                    		"PersistencePropertyConfig");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:653:2: (otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:653:4: otherlv_3= ',' ( (lv_config_4_0= rulePersistencePropertyConfig ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePersistenceProperty1326); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPersistencePropertyAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:657:1: ( (lv_config_4_0= rulePersistencePropertyConfig ) )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:658:1: (lv_config_4_0= rulePersistencePropertyConfig )
            	    {
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:658:1: (lv_config_4_0= rulePersistencePropertyConfig )
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:659:3: lv_config_4_0= rulePersistencePropertyConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersistencePropertyAccess().getConfigPersistencePropertyConfigParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePersistencePropertyConfig_in_rulePersistenceProperty1347);
            	    lv_config_4_0=rulePersistencePropertyConfig();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersistencePropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"config",
            	            		lv_config_4_0, 
            	            		"PersistencePropertyConfig");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulePersistenceProperty1361); 

                	newLeafNode(otherlv_5, grammarAccess.getPersistencePropertyAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "rulePersistenceProperty"


    // $ANTLR start "entryRulePersistencePropertyConfig"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:687:1: entryRulePersistencePropertyConfig returns [EObject current=null] : iv_rulePersistencePropertyConfig= rulePersistencePropertyConfig EOF ;
    public final EObject entryRulePersistencePropertyConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistencePropertyConfig = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:688:2: (iv_rulePersistencePropertyConfig= rulePersistencePropertyConfig EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:689:2: iv_rulePersistencePropertyConfig= rulePersistencePropertyConfig EOF
            {
             newCompositeNode(grammarAccess.getPersistencePropertyConfigRule()); 
            pushFollow(FOLLOW_rulePersistencePropertyConfig_in_entryRulePersistencePropertyConfig1397);
            iv_rulePersistencePropertyConfig=rulePersistencePropertyConfig();

            state._fsp--;

             current =iv_rulePersistencePropertyConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistencePropertyConfig1407); 

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
    // $ANTLR end "entryRulePersistencePropertyConfig"


    // $ANTLR start "rulePersistencePropertyConfig"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:696:1: rulePersistencePropertyConfig returns [EObject current=null] : ( ( (lv_propertyConfigKey_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyConfigValue_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePersistencePropertyConfig() throws RecognitionException {
        EObject current = null;

        Token lv_propertyConfigKey_0_0=null;
        Token otherlv_1=null;
        Token lv_propertyConfigValue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:699:28: ( ( ( (lv_propertyConfigKey_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyConfigValue_2_0= RULE_STRING ) ) ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:700:1: ( ( (lv_propertyConfigKey_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyConfigValue_2_0= RULE_STRING ) ) )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:700:1: ( ( (lv_propertyConfigKey_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyConfigValue_2_0= RULE_STRING ) ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:700:2: ( (lv_propertyConfigKey_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_propertyConfigValue_2_0= RULE_STRING ) )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:700:2: ( (lv_propertyConfigKey_0_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:701:1: (lv_propertyConfigKey_0_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:701:1: (lv_propertyConfigKey_0_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:702:3: lv_propertyConfigKey_0_0= RULE_ID
            {
            lv_propertyConfigKey_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersistencePropertyConfig1449); 

            			newLeafNode(lv_propertyConfigKey_0_0, grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigKeyIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersistencePropertyConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyConfigKey",
                    		lv_propertyConfigKey_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePersistencePropertyConfig1466); 

                	newLeafNode(otherlv_1, grammarAccess.getPersistencePropertyConfigAccess().getEqualsSignKeyword_1());
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:722:1: ( (lv_propertyConfigValue_2_0= RULE_STRING ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:723:1: (lv_propertyConfigValue_2_0= RULE_STRING )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:723:1: (lv_propertyConfigValue_2_0= RULE_STRING )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:724:3: lv_propertyConfigValue_2_0= RULE_STRING
            {
            lv_propertyConfigValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePersistencePropertyConfig1483); 

            			newLeafNode(lv_propertyConfigValue_2_0, grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersistencePropertyConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyConfigValue",
                    		lv_propertyConfigValue_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "rulePersistencePropertyConfig"


    // $ANTLR start "entryRuleEntityProperty"
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:748:1: entryRuleEntityProperty returns [EObject current=null] : iv_ruleEntityProperty= ruleEntityProperty EOF ;
    public final EObject entryRuleEntityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityProperty = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:749:2: (iv_ruleEntityProperty= ruleEntityProperty EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:750:2: iv_ruleEntityProperty= ruleEntityProperty EOF
            {
             newCompositeNode(grammarAccess.getEntityPropertyRule()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty1524);
            iv_ruleEntityProperty=ruleEntityProperty();

            state._fsp--;

             current =iv_ruleEntityProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityProperty1534); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:757:1: ruleEntityProperty returns [EObject current=null] : ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleEntityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_propertyType_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:760:28: ( ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:761:1: ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:761:1: ( ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:761:2: ( (lv_propertyType_0_0= ruleBasicType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:761:2: ( (lv_propertyType_0_0= ruleBasicType ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:762:1: (lv_propertyType_0_0= ruleBasicType )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:762:1: (lv_propertyType_0_0= ruleBasicType )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:763:3: lv_propertyType_0_0= ruleBasicType
            {
             
            	        newCompositeNode(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicType_in_ruleEntityProperty1580);
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

            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:779:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:780:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:780:1: (lv_name_1_0= RULE_ID )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:781:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityProperty1597); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEntityProperty1614); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:809:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:810:2: (iv_rulePackageName= rulePackageName EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:811:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName1651);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName1662); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:818:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:821:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:822:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:822:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:822:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName1702); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:829:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:830:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_rulePackageName1721); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageName1736); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:850:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:851:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:852:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1784);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1795); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:859:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveTypes_0 = null;

        AntlrDatatypeRuleToken this_WrapperTypes_1 = null;

        AntlrDatatypeRuleToken this_DirectSupportedTypes_2 = null;

        AntlrDatatypeRuleToken this_JodaTimeTypes_3 = null;


         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:862:28: ( (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:863:1: (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:863:1: (this_PrimitiveTypes_0= rulePrimitiveTypes | this_WrapperTypes_1= ruleWrapperTypes | this_DirectSupportedTypes_2= ruleDirectSupportedTypes | this_JodaTimeTypes_3= ruleJodaTimeTypes )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt12=1;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 26:
            case 27:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:864:5: this_PrimitiveTypes_0= rulePrimitiveTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_ruleBasicType1842);
                    this_PrimitiveTypes_0=rulePrimitiveTypes();

                    state._fsp--;


                    		current.merge(this_PrimitiveTypes_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:876:5: this_WrapperTypes_1= ruleWrapperTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWrapperTypes_in_ruleBasicType1875);
                    this_WrapperTypes_1=ruleWrapperTypes();

                    state._fsp--;


                    		current.merge(this_WrapperTypes_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:888:5: this_DirectSupportedTypes_2= ruleDirectSupportedTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_ruleBasicType1908);
                    this_DirectSupportedTypes_2=ruleDirectSupportedTypes();

                    state._fsp--;


                    		current.merge(this_DirectSupportedTypes_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:900:5: this_JodaTimeTypes_3= ruleJodaTimeTypes
                    {
                     
                            newCompositeNode(grammarAccess.getBasicTypeAccess().getJodaTimeTypesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleJodaTimeTypes_in_ruleBasicType1941);
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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:918:1: entryRuleJodaTimeTypes returns [String current=null] : iv_ruleJodaTimeTypes= ruleJodaTimeTypes EOF ;
    public final String entryRuleJodaTimeTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJodaTimeTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:919:2: (iv_ruleJodaTimeTypes= ruleJodaTimeTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:920:2: iv_ruleJodaTimeTypes= ruleJodaTimeTypes EOF
            {
             newCompositeNode(grammarAccess.getJodaTimeTypesRule()); 
            pushFollow(FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes1987);
            iv_ruleJodaTimeTypes=ruleJodaTimeTypes();

            state._fsp--;

             current =iv_ruleJodaTimeTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJodaTimeTypes1998); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:927:1: ruleJodaTimeTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DateTime' | kw= 'Instant' ) ;
    public final AntlrDatatypeRuleToken ruleJodaTimeTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:930:28: ( (kw= 'DateTime' | kw= 'Instant' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:931:1: (kw= 'DateTime' | kw= 'Instant' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:931:1: (kw= 'DateTime' | kw= 'Instant' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:932:2: kw= 'DateTime'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleJodaTimeTypes2036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:939:2: kw= 'Instant'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleJodaTimeTypes2055); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:952:1: entryRuleDirectSupportedTypes returns [String current=null] : iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF ;
    public final String entryRuleDirectSupportedTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirectSupportedTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:953:2: (iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:954:2: iv_ruleDirectSupportedTypes= ruleDirectSupportedTypes EOF
            {
             newCompositeNode(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes2096);
            iv_ruleDirectSupportedTypes=ruleDirectSupportedTypes();

            state._fsp--;

             current =iv_ruleDirectSupportedTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes2107); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:961:1: ruleDirectSupportedTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleDirectSupportedTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:964:28: (kw= 'String' )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:966:2: kw= 'String'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleDirectSupportedTypes2144); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:979:1: entryRuleWrapperTypes returns [String current=null] : iv_ruleWrapperTypes= ruleWrapperTypes EOF ;
    public final String entryRuleWrapperTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWrapperTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:980:2: (iv_ruleWrapperTypes= ruleWrapperTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:981:2: iv_ruleWrapperTypes= ruleWrapperTypes EOF
            {
             newCompositeNode(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes2184);
            iv_ruleWrapperTypes=ruleWrapperTypes();

            state._fsp--;

             current =iv_ruleWrapperTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes2195); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:988:1: ruleWrapperTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' ) ;
    public final AntlrDatatypeRuleToken ruleWrapperTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:991:28: ( (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:992:1: (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:992:1: (kw= 'Byte' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Boolean' | kw= 'Character' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 34:
                {
                alt14=6;
                }
                break;
            case 35:
                {
                alt14=7;
                }
                break;
            case 36:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:993:2: kw= 'Byte'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleWrapperTypes2233); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1000:2: kw= 'Short'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleWrapperTypes2252); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1007:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleWrapperTypes2271); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1014:2: kw= 'Long'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleWrapperTypes2290); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1021:2: kw= 'Float'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleWrapperTypes2309); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1028:2: kw= 'Double'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleWrapperTypes2328); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1035:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleWrapperTypes2347); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1042:2: kw= 'Character'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleWrapperTypes2366); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1055:1: entryRulePrimitiveTypes returns [String current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final String entryRulePrimitiveTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypes = null;


        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1056:2: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1057:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes2407);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();

            state._fsp--;

             current =iv_rulePrimitiveTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes2418); 

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
    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1064:1: rulePrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1067:28: ( (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' ) )
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1068:1: (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' )
            {
            // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1068:1: (kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'boolean' | kw= 'char' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
                {
                alt15=3;
                }
                break;
            case 40:
                {
                alt15=4;
                }
                break;
            case 41:
                {
                alt15=5;
                }
                break;
            case 42:
                {
                alt15=6;
                }
                break;
            case 43:
                {
                alt15=7;
                }
                break;
            case 44:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1069:2: kw= 'byte'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePrimitiveTypes2456); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1076:2: kw= 'short'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulePrimitiveTypes2475); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1083:2: kw= 'int'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulePrimitiveTypes2494); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1090:2: kw= 'long'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulePrimitiveTypes2513); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1097:2: kw= 'float'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_rulePrimitiveTypes2532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1104:2: kw= 'double'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_rulePrimitiveTypes2551); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1111:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulePrimitiveTypes2570); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl/src-gen/com/idobjects/dsl/parser/antlr/internal/InternalIdObjectsDsl.g:1118:2: kw= 'char'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulePrimitiveTypes2589); 

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
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleModel155 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel176 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_rulePersistence_in_ruleModel198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePackage303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage315 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackage336 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePackage349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEntity432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity466 = new BitSet(new long[]{0x00001FFFFC028010L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_ruleEntity488 = new BitSet(new long[]{0x00001FFFFC028010L});
    public static final BitSet FOLLOW_ruleEntityReference_in_ruleEntity515 = new BitSet(new long[]{0x00001FFFFC028010L});
    public static final BitSet FOLLOW_15_in_ruleEntity529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntityReference614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference634 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntityReference646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference691 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEntityReference709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityReference726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntityReference743 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntityReference757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistence_in_entryRulePersistence793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistence803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePersistence840 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePersistence852 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rulePersistencePackage_in_rulePersistence873 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_rulePersistence886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePackage_in_entryRulePersistencePackage922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistencePackage932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePersistencePackage969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePersistencePackage990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePersistencePackage1002 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_rulePersistencePackage1023 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePersistencePackage1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceEntity1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePersistenceEntity1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersistenceEntity1136 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePersistenceEntity1153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePersistenceProperty_in_rulePersistenceEntity1174 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePersistenceEntity1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceProperty_in_entryRulePersistenceProperty1223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceProperty1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersistenceProperty1275 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePersistenceProperty1292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePersistencePropertyConfig_in_rulePersistenceProperty1313 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_rulePersistenceProperty1326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePersistencePropertyConfig_in_rulePersistenceProperty1347 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_rulePersistenceProperty1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePropertyConfig_in_entryRulePersistencePropertyConfig1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistencePropertyConfig1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersistencePropertyConfig1449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePersistencePropertyConfig1466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePersistencePropertyConfig1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityProperty1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleEntityProperty1580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityProperty1597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntityProperty1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName1651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName1702 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rulePackageName1721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageName1736 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_ruleBasicType1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_ruleBasicType1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_ruleBasicType1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_ruleBasicType1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJodaTimeTypes1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJodaTimeTypes2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleJodaTimeTypes2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes2096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDirectSupportedTypes2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleWrapperTypes2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleWrapperTypes2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleWrapperTypes2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleWrapperTypes2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleWrapperTypes2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleWrapperTypes2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleWrapperTypes2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleWrapperTypes2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimitiveTypes2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitiveTypes2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimitiveTypes2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimitiveTypes2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrimitiveTypes2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrimitiveTypes2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrimitiveTypes2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrimitiveTypes2589 = new BitSet(new long[]{0x0000000000000002L});

}