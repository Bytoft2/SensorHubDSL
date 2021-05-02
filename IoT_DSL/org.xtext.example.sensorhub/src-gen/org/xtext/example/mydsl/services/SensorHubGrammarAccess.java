/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SensorHubGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SensorSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.SensorSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDevicesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDevicesDeviceParserRuleCall_2_0 = (RuleCall)cDevicesAssignment_2.eContents().get(0);
		
		//SensorSystem:
		//    'system' name=ID devices+=Device*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'system' name=ID devices+=Device*
		public Group getGroup() { return cGroup; }
		
		//'system'
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//devices+=Device*
		public Assignment getDevicesAssignment_2() { return cDevicesAssignment_2; }
		
		//Device
		public RuleCall getDevicesDeviceParserRuleCall_2_0() { return cDevicesDeviceParserRuleCall_2_0; }
	}
	public class DeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Device");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFogParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEdgeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Device:
		//    Fog | Edge
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//Fog | Edge
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Fog
		public RuleCall getFogParserRuleCall_0() { return cFogParserRuleCall_0; }
		
		//Edge
		public RuleCall getEdgeParserRuleCall_1() { return cEdgeParserRuleCall_1; }
	}
	public class FogElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Fog");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFogKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cComsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cComsComParserRuleCall_2_0 = (RuleCall)cComsAssignment_2.eContents().get(0);
		private final Assignment cDeviceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDeviceRaspPiParserRuleCall_3_0 = (RuleCall)cDeviceAssignment_3.eContents().get(0);
		private final Assignment cEdgeDevicesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEdgeDevicesEdgeParserRuleCall_4_0 = (RuleCall)cEdgeDevicesAssignment_4.eContents().get(0);
		
		//Fog:
		//    'fog' name=ID coms=Com device=RaspPi edgeDevices+=Edge*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'fog' name=ID coms=Com device=RaspPi edgeDevices+=Edge*
		public Group getGroup() { return cGroup; }
		
		//'fog'
		public Keyword getFogKeyword_0() { return cFogKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//coms=Com
		public Assignment getComsAssignment_2() { return cComsAssignment_2; }
		
		//Com
		public RuleCall getComsComParserRuleCall_2_0() { return cComsComParserRuleCall_2_0; }
		
		//device=RaspPi
		public Assignment getDeviceAssignment_3() { return cDeviceAssignment_3; }
		
		//RaspPi
		public RuleCall getDeviceRaspPiParserRuleCall_3_0() { return cDeviceRaspPiParserRuleCall_3_0; }
		
		//edgeDevices+=Edge*
		public Assignment getEdgeDevicesAssignment_4() { return cEdgeDevicesAssignment_4; }
		
		//Edge
		public RuleCall getEdgeDevicesEdgeParserRuleCall_4_0() { return cEdgeDevicesEdgeParserRuleCall_4_0; }
	}
	public class RaspPiElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.RaspPi");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRaspPiAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRaspberryPiKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStorageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStorageStorageParserRuleCall_2_0 = (RuleCall)cStorageAssignment_2.eContents().get(0);
		private final Assignment cVisualizationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVisualizationVisualizerParserRuleCall_3_0 = (RuleCall)cVisualizationAssignment_3.eContents().get(0);
		
		//RaspPi:
		//    {RaspPi} 'raspberryPi' storage+=Storage* visualization+=Visualizer*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{RaspPi} 'raspberryPi' storage+=Storage* visualization+=Visualizer*
		public Group getGroup() { return cGroup; }
		
		//{RaspPi}
		public Action getRaspPiAction_0() { return cRaspPiAction_0; }
		
		//'raspberryPi'
		public Keyword getRaspberryPiKeyword_1() { return cRaspberryPiKeyword_1; }
		
		//storage+=Storage*
		public Assignment getStorageAssignment_2() { return cStorageAssignment_2; }
		
		//Storage
		public RuleCall getStorageStorageParserRuleCall_2_0() { return cStorageStorageParserRuleCall_2_0; }
		
		//visualization+=Visualizer*
		public Assignment getVisualizationAssignment_3() { return cVisualizationAssignment_3; }
		
		//Visualizer
		public RuleCall getVisualizationVisualizerParserRuleCall_3_0() { return cVisualizationVisualizerParserRuleCall_3_0; }
	}
	public class StorageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Storage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStorageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Storage:
		//    'storage' type=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'storage' type=ID
		public Group getGroup() { return cGroup; }
		
		//'storage'
		public Keyword getStorageKeyword_0() { return cStorageKeyword_0; }
		
		//type=ID
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_0() { return cTypeIDTerminalRuleCall_1_0; }
	}
	public class VisualizerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Visualizer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Visualizer:
		//    'vis' type=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'vis' type=ID
		public Group getGroup() { return cGroup; }
		
		//'vis'
		public Keyword getVisKeyword_0() { return cVisKeyword_0; }
		
		//type=ID
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_0() { return cTypeIDTerminalRuleCall_1_0; }
	}
	public class EdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Edge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEdgeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDeviceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeviceArduinoParserRuleCall_2_0 = (RuleCall)cDeviceAssignment_2.eContents().get(0);
		
		//Edge:
		//    'edge' name=ID device=Arduino
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'edge' name=ID device=Arduino
		public Group getGroup() { return cGroup; }
		
		//'edge'
		public Keyword getEdgeKeyword_0() { return cEdgeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//device=Arduino
		public Assignment getDeviceAssignment_2() { return cDeviceAssignment_2; }
		
		//Arduino
		public RuleCall getDeviceArduinoParserRuleCall_2_0() { return cDeviceArduinoParserRuleCall_2_0; }
	}
	public class ArduinoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Arduino");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArduinoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cRateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRateINTTerminalRuleCall_2_0 = (RuleCall)cRateAssignment_2.eContents().get(0);
		private final Assignment cSensorsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSensorsSensorParserRuleCall_3_0 = (RuleCall)cSensorsAssignment_3.eContents().get(0);
		
		//Arduino:
		//    'arduino' 'rate' rate=INT sensors+=Sensor*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'arduino' 'rate' rate=INT sensors+=Sensor*
		public Group getGroup() { return cGroup; }
		
		//'arduino'
		public Keyword getArduinoKeyword_0() { return cArduinoKeyword_0; }
		
		//'rate'
		public Keyword getRateKeyword_1() { return cRateKeyword_1; }
		
		//rate=INT
		public Assignment getRateAssignment_2() { return cRateAssignment_2; }
		
		//INT
		public RuleCall getRateINTTerminalRuleCall_2_0() { return cRateINTTerminalRuleCall_2_0; }
		
		//sensors+=Sensor*
		public Assignment getSensorsAssignment_3() { return cSensorsAssignment_3; }
		
		//Sensor
		public RuleCall getSensorsSensorParserRuleCall_3_0() { return cSensorsSensorParserRuleCall_3_0; }
	}
	public class ComElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Com");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cNrf24l01ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Com:
		//    'com' Nrf24l01
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'com' Nrf24l01
		public Group getGroup() { return cGroup; }
		
		//'com'
		public Keyword getComKeyword_0() { return cComKeyword_0; }
		
		//Nrf24l01
		public RuleCall getNrf24l01ParserRuleCall_1() { return cNrf24l01ParserRuleCall_1; }
	}
	public class Nrf24l01Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Nrf24l01");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNrf24l01Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTimeoutAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTimeoutINTTerminalRuleCall_1_0 = (RuleCall)cTimeoutAssignment_1.eContents().get(0);
		
		//Nrf24l01:
		//    'nrf24l01' timeout=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'nrf24l01' timeout=INT
		public Group getGroup() { return cGroup; }
		
		//'nrf24l01'
		public Keyword getNrf24l01Keyword_0() { return cNrf24l01Keyword_0; }
		
		//timeout=INT
		public Assignment getTimeoutAssignment_1() { return cTimeoutAssignment_1; }
		
		//INT
		public RuleCall getTimeoutINTTerminalRuleCall_1_0() { return cTimeoutINTTerminalRuleCall_1_0; }
	}
	public class SensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Sensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSensorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cWater_levelParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cSr04ParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cSoundParserRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRateKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRateAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRateINTTerminalRuleCall_2_1_0 = (RuleCall)cRateAssignment_2_1.eContents().get(0);
		private final Assignment cPreprocessorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPreprocessorPreProcessorParserRuleCall_3_0 = (RuleCall)cPreprocessorAssignment_3.eContents().get(0);
		
		//Sensor:
		//    'sensor' (Water_level | Sr04 | Sound) ('rate' rate=INT)? preprocessor=PreProcessor
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'sensor' (Water_level | Sr04 | Sound) ('rate' rate=INT)? preprocessor=PreProcessor
		public Group getGroup() { return cGroup; }
		
		//'sensor'
		public Keyword getSensorKeyword_0() { return cSensorKeyword_0; }
		
		//(Water_level | Sr04 | Sound)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//Water_level
		public RuleCall getWater_levelParserRuleCall_1_0() { return cWater_levelParserRuleCall_1_0; }
		
		//Sr04
		public RuleCall getSr04ParserRuleCall_1_1() { return cSr04ParserRuleCall_1_1; }
		
		//Sound
		public RuleCall getSoundParserRuleCall_1_2() { return cSoundParserRuleCall_1_2; }
		
		//('rate' rate=INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'rate'
		public Keyword getRateKeyword_2_0() { return cRateKeyword_2_0; }
		
		//rate=INT
		public Assignment getRateAssignment_2_1() { return cRateAssignment_2_1; }
		
		//INT
		public RuleCall getRateINTTerminalRuleCall_2_1_0() { return cRateINTTerminalRuleCall_2_1_0; }
		
		//preprocessor=PreProcessor
		public Assignment getPreprocessorAssignment_3() { return cPreprocessorAssignment_3; }
		
		//PreProcessor
		public RuleCall getPreprocessorPreProcessorParserRuleCall_3_0() { return cPreprocessorPreProcessorParserRuleCall_3_0; }
	}
	public class Water_levelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Water_level");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWaterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Water_level:
		//    'water' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'water' name=ID
		public Group getGroup() { return cGroup; }
		
		//'water'
		public Keyword getWaterKeyword_0() { return cWaterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class Sr04Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Sr04");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSr04Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Sr04:
		//    'sr04' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'sr04' name=ID
		public Group getGroup() { return cGroup; }
		
		//'sr04'
		public Keyword getSr04Keyword_0() { return cSr04Keyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class SoundElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Sound");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSoundKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Sound:
		//    'sound' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'sound' name=ID
		public Group getGroup() { return cGroup; }
		
		//'sound'
		public Keyword getSoundKeyword_0() { return cSoundKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class PreProcessorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.PreProcessor");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAverageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cThresholdParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PreProcessor:
		//    Average | Threshold
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Average | Threshold
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Average
		public RuleCall getAverageParserRuleCall_0() { return cAverageParserRuleCall_0; }
		
		//Threshold
		public RuleCall getThresholdParserRuleCall_1() { return cThresholdParserRuleCall_1; }
	}
	public class AverageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Average");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAvgKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Average:
		//    'avg' value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'avg' value=INT
		public Group getGroup() { return cGroup; }
		
		//'avg'
		public Keyword getAvgKeyword_0() { return cAvgKeyword_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class ThresholdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SensorHub.Threshold");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThreshKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMinAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMinINTTerminalRuleCall_1_0 = (RuleCall)cMinAssignment_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMaxAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMaxINTTerminalRuleCall_3_0 = (RuleCall)cMaxAssignment_3.eContents().get(0);
		
		//Threshold:
		//    'thresh' min=INT '..' max=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'thresh' min=INT '..' max=INT
		public Group getGroup() { return cGroup; }
		
		//'thresh'
		public Keyword getThreshKeyword_0() { return cThreshKeyword_0; }
		
		//min=INT
		public Assignment getMinAssignment_1() { return cMinAssignment_1; }
		
		//INT
		public RuleCall getMinINTTerminalRuleCall_1_0() { return cMinINTTerminalRuleCall_1_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_2() { return cFullStopFullStopKeyword_2; }
		
		//max=INT
		public Assignment getMaxAssignment_3() { return cMaxAssignment_3; }
		
		//INT
		public RuleCall getMaxINTTerminalRuleCall_3_0() { return cMaxINTTerminalRuleCall_3_0; }
	}
	
	
	private final SensorSystemElements pSensorSystem;
	private final DeviceElements pDevice;
	private final FogElements pFog;
	private final RaspPiElements pRaspPi;
	private final StorageElements pStorage;
	private final VisualizerElements pVisualizer;
	private final EdgeElements pEdge;
	private final ArduinoElements pArduino;
	private final ComElements pCom;
	private final Nrf24l01Elements pNrf24l01;
	private final SensorElements pSensor;
	private final Water_levelElements pWater_level;
	private final Sr04Elements pSr04;
	private final SoundElements pSound;
	private final PreProcessorElements pPreProcessor;
	private final AverageElements pAverage;
	private final ThresholdElements pThreshold;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SensorHubGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSensorSystem = new SensorSystemElements();
		this.pDevice = new DeviceElements();
		this.pFog = new FogElements();
		this.pRaspPi = new RaspPiElements();
		this.pStorage = new StorageElements();
		this.pVisualizer = new VisualizerElements();
		this.pEdge = new EdgeElements();
		this.pArduino = new ArduinoElements();
		this.pCom = new ComElements();
		this.pNrf24l01 = new Nrf24l01Elements();
		this.pSensor = new SensorElements();
		this.pWater_level = new Water_levelElements();
		this.pSr04 = new Sr04Elements();
		this.pSound = new SoundElements();
		this.pPreProcessor = new PreProcessorElements();
		this.pAverage = new AverageElements();
		this.pThreshold = new ThresholdElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.SensorHub".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SensorSystem:
	//    'system' name=ID devices+=Device*
	//    ;
	public SensorSystemElements getSensorSystemAccess() {
		return pSensorSystem;
	}
	
	public ParserRule getSensorSystemRule() {
		return getSensorSystemAccess().getRule();
	}
	
	//Device:
	//    Fog | Edge
	//    ;
	public DeviceElements getDeviceAccess() {
		return pDevice;
	}
	
	public ParserRule getDeviceRule() {
		return getDeviceAccess().getRule();
	}
	
	//Fog:
	//    'fog' name=ID coms=Com device=RaspPi edgeDevices+=Edge*
	//;
	public FogElements getFogAccess() {
		return pFog;
	}
	
	public ParserRule getFogRule() {
		return getFogAccess().getRule();
	}
	
	//RaspPi:
	//    {RaspPi} 'raspberryPi' storage+=Storage* visualization+=Visualizer*
	//;
	public RaspPiElements getRaspPiAccess() {
		return pRaspPi;
	}
	
	public ParserRule getRaspPiRule() {
		return getRaspPiAccess().getRule();
	}
	
	//Storage:
	//    'storage' type=ID
	//;
	public StorageElements getStorageAccess() {
		return pStorage;
	}
	
	public ParserRule getStorageRule() {
		return getStorageAccess().getRule();
	}
	
	//Visualizer:
	//    'vis' type=ID
	//;
	public VisualizerElements getVisualizerAccess() {
		return pVisualizer;
	}
	
	public ParserRule getVisualizerRule() {
		return getVisualizerAccess().getRule();
	}
	
	//Edge:
	//    'edge' name=ID device=Arduino
	//;
	public EdgeElements getEdgeAccess() {
		return pEdge;
	}
	
	public ParserRule getEdgeRule() {
		return getEdgeAccess().getRule();
	}
	
	//Arduino:
	//    'arduino' 'rate' rate=INT sensors+=Sensor*
	//;
	public ArduinoElements getArduinoAccess() {
		return pArduino;
	}
	
	public ParserRule getArduinoRule() {
		return getArduinoAccess().getRule();
	}
	
	//Com:
	//    'com' Nrf24l01
	//;
	public ComElements getComAccess() {
		return pCom;
	}
	
	public ParserRule getComRule() {
		return getComAccess().getRule();
	}
	
	//Nrf24l01:
	//    'nrf24l01' timeout=INT
	//;
	public Nrf24l01Elements getNrf24l01Access() {
		return pNrf24l01;
	}
	
	public ParserRule getNrf24l01Rule() {
		return getNrf24l01Access().getRule();
	}
	
	//Sensor:
	//    'sensor' (Water_level | Sr04 | Sound) ('rate' rate=INT)? preprocessor=PreProcessor
	//;
	public SensorElements getSensorAccess() {
		return pSensor;
	}
	
	public ParserRule getSensorRule() {
		return getSensorAccess().getRule();
	}
	
	//Water_level:
	//    'water' name=ID
	//;
	public Water_levelElements getWater_levelAccess() {
		return pWater_level;
	}
	
	public ParserRule getWater_levelRule() {
		return getWater_levelAccess().getRule();
	}
	
	//Sr04:
	//    'sr04' name=ID
	//;
	public Sr04Elements getSr04Access() {
		return pSr04;
	}
	
	public ParserRule getSr04Rule() {
		return getSr04Access().getRule();
	}
	
	//Sound:
	//    'sound' name=ID
	//;
	public SoundElements getSoundAccess() {
		return pSound;
	}
	
	public ParserRule getSoundRule() {
		return getSoundAccess().getRule();
	}
	
	//PreProcessor:
	//    Average | Threshold
	//;
	public PreProcessorElements getPreProcessorAccess() {
		return pPreProcessor;
	}
	
	public ParserRule getPreProcessorRule() {
		return getPreProcessorAccess().getRule();
	}
	
	//Average:
	//    'avg' value=INT
	//;
	public AverageElements getAverageAccess() {
		return pAverage;
	}
	
	public ParserRule getAverageRule() {
		return getAverageAccess().getRule();
	}
	
	//Threshold:
	//    'thresh' min=INT '..' max=INT
	//;
	public ThresholdElements getThresholdAccess() {
		return pThreshold;
	}
	
	public ParserRule getThresholdRule() {
		return getThresholdAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}