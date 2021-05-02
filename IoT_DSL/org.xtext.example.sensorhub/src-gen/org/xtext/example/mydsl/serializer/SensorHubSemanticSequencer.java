/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.sensorHub.Arduino;
import org.xtext.example.mydsl.sensorHub.Average;
import org.xtext.example.mydsl.sensorHub.Edge;
import org.xtext.example.mydsl.sensorHub.Fog;
import org.xtext.example.mydsl.sensorHub.Nrf24l01;
import org.xtext.example.mydsl.sensorHub.RaspPi;
import org.xtext.example.mydsl.sensorHub.SensorHubPackage;
import org.xtext.example.mydsl.sensorHub.SensorSystem;
import org.xtext.example.mydsl.sensorHub.Sound;
import org.xtext.example.mydsl.sensorHub.Sr04;
import org.xtext.example.mydsl.sensorHub.Storage;
import org.xtext.example.mydsl.sensorHub.Threshold;
import org.xtext.example.mydsl.sensorHub.Visualizer;
import org.xtext.example.mydsl.sensorHub.Water_level;
import org.xtext.example.mydsl.services.SensorHubGrammarAccess;

@SuppressWarnings("all")
public class SensorHubSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SensorHubGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SensorHubPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SensorHubPackage.ARDUINO:
				sequence_Arduino(context, (Arduino) semanticObject); 
				return; 
			case SensorHubPackage.AVERAGE:
				sequence_Average(context, (Average) semanticObject); 
				return; 
			case SensorHubPackage.EDGE:
				sequence_Edge(context, (Edge) semanticObject); 
				return; 
			case SensorHubPackage.FOG:
				sequence_Fog(context, (Fog) semanticObject); 
				return; 
			case SensorHubPackage.NRF24L01:
				sequence_Nrf24l01(context, (Nrf24l01) semanticObject); 
				return; 
			case SensorHubPackage.RASP_PI:
				sequence_RaspPi(context, (RaspPi) semanticObject); 
				return; 
			case SensorHubPackage.SENSOR_SYSTEM:
				sequence_SensorSystem(context, (SensorSystem) semanticObject); 
				return; 
			case SensorHubPackage.SOUND:
				if (rule == grammarAccess.getSensorRule()) {
					sequence_Sensor_Sound(context, (Sound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSoundRule()) {
					sequence_Sound(context, (Sound) semanticObject); 
					return; 
				}
				else break;
			case SensorHubPackage.SR04:
				if (rule == grammarAccess.getSensorRule()) {
					sequence_Sensor_Sr04(context, (Sr04) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSr04Rule()) {
					sequence_Sr04(context, (Sr04) semanticObject); 
					return; 
				}
				else break;
			case SensorHubPackage.STORAGE:
				sequence_Storage(context, (Storage) semanticObject); 
				return; 
			case SensorHubPackage.THRESHOLD:
				sequence_Threshold(context, (Threshold) semanticObject); 
				return; 
			case SensorHubPackage.VISUALIZER:
				sequence_Visualizer(context, (Visualizer) semanticObject); 
				return; 
			case SensorHubPackage.WATER_LEVEL:
				if (rule == grammarAccess.getSensorRule()) {
					sequence_Sensor_Water_level(context, (Water_level) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWater_levelRule()) {
					sequence_Water_level(context, (Water_level) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Arduino returns Arduino
	 *
	 * Constraint:
	 *     (rate=INT sensors+=Sensor*)
	 */
	protected void sequence_Arduino(ISerializationContext context, Arduino semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PreProcessor returns Average
	 *     Average returns Average
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Average(ISerializationContext context, Average semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.AVERAGE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.AVERAGE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAverageAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Edge
	 *     Edge returns Edge
	 *
	 * Constraint:
	 *     (name=ID device=Arduino)
	 */
	protected void sequence_Edge(ISerializationContext context, Edge semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.DEVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.DEVICE__NAME));
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.EDGE__DEVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.EDGE__DEVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEdgeAccess().getDeviceArduinoParserRuleCall_2_0(), semanticObject.getDevice());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Fog
	 *     Fog returns Fog
	 *
	 * Constraint:
	 *     (name=ID coms=Com device=RaspPi edgeDevices+=Edge*)
	 */
	protected void sequence_Fog(ISerializationContext context, Fog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Com returns Nrf24l01
	 *     Nrf24l01 returns Nrf24l01
	 *
	 * Constraint:
	 *     timeout=INT
	 */
	protected void sequence_Nrf24l01(ISerializationContext context, Nrf24l01 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.NRF24L01__TIMEOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.NRF24L01__TIMEOUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNrf24l01Access().getTimeoutINTTerminalRuleCall_1_0(), semanticObject.getTimeout());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RaspPi returns RaspPi
	 *
	 * Constraint:
	 *     (storage+=Storage* visualization+=Visualizer*)
	 */
	protected void sequence_RaspPi(ISerializationContext context, RaspPi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SensorSystem returns SensorSystem
	 *
	 * Constraint:
	 *     (name=ID devices+=Device*)
	 */
	protected void sequence_SensorSystem(ISerializationContext context, SensorSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sound
	 *
	 * Constraint:
	 *     (name=ID rate=INT? preprocessor=PreProcessor)
	 */
	protected void sequence_Sensor_Sound(ISerializationContext context, Sound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sr04
	 *
	 * Constraint:
	 *     (name=ID rate=INT? preprocessor=PreProcessor)
	 */
	protected void sequence_Sensor_Sr04(ISerializationContext context, Sr04 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Water_level
	 *
	 * Constraint:
	 *     (name=ID rate=INT? preprocessor=PreProcessor)
	 */
	protected void sequence_Sensor_Water_level(ISerializationContext context, Water_level semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sound returns Sound
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Sound(ISerializationContext context, Sound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.SENSOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSoundAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sr04 returns Sr04
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Sr04(ISerializationContext context, Sr04 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.SENSOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSr04Access().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Storage returns Storage
	 *
	 * Constraint:
	 *     type=ID
	 */
	protected void sequence_Storage(ISerializationContext context, Storage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.STORAGE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.STORAGE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStorageAccess().getTypeIDTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PreProcessor returns Threshold
	 *     Threshold returns Threshold
	 *
	 * Constraint:
	 *     (min=INT max=INT)
	 */
	protected void sequence_Threshold(ISerializationContext context, Threshold semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.THRESHOLD__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.THRESHOLD__MIN));
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.THRESHOLD__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.THRESHOLD__MAX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThresholdAccess().getMinINTTerminalRuleCall_1_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getThresholdAccess().getMaxINTTerminalRuleCall_3_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Visualizer returns Visualizer
	 *
	 * Constraint:
	 *     type=ID
	 */
	protected void sequence_Visualizer(ISerializationContext context, Visualizer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.VISUALIZER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.VISUALIZER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVisualizerAccess().getTypeIDTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Water_level returns Water_level
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Water_level(ISerializationContext context, Water_level semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SensorHubPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensorHubPackage.Literals.SENSOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWater_levelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
