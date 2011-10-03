/*
* generated by Xtext
*/
grammar InternalIdObjectsDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.idobjects.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
	    }
		lv_packages_0_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_0_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current; } 
	 EOF 
;

// Rule Package
rulePackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=rulePackageName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"PackageName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_3_0()); 
	    }
		lv_entities_3_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_3_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='entity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
	}

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesEntityPropertyParserRuleCall_4_0_0()); 
	    }
		lv_properties_5_0=ruleEntityProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_5_0, 
        		"EntityProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getReferencesEntityReferenceParserRuleCall_4_1_0()); 
	    }
		lv_references_6_0=ruleEntityReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"references",
        		lv_references_6_0, 
        		"EntityReference");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleEntityReference
entryRuleEntityReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityReferenceRule()); }
	 iv_ruleEntityReference=ruleEntityReference 
	 { $current=$iv_ruleEntityReference.current; } 
	 EOF 
;

// Rule EntityReference
ruleEntityReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((	otherlv_0='List[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityReferenceAccess().getListKeyword_0_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityReferenceRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getEntityReferenceAccess().getListDestinationEntityCrossReference_0_0_1_0()); 
	}

)
)	otherlv_2=']' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_0_0_2());
    }
)
    |(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityReferenceRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getEntityReferenceAccess().getSingleDestinationEntityCrossReference_0_1_0()); 
	}

)
))(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getEntityReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)(	otherlv_5='[inverse=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityReferenceAccess().getInverseKeyword_2_0());
    }
(
(
		lv_inverseName_6_0=RULE_ID
		{
			newLeafNode(lv_inverseName_6_0, grammarAccess.getEntityReferenceAccess().getInverseNameIDTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"inverseName",
        		lv_inverseName_6_0, 
        		"ID");
	    }

)
)	otherlv_7=']' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEntityReferenceAccess().getRightSquareBracketKeyword_2_2());
    }
)?	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEntityReferenceAccess().getSemicolonKeyword_3());
    }
)
;







// Entry rule entryRuleEntityProperty
entryRuleEntityProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityPropertyRule()); }
	 iv_ruleEntityProperty=ruleEntityProperty 
	 { $current=$iv_ruleEntityProperty.current; } 
	 EOF 
;

// Rule EntityProperty
ruleEntityProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0()); 
	    }
		lv_propertyType_0_0=ruleBasicType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityPropertyRule());
	        }
       		set(
       			$current, 
       			"propertyType",
        		lv_propertyType_0_0, 
        		"BasicType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityPropertyAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRulePackageName
entryRulePackageName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageNameRule()); } 
	 iv_rulePackageName=rulePackageName 
	 { $current=$iv_rulePackageName.current.getText(); }  
	 EOF 
;

// Rule PackageName
rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleBasicType
entryRuleBasicType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); } 
	 iv_ruleBasicType=ruleBasicType 
	 { $current=$iv_ruleBasicType.current.getText(); }  
	 EOF 
;

// Rule BasicType
ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBasicTypeAccess().getPrimitiveTypesParserRuleCall_0()); 
    }
    this_PrimitiveTypes_0=rulePrimitiveTypes    {
		$current.merge(this_PrimitiveTypes_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBasicTypeAccess().getWrapperTypesParserRuleCall_1()); 
    }
    this_WrapperTypes_1=ruleWrapperTypes    {
		$current.merge(this_WrapperTypes_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBasicTypeAccess().getDirectSupportedTypesParserRuleCall_2()); 
    }
    this_DirectSupportedTypes_2=ruleDirectSupportedTypes    {
		$current.merge(this_DirectSupportedTypes_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBasicTypeAccess().getJodaTimeTypesParserRuleCall_3()); 
    }
    this_JodaTimeTypes_3=ruleJodaTimeTypes    {
		$current.merge(this_JodaTimeTypes_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleJodaTimeTypes
entryRuleJodaTimeTypes returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getJodaTimeTypesRule()); } 
	 iv_ruleJodaTimeTypes=ruleJodaTimeTypes 
	 { $current=$iv_ruleJodaTimeTypes.current.getText(); }  
	 EOF 
;

// Rule JodaTimeTypes
ruleJodaTimeTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='DateTime' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getJodaTimeTypesAccess().getDateTimeKeyword_0()); 
    }

    |
	kw='Instant' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getJodaTimeTypesAccess().getInstantKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleDirectSupportedTypes
entryRuleDirectSupportedTypes returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDirectSupportedTypesRule()); } 
	 iv_ruleDirectSupportedTypes=ruleDirectSupportedTypes 
	 { $current=$iv_ruleDirectSupportedTypes.current.getText(); }  
	 EOF 
;

// Rule DirectSupportedTypes
ruleDirectSupportedTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='String' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDirectSupportedTypesAccess().getStringKeyword()); 
    }

    ;





// Entry rule entryRuleWrapperTypes
entryRuleWrapperTypes returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getWrapperTypesRule()); } 
	 iv_ruleWrapperTypes=ruleWrapperTypes 
	 { $current=$iv_ruleWrapperTypes.current.getText(); }  
	 EOF 
;

// Rule WrapperTypes
ruleWrapperTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Byte' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getByteKeyword_0()); 
    }

    |
	kw='Short' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getShortKeyword_1()); 
    }

    |
	kw='Integer' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getIntegerKeyword_2()); 
    }

    |
	kw='Long' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getLongKeyword_3()); 
    }

    |
	kw='Float' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getFloatKeyword_4()); 
    }

    |
	kw='Double' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getDoubleKeyword_5()); 
    }

    |
	kw='Boolean' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getBooleanKeyword_6()); 
    }

    |
	kw='Character' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getWrapperTypesAccess().getCharacterKeyword_7()); 
    }
)
    ;





// Entry rule entryRulePrimitiveTypes
entryRulePrimitiveTypes returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitiveTypesRule()); } 
	 iv_rulePrimitiveTypes=rulePrimitiveTypes 
	 { $current=$iv_rulePrimitiveTypes.current.getText(); }  
	 EOF 
;

// Rule PrimitiveTypes
rulePrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='byte' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getByteKeyword_0()); 
    }

    |
	kw='short' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getShortKeyword_1()); 
    }

    |
	kw='int' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getIntKeyword_2()); 
    }

    |
	kw='long' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getLongKeyword_3()); 
    }

    |
	kw='float' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getFloatKeyword_4()); 
    }

    |
	kw='double' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getDoubleKeyword_5()); 
    }

    |
	kw='boolean' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getBooleanKeyword_6()); 
    }

    |
	kw='char' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveTypesAccess().getCharKeyword_7()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


