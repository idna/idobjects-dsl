package com.idobjects.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.idobjects.dsl.services.IdObjectsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIdObjectsDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'DateTime'", "'Instant'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'", "'package'", "'{'", "'}'", "'entity'", "'extends'", "';'", "'List['", "']'", "'[inverse='", "'.'"
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
    public String getGrammarFileName() { return "../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g"; }


     
     	private IdObjectsDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IdObjectsDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:62:1: ( ruleModel EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:70:1: ruleModel : ( ( rule__Model__PackagesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:74:2: ( ( ( rule__Model__PackagesAssignment )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:75:1: ( ( rule__Model__PackagesAssignment )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:75:1: ( ( rule__Model__PackagesAssignment )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:76:1: ( rule__Model__PackagesAssignment )*
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:77:1: ( rule__Model__PackagesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:77:2: rule__Model__PackagesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_in_ruleModel94);
            	    rule__Model__PackagesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:89:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:90:1: ( rulePackage EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:91:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage122);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:98:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:102:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:103:1: ( ( rule__Package__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:103:1: ( ( rule__Package__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:104:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:105:1: ( rule__Package__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:105:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage155);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEntity"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:117:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:118:1: ( ruleEntity EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:119:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity182);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:126:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:130:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:131:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:131:1: ( ( rule__Entity__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:132:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:133:1: ( rule__Entity__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:133:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity215);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityReference"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:145:1: entryRuleEntityReference : ruleEntityReference EOF ;
    public final void entryRuleEntityReference() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:146:1: ( ruleEntityReference EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:147:1: ruleEntityReference EOF
            {
             before(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference242);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityReference"


    // $ANTLR start "ruleEntityReference"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:154:1: ruleEntityReference : ( ( rule__EntityReference__Group__0 ) ) ;
    public final void ruleEntityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:158:2: ( ( ( rule__EntityReference__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:159:1: ( ( rule__EntityReference__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:159:1: ( ( rule__EntityReference__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:160:1: ( rule__EntityReference__Group__0 )
            {
             before(grammarAccess.getEntityReferenceAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:161:1: ( rule__EntityReference__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:161:2: rule__EntityReference__Group__0
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference275);
            rule__EntityReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityReference"


    // $ANTLR start "entryRuleEntityProperty"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:175:1: entryRuleEntityProperty : ruleEntityProperty EOF ;
    public final void entryRuleEntityProperty() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:176:1: ( ruleEntityProperty EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:177:1: ruleEntityProperty EOF
            {
             before(grammarAccess.getEntityPropertyRule()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty304);
            ruleEntityProperty();

            state._fsp--;

             after(grammarAccess.getEntityPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityProperty311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityProperty"


    // $ANTLR start "ruleEntityProperty"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:184:1: ruleEntityProperty : ( ( rule__EntityProperty__Group__0 ) ) ;
    public final void ruleEntityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:188:2: ( ( ( rule__EntityProperty__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:189:1: ( ( rule__EntityProperty__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:189:1: ( ( rule__EntityProperty__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:190:1: ( rule__EntityProperty__Group__0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:191:1: ( rule__EntityProperty__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:191:2: rule__EntityProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0_in_ruleEntityProperty337);
            rule__EntityProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityProperty"


    // $ANTLR start "entryRulePackageName"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:203:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:204:1: ( rulePackageName EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:205:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName364);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:212:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:216:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:217:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:217:1: ( ( rule__PackageName__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:218:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:219:1: ( rule__PackageName__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:219:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName397);
            rule__PackageName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleBasicType"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:231:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:232:1: ( ruleBasicType EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:233:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType424);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:240:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:244:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:245:1: ( ( rule__BasicType__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:245:1: ( ( rule__BasicType__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:246:1: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:247:1: ( rule__BasicType__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:247:2: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType457);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleJodaTimeTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:259:1: entryRuleJodaTimeTypes : ruleJodaTimeTypes EOF ;
    public final void entryRuleJodaTimeTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:260:1: ( ruleJodaTimeTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:261:1: ruleJodaTimeTypes EOF
            {
             before(grammarAccess.getJodaTimeTypesRule()); 
            pushFollow(FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes484);
            ruleJodaTimeTypes();

            state._fsp--;

             after(grammarAccess.getJodaTimeTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJodaTimeTypes491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJodaTimeTypes"


    // $ANTLR start "ruleJodaTimeTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:268:1: ruleJodaTimeTypes : ( ( rule__JodaTimeTypes__Alternatives ) ) ;
    public final void ruleJodaTimeTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:272:2: ( ( ( rule__JodaTimeTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( ( rule__JodaTimeTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( ( rule__JodaTimeTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:274:1: ( rule__JodaTimeTypes__Alternatives )
            {
             before(grammarAccess.getJodaTimeTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:275:1: ( rule__JodaTimeTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:275:2: rule__JodaTimeTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__JodaTimeTypes__Alternatives_in_ruleJodaTimeTypes517);
            rule__JodaTimeTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJodaTimeTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJodaTimeTypes"


    // $ANTLR start "entryRuleDirectSupportedTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:287:1: entryRuleDirectSupportedTypes : ruleDirectSupportedTypes EOF ;
    public final void entryRuleDirectSupportedTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:288:1: ( ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:289:1: ruleDirectSupportedTypes EOF
            {
             before(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes544);
            ruleDirectSupportedTypes();

            state._fsp--;

             after(grammarAccess.getDirectSupportedTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectSupportedTypes"


    // $ANTLR start "ruleDirectSupportedTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:296:1: ruleDirectSupportedTypes : ( 'String' ) ;
    public final void ruleDirectSupportedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:300:2: ( ( 'String' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:301:1: ( 'String' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:301:1: ( 'String' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:302:1: 'String'
            {
             before(grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 
            match(input,11,FOLLOW_11_in_ruleDirectSupportedTypes578); 
             after(grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectSupportedTypes"


    // $ANTLR start "entryRuleWrapperTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:317:1: entryRuleWrapperTypes : ruleWrapperTypes EOF ;
    public final void entryRuleWrapperTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:318:1: ( ruleWrapperTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:319:1: ruleWrapperTypes EOF
            {
             before(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes606);
            ruleWrapperTypes();

            state._fsp--;

             after(grammarAccess.getWrapperTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes613); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWrapperTypes"


    // $ANTLR start "ruleWrapperTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:326:1: ruleWrapperTypes : ( ( rule__WrapperTypes__Alternatives ) ) ;
    public final void ruleWrapperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:330:2: ( ( ( rule__WrapperTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:331:1: ( ( rule__WrapperTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:331:1: ( ( rule__WrapperTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:332:1: ( rule__WrapperTypes__Alternatives )
            {
             before(grammarAccess.getWrapperTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:333:1: ( rule__WrapperTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:333:2: rule__WrapperTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes639);
            rule__WrapperTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWrapperTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWrapperTypes"


    // $ANTLR start "entryRulePrimitiveTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:345:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:346:1: ( rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:347:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes666);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes673); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:354:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:358:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:359:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:359:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:360:1: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:361:1: ( rule__PrimitiveTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:361:2: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes699);
            rule__PrimitiveTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "rule__Entity__Alternatives_4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:373:1: rule__Entity__Alternatives_4 : ( ( ( rule__Entity__PropertiesAssignment_4_0 ) ) | ( ( rule__Entity__ReferencesAssignment_4_1 ) ) );
    public final void rule__Entity__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:377:1: ( ( ( rule__Entity__PropertiesAssignment_4_0 ) ) | ( ( rule__Entity__ReferencesAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=29)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:378:1: ( ( rule__Entity__PropertiesAssignment_4_0 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:378:1: ( ( rule__Entity__PropertiesAssignment_4_0 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:379:1: ( rule__Entity__PropertiesAssignment_4_0 )
                    {
                     before(grammarAccess.getEntityAccess().getPropertiesAssignment_4_0()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:380:1: ( rule__Entity__PropertiesAssignment_4_0 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:380:2: rule__Entity__PropertiesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_0_in_rule__Entity__Alternatives_4735);
                    rule__Entity__PropertiesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getPropertiesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:384:6: ( ( rule__Entity__ReferencesAssignment_4_1 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:384:6: ( ( rule__Entity__ReferencesAssignment_4_1 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:385:1: ( rule__Entity__ReferencesAssignment_4_1 )
                    {
                     before(grammarAccess.getEntityAccess().getReferencesAssignment_4_1()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:386:1: ( rule__Entity__ReferencesAssignment_4_1 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:386:2: rule__Entity__ReferencesAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Entity__ReferencesAssignment_4_1_in_rule__Entity__Alternatives_4753);
                    rule__Entity__ReferencesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getReferencesAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives_4"


    // $ANTLR start "rule__EntityReference__Alternatives_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:395:1: rule__EntityReference__Alternatives_0 : ( ( ( rule__EntityReference__Group_0_0__0 ) ) | ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) ) );
    public final void rule__EntityReference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:399:1: ( ( ( rule__EntityReference__Group_0_0__0 ) ) | ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:400:1: ( ( rule__EntityReference__Group_0_0__0 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:400:1: ( ( rule__EntityReference__Group_0_0__0 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:401:1: ( rule__EntityReference__Group_0_0__0 )
                    {
                     before(grammarAccess.getEntityReferenceAccess().getGroup_0_0()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:402:1: ( rule__EntityReference__Group_0_0__0 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:402:2: rule__EntityReference__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__EntityReference__Group_0_0__0_in_rule__EntityReference__Alternatives_0786);
                    rule__EntityReference__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityReferenceAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:406:6: ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:406:6: ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:407:1: ( rule__EntityReference__SingleDestinationAssignment_0_1 )
                    {
                     before(grammarAccess.getEntityReferenceAccess().getSingleDestinationAssignment_0_1()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:408:1: ( rule__EntityReference__SingleDestinationAssignment_0_1 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:408:2: rule__EntityReference__SingleDestinationAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__EntityReference__SingleDestinationAssignment_0_1_in_rule__EntityReference__Alternatives_0804);
                    rule__EntityReference__SingleDestinationAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityReferenceAccess().getSingleDestinationAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Alternatives_0"


    // $ANTLR start "rule__BasicType__Alternatives"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:417:1: rule__BasicType__Alternatives : ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) | ( ruleJodaTimeTypes ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:421:1: ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) | ( ruleJodaTimeTypes ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt4=1;
                }
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            case 12:
            case 13:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:422:1: ( rulePrimitiveTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:422:1: ( rulePrimitiveTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:423:1: rulePrimitiveTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives837);
                    rulePrimitiveTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:428:6: ( ruleWrapperTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:428:6: ( ruleWrapperTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:429:1: ruleWrapperTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives854);
                    ruleWrapperTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:434:6: ( ruleDirectSupportedTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:434:6: ( ruleDirectSupportedTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:435:1: ruleDirectSupportedTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives871);
                    ruleDirectSupportedTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:440:6: ( ruleJodaTimeTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:440:6: ( ruleJodaTimeTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:441:1: ruleJodaTimeTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getJodaTimeTypesParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleJodaTimeTypes_in_rule__BasicType__Alternatives888);
                    ruleJodaTimeTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getJodaTimeTypesParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__JodaTimeTypes__Alternatives"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:451:1: rule__JodaTimeTypes__Alternatives : ( ( 'DateTime' ) | ( 'Instant' ) );
    public final void rule__JodaTimeTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:455:1: ( ( 'DateTime' ) | ( 'Instant' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:456:1: ( 'DateTime' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:456:1: ( 'DateTime' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:457:1: 'DateTime'
                    {
                     before(grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__JodaTimeTypes__Alternatives921); 
                     after(grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:464:6: ( 'Instant' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:464:6: ( 'Instant' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:465:1: 'Instant'
                    {
                     before(grammarAccess.getJodaTimeTypesAccess().getInstantKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__JodaTimeTypes__Alternatives941); 
                     after(grammarAccess.getJodaTimeTypesAccess().getInstantKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JodaTimeTypes__Alternatives"


    // $ANTLR start "rule__WrapperTypes__Alternatives"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:477:1: rule__WrapperTypes__Alternatives : ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) );
    public final void rule__WrapperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:481:1: ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
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
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:482:1: ( 'Byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:482:1: ( 'Byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:483:1: 'Byte'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__WrapperTypes__Alternatives976); 
                     after(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:490:6: ( 'Short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:490:6: ( 'Short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:491:1: 'Short'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__WrapperTypes__Alternatives996); 
                     after(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:498:6: ( 'Integer' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:498:6: ( 'Integer' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:499:1: 'Integer'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__WrapperTypes__Alternatives1016); 
                     after(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:506:6: ( 'Long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:506:6: ( 'Long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:507:1: 'Long'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                    match(input,17,FOLLOW_17_in_rule__WrapperTypes__Alternatives1036); 
                     after(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:514:6: ( 'Float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:514:6: ( 'Float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:515:1: 'Float'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                    match(input,18,FOLLOW_18_in_rule__WrapperTypes__Alternatives1056); 
                     after(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:522:6: ( 'Double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:522:6: ( 'Double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:523:1: 'Double'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                    match(input,19,FOLLOW_19_in_rule__WrapperTypes__Alternatives1076); 
                     after(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:530:6: ( 'Boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:530:6: ( 'Boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:531:1: 'Boolean'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                    match(input,20,FOLLOW_20_in_rule__WrapperTypes__Alternatives1096); 
                     after(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:538:6: ( 'Character' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:538:6: ( 'Character' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:539:1: 'Character'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 
                    match(input,21,FOLLOW_21_in_rule__WrapperTypes__Alternatives1116); 
                     after(grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrapperTypes__Alternatives"


    // $ANTLR start "rule__PrimitiveTypes__Alternatives"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:551:1: rule__PrimitiveTypes__Alternatives : ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:555:1: ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            case 28:
                {
                alt7=7;
                }
                break;
            case 29:
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
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:556:1: ( 'byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:556:1: ( 'byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:557:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__PrimitiveTypes__Alternatives1151); 
                     after(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:564:6: ( 'short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:564:6: ( 'short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:565:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__PrimitiveTypes__Alternatives1171); 
                     after(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:572:6: ( 'int' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:572:6: ( 'int' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:573:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__PrimitiveTypes__Alternatives1191); 
                     after(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:580:6: ( 'long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:580:6: ( 'long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:581:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                    match(input,25,FOLLOW_25_in_rule__PrimitiveTypes__Alternatives1211); 
                     after(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:588:6: ( 'float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:588:6: ( 'float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:589:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                    match(input,26,FOLLOW_26_in_rule__PrimitiveTypes__Alternatives1231); 
                     after(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:596:6: ( 'double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:596:6: ( 'double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:597:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                    match(input,27,FOLLOW_27_in_rule__PrimitiveTypes__Alternatives1251); 
                     after(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:604:6: ( 'boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:604:6: ( 'boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:605:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                    match(input,28,FOLLOW_28_in_rule__PrimitiveTypes__Alternatives1271); 
                     after(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:612:6: ( 'char' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:612:6: ( 'char' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:613:1: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 
                    match(input,29,FOLLOW_29_in_rule__PrimitiveTypes__Alternatives1291); 
                     after(grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:627:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:631:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:632:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01323);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01326);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:639:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:643:1: ( ( 'package' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:644:1: ( 'package' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:644:1: ( 'package' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:645:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Package__Group__0__Impl1354); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:658:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:662:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:663:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11385);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11388);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:670:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:674:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:675:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:675:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:676:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:677:1: ( rule__Package__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:677:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1415);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:687:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:691:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:692:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21445);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21448);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:699:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:703:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:704:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:704:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:705:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Package__Group__2__Impl1476); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:718:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:722:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:723:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31507);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31510);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:730:1: rule__Package__Group__3__Impl : ( ( rule__Package__EntitiesAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:734:1: ( ( ( rule__Package__EntitiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:735:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:735:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:736:1: ( rule__Package__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:737:1: ( rule__Package__EntitiesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:737:2: rule__Package__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl1537);
            	    rule__Package__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:747:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:751:1: ( rule__Package__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:752:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41568);
            rule__Package__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:758:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:762:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:763:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:763:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:764:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Package__Group__4__Impl1596); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:787:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:791:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:792:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01637);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01640);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:799:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:803:1: ( ( 'entity' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:804:1: ( 'entity' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:804:1: ( 'entity' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:805:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__0__Impl1668); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:818:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:822:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:823:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11699);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11702);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:830:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:834:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:835:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:835:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:836:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:837:1: ( rule__Entity__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:837:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1729);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:847:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:851:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:852:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21759);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21762);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:859:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:863:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:864:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:864:1: ( ( rule__Entity__Group_2__0 )? )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:865:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:866:1: ( rule__Entity__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:866:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1789);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:876:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:880:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:881:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31820);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31823);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:888:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:892:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:893:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:893:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:894:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Entity__Group__3__Impl1851); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:907:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:911:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:912:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41882);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41885);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:919:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Alternatives_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:923:1: ( ( ( rule__Entity__Alternatives_4 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:924:1: ( ( rule__Entity__Alternatives_4 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:924:1: ( ( rule__Entity__Alternatives_4 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:925:1: ( rule__Entity__Alternatives_4 )*
            {
             before(grammarAccess.getEntityAccess().getAlternatives_4()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:926:1: ( rule__Entity__Alternatives_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=29)||LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:926:2: rule__Entity__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__Alternatives_4_in_rule__Entity__Group__4__Impl1912);
            	    rule__Entity__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:936:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:940:1: ( rule__Entity__Group__5__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:941:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51943);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:947:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:951:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:952:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:952:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:953:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__Entity__Group__5__Impl1971); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:978:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:982:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:983:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02014);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02017);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:990:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:994:1: ( ( 'extends' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:995:1: ( 'extends' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:995:1: ( 'extends' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:996:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Entity__Group_2__0__Impl2045); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1009:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1013:1: ( rule__Entity__Group_2__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1014:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12076);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1020:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1024:1: ( ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1025:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1025:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1026:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1027:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1027:2: rule__Entity__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__1__Impl2103);
            rule__Entity__SuperEntityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__EntityReference__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1041:1: rule__EntityReference__Group__0 : rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 ;
    public final void rule__EntityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1045:1: ( rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1046:2: rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__02137);
            rule__EntityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__02140);
            rule__EntityReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__0"


    // $ANTLR start "rule__EntityReference__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1053:1: rule__EntityReference__Group__0__Impl : ( ( rule__EntityReference__Alternatives_0 ) ) ;
    public final void rule__EntityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1057:1: ( ( ( rule__EntityReference__Alternatives_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1058:1: ( ( rule__EntityReference__Alternatives_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1058:1: ( ( rule__EntityReference__Alternatives_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1059:1: ( rule__EntityReference__Alternatives_0 )
            {
             before(grammarAccess.getEntityReferenceAccess().getAlternatives_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1060:1: ( rule__EntityReference__Alternatives_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1060:2: rule__EntityReference__Alternatives_0
            {
            pushFollow(FOLLOW_rule__EntityReference__Alternatives_0_in_rule__EntityReference__Group__0__Impl2167);
            rule__EntityReference__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__0__Impl"


    // $ANTLR start "rule__EntityReference__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1070:1: rule__EntityReference__Group__1 : rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2 ;
    public final void rule__EntityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1074:1: ( rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1075:2: rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__12197);
            rule__EntityReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__2_in_rule__EntityReference__Group__12200);
            rule__EntityReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__1"


    // $ANTLR start "rule__EntityReference__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1082:1: rule__EntityReference__Group__1__Impl : ( ( rule__EntityReference__NameAssignment_1 ) ) ;
    public final void rule__EntityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1086:1: ( ( ( rule__EntityReference__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1087:1: ( ( rule__EntityReference__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1087:1: ( ( rule__EntityReference__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1088:1: ( rule__EntityReference__NameAssignment_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1089:1: ( rule__EntityReference__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1089:2: rule__EntityReference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityReference__NameAssignment_1_in_rule__EntityReference__Group__1__Impl2227);
            rule__EntityReference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__1__Impl"


    // $ANTLR start "rule__EntityReference__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1099:1: rule__EntityReference__Group__2 : rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3 ;
    public final void rule__EntityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1103:1: ( rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1104:2: rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__2__Impl_in_rule__EntityReference__Group__22257);
            rule__EntityReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__3_in_rule__EntityReference__Group__22260);
            rule__EntityReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__2"


    // $ANTLR start "rule__EntityReference__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1111:1: rule__EntityReference__Group__2__Impl : ( ( rule__EntityReference__Group_2__0 )? ) ;
    public final void rule__EntityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1115:1: ( ( ( rule__EntityReference__Group_2__0 )? ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1116:1: ( ( rule__EntityReference__Group_2__0 )? )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1116:1: ( ( rule__EntityReference__Group_2__0 )? )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1117:1: ( rule__EntityReference__Group_2__0 )?
            {
             before(grammarAccess.getEntityReferenceAccess().getGroup_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1118:1: ( rule__EntityReference__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1118:2: rule__EntityReference__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EntityReference__Group_2__0_in_rule__EntityReference__Group__2__Impl2287);
                    rule__EntityReference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityReferenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__2__Impl"


    // $ANTLR start "rule__EntityReference__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1128:1: rule__EntityReference__Group__3 : rule__EntityReference__Group__3__Impl ;
    public final void rule__EntityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1132:1: ( rule__EntityReference__Group__3__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1133:2: rule__EntityReference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__3__Impl_in_rule__EntityReference__Group__32318);
            rule__EntityReference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__3"


    // $ANTLR start "rule__EntityReference__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1139:1: rule__EntityReference__Group__3__Impl : ( ';' ) ;
    public final void rule__EntityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1143:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1144:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1144:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1145:1: ';'
            {
             before(grammarAccess.getEntityReferenceAccess().getSemicolonKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__EntityReference__Group__3__Impl2346); 
             after(grammarAccess.getEntityReferenceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group__3__Impl"


    // $ANTLR start "rule__EntityReference__Group_0_0__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1166:1: rule__EntityReference__Group_0_0__0 : rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1 ;
    public final void rule__EntityReference__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1170:1: ( rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1171:2: rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__0__Impl_in_rule__EntityReference__Group_0_0__02385);
            rule__EntityReference__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__1_in_rule__EntityReference__Group_0_0__02388);
            rule__EntityReference__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_0_0__0"


    // $ANTLR start "rule__EntityReference__Group_0_0__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1178:1: rule__EntityReference__Group_0_0__0__Impl : ( 'List[' ) ;
    public final void rule__EntityReference__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1182:1: ( ( 'List[' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1183:1: ( 'List[' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1183:1: ( 'List[' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1184:1: 'List['
            {
             before(grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0()); 
            match(input,36,FOLLOW_36_in_rule__EntityReference__Group_0_0__0__Impl2416); 
             after(grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_0_0__0__Impl"


    // $ANTLR start "rule__EntityReference__Group_0_0__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1197:1: rule__EntityReference__Group_0_0__1 : rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2 ;
    public final void rule__EntityReference__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1201:1: ( rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1202:2: rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__1__Impl_in_rule__EntityReference__Group_0_0__12447);
            rule__EntityReference__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__2_in_rule__EntityReference__Group_0_0__12450);
            rule__EntityReference__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_0_0__1"


    // $ANTLR start "rule__EntityReference__Group_0_0__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1209:1: rule__EntityReference__Group_0_0__1__Impl : ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) ) ;
    public final void rule__EntityReference__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1213:1: ( ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1214:1: ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1214:1: ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1215:1: ( rule__EntityReference__ListDestinationAssignment_0_0_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationAssignment_0_0_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1216:1: ( rule__EntityReference__ListDestinationAssignment_0_0_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1216:2: rule__EntityReference__ListDestinationAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__EntityReference__ListDestinationAssignment_0_0_1_in_rule__EntityReference__Group_0_0__1__Impl2477);
            rule__EntityReference__ListDestinationAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getListDestinationAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_0_0__1__Impl"


    // $ANTLR start "rule__EntityReference__Group_0_0__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1226:1: rule__EntityReference__Group_0_0__2 : rule__EntityReference__Group_0_0__2__Impl ;
    public final void rule__EntityReference__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1230:1: ( rule__EntityReference__Group_0_0__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1231:2: rule__EntityReference__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__2__Impl_in_rule__EntityReference__Group_0_0__22507);
            rule__EntityReference__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_0_0__2"


    // $ANTLR start "rule__EntityReference__Group_0_0__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1237:1: rule__EntityReference__Group_0_0__2__Impl : ( ']' ) ;
    public final void rule__EntityReference__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1241:1: ( ( ']' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1242:1: ( ']' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1242:1: ( ']' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1243:1: ']'
            {
             before(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2()); 
            match(input,37,FOLLOW_37_in_rule__EntityReference__Group_0_0__2__Impl2535); 
             after(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_0_0__2__Impl"


    // $ANTLR start "rule__EntityReference__Group_2__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1262:1: rule__EntityReference__Group_2__0 : rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1 ;
    public final void rule__EntityReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1266:1: ( rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1267:2: rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__0__Impl_in_rule__EntityReference__Group_2__02572);
            rule__EntityReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_2__1_in_rule__EntityReference__Group_2__02575);
            rule__EntityReference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_2__0"


    // $ANTLR start "rule__EntityReference__Group_2__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1274:1: rule__EntityReference__Group_2__0__Impl : ( '[inverse=' ) ;
    public final void rule__EntityReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1278:1: ( ( '[inverse=' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1279:1: ( '[inverse=' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1279:1: ( '[inverse=' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1280:1: '[inverse='
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__EntityReference__Group_2__0__Impl2603); 
             after(grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_2__0__Impl"


    // $ANTLR start "rule__EntityReference__Group_2__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1293:1: rule__EntityReference__Group_2__1 : rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2 ;
    public final void rule__EntityReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1297:1: ( rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1298:2: rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__1__Impl_in_rule__EntityReference__Group_2__12634);
            rule__EntityReference__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_2__2_in_rule__EntityReference__Group_2__12637);
            rule__EntityReference__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_2__1"


    // $ANTLR start "rule__EntityReference__Group_2__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1305:1: rule__EntityReference__Group_2__1__Impl : ( ( rule__EntityReference__InverseNameAssignment_2_1 ) ) ;
    public final void rule__EntityReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1309:1: ( ( ( rule__EntityReference__InverseNameAssignment_2_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1310:1: ( ( rule__EntityReference__InverseNameAssignment_2_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1310:1: ( ( rule__EntityReference__InverseNameAssignment_2_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1311:1: ( rule__EntityReference__InverseNameAssignment_2_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameAssignment_2_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1312:1: ( rule__EntityReference__InverseNameAssignment_2_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1312:2: rule__EntityReference__InverseNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EntityReference__InverseNameAssignment_2_1_in_rule__EntityReference__Group_2__1__Impl2664);
            rule__EntityReference__InverseNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getInverseNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_2__1__Impl"


    // $ANTLR start "rule__EntityReference__Group_2__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1322:1: rule__EntityReference__Group_2__2 : rule__EntityReference__Group_2__2__Impl ;
    public final void rule__EntityReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1326:1: ( rule__EntityReference__Group_2__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1327:2: rule__EntityReference__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__2__Impl_in_rule__EntityReference__Group_2__22694);
            rule__EntityReference__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_2__2"


    // $ANTLR start "rule__EntityReference__Group_2__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1333:1: rule__EntityReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__EntityReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1337:1: ( ( ']' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1338:1: ( ']' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1338:1: ( ']' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1339:1: ']'
            {
             before(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,37,FOLLOW_37_in_rule__EntityReference__Group_2__2__Impl2722); 
             after(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__Group_2__2__Impl"


    // $ANTLR start "rule__EntityProperty__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1358:1: rule__EntityProperty__Group__0 : rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 ;
    public final void rule__EntityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1362:1: ( rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1363:2: rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__02759);
            rule__EntityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__02762);
            rule__EntityProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__Group__0"


    // $ANTLR start "rule__EntityProperty__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1370:1: rule__EntityProperty__Group__0__Impl : ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) ;
    public final void rule__EntityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1374:1: ( ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1375:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1375:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1376:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeAssignment_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1377:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1377:2: rule__EntityProperty__PropertyTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl2789);
            rule__EntityProperty__PropertyTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityPropertyAccess().getPropertyTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__Group__0__Impl"


    // $ANTLR start "rule__EntityProperty__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1387:1: rule__EntityProperty__Group__1 : rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 ;
    public final void rule__EntityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1391:1: ( rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1392:2: rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__12819);
            rule__EntityProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__12822);
            rule__EntityProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__Group__1"


    // $ANTLR start "rule__EntityProperty__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1399:1: rule__EntityProperty__Group__1__Impl : ( ( rule__EntityProperty__NameAssignment_1 ) ) ;
    public final void rule__EntityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1403:1: ( ( ( rule__EntityProperty__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1404:1: ( ( rule__EntityProperty__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1404:1: ( ( rule__EntityProperty__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1405:1: ( rule__EntityProperty__NameAssignment_1 )
            {
             before(grammarAccess.getEntityPropertyAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1406:1: ( rule__EntityProperty__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1406:2: rule__EntityProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityProperty__NameAssignment_1_in_rule__EntityProperty__Group__1__Impl2849);
            rule__EntityProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__Group__1__Impl"


    // $ANTLR start "rule__EntityProperty__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1416:1: rule__EntityProperty__Group__2 : rule__EntityProperty__Group__2__Impl ;
    public final void rule__EntityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1420:1: ( rule__EntityProperty__Group__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1421:2: rule__EntityProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__22879);
            rule__EntityProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__Group__2"


    // $ANTLR start "rule__EntityProperty__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1427:1: rule__EntityProperty__Group__2__Impl : ( ';' ) ;
    public final void rule__EntityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1431:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1432:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1432:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1433:1: ';'
            {
             before(grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__EntityProperty__Group__2__Impl2907); 
             after(grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__Group__2__Impl"


    // $ANTLR start "rule__PackageName__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1452:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1456:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1457:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__02944);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__02947);
            rule__PackageName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__0"


    // $ANTLR start "rule__PackageName__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1464:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1468:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1469:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1469:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1470:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl2974); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__0__Impl"


    // $ANTLR start "rule__PackageName__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1481:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1485:1: ( rule__PackageName__Group__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1486:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__13003);
            rule__PackageName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__1"


    // $ANTLR start "rule__PackageName__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1492:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1496:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1497:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1497:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1498:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1499:1: ( rule__PackageName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1499:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl3030);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPackageNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group__1__Impl"


    // $ANTLR start "rule__PackageName__Group_1__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1513:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1517:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1518:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__03065);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__03068);
            rule__PackageName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__0"


    // $ANTLR start "rule__PackageName__Group_1__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1525:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1529:1: ( ( '.' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1530:1: ( '.' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1530:1: ( '.' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1531:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__PackageName__Group_1__0__Impl3096); 
             after(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__0__Impl"


    // $ANTLR start "rule__PackageName__Group_1__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1544:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1548:1: ( rule__PackageName__Group_1__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1549:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__13127);
            rule__PackageName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__1"


    // $ANTLR start "rule__PackageName__Group_1__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1555:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1559:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1560:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1560:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1561:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl3154); 
             after(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__PackagesAssignment"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1577:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1581:1: ( ( rulePackage ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1582:1: ( rulePackage )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1582:1: ( rulePackage )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1583:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment3192);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagesAssignment"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1592:1: rule__Package__NameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1596:1: ( ( rulePackageName ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1597:1: ( rulePackageName )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1597:1: ( rulePackageName )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1598:1: rulePackageName
            {
             before(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Package__NameAssignment_13223);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__EntitiesAssignment_3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1607:1: rule__Package__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1611:1: ( ( ruleEntity ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1612:1: ( ruleEntity )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1612:1: ( ruleEntity )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1613:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_33254);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1622:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1626:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1627:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1627:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1628:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13285); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_2_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1637:1: rule__Entity__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1641:1: ( ( ( RULE_ID ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1642:1: ( ( RULE_ID ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1642:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1643:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1644:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1645:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_13320); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperEntityAssignment_2_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_4_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1656:1: rule__Entity__PropertiesAssignment_4_0 : ( ruleEntityProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1660:1: ( ( ruleEntityProperty ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1661:1: ( ruleEntityProperty )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1661:1: ( ruleEntityProperty )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1662:1: ruleEntityProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_4_03355);
            ruleEntityProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertiesAssignment_4_0"


    // $ANTLR start "rule__Entity__ReferencesAssignment_4_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1671:1: rule__Entity__ReferencesAssignment_4_1 : ( ruleEntityReference ) ;
    public final void rule__Entity__ReferencesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1675:1: ( ( ruleEntityReference ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1676:1: ( ruleEntityReference )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1676:1: ( ruleEntityReference )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1677:1: ruleEntityReference
            {
             before(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntityReference_in_rule__Entity__ReferencesAssignment_4_13386);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ReferencesAssignment_4_1"


    // $ANTLR start "rule__EntityReference__ListDestinationAssignment_0_0_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1686:1: rule__EntityReference__ListDestinationAssignment_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReference__ListDestinationAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1690:1: ( ( ( RULE_ID ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1691:1: ( ( RULE_ID ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1691:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1692:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationEntityCrossReference_0_0_1_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1693:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1694:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationEntityIDTerminalRuleCall_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__ListDestinationAssignment_0_0_13421); 
             after(grammarAccess.getEntityReferenceAccess().getListDestinationEntityIDTerminalRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getEntityReferenceAccess().getListDestinationEntityCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__ListDestinationAssignment_0_0_1"


    // $ANTLR start "rule__EntityReference__SingleDestinationAssignment_0_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1705:1: rule__EntityReference__SingleDestinationAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReference__SingleDestinationAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1709:1: ( ( ( RULE_ID ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1710:1: ( ( RULE_ID ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1710:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1711:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityCrossReference_0_1_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1712:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1713:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__SingleDestinationAssignment_0_13460); 
             after(grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__SingleDestinationAssignment_0_1"


    // $ANTLR start "rule__EntityReference__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1724:1: rule__EntityReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1728:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1729:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1729:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1730:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__NameAssignment_13495); 
             after(grammarAccess.getEntityReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__NameAssignment_1"


    // $ANTLR start "rule__EntityReference__InverseNameAssignment_2_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1739:1: rule__EntityReference__InverseNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__InverseNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1743:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1744:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1744:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1745:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__InverseNameAssignment_2_13526); 
             after(grammarAccess.getEntityReferenceAccess().getInverseNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__InverseNameAssignment_2_1"


    // $ANTLR start "rule__EntityProperty__PropertyTypeAssignment_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1755:1: rule__EntityProperty__PropertyTypeAssignment_0 : ( ruleBasicType ) ;
    public final void rule__EntityProperty__PropertyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1759:1: ( ( ruleBasicType ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1760:1: ( ruleBasicType )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1760:1: ( ruleBasicType )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1761:1: ruleBasicType
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_03558);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__PropertyTypeAssignment_0"


    // $ANTLR start "rule__EntityProperty__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1770:1: rule__EntityProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1774:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1775:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1775:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1776:1: RULE_ID
            {
             before(grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityProperty__NameAssignment_13589); 
             after(grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityProperty__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityProperty311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0_in_ruleEntityProperty337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJodaTimeTypes491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JodaTimeTypes__Alternatives_in_ruleJodaTimeTypes517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDirectSupportedTypes578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_0_in_rule__Entity__Alternatives_4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ReferencesAssignment_4_1_in_rule__Entity__Alternatives_4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__0_in_rule__EntityReference__Alternatives_0786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__SingleDestinationAssignment_0_1_in_rule__EntityReference__Alternatives_0804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_rule__BasicType__Alternatives888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__JodaTimeTypes__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JodaTimeTypes__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WrapperTypes__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WrapperTypes__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WrapperTypes__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WrapperTypes__Alternatives1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WrapperTypes__Alternatives1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WrapperTypes__Alternatives1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WrapperTypes__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__WrapperTypes__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveTypes__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveTypes__Alternatives1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimitiveTypes__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimitiveTypes__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimitiveTypes__Alternatives1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimitiveTypes__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PrimitiveTypes__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrimitiveTypes__Alternatives1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Package__Group__0__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11385 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21445 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Package__Group__2__Impl1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31507 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl1537 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Package__Group__4__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__0__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11699 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21759 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31820 = new BitSet(new long[]{0x000000113FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entity__Group__3__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41882 = new BitSet(new long[]{0x000000113FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_4_in_rule__Entity__Group__4__Impl1912 = new BitSet(new long[]{0x000000103FFFF812L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__Group__5__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Entity__Group_2__0__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__1__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__02137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__02140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Alternatives_0_in_rule__EntityReference__Group__0__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__12197 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__2_in_rule__EntityReference__Group__12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__NameAssignment_1_in_rule__EntityReference__Group__1__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__2__Impl_in_rule__EntityReference__Group__22257 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__3_in_rule__EntityReference__Group__22260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__0_in_rule__EntityReference__Group__2__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__3__Impl_in_rule__EntityReference__Group__32318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EntityReference__Group__3__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__0__Impl_in_rule__EntityReference__Group_0_0__02385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__1_in_rule__EntityReference__Group_0_0__02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityReference__Group_0_0__0__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__1__Impl_in_rule__EntityReference__Group_0_0__12447 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__2_in_rule__EntityReference__Group_0_0__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__ListDestinationAssignment_0_0_1_in_rule__EntityReference__Group_0_0__1__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__2__Impl_in_rule__EntityReference__Group_0_0__22507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityReference__Group_0_0__2__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__0__Impl_in_rule__EntityReference__Group_2__02572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__1_in_rule__EntityReference__Group_2__02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EntityReference__Group_2__0__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__1__Impl_in_rule__EntityReference__Group_2__12634 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__2_in_rule__EntityReference__Group_2__12637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__InverseNameAssignment_2_1_in_rule__EntityReference__Group_2__1__Impl2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__2__Impl_in_rule__EntityReference__Group_2__22694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityReference__Group_2__2__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__02759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__12819 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__NameAssignment_1_in_rule__EntityProperty__Group__1__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__22879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EntityProperty__Group__2__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__02944 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__02947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl3030 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__03065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__03068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PackageName__Group_1__0__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__13127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Package__NameAssignment_13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_33254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_4_03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_rule__Entity__ReferencesAssignment_4_13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__ListDestinationAssignment_0_0_13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__SingleDestinationAssignment_0_13460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__NameAssignment_13495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__InverseNameAssignment_2_13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityProperty__NameAssignment_13589 = new BitSet(new long[]{0x0000000000000002L});

}