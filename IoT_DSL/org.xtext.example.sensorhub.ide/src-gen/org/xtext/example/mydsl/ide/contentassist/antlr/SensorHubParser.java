/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalSensorHubParser;
import org.xtext.example.mydsl.services.SensorHubGrammarAccess;

public class SensorHubParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SensorHubGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SensorHubGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeviceAccess().getAlternatives(), "rule__Device__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getAlternatives_1(), "rule__Sensor__Alternatives_1");
			builder.put(grammarAccess.getPreProcessorAccess().getAlternatives(), "rule__PreProcessor__Alternatives");
			builder.put(grammarAccess.getSensorSystemAccess().getGroup(), "rule__SensorSystem__Group__0");
			builder.put(grammarAccess.getFogAccess().getGroup(), "rule__Fog__Group__0");
			builder.put(grammarAccess.getRaspPiAccess().getGroup(), "rule__RaspPi__Group__0");
			builder.put(grammarAccess.getStorageAccess().getGroup(), "rule__Storage__Group__0");
			builder.put(grammarAccess.getVisualizerAccess().getGroup(), "rule__Visualizer__Group__0");
			builder.put(grammarAccess.getEdgeAccess().getGroup(), "rule__Edge__Group__0");
			builder.put(grammarAccess.getArduinoAccess().getGroup(), "rule__Arduino__Group__0");
			builder.put(grammarAccess.getComAccess().getGroup(), "rule__Com__Group__0");
			builder.put(grammarAccess.getNrf24l01Access().getGroup(), "rule__Nrf24l01__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_2(), "rule__Sensor__Group_2__0");
			builder.put(grammarAccess.getWater_levelAccess().getGroup(), "rule__Water_level__Group__0");
			builder.put(grammarAccess.getSr04Access().getGroup(), "rule__Sr04__Group__0");
			builder.put(grammarAccess.getSoundAccess().getGroup(), "rule__Sound__Group__0");
			builder.put(grammarAccess.getAverageAccess().getGroup(), "rule__Average__Group__0");
			builder.put(grammarAccess.getThresholdAccess().getGroup(), "rule__Threshold__Group__0");
			builder.put(grammarAccess.getSensorSystemAccess().getNameAssignment_1(), "rule__SensorSystem__NameAssignment_1");
			builder.put(grammarAccess.getSensorSystemAccess().getDevicesAssignment_2(), "rule__SensorSystem__DevicesAssignment_2");
			builder.put(grammarAccess.getFogAccess().getNameAssignment_1(), "rule__Fog__NameAssignment_1");
			builder.put(grammarAccess.getFogAccess().getComsAssignment_2(), "rule__Fog__ComsAssignment_2");
			builder.put(grammarAccess.getFogAccess().getDeviceAssignment_3(), "rule__Fog__DeviceAssignment_3");
			builder.put(grammarAccess.getFogAccess().getEdgeDevicesAssignment_4(), "rule__Fog__EdgeDevicesAssignment_4");
			builder.put(grammarAccess.getRaspPiAccess().getStorageAssignment_2(), "rule__RaspPi__StorageAssignment_2");
			builder.put(grammarAccess.getRaspPiAccess().getVisualizationAssignment_3(), "rule__RaspPi__VisualizationAssignment_3");
			builder.put(grammarAccess.getStorageAccess().getTypeAssignment_1(), "rule__Storage__TypeAssignment_1");
			builder.put(grammarAccess.getVisualizerAccess().getTypeAssignment_1(), "rule__Visualizer__TypeAssignment_1");
			builder.put(grammarAccess.getEdgeAccess().getNameAssignment_1(), "rule__Edge__NameAssignment_1");
			builder.put(grammarAccess.getEdgeAccess().getDeviceAssignment_2(), "rule__Edge__DeviceAssignment_2");
			builder.put(grammarAccess.getArduinoAccess().getRateAssignment_2(), "rule__Arduino__RateAssignment_2");
			builder.put(grammarAccess.getArduinoAccess().getSensorsAssignment_3(), "rule__Arduino__SensorsAssignment_3");
			builder.put(grammarAccess.getNrf24l01Access().getTimeoutAssignment_1(), "rule__Nrf24l01__TimeoutAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getRateAssignment_2_1(), "rule__Sensor__RateAssignment_2_1");
			builder.put(grammarAccess.getSensorAccess().getPreprocessorAssignment_3(), "rule__Sensor__PreprocessorAssignment_3");
			builder.put(grammarAccess.getWater_levelAccess().getNameAssignment_1(), "rule__Water_level__NameAssignment_1");
			builder.put(grammarAccess.getSr04Access().getNameAssignment_1(), "rule__Sr04__NameAssignment_1");
			builder.put(grammarAccess.getSoundAccess().getNameAssignment_1(), "rule__Sound__NameAssignment_1");
			builder.put(grammarAccess.getAverageAccess().getValueAssignment_1(), "rule__Average__ValueAssignment_1");
			builder.put(grammarAccess.getThresholdAccess().getMinAssignment_1(), "rule__Threshold__MinAssignment_1");
			builder.put(grammarAccess.getThresholdAccess().getMaxAssignment_3(), "rule__Threshold__MaxAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SensorHubGrammarAccess grammarAccess;

	@Override
	protected InternalSensorHubParser createParser() {
		InternalSensorHubParser result = new InternalSensorHubParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SensorHubGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SensorHubGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
