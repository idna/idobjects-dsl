package com.idobjects.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.Model;
import com.idobjects.dsl.idObjectsDsl.Persistence;
import com.idobjects.dsl.idObjectsDsl.PersistenceEntity;
import com.idobjects.dsl.idObjectsDsl.PersistencePackage;
import com.idobjects.dsl.idObjectsDsl.PersistenceProperty;
import com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig;
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
			case IdObjectsDslPackage.PERSISTENCE:
				if(context == grammarAccess.getPersistenceRule()) {
					sequence_Persistence_Persistence(context, (Persistence) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.PERSISTENCE_ENTITY:
				if(context == grammarAccess.getPersistenceEntityRule()) {
					sequence_PersistenceEntity_PersistenceEntity(context, (PersistenceEntity) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.PERSISTENCE_PACKAGE:
				if(context == grammarAccess.getPersistencePackageRule()) {
					sequence_PersistencePackage_PersistencePackage(context, (PersistencePackage) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.PERSISTENCE_PROPERTY:
				if(context == grammarAccess.getPersistencePropertyRule()) {
					sequence_PersistenceProperty_PersistenceProperty(context, (PersistenceProperty) semanticObject); 
					return; 
				}
				else break;
			case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG:
				if(context == grammarAccess.getPersistencePropertyConfigRule()) {
					sequence_PersistencePropertyConfig_PersistencePropertyConfig(context, (PersistencePropertyConfig) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     (name=ID (properties+=EntityProperty | references+=EntityReference)*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    properties[0, *]
	 *    references[0, *]
	 */
	protected void sequence_Entity_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PackageName packages+=Package* persistenceModel=Persistence?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    packages[0, *]
	 *    persistenceModel[0, 1]
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
	
	
	/**
	 * Constraint:
	 *     (name=ID persistenceProperties+=PersistenceProperty+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    persistenceProperties[1, *]
	 */
	protected void sequence_PersistenceEntity_PersistenceEntity(EObject context, PersistenceEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PackageName persistenceEntities+=PersistenceEntity+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    persistenceEntities[1, *]
	 */
	protected void sequence_PersistencePackage_PersistencePackage(EObject context, PersistencePackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyConfigKey=ID propertyConfigValue=STRING)
	 *
	 * Features:
	 *    propertyConfigKey[1, 1]
	 *    propertyConfigValue[1, 1]
	 */
	protected void sequence_PersistencePropertyConfig_PersistencePropertyConfig(EObject context, PersistencePropertyConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY));
			if(transientValues.isValueTransient(semanticObject, IdObjectsDslPackage.Literals.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdObjectsDslPackage.Literals.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigKeyIDTerminalRuleCall_0_0(), semanticObject.getPropertyConfigKey());
		feeder.accept(grammarAccess.getPersistencePropertyConfigAccess().getPropertyConfigValueSTRINGTerminalRuleCall_2_0(), semanticObject.getPropertyConfigValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID config+=PersistencePropertyConfig config+=PersistencePropertyConfig*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    config[1, *]
	 */
	protected void sequence_PersistenceProperty_PersistenceProperty(EObject context, PersistenceProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     persistencePackage+=PersistencePackage+
	 *
	 * Features:
	 *    persistencePackage[1, *]
	 */
	protected void sequence_Persistence_Persistence(EObject context, Persistence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
