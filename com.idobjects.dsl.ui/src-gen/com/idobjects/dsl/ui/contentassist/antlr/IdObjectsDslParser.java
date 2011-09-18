/*
* generated by Xtext
*/
package com.idobjects.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.idobjects.dsl.services.IdObjectsDslGrammarAccess;

public class IdObjectsDslParser extends AbstractContentAssistParser {
	
	@Inject
	private IdObjectsDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.idobjects.dsl.ui.contentassist.antlr.internal.InternalIdObjectsDslParser createParser() {
		com.idobjects.dsl.ui.contentassist.antlr.internal.InternalIdObjectsDslParser result = new com.idobjects.dsl.ui.contentassist.antlr.internal.InternalIdObjectsDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getWrapperTypesAccess().getAlternatives(), "rule__WrapperTypes__Alternatives");
					put(grammarAccess.getPrimitiveTypesAccess().getAlternatives(), "rule__PrimitiveTypes__Alternatives");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityPropertyAccess().getGroup(), "rule__EntityProperty__Group__0");
					put(grammarAccess.getPackageNameAccess().getGroup(), "rule__PackageName__Group__0");
					put(grammarAccess.getPackageNameAccess().getGroup_1(), "rule__PackageName__Group_1__0");
					put(grammarAccess.getModelAccess().getPackagesAssignment(), "rule__Model__PackagesAssignment");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getPackageAccess().getEntitiesAssignment_3(), "rule__Package__EntitiesAssignment_3");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getPropertiesAssignment_3(), "rule__Entity__PropertiesAssignment_3");
					put(grammarAccess.getEntityPropertyAccess().getPropertyTypeAssignment_0(), "rule__EntityProperty__PropertyTypeAssignment_0");
					put(grammarAccess.getEntityPropertyAccess().getPropertyNameAssignment_1(), "rule__EntityProperty__PropertyNameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.idobjects.dsl.ui.contentassist.antlr.internal.InternalIdObjectsDslParser typedParser = (com.idobjects.dsl.ui.contentassist.antlr.internal.InternalIdObjectsDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IdObjectsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IdObjectsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}