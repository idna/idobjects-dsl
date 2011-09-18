package com.idobjects.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.Model;
import com.idobjects.dsl.services.IdObjectsDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractIdObjectsDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected IdObjectsDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IdObjectsDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IdObjectsDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.ENTITY_PROPERTY:
				if(context == grammarAccess.getEntityPropertyRule()) {
					sequence_EntityProperty_EntityProperty(context, (EntityProperty) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package_Package(context, (com.idobjects.dsl.idObjectsDsl.Package) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (propertyType=BasicType propertyName=ID)
	 *
	 * Features:
	 *    propertyType[1, 1]
	 *    propertyName[1, 1]
	 */
	protected void sequence_EntityProperty_EntityProperty(EObject context, EntityProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__PROPERTY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__PROPERTY_TYPE));
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__PROPERTY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__PROPERTY_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0(), semanticObject.getPropertyType());
		feeder.accept(grammarAccess.getEntityPropertyAccess().getPropertyNameIDTerminalRuleCall_1_0(), semanticObject.getPropertyName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=EntityProperty*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    properties[0, *]
	 */
	protected void sequence_Entity_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     packages+=Package*
	 *
	 * Features:
	 *    packages[0, *]
	 */
	protected void sequence_Model_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PackageName entities+=Entity*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    entities[0, *]
	 */
	protected void sequence_Package_Package(EObject context, com.idobjects.dsl.idObjectsDsl.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
