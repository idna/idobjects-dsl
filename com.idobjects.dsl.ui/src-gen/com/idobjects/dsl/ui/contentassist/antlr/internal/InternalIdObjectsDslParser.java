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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'", "'package'", "'{'", "'}'", "'entity'", "';'", "'List['", "']'", "'[inverse='", "'.'"
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

                if ( (LA1_0==28) ) {
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


    // $ANTLR start "entryRuleDirectSupportedTypes"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:259:1: entryRuleDirectSupportedTypes : ruleDirectSupportedTypes EOF ;
    public final void entryRuleDirectSupportedTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:260:1: ( ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:261:1: ruleDirectSupportedTypes EOF
            {
             before(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes484);
            ruleDirectSupportedTypes();

            state._fsp--;

             after(grammarAccess.getDirectSupportedTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes491); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:268:1: ruleDirectSupportedTypes : ( 'String' ) ;
    public final void ruleDirectSupportedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:272:2: ( ( 'String' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( 'String' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( 'String' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:274:1: 'String'
            {
             before(grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 
            match(input,11,FOLLOW_11_in_ruleDirectSupportedTypes518); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:289:1: entryRuleWrapperTypes : ruleWrapperTypes EOF ;
    public final void entryRuleWrapperTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:290:1: ( ruleWrapperTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:291:1: ruleWrapperTypes EOF
            {
             before(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes546);
            ruleWrapperTypes();

            state._fsp--;

             after(grammarAccess.getWrapperTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes553); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:298:1: ruleWrapperTypes : ( ( rule__WrapperTypes__Alternatives ) ) ;
    public final void ruleWrapperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:302:2: ( ( ( rule__WrapperTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:303:1: ( ( rule__WrapperTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:303:1: ( ( rule__WrapperTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:304:1: ( rule__WrapperTypes__Alternatives )
            {
             before(grammarAccess.getWrapperTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:305:1: ( rule__WrapperTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:305:2: rule__WrapperTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes579);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:317:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:318:1: ( rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:319:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes606);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes613); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:326:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:330:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:331:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:331:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:332:1: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:333:1: ( rule__PrimitiveTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:333:2: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes639);
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


    // $ANTLR start "rule__EntityReference__Alternatives_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:345:1: rule__EntityReference__Alternatives_0 : ( ( ( rule__EntityReference__Group_0_0__0 ) ) | ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) ) );
    public final void rule__EntityReference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:349:1: ( ( ( rule__EntityReference__Group_0_0__0 ) ) | ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:350:1: ( ( rule__EntityReference__Group_0_0__0 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:350:1: ( ( rule__EntityReference__Group_0_0__0 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:351:1: ( rule__EntityReference__Group_0_0__0 )
                    {
                     before(grammarAccess.getEntityReferenceAccess().getGroup_0_0()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:352:1: ( rule__EntityReference__Group_0_0__0 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:352:2: rule__EntityReference__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__EntityReference__Group_0_0__0_in_rule__EntityReference__Alternatives_0675);
                    rule__EntityReference__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityReferenceAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:356:6: ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:356:6: ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:357:1: ( rule__EntityReference__SingleDestinationAssignment_0_1 )
                    {
                     before(grammarAccess.getEntityReferenceAccess().getSingleDestinationAssignment_0_1()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:358:1: ( rule__EntityReference__SingleDestinationAssignment_0_1 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:358:2: rule__EntityReference__SingleDestinationAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__EntityReference__SingleDestinationAssignment_0_1_in_rule__EntityReference__Alternatives_0693);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:367:1: rule__BasicType__Alternatives : ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:371:1: ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt3=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:372:1: ( rulePrimitiveTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:372:1: ( rulePrimitiveTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:373:1: rulePrimitiveTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives726);
                    rulePrimitiveTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:378:6: ( ruleWrapperTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:378:6: ( ruleWrapperTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:379:1: ruleWrapperTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives743);
                    ruleWrapperTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:384:6: ( ruleDirectSupportedTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:384:6: ( ruleDirectSupportedTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:385:1: ruleDirectSupportedTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives760);
                    ruleDirectSupportedTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 

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


    // $ANTLR start "rule__WrapperTypes__Alternatives"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:395:1: rule__WrapperTypes__Alternatives : ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) );
    public final void rule__WrapperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:399:1: ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 19:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:400:1: ( 'Byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:400:1: ( 'Byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:401:1: 'Byte'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__WrapperTypes__Alternatives793); 
                     after(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:408:6: ( 'Short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:408:6: ( 'Short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:409:1: 'Short'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__WrapperTypes__Alternatives813); 
                     after(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:416:6: ( 'Integer' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:416:6: ( 'Integer' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:417:1: 'Integer'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__WrapperTypes__Alternatives833); 
                     after(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:424:6: ( 'Long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:424:6: ( 'Long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:425:1: 'Long'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__WrapperTypes__Alternatives853); 
                     after(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:432:6: ( 'Float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:432:6: ( 'Float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:433:1: 'Float'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__WrapperTypes__Alternatives873); 
                     after(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:440:6: ( 'Double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:440:6: ( 'Double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:441:1: 'Double'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__WrapperTypes__Alternatives893); 
                     after(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:448:6: ( 'Boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:448:6: ( 'Boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:449:1: 'Boolean'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__WrapperTypes__Alternatives913); 
                     after(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:456:6: ( 'Character' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:456:6: ( 'Character' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:457:1: 'Character'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 
                    match(input,19,FOLLOW_19_in_rule__WrapperTypes__Alternatives933); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:469:1: rule__PrimitiveTypes__Alternatives : ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:473:1: ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 27:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:474:1: ( 'byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:474:1: ( 'byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:475:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                    match(input,20,FOLLOW_20_in_rule__PrimitiveTypes__Alternatives968); 
                     after(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:482:6: ( 'short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:482:6: ( 'short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:483:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                    match(input,21,FOLLOW_21_in_rule__PrimitiveTypes__Alternatives988); 
                     after(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:490:6: ( 'int' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:490:6: ( 'int' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:491:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                    match(input,22,FOLLOW_22_in_rule__PrimitiveTypes__Alternatives1008); 
                     after(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:498:6: ( 'long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:498:6: ( 'long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:499:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                    match(input,23,FOLLOW_23_in_rule__PrimitiveTypes__Alternatives1028); 
                     after(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:506:6: ( 'float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:506:6: ( 'float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:507:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                    match(input,24,FOLLOW_24_in_rule__PrimitiveTypes__Alternatives1048); 
                     after(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:514:6: ( 'double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:514:6: ( 'double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:515:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                    match(input,25,FOLLOW_25_in_rule__PrimitiveTypes__Alternatives1068); 
                     after(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:522:6: ( 'boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:522:6: ( 'boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:523:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                    match(input,26,FOLLOW_26_in_rule__PrimitiveTypes__Alternatives1088); 
                     after(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:530:6: ( 'char' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:530:6: ( 'char' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:531:1: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 
                    match(input,27,FOLLOW_27_in_rule__PrimitiveTypes__Alternatives1108); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:545:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:549:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:550:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01140);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01143);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:557:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:561:1: ( ( 'package' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:562:1: ( 'package' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:562:1: ( 'package' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:563:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Package__Group__0__Impl1171); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:576:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:580:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:581:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11202);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11205);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:588:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:592:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:593:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:593:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:594:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:595:1: ( rule__Package__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:595:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1232);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:605:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:609:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:610:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21262);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21265);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:617:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:621:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:622:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:622:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:623:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Package__Group__2__Impl1293); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:636:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:640:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:641:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31324);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31327);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:648:1: rule__Package__Group__3__Impl : ( ( rule__Package__EntitiesAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:652:1: ( ( ( rule__Package__EntitiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:653:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:653:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:654:1: ( rule__Package__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:655:1: ( rule__Package__EntitiesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:655:2: rule__Package__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl1354);
            	    rule__Package__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:665:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:669:1: ( rule__Package__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:670:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41385);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:676:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:680:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:681:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:681:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:682:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Package__Group__4__Impl1413); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:705:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:709:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:710:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01454);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01457);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:717:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:721:1: ( ( 'entity' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:722:1: ( 'entity' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:722:1: ( 'entity' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:723:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Entity__Group__0__Impl1485); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:736:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:740:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:741:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11516);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11519);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:748:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:752:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:753:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:753:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:754:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:755:1: ( rule__Entity__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:755:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1546);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:765:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:769:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:770:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21576);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21579);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:777:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:781:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:782:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:782:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:783:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Entity__Group__2__Impl1607); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:796:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:800:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:801:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31638);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31641);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:808:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:812:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:813:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:813:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:814:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:815:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:815:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl1668);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:825:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:829:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:830:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41699);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41702);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:837:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ReferencesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:841:1: ( ( ( rule__Entity__ReferencesAssignment_4 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:842:1: ( ( rule__Entity__ReferencesAssignment_4 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:842:1: ( ( rule__Entity__ReferencesAssignment_4 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:843:1: ( rule__Entity__ReferencesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getReferencesAssignment_4()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:844:1: ( rule__Entity__ReferencesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:844:2: rule__Entity__ReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__ReferencesAssignment_4_in_rule__Entity__Group__4__Impl1729);
            	    rule__Entity__ReferencesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getReferencesAssignment_4()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:854:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:858:1: ( rule__Entity__Group__5__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:859:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51760);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:865:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:869:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:870:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:870:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:871:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Entity__Group__5__Impl1788); 
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


    // $ANTLR start "rule__EntityReference__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:896:1: rule__EntityReference__Group__0 : rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 ;
    public final void rule__EntityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:900:1: ( rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:901:2: rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__01831);
            rule__EntityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__01834);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:908:1: rule__EntityReference__Group__0__Impl : ( ( rule__EntityReference__Alternatives_0 ) ) ;
    public final void rule__EntityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:912:1: ( ( ( rule__EntityReference__Alternatives_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:913:1: ( ( rule__EntityReference__Alternatives_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:913:1: ( ( rule__EntityReference__Alternatives_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:914:1: ( rule__EntityReference__Alternatives_0 )
            {
             before(grammarAccess.getEntityReferenceAccess().getAlternatives_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:915:1: ( rule__EntityReference__Alternatives_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:915:2: rule__EntityReference__Alternatives_0
            {
            pushFollow(FOLLOW_rule__EntityReference__Alternatives_0_in_rule__EntityReference__Group__0__Impl1861);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:925:1: rule__EntityReference__Group__1 : rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2 ;
    public final void rule__EntityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:929:1: ( rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:930:2: rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__11891);
            rule__EntityReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__2_in_rule__EntityReference__Group__11894);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:937:1: rule__EntityReference__Group__1__Impl : ( ( rule__EntityReference__NameAssignment_1 ) ) ;
    public final void rule__EntityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:941:1: ( ( ( rule__EntityReference__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:942:1: ( ( rule__EntityReference__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:942:1: ( ( rule__EntityReference__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:943:1: ( rule__EntityReference__NameAssignment_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:944:1: ( rule__EntityReference__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:944:2: rule__EntityReference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityReference__NameAssignment_1_in_rule__EntityReference__Group__1__Impl1921);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:954:1: rule__EntityReference__Group__2 : rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3 ;
    public final void rule__EntityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:958:1: ( rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:959:2: rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__2__Impl_in_rule__EntityReference__Group__21951);
            rule__EntityReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__3_in_rule__EntityReference__Group__21954);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:966:1: rule__EntityReference__Group__2__Impl : ( ( rule__EntityReference__Group_2__0 )? ) ;
    public final void rule__EntityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:970:1: ( ( ( rule__EntityReference__Group_2__0 )? ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:971:1: ( ( rule__EntityReference__Group_2__0 )? )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:971:1: ( ( rule__EntityReference__Group_2__0 )? )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:972:1: ( rule__EntityReference__Group_2__0 )?
            {
             before(grammarAccess.getEntityReferenceAccess().getGroup_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:973:1: ( rule__EntityReference__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:973:2: rule__EntityReference__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EntityReference__Group_2__0_in_rule__EntityReference__Group__2__Impl1981);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:983:1: rule__EntityReference__Group__3 : rule__EntityReference__Group__3__Impl ;
    public final void rule__EntityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:987:1: ( rule__EntityReference__Group__3__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:988:2: rule__EntityReference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__3__Impl_in_rule__EntityReference__Group__32012);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:994:1: rule__EntityReference__Group__3__Impl : ( ';' ) ;
    public final void rule__EntityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:998:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:999:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:999:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1000:1: ';'
            {
             before(grammarAccess.getEntityReferenceAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__EntityReference__Group__3__Impl2040); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1021:1: rule__EntityReference__Group_0_0__0 : rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1 ;
    public final void rule__EntityReference__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1025:1: ( rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1026:2: rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__0__Impl_in_rule__EntityReference__Group_0_0__02079);
            rule__EntityReference__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__1_in_rule__EntityReference__Group_0_0__02082);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1033:1: rule__EntityReference__Group_0_0__0__Impl : ( 'List[' ) ;
    public final void rule__EntityReference__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1037:1: ( ( 'List[' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1038:1: ( 'List[' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1038:1: ( 'List[' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1039:1: 'List['
            {
             before(grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__EntityReference__Group_0_0__0__Impl2110); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1052:1: rule__EntityReference__Group_0_0__1 : rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2 ;
    public final void rule__EntityReference__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1056:1: ( rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1057:2: rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__1__Impl_in_rule__EntityReference__Group_0_0__12141);
            rule__EntityReference__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__2_in_rule__EntityReference__Group_0_0__12144);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1064:1: rule__EntityReference__Group_0_0__1__Impl : ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) ) ;
    public final void rule__EntityReference__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1068:1: ( ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1069:1: ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1069:1: ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1070:1: ( rule__EntityReference__ListDestinationAssignment_0_0_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationAssignment_0_0_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1071:1: ( rule__EntityReference__ListDestinationAssignment_0_0_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1071:2: rule__EntityReference__ListDestinationAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__EntityReference__ListDestinationAssignment_0_0_1_in_rule__EntityReference__Group_0_0__1__Impl2171);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1081:1: rule__EntityReference__Group_0_0__2 : rule__EntityReference__Group_0_0__2__Impl ;
    public final void rule__EntityReference__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1085:1: ( rule__EntityReference__Group_0_0__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1086:2: rule__EntityReference__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__2__Impl_in_rule__EntityReference__Group_0_0__22201);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1092:1: rule__EntityReference__Group_0_0__2__Impl : ( ']' ) ;
    public final void rule__EntityReference__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1096:1: ( ( ']' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1097:1: ( ']' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1097:1: ( ']' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1098:1: ']'
            {
             before(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2()); 
            match(input,34,FOLLOW_34_in_rule__EntityReference__Group_0_0__2__Impl2229); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1117:1: rule__EntityReference__Group_2__0 : rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1 ;
    public final void rule__EntityReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1121:1: ( rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1122:2: rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__0__Impl_in_rule__EntityReference__Group_2__02266);
            rule__EntityReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_2__1_in_rule__EntityReference__Group_2__02269);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1129:1: rule__EntityReference__Group_2__0__Impl : ( '[inverse=' ) ;
    public final void rule__EntityReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1133:1: ( ( '[inverse=' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1134:1: ( '[inverse=' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1134:1: ( '[inverse=' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1135:1: '[inverse='
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__EntityReference__Group_2__0__Impl2297); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1148:1: rule__EntityReference__Group_2__1 : rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2 ;
    public final void rule__EntityReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1152:1: ( rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1153:2: rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__1__Impl_in_rule__EntityReference__Group_2__12328);
            rule__EntityReference__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_2__2_in_rule__EntityReference__Group_2__12331);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1160:1: rule__EntityReference__Group_2__1__Impl : ( ( rule__EntityReference__InverseNameAssignment_2_1 ) ) ;
    public final void rule__EntityReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1164:1: ( ( ( rule__EntityReference__InverseNameAssignment_2_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1165:1: ( ( rule__EntityReference__InverseNameAssignment_2_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1165:1: ( ( rule__EntityReference__InverseNameAssignment_2_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1166:1: ( rule__EntityReference__InverseNameAssignment_2_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameAssignment_2_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1167:1: ( rule__EntityReference__InverseNameAssignment_2_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1167:2: rule__EntityReference__InverseNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EntityReference__InverseNameAssignment_2_1_in_rule__EntityReference__Group_2__1__Impl2358);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1177:1: rule__EntityReference__Group_2__2 : rule__EntityReference__Group_2__2__Impl ;
    public final void rule__EntityReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1181:1: ( rule__EntityReference__Group_2__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1182:2: rule__EntityReference__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__2__Impl_in_rule__EntityReference__Group_2__22388);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1188:1: rule__EntityReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__EntityReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1192:1: ( ( ']' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1193:1: ( ']' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1193:1: ( ']' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1194:1: ']'
            {
             before(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,34,FOLLOW_34_in_rule__EntityReference__Group_2__2__Impl2416); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1213:1: rule__EntityProperty__Group__0 : rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 ;
    public final void rule__EntityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1217:1: ( rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1218:2: rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__02453);
            rule__EntityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__02456);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1225:1: rule__EntityProperty__Group__0__Impl : ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) ;
    public final void rule__EntityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1229:1: ( ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1230:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1230:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1231:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeAssignment_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1232:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1232:2: rule__EntityProperty__PropertyTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl2483);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1242:1: rule__EntityProperty__Group__1 : rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 ;
    public final void rule__EntityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1246:1: ( rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1247:2: rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__12513);
            rule__EntityProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__12516);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1254:1: rule__EntityProperty__Group__1__Impl : ( ( rule__EntityProperty__NameAssignment_1 ) ) ;
    public final void rule__EntityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1258:1: ( ( ( rule__EntityProperty__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1259:1: ( ( rule__EntityProperty__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1259:1: ( ( rule__EntityProperty__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1260:1: ( rule__EntityProperty__NameAssignment_1 )
            {
             before(grammarAccess.getEntityPropertyAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1261:1: ( rule__EntityProperty__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1261:2: rule__EntityProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityProperty__NameAssignment_1_in_rule__EntityProperty__Group__1__Impl2543);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1271:1: rule__EntityProperty__Group__2 : rule__EntityProperty__Group__2__Impl ;
    public final void rule__EntityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1275:1: ( rule__EntityProperty__Group__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1276:2: rule__EntityProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__22573);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1282:1: rule__EntityProperty__Group__2__Impl : ( ';' ) ;
    public final void rule__EntityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1286:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1287:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1287:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1288:1: ';'
            {
             before(grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__EntityProperty__Group__2__Impl2601); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1307:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1311:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1312:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__02638);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__02641);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1319:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1323:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1324:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1324:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1325:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl2668); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1336:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1340:1: ( rule__PackageName__Group__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1341:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__12697);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1347:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1351:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1352:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1352:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1353:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1354:1: ( rule__PackageName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1354:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl2724);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1368:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1372:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1373:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__02759);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__02762);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1380:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1384:1: ( ( '.' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1385:1: ( '.' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1385:1: ( '.' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1386:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__PackageName__Group_1__0__Impl2790); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1399:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1403:1: ( rule__PackageName__Group_1__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1404:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__12821);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1410:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1414:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1415:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1415:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1416:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl2848); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1432:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1436:1: ( ( rulePackage ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1437:1: ( rulePackage )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1437:1: ( rulePackage )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1438:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment2886);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1447:1: rule__Package__NameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1451:1: ( ( rulePackageName ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1452:1: ( rulePackageName )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1452:1: ( rulePackageName )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1453:1: rulePackageName
            {
             before(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Package__NameAssignment_12917);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1462:1: rule__Package__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1466:1: ( ( ruleEntity ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1467:1: ( ruleEntity )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1467:1: ( ruleEntity )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1468:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_32948);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1477:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1481:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1482:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1482:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1483:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12979); 
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


    // $ANTLR start "rule__Entity__PropertiesAssignment_3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1492:1: rule__Entity__PropertiesAssignment_3 : ( ruleEntityProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1496:1: ( ( ruleEntityProperty ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1497:1: ( ruleEntityProperty )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1497:1: ( ruleEntityProperty )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1498:1: ruleEntityProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_33010);
            ruleEntityProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__PropertiesAssignment_3"


    // $ANTLR start "rule__Entity__ReferencesAssignment_4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1507:1: rule__Entity__ReferencesAssignment_4 : ( ruleEntityReference ) ;
    public final void rule__Entity__ReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1511:1: ( ( ruleEntityReference ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1512:1: ( ruleEntityReference )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1512:1: ( ruleEntityReference )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1513:1: ruleEntityReference
            {
             before(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntityReference_in_rule__Entity__ReferencesAssignment_43041);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__ReferencesAssignment_4"


    // $ANTLR start "rule__EntityReference__ListDestinationAssignment_0_0_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1522:1: rule__EntityReference__ListDestinationAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__ListDestinationAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1526:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1527:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1527:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1528:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__ListDestinationAssignment_0_0_13072); 
             after(grammarAccess.getEntityReferenceAccess().getListDestinationIDTerminalRuleCall_0_0_1_0()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1537:1: rule__EntityReference__SingleDestinationAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__SingleDestinationAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1541:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1542:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1542:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1543:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getSingleDestinationIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__SingleDestinationAssignment_0_13103); 
             after(grammarAccess.getEntityReferenceAccess().getSingleDestinationIDTerminalRuleCall_0_1_0()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1552:1: rule__EntityReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1556:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1557:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1557:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1558:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__NameAssignment_13134); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1567:1: rule__EntityReference__InverseNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReference__InverseNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1571:1: ( ( ( RULE_ID ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1572:1: ( ( RULE_ID ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1572:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1573:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameEntityReferenceCrossReference_2_1_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1574:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1575:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameEntityReferenceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__InverseNameAssignment_2_13169); 
             after(grammarAccess.getEntityReferenceAccess().getInverseNameEntityReferenceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityReferenceAccess().getInverseNameEntityReferenceCrossReference_2_1_0()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1587:1: rule__EntityProperty__PropertyTypeAssignment_0 : ( ruleBasicType ) ;
    public final void rule__EntityProperty__PropertyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1591:1: ( ( ruleBasicType ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1592:1: ( ruleBasicType )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1592:1: ( ruleBasicType )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1593:1: ruleBasicType
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_03205);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1602:1: rule__EntityProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1606:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1607:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1607:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1608:1: RULE_ID
            {
             before(grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityProperty__NameAssignment_13236); 
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
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000010000002L});
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
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDirectSupportedTypes518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__0_in_rule__EntityReference__Alternatives_0675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__SingleDestinationAssignment_0_1_in_rule__EntityReference__Alternatives_0693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WrapperTypes__Alternatives793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WrapperTypes__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WrapperTypes__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WrapperTypes__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WrapperTypes__Alternatives873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WrapperTypes__Alternatives893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WrapperTypes__Alternatives913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WrapperTypes__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveTypes__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimitiveTypes__Alternatives988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveTypes__Alternatives1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveTypes__Alternatives1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimitiveTypes__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimitiveTypes__Alternatives1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimitiveTypes__Alternatives1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimitiveTypes__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Package__Group__0__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11202 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21262 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Package__Group__2__Impl1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31324 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl1354 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Package__Group__4__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entity__Group__0__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11516 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21576 = new BitSet(new long[]{0x000000024FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Entity__Group__2__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31638 = new BitSet(new long[]{0x000000024FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl1668 = new BitSet(new long[]{0x000000000FFFF802L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41699 = new BitSet(new long[]{0x000000024FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ReferencesAssignment_4_in_rule__Entity__Group__4__Impl1729 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Entity__Group__5__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__01831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__01834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Alternatives_0_in_rule__EntityReference__Group__0__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__11891 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__2_in_rule__EntityReference__Group__11894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__NameAssignment_1_in_rule__EntityReference__Group__1__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__2__Impl_in_rule__EntityReference__Group__21951 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__3_in_rule__EntityReference__Group__21954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__0_in_rule__EntityReference__Group__2__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__3__Impl_in_rule__EntityReference__Group__32012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EntityReference__Group__3__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__0__Impl_in_rule__EntityReference__Group_0_0__02079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__1_in_rule__EntityReference__Group_0_0__02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EntityReference__Group_0_0__0__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__1__Impl_in_rule__EntityReference__Group_0_0__12141 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__2_in_rule__EntityReference__Group_0_0__12144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__ListDestinationAssignment_0_0_1_in_rule__EntityReference__Group_0_0__1__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__2__Impl_in_rule__EntityReference__Group_0_0__22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EntityReference__Group_0_0__2__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__0__Impl_in_rule__EntityReference__Group_2__02266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__1_in_rule__EntityReference__Group_2__02269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EntityReference__Group_2__0__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__1__Impl_in_rule__EntityReference__Group_2__12328 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__2_in_rule__EntityReference__Group_2__12331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__InverseNameAssignment_2_1_in_rule__EntityReference__Group_2__1__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__2__Impl_in_rule__EntityReference__Group_2__22388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EntityReference__Group_2__2__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__02453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__12513 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__NameAssignment_1_in_rule__EntityProperty__Group__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__22573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EntityProperty__Group__2__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__02638 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__02641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__12697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl2724 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__02759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PackageName__Group_1__0__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__12821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Package__NameAssignment_12917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_32948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_33010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_rule__Entity__ReferencesAssignment_43041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__ListDestinationAssignment_0_0_13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__SingleDestinationAssignment_0_13103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__NameAssignment_13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__InverseNameAssignment_2_13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityProperty__NameAssignment_13236 = new BitSet(new long[]{0x0000000000000002L});

}