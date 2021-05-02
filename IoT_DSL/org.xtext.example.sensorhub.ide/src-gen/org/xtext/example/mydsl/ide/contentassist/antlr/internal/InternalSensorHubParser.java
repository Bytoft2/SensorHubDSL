package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SensorHubGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensorHubParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'fog'", "'raspberryPi'", "'storage'", "'vis'", "'edge'", "'arduino'", "'rate'", "'com'", "'nrf24l01'", "'sensor'", "'water'", "'sr04'", "'sound'", "'avg'", "'thresh'", "'..'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSensorHubParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSensorHubParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSensorHubParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSensorHub.g"; }


    	private SensorHubGrammarAccess grammarAccess;

    	public void setGrammarAccess(SensorHubGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSensorSystem"
    // InternalSensorHub.g:53:1: entryRuleSensorSystem : ruleSensorSystem EOF ;
    public final void entryRuleSensorSystem() throws RecognitionException {
        try {
            // InternalSensorHub.g:54:1: ( ruleSensorSystem EOF )
            // InternalSensorHub.g:55:1: ruleSensorSystem EOF
            {
             before(grammarAccess.getSensorSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorSystem();

            state._fsp--;

             after(grammarAccess.getSensorSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorSystem"


    // $ANTLR start "ruleSensorSystem"
    // InternalSensorHub.g:62:1: ruleSensorSystem : ( ( rule__SensorSystem__Group__0 ) ) ;
    public final void ruleSensorSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:66:2: ( ( ( rule__SensorSystem__Group__0 ) ) )
            // InternalSensorHub.g:67:2: ( ( rule__SensorSystem__Group__0 ) )
            {
            // InternalSensorHub.g:67:2: ( ( rule__SensorSystem__Group__0 ) )
            // InternalSensorHub.g:68:3: ( rule__SensorSystem__Group__0 )
            {
             before(grammarAccess.getSensorSystemAccess().getGroup()); 
            // InternalSensorHub.g:69:3: ( rule__SensorSystem__Group__0 )
            // InternalSensorHub.g:69:4: rule__SensorSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSensorSystem"


    // $ANTLR start "entryRuleDevice"
    // InternalSensorHub.g:78:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalSensorHub.g:79:1: ( ruleDevice EOF )
            // InternalSensorHub.g:80:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalSensorHub.g:87:1: ruleDevice : ( ( rule__Device__Alternatives ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:91:2: ( ( ( rule__Device__Alternatives ) ) )
            // InternalSensorHub.g:92:2: ( ( rule__Device__Alternatives ) )
            {
            // InternalSensorHub.g:92:2: ( ( rule__Device__Alternatives ) )
            // InternalSensorHub.g:93:3: ( rule__Device__Alternatives )
            {
             before(grammarAccess.getDeviceAccess().getAlternatives()); 
            // InternalSensorHub.g:94:3: ( rule__Device__Alternatives )
            // InternalSensorHub.g:94:4: rule__Device__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Device__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleFog"
    // InternalSensorHub.g:103:1: entryRuleFog : ruleFog EOF ;
    public final void entryRuleFog() throws RecognitionException {
        try {
            // InternalSensorHub.g:104:1: ( ruleFog EOF )
            // InternalSensorHub.g:105:1: ruleFog EOF
            {
             before(grammarAccess.getFogRule()); 
            pushFollow(FOLLOW_1);
            ruleFog();

            state._fsp--;

             after(grammarAccess.getFogRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFog"


    // $ANTLR start "ruleFog"
    // InternalSensorHub.g:112:1: ruleFog : ( ( rule__Fog__Group__0 ) ) ;
    public final void ruleFog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:116:2: ( ( ( rule__Fog__Group__0 ) ) )
            // InternalSensorHub.g:117:2: ( ( rule__Fog__Group__0 ) )
            {
            // InternalSensorHub.g:117:2: ( ( rule__Fog__Group__0 ) )
            // InternalSensorHub.g:118:3: ( rule__Fog__Group__0 )
            {
             before(grammarAccess.getFogAccess().getGroup()); 
            // InternalSensorHub.g:119:3: ( rule__Fog__Group__0 )
            // InternalSensorHub.g:119:4: rule__Fog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFogAccess().getGroup()); 

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
    // $ANTLR end "ruleFog"


    // $ANTLR start "entryRuleRaspPi"
    // InternalSensorHub.g:128:1: entryRuleRaspPi : ruleRaspPi EOF ;
    public final void entryRuleRaspPi() throws RecognitionException {
        try {
            // InternalSensorHub.g:129:1: ( ruleRaspPi EOF )
            // InternalSensorHub.g:130:1: ruleRaspPi EOF
            {
             before(grammarAccess.getRaspPiRule()); 
            pushFollow(FOLLOW_1);
            ruleRaspPi();

            state._fsp--;

             after(grammarAccess.getRaspPiRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRaspPi"


    // $ANTLR start "ruleRaspPi"
    // InternalSensorHub.g:137:1: ruleRaspPi : ( ( rule__RaspPi__Group__0 ) ) ;
    public final void ruleRaspPi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:141:2: ( ( ( rule__RaspPi__Group__0 ) ) )
            // InternalSensorHub.g:142:2: ( ( rule__RaspPi__Group__0 ) )
            {
            // InternalSensorHub.g:142:2: ( ( rule__RaspPi__Group__0 ) )
            // InternalSensorHub.g:143:3: ( rule__RaspPi__Group__0 )
            {
             before(grammarAccess.getRaspPiAccess().getGroup()); 
            // InternalSensorHub.g:144:3: ( rule__RaspPi__Group__0 )
            // InternalSensorHub.g:144:4: rule__RaspPi__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RaspPi__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaspPiAccess().getGroup()); 

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
    // $ANTLR end "ruleRaspPi"


    // $ANTLR start "entryRuleStorage"
    // InternalSensorHub.g:153:1: entryRuleStorage : ruleStorage EOF ;
    public final void entryRuleStorage() throws RecognitionException {
        try {
            // InternalSensorHub.g:154:1: ( ruleStorage EOF )
            // InternalSensorHub.g:155:1: ruleStorage EOF
            {
             before(grammarAccess.getStorageRule()); 
            pushFollow(FOLLOW_1);
            ruleStorage();

            state._fsp--;

             after(grammarAccess.getStorageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStorage"


    // $ANTLR start "ruleStorage"
    // InternalSensorHub.g:162:1: ruleStorage : ( ( rule__Storage__Group__0 ) ) ;
    public final void ruleStorage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:166:2: ( ( ( rule__Storage__Group__0 ) ) )
            // InternalSensorHub.g:167:2: ( ( rule__Storage__Group__0 ) )
            {
            // InternalSensorHub.g:167:2: ( ( rule__Storage__Group__0 ) )
            // InternalSensorHub.g:168:3: ( rule__Storage__Group__0 )
            {
             before(grammarAccess.getStorageAccess().getGroup()); 
            // InternalSensorHub.g:169:3: ( rule__Storage__Group__0 )
            // InternalSensorHub.g:169:4: rule__Storage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Storage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStorageAccess().getGroup()); 

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
    // $ANTLR end "ruleStorage"


    // $ANTLR start "entryRuleVisualizer"
    // InternalSensorHub.g:178:1: entryRuleVisualizer : ruleVisualizer EOF ;
    public final void entryRuleVisualizer() throws RecognitionException {
        try {
            // InternalSensorHub.g:179:1: ( ruleVisualizer EOF )
            // InternalSensorHub.g:180:1: ruleVisualizer EOF
            {
             before(grammarAccess.getVisualizerRule()); 
            pushFollow(FOLLOW_1);
            ruleVisualizer();

            state._fsp--;

             after(grammarAccess.getVisualizerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVisualizer"


    // $ANTLR start "ruleVisualizer"
    // InternalSensorHub.g:187:1: ruleVisualizer : ( ( rule__Visualizer__Group__0 ) ) ;
    public final void ruleVisualizer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:191:2: ( ( ( rule__Visualizer__Group__0 ) ) )
            // InternalSensorHub.g:192:2: ( ( rule__Visualizer__Group__0 ) )
            {
            // InternalSensorHub.g:192:2: ( ( rule__Visualizer__Group__0 ) )
            // InternalSensorHub.g:193:3: ( rule__Visualizer__Group__0 )
            {
             before(grammarAccess.getVisualizerAccess().getGroup()); 
            // InternalSensorHub.g:194:3: ( rule__Visualizer__Group__0 )
            // InternalSensorHub.g:194:4: rule__Visualizer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getGroup()); 

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
    // $ANTLR end "ruleVisualizer"


    // $ANTLR start "entryRuleEdge"
    // InternalSensorHub.g:203:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalSensorHub.g:204:1: ( ruleEdge EOF )
            // InternalSensorHub.g:205:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalSensorHub.g:212:1: ruleEdge : ( ( rule__Edge__Group__0 ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:216:2: ( ( ( rule__Edge__Group__0 ) ) )
            // InternalSensorHub.g:217:2: ( ( rule__Edge__Group__0 ) )
            {
            // InternalSensorHub.g:217:2: ( ( rule__Edge__Group__0 ) )
            // InternalSensorHub.g:218:3: ( rule__Edge__Group__0 )
            {
             before(grammarAccess.getEdgeAccess().getGroup()); 
            // InternalSensorHub.g:219:3: ( rule__Edge__Group__0 )
            // InternalSensorHub.g:219:4: rule__Edge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getGroup()); 

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleArduino"
    // InternalSensorHub.g:228:1: entryRuleArduino : ruleArduino EOF ;
    public final void entryRuleArduino() throws RecognitionException {
        try {
            // InternalSensorHub.g:229:1: ( ruleArduino EOF )
            // InternalSensorHub.g:230:1: ruleArduino EOF
            {
             before(grammarAccess.getArduinoRule()); 
            pushFollow(FOLLOW_1);
            ruleArduino();

            state._fsp--;

             after(grammarAccess.getArduinoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArduino"


    // $ANTLR start "ruleArduino"
    // InternalSensorHub.g:237:1: ruleArduino : ( ( rule__Arduino__Group__0 ) ) ;
    public final void ruleArduino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:241:2: ( ( ( rule__Arduino__Group__0 ) ) )
            // InternalSensorHub.g:242:2: ( ( rule__Arduino__Group__0 ) )
            {
            // InternalSensorHub.g:242:2: ( ( rule__Arduino__Group__0 ) )
            // InternalSensorHub.g:243:3: ( rule__Arduino__Group__0 )
            {
             before(grammarAccess.getArduinoAccess().getGroup()); 
            // InternalSensorHub.g:244:3: ( rule__Arduino__Group__0 )
            // InternalSensorHub.g:244:4: rule__Arduino__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arduino__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArduinoAccess().getGroup()); 

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
    // $ANTLR end "ruleArduino"


    // $ANTLR start "entryRuleCom"
    // InternalSensorHub.g:253:1: entryRuleCom : ruleCom EOF ;
    public final void entryRuleCom() throws RecognitionException {
        try {
            // InternalSensorHub.g:254:1: ( ruleCom EOF )
            // InternalSensorHub.g:255:1: ruleCom EOF
            {
             before(grammarAccess.getComRule()); 
            pushFollow(FOLLOW_1);
            ruleCom();

            state._fsp--;

             after(grammarAccess.getComRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCom"


    // $ANTLR start "ruleCom"
    // InternalSensorHub.g:262:1: ruleCom : ( ( rule__Com__Group__0 ) ) ;
    public final void ruleCom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:266:2: ( ( ( rule__Com__Group__0 ) ) )
            // InternalSensorHub.g:267:2: ( ( rule__Com__Group__0 ) )
            {
            // InternalSensorHub.g:267:2: ( ( rule__Com__Group__0 ) )
            // InternalSensorHub.g:268:3: ( rule__Com__Group__0 )
            {
             before(grammarAccess.getComAccess().getGroup()); 
            // InternalSensorHub.g:269:3: ( rule__Com__Group__0 )
            // InternalSensorHub.g:269:4: rule__Com__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Com__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComAccess().getGroup()); 

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
    // $ANTLR end "ruleCom"


    // $ANTLR start "entryRuleNrf24l01"
    // InternalSensorHub.g:278:1: entryRuleNrf24l01 : ruleNrf24l01 EOF ;
    public final void entryRuleNrf24l01() throws RecognitionException {
        try {
            // InternalSensorHub.g:279:1: ( ruleNrf24l01 EOF )
            // InternalSensorHub.g:280:1: ruleNrf24l01 EOF
            {
             before(grammarAccess.getNrf24l01Rule()); 
            pushFollow(FOLLOW_1);
            ruleNrf24l01();

            state._fsp--;

             after(grammarAccess.getNrf24l01Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNrf24l01"


    // $ANTLR start "ruleNrf24l01"
    // InternalSensorHub.g:287:1: ruleNrf24l01 : ( ( rule__Nrf24l01__Group__0 ) ) ;
    public final void ruleNrf24l01() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:291:2: ( ( ( rule__Nrf24l01__Group__0 ) ) )
            // InternalSensorHub.g:292:2: ( ( rule__Nrf24l01__Group__0 ) )
            {
            // InternalSensorHub.g:292:2: ( ( rule__Nrf24l01__Group__0 ) )
            // InternalSensorHub.g:293:3: ( rule__Nrf24l01__Group__0 )
            {
             before(grammarAccess.getNrf24l01Access().getGroup()); 
            // InternalSensorHub.g:294:3: ( rule__Nrf24l01__Group__0 )
            // InternalSensorHub.g:294:4: rule__Nrf24l01__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nrf24l01__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNrf24l01Access().getGroup()); 

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
    // $ANTLR end "ruleNrf24l01"


    // $ANTLR start "entryRuleSensor"
    // InternalSensorHub.g:303:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSensorHub.g:304:1: ( ruleSensor EOF )
            // InternalSensorHub.g:305:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSensorHub.g:312:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:316:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSensorHub.g:317:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSensorHub.g:317:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSensorHub.g:318:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSensorHub.g:319:3: ( rule__Sensor__Group__0 )
            // InternalSensorHub.g:319:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleWater_level"
    // InternalSensorHub.g:328:1: entryRuleWater_level : ruleWater_level EOF ;
    public final void entryRuleWater_level() throws RecognitionException {
        try {
            // InternalSensorHub.g:329:1: ( ruleWater_level EOF )
            // InternalSensorHub.g:330:1: ruleWater_level EOF
            {
             before(grammarAccess.getWater_levelRule()); 
            pushFollow(FOLLOW_1);
            ruleWater_level();

            state._fsp--;

             after(grammarAccess.getWater_levelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWater_level"


    // $ANTLR start "ruleWater_level"
    // InternalSensorHub.g:337:1: ruleWater_level : ( ( rule__Water_level__Group__0 ) ) ;
    public final void ruleWater_level() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:341:2: ( ( ( rule__Water_level__Group__0 ) ) )
            // InternalSensorHub.g:342:2: ( ( rule__Water_level__Group__0 ) )
            {
            // InternalSensorHub.g:342:2: ( ( rule__Water_level__Group__0 ) )
            // InternalSensorHub.g:343:3: ( rule__Water_level__Group__0 )
            {
             before(grammarAccess.getWater_levelAccess().getGroup()); 
            // InternalSensorHub.g:344:3: ( rule__Water_level__Group__0 )
            // InternalSensorHub.g:344:4: rule__Water_level__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Water_level__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWater_levelAccess().getGroup()); 

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
    // $ANTLR end "ruleWater_level"


    // $ANTLR start "entryRuleSr04"
    // InternalSensorHub.g:353:1: entryRuleSr04 : ruleSr04 EOF ;
    public final void entryRuleSr04() throws RecognitionException {
        try {
            // InternalSensorHub.g:354:1: ( ruleSr04 EOF )
            // InternalSensorHub.g:355:1: ruleSr04 EOF
            {
             before(grammarAccess.getSr04Rule()); 
            pushFollow(FOLLOW_1);
            ruleSr04();

            state._fsp--;

             after(grammarAccess.getSr04Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSr04"


    // $ANTLR start "ruleSr04"
    // InternalSensorHub.g:362:1: ruleSr04 : ( ( rule__Sr04__Group__0 ) ) ;
    public final void ruleSr04() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:366:2: ( ( ( rule__Sr04__Group__0 ) ) )
            // InternalSensorHub.g:367:2: ( ( rule__Sr04__Group__0 ) )
            {
            // InternalSensorHub.g:367:2: ( ( rule__Sr04__Group__0 ) )
            // InternalSensorHub.g:368:3: ( rule__Sr04__Group__0 )
            {
             before(grammarAccess.getSr04Access().getGroup()); 
            // InternalSensorHub.g:369:3: ( rule__Sr04__Group__0 )
            // InternalSensorHub.g:369:4: rule__Sr04__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sr04__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSr04Access().getGroup()); 

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
    // $ANTLR end "ruleSr04"


    // $ANTLR start "entryRuleSound"
    // InternalSensorHub.g:378:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalSensorHub.g:379:1: ( ruleSound EOF )
            // InternalSensorHub.g:380:1: ruleSound EOF
            {
             before(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getSoundRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalSensorHub.g:387:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:391:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalSensorHub.g:392:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalSensorHub.g:392:2: ( ( rule__Sound__Group__0 ) )
            // InternalSensorHub.g:393:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalSensorHub.g:394:3: ( rule__Sound__Group__0 )
            // InternalSensorHub.g:394:4: rule__Sound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getGroup()); 

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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRulePreProcessor"
    // InternalSensorHub.g:403:1: entryRulePreProcessor : rulePreProcessor EOF ;
    public final void entryRulePreProcessor() throws RecognitionException {
        try {
            // InternalSensorHub.g:404:1: ( rulePreProcessor EOF )
            // InternalSensorHub.g:405:1: rulePreProcessor EOF
            {
             before(grammarAccess.getPreProcessorRule()); 
            pushFollow(FOLLOW_1);
            rulePreProcessor();

            state._fsp--;

             after(grammarAccess.getPreProcessorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePreProcessor"


    // $ANTLR start "rulePreProcessor"
    // InternalSensorHub.g:412:1: rulePreProcessor : ( ( rule__PreProcessor__Alternatives ) ) ;
    public final void rulePreProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:416:2: ( ( ( rule__PreProcessor__Alternatives ) ) )
            // InternalSensorHub.g:417:2: ( ( rule__PreProcessor__Alternatives ) )
            {
            // InternalSensorHub.g:417:2: ( ( rule__PreProcessor__Alternatives ) )
            // InternalSensorHub.g:418:3: ( rule__PreProcessor__Alternatives )
            {
             before(grammarAccess.getPreProcessorAccess().getAlternatives()); 
            // InternalSensorHub.g:419:3: ( rule__PreProcessor__Alternatives )
            // InternalSensorHub.g:419:4: rule__PreProcessor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PreProcessor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreProcessorAccess().getAlternatives()); 

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
    // $ANTLR end "rulePreProcessor"


    // $ANTLR start "entryRuleAverage"
    // InternalSensorHub.g:428:1: entryRuleAverage : ruleAverage EOF ;
    public final void entryRuleAverage() throws RecognitionException {
        try {
            // InternalSensorHub.g:429:1: ( ruleAverage EOF )
            // InternalSensorHub.g:430:1: ruleAverage EOF
            {
             before(grammarAccess.getAverageRule()); 
            pushFollow(FOLLOW_1);
            ruleAverage();

            state._fsp--;

             after(grammarAccess.getAverageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAverage"


    // $ANTLR start "ruleAverage"
    // InternalSensorHub.g:437:1: ruleAverage : ( ( rule__Average__Group__0 ) ) ;
    public final void ruleAverage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:441:2: ( ( ( rule__Average__Group__0 ) ) )
            // InternalSensorHub.g:442:2: ( ( rule__Average__Group__0 ) )
            {
            // InternalSensorHub.g:442:2: ( ( rule__Average__Group__0 ) )
            // InternalSensorHub.g:443:3: ( rule__Average__Group__0 )
            {
             before(grammarAccess.getAverageAccess().getGroup()); 
            // InternalSensorHub.g:444:3: ( rule__Average__Group__0 )
            // InternalSensorHub.g:444:4: rule__Average__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Average__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAverageAccess().getGroup()); 

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
    // $ANTLR end "ruleAverage"


    // $ANTLR start "entryRuleThreshold"
    // InternalSensorHub.g:453:1: entryRuleThreshold : ruleThreshold EOF ;
    public final void entryRuleThreshold() throws RecognitionException {
        try {
            // InternalSensorHub.g:454:1: ( ruleThreshold EOF )
            // InternalSensorHub.g:455:1: ruleThreshold EOF
            {
             before(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleThreshold();

            state._fsp--;

             after(grammarAccess.getThresholdRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalSensorHub.g:462:1: ruleThreshold : ( ( rule__Threshold__Group__0 ) ) ;
    public final void ruleThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:466:2: ( ( ( rule__Threshold__Group__0 ) ) )
            // InternalSensorHub.g:467:2: ( ( rule__Threshold__Group__0 ) )
            {
            // InternalSensorHub.g:467:2: ( ( rule__Threshold__Group__0 ) )
            // InternalSensorHub.g:468:3: ( rule__Threshold__Group__0 )
            {
             before(grammarAccess.getThresholdAccess().getGroup()); 
            // InternalSensorHub.g:469:3: ( rule__Threshold__Group__0 )
            // InternalSensorHub.g:469:4: rule__Threshold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getGroup()); 

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
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "rule__Device__Alternatives"
    // InternalSensorHub.g:477:1: rule__Device__Alternatives : ( ( ruleFog ) | ( ruleEdge ) );
    public final void rule__Device__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:481:1: ( ( ruleFog ) | ( ruleEdge ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSensorHub.g:482:2: ( ruleFog )
                    {
                    // InternalSensorHub.g:482:2: ( ruleFog )
                    // InternalSensorHub.g:483:3: ruleFog
                    {
                     before(grammarAccess.getDeviceAccess().getFogParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFog();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getFogParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorHub.g:488:2: ( ruleEdge )
                    {
                    // InternalSensorHub.g:488:2: ( ruleEdge )
                    // InternalSensorHub.g:489:3: ruleEdge
                    {
                     before(grammarAccess.getDeviceAccess().getEdgeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEdge();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getEdgeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Device__Alternatives"


    // $ANTLR start "rule__Sensor__Alternatives_1"
    // InternalSensorHub.g:498:1: rule__Sensor__Alternatives_1 : ( ( ruleWater_level ) | ( ruleSr04 ) | ( ruleSound ) );
    public final void rule__Sensor__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:502:1: ( ( ruleWater_level ) | ( ruleSr04 ) | ( ruleSound ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // InternalSensorHub.g:503:2: ( ruleWater_level )
                    {
                    // InternalSensorHub.g:503:2: ( ruleWater_level )
                    // InternalSensorHub.g:504:3: ruleWater_level
                    {
                     before(grammarAccess.getSensorAccess().getWater_levelParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWater_level();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getWater_levelParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorHub.g:509:2: ( ruleSr04 )
                    {
                    // InternalSensorHub.g:509:2: ( ruleSr04 )
                    // InternalSensorHub.g:510:3: ruleSr04
                    {
                     before(grammarAccess.getSensorAccess().getSr04ParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSr04();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getSr04ParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensorHub.g:515:2: ( ruleSound )
                    {
                    // InternalSensorHub.g:515:2: ( ruleSound )
                    // InternalSensorHub.g:516:3: ruleSound
                    {
                     before(grammarAccess.getSensorAccess().getSoundParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSound();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getSoundParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__Sensor__Alternatives_1"


    // $ANTLR start "rule__PreProcessor__Alternatives"
    // InternalSensorHub.g:525:1: rule__PreProcessor__Alternatives : ( ( ruleAverage ) | ( ruleThreshold ) );
    public final void rule__PreProcessor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:529:1: ( ( ruleAverage ) | ( ruleThreshold ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensorHub.g:530:2: ( ruleAverage )
                    {
                    // InternalSensorHub.g:530:2: ( ruleAverage )
                    // InternalSensorHub.g:531:3: ruleAverage
                    {
                     before(grammarAccess.getPreProcessorAccess().getAverageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAverage();

                    state._fsp--;

                     after(grammarAccess.getPreProcessorAccess().getAverageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorHub.g:536:2: ( ruleThreshold )
                    {
                    // InternalSensorHub.g:536:2: ( ruleThreshold )
                    // InternalSensorHub.g:537:3: ruleThreshold
                    {
                     before(grammarAccess.getPreProcessorAccess().getThresholdParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleThreshold();

                    state._fsp--;

                     after(grammarAccess.getPreProcessorAccess().getThresholdParserRuleCall_1()); 

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
    // $ANTLR end "rule__PreProcessor__Alternatives"


    // $ANTLR start "rule__SensorSystem__Group__0"
    // InternalSensorHub.g:546:1: rule__SensorSystem__Group__0 : rule__SensorSystem__Group__0__Impl rule__SensorSystem__Group__1 ;
    public final void rule__SensorSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:550:1: ( rule__SensorSystem__Group__0__Impl rule__SensorSystem__Group__1 )
            // InternalSensorHub.g:551:2: rule__SensorSystem__Group__0__Impl rule__SensorSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SensorSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorSystem__Group__1();

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
    // $ANTLR end "rule__SensorSystem__Group__0"


    // $ANTLR start "rule__SensorSystem__Group__0__Impl"
    // InternalSensorHub.g:558:1: rule__SensorSystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__SensorSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:562:1: ( ( 'system' ) )
            // InternalSensorHub.g:563:1: ( 'system' )
            {
            // InternalSensorHub.g:563:1: ( 'system' )
            // InternalSensorHub.g:564:2: 'system'
            {
             before(grammarAccess.getSensorSystemAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSensorSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__SensorSystem__Group__0__Impl"


    // $ANTLR start "rule__SensorSystem__Group__1"
    // InternalSensorHub.g:573:1: rule__SensorSystem__Group__1 : rule__SensorSystem__Group__1__Impl rule__SensorSystem__Group__2 ;
    public final void rule__SensorSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:577:1: ( rule__SensorSystem__Group__1__Impl rule__SensorSystem__Group__2 )
            // InternalSensorHub.g:578:2: rule__SensorSystem__Group__1__Impl rule__SensorSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SensorSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorSystem__Group__2();

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
    // $ANTLR end "rule__SensorSystem__Group__1"


    // $ANTLR start "rule__SensorSystem__Group__1__Impl"
    // InternalSensorHub.g:585:1: rule__SensorSystem__Group__1__Impl : ( ( rule__SensorSystem__NameAssignment_1 ) ) ;
    public final void rule__SensorSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:589:1: ( ( ( rule__SensorSystem__NameAssignment_1 ) ) )
            // InternalSensorHub.g:590:1: ( ( rule__SensorSystem__NameAssignment_1 ) )
            {
            // InternalSensorHub.g:590:1: ( ( rule__SensorSystem__NameAssignment_1 ) )
            // InternalSensorHub.g:591:2: ( rule__SensorSystem__NameAssignment_1 )
            {
             before(grammarAccess.getSensorSystemAccess().getNameAssignment_1()); 
            // InternalSensorHub.g:592:2: ( rule__SensorSystem__NameAssignment_1 )
            // InternalSensorHub.g:592:3: rule__SensorSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SensorSystem__Group__1__Impl"


    // $ANTLR start "rule__SensorSystem__Group__2"
    // InternalSensorHub.g:600:1: rule__SensorSystem__Group__2 : rule__SensorSystem__Group__2__Impl ;
    public final void rule__SensorSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:604:1: ( rule__SensorSystem__Group__2__Impl )
            // InternalSensorHub.g:605:2: rule__SensorSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorSystem__Group__2__Impl();

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
    // $ANTLR end "rule__SensorSystem__Group__2"


    // $ANTLR start "rule__SensorSystem__Group__2__Impl"
    // InternalSensorHub.g:611:1: rule__SensorSystem__Group__2__Impl : ( ( rule__SensorSystem__DevicesAssignment_2 )* ) ;
    public final void rule__SensorSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:615:1: ( ( ( rule__SensorSystem__DevicesAssignment_2 )* ) )
            // InternalSensorHub.g:616:1: ( ( rule__SensorSystem__DevicesAssignment_2 )* )
            {
            // InternalSensorHub.g:616:1: ( ( rule__SensorSystem__DevicesAssignment_2 )* )
            // InternalSensorHub.g:617:2: ( rule__SensorSystem__DevicesAssignment_2 )*
            {
             before(grammarAccess.getSensorSystemAccess().getDevicesAssignment_2()); 
            // InternalSensorHub.g:618:2: ( rule__SensorSystem__DevicesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSensorHub.g:618:3: rule__SensorSystem__DevicesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SensorSystem__DevicesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSensorSystemAccess().getDevicesAssignment_2()); 

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
    // $ANTLR end "rule__SensorSystem__Group__2__Impl"


    // $ANTLR start "rule__Fog__Group__0"
    // InternalSensorHub.g:627:1: rule__Fog__Group__0 : rule__Fog__Group__0__Impl rule__Fog__Group__1 ;
    public final void rule__Fog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:631:1: ( rule__Fog__Group__0__Impl rule__Fog__Group__1 )
            // InternalSensorHub.g:632:2: rule__Fog__Group__0__Impl rule__Fog__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Fog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fog__Group__1();

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
    // $ANTLR end "rule__Fog__Group__0"


    // $ANTLR start "rule__Fog__Group__0__Impl"
    // InternalSensorHub.g:639:1: rule__Fog__Group__0__Impl : ( 'fog' ) ;
    public final void rule__Fog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:643:1: ( ( 'fog' ) )
            // InternalSensorHub.g:644:1: ( 'fog' )
            {
            // InternalSensorHub.g:644:1: ( 'fog' )
            // InternalSensorHub.g:645:2: 'fog'
            {
             before(grammarAccess.getFogAccess().getFogKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFogAccess().getFogKeyword_0()); 

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
    // $ANTLR end "rule__Fog__Group__0__Impl"


    // $ANTLR start "rule__Fog__Group__1"
    // InternalSensorHub.g:654:1: rule__Fog__Group__1 : rule__Fog__Group__1__Impl rule__Fog__Group__2 ;
    public final void rule__Fog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:658:1: ( rule__Fog__Group__1__Impl rule__Fog__Group__2 )
            // InternalSensorHub.g:659:2: rule__Fog__Group__1__Impl rule__Fog__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Fog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fog__Group__2();

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
    // $ANTLR end "rule__Fog__Group__1"


    // $ANTLR start "rule__Fog__Group__1__Impl"
    // InternalSensorHub.g:666:1: rule__Fog__Group__1__Impl : ( ( rule__Fog__NameAssignment_1 ) ) ;
    public final void rule__Fog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:670:1: ( ( ( rule__Fog__NameAssignment_1 ) ) )
            // InternalSensorHub.g:671:1: ( ( rule__Fog__NameAssignment_1 ) )
            {
            // InternalSensorHub.g:671:1: ( ( rule__Fog__NameAssignment_1 ) )
            // InternalSensorHub.g:672:2: ( rule__Fog__NameAssignment_1 )
            {
             before(grammarAccess.getFogAccess().getNameAssignment_1()); 
            // InternalSensorHub.g:673:2: ( rule__Fog__NameAssignment_1 )
            // InternalSensorHub.g:673:3: rule__Fog__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fog__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFogAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Fog__Group__1__Impl"


    // $ANTLR start "rule__Fog__Group__2"
    // InternalSensorHub.g:681:1: rule__Fog__Group__2 : rule__Fog__Group__2__Impl rule__Fog__Group__3 ;
    public final void rule__Fog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:685:1: ( rule__Fog__Group__2__Impl rule__Fog__Group__3 )
            // InternalSensorHub.g:686:2: rule__Fog__Group__2__Impl rule__Fog__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Fog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fog__Group__3();

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
    // $ANTLR end "rule__Fog__Group__2"


    // $ANTLR start "rule__Fog__Group__2__Impl"
    // InternalSensorHub.g:693:1: rule__Fog__Group__2__Impl : ( ( rule__Fog__ComsAssignment_2 ) ) ;
    public final void rule__Fog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:697:1: ( ( ( rule__Fog__ComsAssignment_2 ) ) )
            // InternalSensorHub.g:698:1: ( ( rule__Fog__ComsAssignment_2 ) )
            {
            // InternalSensorHub.g:698:1: ( ( rule__Fog__ComsAssignment_2 ) )
            // InternalSensorHub.g:699:2: ( rule__Fog__ComsAssignment_2 )
            {
             before(grammarAccess.getFogAccess().getComsAssignment_2()); 
            // InternalSensorHub.g:700:2: ( rule__Fog__ComsAssignment_2 )
            // InternalSensorHub.g:700:3: rule__Fog__ComsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fog__ComsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFogAccess().getComsAssignment_2()); 

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
    // $ANTLR end "rule__Fog__Group__2__Impl"


    // $ANTLR start "rule__Fog__Group__3"
    // InternalSensorHub.g:708:1: rule__Fog__Group__3 : rule__Fog__Group__3__Impl rule__Fog__Group__4 ;
    public final void rule__Fog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:712:1: ( rule__Fog__Group__3__Impl rule__Fog__Group__4 )
            // InternalSensorHub.g:713:2: rule__Fog__Group__3__Impl rule__Fog__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Fog__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fog__Group__4();

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
    // $ANTLR end "rule__Fog__Group__3"


    // $ANTLR start "rule__Fog__Group__3__Impl"
    // InternalSensorHub.g:720:1: rule__Fog__Group__3__Impl : ( ( rule__Fog__DeviceAssignment_3 ) ) ;
    public final void rule__Fog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:724:1: ( ( ( rule__Fog__DeviceAssignment_3 ) ) )
            // InternalSensorHub.g:725:1: ( ( rule__Fog__DeviceAssignment_3 ) )
            {
            // InternalSensorHub.g:725:1: ( ( rule__Fog__DeviceAssignment_3 ) )
            // InternalSensorHub.g:726:2: ( rule__Fog__DeviceAssignment_3 )
            {
             before(grammarAccess.getFogAccess().getDeviceAssignment_3()); 
            // InternalSensorHub.g:727:2: ( rule__Fog__DeviceAssignment_3 )
            // InternalSensorHub.g:727:3: rule__Fog__DeviceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fog__DeviceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFogAccess().getDeviceAssignment_3()); 

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
    // $ANTLR end "rule__Fog__Group__3__Impl"


    // $ANTLR start "rule__Fog__Group__4"
    // InternalSensorHub.g:735:1: rule__Fog__Group__4 : rule__Fog__Group__4__Impl ;
    public final void rule__Fog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:739:1: ( rule__Fog__Group__4__Impl )
            // InternalSensorHub.g:740:2: rule__Fog__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fog__Group__4__Impl();

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
    // $ANTLR end "rule__Fog__Group__4"


    // $ANTLR start "rule__Fog__Group__4__Impl"
    // InternalSensorHub.g:746:1: rule__Fog__Group__4__Impl : ( ( rule__Fog__EdgeDevicesAssignment_4 )* ) ;
    public final void rule__Fog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:750:1: ( ( ( rule__Fog__EdgeDevicesAssignment_4 )* ) )
            // InternalSensorHub.g:751:1: ( ( rule__Fog__EdgeDevicesAssignment_4 )* )
            {
            // InternalSensorHub.g:751:1: ( ( rule__Fog__EdgeDevicesAssignment_4 )* )
            // InternalSensorHub.g:752:2: ( rule__Fog__EdgeDevicesAssignment_4 )*
            {
             before(grammarAccess.getFogAccess().getEdgeDevicesAssignment_4()); 
            // InternalSensorHub.g:753:2: ( rule__Fog__EdgeDevicesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==17) ) {
                            int LA5_4 = input.LA(4);

                            if ( (LA5_4==18) ) {
                                int LA5_5 = input.LA(5);

                                if ( (LA5_5==RULE_INT) ) {
                                    alt5=1;
                                }


                            }


                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalSensorHub.g:753:3: rule__Fog__EdgeDevicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Fog__EdgeDevicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFogAccess().getEdgeDevicesAssignment_4()); 

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
    // $ANTLR end "rule__Fog__Group__4__Impl"


    // $ANTLR start "rule__RaspPi__Group__0"
    // InternalSensorHub.g:762:1: rule__RaspPi__Group__0 : rule__RaspPi__Group__0__Impl rule__RaspPi__Group__1 ;
    public final void rule__RaspPi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:766:1: ( rule__RaspPi__Group__0__Impl rule__RaspPi__Group__1 )
            // InternalSensorHub.g:767:2: rule__RaspPi__Group__0__Impl rule__RaspPi__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RaspPi__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaspPi__Group__1();

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
    // $ANTLR end "rule__RaspPi__Group__0"


    // $ANTLR start "rule__RaspPi__Group__0__Impl"
    // InternalSensorHub.g:774:1: rule__RaspPi__Group__0__Impl : ( () ) ;
    public final void rule__RaspPi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:778:1: ( ( () ) )
            // InternalSensorHub.g:779:1: ( () )
            {
            // InternalSensorHub.g:779:1: ( () )
            // InternalSensorHub.g:780:2: ()
            {
             before(grammarAccess.getRaspPiAccess().getRaspPiAction_0()); 
            // InternalSensorHub.g:781:2: ()
            // InternalSensorHub.g:781:3: 
            {
            }

             after(grammarAccess.getRaspPiAccess().getRaspPiAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaspPi__Group__0__Impl"


    // $ANTLR start "rule__RaspPi__Group__1"
    // InternalSensorHub.g:789:1: rule__RaspPi__Group__1 : rule__RaspPi__Group__1__Impl rule__RaspPi__Group__2 ;
    public final void rule__RaspPi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:793:1: ( rule__RaspPi__Group__1__Impl rule__RaspPi__Group__2 )
            // InternalSensorHub.g:794:2: rule__RaspPi__Group__1__Impl rule__RaspPi__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RaspPi__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaspPi__Group__2();

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
    // $ANTLR end "rule__RaspPi__Group__1"


    // $ANTLR start "rule__RaspPi__Group__1__Impl"
    // InternalSensorHub.g:801:1: rule__RaspPi__Group__1__Impl : ( 'raspberryPi' ) ;
    public final void rule__RaspPi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:805:1: ( ( 'raspberryPi' ) )
            // InternalSensorHub.g:806:1: ( 'raspberryPi' )
            {
            // InternalSensorHub.g:806:1: ( 'raspberryPi' )
            // InternalSensorHub.g:807:2: 'raspberryPi'
            {
             before(grammarAccess.getRaspPiAccess().getRaspberryPiKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRaspPiAccess().getRaspberryPiKeyword_1()); 

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
    // $ANTLR end "rule__RaspPi__Group__1__Impl"


    // $ANTLR start "rule__RaspPi__Group__2"
    // InternalSensorHub.g:816:1: rule__RaspPi__Group__2 : rule__RaspPi__Group__2__Impl rule__RaspPi__Group__3 ;
    public final void rule__RaspPi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:820:1: ( rule__RaspPi__Group__2__Impl rule__RaspPi__Group__3 )
            // InternalSensorHub.g:821:2: rule__RaspPi__Group__2__Impl rule__RaspPi__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RaspPi__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaspPi__Group__3();

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
    // $ANTLR end "rule__RaspPi__Group__2"


    // $ANTLR start "rule__RaspPi__Group__2__Impl"
    // InternalSensorHub.g:828:1: rule__RaspPi__Group__2__Impl : ( ( rule__RaspPi__StorageAssignment_2 )* ) ;
    public final void rule__RaspPi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:832:1: ( ( ( rule__RaspPi__StorageAssignment_2 )* ) )
            // InternalSensorHub.g:833:1: ( ( rule__RaspPi__StorageAssignment_2 )* )
            {
            // InternalSensorHub.g:833:1: ( ( rule__RaspPi__StorageAssignment_2 )* )
            // InternalSensorHub.g:834:2: ( rule__RaspPi__StorageAssignment_2 )*
            {
             before(grammarAccess.getRaspPiAccess().getStorageAssignment_2()); 
            // InternalSensorHub.g:835:2: ( rule__RaspPi__StorageAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSensorHub.g:835:3: rule__RaspPi__StorageAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RaspPi__StorageAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRaspPiAccess().getStorageAssignment_2()); 

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
    // $ANTLR end "rule__RaspPi__Group__2__Impl"


    // $ANTLR start "rule__RaspPi__Group__3"
    // InternalSensorHub.g:843:1: rule__RaspPi__Group__3 : rule__RaspPi__Group__3__Impl ;
    public final void rule__RaspPi__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:847:1: ( rule__RaspPi__Group__3__Impl )
            // InternalSensorHub.g:848:2: rule__RaspPi__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaspPi__Group__3__Impl();

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
    // $ANTLR end "rule__RaspPi__Group__3"


    // $ANTLR start "rule__RaspPi__Group__3__Impl"
    // InternalSensorHub.g:854:1: rule__RaspPi__Group__3__Impl : ( ( rule__RaspPi__VisualizationAssignment_3 )* ) ;
    public final void rule__RaspPi__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:858:1: ( ( ( rule__RaspPi__VisualizationAssignment_3 )* ) )
            // InternalSensorHub.g:859:1: ( ( rule__RaspPi__VisualizationAssignment_3 )* )
            {
            // InternalSensorHub.g:859:1: ( ( rule__RaspPi__VisualizationAssignment_3 )* )
            // InternalSensorHub.g:860:2: ( rule__RaspPi__VisualizationAssignment_3 )*
            {
             before(grammarAccess.getRaspPiAccess().getVisualizationAssignment_3()); 
            // InternalSensorHub.g:861:2: ( rule__RaspPi__VisualizationAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSensorHub.g:861:3: rule__RaspPi__VisualizationAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RaspPi__VisualizationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRaspPiAccess().getVisualizationAssignment_3()); 

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
    // $ANTLR end "rule__RaspPi__Group__3__Impl"


    // $ANTLR start "rule__Storage__Group__0"
    // InternalSensorHub.g:870:1: rule__Storage__Group__0 : rule__Storage__Group__0__Impl rule__Storage__Group__1 ;
    public final void rule__Storage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:874:1: ( rule__Storage__Group__0__Impl rule__Storage__Group__1 )
            // InternalSensorHub.g:875:2: rule__Storage__Group__0__Impl rule__Storage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Storage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Storage__Group__1();

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
    // $ANTLR end "rule__Storage__Group__0"


    // $ANTLR start "rule__Storage__Group__0__Impl"
    // InternalSensorHub.g:882:1: rule__Storage__Group__0__Impl : ( 'storage' ) ;
    public final void rule__Storage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:886:1: ( ( 'storage' ) )
            // InternalSensorHub.g:887:1: ( 'storage' )
            {
            // InternalSensorHub.g:887:1: ( 'storage' )
            // InternalSensorHub.g:888:2: 'storage'
            {
             before(grammarAccess.getStorageAccess().getStorageKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStorageAccess().getStorageKeyword_0()); 

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
    // $ANTLR end "rule__Storage__Group__0__Impl"


    // $ANTLR start "rule__Storage__Group__1"
    // InternalSensorHub.g:897:1: rule__Storage__Group__1 : rule__Storage__Group__1__Impl ;
    public final void rule__Storage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:901:1: ( rule__Storage__Group__1__Impl )
            // InternalSensorHub.g:902:2: rule__Storage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Storage__Group__1__Impl();

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
    // $ANTLR end "rule__Storage__Group__1"


    // $ANTLR start "rule__Storage__Group__1__Impl"
    // InternalSensorHub.g:908:1: rule__Storage__Group__1__Impl : ( ( rule__Storage__TypeAssignment_1 ) ) ;
    public final void rule__Storage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:912:1: ( ( ( rule__Storage__TypeAssignment_1 ) ) )
            // InternalSensorHub.g:913:1: ( ( rule__Storage__TypeAssignment_1 ) )
            {
            // InternalSensorHub.g:913:1: ( ( rule__Storage__TypeAssignment_1 ) )
            // InternalSensorHub.g:914:2: ( rule__Storage__TypeAssignment_1 )
            {
             before(grammarAccess.getStorageAccess().getTypeAssignment_1()); 
            // InternalSensorHub.g:915:2: ( rule__Storage__TypeAssignment_1 )
            // InternalSensorHub.g:915:3: rule__Storage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Storage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStorageAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Storage__Group__1__Impl"


    // $ANTLR start "rule__Visualizer__Group__0"
    // InternalSensorHub.g:924:1: rule__Visualizer__Group__0 : rule__Visualizer__Group__0__Impl rule__Visualizer__Group__1 ;
    public final void rule__Visualizer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:928:1: ( rule__Visualizer__Group__0__Impl rule__Visualizer__Group__1 )
            // InternalSensorHub.g:929:2: rule__Visualizer__Group__0__Impl rule__Visualizer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Visualizer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__1();

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
    // $ANTLR end "rule__Visualizer__Group__0"


    // $ANTLR start "rule__Visualizer__Group__0__Impl"
    // InternalSensorHub.g:936:1: rule__Visualizer__Group__0__Impl : ( 'vis' ) ;
    public final void rule__Visualizer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:940:1: ( ( 'vis' ) )
            // InternalSensorHub.g:941:1: ( 'vis' )
            {
            // InternalSensorHub.g:941:1: ( 'vis' )
            // InternalSensorHub.g:942:2: 'vis'
            {
             before(grammarAccess.getVisualizerAccess().getVisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getVisKeyword_0()); 

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
    // $ANTLR end "rule__Visualizer__Group__0__Impl"


    // $ANTLR start "rule__Visualizer__Group__1"
    // InternalSensorHub.g:951:1: rule__Visualizer__Group__1 : rule__Visualizer__Group__1__Impl ;
    public final void rule__Visualizer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:955:1: ( rule__Visualizer__Group__1__Impl )
            // InternalSensorHub.g:956:2: rule__Visualizer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__1__Impl();

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
    // $ANTLR end "rule__Visualizer__Group__1"


    // $ANTLR start "rule__Visualizer__Group__1__Impl"
    // InternalSensorHub.g:962:1: rule__Visualizer__Group__1__Impl : ( ( rule__Visualizer__TypeAssignment_1 ) ) ;
    public final void rule__Visualizer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:966:1: ( ( ( rule__Visualizer__TypeAssignment_1 ) ) )
            // InternalSensorHub.g:967:1: ( ( rule__Visualizer__TypeAssignment_1 ) )
            {
            // InternalSensorHub.g:967:1: ( ( rule__Visualizer__TypeAssignment_1 ) )
            // InternalSensorHub.g:968:2: ( rule__Visualizer__TypeAssignment_1 )
            {
             before(grammarAccess.getVisualizerAccess().getTypeAssignment_1()); 
            // InternalSensorHub.g:969:2: ( rule__Visualizer__TypeAssignment_1 )
            // InternalSensorHub.g:969:3: rule__Visualizer__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Visualizer__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__0"
    // InternalSensorHub.g:978:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:982:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // InternalSensorHub.g:983:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Edge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__1();

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
    // $ANTLR end "rule__Edge__Group__0"


    // $ANTLR start "rule__Edge__Group__0__Impl"
    // InternalSensorHub.g:990:1: rule__Edge__Group__0__Impl : ( 'edge' ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:994:1: ( ( 'edge' ) )
            // InternalSensorHub.g:995:1: ( 'edge' )
            {
            // InternalSensorHub.g:995:1: ( 'edge' )
            // InternalSensorHub.g:996:2: 'edge'
            {
             before(grammarAccess.getEdgeAccess().getEdgeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getEdgeKeyword_0()); 

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
    // $ANTLR end "rule__Edge__Group__0__Impl"


    // $ANTLR start "rule__Edge__Group__1"
    // InternalSensorHub.g:1005:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1009:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // InternalSensorHub.g:1010:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Edge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__2();

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
    // $ANTLR end "rule__Edge__Group__1"


    // $ANTLR start "rule__Edge__Group__1__Impl"
    // InternalSensorHub.g:1017:1: rule__Edge__Group__1__Impl : ( ( rule__Edge__NameAssignment_1 ) ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1021:1: ( ( ( rule__Edge__NameAssignment_1 ) ) )
            // InternalSensorHub.g:1022:1: ( ( rule__Edge__NameAssignment_1 ) )
            {
            // InternalSensorHub.g:1022:1: ( ( rule__Edge__NameAssignment_1 ) )
            // InternalSensorHub.g:1023:2: ( rule__Edge__NameAssignment_1 )
            {
             before(grammarAccess.getEdgeAccess().getNameAssignment_1()); 
            // InternalSensorHub.g:1024:2: ( rule__Edge__NameAssignment_1 )
            // InternalSensorHub.g:1024:3: rule__Edge__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Edge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Edge__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__2"
    // InternalSensorHub.g:1032:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1036:1: ( rule__Edge__Group__2__Impl )
            // InternalSensorHub.g:1037:2: rule__Edge__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__2__Impl();

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
    // $ANTLR end "rule__Edge__Group__2"


    // $ANTLR start "rule__Edge__Group__2__Impl"
    // InternalSensorHub.g:1043:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__DeviceAssignment_2 ) ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1047:1: ( ( ( rule__Edge__DeviceAssignment_2 ) ) )
            // InternalSensorHub.g:1048:1: ( ( rule__Edge__DeviceAssignment_2 ) )
            {
            // InternalSensorHub.g:1048:1: ( ( rule__Edge__DeviceAssignment_2 ) )
            // InternalSensorHub.g:1049:2: ( rule__Edge__DeviceAssignment_2 )
            {
             before(grammarAccess.getEdgeAccess().getDeviceAssignment_2()); 
            // InternalSensorHub.g:1050:2: ( rule__Edge__DeviceAssignment_2 )
            // InternalSensorHub.g:1050:3: rule__Edge__DeviceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Edge__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getDeviceAssignment_2()); 

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
    // $ANTLR end "rule__Edge__Group__2__Impl"


    // $ANTLR start "rule__Arduino__Group__0"
    // InternalSensorHub.g:1059:1: rule__Arduino__Group__0 : rule__Arduino__Group__0__Impl rule__Arduino__Group__1 ;
    public final void rule__Arduino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1063:1: ( rule__Arduino__Group__0__Impl rule__Arduino__Group__1 )
            // InternalSensorHub.g:1064:2: rule__Arduino__Group__0__Impl rule__Arduino__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Arduino__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arduino__Group__1();

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
    // $ANTLR end "rule__Arduino__Group__0"


    // $ANTLR start "rule__Arduino__Group__0__Impl"
    // InternalSensorHub.g:1071:1: rule__Arduino__Group__0__Impl : ( 'arduino' ) ;
    public final void rule__Arduino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1075:1: ( ( 'arduino' ) )
            // InternalSensorHub.g:1076:1: ( 'arduino' )
            {
            // InternalSensorHub.g:1076:1: ( 'arduino' )
            // InternalSensorHub.g:1077:2: 'arduino'
            {
             before(grammarAccess.getArduinoAccess().getArduinoKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArduinoAccess().getArduinoKeyword_0()); 

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
    // $ANTLR end "rule__Arduino__Group__0__Impl"


    // $ANTLR start "rule__Arduino__Group__1"
    // InternalSensorHub.g:1086:1: rule__Arduino__Group__1 : rule__Arduino__Group__1__Impl rule__Arduino__Group__2 ;
    public final void rule__Arduino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1090:1: ( rule__Arduino__Group__1__Impl rule__Arduino__Group__2 )
            // InternalSensorHub.g:1091:2: rule__Arduino__Group__1__Impl rule__Arduino__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Arduino__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arduino__Group__2();

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
    // $ANTLR end "rule__Arduino__Group__1"


    // $ANTLR start "rule__Arduino__Group__1__Impl"
    // InternalSensorHub.g:1098:1: rule__Arduino__Group__1__Impl : ( 'rate' ) ;
    public final void rule__Arduino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1102:1: ( ( 'rate' ) )
            // InternalSensorHub.g:1103:1: ( 'rate' )
            {
            // InternalSensorHub.g:1103:1: ( 'rate' )
            // InternalSensorHub.g:1104:2: 'rate'
            {
             before(grammarAccess.getArduinoAccess().getRateKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArduinoAccess().getRateKeyword_1()); 

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
    // $ANTLR end "rule__Arduino__Group__1__Impl"


    // $ANTLR start "rule__Arduino__Group__2"
    // InternalSensorHub.g:1113:1: rule__Arduino__Group__2 : rule__Arduino__Group__2__Impl rule__Arduino__Group__3 ;
    public final void rule__Arduino__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1117:1: ( rule__Arduino__Group__2__Impl rule__Arduino__Group__3 )
            // InternalSensorHub.g:1118:2: rule__Arduino__Group__2__Impl rule__Arduino__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Arduino__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arduino__Group__3();

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
    // $ANTLR end "rule__Arduino__Group__2"


    // $ANTLR start "rule__Arduino__Group__2__Impl"
    // InternalSensorHub.g:1125:1: rule__Arduino__Group__2__Impl : ( ( rule__Arduino__RateAssignment_2 ) ) ;
    public final void rule__Arduino__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1129:1: ( ( ( rule__Arduino__RateAssignment_2 ) ) )
            // InternalSensorHub.g:1130:1: ( ( rule__Arduino__RateAssignment_2 ) )
            {
            // InternalSensorHub.g:1130:1: ( ( rule__Arduino__RateAssignment_2 ) )
            // InternalSensorHub.g:1131:2: ( rule__Arduino__RateAssignment_2 )
            {
             before(grammarAccess.getArduinoAccess().getRateAssignment_2()); 
            // InternalSensorHub.g:1132:2: ( rule__Arduino__RateAssignment_2 )
            // InternalSensorHub.g:1132:3: rule__Arduino__RateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Arduino__RateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArduinoAccess().getRateAssignment_2()); 

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
    // $ANTLR end "rule__Arduino__Group__2__Impl"


    // $ANTLR start "rule__Arduino__Group__3"
    // InternalSensorHub.g:1140:1: rule__Arduino__Group__3 : rule__Arduino__Group__3__Impl ;
    public final void rule__Arduino__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1144:1: ( rule__Arduino__Group__3__Impl )
            // InternalSensorHub.g:1145:2: rule__Arduino__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arduino__Group__3__Impl();

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
    // $ANTLR end "rule__Arduino__Group__3"


    // $ANTLR start "rule__Arduino__Group__3__Impl"
    // InternalSensorHub.g:1151:1: rule__Arduino__Group__3__Impl : ( ( rule__Arduino__SensorsAssignment_3 )* ) ;
    public final void rule__Arduino__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1155:1: ( ( ( rule__Arduino__SensorsAssignment_3 )* ) )
            // InternalSensorHub.g:1156:1: ( ( rule__Arduino__SensorsAssignment_3 )* )
            {
            // InternalSensorHub.g:1156:1: ( ( rule__Arduino__SensorsAssignment_3 )* )
            // InternalSensorHub.g:1157:2: ( rule__Arduino__SensorsAssignment_3 )*
            {
             before(grammarAccess.getArduinoAccess().getSensorsAssignment_3()); 
            // InternalSensorHub.g:1158:2: ( rule__Arduino__SensorsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSensorHub.g:1158:3: rule__Arduino__SensorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Arduino__SensorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getArduinoAccess().getSensorsAssignment_3()); 

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
    // $ANTLR end "rule__Arduino__Group__3__Impl"


    // $ANTLR start "rule__Com__Group__0"
    // InternalSensorHub.g:1167:1: rule__Com__Group__0 : rule__Com__Group__0__Impl rule__Com__Group__1 ;
    public final void rule__Com__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1171:1: ( rule__Com__Group__0__Impl rule__Com__Group__1 )
            // InternalSensorHub.g:1172:2: rule__Com__Group__0__Impl rule__Com__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Com__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Com__Group__1();

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
    // $ANTLR end "rule__Com__Group__0"


    // $ANTLR start "rule__Com__Group__0__Impl"
    // InternalSensorHub.g:1179:1: rule__Com__Group__0__Impl : ( 'com' ) ;
    public final void rule__Com__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1183:1: ( ( 'com' ) )
            // InternalSensorHub.g:1184:1: ( 'com' )
            {
            // InternalSensorHub.g:1184:1: ( 'com' )
            // InternalSensorHub.g:1185:2: 'com'
            {
             before(grammarAccess.getComAccess().getComKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComAccess().getComKeyword_0()); 

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
    // $ANTLR end "rule__Com__Group__0__Impl"


    // $ANTLR start "rule__Com__Group__1"
    // InternalSensorHub.g:1194:1: rule__Com__Group__1 : rule__Com__Group__1__Impl ;
    public final void rule__Com__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1198:1: ( rule__Com__Group__1__Impl )
            // InternalSensorHub.g:1199:2: rule__Com__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Com__Group__1__Impl();

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
    // $ANTLR end "rule__Com__Group__1"


    // $ANTLR start "rule__Com__Group__1__Impl"
    // InternalSensorHub.g:1205:1: rule__Com__Group__1__Impl : ( ruleNrf24l01 ) ;
    public final void rule__Com__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1209:1: ( ( ruleNrf24l01 ) )
            // InternalSensorHub.g:1210:1: ( ruleNrf24l01 )
            {
            // InternalSensorHub.g:1210:1: ( ruleNrf24l01 )
            // InternalSensorHub.g:1211:2: ruleNrf24l01
            {
             before(grammarAccess.getComAccess().getNrf24l01ParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleNrf24l01();

            state._fsp--;

             after(grammarAccess.getComAccess().getNrf24l01ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Com__Group__1__Impl"


    // $ANTLR start "rule__Nrf24l01__Group__0"
    // InternalSensorHub.g:1221:1: rule__Nrf24l01__Group__0 : rule__Nrf24l01__Group__0__Impl rule__Nrf24l01__Group__1 ;
    public final void rule__Nrf24l01__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1225:1: ( rule__Nrf24l01__Group__0__Impl rule__Nrf24l01__Group__1 )
            // InternalSensorHub.g:1226:2: rule__Nrf24l01__Group__0__Impl rule__Nrf24l01__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Nrf24l01__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nrf24l01__Group__1();

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
    // $ANTLR end "rule__Nrf24l01__Group__0"


    // $ANTLR start "rule__Nrf24l01__Group__0__Impl"
    // InternalSensorHub.g:1233:1: rule__Nrf24l01__Group__0__Impl : ( 'nrf24l01' ) ;
    public final void rule__Nrf24l01__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1237:1: ( ( 'nrf24l01' ) )
            // InternalSensorHub.g:1238:1: ( 'nrf24l01' )
            {
            // InternalSensorHub.g:1238:1: ( 'nrf24l01' )
            // InternalSensorHub.g:1239:2: 'nrf24l01'
            {
             before(grammarAccess.getNrf24l01Access().getNrf24l01Keyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNrf24l01Access().getNrf24l01Keyword_0()); 

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
    // $ANTLR end "rule__Nrf24l01__Group__0__Impl"


    // $ANTLR start "rule__Nrf24l01__Group__1"
    // InternalSensorHub.g:1248:1: rule__Nrf24l01__Group__1 : rule__Nrf24l01__Group__1__Impl ;
    public final void rule__Nrf24l01__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1252:1: ( rule__Nrf24l01__Group__1__Impl )
            // InternalSensorHub.g:1253:2: rule__Nrf24l01__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nrf24l01__Group__1__Impl();

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
    // $ANTLR end "rule__Nrf24l01__Group__1"


    // $ANTLR start "rule__Nrf24l01__Group__1__Impl"
    // InternalSensorHub.g:1259:1: rule__Nrf24l01__Group__1__Impl : ( ( rule__Nrf24l01__TimeoutAssignment_1 ) ) ;
    public final void rule__Nrf24l01__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1263:1: ( ( ( rule__Nrf24l01__TimeoutAssignment_1 ) ) )
            // InternalSensorHub.g:1264:1: ( ( rule__Nrf24l01__TimeoutAssignment_1 ) )
            {
            // InternalSensorHub.g:1264:1: ( ( rule__Nrf24l01__TimeoutAssignment_1 ) )
            // InternalSensorHub.g:1265:2: ( rule__Nrf24l01__TimeoutAssignment_1 )
            {
             before(grammarAccess.getNrf24l01Access().getTimeoutAssignment_1()); 
            // InternalSensorHub.g:1266:2: ( rule__Nrf24l01__TimeoutAssignment_1 )
            // InternalSensorHub.g:1266:3: rule__Nrf24l01__TimeoutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nrf24l01__TimeoutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNrf24l01Access().getTimeoutAssignment_1()); 

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
    // $ANTLR end "rule__Nrf24l01__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSensorHub.g:1275:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1279:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSensorHub.g:1280:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSensorHub.g:1287:1: rule__Sensor__Group__0__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1291:1: ( ( 'sensor' ) )
            // InternalSensorHub.g:1292:1: ( 'sensor' )
            {
            // InternalSensorHub.g:1292:1: ( 'sensor' )
            // InternalSensorHub.g:1293:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

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
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSensorHub.g:1302:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1306:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSensorHub.g:1307:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSensorHub.g:1314:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__Alternatives_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1318:1: ( ( ( rule__Sensor__Alternatives_1 ) ) )
            // InternalSensorHub.g:1319:1: ( ( rule__Sensor__Alternatives_1 ) )
            {
            // InternalSensorHub.g:1319:1: ( ( rule__Sensor__Alternatives_1 ) )
            // InternalSensorHub.g:1320:2: ( rule__Sensor__Alternatives_1 )
            {
             before(grammarAccess.getSensorAccess().getAlternatives_1()); 
            // InternalSensorHub.g:1321:2: ( rule__Sensor__Alternatives_1 )
            // InternalSensorHub.g:1321:3: rule__Sensor__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalSensorHub.g:1329:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1333:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSensorHub.g:1334:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

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
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalSensorHub.g:1341:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__Group_2__0 )? ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1345:1: ( ( ( rule__Sensor__Group_2__0 )? ) )
            // InternalSensorHub.g:1346:1: ( ( rule__Sensor__Group_2__0 )? )
            {
            // InternalSensorHub.g:1346:1: ( ( rule__Sensor__Group_2__0 )? )
            // InternalSensorHub.g:1347:2: ( rule__Sensor__Group_2__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_2()); 
            // InternalSensorHub.g:1348:2: ( rule__Sensor__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensorHub.g:1348:3: rule__Sensor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalSensorHub.g:1356:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1360:1: ( rule__Sensor__Group__3__Impl )
            // InternalSensorHub.g:1361:2: rule__Sensor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3__Impl();

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
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalSensorHub.g:1367:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__PreprocessorAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1371:1: ( ( ( rule__Sensor__PreprocessorAssignment_3 ) ) )
            // InternalSensorHub.g:1372:1: ( ( rule__Sensor__PreprocessorAssignment_3 ) )
            {
            // InternalSensorHub.g:1372:1: ( ( rule__Sensor__PreprocessorAssignment_3 ) )
            // InternalSensorHub.g:1373:2: ( rule__Sensor__PreprocessorAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getPreprocessorAssignment_3()); 
            // InternalSensorHub.g:1374:2: ( rule__Sensor__PreprocessorAssignment_3 )
            // InternalSensorHub.g:1374:3: rule__Sensor__PreprocessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__PreprocessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getPreprocessorAssignment_3()); 

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
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group_2__0"
    // InternalSensorHub.g:1383:1: rule__Sensor__Group_2__0 : rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 ;
    public final void rule__Sensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1387:1: ( rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 )
            // InternalSensorHub.g:1388:2: rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__1();

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
    // $ANTLR end "rule__Sensor__Group_2__0"


    // $ANTLR start "rule__Sensor__Group_2__0__Impl"
    // InternalSensorHub.g:1395:1: rule__Sensor__Group_2__0__Impl : ( 'rate' ) ;
    public final void rule__Sensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1399:1: ( ( 'rate' ) )
            // InternalSensorHub.g:1400:1: ( 'rate' )
            {
            // InternalSensorHub.g:1400:1: ( 'rate' )
            // InternalSensorHub.g:1401:2: 'rate'
            {
             before(grammarAccess.getSensorAccess().getRateKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRateKeyword_2_0()); 

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
    // $ANTLR end "rule__Sensor__Group_2__0__Impl"


    // $ANTLR start "rule__Sensor__Group_2__1"
    // InternalSensorHub.g:1410:1: rule__Sensor__Group_2__1 : rule__Sensor__Group_2__1__Impl ;
    public final void rule__Sensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1414:1: ( rule__Sensor__Group_2__1__Impl )
            // InternalSensorHub.g:1415:2: rule__Sensor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_2__1"


    // $ANTLR start "rule__Sensor__Group_2__1__Impl"
    // InternalSensorHub.g:1421:1: rule__Sensor__Group_2__1__Impl : ( ( rule__Sensor__RateAssignment_2_1 ) ) ;
    public final void rule__Sensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1425:1: ( ( ( rule__Sensor__RateAssignment_2_1 ) ) )
            // InternalSensorHub.g:1426:1: ( ( rule__Sensor__RateAssignment_2_1 ) )
            {
            // InternalSensorHub.g:1426:1: ( ( rule__Sensor__RateAssignment_2_1 ) )
            // InternalSensorHub.g:1427:2: ( rule__Sensor__RateAssignment_2_1 )
            {
             before(grammarAccess.getSensorAccess().getRateAssignment_2_1()); 
            // InternalSensorHub.g:1428:2: ( rule__Sensor__RateAssignment_2_1 )
            // InternalSensorHub.g:1428:3: rule__Sensor__RateAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__RateAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getRateAssignment_2_1()); 

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
    // $ANTLR end "rule__Sensor__Group_2__1__Impl"


    // $ANTLR start "rule__Water_level__Group__0"
    // InternalSensorHub.g:1437:1: rule__Water_level__Group__0 : rule__Water_level__Group__0__Impl rule__Water_level__Group__1 ;
    public final void rule__Water_level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1441:1: ( rule__Water_level__Group__0__Impl rule__Water_level__Group__1 )
            // InternalSensorHub.g:1442:2: rule__Water_level__Group__0__Impl rule__Water_level__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Water_level__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Water_level__Group__1();

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
    // $ANTLR end "rule__Water_level__Group__0"


    // $ANTLR start "rule__Water_level__Group__0__Impl"
    // InternalSensorHub.g:1449:1: rule__Water_level__Group__0__Impl : ( 'water' ) ;
    public final void rule__Water_level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1453:1: ( ( 'water' ) )
            // InternalSensorHub.g:1454:1: ( 'water' )
            {
            // InternalSensorHub.g:1454:1: ( 'water' )
            // InternalSensorHub.g:1455:2: 'water'
            {
             before(grammarAccess.getWater_levelAccess().getWaterKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWater_levelAccess().getWaterKeyword_0()); 

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
    // $ANTLR end "rule__Water_level__Group__0__Impl"


    // $ANTLR start "rule__Water_level__Group__1"
    // InternalSensorHub.g:1464:1: rule__Water_level__Group__1 : rule__Water_level__Group__1__Impl ;
    public final void rule__Water_level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1468:1: ( rule__Water_level__Group__1__Impl )
            // InternalSensorHub.g:1469:2: rule__Water_level__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Water_level__Group__1__Impl();

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
    // $ANTLR end "rule__Water_level__Group__1"


    // $ANTLR start "rule__Water_level__Group__1__Impl"
    // InternalSensorHub.g:1475:1: rule__Water_level__Group__1__Impl : ( ( rule__Water_level__NameAssignment_1 ) ) ;
    public final void rule__Water_level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1479:1: ( ( ( rule__Water_level__NameAssignment_1 ) ) )
            // InternalSensorHub.g:1480:1: ( ( rule__Water_level__NameAssignment_1 ) )
            {
            // InternalSensorHub.g:1480:1: ( ( rule__Water_level__NameAssignment_1 ) )
            // InternalSensorHub.g:1481:2: ( rule__Water_level__NameAssignment_1 )
            {
             before(grammarAccess.getWater_levelAccess().getNameAssignment_1()); 
            // InternalSensorHub.g:1482:2: ( rule__Water_level__NameAssignment_1 )
            // InternalSensorHub.g:1482:3: rule__Water_level__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Water_level__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWater_levelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Water_level__Group__1__Impl"


    // $ANTLR start "rule__Sr04__Group__0"
    // InternalSensorHub.g:1491:1: rule__Sr04__Group__0 : rule__Sr04__Group__0__Impl rule__Sr04__Group__1 ;
    public final void rule__Sr04__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1495:1: ( rule__Sr04__Group__0__Impl rule__Sr04__Group__1 )
            // InternalSensorHub.g:1496:2: rule__Sr04__Group__0__Impl rule__Sr04__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sr04__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sr04__Group__1();

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
    // $ANTLR end "rule__Sr04__Group__0"


    // $ANTLR start "rule__Sr04__Group__0__Impl"
    // InternalSensorHub.g:1503:1: rule__Sr04__Group__0__Impl : ( 'sr04' ) ;
    public final void rule__Sr04__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1507:1: ( ( 'sr04' ) )
            // InternalSensorHub.g:1508:1: ( 'sr04' )
            {
            // InternalSensorHub.g:1508:1: ( 'sr04' )
            // InternalSensorHub.g:1509:2: 'sr04'
            {
             before(grammarAccess.getSr04Access().getSr04Keyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSr04Access().getSr04Keyword_0()); 

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
    // $ANTLR end "rule__Sr04__Group__0__Impl"


    // $ANTLR start "rule__Sr04__Group__1"
    // InternalSensorHub.g:1518:1: rule__Sr04__Group__1 : rule__Sr04__Group__1__Impl ;
    public final void rule__Sr04__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1522:1: ( rule__Sr04__Group__1__Impl )
            // InternalSensorHub.g:1523:2: rule__Sr04__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sr04__Group__1__Impl();

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
    // $ANTLR end "rule__Sr04__Group__1"


    // $ANTLR start "rule__Sr04__Group__1__Impl"
    // InternalSensorHub.g:1529:1: rule__Sr04__Group__1__Impl : ( ( rule__Sr04__NameAssignment_1 ) ) ;
    public final void rule__Sr04__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1533:1: ( ( ( rule__Sr04__NameAssignment_1 ) ) )
            // InternalSensorHub.g:1534:1: ( ( rule__Sr04__NameAssignment_1 ) )
            {
            // InternalSensorHub.g:1534:1: ( ( rule__Sr04__NameAssignment_1 ) )
            // InternalSensorHub.g:1535:2: ( rule__Sr04__NameAssignment_1 )
            {
             before(grammarAccess.getSr04Access().getNameAssignment_1()); 
            // InternalSensorHub.g:1536:2: ( rule__Sr04__NameAssignment_1 )
            // InternalSensorHub.g:1536:3: rule__Sr04__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sr04__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSr04Access().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sr04__Group__1__Impl"


    // $ANTLR start "rule__Sound__Group__0"
    // InternalSensorHub.g:1545:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1549:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalSensorHub.g:1550:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__1();

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
    // $ANTLR end "rule__Sound__Group__0"


    // $ANTLR start "rule__Sound__Group__0__Impl"
    // InternalSensorHub.g:1557:1: rule__Sound__Group__0__Impl : ( 'sound' ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1561:1: ( ( 'sound' ) )
            // InternalSensorHub.g:1562:1: ( 'sound' )
            {
            // InternalSensorHub.g:1562:1: ( 'sound' )
            // InternalSensorHub.g:1563:2: 'sound'
            {
             before(grammarAccess.getSoundAccess().getSoundKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getSoundKeyword_0()); 

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
    // $ANTLR end "rule__Sound__Group__0__Impl"


    // $ANTLR start "rule__Sound__Group__1"
    // InternalSensorHub.g:1572:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1576:1: ( rule__Sound__Group__1__Impl )
            // InternalSensorHub.g:1577:2: rule__Sound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__1__Impl();

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
    // $ANTLR end "rule__Sound__Group__1"


    // $ANTLR start "rule__Sound__Group__1__Impl"
    // InternalSensorHub.g:1583:1: rule__Sound__Group__1__Impl : ( ( rule__Sound__NameAssignment_1 ) ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1587:1: ( ( ( rule__Sound__NameAssignment_1 ) ) )
            // InternalSensorHub.g:1588:1: ( ( rule__Sound__NameAssignment_1 ) )
            {
            // InternalSensorHub.g:1588:1: ( ( rule__Sound__NameAssignment_1 ) )
            // InternalSensorHub.g:1589:2: ( rule__Sound__NameAssignment_1 )
            {
             before(grammarAccess.getSoundAccess().getNameAssignment_1()); 
            // InternalSensorHub.g:1590:2: ( rule__Sound__NameAssignment_1 )
            // InternalSensorHub.g:1590:3: rule__Sound__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sound__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sound__Group__1__Impl"


    // $ANTLR start "rule__Average__Group__0"
    // InternalSensorHub.g:1599:1: rule__Average__Group__0 : rule__Average__Group__0__Impl rule__Average__Group__1 ;
    public final void rule__Average__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1603:1: ( rule__Average__Group__0__Impl rule__Average__Group__1 )
            // InternalSensorHub.g:1604:2: rule__Average__Group__0__Impl rule__Average__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Average__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Average__Group__1();

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
    // $ANTLR end "rule__Average__Group__0"


    // $ANTLR start "rule__Average__Group__0__Impl"
    // InternalSensorHub.g:1611:1: rule__Average__Group__0__Impl : ( 'avg' ) ;
    public final void rule__Average__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1615:1: ( ( 'avg' ) )
            // InternalSensorHub.g:1616:1: ( 'avg' )
            {
            // InternalSensorHub.g:1616:1: ( 'avg' )
            // InternalSensorHub.g:1617:2: 'avg'
            {
             before(grammarAccess.getAverageAccess().getAvgKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAverageAccess().getAvgKeyword_0()); 

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
    // $ANTLR end "rule__Average__Group__0__Impl"


    // $ANTLR start "rule__Average__Group__1"
    // InternalSensorHub.g:1626:1: rule__Average__Group__1 : rule__Average__Group__1__Impl ;
    public final void rule__Average__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1630:1: ( rule__Average__Group__1__Impl )
            // InternalSensorHub.g:1631:2: rule__Average__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Average__Group__1__Impl();

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
    // $ANTLR end "rule__Average__Group__1"


    // $ANTLR start "rule__Average__Group__1__Impl"
    // InternalSensorHub.g:1637:1: rule__Average__Group__1__Impl : ( ( rule__Average__ValueAssignment_1 ) ) ;
    public final void rule__Average__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1641:1: ( ( ( rule__Average__ValueAssignment_1 ) ) )
            // InternalSensorHub.g:1642:1: ( ( rule__Average__ValueAssignment_1 ) )
            {
            // InternalSensorHub.g:1642:1: ( ( rule__Average__ValueAssignment_1 ) )
            // InternalSensorHub.g:1643:2: ( rule__Average__ValueAssignment_1 )
            {
             before(grammarAccess.getAverageAccess().getValueAssignment_1()); 
            // InternalSensorHub.g:1644:2: ( rule__Average__ValueAssignment_1 )
            // InternalSensorHub.g:1644:3: rule__Average__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Average__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAverageAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Average__Group__1__Impl"


    // $ANTLR start "rule__Threshold__Group__0"
    // InternalSensorHub.g:1653:1: rule__Threshold__Group__0 : rule__Threshold__Group__0__Impl rule__Threshold__Group__1 ;
    public final void rule__Threshold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1657:1: ( rule__Threshold__Group__0__Impl rule__Threshold__Group__1 )
            // InternalSensorHub.g:1658:2: rule__Threshold__Group__0__Impl rule__Threshold__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Threshold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__1();

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
    // $ANTLR end "rule__Threshold__Group__0"


    // $ANTLR start "rule__Threshold__Group__0__Impl"
    // InternalSensorHub.g:1665:1: rule__Threshold__Group__0__Impl : ( 'thresh' ) ;
    public final void rule__Threshold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1669:1: ( ( 'thresh' ) )
            // InternalSensorHub.g:1670:1: ( 'thresh' )
            {
            // InternalSensorHub.g:1670:1: ( 'thresh' )
            // InternalSensorHub.g:1671:2: 'thresh'
            {
             before(grammarAccess.getThresholdAccess().getThreshKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getThreshKeyword_0()); 

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
    // $ANTLR end "rule__Threshold__Group__0__Impl"


    // $ANTLR start "rule__Threshold__Group__1"
    // InternalSensorHub.g:1680:1: rule__Threshold__Group__1 : rule__Threshold__Group__1__Impl rule__Threshold__Group__2 ;
    public final void rule__Threshold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1684:1: ( rule__Threshold__Group__1__Impl rule__Threshold__Group__2 )
            // InternalSensorHub.g:1685:2: rule__Threshold__Group__1__Impl rule__Threshold__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Threshold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__2();

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
    // $ANTLR end "rule__Threshold__Group__1"


    // $ANTLR start "rule__Threshold__Group__1__Impl"
    // InternalSensorHub.g:1692:1: rule__Threshold__Group__1__Impl : ( ( rule__Threshold__MinAssignment_1 ) ) ;
    public final void rule__Threshold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1696:1: ( ( ( rule__Threshold__MinAssignment_1 ) ) )
            // InternalSensorHub.g:1697:1: ( ( rule__Threshold__MinAssignment_1 ) )
            {
            // InternalSensorHub.g:1697:1: ( ( rule__Threshold__MinAssignment_1 ) )
            // InternalSensorHub.g:1698:2: ( rule__Threshold__MinAssignment_1 )
            {
             before(grammarAccess.getThresholdAccess().getMinAssignment_1()); 
            // InternalSensorHub.g:1699:2: ( rule__Threshold__MinAssignment_1 )
            // InternalSensorHub.g:1699:3: rule__Threshold__MinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getMinAssignment_1()); 

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
    // $ANTLR end "rule__Threshold__Group__1__Impl"


    // $ANTLR start "rule__Threshold__Group__2"
    // InternalSensorHub.g:1707:1: rule__Threshold__Group__2 : rule__Threshold__Group__2__Impl rule__Threshold__Group__3 ;
    public final void rule__Threshold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1711:1: ( rule__Threshold__Group__2__Impl rule__Threshold__Group__3 )
            // InternalSensorHub.g:1712:2: rule__Threshold__Group__2__Impl rule__Threshold__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Threshold__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__3();

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
    // $ANTLR end "rule__Threshold__Group__2"


    // $ANTLR start "rule__Threshold__Group__2__Impl"
    // InternalSensorHub.g:1719:1: rule__Threshold__Group__2__Impl : ( '..' ) ;
    public final void rule__Threshold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1723:1: ( ( '..' ) )
            // InternalSensorHub.g:1724:1: ( '..' )
            {
            // InternalSensorHub.g:1724:1: ( '..' )
            // InternalSensorHub.g:1725:2: '..'
            {
             before(grammarAccess.getThresholdAccess().getFullStopFullStopKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getFullStopFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Threshold__Group__2__Impl"


    // $ANTLR start "rule__Threshold__Group__3"
    // InternalSensorHub.g:1734:1: rule__Threshold__Group__3 : rule__Threshold__Group__3__Impl ;
    public final void rule__Threshold__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1738:1: ( rule__Threshold__Group__3__Impl )
            // InternalSensorHub.g:1739:2: rule__Threshold__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Group__3__Impl();

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
    // $ANTLR end "rule__Threshold__Group__3"


    // $ANTLR start "rule__Threshold__Group__3__Impl"
    // InternalSensorHub.g:1745:1: rule__Threshold__Group__3__Impl : ( ( rule__Threshold__MaxAssignment_3 ) ) ;
    public final void rule__Threshold__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1749:1: ( ( ( rule__Threshold__MaxAssignment_3 ) ) )
            // InternalSensorHub.g:1750:1: ( ( rule__Threshold__MaxAssignment_3 ) )
            {
            // InternalSensorHub.g:1750:1: ( ( rule__Threshold__MaxAssignment_3 ) )
            // InternalSensorHub.g:1751:2: ( rule__Threshold__MaxAssignment_3 )
            {
             before(grammarAccess.getThresholdAccess().getMaxAssignment_3()); 
            // InternalSensorHub.g:1752:2: ( rule__Threshold__MaxAssignment_3 )
            // InternalSensorHub.g:1752:3: rule__Threshold__MaxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__MaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getMaxAssignment_3()); 

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
    // $ANTLR end "rule__Threshold__Group__3__Impl"


    // $ANTLR start "rule__SensorSystem__NameAssignment_1"
    // InternalSensorHub.g:1761:1: rule__SensorSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1765:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:1766:2: ( RULE_ID )
            {
            // InternalSensorHub.g:1766:2: ( RULE_ID )
            // InternalSensorHub.g:1767:3: RULE_ID
            {
             before(grammarAccess.getSensorSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SensorSystem__NameAssignment_1"


    // $ANTLR start "rule__SensorSystem__DevicesAssignment_2"
    // InternalSensorHub.g:1776:1: rule__SensorSystem__DevicesAssignment_2 : ( ruleDevice ) ;
    public final void rule__SensorSystem__DevicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1780:1: ( ( ruleDevice ) )
            // InternalSensorHub.g:1781:2: ( ruleDevice )
            {
            // InternalSensorHub.g:1781:2: ( ruleDevice )
            // InternalSensorHub.g:1782:3: ruleDevice
            {
             before(grammarAccess.getSensorSystemAccess().getDevicesDeviceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getSensorSystemAccess().getDevicesDeviceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SensorSystem__DevicesAssignment_2"


    // $ANTLR start "rule__Fog__NameAssignment_1"
    // InternalSensorHub.g:1791:1: rule__Fog__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1795:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:1796:2: ( RULE_ID )
            {
            // InternalSensorHub.g:1796:2: ( RULE_ID )
            // InternalSensorHub.g:1797:3: RULE_ID
            {
             before(grammarAccess.getFogAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFogAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fog__NameAssignment_1"


    // $ANTLR start "rule__Fog__ComsAssignment_2"
    // InternalSensorHub.g:1806:1: rule__Fog__ComsAssignment_2 : ( ruleCom ) ;
    public final void rule__Fog__ComsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1810:1: ( ( ruleCom ) )
            // InternalSensorHub.g:1811:2: ( ruleCom )
            {
            // InternalSensorHub.g:1811:2: ( ruleCom )
            // InternalSensorHub.g:1812:3: ruleCom
            {
             before(grammarAccess.getFogAccess().getComsComParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCom();

            state._fsp--;

             after(grammarAccess.getFogAccess().getComsComParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Fog__ComsAssignment_2"


    // $ANTLR start "rule__Fog__DeviceAssignment_3"
    // InternalSensorHub.g:1821:1: rule__Fog__DeviceAssignment_3 : ( ruleRaspPi ) ;
    public final void rule__Fog__DeviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1825:1: ( ( ruleRaspPi ) )
            // InternalSensorHub.g:1826:2: ( ruleRaspPi )
            {
            // InternalSensorHub.g:1826:2: ( ruleRaspPi )
            // InternalSensorHub.g:1827:3: ruleRaspPi
            {
             before(grammarAccess.getFogAccess().getDeviceRaspPiParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRaspPi();

            state._fsp--;

             after(grammarAccess.getFogAccess().getDeviceRaspPiParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fog__DeviceAssignment_3"


    // $ANTLR start "rule__Fog__EdgeDevicesAssignment_4"
    // InternalSensorHub.g:1836:1: rule__Fog__EdgeDevicesAssignment_4 : ( ruleEdge ) ;
    public final void rule__Fog__EdgeDevicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1840:1: ( ( ruleEdge ) )
            // InternalSensorHub.g:1841:2: ( ruleEdge )
            {
            // InternalSensorHub.g:1841:2: ( ruleEdge )
            // InternalSensorHub.g:1842:3: ruleEdge
            {
             before(grammarAccess.getFogAccess().getEdgeDevicesEdgeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getFogAccess().getEdgeDevicesEdgeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Fog__EdgeDevicesAssignment_4"


    // $ANTLR start "rule__RaspPi__StorageAssignment_2"
    // InternalSensorHub.g:1851:1: rule__RaspPi__StorageAssignment_2 : ( ruleStorage ) ;
    public final void rule__RaspPi__StorageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1855:1: ( ( ruleStorage ) )
            // InternalSensorHub.g:1856:2: ( ruleStorage )
            {
            // InternalSensorHub.g:1856:2: ( ruleStorage )
            // InternalSensorHub.g:1857:3: ruleStorage
            {
             before(grammarAccess.getRaspPiAccess().getStorageStorageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStorage();

            state._fsp--;

             after(grammarAccess.getRaspPiAccess().getStorageStorageParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RaspPi__StorageAssignment_2"


    // $ANTLR start "rule__RaspPi__VisualizationAssignment_3"
    // InternalSensorHub.g:1866:1: rule__RaspPi__VisualizationAssignment_3 : ( ruleVisualizer ) ;
    public final void rule__RaspPi__VisualizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1870:1: ( ( ruleVisualizer ) )
            // InternalSensorHub.g:1871:2: ( ruleVisualizer )
            {
            // InternalSensorHub.g:1871:2: ( ruleVisualizer )
            // InternalSensorHub.g:1872:3: ruleVisualizer
            {
             before(grammarAccess.getRaspPiAccess().getVisualizationVisualizerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVisualizer();

            state._fsp--;

             after(grammarAccess.getRaspPiAccess().getVisualizationVisualizerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RaspPi__VisualizationAssignment_3"


    // $ANTLR start "rule__Storage__TypeAssignment_1"
    // InternalSensorHub.g:1881:1: rule__Storage__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Storage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1885:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:1886:2: ( RULE_ID )
            {
            // InternalSensorHub.g:1886:2: ( RULE_ID )
            // InternalSensorHub.g:1887:3: RULE_ID
            {
             before(grammarAccess.getStorageAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStorageAccess().getTypeIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Storage__TypeAssignment_1"


    // $ANTLR start "rule__Visualizer__TypeAssignment_1"
    // InternalSensorHub.g:1896:1: rule__Visualizer__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Visualizer__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1900:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:1901:2: ( RULE_ID )
            {
            // InternalSensorHub.g:1901:2: ( RULE_ID )
            // InternalSensorHub.g:1902:3: RULE_ID
            {
             before(grammarAccess.getVisualizerAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getTypeIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Visualizer__TypeAssignment_1"


    // $ANTLR start "rule__Edge__NameAssignment_1"
    // InternalSensorHub.g:1911:1: rule__Edge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1915:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:1916:2: ( RULE_ID )
            {
            // InternalSensorHub.g:1916:2: ( RULE_ID )
            // InternalSensorHub.g:1917:3: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Edge__NameAssignment_1"


    // $ANTLR start "rule__Edge__DeviceAssignment_2"
    // InternalSensorHub.g:1926:1: rule__Edge__DeviceAssignment_2 : ( ruleArduino ) ;
    public final void rule__Edge__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1930:1: ( ( ruleArduino ) )
            // InternalSensorHub.g:1931:2: ( ruleArduino )
            {
            // InternalSensorHub.g:1931:2: ( ruleArduino )
            // InternalSensorHub.g:1932:3: ruleArduino
            {
             before(grammarAccess.getEdgeAccess().getDeviceArduinoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArduino();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getDeviceArduinoParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Edge__DeviceAssignment_2"


    // $ANTLR start "rule__Arduino__RateAssignment_2"
    // InternalSensorHub.g:1941:1: rule__Arduino__RateAssignment_2 : ( RULE_INT ) ;
    public final void rule__Arduino__RateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1945:1: ( ( RULE_INT ) )
            // InternalSensorHub.g:1946:2: ( RULE_INT )
            {
            // InternalSensorHub.g:1946:2: ( RULE_INT )
            // InternalSensorHub.g:1947:3: RULE_INT
            {
             before(grammarAccess.getArduinoAccess().getRateINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getArduinoAccess().getRateINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Arduino__RateAssignment_2"


    // $ANTLR start "rule__Arduino__SensorsAssignment_3"
    // InternalSensorHub.g:1956:1: rule__Arduino__SensorsAssignment_3 : ( ruleSensor ) ;
    public final void rule__Arduino__SensorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1960:1: ( ( ruleSensor ) )
            // InternalSensorHub.g:1961:2: ( ruleSensor )
            {
            // InternalSensorHub.g:1961:2: ( ruleSensor )
            // InternalSensorHub.g:1962:3: ruleSensor
            {
             before(grammarAccess.getArduinoAccess().getSensorsSensorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getArduinoAccess().getSensorsSensorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Arduino__SensorsAssignment_3"


    // $ANTLR start "rule__Nrf24l01__TimeoutAssignment_1"
    // InternalSensorHub.g:1971:1: rule__Nrf24l01__TimeoutAssignment_1 : ( RULE_INT ) ;
    public final void rule__Nrf24l01__TimeoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1975:1: ( ( RULE_INT ) )
            // InternalSensorHub.g:1976:2: ( RULE_INT )
            {
            // InternalSensorHub.g:1976:2: ( RULE_INT )
            // InternalSensorHub.g:1977:3: RULE_INT
            {
             before(grammarAccess.getNrf24l01Access().getTimeoutINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNrf24l01Access().getTimeoutINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Nrf24l01__TimeoutAssignment_1"


    // $ANTLR start "rule__Sensor__RateAssignment_2_1"
    // InternalSensorHub.g:1986:1: rule__Sensor__RateAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Sensor__RateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:1990:1: ( ( RULE_INT ) )
            // InternalSensorHub.g:1991:2: ( RULE_INT )
            {
            // InternalSensorHub.g:1991:2: ( RULE_INT )
            // InternalSensorHub.g:1992:3: RULE_INT
            {
             before(grammarAccess.getSensorAccess().getRateINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRateINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Sensor__RateAssignment_2_1"


    // $ANTLR start "rule__Sensor__PreprocessorAssignment_3"
    // InternalSensorHub.g:2001:1: rule__Sensor__PreprocessorAssignment_3 : ( rulePreProcessor ) ;
    public final void rule__Sensor__PreprocessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2005:1: ( ( rulePreProcessor ) )
            // InternalSensorHub.g:2006:2: ( rulePreProcessor )
            {
            // InternalSensorHub.g:2006:2: ( rulePreProcessor )
            // InternalSensorHub.g:2007:3: rulePreProcessor
            {
             before(grammarAccess.getSensorAccess().getPreprocessorPreProcessorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePreProcessor();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getPreprocessorPreProcessorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Sensor__PreprocessorAssignment_3"


    // $ANTLR start "rule__Water_level__NameAssignment_1"
    // InternalSensorHub.g:2016:1: rule__Water_level__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Water_level__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2020:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:2021:2: ( RULE_ID )
            {
            // InternalSensorHub.g:2021:2: ( RULE_ID )
            // InternalSensorHub.g:2022:3: RULE_ID
            {
             before(grammarAccess.getWater_levelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWater_levelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Water_level__NameAssignment_1"


    // $ANTLR start "rule__Sr04__NameAssignment_1"
    // InternalSensorHub.g:2031:1: rule__Sr04__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sr04__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2035:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:2036:2: ( RULE_ID )
            {
            // InternalSensorHub.g:2036:2: ( RULE_ID )
            // InternalSensorHub.g:2037:3: RULE_ID
            {
             before(grammarAccess.getSr04Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSr04Access().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sr04__NameAssignment_1"


    // $ANTLR start "rule__Sound__NameAssignment_1"
    // InternalSensorHub.g:2046:1: rule__Sound__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sound__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2050:1: ( ( RULE_ID ) )
            // InternalSensorHub.g:2051:2: ( RULE_ID )
            {
            // InternalSensorHub.g:2051:2: ( RULE_ID )
            // InternalSensorHub.g:2052:3: RULE_ID
            {
             before(grammarAccess.getSoundAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sound__NameAssignment_1"


    // $ANTLR start "rule__Average__ValueAssignment_1"
    // InternalSensorHub.g:2061:1: rule__Average__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Average__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2065:1: ( ( RULE_INT ) )
            // InternalSensorHub.g:2066:2: ( RULE_INT )
            {
            // InternalSensorHub.g:2066:2: ( RULE_INT )
            // InternalSensorHub.g:2067:3: RULE_INT
            {
             before(grammarAccess.getAverageAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAverageAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Average__ValueAssignment_1"


    // $ANTLR start "rule__Threshold__MinAssignment_1"
    // InternalSensorHub.g:2076:1: rule__Threshold__MinAssignment_1 : ( RULE_INT ) ;
    public final void rule__Threshold__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2080:1: ( ( RULE_INT ) )
            // InternalSensorHub.g:2081:2: ( RULE_INT )
            {
            // InternalSensorHub.g:2081:2: ( RULE_INT )
            // InternalSensorHub.g:2082:3: RULE_INT
            {
             before(grammarAccess.getThresholdAccess().getMinINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getMinINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Threshold__MinAssignment_1"


    // $ANTLR start "rule__Threshold__MaxAssignment_3"
    // InternalSensorHub.g:2091:1: rule__Threshold__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Threshold__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensorHub.g:2095:1: ( ( RULE_INT ) )
            // InternalSensorHub.g:2096:2: ( RULE_INT )
            {
            // InternalSensorHub.g:2096:2: ( RULE_INT )
            // InternalSensorHub.g:2097:3: RULE_INT
            {
             before(grammarAccess.getThresholdAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getMaxINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Threshold__MaxAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});

}