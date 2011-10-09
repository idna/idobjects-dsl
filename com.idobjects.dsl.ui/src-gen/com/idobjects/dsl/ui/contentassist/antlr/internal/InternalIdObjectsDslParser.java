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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'DateTime'", "'Instant'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'", "'model-id'", "'='", "'package'", "'{'", "'}'", "'entity'", "';'", "'List['", "']'", "'[inverse='", "'persistence'", "'('", "')'", "','", "'.'"
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:77:1: ( rule__Model__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage121);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage128); 

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
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage154);
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
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity181);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity188); 

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
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity214);
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
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference241);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference248); 

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
            pushFollow(FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference274);
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


    // $ANTLR start "entryRulePersistence"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:173:1: entryRulePersistence : rulePersistence EOF ;
    public final void entryRulePersistence() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:174:1: ( rulePersistence EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:175:1: rulePersistence EOF
            {
             before(grammarAccess.getPersistenceRule()); 
            pushFollow(FOLLOW_rulePersistence_in_entryRulePersistence301);
            rulePersistence();

            state._fsp--;

             after(grammarAccess.getPersistenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistence308); 

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
    // $ANTLR end "entryRulePersistence"


    // $ANTLR start "rulePersistence"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:182:1: rulePersistence : ( ( rule__Persistence__Group__0 ) ) ;
    public final void rulePersistence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:186:2: ( ( ( rule__Persistence__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:187:1: ( ( rule__Persistence__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:187:1: ( ( rule__Persistence__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:188:1: ( rule__Persistence__Group__0 )
            {
             before(grammarAccess.getPersistenceAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:189:1: ( rule__Persistence__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:189:2: rule__Persistence__Group__0
            {
            pushFollow(FOLLOW_rule__Persistence__Group__0_in_rulePersistence334);
            rule__Persistence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceAccess().getGroup()); 

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
    // $ANTLR end "rulePersistence"


    // $ANTLR start "entryRulePersistencePackage"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:201:1: entryRulePersistencePackage : rulePersistencePackage EOF ;
    public final void entryRulePersistencePackage() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:202:1: ( rulePersistencePackage EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:203:1: rulePersistencePackage EOF
            {
             before(grammarAccess.getPersistencePackageRule()); 
            pushFollow(FOLLOW_rulePersistencePackage_in_entryRulePersistencePackage361);
            rulePersistencePackage();

            state._fsp--;

             after(grammarAccess.getPersistencePackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistencePackage368); 

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
    // $ANTLR end "entryRulePersistencePackage"


    // $ANTLR start "rulePersistencePackage"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:210:1: rulePersistencePackage : ( ( rule__PersistencePackage__Group__0 ) ) ;
    public final void rulePersistencePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:214:2: ( ( ( rule__PersistencePackage__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:215:1: ( ( rule__PersistencePackage__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:215:1: ( ( rule__PersistencePackage__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:216:1: ( rule__PersistencePackage__Group__0 )
            {
             before(grammarAccess.getPersistencePackageAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:217:1: ( rule__PersistencePackage__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:217:2: rule__PersistencePackage__Group__0
            {
            pushFollow(FOLLOW_rule__PersistencePackage__Group__0_in_rulePersistencePackage394);
            rule__PersistencePackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePackageAccess().getGroup()); 

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
    // $ANTLR end "rulePersistencePackage"


    // $ANTLR start "entryRulePersistenceEntity"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:229:1: entryRulePersistenceEntity : rulePersistenceEntity EOF ;
    public final void entryRulePersistenceEntity() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:230:1: ( rulePersistenceEntity EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:231:1: rulePersistenceEntity EOF
            {
             before(grammarAccess.getPersistenceEntityRule()); 
            pushFollow(FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity421);
            rulePersistenceEntity();

            state._fsp--;

             after(grammarAccess.getPersistenceEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceEntity428); 

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
    // $ANTLR end "entryRulePersistenceEntity"


    // $ANTLR start "rulePersistenceEntity"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:238:1: rulePersistenceEntity : ( ( rule__PersistenceEntity__Group__0 ) ) ;
    public final void rulePersistenceEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:242:2: ( ( ( rule__PersistenceEntity__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:243:1: ( ( rule__PersistenceEntity__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:243:1: ( ( rule__PersistenceEntity__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:244:1: ( rule__PersistenceEntity__Group__0 )
            {
             before(grammarAccess.getPersistenceEntityAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:245:1: ( rule__PersistenceEntity__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:245:2: rule__PersistenceEntity__Group__0
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__0_in_rulePersistenceEntity454);
            rule__PersistenceEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceEntityAccess().getGroup()); 

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
    // $ANTLR end "rulePersistenceEntity"


    // $ANTLR start "entryRulePersistenceProperty"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:257:1: entryRulePersistenceProperty : rulePersistenceProperty EOF ;
    public final void entryRulePersistenceProperty() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:258:1: ( rulePersistenceProperty EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:259:1: rulePersistenceProperty EOF
            {
             before(grammarAccess.getPersistencePropertyRule()); 
            pushFollow(FOLLOW_rulePersistenceProperty_in_entryRulePersistenceProperty481);
            rulePersistenceProperty();

            state._fsp--;

             after(grammarAccess.getPersistencePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceProperty488); 

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
    // $ANTLR end "entryRulePersistenceProperty"


    // $ANTLR start "rulePersistenceProperty"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:266:1: rulePersistenceProperty : ( ( rule__PersistenceProperty__Group__0 ) ) ;
    public final void rulePersistenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:270:2: ( ( ( rule__PersistenceProperty__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:271:1: ( ( rule__PersistenceProperty__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:271:1: ( ( rule__PersistenceProperty__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:272:1: ( rule__PersistenceProperty__Group__0 )
            {
             before(grammarAccess.getPersistencePropertyAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( rule__PersistenceProperty__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:2: rule__PersistenceProperty__Group__0
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group__0_in_rulePersistenceProperty514);
            rule__PersistenceProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyAccess().getGroup()); 

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
    // $ANTLR end "rulePersistenceProperty"


    // $ANTLR start "entryRulePersistencePropertyConfig"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:285:1: entryRulePersistencePropertyConfig : rulePersistencePropertyConfig EOF ;
    public final void entryRulePersistencePropertyConfig() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:286:1: ( rulePersistencePropertyConfig EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:287:1: rulePersistencePropertyConfig EOF
            {
             before(grammarAccess.getPersistencePropertyConfigRule()); 
            pushFollow(FOLLOW_rulePersistencePropertyConfig_in_entryRulePersistencePropertyConfig541);
            rulePersistencePropertyConfig();

            state._fsp--;

             after(grammarAccess.getPersistencePropertyConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistencePropertyConfig548); 

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
    // $ANTLR end "entryRulePersistencePropertyConfig"


    // $ANTLR start "rulePersistencePropertyConfig"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:294:1: rulePersistencePropertyConfig : ( ( rule__PersistencePropertyConfig__Group__0 ) ) ;
    public final void rulePersistencePropertyConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:298:2: ( ( ( rule__PersistencePropertyConfig__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:299:1: ( ( rule__PersistencePropertyConfig__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:299:1: ( ( rule__PersistencePropertyConfig__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:300:1: ( rule__PersistencePropertyConfig__Group__0 )
            {
             before(grammarAccess.getPersistencePropertyConfigAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:301:1: ( rule__PersistencePropertyConfig__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:301:2: rule__PersistencePropertyConfig__Group__0
            {
            pushFollow(FOLLOW_rule__PersistencePropertyConfig__Group__0_in_rulePersistencePropertyConfig574);
            rule__PersistencePropertyConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyConfigAccess().getGroup()); 

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
    // $ANTLR end "rulePersistencePropertyConfig"


    // $ANTLR start "entryRuleEntityProperty"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:313:1: entryRuleEntityProperty : ruleEntityProperty EOF ;
    public final void entryRuleEntityProperty() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:314:1: ( ruleEntityProperty EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:315:1: ruleEntityProperty EOF
            {
             before(grammarAccess.getEntityPropertyRule()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty601);
            ruleEntityProperty();

            state._fsp--;

             after(grammarAccess.getEntityPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityProperty608); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:322:1: ruleEntityProperty : ( ( rule__EntityProperty__Group__0 ) ) ;
    public final void ruleEntityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:326:2: ( ( ( rule__EntityProperty__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:327:1: ( ( rule__EntityProperty__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:327:1: ( ( rule__EntityProperty__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:328:1: ( rule__EntityProperty__Group__0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:329:1: ( rule__EntityProperty__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:329:2: rule__EntityProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0_in_ruleEntityProperty634);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:341:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:342:1: ( rulePackageName EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:343:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName661);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName668); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:350:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:354:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:355:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:355:1: ( ( rule__PackageName__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:356:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:357:1: ( rule__PackageName__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:357:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName694);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:369:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:370:1: ( ruleBasicType EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:371:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType721);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType728); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:378:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:382:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:383:1: ( ( rule__BasicType__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:383:1: ( ( rule__BasicType__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:384:1: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:385:1: ( rule__BasicType__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:385:2: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType754);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:397:1: entryRuleJodaTimeTypes : ruleJodaTimeTypes EOF ;
    public final void entryRuleJodaTimeTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:398:1: ( ruleJodaTimeTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:399:1: ruleJodaTimeTypes EOF
            {
             before(grammarAccess.getJodaTimeTypesRule()); 
            pushFollow(FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes781);
            ruleJodaTimeTypes();

            state._fsp--;

             after(grammarAccess.getJodaTimeTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJodaTimeTypes788); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:406:1: ruleJodaTimeTypes : ( ( rule__JodaTimeTypes__Alternatives ) ) ;
    public final void ruleJodaTimeTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:410:2: ( ( ( rule__JodaTimeTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:411:1: ( ( rule__JodaTimeTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:411:1: ( ( rule__JodaTimeTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:412:1: ( rule__JodaTimeTypes__Alternatives )
            {
             before(grammarAccess.getJodaTimeTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:413:1: ( rule__JodaTimeTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:413:2: rule__JodaTimeTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__JodaTimeTypes__Alternatives_in_ruleJodaTimeTypes814);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:425:1: entryRuleDirectSupportedTypes : ruleDirectSupportedTypes EOF ;
    public final void entryRuleDirectSupportedTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:426:1: ( ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:427:1: ruleDirectSupportedTypes EOF
            {
             before(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes841);
            ruleDirectSupportedTypes();

            state._fsp--;

             after(grammarAccess.getDirectSupportedTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes848); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:434:1: ruleDirectSupportedTypes : ( 'String' ) ;
    public final void ruleDirectSupportedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:438:2: ( ( 'String' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:439:1: ( 'String' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:439:1: ( 'String' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:440:1: 'String'
            {
             before(grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 
            match(input,11,FOLLOW_11_in_ruleDirectSupportedTypes875); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:455:1: entryRuleWrapperTypes : ruleWrapperTypes EOF ;
    public final void entryRuleWrapperTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:456:1: ( ruleWrapperTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:457:1: ruleWrapperTypes EOF
            {
             before(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes903);
            ruleWrapperTypes();

            state._fsp--;

             after(grammarAccess.getWrapperTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes910); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:464:1: ruleWrapperTypes : ( ( rule__WrapperTypes__Alternatives ) ) ;
    public final void ruleWrapperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:468:2: ( ( ( rule__WrapperTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:469:1: ( ( rule__WrapperTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:469:1: ( ( rule__WrapperTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:470:1: ( rule__WrapperTypes__Alternatives )
            {
             before(grammarAccess.getWrapperTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:471:1: ( rule__WrapperTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:471:2: rule__WrapperTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes936);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:483:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:484:1: ( rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:485:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes963);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes970); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:492:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:496:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:497:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:497:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:498:1: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:499:1: ( rule__PrimitiveTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:499:2: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes996);
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


    // $ANTLR start "rule__Entity__Alternatives_3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:511:1: rule__Entity__Alternatives_3 : ( ( ( rule__Entity__PropertiesAssignment_3_0 ) ) | ( ( rule__Entity__ReferencesAssignment_3_1 ) ) );
    public final void rule__Entity__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:515:1: ( ( ( rule__Entity__PropertiesAssignment_3_0 ) ) | ( ( rule__Entity__ReferencesAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=29)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:516:1: ( ( rule__Entity__PropertiesAssignment_3_0 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:516:1: ( ( rule__Entity__PropertiesAssignment_3_0 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:517:1: ( rule__Entity__PropertiesAssignment_3_0 )
                    {
                     before(grammarAccess.getEntityAccess().getPropertiesAssignment_3_0()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:518:1: ( rule__Entity__PropertiesAssignment_3_0 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:518:2: rule__Entity__PropertiesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_0_in_rule__Entity__Alternatives_31032);
                    rule__Entity__PropertiesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getPropertiesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:522:6: ( ( rule__Entity__ReferencesAssignment_3_1 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:522:6: ( ( rule__Entity__ReferencesAssignment_3_1 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:523:1: ( rule__Entity__ReferencesAssignment_3_1 )
                    {
                     before(grammarAccess.getEntityAccess().getReferencesAssignment_3_1()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:524:1: ( rule__Entity__ReferencesAssignment_3_1 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:524:2: rule__Entity__ReferencesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Entity__ReferencesAssignment_3_1_in_rule__Entity__Alternatives_31050);
                    rule__Entity__ReferencesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getReferencesAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Alternatives_3"


    // $ANTLR start "rule__EntityReference__Alternatives_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:533:1: rule__EntityReference__Alternatives_0 : ( ( ( rule__EntityReference__Group_0_0__0 ) ) | ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) ) );
    public final void rule__EntityReference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:537:1: ( ( ( rule__EntityReference__Group_0_0__0 ) ) | ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
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
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:538:1: ( ( rule__EntityReference__Group_0_0__0 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:538:1: ( ( rule__EntityReference__Group_0_0__0 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:539:1: ( rule__EntityReference__Group_0_0__0 )
                    {
                     before(grammarAccess.getEntityReferenceAccess().getGroup_0_0()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:540:1: ( rule__EntityReference__Group_0_0__0 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:540:2: rule__EntityReference__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__EntityReference__Group_0_0__0_in_rule__EntityReference__Alternatives_01083);
                    rule__EntityReference__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityReferenceAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:544:6: ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:544:6: ( ( rule__EntityReference__SingleDestinationAssignment_0_1 ) )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:545:1: ( rule__EntityReference__SingleDestinationAssignment_0_1 )
                    {
                     before(grammarAccess.getEntityReferenceAccess().getSingleDestinationAssignment_0_1()); 
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:546:1: ( rule__EntityReference__SingleDestinationAssignment_0_1 )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:546:2: rule__EntityReference__SingleDestinationAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__EntityReference__SingleDestinationAssignment_0_1_in_rule__EntityReference__Alternatives_01101);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:555:1: rule__BasicType__Alternatives : ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) | ( ruleJodaTimeTypes ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:559:1: ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) | ( ruleJodaTimeTypes ) )
            int alt3=4;
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
                alt3=1;
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
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            case 12:
            case 13:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:560:1: ( rulePrimitiveTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:560:1: ( rulePrimitiveTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:561:1: rulePrimitiveTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives1134);
                    rulePrimitiveTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:566:6: ( ruleWrapperTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:566:6: ( ruleWrapperTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:567:1: ruleWrapperTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives1151);
                    ruleWrapperTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:572:6: ( ruleDirectSupportedTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:572:6: ( ruleDirectSupportedTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:573:1: ruleDirectSupportedTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives1168);
                    ruleDirectSupportedTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:578:6: ( ruleJodaTimeTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:578:6: ( ruleJodaTimeTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:579:1: ruleJodaTimeTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getJodaTimeTypesParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleJodaTimeTypes_in_rule__BasicType__Alternatives1185);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:589:1: rule__JodaTimeTypes__Alternatives : ( ( 'DateTime' ) | ( 'Instant' ) );
    public final void rule__JodaTimeTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:593:1: ( ( 'DateTime' ) | ( 'Instant' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:594:1: ( 'DateTime' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:594:1: ( 'DateTime' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:595:1: 'DateTime'
                    {
                     before(grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__JodaTimeTypes__Alternatives1218); 
                     after(grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:602:6: ( 'Instant' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:602:6: ( 'Instant' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:603:1: 'Instant'
                    {
                     before(grammarAccess.getJodaTimeTypesAccess().getInstantKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__JodaTimeTypes__Alternatives1238); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:615:1: rule__WrapperTypes__Alternatives : ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) );
    public final void rule__WrapperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:619:1: ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            case 20:
                {
                alt5=7;
                }
                break;
            case 21:
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
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:620:1: ( 'Byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:620:1: ( 'Byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:621:1: 'Byte'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__WrapperTypes__Alternatives1273); 
                     after(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:628:6: ( 'Short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:628:6: ( 'Short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:629:1: 'Short'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__WrapperTypes__Alternatives1293); 
                     after(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:636:6: ( 'Integer' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:636:6: ( 'Integer' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:637:1: 'Integer'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__WrapperTypes__Alternatives1313); 
                     after(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:644:6: ( 'Long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:644:6: ( 'Long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:645:1: 'Long'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                    match(input,17,FOLLOW_17_in_rule__WrapperTypes__Alternatives1333); 
                     after(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:652:6: ( 'Float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:652:6: ( 'Float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:653:1: 'Float'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                    match(input,18,FOLLOW_18_in_rule__WrapperTypes__Alternatives1353); 
                     after(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:660:6: ( 'Double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:660:6: ( 'Double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:661:1: 'Double'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                    match(input,19,FOLLOW_19_in_rule__WrapperTypes__Alternatives1373); 
                     after(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:668:6: ( 'Boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:668:6: ( 'Boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:669:1: 'Boolean'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                    match(input,20,FOLLOW_20_in_rule__WrapperTypes__Alternatives1393); 
                     after(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:676:6: ( 'Character' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:676:6: ( 'Character' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:677:1: 'Character'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 
                    match(input,21,FOLLOW_21_in_rule__WrapperTypes__Alternatives1413); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:689:1: rule__PrimitiveTypes__Alternatives : ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:693:1: ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            case 28:
                {
                alt6=7;
                }
                break;
            case 29:
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
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:694:1: ( 'byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:694:1: ( 'byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:695:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__PrimitiveTypes__Alternatives1448); 
                     after(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:702:6: ( 'short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:702:6: ( 'short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:703:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__PrimitiveTypes__Alternatives1468); 
                     after(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:710:6: ( 'int' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:710:6: ( 'int' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:711:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__PrimitiveTypes__Alternatives1488); 
                     after(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:718:6: ( 'long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:718:6: ( 'long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:719:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                    match(input,25,FOLLOW_25_in_rule__PrimitiveTypes__Alternatives1508); 
                     after(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:726:6: ( 'float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:726:6: ( 'float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:727:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                    match(input,26,FOLLOW_26_in_rule__PrimitiveTypes__Alternatives1528); 
                     after(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:734:6: ( 'double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:734:6: ( 'double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:735:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                    match(input,27,FOLLOW_27_in_rule__PrimitiveTypes__Alternatives1548); 
                     after(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:742:6: ( 'boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:742:6: ( 'boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:743:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                    match(input,28,FOLLOW_28_in_rule__PrimitiveTypes__Alternatives1568); 
                     after(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:750:6: ( 'char' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:750:6: ( 'char' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:751:1: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 
                    match(input,29,FOLLOW_29_in_rule__PrimitiveTypes__Alternatives1588); 
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


    // $ANTLR start "rule__Model__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:765:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:769:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:770:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01620);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01623);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:777:1: rule__Model__Group__0__Impl : ( 'model-id' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:781:1: ( ( 'model-id' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:782:1: ( 'model-id' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:782:1: ( 'model-id' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:783:1: 'model-id'
            {
             before(grammarAccess.getModelAccess().getModelIdKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Model__Group__0__Impl1651); 
             after(grammarAccess.getModelAccess().getModelIdKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:796:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:800:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:801:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11682);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11685);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:808:1: rule__Model__Group__1__Impl : ( '=' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:812:1: ( ( '=' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:813:1: ( '=' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:813:1: ( '=' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:814:1: '='
            {
             before(grammarAccess.getModelAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Model__Group__1__Impl1713); 
             after(grammarAccess.getModelAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:827:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:831:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:832:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21744);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21747);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:839:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:843:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:844:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:844:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:845:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:846:1: ( rule__Model__NameAssignment_2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:846:2: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl1774);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:856:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:860:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:861:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31804);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31807);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:868:1: rule__Model__Group__3__Impl : ( ( rule__Model__PackagesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:872:1: ( ( ( rule__Model__PackagesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:873:1: ( ( rule__Model__PackagesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:873:1: ( ( rule__Model__PackagesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:874:1: ( rule__Model__PackagesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:875:1: ( rule__Model__PackagesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:875:2: rule__Model__PackagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_3_in_rule__Model__Group__3__Impl1834);
            	    rule__Model__PackagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagesAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:885:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:889:1: ( rule__Model__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:890:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41865);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:896:1: rule__Model__Group__4__Impl : ( ( rule__Model__PersistenceModelAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:900:1: ( ( ( rule__Model__PersistenceModelAssignment_4 )? ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:901:1: ( ( rule__Model__PersistenceModelAssignment_4 )? )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:901:1: ( ( rule__Model__PersistenceModelAssignment_4 )? )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:902:1: ( rule__Model__PersistenceModelAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getPersistenceModelAssignment_4()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:903:1: ( rule__Model__PersistenceModelAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:903:2: rule__Model__PersistenceModelAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__PersistenceModelAssignment_4_in_rule__Model__Group__4__Impl1892);
                    rule__Model__PersistenceModelAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getPersistenceModelAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:923:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:927:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:928:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01933);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01936);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:935:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:939:1: ( ( 'package' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:940:1: ( 'package' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:940:1: ( 'package' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:941:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Package__Group__0__Impl1964); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:954:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:958:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:959:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11995);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11998);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:966:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:970:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:971:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:971:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:972:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:973:1: ( rule__Package__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:973:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2025);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:983:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:987:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:988:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22055);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__22058);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:995:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:999:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1000:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1000:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1001:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Package__Group__2__Impl2086); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1014:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1018:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1019:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__32117);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__32120);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1026:1: rule__Package__Group__3__Impl : ( ( rule__Package__EntitiesAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1030:1: ( ( ( rule__Package__EntitiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1031:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1031:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1032:1: ( rule__Package__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1033:1: ( rule__Package__EntitiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1033:2: rule__Package__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl2147);
            	    rule__Package__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1043:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1047:1: ( rule__Package__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1048:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__42178);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1054:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1058:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1059:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1059:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1060:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__Package__Group__4__Impl2206); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1083:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1087:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1088:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02247);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02250);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1095:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1099:1: ( ( 'entity' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1100:1: ( 'entity' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1100:1: ( 'entity' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1101:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl2278); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1114:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1118:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1119:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12309);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12312);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1126:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1130:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1131:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1131:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1132:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1133:1: ( rule__Entity__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1133:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2339);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1143:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1147:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1148:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22369);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22372);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1155:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1159:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1160:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1160:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1161:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__2__Impl2400); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1174:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1178:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1179:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32431);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32434);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1186:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Alternatives_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1190:1: ( ( ( rule__Entity__Alternatives_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1191:1: ( ( rule__Entity__Alternatives_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1191:1: ( ( rule__Entity__Alternatives_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1192:1: ( rule__Entity__Alternatives_3 )*
            {
             before(grammarAccess.getEntityAccess().getAlternatives_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1193:1: ( rule__Entity__Alternatives_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=29)||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1193:2: rule__Entity__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__Alternatives_3_in_rule__Entity__Group__3__Impl2461);
            	    rule__Entity__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAlternatives_3()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1203:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1207:1: ( rule__Entity__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1208:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42492);
            rule__Entity__Group__4__Impl();

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1214:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1218:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1219:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1219:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1220:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__Entity__Group__4__Impl2520); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__EntityReference__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1243:1: rule__EntityReference__Group__0 : rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 ;
    public final void rule__EntityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1247:1: ( rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1248:2: rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__02561);
            rule__EntityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__02564);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1255:1: rule__EntityReference__Group__0__Impl : ( ( rule__EntityReference__Alternatives_0 ) ) ;
    public final void rule__EntityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1259:1: ( ( ( rule__EntityReference__Alternatives_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1260:1: ( ( rule__EntityReference__Alternatives_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1260:1: ( ( rule__EntityReference__Alternatives_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1261:1: ( rule__EntityReference__Alternatives_0 )
            {
             before(grammarAccess.getEntityReferenceAccess().getAlternatives_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1262:1: ( rule__EntityReference__Alternatives_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1262:2: rule__EntityReference__Alternatives_0
            {
            pushFollow(FOLLOW_rule__EntityReference__Alternatives_0_in_rule__EntityReference__Group__0__Impl2591);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1272:1: rule__EntityReference__Group__1 : rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2 ;
    public final void rule__EntityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1276:1: ( rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1277:2: rule__EntityReference__Group__1__Impl rule__EntityReference__Group__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__12621);
            rule__EntityReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__2_in_rule__EntityReference__Group__12624);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1284:1: rule__EntityReference__Group__1__Impl : ( ( rule__EntityReference__NameAssignment_1 ) ) ;
    public final void rule__EntityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1288:1: ( ( ( rule__EntityReference__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1289:1: ( ( rule__EntityReference__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1289:1: ( ( rule__EntityReference__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1290:1: ( rule__EntityReference__NameAssignment_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1291:1: ( rule__EntityReference__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1291:2: rule__EntityReference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityReference__NameAssignment_1_in_rule__EntityReference__Group__1__Impl2651);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1301:1: rule__EntityReference__Group__2 : rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3 ;
    public final void rule__EntityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1305:1: ( rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1306:2: rule__EntityReference__Group__2__Impl rule__EntityReference__Group__3
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__2__Impl_in_rule__EntityReference__Group__22681);
            rule__EntityReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__3_in_rule__EntityReference__Group__22684);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1313:1: rule__EntityReference__Group__2__Impl : ( ( rule__EntityReference__Group_2__0 )? ) ;
    public final void rule__EntityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1317:1: ( ( ( rule__EntityReference__Group_2__0 )? ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1318:1: ( ( rule__EntityReference__Group_2__0 )? )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1318:1: ( ( rule__EntityReference__Group_2__0 )? )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1319:1: ( rule__EntityReference__Group_2__0 )?
            {
             before(grammarAccess.getEntityReferenceAccess().getGroup_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1320:1: ( rule__EntityReference__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1320:2: rule__EntityReference__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EntityReference__Group_2__0_in_rule__EntityReference__Group__2__Impl2711);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1330:1: rule__EntityReference__Group__3 : rule__EntityReference__Group__3__Impl ;
    public final void rule__EntityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1334:1: ( rule__EntityReference__Group__3__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1335:2: rule__EntityReference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__3__Impl_in_rule__EntityReference__Group__32742);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1341:1: rule__EntityReference__Group__3__Impl : ( ';' ) ;
    public final void rule__EntityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1345:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1346:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1346:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1347:1: ';'
            {
             before(grammarAccess.getEntityReferenceAccess().getSemicolonKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__EntityReference__Group__3__Impl2770); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1368:1: rule__EntityReference__Group_0_0__0 : rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1 ;
    public final void rule__EntityReference__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1372:1: ( rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1373:2: rule__EntityReference__Group_0_0__0__Impl rule__EntityReference__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__0__Impl_in_rule__EntityReference__Group_0_0__02809);
            rule__EntityReference__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__1_in_rule__EntityReference__Group_0_0__02812);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1380:1: rule__EntityReference__Group_0_0__0__Impl : ( 'List[' ) ;
    public final void rule__EntityReference__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1384:1: ( ( 'List[' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1385:1: ( 'List[' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1385:1: ( 'List[' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1386:1: 'List['
            {
             before(grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0()); 
            match(input,37,FOLLOW_37_in_rule__EntityReference__Group_0_0__0__Impl2840); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1399:1: rule__EntityReference__Group_0_0__1 : rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2 ;
    public final void rule__EntityReference__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1403:1: ( rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1404:2: rule__EntityReference__Group_0_0__1__Impl rule__EntityReference__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__1__Impl_in_rule__EntityReference__Group_0_0__12871);
            rule__EntityReference__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__2_in_rule__EntityReference__Group_0_0__12874);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1411:1: rule__EntityReference__Group_0_0__1__Impl : ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) ) ;
    public final void rule__EntityReference__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1415:1: ( ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1416:1: ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1416:1: ( ( rule__EntityReference__ListDestinationAssignment_0_0_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1417:1: ( rule__EntityReference__ListDestinationAssignment_0_0_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationAssignment_0_0_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1418:1: ( rule__EntityReference__ListDestinationAssignment_0_0_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1418:2: rule__EntityReference__ListDestinationAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__EntityReference__ListDestinationAssignment_0_0_1_in_rule__EntityReference__Group_0_0__1__Impl2901);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1428:1: rule__EntityReference__Group_0_0__2 : rule__EntityReference__Group_0_0__2__Impl ;
    public final void rule__EntityReference__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1432:1: ( rule__EntityReference__Group_0_0__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1433:2: rule__EntityReference__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_0_0__2__Impl_in_rule__EntityReference__Group_0_0__22931);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1439:1: rule__EntityReference__Group_0_0__2__Impl : ( ']' ) ;
    public final void rule__EntityReference__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1443:1: ( ( ']' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1444:1: ( ']' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1444:1: ( ']' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1445:1: ']'
            {
             before(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2()); 
            match(input,38,FOLLOW_38_in_rule__EntityReference__Group_0_0__2__Impl2959); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1464:1: rule__EntityReference__Group_2__0 : rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1 ;
    public final void rule__EntityReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1468:1: ( rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1469:2: rule__EntityReference__Group_2__0__Impl rule__EntityReference__Group_2__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__0__Impl_in_rule__EntityReference__Group_2__02996);
            rule__EntityReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_2__1_in_rule__EntityReference__Group_2__02999);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1476:1: rule__EntityReference__Group_2__0__Impl : ( '[inverse=' ) ;
    public final void rule__EntityReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1480:1: ( ( '[inverse=' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1481:1: ( '[inverse=' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1481:1: ( '[inverse=' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1482:1: '[inverse='
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__EntityReference__Group_2__0__Impl3027); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1495:1: rule__EntityReference__Group_2__1 : rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2 ;
    public final void rule__EntityReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1499:1: ( rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1500:2: rule__EntityReference__Group_2__1__Impl rule__EntityReference__Group_2__2
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__1__Impl_in_rule__EntityReference__Group_2__13058);
            rule__EntityReference__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group_2__2_in_rule__EntityReference__Group_2__13061);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1507:1: rule__EntityReference__Group_2__1__Impl : ( ( rule__EntityReference__InverseNameAssignment_2_1 ) ) ;
    public final void rule__EntityReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1511:1: ( ( ( rule__EntityReference__InverseNameAssignment_2_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1512:1: ( ( rule__EntityReference__InverseNameAssignment_2_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1512:1: ( ( rule__EntityReference__InverseNameAssignment_2_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1513:1: ( rule__EntityReference__InverseNameAssignment_2_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameAssignment_2_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1514:1: ( rule__EntityReference__InverseNameAssignment_2_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1514:2: rule__EntityReference__InverseNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EntityReference__InverseNameAssignment_2_1_in_rule__EntityReference__Group_2__1__Impl3088);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1524:1: rule__EntityReference__Group_2__2 : rule__EntityReference__Group_2__2__Impl ;
    public final void rule__EntityReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1528:1: ( rule__EntityReference__Group_2__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1529:2: rule__EntityReference__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group_2__2__Impl_in_rule__EntityReference__Group_2__23118);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1535:1: rule__EntityReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__EntityReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1539:1: ( ( ']' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1540:1: ( ']' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1540:1: ( ']' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1541:1: ']'
            {
             before(grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,38,FOLLOW_38_in_rule__EntityReference__Group_2__2__Impl3146); 
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


    // $ANTLR start "rule__Persistence__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1560:1: rule__Persistence__Group__0 : rule__Persistence__Group__0__Impl rule__Persistence__Group__1 ;
    public final void rule__Persistence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1564:1: ( rule__Persistence__Group__0__Impl rule__Persistence__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1565:2: rule__Persistence__Group__0__Impl rule__Persistence__Group__1
            {
            pushFollow(FOLLOW_rule__Persistence__Group__0__Impl_in_rule__Persistence__Group__03183);
            rule__Persistence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Persistence__Group__1_in_rule__Persistence__Group__03186);
            rule__Persistence__Group__1();

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
    // $ANTLR end "rule__Persistence__Group__0"


    // $ANTLR start "rule__Persistence__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1572:1: rule__Persistence__Group__0__Impl : ( 'persistence' ) ;
    public final void rule__Persistence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1576:1: ( ( 'persistence' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1577:1: ( 'persistence' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1577:1: ( 'persistence' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1578:1: 'persistence'
            {
             before(grammarAccess.getPersistenceAccess().getPersistenceKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Persistence__Group__0__Impl3214); 
             after(grammarAccess.getPersistenceAccess().getPersistenceKeyword_0()); 

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
    // $ANTLR end "rule__Persistence__Group__0__Impl"


    // $ANTLR start "rule__Persistence__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1591:1: rule__Persistence__Group__1 : rule__Persistence__Group__1__Impl rule__Persistence__Group__2 ;
    public final void rule__Persistence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1595:1: ( rule__Persistence__Group__1__Impl rule__Persistence__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1596:2: rule__Persistence__Group__1__Impl rule__Persistence__Group__2
            {
            pushFollow(FOLLOW_rule__Persistence__Group__1__Impl_in_rule__Persistence__Group__13245);
            rule__Persistence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Persistence__Group__2_in_rule__Persistence__Group__13248);
            rule__Persistence__Group__2();

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
    // $ANTLR end "rule__Persistence__Group__1"


    // $ANTLR start "rule__Persistence__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1603:1: rule__Persistence__Group__1__Impl : ( '{' ) ;
    public final void rule__Persistence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1607:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1608:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1608:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1609:1: '{'
            {
             before(grammarAccess.getPersistenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Persistence__Group__1__Impl3276); 
             after(grammarAccess.getPersistenceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Persistence__Group__1__Impl"


    // $ANTLR start "rule__Persistence__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1622:1: rule__Persistence__Group__2 : rule__Persistence__Group__2__Impl rule__Persistence__Group__3 ;
    public final void rule__Persistence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1626:1: ( rule__Persistence__Group__2__Impl rule__Persistence__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1627:2: rule__Persistence__Group__2__Impl rule__Persistence__Group__3
            {
            pushFollow(FOLLOW_rule__Persistence__Group__2__Impl_in_rule__Persistence__Group__23307);
            rule__Persistence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Persistence__Group__3_in_rule__Persistence__Group__23310);
            rule__Persistence__Group__3();

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
    // $ANTLR end "rule__Persistence__Group__2"


    // $ANTLR start "rule__Persistence__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1634:1: rule__Persistence__Group__2__Impl : ( ( ( rule__Persistence__PersistencePackageAssignment_2 ) ) ( ( rule__Persistence__PersistencePackageAssignment_2 )* ) ) ;
    public final void rule__Persistence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1638:1: ( ( ( ( rule__Persistence__PersistencePackageAssignment_2 ) ) ( ( rule__Persistence__PersistencePackageAssignment_2 )* ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1639:1: ( ( ( rule__Persistence__PersistencePackageAssignment_2 ) ) ( ( rule__Persistence__PersistencePackageAssignment_2 )* ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1639:1: ( ( ( rule__Persistence__PersistencePackageAssignment_2 ) ) ( ( rule__Persistence__PersistencePackageAssignment_2 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1640:1: ( ( rule__Persistence__PersistencePackageAssignment_2 ) ) ( ( rule__Persistence__PersistencePackageAssignment_2 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1640:1: ( ( rule__Persistence__PersistencePackageAssignment_2 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1641:1: ( rule__Persistence__PersistencePackageAssignment_2 )
            {
             before(grammarAccess.getPersistenceAccess().getPersistencePackageAssignment_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1642:1: ( rule__Persistence__PersistencePackageAssignment_2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1642:2: rule__Persistence__PersistencePackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Persistence__PersistencePackageAssignment_2_in_rule__Persistence__Group__2__Impl3339);
            rule__Persistence__PersistencePackageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceAccess().getPersistencePackageAssignment_2()); 

            }

            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1645:1: ( ( rule__Persistence__PersistencePackageAssignment_2 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1646:1: ( rule__Persistence__PersistencePackageAssignment_2 )*
            {
             before(grammarAccess.getPersistenceAccess().getPersistencePackageAssignment_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1647:1: ( rule__Persistence__PersistencePackageAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1647:2: rule__Persistence__PersistencePackageAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Persistence__PersistencePackageAssignment_2_in_rule__Persistence__Group__2__Impl3351);
            	    rule__Persistence__PersistencePackageAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPersistenceAccess().getPersistencePackageAssignment_2()); 

            }


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
    // $ANTLR end "rule__Persistence__Group__2__Impl"


    // $ANTLR start "rule__Persistence__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1658:1: rule__Persistence__Group__3 : rule__Persistence__Group__3__Impl ;
    public final void rule__Persistence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1662:1: ( rule__Persistence__Group__3__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1663:2: rule__Persistence__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Persistence__Group__3__Impl_in_rule__Persistence__Group__33384);
            rule__Persistence__Group__3__Impl();

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
    // $ANTLR end "rule__Persistence__Group__3"


    // $ANTLR start "rule__Persistence__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1669:1: rule__Persistence__Group__3__Impl : ( '}' ) ;
    public final void rule__Persistence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1673:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1674:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1674:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1675:1: '}'
            {
             before(grammarAccess.getPersistenceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Persistence__Group__3__Impl3412); 
             after(grammarAccess.getPersistenceAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Persistence__Group__3__Impl"


    // $ANTLR start "rule__PersistencePackage__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1696:1: rule__PersistencePackage__Group__0 : rule__PersistencePackage__Group__0__Impl rule__PersistencePackage__Group__1 ;
    public final void rule__PersistencePackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1700:1: ( rule__PersistencePackage__Group__0__Impl rule__PersistencePackage__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1701:2: rule__PersistencePackage__Group__0__Impl rule__PersistencePackage__Group__1
            {
            pushFollow(FOLLOW_rule__PersistencePackage__Group__0__Impl_in_rule__PersistencePackage__Group__03451);
            rule__PersistencePackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistencePackage__Group__1_in_rule__PersistencePackage__Group__03454);
            rule__PersistencePackage__Group__1();

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
    // $ANTLR end "rule__PersistencePackage__Group__0"


    // $ANTLR start "rule__PersistencePackage__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1708:1: rule__PersistencePackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__PersistencePackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1712:1: ( ( 'package' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1713:1: ( 'package' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1713:1: ( 'package' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1714:1: 'package'
            {
             before(grammarAccess.getPersistencePackageAccess().getPackageKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PersistencePackage__Group__0__Impl3482); 
             after(grammarAccess.getPersistencePackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__PersistencePackage__Group__0__Impl"


    // $ANTLR start "rule__PersistencePackage__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1727:1: rule__PersistencePackage__Group__1 : rule__PersistencePackage__Group__1__Impl rule__PersistencePackage__Group__2 ;
    public final void rule__PersistencePackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1731:1: ( rule__PersistencePackage__Group__1__Impl rule__PersistencePackage__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1732:2: rule__PersistencePackage__Group__1__Impl rule__PersistencePackage__Group__2
            {
            pushFollow(FOLLOW_rule__PersistencePackage__Group__1__Impl_in_rule__PersistencePackage__Group__13513);
            rule__PersistencePackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistencePackage__Group__2_in_rule__PersistencePackage__Group__13516);
            rule__PersistencePackage__Group__2();

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
    // $ANTLR end "rule__PersistencePackage__Group__1"


    // $ANTLR start "rule__PersistencePackage__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1739:1: rule__PersistencePackage__Group__1__Impl : ( ( rule__PersistencePackage__NameAssignment_1 ) ) ;
    public final void rule__PersistencePackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1743:1: ( ( ( rule__PersistencePackage__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1744:1: ( ( rule__PersistencePackage__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1744:1: ( ( rule__PersistencePackage__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1745:1: ( rule__PersistencePackage__NameAssignment_1 )
            {
             before(grammarAccess.getPersistencePackageAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1746:1: ( rule__PersistencePackage__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1746:2: rule__PersistencePackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PersistencePackage__NameAssignment_1_in_rule__PersistencePackage__Group__1__Impl3543);
            rule__PersistencePackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PersistencePackage__Group__1__Impl"


    // $ANTLR start "rule__PersistencePackage__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1756:1: rule__PersistencePackage__Group__2 : rule__PersistencePackage__Group__2__Impl rule__PersistencePackage__Group__3 ;
    public final void rule__PersistencePackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1760:1: ( rule__PersistencePackage__Group__2__Impl rule__PersistencePackage__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1761:2: rule__PersistencePackage__Group__2__Impl rule__PersistencePackage__Group__3
            {
            pushFollow(FOLLOW_rule__PersistencePackage__Group__2__Impl_in_rule__PersistencePackage__Group__23573);
            rule__PersistencePackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistencePackage__Group__3_in_rule__PersistencePackage__Group__23576);
            rule__PersistencePackage__Group__3();

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
    // $ANTLR end "rule__PersistencePackage__Group__2"


    // $ANTLR start "rule__PersistencePackage__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1768:1: rule__PersistencePackage__Group__2__Impl : ( '{' ) ;
    public final void rule__PersistencePackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1772:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1773:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1773:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1774:1: '{'
            {
             before(grammarAccess.getPersistencePackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__PersistencePackage__Group__2__Impl3604); 
             after(grammarAccess.getPersistencePackageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PersistencePackage__Group__2__Impl"


    // $ANTLR start "rule__PersistencePackage__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1787:1: rule__PersistencePackage__Group__3 : rule__PersistencePackage__Group__3__Impl rule__PersistencePackage__Group__4 ;
    public final void rule__PersistencePackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1791:1: ( rule__PersistencePackage__Group__3__Impl rule__PersistencePackage__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1792:2: rule__PersistencePackage__Group__3__Impl rule__PersistencePackage__Group__4
            {
            pushFollow(FOLLOW_rule__PersistencePackage__Group__3__Impl_in_rule__PersistencePackage__Group__33635);
            rule__PersistencePackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistencePackage__Group__4_in_rule__PersistencePackage__Group__33638);
            rule__PersistencePackage__Group__4();

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
    // $ANTLR end "rule__PersistencePackage__Group__3"


    // $ANTLR start "rule__PersistencePackage__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1799:1: rule__PersistencePackage__Group__3__Impl : ( ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 ) ) ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )* ) ) ;
    public final void rule__PersistencePackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1803:1: ( ( ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 ) ) ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )* ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1804:1: ( ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 ) ) ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )* ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1804:1: ( ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 ) ) ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1805:1: ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 ) ) ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1805:1: ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1806:1: ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )
            {
             before(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1807:1: ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1807:2: rule__PersistencePackage__PersistenceEntitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__PersistencePackage__PersistenceEntitiesAssignment_3_in_rule__PersistencePackage__Group__3__Impl3667);
            rule__PersistencePackage__PersistenceEntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesAssignment_3()); 

            }

            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1810:1: ( ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1811:1: ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )*
            {
             before(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1812:1: ( rule__PersistencePackage__PersistenceEntitiesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1812:2: rule__PersistencePackage__PersistenceEntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PersistencePackage__PersistenceEntitiesAssignment_3_in_rule__PersistencePackage__Group__3__Impl3679);
            	    rule__PersistencePackage__PersistenceEntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesAssignment_3()); 

            }


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
    // $ANTLR end "rule__PersistencePackage__Group__3__Impl"


    // $ANTLR start "rule__PersistencePackage__Group__4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1823:1: rule__PersistencePackage__Group__4 : rule__PersistencePackage__Group__4__Impl ;
    public final void rule__PersistencePackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1827:1: ( rule__PersistencePackage__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1828:2: rule__PersistencePackage__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PersistencePackage__Group__4__Impl_in_rule__PersistencePackage__Group__43712);
            rule__PersistencePackage__Group__4__Impl();

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
    // $ANTLR end "rule__PersistencePackage__Group__4"


    // $ANTLR start "rule__PersistencePackage__Group__4__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1834:1: rule__PersistencePackage__Group__4__Impl : ( '}' ) ;
    public final void rule__PersistencePackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1838:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1839:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1839:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1840:1: '}'
            {
             before(grammarAccess.getPersistencePackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__PersistencePackage__Group__4__Impl3740); 
             after(grammarAccess.getPersistencePackageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PersistencePackage__Group__4__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1863:1: rule__PersistenceEntity__Group__0 : rule__PersistenceEntity__Group__0__Impl rule__PersistenceEntity__Group__1 ;
    public final void rule__PersistenceEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1867:1: ( rule__PersistenceEntity__Group__0__Impl rule__PersistenceEntity__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1868:2: rule__PersistenceEntity__Group__0__Impl rule__PersistenceEntity__Group__1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__0__Impl_in_rule__PersistenceEntity__Group__03781);
            rule__PersistenceEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceEntity__Group__1_in_rule__PersistenceEntity__Group__03784);
            rule__PersistenceEntity__Group__1();

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
    // $ANTLR end "rule__PersistenceEntity__Group__0"


    // $ANTLR start "rule__PersistenceEntity__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1875:1: rule__PersistenceEntity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__PersistenceEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1879:1: ( ( 'entity' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1880:1: ( 'entity' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1880:1: ( 'entity' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1881:1: 'entity'
            {
             before(grammarAccess.getPersistenceEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__PersistenceEntity__Group__0__Impl3812); 
             after(grammarAccess.getPersistenceEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__PersistenceEntity__Group__0__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1894:1: rule__PersistenceEntity__Group__1 : rule__PersistenceEntity__Group__1__Impl rule__PersistenceEntity__Group__2 ;
    public final void rule__PersistenceEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1898:1: ( rule__PersistenceEntity__Group__1__Impl rule__PersistenceEntity__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1899:2: rule__PersistenceEntity__Group__1__Impl rule__PersistenceEntity__Group__2
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__1__Impl_in_rule__PersistenceEntity__Group__13843);
            rule__PersistenceEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceEntity__Group__2_in_rule__PersistenceEntity__Group__13846);
            rule__PersistenceEntity__Group__2();

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
    // $ANTLR end "rule__PersistenceEntity__Group__1"


    // $ANTLR start "rule__PersistenceEntity__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1906:1: rule__PersistenceEntity__Group__1__Impl : ( ( rule__PersistenceEntity__NameAssignment_1 ) ) ;
    public final void rule__PersistenceEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1910:1: ( ( ( rule__PersistenceEntity__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1911:1: ( ( rule__PersistenceEntity__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1911:1: ( ( rule__PersistenceEntity__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1912:1: ( rule__PersistenceEntity__NameAssignment_1 )
            {
             before(grammarAccess.getPersistenceEntityAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1913:1: ( rule__PersistenceEntity__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1913:2: rule__PersistenceEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__NameAssignment_1_in_rule__PersistenceEntity__Group__1__Impl3873);
            rule__PersistenceEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PersistenceEntity__Group__1__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1923:1: rule__PersistenceEntity__Group__2 : rule__PersistenceEntity__Group__2__Impl rule__PersistenceEntity__Group__3 ;
    public final void rule__PersistenceEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1927:1: ( rule__PersistenceEntity__Group__2__Impl rule__PersistenceEntity__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1928:2: rule__PersistenceEntity__Group__2__Impl rule__PersistenceEntity__Group__3
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__2__Impl_in_rule__PersistenceEntity__Group__23903);
            rule__PersistenceEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceEntity__Group__3_in_rule__PersistenceEntity__Group__23906);
            rule__PersistenceEntity__Group__3();

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
    // $ANTLR end "rule__PersistenceEntity__Group__2"


    // $ANTLR start "rule__PersistenceEntity__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1935:1: rule__PersistenceEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__PersistenceEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1939:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1940:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1940:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1941:1: '{'
            {
             before(grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__PersistenceEntity__Group__2__Impl3934); 
             after(grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PersistenceEntity__Group__2__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1954:1: rule__PersistenceEntity__Group__3 : rule__PersistenceEntity__Group__3__Impl rule__PersistenceEntity__Group__4 ;
    public final void rule__PersistenceEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1958:1: ( rule__PersistenceEntity__Group__3__Impl rule__PersistenceEntity__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1959:2: rule__PersistenceEntity__Group__3__Impl rule__PersistenceEntity__Group__4
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__3__Impl_in_rule__PersistenceEntity__Group__33965);
            rule__PersistenceEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceEntity__Group__4_in_rule__PersistenceEntity__Group__33968);
            rule__PersistenceEntity__Group__4();

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
    // $ANTLR end "rule__PersistenceEntity__Group__3"


    // $ANTLR start "rule__PersistenceEntity__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1966:1: rule__PersistenceEntity__Group__3__Impl : ( ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 ) ) ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )* ) ) ;
    public final void rule__PersistenceEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1970:1: ( ( ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 ) ) ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )* ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1971:1: ( ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 ) ) ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )* ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1971:1: ( ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 ) ) ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1972:1: ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 ) ) ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1972:1: ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1973:1: ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )
            {
             before(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1974:1: ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1974:2: rule__PersistenceEntity__PersistencePropertiesAssignment_3
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__PersistencePropertiesAssignment_3_in_rule__PersistenceEntity__Group__3__Impl3997);
            rule__PersistenceEntity__PersistencePropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesAssignment_3()); 

            }

            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1977:1: ( ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1978:1: ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )*
            {
             before(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1979:1: ( rule__PersistenceEntity__PersistencePropertiesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1979:2: rule__PersistenceEntity__PersistencePropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PersistenceEntity__PersistencePropertiesAssignment_3_in_rule__PersistenceEntity__Group__3__Impl4009);
            	    rule__PersistenceEntity__PersistencePropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesAssignment_3()); 

            }


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
    // $ANTLR end "rule__PersistenceEntity__Group__3__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1990:1: rule__PersistenceEntity__Group__4 : rule__PersistenceEntity__Group__4__Impl ;
    public final void rule__PersistenceEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1994:1: ( rule__PersistenceEntity__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1995:2: rule__PersistenceEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__4__Impl_in_rule__PersistenceEntity__Group__44042);
            rule__PersistenceEntity__Group__4__Impl();

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
    // $ANTLR end "rule__PersistenceEntity__Group__4"


    // $ANTLR start "rule__PersistenceEntity__Group__4__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2001:1: rule__PersistenceEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__PersistenceEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2005:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2006:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2006:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2007:1: '}'
            {
             before(grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__PersistenceEntity__Group__4__Impl4070); 
             after(grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PersistenceEntity__Group__4__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2030:1: rule__PersistenceProperty__Group__0 : rule__PersistenceProperty__Group__0__Impl rule__PersistenceProperty__Group__1 ;
    public final void rule__PersistenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2034:1: ( rule__PersistenceProperty__Group__0__Impl rule__PersistenceProperty__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2035:2: rule__PersistenceProperty__Group__0__Impl rule__PersistenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group__0__Impl_in_rule__PersistenceProperty__Group__04111);
            rule__PersistenceProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceProperty__Group__1_in_rule__PersistenceProperty__Group__04114);
            rule__PersistenceProperty__Group__1();

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
    // $ANTLR end "rule__PersistenceProperty__Group__0"


    // $ANTLR start "rule__PersistenceProperty__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2042:1: rule__PersistenceProperty__Group__0__Impl : ( ( rule__PersistenceProperty__NameAssignment_0 ) ) ;
    public final void rule__PersistenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2046:1: ( ( ( rule__PersistenceProperty__NameAssignment_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2047:1: ( ( rule__PersistenceProperty__NameAssignment_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2047:1: ( ( rule__PersistenceProperty__NameAssignment_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2048:1: ( rule__PersistenceProperty__NameAssignment_0 )
            {
             before(grammarAccess.getPersistencePropertyAccess().getNameAssignment_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2049:1: ( rule__PersistenceProperty__NameAssignment_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2049:2: rule__PersistenceProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__NameAssignment_0_in_rule__PersistenceProperty__Group__0__Impl4141);
            rule__PersistenceProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group__0__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2059:1: rule__PersistenceProperty__Group__1 : rule__PersistenceProperty__Group__1__Impl rule__PersistenceProperty__Group__2 ;
    public final void rule__PersistenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2063:1: ( rule__PersistenceProperty__Group__1__Impl rule__PersistenceProperty__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2064:2: rule__PersistenceProperty__Group__1__Impl rule__PersistenceProperty__Group__2
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group__1__Impl_in_rule__PersistenceProperty__Group__14171);
            rule__PersistenceProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceProperty__Group__2_in_rule__PersistenceProperty__Group__14174);
            rule__PersistenceProperty__Group__2();

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
    // $ANTLR end "rule__PersistenceProperty__Group__1"


    // $ANTLR start "rule__PersistenceProperty__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2071:1: rule__PersistenceProperty__Group__1__Impl : ( '(' ) ;
    public final void rule__PersistenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2075:1: ( ( '(' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2076:1: ( '(' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2076:1: ( '(' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2077:1: '('
            {
             before(grammarAccess.getPersistencePropertyAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__PersistenceProperty__Group__1__Impl4202); 
             after(grammarAccess.getPersistencePropertyAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group__1__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2090:1: rule__PersistenceProperty__Group__2 : rule__PersistenceProperty__Group__2__Impl rule__PersistenceProperty__Group__3 ;
    public final void rule__PersistenceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2094:1: ( rule__PersistenceProperty__Group__2__Impl rule__PersistenceProperty__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2095:2: rule__PersistenceProperty__Group__2__Impl rule__PersistenceProperty__Group__3
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group__2__Impl_in_rule__PersistenceProperty__Group__24233);
            rule__PersistenceProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceProperty__Group__3_in_rule__PersistenceProperty__Group__24236);
            rule__PersistenceProperty__Group__3();

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
    // $ANTLR end "rule__PersistenceProperty__Group__2"


    // $ANTLR start "rule__PersistenceProperty__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2102:1: rule__PersistenceProperty__Group__2__Impl : ( ( rule__PersistenceProperty__ConfigAssignment_2 ) ) ;
    public final void rule__PersistenceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2106:1: ( ( ( rule__PersistenceProperty__ConfigAssignment_2 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2107:1: ( ( rule__PersistenceProperty__ConfigAssignment_2 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2107:1: ( ( rule__PersistenceProperty__ConfigAssignment_2 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2108:1: ( rule__PersistenceProperty__ConfigAssignment_2 )
            {
             before(grammarAccess.getPersistencePropertyAccess().getConfigAssignment_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2109:1: ( rule__PersistenceProperty__ConfigAssignment_2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2109:2: rule__PersistenceProperty__ConfigAssignment_2
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__ConfigAssignment_2_in_rule__PersistenceProperty__Group__2__Impl4263);
            rule__PersistenceProperty__ConfigAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyAccess().getConfigAssignment_2()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group__2__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group__3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2119:1: rule__PersistenceProperty__Group__3 : rule__PersistenceProperty__Group__3__Impl rule__PersistenceProperty__Group__4 ;
    public final void rule__PersistenceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2123:1: ( rule__PersistenceProperty__Group__3__Impl rule__PersistenceProperty__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2124:2: rule__PersistenceProperty__Group__3__Impl rule__PersistenceProperty__Group__4
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group__3__Impl_in_rule__PersistenceProperty__Group__34293);
            rule__PersistenceProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceProperty__Group__4_in_rule__PersistenceProperty__Group__34296);
            rule__PersistenceProperty__Group__4();

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
    // $ANTLR end "rule__PersistenceProperty__Group__3"


    // $ANTLR start "rule__PersistenceProperty__Group__3__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2131:1: rule__PersistenceProperty__Group__3__Impl : ( ( rule__PersistenceProperty__Group_3__0 )* ) ;
    public final void rule__PersistenceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2135:1: ( ( ( rule__PersistenceProperty__Group_3__0 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2136:1: ( ( rule__PersistenceProperty__Group_3__0 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2136:1: ( ( rule__PersistenceProperty__Group_3__0 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2137:1: ( rule__PersistenceProperty__Group_3__0 )*
            {
             before(grammarAccess.getPersistencePropertyAccess().getGroup_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2138:1: ( rule__PersistenceProperty__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2138:2: rule__PersistenceProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PersistenceProperty__Group_3__0_in_rule__PersistenceProperty__Group__3__Impl4323);
            	    rule__PersistenceProperty__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPersistencePropertyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group__3__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group__4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2148:1: rule__PersistenceProperty__Group__4 : rule__PersistenceProperty__Group__4__Impl ;
    public final void rule__PersistenceProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2152:1: ( rule__PersistenceProperty__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2153:2: rule__PersistenceProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group__4__Impl_in_rule__PersistenceProperty__Group__44354);
            rule__PersistenceProperty__Group__4__Impl();

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
    // $ANTLR end "rule__PersistenceProperty__Group__4"


    // $ANTLR start "rule__PersistenceProperty__Group__4__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2159:1: rule__PersistenceProperty__Group__4__Impl : ( ')' ) ;
    public final void rule__PersistenceProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2163:1: ( ( ')' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2164:1: ( ')' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2164:1: ( ')' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2165:1: ')'
            {
             before(grammarAccess.getPersistencePropertyAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__PersistenceProperty__Group__4__Impl4382); 
             after(grammarAccess.getPersistencePropertyAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group__4__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group_3__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2188:1: rule__PersistenceProperty__Group_3__0 : rule__PersistenceProperty__Group_3__0__Impl rule__PersistenceProperty__Group_3__1 ;
    public final void rule__PersistenceProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2192:1: ( rule__PersistenceProperty__Group_3__0__Impl rule__PersistenceProperty__Group_3__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2193:2: rule__PersistenceProperty__Group_3__0__Impl rule__PersistenceProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group_3__0__Impl_in_rule__PersistenceProperty__Group_3__04423);
            rule__PersistenceProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistenceProperty__Group_3__1_in_rule__PersistenceProperty__Group_3__04426);
            rule__PersistenceProperty__Group_3__1();

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
    // $ANTLR end "rule__PersistenceProperty__Group_3__0"


    // $ANTLR start "rule__PersistenceProperty__Group_3__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2200:1: rule__PersistenceProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__PersistenceProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2204:1: ( ( ',' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2205:1: ( ',' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2205:1: ( ',' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2206:1: ','
            {
             before(grammarAccess.getPersistencePropertyAccess().getCommaKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__PersistenceProperty__Group_3__0__Impl4454); 
             after(grammarAccess.getPersistencePropertyAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group_3__0__Impl"


    // $ANTLR start "rule__PersistenceProperty__Group_3__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2219:1: rule__PersistenceProperty__Group_3__1 : rule__PersistenceProperty__Group_3__1__Impl ;
    public final void rule__PersistenceProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2223:1: ( rule__PersistenceProperty__Group_3__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2224:2: rule__PersistenceProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__Group_3__1__Impl_in_rule__PersistenceProperty__Group_3__14485);
            rule__PersistenceProperty__Group_3__1__Impl();

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
    // $ANTLR end "rule__PersistenceProperty__Group_3__1"


    // $ANTLR start "rule__PersistenceProperty__Group_3__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2230:1: rule__PersistenceProperty__Group_3__1__Impl : ( ( rule__PersistenceProperty__ConfigAssignment_3_1 ) ) ;
    public final void rule__PersistenceProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2234:1: ( ( ( rule__PersistenceProperty__ConfigAssignment_3_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2235:1: ( ( rule__PersistenceProperty__ConfigAssignment_3_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2235:1: ( ( rule__PersistenceProperty__ConfigAssignment_3_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2236:1: ( rule__PersistenceProperty__ConfigAssignment_3_1 )
            {
             before(grammarAccess.getPersistencePropertyAccess().getConfigAssignment_3_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2237:1: ( rule__PersistenceProperty__ConfigAssignment_3_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2237:2: rule__PersistenceProperty__ConfigAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PersistenceProperty__ConfigAssignment_3_1_in_rule__PersistenceProperty__Group_3__1__Impl4512);
            rule__PersistenceProperty__ConfigAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyAccess().getConfigAssignment_3_1()); 

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
    // $ANTLR end "rule__PersistenceProperty__Group_3__1__Impl"


    // $ANTLR start "rule__PersistencePropertyConfig__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2251:1: rule__PersistencePropertyConfig__Group__0 : rule__PersistencePropertyConfig__Group__0__Impl rule__PersistencePropertyConfig__Group__1 ;
    public final void rule__PersistencePropertyConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2255:1: ( rule__PersistencePropertyConfig__Group__0__Impl rule__PersistencePropertyConfig__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2256:2: rule__PersistencePropertyConfig__Group__0__Impl rule__PersistencePropertyConfig__Group__1
            {
            pushFollow(FOLLOW_rule__PersistencePropertyConfig__Group__0__Impl_in_rule__PersistencePropertyConfig__Group__04546);
            rule__PersistencePropertyConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistencePropertyConfig__Group__1_in_rule__PersistencePropertyConfig__Group__04549);
            rule__PersistencePropertyConfig__Group__1();

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
    // $ANTLR end "rule__PersistencePropertyConfig__Group__0"


    // $ANTLR start "rule__PersistencePropertyConfig__Group__0__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2263:1: rule__PersistencePropertyConfig__Group__0__Impl : ( ( rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 ) ) ;
    public final void rule__PersistencePropertyConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2267:1: ( ( ( rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2268:1: ( ( rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2268:1: ( ( rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2269:1: ( rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 )
            {
             before(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigKeyAssignment_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2270:1: ( rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2270:2: rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0
            {
            pushFollow(FOLLOW_rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0_in_rule__PersistencePropertyConfig__Group__0__Impl4576);
            rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigKeyAssignment_0()); 

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
    // $ANTLR end "rule__PersistencePropertyConfig__Group__0__Impl"


    // $ANTLR start "rule__PersistencePropertyConfig__Group__1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2280:1: rule__PersistencePropertyConfig__Group__1 : rule__PersistencePropertyConfig__Group__1__Impl rule__PersistencePropertyConfig__Group__2 ;
    public final void rule__PersistencePropertyConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2284:1: ( rule__PersistencePropertyConfig__Group__1__Impl rule__PersistencePropertyConfig__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2285:2: rule__PersistencePropertyConfig__Group__1__Impl rule__PersistencePropertyConfig__Group__2
            {
            pushFollow(FOLLOW_rule__PersistencePropertyConfig__Group__1__Impl_in_rule__PersistencePropertyConfig__Group__14606);
            rule__PersistencePropertyConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PersistencePropertyConfig__Group__2_in_rule__PersistencePropertyConfig__Group__14609);
            rule__PersistencePropertyConfig__Group__2();

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
    // $ANTLR end "rule__PersistencePropertyConfig__Group__1"


    // $ANTLR start "rule__PersistencePropertyConfig__Group__1__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2292:1: rule__PersistencePropertyConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__PersistencePropertyConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2296:1: ( ( '=' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2297:1: ( '=' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2297:1: ( '=' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2298:1: '='
            {
             before(grammarAccess.getPersistencePropertyConfigAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__PersistencePropertyConfig__Group__1__Impl4637); 
             after(grammarAccess.getPersistencePropertyConfigAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__PersistencePropertyConfig__Group__1__Impl"


    // $ANTLR start "rule__PersistencePropertyConfig__Group__2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2311:1: rule__PersistencePropertyConfig__Group__2 : rule__PersistencePropertyConfig__Group__2__Impl ;
    public final void rule__PersistencePropertyConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2315:1: ( rule__PersistencePropertyConfig__Group__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2316:2: rule__PersistencePropertyConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PersistencePropertyConfig__Group__2__Impl_in_rule__PersistencePropertyConfig__Group__24668);
            rule__PersistencePropertyConfig__Group__2__Impl();

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
    // $ANTLR end "rule__PersistencePropertyConfig__Group__2"


    // $ANTLR start "rule__PersistencePropertyConfig__Group__2__Impl"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2322:1: rule__PersistencePropertyConfig__Group__2__Impl : ( ( rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 ) ) ;
    public final void rule__PersistencePropertyConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2326:1: ( ( ( rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2327:1: ( ( rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2327:1: ( ( rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2328:1: ( rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 )
            {
             before(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigValueAssignment_2()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2329:1: ( rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2329:2: rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2_in_rule__PersistencePropertyConfig__Group__2__Impl4695);
            rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigValueAssignment_2()); 

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
    // $ANTLR end "rule__PersistencePropertyConfig__Group__2__Impl"


    // $ANTLR start "rule__EntityProperty__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2345:1: rule__EntityProperty__Group__0 : rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 ;
    public final void rule__EntityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2349:1: ( rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2350:2: rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__04731);
            rule__EntityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__04734);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2357:1: rule__EntityProperty__Group__0__Impl : ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) ;
    public final void rule__EntityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2361:1: ( ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2362:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2362:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2363:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeAssignment_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2364:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2364:2: rule__EntityProperty__PropertyTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl4761);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2374:1: rule__EntityProperty__Group__1 : rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 ;
    public final void rule__EntityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2378:1: ( rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2379:2: rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__14791);
            rule__EntityProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__14794);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2386:1: rule__EntityProperty__Group__1__Impl : ( ( rule__EntityProperty__NameAssignment_1 ) ) ;
    public final void rule__EntityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2390:1: ( ( ( rule__EntityProperty__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2391:1: ( ( rule__EntityProperty__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2391:1: ( ( rule__EntityProperty__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2392:1: ( rule__EntityProperty__NameAssignment_1 )
            {
             before(grammarAccess.getEntityPropertyAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2393:1: ( rule__EntityProperty__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2393:2: rule__EntityProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityProperty__NameAssignment_1_in_rule__EntityProperty__Group__1__Impl4821);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2403:1: rule__EntityProperty__Group__2 : rule__EntityProperty__Group__2__Impl ;
    public final void rule__EntityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2407:1: ( rule__EntityProperty__Group__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2408:2: rule__EntityProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__24851);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2414:1: rule__EntityProperty__Group__2__Impl : ( ';' ) ;
    public final void rule__EntityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2418:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2419:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2419:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2420:1: ';'
            {
             before(grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__EntityProperty__Group__2__Impl4879); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2439:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2443:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2444:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__04916);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__04919);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2451:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2455:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2456:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2456:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2457:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl4946); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2468:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2472:1: ( rule__PackageName__Group__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2473:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__14975);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2479:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2483:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2484:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2484:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2485:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2486:1: ( rule__PackageName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2486:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl5002);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2500:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2504:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2505:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__05037);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__05040);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2512:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2516:1: ( ( '.' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2517:1: ( '.' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2517:1: ( '.' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2518:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__PackageName__Group_1__0__Impl5068); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2531:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2535:1: ( rule__PackageName__Group_1__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2536:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__15099);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2542:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2546:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2547:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2547:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2548:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl5126); 
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


    // $ANTLR start "rule__Model__NameAssignment_2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2564:1: rule__Model__NameAssignment_2 : ( rulePackageName ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2568:1: ( ( rulePackageName ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2569:1: ( rulePackageName )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2569:1: ( rulePackageName )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2570:1: rulePackageName
            {
             before(grammarAccess.getModelAccess().getNamePackageNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Model__NameAssignment_25164);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNamePackageNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__PackagesAssignment_3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2579:1: rule__Model__PackagesAssignment_3 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2583:1: ( ( rulePackage ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2584:1: ( rulePackage )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2584:1: ( rulePackage )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2585:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_35195);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__PackagesAssignment_3"


    // $ANTLR start "rule__Model__PersistenceModelAssignment_4"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2594:1: rule__Model__PersistenceModelAssignment_4 : ( rulePersistence ) ;
    public final void rule__Model__PersistenceModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2598:1: ( ( rulePersistence ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2599:1: ( rulePersistence )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2599:1: ( rulePersistence )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2600:1: rulePersistence
            {
             before(grammarAccess.getModelAccess().getPersistenceModelPersistenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePersistence_in_rule__Model__PersistenceModelAssignment_45226);
            rulePersistence();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPersistenceModelPersistenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__PersistenceModelAssignment_4"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2609:1: rule__Package__NameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2613:1: ( ( rulePackageName ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2614:1: ( rulePackageName )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2614:1: ( rulePackageName )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2615:1: rulePackageName
            {
             before(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Package__NameAssignment_15257);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2624:1: rule__Package__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2628:1: ( ( ruleEntity ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2629:1: ( ruleEntity )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2629:1: ( ruleEntity )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2630:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_35288);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2639:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2643:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2644:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2644:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2645:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15319); 
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


    // $ANTLR start "rule__Entity__PropertiesAssignment_3_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2654:1: rule__Entity__PropertiesAssignment_3_0 : ( ruleEntityProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2658:1: ( ( ruleEntityProperty ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2659:1: ( ruleEntityProperty )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2659:1: ( ruleEntityProperty )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2660:1: ruleEntityProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_3_05350);
            ruleEntityProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Entity__PropertiesAssignment_3_0"


    // $ANTLR start "rule__Entity__ReferencesAssignment_3_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2669:1: rule__Entity__ReferencesAssignment_3_1 : ( ruleEntityReference ) ;
    public final void rule__Entity__ReferencesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2673:1: ( ( ruleEntityReference ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2674:1: ( ruleEntityReference )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2674:1: ( ruleEntityReference )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2675:1: ruleEntityReference
            {
             before(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEntityReference_in_rule__Entity__ReferencesAssignment_3_15381);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Entity__ReferencesAssignment_3_1"


    // $ANTLR start "rule__EntityReference__ListDestinationAssignment_0_0_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2684:1: rule__EntityReference__ListDestinationAssignment_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReference__ListDestinationAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2688:1: ( ( ( RULE_ID ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2689:1: ( ( RULE_ID ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2689:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2690:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationEntityCrossReference_0_0_1_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2691:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2692:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getListDestinationEntityIDTerminalRuleCall_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__ListDestinationAssignment_0_0_15416); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2703:1: rule__EntityReference__SingleDestinationAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityReference__SingleDestinationAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2707:1: ( ( ( RULE_ID ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2708:1: ( ( RULE_ID ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2708:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2709:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityCrossReference_0_1_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2710:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2711:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__SingleDestinationAssignment_0_15455); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2722:1: rule__EntityReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2726:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2727:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2727:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2728:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__NameAssignment_15490); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2737:1: rule__EntityReference__InverseNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EntityReference__InverseNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2741:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2742:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2742:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2743:1: RULE_ID
            {
             before(grammarAccess.getEntityReferenceAccess().getInverseNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityReference__InverseNameAssignment_2_15521); 
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


    // $ANTLR start "rule__Persistence__PersistencePackageAssignment_2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2752:1: rule__Persistence__PersistencePackageAssignment_2 : ( rulePersistencePackage ) ;
    public final void rule__Persistence__PersistencePackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2756:1: ( ( rulePersistencePackage ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2757:1: ( rulePersistencePackage )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2757:1: ( rulePersistencePackage )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2758:1: rulePersistencePackage
            {
             before(grammarAccess.getPersistenceAccess().getPersistencePackagePersistencePackageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePersistencePackage_in_rule__Persistence__PersistencePackageAssignment_25552);
            rulePersistencePackage();

            state._fsp--;

             after(grammarAccess.getPersistenceAccess().getPersistencePackagePersistencePackageParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Persistence__PersistencePackageAssignment_2"


    // $ANTLR start "rule__PersistencePackage__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2767:1: rule__PersistencePackage__NameAssignment_1 : ( rulePackageName ) ;
    public final void rule__PersistencePackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2771:1: ( ( rulePackageName ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2772:1: ( rulePackageName )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2772:1: ( rulePackageName )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2773:1: rulePackageName
            {
             before(grammarAccess.getPersistencePackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__PersistencePackage__NameAssignment_15583);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPersistencePackageAccess().getNamePackageNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PersistencePackage__NameAssignment_1"


    // $ANTLR start "rule__PersistencePackage__PersistenceEntitiesAssignment_3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2782:1: rule__PersistencePackage__PersistenceEntitiesAssignment_3 : ( rulePersistenceEntity ) ;
    public final void rule__PersistencePackage__PersistenceEntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2786:1: ( ( rulePersistenceEntity ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2787:1: ( rulePersistenceEntity )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2787:1: ( rulePersistenceEntity )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2788:1: rulePersistenceEntity
            {
             before(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePersistenceEntity_in_rule__PersistencePackage__PersistenceEntitiesAssignment_35614);
            rulePersistenceEntity();

            state._fsp--;

             after(grammarAccess.getPersistencePackageAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PersistencePackage__PersistenceEntitiesAssignment_3"


    // $ANTLR start "rule__PersistenceEntity__NameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2797:1: rule__PersistenceEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PersistenceEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2801:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2802:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2802:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2803:1: RULE_ID
            {
             before(grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PersistenceEntity__NameAssignment_15645); 
             after(grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PersistenceEntity__NameAssignment_1"


    // $ANTLR start "rule__PersistenceEntity__PersistencePropertiesAssignment_3"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2812:1: rule__PersistenceEntity__PersistencePropertiesAssignment_3 : ( rulePersistenceProperty ) ;
    public final void rule__PersistenceEntity__PersistencePropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2816:1: ( ( rulePersistenceProperty ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2817:1: ( rulePersistenceProperty )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2817:1: ( rulePersistenceProperty )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2818:1: rulePersistenceProperty
            {
             before(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesPersistencePropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePersistenceProperty_in_rule__PersistenceEntity__PersistencePropertiesAssignment_35676);
            rulePersistenceProperty();

            state._fsp--;

             after(grammarAccess.getPersistenceEntityAccess().getPersistencePropertiesPersistencePropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PersistenceEntity__PersistencePropertiesAssignment_3"


    // $ANTLR start "rule__PersistenceProperty__NameAssignment_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2827:1: rule__PersistenceProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PersistenceProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2831:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2832:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2832:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2833:1: RULE_ID
            {
             before(grammarAccess.getPersistencePropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PersistenceProperty__NameAssignment_05707); 
             after(grammarAccess.getPersistencePropertyAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PersistenceProperty__NameAssignment_0"


    // $ANTLR start "rule__PersistenceProperty__ConfigAssignment_2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2842:1: rule__PersistenceProperty__ConfigAssignment_2 : ( rulePersistencePropertyConfig ) ;
    public final void rule__PersistenceProperty__ConfigAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2846:1: ( ( rulePersistencePropertyConfig ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2847:1: ( rulePersistencePropertyConfig )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2847:1: ( rulePersistencePropertyConfig )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2848:1: rulePersistencePropertyConfig
            {
             before(grammarAccess.getPersistencePropertyAccess().getConfigPersistencePropertyConfigParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePersistencePropertyConfig_in_rule__PersistenceProperty__ConfigAssignment_25738);
            rulePersistencePropertyConfig();

            state._fsp--;

             after(grammarAccess.getPersistencePropertyAccess().getConfigPersistencePropertyConfigParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PersistenceProperty__ConfigAssignment_2"


    // $ANTLR start "rule__PersistenceProperty__ConfigAssignment_3_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2857:1: rule__PersistenceProperty__ConfigAssignment_3_1 : ( rulePersistencePropertyConfig ) ;
    public final void rule__PersistenceProperty__ConfigAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2861:1: ( ( rulePersistencePropertyConfig ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2862:1: ( rulePersistencePropertyConfig )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2862:1: ( rulePersistencePropertyConfig )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2863:1: rulePersistencePropertyConfig
            {
             before(grammarAccess.getPersistencePropertyAccess().getConfigPersistencePropertyConfigParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePersistencePropertyConfig_in_rule__PersistenceProperty__ConfigAssignment_3_15769);
            rulePersistencePropertyConfig();

            state._fsp--;

             after(grammarAccess.getPersistencePropertyAccess().getConfigPersistencePropertyConfigParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PersistenceProperty__ConfigAssignment_3_1"


    // $ANTLR start "rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2872:1: rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2876:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2877:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2877:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2878:1: RULE_ID
            {
             before(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_05800); 
             after(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigKeyIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0"


    // $ANTLR start "rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2887:1: rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2891:1: ( ( RULE_STRING ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2892:1: ( RULE_STRING )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2892:1: ( RULE_STRING )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2893:1: RULE_STRING
            {
             before(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PersistencePropertyConfig__PropertyConfigValueAssignment_25831); 
             after(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2"


    // $ANTLR start "rule__EntityProperty__PropertyTypeAssignment_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2902:1: rule__EntityProperty__PropertyTypeAssignment_0 : ( ruleBasicType ) ;
    public final void rule__EntityProperty__PropertyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2906:1: ( ( ruleBasicType ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2907:1: ( ruleBasicType )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2907:1: ( ruleBasicType )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2908:1: ruleBasicType
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_05862);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2917:1: rule__EntityProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2921:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2922:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2922:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:2923:1: RULE_ID
            {
             before(grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityProperty__NameAssignment_15893); 
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
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistence_in_entryRulePersistence301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistence308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Persistence__Group__0_in_rulePersistence334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePackage_in_entryRulePersistencePackage361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistencePackage368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__0_in_rulePersistencePackage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceEntity428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__0_in_rulePersistenceEntity454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceProperty_in_entryRulePersistenceProperty481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceProperty488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__0_in_rulePersistenceProperty514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePropertyConfig_in_entryRulePersistencePropertyConfig541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistencePropertyConfig548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__Group__0_in_rulePersistencePropertyConfig574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityProperty608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0_in_ruleEntityProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_entryRuleJodaTimeTypes781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJodaTimeTypes788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JodaTimeTypes__Alternatives_in_ruleJodaTimeTypes814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDirectSupportedTypes875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_0_in_rule__Entity__Alternatives_31032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ReferencesAssignment_3_1_in_rule__Entity__Alternatives_31050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__0_in_rule__EntityReference__Alternatives_01083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__SingleDestinationAssignment_0_1_in_rule__EntityReference__Alternatives_01101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJodaTimeTypes_in_rule__BasicType__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__JodaTimeTypes__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JodaTimeTypes__Alternatives1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WrapperTypes__Alternatives1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WrapperTypes__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WrapperTypes__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WrapperTypes__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WrapperTypes__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WrapperTypes__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WrapperTypes__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__WrapperTypes__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveTypes__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveTypes__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimitiveTypes__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimitiveTypes__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimitiveTypes__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimitiveTypes__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PrimitiveTypes__Alternatives1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PrimitiveTypes__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01620 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Model__Group__0__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Model__Group__1__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21744 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31804 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_3_in_rule__Model__Group__3__Impl1834 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PersistenceModelAssignment_4_in_rule__Model__Group__4__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Package__Group__0__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11995 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22055 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__22058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Package__Group__2__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__32117 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__32120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl2147 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__42178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Package__Group__4__Impl2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12309 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22369 = new BitSet(new long[]{0x000000243FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__2__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32431 = new BitSet(new long[]{0x000000243FFFF810L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_3_in_rule__Entity__Group__3__Impl2461 = new BitSet(new long[]{0x000000203FFFF812L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Entity__Group__4__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__02561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__02564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Alternatives_0_in_rule__EntityReference__Group__0__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__12621 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__2_in_rule__EntityReference__Group__12624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__NameAssignment_1_in_rule__EntityReference__Group__1__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__2__Impl_in_rule__EntityReference__Group__22681 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__3_in_rule__EntityReference__Group__22684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__0_in_rule__EntityReference__Group__2__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__3__Impl_in_rule__EntityReference__Group__32742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityReference__Group__3__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__0__Impl_in_rule__EntityReference__Group_0_0__02809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__1_in_rule__EntityReference__Group_0_0__02812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityReference__Group_0_0__0__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__1__Impl_in_rule__EntityReference__Group_0_0__12871 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__2_in_rule__EntityReference__Group_0_0__12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__ListDestinationAssignment_0_0_1_in_rule__EntityReference__Group_0_0__1__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_0_0__2__Impl_in_rule__EntityReference__Group_0_0__22931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EntityReference__Group_0_0__2__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__0__Impl_in_rule__EntityReference__Group_2__02996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__1_in_rule__EntityReference__Group_2__02999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EntityReference__Group_2__0__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__1__Impl_in_rule__EntityReference__Group_2__13058 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__2_in_rule__EntityReference__Group_2__13061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__InverseNameAssignment_2_1_in_rule__EntityReference__Group_2__1__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group_2__2__Impl_in_rule__EntityReference__Group_2__23118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EntityReference__Group_2__2__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Persistence__Group__0__Impl_in_rule__Persistence__Group__03183 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Persistence__Group__1_in_rule__Persistence__Group__03186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Persistence__Group__0__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Persistence__Group__1__Impl_in_rule__Persistence__Group__13245 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Persistence__Group__2_in_rule__Persistence__Group__13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Persistence__Group__1__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Persistence__Group__2__Impl_in_rule__Persistence__Group__23307 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Persistence__Group__3_in_rule__Persistence__Group__23310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Persistence__PersistencePackageAssignment_2_in_rule__Persistence__Group__2__Impl3339 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Persistence__PersistencePackageAssignment_2_in_rule__Persistence__Group__2__Impl3351 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Persistence__Group__3__Impl_in_rule__Persistence__Group__33384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Persistence__Group__3__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__0__Impl_in_rule__PersistencePackage__Group__03451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__1_in_rule__PersistencePackage__Group__03454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PersistencePackage__Group__0__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__1__Impl_in_rule__PersistencePackage__Group__13513 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__2_in_rule__PersistencePackage__Group__13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__NameAssignment_1_in_rule__PersistencePackage__Group__1__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__2__Impl_in_rule__PersistencePackage__Group__23573 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__3_in_rule__PersistencePackage__Group__23576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PersistencePackage__Group__2__Impl3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__3__Impl_in_rule__PersistencePackage__Group__33635 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__4_in_rule__PersistencePackage__Group__33638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__PersistenceEntitiesAssignment_3_in_rule__PersistencePackage__Group__3__Impl3667 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__PersistenceEntitiesAssignment_3_in_rule__PersistencePackage__Group__3__Impl3679 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__PersistencePackage__Group__4__Impl_in_rule__PersistencePackage__Group__43712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PersistencePackage__Group__4__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__0__Impl_in_rule__PersistenceEntity__Group__03781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__1_in_rule__PersistenceEntity__Group__03784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PersistenceEntity__Group__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__1__Impl_in_rule__PersistenceEntity__Group__13843 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__2_in_rule__PersistenceEntity__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__NameAssignment_1_in_rule__PersistenceEntity__Group__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__2__Impl_in_rule__PersistenceEntity__Group__23903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__3_in_rule__PersistenceEntity__Group__23906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PersistenceEntity__Group__2__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__3__Impl_in_rule__PersistenceEntity__Group__33965 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__4_in_rule__PersistenceEntity__Group__33968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__PersistencePropertiesAssignment_3_in_rule__PersistenceEntity__Group__3__Impl3997 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__PersistencePropertiesAssignment_3_in_rule__PersistenceEntity__Group__3__Impl4009 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__4__Impl_in_rule__PersistenceEntity__Group__44042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PersistenceEntity__Group__4__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__0__Impl_in_rule__PersistenceProperty__Group__04111 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__1_in_rule__PersistenceProperty__Group__04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__NameAssignment_0_in_rule__PersistenceProperty__Group__0__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__1__Impl_in_rule__PersistenceProperty__Group__14171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__2_in_rule__PersistenceProperty__Group__14174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PersistenceProperty__Group__1__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__2__Impl_in_rule__PersistenceProperty__Group__24233 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__3_in_rule__PersistenceProperty__Group__24236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__ConfigAssignment_2_in_rule__PersistenceProperty__Group__2__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__3__Impl_in_rule__PersistenceProperty__Group__34293 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__4_in_rule__PersistenceProperty__Group__34296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group_3__0_in_rule__PersistenceProperty__Group__3__Impl4323 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group__4__Impl_in_rule__PersistenceProperty__Group__44354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PersistenceProperty__Group__4__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group_3__0__Impl_in_rule__PersistenceProperty__Group_3__04423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group_3__1_in_rule__PersistenceProperty__Group_3__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PersistenceProperty__Group_3__0__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__Group_3__1__Impl_in_rule__PersistenceProperty__Group_3__14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceProperty__ConfigAssignment_3_1_in_rule__PersistenceProperty__Group_3__1__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__Group__0__Impl_in_rule__PersistencePropertyConfig__Group__04546 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__Group__1_in_rule__PersistencePropertyConfig__Group__04549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_0_in_rule__PersistencePropertyConfig__Group__0__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__Group__1__Impl_in_rule__PersistencePropertyConfig__Group__14606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__Group__2_in_rule__PersistencePropertyConfig__Group__14609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PersistencePropertyConfig__Group__1__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__Group__2__Impl_in_rule__PersistencePropertyConfig__Group__24668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistencePropertyConfig__PropertyConfigValueAssignment_2_in_rule__PersistencePropertyConfig__Group__2__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__04731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__04734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__14791 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__14794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__NameAssignment_1_in_rule__EntityProperty__Group__1__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__24851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityProperty__Group__2__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__04916 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl5002 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__05037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__PackageName__Group_1__0__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Model__NameAssignment_25164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_35195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistence_in_rule__Model__PersistenceModelAssignment_45226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Package__NameAssignment_15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_35288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_3_05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_rule__Entity__ReferencesAssignment_3_15381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__ListDestinationAssignment_0_0_15416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__SingleDestinationAssignment_0_15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__NameAssignment_15490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityReference__InverseNameAssignment_2_15521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePackage_in_rule__Persistence__PersistencePackageAssignment_25552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__PersistencePackage__NameAssignment_15583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_rule__PersistencePackage__PersistenceEntitiesAssignment_35614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PersistenceEntity__NameAssignment_15645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceProperty_in_rule__PersistenceEntity__PersistencePropertiesAssignment_35676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PersistenceProperty__NameAssignment_05707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePropertyConfig_in_rule__PersistenceProperty__ConfigAssignment_25738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistencePropertyConfig_in_rule__PersistenceProperty__ConfigAssignment_3_15769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PersistencePropertyConfig__PropertyConfigKeyAssignment_05800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PersistencePropertyConfig__PropertyConfigValueAssignment_25831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_05862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityProperty__NameAssignment_15893 = new BitSet(new long[]{0x0000000000000002L});

}