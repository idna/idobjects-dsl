package com.idobjects.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.idobjects.dsl.idObjectsDsl.AbstractReference;
import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
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
			case IdObjectsDslPackage.ABSTRACT_REFERENCE:
				if(context == grammarAccess.getAbstractReferenceRule()) {
					sequence_AbstractReference_AbstractReference(context, (AbstractReference) semanticObject); 
					return; 
				}
				else break;
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
			case IdObjectsDslPackage.ENTITY_REFERENCE:
				if(context == grammarAccess.getEntityReferenceRule()) {
					sequence_EntityReference_EntityReference(context, (EntityReference) semanticObject); 
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
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_AbstractReference_AbstractReference(EObject context, AbstractReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.ABSTRACT_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.ABSTRACT_REFERENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbstractReferenceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (propertyType=BasicType name=ID)
	 *
	 * Features:
	 *    propertyType[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_EntityProperty_EntityProperty(EObject context, EntityProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__PROPERTY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__PROPERTY_TYPE));
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.ENTITY_PROPERTY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityPropertyAccess().getPropertyTypeBasicTypeParserRuleCall_0_0(), semanticObject.getPropertyType());
		feeder.accept(grammarAccess.getEntityPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((listDestination=[Entity|ID] | singleDestination=[Entity|ID]) name=ID inverseName=ID?)
	 *
	 * Features:
	 *    listDestination[0, 1]
	 *         EXCLUDE_IF_SET singleDestination
	 *    singleDestination[0, 1]
	 *         EXCLUDE_IF_SET listDestination
	 *    name[1, 1]
	 *    inverseName[0, 1]
	 */
	protected void sequence_EntityReference_EntityReference(EObject context, EntityReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superEntity=[Entity|ID]? (properties+=EntityProperty | references+=EntityReference)*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    superEntity[0, 1]
	 *    properties[0, *]
	 *    references[0, *]
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
