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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Byte'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Boolean'", "'Character'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'char'", "'package'", "'{'", "'}'", "'entity'", "';'", "'.'"
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


    // $ANTLR start "entryRuleEntityProperty"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:145:1: entryRuleEntityProperty : ruleEntityProperty EOF ;
    public final void entryRuleEntityProperty() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:146:1: ( ruleEntityProperty EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:147:1: ruleEntityProperty EOF
            {
             before(grammarAccess.getEntityPropertyRule()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty242);
            ruleEntityProperty();

            state._fsp--;

             after(grammarAccess.getEntityPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityProperty249); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:154:1: ruleEntityProperty : ( ( rule__EntityProperty__Group__0 ) ) ;
    public final void ruleEntityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:158:2: ( ( ( rule__EntityProperty__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:159:1: ( ( rule__EntityProperty__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:159:1: ( ( rule__EntityProperty__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:160:1: ( rule__EntityProperty__Group__0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:161:1: ( rule__EntityProperty__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:161:2: rule__EntityProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0_in_ruleEntityProperty275);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:173:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:174:1: ( rulePackageName EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:175:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName302);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName309); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:182:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:186:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:187:1: ( ( rule__PackageName__Group__0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:187:1: ( ( rule__PackageName__Group__0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:188:1: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:189:1: ( rule__PackageName__Group__0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:189:2: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0_in_rulePackageName335);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:201:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:202:1: ( ruleBasicType EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:203:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType362);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType369); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:210:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:214:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:215:1: ( ( rule__BasicType__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:215:1: ( ( rule__BasicType__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:216:1: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:217:1: ( rule__BasicType__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:217:2: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType395);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:229:1: entryRuleDirectSupportedTypes : ruleDirectSupportedTypes EOF ;
    public final void entryRuleDirectSupportedTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:230:1: ( ruleDirectSupportedTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:231:1: ruleDirectSupportedTypes EOF
            {
             before(grammarAccess.getDirectSupportedTypesRule()); 
            pushFollow(FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes422);
            ruleDirectSupportedTypes();

            state._fsp--;

             after(grammarAccess.getDirectSupportedTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectSupportedTypes429); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:238:1: ruleDirectSupportedTypes : ( 'String' ) ;
    public final void ruleDirectSupportedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:242:2: ( ( 'String' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:243:1: ( 'String' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:243:1: ( 'String' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:244:1: 'String'
            {
             before(grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 
            match(input,11,FOLLOW_11_in_ruleDirectSupportedTypes456); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:259:1: entryRuleWrapperTypes : ruleWrapperTypes EOF ;
    public final void entryRuleWrapperTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:260:1: ( ruleWrapperTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:261:1: ruleWrapperTypes EOF
            {
             before(grammarAccess.getWrapperTypesRule()); 
            pushFollow(FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes484);
            ruleWrapperTypes();

            state._fsp--;

             after(grammarAccess.getWrapperTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapperTypes491); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:268:1: ruleWrapperTypes : ( ( rule__WrapperTypes__Alternatives ) ) ;
    public final void ruleWrapperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:272:2: ( ( ( rule__WrapperTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( ( rule__WrapperTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:273:1: ( ( rule__WrapperTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:274:1: ( rule__WrapperTypes__Alternatives )
            {
             before(grammarAccess.getWrapperTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:275:1: ( rule__WrapperTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:275:2: rule__WrapperTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes517);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:287:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:288:1: ( rulePrimitiveTypes EOF )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:289:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes544);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypes551); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:296:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:300:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:301:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:301:1: ( ( rule__PrimitiveTypes__Alternatives ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:302:1: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:303:1: ( rule__PrimitiveTypes__Alternatives )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:303:2: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes577);
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


    // $ANTLR start "rule__BasicType__Alternatives"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:315:1: rule__BasicType__Alternatives : ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:319:1: ( ( rulePrimitiveTypes ) | ( ruleWrapperTypes ) | ( ruleDirectSupportedTypes ) )
            int alt2=3;
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
                alt2=1;
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
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:320:1: ( rulePrimitiveTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:320:1: ( rulePrimitiveTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:321:1: rulePrimitiveTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives613);
                    rulePrimitiveTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:326:6: ( ruleWrapperTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:326:6: ( ruleWrapperTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:327:1: ruleWrapperTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives630);
                    ruleWrapperTypes();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:332:6: ( ruleDirectSupportedTypes )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:332:6: ( ruleDirectSupportedTypes )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:333:1: ruleDirectSupportedTypes
                    {
                     before(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives647);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:343:1: rule__WrapperTypes__Alternatives : ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) );
    public final void rule__WrapperTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:347:1: ( ( 'Byte' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Boolean' ) | ( 'Character' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:348:1: ( 'Byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:348:1: ( 'Byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:349:1: 'Byte'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__WrapperTypes__Alternatives680); 
                     after(grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:356:6: ( 'Short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:356:6: ( 'Short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:357:1: 'Short'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__WrapperTypes__Alternatives700); 
                     after(grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:364:6: ( 'Integer' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:364:6: ( 'Integer' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:365:1: 'Integer'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__WrapperTypes__Alternatives720); 
                     after(grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:372:6: ( 'Long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:372:6: ( 'Long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:373:1: 'Long'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__WrapperTypes__Alternatives740); 
                     after(grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:380:6: ( 'Float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:380:6: ( 'Float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:381:1: 'Float'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__WrapperTypes__Alternatives760); 
                     after(grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:388:6: ( 'Double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:388:6: ( 'Double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:389:1: 'Double'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__WrapperTypes__Alternatives780); 
                     after(grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:396:6: ( 'Boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:396:6: ( 'Boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:397:1: 'Boolean'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__WrapperTypes__Alternatives800); 
                     after(grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:404:6: ( 'Character' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:404:6: ( 'Character' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:405:1: 'Character'
                    {
                     before(grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 
                    match(input,19,FOLLOW_19_in_rule__WrapperTypes__Alternatives820); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:417:1: rule__PrimitiveTypes__Alternatives : ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:421:1: ( ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'boolean' ) | ( 'char' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            case 27:
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
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:422:1: ( 'byte' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:422:1: ( 'byte' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:423:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
                    match(input,20,FOLLOW_20_in_rule__PrimitiveTypes__Alternatives855); 
                     after(grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:430:6: ( 'short' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:430:6: ( 'short' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:431:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
                    match(input,21,FOLLOW_21_in_rule__PrimitiveTypes__Alternatives875); 
                     after(grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:438:6: ( 'int' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:438:6: ( 'int' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:439:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
                    match(input,22,FOLLOW_22_in_rule__PrimitiveTypes__Alternatives895); 
                     after(grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:446:6: ( 'long' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:446:6: ( 'long' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:447:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
                    match(input,23,FOLLOW_23_in_rule__PrimitiveTypes__Alternatives915); 
                     after(grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:454:6: ( 'float' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:454:6: ( 'float' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:455:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
                    match(input,24,FOLLOW_24_in_rule__PrimitiveTypes__Alternatives935); 
                     after(grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:462:6: ( 'double' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:462:6: ( 'double' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:463:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
                    match(input,25,FOLLOW_25_in_rule__PrimitiveTypes__Alternatives955); 
                     after(grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:470:6: ( 'boolean' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:470:6: ( 'boolean' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:471:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
                    match(input,26,FOLLOW_26_in_rule__PrimitiveTypes__Alternatives975); 
                     after(grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:478:6: ( 'char' )
                    {
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:478:6: ( 'char' )
                    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:479:1: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 
                    match(input,27,FOLLOW_27_in_rule__PrimitiveTypes__Alternatives995); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:493:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:497:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:498:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01027);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01030);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:505:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:509:1: ( ( 'package' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:510:1: ( 'package' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:510:1: ( 'package' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:511:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Package__Group__0__Impl1058); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:524:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:528:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:529:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11089);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11092);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:536:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:540:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:541:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:541:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:542:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:543:1: ( rule__Package__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:543:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1119);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:553:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:557:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:558:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21149);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21152);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:565:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:569:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:570:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:570:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:571:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Package__Group__2__Impl1180); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:584:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:588:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:589:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31211);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31214);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:596:1: rule__Package__Group__3__Impl : ( ( rule__Package__EntitiesAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:600:1: ( ( ( rule__Package__EntitiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:601:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:601:1: ( ( rule__Package__EntitiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:602:1: ( rule__Package__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:603:1: ( rule__Package__EntitiesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:603:2: rule__Package__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl1241);
            	    rule__Package__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:613:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:617:1: ( rule__Package__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:618:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41272);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:624:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:628:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:629:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:629:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:630:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Package__Group__4__Impl1300); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:653:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:657:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:658:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01341);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01344);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:665:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:669:1: ( ( 'entity' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:670:1: ( 'entity' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:670:1: ( 'entity' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:671:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Entity__Group__0__Impl1372); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:684:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:688:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:689:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11403);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11406);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:696:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:700:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:701:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:701:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:702:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:703:1: ( rule__Entity__NameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:703:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1433);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:713:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:717:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:718:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21463);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21466);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:725:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:729:1: ( ( '{' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:730:1: ( '{' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:730:1: ( '{' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:731:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Entity__Group__2__Impl1494); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:744:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:748:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:749:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31525);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31528);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:756:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:760:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:761:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:761:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:762:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:763:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:763:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl1555);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:773:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:777:1: ( rule__Entity__Group__4__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:778:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41586);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:784:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:788:1: ( ( '}' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:789:1: ( '}' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:789:1: ( '}' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:790:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Entity__Group__4__Impl1614); 
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


    // $ANTLR start "rule__EntityProperty__Group__0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:813:1: rule__EntityProperty__Group__0 : rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 ;
    public final void rule__EntityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:817:1: ( rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:818:2: rule__EntityProperty__Group__0__Impl rule__EntityProperty__Group__1
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__01655);
            rule__EntityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__01658);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:825:1: rule__EntityProperty__Group__0__Impl : ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) ;
    public final void rule__EntityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:829:1: ( ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:830:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:830:1: ( ( rule__EntityProperty__PropertyTypeAssignment_0 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:831:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeAssignment_0()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:832:1: ( rule__EntityProperty__PropertyTypeAssignment_0 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:832:2: rule__EntityProperty__PropertyTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl1685);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:842:1: rule__EntityProperty__Group__1 : rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 ;
    public final void rule__EntityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:846:1: ( rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:847:2: rule__EntityProperty__Group__1__Impl rule__EntityProperty__Group__2
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__11715);
            rule__EntityProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__11718);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:854:1: rule__EntityProperty__Group__1__Impl : ( ( rule__EntityProperty__PropertyNameAssignment_1 ) ) ;
    public final void rule__EntityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:858:1: ( ( ( rule__EntityProperty__PropertyNameAssignment_1 ) ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:859:1: ( ( rule__EntityProperty__PropertyNameAssignment_1 ) )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:859:1: ( ( rule__EntityProperty__PropertyNameAssignment_1 ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:860:1: ( rule__EntityProperty__PropertyNameAssignment_1 )
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyNameAssignment_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:861:1: ( rule__EntityProperty__PropertyNameAssignment_1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:861:2: rule__EntityProperty__PropertyNameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityProperty__PropertyNameAssignment_1_in_rule__EntityProperty__Group__1__Impl1745);
            rule__EntityProperty__PropertyNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityPropertyAccess().getPropertyNameAssignment_1()); 

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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:871:1: rule__EntityProperty__Group__2 : rule__EntityProperty__Group__2__Impl ;
    public final void rule__EntityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:875:1: ( rule__EntityProperty__Group__2__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:876:2: rule__EntityProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__21775);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:882:1: rule__EntityProperty__Group__2__Impl : ( ';' ) ;
    public final void rule__EntityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:886:1: ( ( ';' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:887:1: ( ';' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:887:1: ( ';' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:888:1: ';'
            {
             before(grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__EntityProperty__Group__2__Impl1803); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:907:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:911:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:912:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__01840);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__01843);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:919:1: rule__PackageName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:923:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:924:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:924:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:925:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl1870); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:936:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:940:1: ( rule__PackageName__Group__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:941:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__11899);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:947:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__Group_1__0 )* ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:951:1: ( ( ( rule__PackageName__Group_1__0 )* ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:952:1: ( ( rule__PackageName__Group_1__0 )* )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:952:1: ( ( rule__PackageName__Group_1__0 )* )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:953:1: ( rule__PackageName__Group_1__0 )*
            {
             before(grammarAccess.getPackageNameAccess().getGroup_1()); 
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:954:1: ( rule__PackageName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:954:2: rule__PackageName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl1926);
            	    rule__PackageName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:968:1: rule__PackageName__Group_1__0 : rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 ;
    public final void rule__PackageName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:972:1: ( rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1 )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:973:2: rule__PackageName__Group_1__0__Impl rule__PackageName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__01961);
            rule__PackageName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__01964);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:980:1: rule__PackageName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackageName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:984:1: ( ( '.' ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:985:1: ( '.' )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:985:1: ( '.' )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:986:1: '.'
            {
             before(grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__PackageName__Group_1__0__Impl1992); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:999:1: rule__PackageName__Group_1__1 : rule__PackageName__Group_1__1__Impl ;
    public final void rule__PackageName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1003:1: ( rule__PackageName__Group_1__1__Impl )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1004:2: rule__PackageName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__12023);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1010:1: rule__PackageName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__PackageName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1014:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1015:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1015:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1016:1: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl2050); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1032:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1036:1: ( ( rulePackage ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1037:1: ( rulePackage )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1037:1: ( rulePackage )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1038:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment2088);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1047:1: rule__Package__NameAssignment_1 : ( rulePackageName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1051:1: ( ( rulePackageName ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1052:1: ( rulePackageName )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1052:1: ( rulePackageName )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1053:1: rulePackageName
            {
             before(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackageName_in_rule__Package__NameAssignment_12119);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1062:1: rule__Package__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1066:1: ( ( ruleEntity ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1067:1: ( ruleEntity )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1067:1: ( ruleEntity )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1068:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_32150);
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1077:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1081:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1082:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1082:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1083:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12181); 
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
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1092:1: rule__Entity__PropertiesAssignment_3 : ( ruleEntityProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1096:1: ( ( ruleEntityProperty ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1097:1: ( ruleEntityProperty )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1097:1: ( ruleEntityProperty )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1098:1: ruleEntityProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_32212);
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


    // $ANTLR start "rule__EntityProperty__PropertyTypeAssignment_0"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1107:1: rule__EntityProperty__PropertyTypeAssignment_0 : ( ruleBasicType ) ;
    public final void rule__EntityProperty__PropertyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1111:1: ( ( ruleBasicType ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1112:1: ( ruleBasicType )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1112:1: ( ruleBasicType )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1113:1: ruleBasicType
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_02243);
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


    // $ANTLR start "rule__EntityProperty__PropertyNameAssignment_1"
    // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1122:1: rule__EntityProperty__PropertyNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityProperty__PropertyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1126:1: ( ( RULE_ID ) )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1127:1: ( RULE_ID )
            {
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1127:1: ( RULE_ID )
            // ../com.idobjects.dsl.ui/src-gen/com/idobjects/dsl/ui/contentassist/antlr/internal/InternalIdObjectsDsl.g:1128:1: RULE_ID
            {
             before(grammarAccess.getEntityPropertyAccess().getPropertyNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityProperty__PropertyNameAssignment_12274); 
             after(grammarAccess.getEntityPropertyAccess().getPropertyNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityProperty__PropertyNameAssignment_1"

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
    public static final BitSet FOLLOW_ruleEntityProperty_in_entryRuleEntityProperty242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityProperty249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0_in_ruleEntityProperty275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0_in_rulePackageName335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__Alternatives_in_ruleBasicType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_entryRuleDirectSupportedTypes422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectSupportedTypes429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDirectSupportedTypes456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_entryRuleWrapperTypes484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapperTypes491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WrapperTypes__Alternatives_in_ruleWrapperTypes517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_entryRulePrimitiveTypes544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypes551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypes__Alternatives_in_rulePrimitiveTypes577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypes_in_rule__BasicType__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapperTypes_in_rule__BasicType__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectSupportedTypes_in_rule__BasicType__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WrapperTypes__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WrapperTypes__Alternatives700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WrapperTypes__Alternatives720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WrapperTypes__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WrapperTypes__Alternatives760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WrapperTypes__Alternatives780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WrapperTypes__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WrapperTypes__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveTypes__Alternatives855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimitiveTypes__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveTypes__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveTypes__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimitiveTypes__Alternatives935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimitiveTypes__Alternatives955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimitiveTypes__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimitiveTypes__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Package__Group__0__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11089 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21149 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Package__Group__2__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31211 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_3_in_rule__Package__Group__3__Impl1241 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Package__Group__4__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entity__Group__0__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11403 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21463 = new BitSet(new long[]{0x000000004FFFF800L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Entity__Group__2__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31525 = new BitSet(new long[]{0x000000004FFFF800L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl1555 = new BitSet(new long[]{0x000000000FFFF802L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Entity__Group__4__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__0__Impl_in_rule__EntityProperty__Group__01655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1_in_rule__EntityProperty__Group__01658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__PropertyTypeAssignment_0_in_rule__EntityProperty__Group__0__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__1__Impl_in_rule__EntityProperty__Group__11715 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2_in_rule__EntityProperty__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__PropertyNameAssignment_1_in_rule__EntityProperty__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityProperty__Group__2__Impl_in_rule__EntityProperty__Group__21775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EntityProperty__Group__2__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__0__Impl_in_rule__PackageName__Group__01840 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1_in_rule__PackageName__Group__01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group__0__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group__1__Impl_in_rule__PackageName__Group__11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0_in_rule__PackageName__Group__1__Impl1926 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__0__Impl_in_rule__PackageName__Group_1__01961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1_in_rule__PackageName__Group_1__01964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PackageName__Group_1__0__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageName__Group_1__1__Impl_in_rule__PackageName__Group_1__12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageName__Group_1__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_rule__Package__NameAssignment_12119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_32150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityProperty_in_rule__Entity__PropertiesAssignment_32212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__EntityProperty__PropertyTypeAssignment_02243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityProperty__PropertyNameAssignment_12274 = new BitSet(new long[]{0x0000000000000002L});

}