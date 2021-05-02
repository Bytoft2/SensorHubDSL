package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SensorHubGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensorHubParser extends AbstractInternalAntlrParser {
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

        public InternalSensorHubParser(TokenStream input, SensorHubGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SensorSystem";
       	}

       	@Override
       	protected SensorHubGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSensorSystem"
    // InternalSensorHub.g:64:1: entryRuleSensorSystem returns [EObject current=null] : iv_ruleSensorSystem= ruleSensorSystem EOF ;
    public final EObject entryRuleSensorSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorSystem = null;


        try {
            // InternalSensorHub.g:64:53: (iv_ruleSensorSystem= ruleSensorSystem EOF )
            // InternalSensorHub.g:65:2: iv_ruleSensorSystem= ruleSensorSystem EOF
            {
             newCompositeNode(grammarAccess.getSensorSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorSystem=ruleSensorSystem();

            state._fsp--;

             current =iv_ruleSensorSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorSystem"


    // $ANTLR start "ruleSensorSystem"
    // InternalSensorHub.g:71:1: ruleSensorSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_devices_2_0= ruleDevice ) )* ) ;
    public final EObject ruleSensorSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_devices_2_0 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_devices_2_0= ruleDevice ) )* ) )
            // InternalSensorHub.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_devices_2_0= ruleDevice ) )* )
            {
            // InternalSensorHub.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_devices_2_0= ruleDevice ) )* )
            // InternalSensorHub.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_devices_2_0= ruleDevice ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorSystemAccess().getSystemKeyword_0());
            		
            // InternalSensorHub.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensorHub.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensorHub.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSensorHub.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSensorHub.g:101:3: ( (lv_devices_2_0= ruleDevice ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSensorHub.g:102:4: (lv_devices_2_0= ruleDevice )
            	    {
            	    // InternalSensorHub.g:102:4: (lv_devices_2_0= ruleDevice )
            	    // InternalSensorHub.g:103:5: lv_devices_2_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getSensorSystemAccess().getDevicesDeviceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_devices_2_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_2_0,
            	    						"org.xtext.example.mydsl.SensorHub.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorSystem"


    // $ANTLR start "entryRuleDevice"
    // InternalSensorHub.g:124:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalSensorHub.g:124:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalSensorHub.g:125:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalSensorHub.g:131:1: ruleDevice returns [EObject current=null] : (this_Fog_0= ruleFog | this_Edge_1= ruleEdge ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Fog_0 = null;

        EObject this_Edge_1 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:137:2: ( (this_Fog_0= ruleFog | this_Edge_1= ruleEdge ) )
            // InternalSensorHub.g:138:2: (this_Fog_0= ruleFog | this_Edge_1= ruleEdge )
            {
            // InternalSensorHub.g:138:2: (this_Fog_0= ruleFog | this_Edge_1= ruleEdge )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSensorHub.g:139:3: this_Fog_0= ruleFog
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getFogParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fog_0=ruleFog();

                    state._fsp--;


                    			current = this_Fog_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSensorHub.g:148:3: this_Edge_1= ruleEdge
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getEdgeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Edge_1=ruleEdge();

                    state._fsp--;


                    			current = this_Edge_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleFog"
    // InternalSensorHub.g:160:1: entryRuleFog returns [EObject current=null] : iv_ruleFog= ruleFog EOF ;
    public final EObject entryRuleFog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFog = null;


        try {
            // InternalSensorHub.g:160:44: (iv_ruleFog= ruleFog EOF )
            // InternalSensorHub.g:161:2: iv_ruleFog= ruleFog EOF
            {
             newCompositeNode(grammarAccess.getFogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFog=ruleFog();

            state._fsp--;

             current =iv_ruleFog; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFog"


    // $ANTLR start "ruleFog"
    // InternalSensorHub.g:167:1: ruleFog returns [EObject current=null] : (otherlv_0= 'fog' ( (lv_name_1_0= RULE_ID ) ) ( (lv_coms_2_0= ruleCom ) ) ( (lv_device_3_0= ruleRaspPi ) ) ( (lv_edgeDevices_4_0= ruleEdge ) )* ) ;
    public final EObject ruleFog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_coms_2_0 = null;

        EObject lv_device_3_0 = null;

        EObject lv_edgeDevices_4_0 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:173:2: ( (otherlv_0= 'fog' ( (lv_name_1_0= RULE_ID ) ) ( (lv_coms_2_0= ruleCom ) ) ( (lv_device_3_0= ruleRaspPi ) ) ( (lv_edgeDevices_4_0= ruleEdge ) )* ) )
            // InternalSensorHub.g:174:2: (otherlv_0= 'fog' ( (lv_name_1_0= RULE_ID ) ) ( (lv_coms_2_0= ruleCom ) ) ( (lv_device_3_0= ruleRaspPi ) ) ( (lv_edgeDevices_4_0= ruleEdge ) )* )
            {
            // InternalSensorHub.g:174:2: (otherlv_0= 'fog' ( (lv_name_1_0= RULE_ID ) ) ( (lv_coms_2_0= ruleCom ) ) ( (lv_device_3_0= ruleRaspPi ) ) ( (lv_edgeDevices_4_0= ruleEdge ) )* )
            // InternalSensorHub.g:175:3: otherlv_0= 'fog' ( (lv_name_1_0= RULE_ID ) ) ( (lv_coms_2_0= ruleCom ) ) ( (lv_device_3_0= ruleRaspPi ) ) ( (lv_edgeDevices_4_0= ruleEdge ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFogAccess().getFogKeyword_0());
            		
            // InternalSensorHub.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensorHub.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensorHub.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalSensorHub.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFogAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSensorHub.g:197:3: ( (lv_coms_2_0= ruleCom ) )
            // InternalSensorHub.g:198:4: (lv_coms_2_0= ruleCom )
            {
            // InternalSensorHub.g:198:4: (lv_coms_2_0= ruleCom )
            // InternalSensorHub.g:199:5: lv_coms_2_0= ruleCom
            {

            					newCompositeNode(grammarAccess.getFogAccess().getComsComParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_coms_2_0=ruleCom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFogRule());
            					}
            					set(
            						current,
            						"coms",
            						lv_coms_2_0,
            						"org.xtext.example.mydsl.SensorHub.Com");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSensorHub.g:216:3: ( (lv_device_3_0= ruleRaspPi ) )
            // InternalSensorHub.g:217:4: (lv_device_3_0= ruleRaspPi )
            {
            // InternalSensorHub.g:217:4: (lv_device_3_0= ruleRaspPi )
            // InternalSensorHub.g:218:5: lv_device_3_0= ruleRaspPi
            {

            					newCompositeNode(grammarAccess.getFogAccess().getDeviceRaspPiParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_device_3_0=ruleRaspPi();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFogRule());
            					}
            					set(
            						current,
            						"device",
            						lv_device_3_0,
            						"org.xtext.example.mydsl.SensorHub.RaspPi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSensorHub.g:235:3: ( (lv_edgeDevices_4_0= ruleEdge ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        int LA3_3 = input.LA(3);

                        if ( (LA3_3==17) ) {
                            int LA3_4 = input.LA(4);

                            if ( (LA3_4==18) ) {
                                int LA3_5 = input.LA(5);

                                if ( (LA3_5==RULE_INT) ) {
                                    alt3=1;
                                }


                            }


                        }


                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalSensorHub.g:236:4: (lv_edgeDevices_4_0= ruleEdge )
            	    {
            	    // InternalSensorHub.g:236:4: (lv_edgeDevices_4_0= ruleEdge )
            	    // InternalSensorHub.g:237:5: lv_edgeDevices_4_0= ruleEdge
            	    {

            	    					newCompositeNode(grammarAccess.getFogAccess().getEdgeDevicesEdgeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_edgeDevices_4_0=ruleEdge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFogRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edgeDevices",
            	    						lv_edgeDevices_4_0,
            	    						"org.xtext.example.mydsl.SensorHub.Edge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFog"


    // $ANTLR start "entryRuleRaspPi"
    // InternalSensorHub.g:258:1: entryRuleRaspPi returns [EObject current=null] : iv_ruleRaspPi= ruleRaspPi EOF ;
    public final EObject entryRuleRaspPi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaspPi = null;


        try {
            // InternalSensorHub.g:258:47: (iv_ruleRaspPi= ruleRaspPi EOF )
            // InternalSensorHub.g:259:2: iv_ruleRaspPi= ruleRaspPi EOF
            {
             newCompositeNode(grammarAccess.getRaspPiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaspPi=ruleRaspPi();

            state._fsp--;

             current =iv_ruleRaspPi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRaspPi"


    // $ANTLR start "ruleRaspPi"
    // InternalSensorHub.g:265:1: ruleRaspPi returns [EObject current=null] : ( () otherlv_1= 'raspberryPi' ( (lv_storage_2_0= ruleStorage ) )* ( (lv_visualization_3_0= ruleVisualizer ) )* ) ;
    public final EObject ruleRaspPi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_storage_2_0 = null;

        EObject lv_visualization_3_0 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:271:2: ( ( () otherlv_1= 'raspberryPi' ( (lv_storage_2_0= ruleStorage ) )* ( (lv_visualization_3_0= ruleVisualizer ) )* ) )
            // InternalSensorHub.g:272:2: ( () otherlv_1= 'raspberryPi' ( (lv_storage_2_0= ruleStorage ) )* ( (lv_visualization_3_0= ruleVisualizer ) )* )
            {
            // InternalSensorHub.g:272:2: ( () otherlv_1= 'raspberryPi' ( (lv_storage_2_0= ruleStorage ) )* ( (lv_visualization_3_0= ruleVisualizer ) )* )
            // InternalSensorHub.g:273:3: () otherlv_1= 'raspberryPi' ( (lv_storage_2_0= ruleStorage ) )* ( (lv_visualization_3_0= ruleVisualizer ) )*
            {
            // InternalSensorHub.g:273:3: ()
            // InternalSensorHub.g:274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRaspPiAccess().getRaspPiAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRaspPiAccess().getRaspberryPiKeyword_1());
            		
            // InternalSensorHub.g:284:3: ( (lv_storage_2_0= ruleStorage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSensorHub.g:285:4: (lv_storage_2_0= ruleStorage )
            	    {
            	    // InternalSensorHub.g:285:4: (lv_storage_2_0= ruleStorage )
            	    // InternalSensorHub.g:286:5: lv_storage_2_0= ruleStorage
            	    {

            	    					newCompositeNode(grammarAccess.getRaspPiAccess().getStorageStorageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_storage_2_0=ruleStorage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRaspPiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"storage",
            	    						lv_storage_2_0,
            	    						"org.xtext.example.mydsl.SensorHub.Storage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSensorHub.g:303:3: ( (lv_visualization_3_0= ruleVisualizer ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSensorHub.g:304:4: (lv_visualization_3_0= ruleVisualizer )
            	    {
            	    // InternalSensorHub.g:304:4: (lv_visualization_3_0= ruleVisualizer )
            	    // InternalSensorHub.g:305:5: lv_visualization_3_0= ruleVisualizer
            	    {

            	    					newCompositeNode(grammarAccess.getRaspPiAccess().getVisualizationVisualizerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_visualization_3_0=ruleVisualizer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRaspPiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"visualization",
            	    						lv_visualization_3_0,
            	    						"org.xtext.example.mydsl.SensorHub.Visualizer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRaspPi"


    // $ANTLR start "entryRuleStorage"
    // InternalSensorHub.g:326:1: entryRuleStorage returns [EObject current=null] : iv_ruleStorage= ruleStorage EOF ;
    public final EObject entryRuleStorage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStorage = null;


        try {
            // InternalSensorHub.g:326:48: (iv_ruleStorage= ruleStorage EOF )
            // InternalSensorHub.g:327:2: iv_ruleStorage= ruleStorage EOF
            {
             newCompositeNode(grammarAccess.getStorageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStorage=ruleStorage();

            state._fsp--;

             current =iv_ruleStorage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStorage"


    // $ANTLR start "ruleStorage"
    // InternalSensorHub.g:333:1: ruleStorage returns [EObject current=null] : (otherlv_0= 'storage' ( (lv_type_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStorage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:339:2: ( (otherlv_0= 'storage' ( (lv_type_1_0= RULE_ID ) ) ) )
            // InternalSensorHub.g:340:2: (otherlv_0= 'storage' ( (lv_type_1_0= RULE_ID ) ) )
            {
            // InternalSensorHub.g:340:2: (otherlv_0= 'storage' ( (lv_type_1_0= RULE_ID ) ) )
            // InternalSensorHub.g:341:3: otherlv_0= 'storage' ( (lv_type_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStorageAccess().getStorageKeyword_0());
            		
            // InternalSensorHub.g:345:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalSensorHub.g:346:4: (lv_type_1_0= RULE_ID )
            {
            // InternalSensorHub.g:346:4: (lv_type_1_0= RULE_ID )
            // InternalSensorHub.g:347:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getStorageAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStorageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStorage"


    // $ANTLR start "entryRuleVisualizer"
    // InternalSensorHub.g:367:1: entryRuleVisualizer returns [EObject current=null] : iv_ruleVisualizer= ruleVisualizer EOF ;
    public final EObject entryRuleVisualizer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualizer = null;


        try {
            // InternalSensorHub.g:367:51: (iv_ruleVisualizer= ruleVisualizer EOF )
            // InternalSensorHub.g:368:2: iv_ruleVisualizer= ruleVisualizer EOF
            {
             newCompositeNode(grammarAccess.getVisualizerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisualizer=ruleVisualizer();

            state._fsp--;

             current =iv_ruleVisualizer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisualizer"


    // $ANTLR start "ruleVisualizer"
    // InternalSensorHub.g:374:1: ruleVisualizer returns [EObject current=null] : (otherlv_0= 'vis' ( (lv_type_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVisualizer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:380:2: ( (otherlv_0= 'vis' ( (lv_type_1_0= RULE_ID ) ) ) )
            // InternalSensorHub.g:381:2: (otherlv_0= 'vis' ( (lv_type_1_0= RULE_ID ) ) )
            {
            // InternalSensorHub.g:381:2: (otherlv_0= 'vis' ( (lv_type_1_0= RULE_ID ) ) )
            // InternalSensorHub.g:382:3: otherlv_0= 'vis' ( (lv_type_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualizerAccess().getVisKeyword_0());
            		
            // InternalSensorHub.g:386:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalSensorHub.g:387:4: (lv_type_1_0= RULE_ID )
            {
            // InternalSensorHub.g:387:4: (lv_type_1_0= RULE_ID )
            // InternalSensorHub.g:388:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getVisualizerAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisualizerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisualizer"


    // $ANTLR start "entryRuleEdge"
    // InternalSensorHub.g:408:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalSensorHub.g:408:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalSensorHub.g:409:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalSensorHub.g:415:1: ruleEdge returns [EObject current=null] : (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) ( (lv_device_2_0= ruleArduino ) ) ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_device_2_0 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:421:2: ( (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) ( (lv_device_2_0= ruleArduino ) ) ) )
            // InternalSensorHub.g:422:2: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) ( (lv_device_2_0= ruleArduino ) ) )
            {
            // InternalSensorHub.g:422:2: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) ( (lv_device_2_0= ruleArduino ) ) )
            // InternalSensorHub.g:423:3: otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) ( (lv_device_2_0= ruleArduino ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getEdgeKeyword_0());
            		
            // InternalSensorHub.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensorHub.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensorHub.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalSensorHub.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSensorHub.g:445:3: ( (lv_device_2_0= ruleArduino ) )
            // InternalSensorHub.g:446:4: (lv_device_2_0= ruleArduino )
            {
            // InternalSensorHub.g:446:4: (lv_device_2_0= ruleArduino )
            // InternalSensorHub.g:447:5: lv_device_2_0= ruleArduino
            {

            					newCompositeNode(grammarAccess.getEdgeAccess().getDeviceArduinoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_device_2_0=ruleArduino();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeRule());
            					}
            					set(
            						current,
            						"device",
            						lv_device_2_0,
            						"org.xtext.example.mydsl.SensorHub.Arduino");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleArduino"
    // InternalSensorHub.g:468:1: entryRuleArduino returns [EObject current=null] : iv_ruleArduino= ruleArduino EOF ;
    public final EObject entryRuleArduino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArduino = null;


        try {
            // InternalSensorHub.g:468:48: (iv_ruleArduino= ruleArduino EOF )
            // InternalSensorHub.g:469:2: iv_ruleArduino= ruleArduino EOF
            {
             newCompositeNode(grammarAccess.getArduinoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArduino=ruleArduino();

            state._fsp--;

             current =iv_ruleArduino; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArduino"


    // $ANTLR start "ruleArduino"
    // InternalSensorHub.g:475:1: ruleArduino returns [EObject current=null] : (otherlv_0= 'arduino' otherlv_1= 'rate' ( (lv_rate_2_0= RULE_INT ) ) ( (lv_sensors_3_0= ruleSensor ) )* ) ;
    public final EObject ruleArduino() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rate_2_0=null;
        EObject lv_sensors_3_0 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:481:2: ( (otherlv_0= 'arduino' otherlv_1= 'rate' ( (lv_rate_2_0= RULE_INT ) ) ( (lv_sensors_3_0= ruleSensor ) )* ) )
            // InternalSensorHub.g:482:2: (otherlv_0= 'arduino' otherlv_1= 'rate' ( (lv_rate_2_0= RULE_INT ) ) ( (lv_sensors_3_0= ruleSensor ) )* )
            {
            // InternalSensorHub.g:482:2: (otherlv_0= 'arduino' otherlv_1= 'rate' ( (lv_rate_2_0= RULE_INT ) ) ( (lv_sensors_3_0= ruleSensor ) )* )
            // InternalSensorHub.g:483:3: otherlv_0= 'arduino' otherlv_1= 'rate' ( (lv_rate_2_0= RULE_INT ) ) ( (lv_sensors_3_0= ruleSensor ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArduinoAccess().getArduinoKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getArduinoAccess().getRateKeyword_1());
            		
            // InternalSensorHub.g:491:3: ( (lv_rate_2_0= RULE_INT ) )
            // InternalSensorHub.g:492:4: (lv_rate_2_0= RULE_INT )
            {
            // InternalSensorHub.g:492:4: (lv_rate_2_0= RULE_INT )
            // InternalSensorHub.g:493:5: lv_rate_2_0= RULE_INT
            {
            lv_rate_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_rate_2_0, grammarAccess.getArduinoAccess().getRateINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArduinoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rate",
            						lv_rate_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSensorHub.g:509:3: ( (lv_sensors_3_0= ruleSensor ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSensorHub.g:510:4: (lv_sensors_3_0= ruleSensor )
            	    {
            	    // InternalSensorHub.g:510:4: (lv_sensors_3_0= ruleSensor )
            	    // InternalSensorHub.g:511:5: lv_sensors_3_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getArduinoAccess().getSensorsSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_sensors_3_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArduinoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_3_0,
            	    						"org.xtext.example.mydsl.SensorHub.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArduino"


    // $ANTLR start "entryRuleCom"
    // InternalSensorHub.g:532:1: entryRuleCom returns [EObject current=null] : iv_ruleCom= ruleCom EOF ;
    public final EObject entryRuleCom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCom = null;


        try {
            // InternalSensorHub.g:532:44: (iv_ruleCom= ruleCom EOF )
            // InternalSensorHub.g:533:2: iv_ruleCom= ruleCom EOF
            {
             newCompositeNode(grammarAccess.getComRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCom=ruleCom();

            state._fsp--;

             current =iv_ruleCom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCom"


    // $ANTLR start "ruleCom"
    // InternalSensorHub.g:539:1: ruleCom returns [EObject current=null] : (otherlv_0= 'com' this_Nrf24l01_1= ruleNrf24l01 ) ;
    public final EObject ruleCom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Nrf24l01_1 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:545:2: ( (otherlv_0= 'com' this_Nrf24l01_1= ruleNrf24l01 ) )
            // InternalSensorHub.g:546:2: (otherlv_0= 'com' this_Nrf24l01_1= ruleNrf24l01 )
            {
            // InternalSensorHub.g:546:2: (otherlv_0= 'com' this_Nrf24l01_1= ruleNrf24l01 )
            // InternalSensorHub.g:547:3: otherlv_0= 'com' this_Nrf24l01_1= ruleNrf24l01
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getComAccess().getComKeyword_0());
            		

            			newCompositeNode(grammarAccess.getComAccess().getNrf24l01ParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Nrf24l01_1=ruleNrf24l01();

            state._fsp--;


            			current = this_Nrf24l01_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCom"


    // $ANTLR start "entryRuleNrf24l01"
    // InternalSensorHub.g:563:1: entryRuleNrf24l01 returns [EObject current=null] : iv_ruleNrf24l01= ruleNrf24l01 EOF ;
    public final EObject entryRuleNrf24l01() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNrf24l01 = null;


        try {
            // InternalSensorHub.g:563:49: (iv_ruleNrf24l01= ruleNrf24l01 EOF )
            // InternalSensorHub.g:564:2: iv_ruleNrf24l01= ruleNrf24l01 EOF
            {
             newCompositeNode(grammarAccess.getNrf24l01Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNrf24l01=ruleNrf24l01();

            state._fsp--;

             current =iv_ruleNrf24l01; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNrf24l01"


    // $ANTLR start "ruleNrf24l01"
    // InternalSensorHub.g:570:1: ruleNrf24l01 returns [EObject current=null] : (otherlv_0= 'nrf24l01' ( (lv_timeout_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNrf24l01() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_timeout_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:576:2: ( (otherlv_0= 'nrf24l01' ( (lv_timeout_1_0= RULE_INT ) ) ) )
            // InternalSensorHub.g:577:2: (otherlv_0= 'nrf24l01' ( (lv_timeout_1_0= RULE_INT ) ) )
            {
            // InternalSensorHub.g:577:2: (otherlv_0= 'nrf24l01' ( (lv_timeout_1_0= RULE_INT ) ) )
            // InternalSensorHub.g:578:3: otherlv_0= 'nrf24l01' ( (lv_timeout_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNrf24l01Access().getNrf24l01Keyword_0());
            		
            // InternalSensorHub.g:582:3: ( (lv_timeout_1_0= RULE_INT ) )
            // InternalSensorHub.g:583:4: (lv_timeout_1_0= RULE_INT )
            {
            // InternalSensorHub.g:583:4: (lv_timeout_1_0= RULE_INT )
            // InternalSensorHub.g:584:5: lv_timeout_1_0= RULE_INT
            {
            lv_timeout_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_timeout_1_0, grammarAccess.getNrf24l01Access().getTimeoutINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNrf24l01Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeout",
            						lv_timeout_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNrf24l01"


    // $ANTLR start "entryRuleSensor"
    // InternalSensorHub.g:604:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSensorHub.g:604:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSensorHub.g:605:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSensorHub.g:611:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' (this_Water_level_1= ruleWater_level | this_Sr04_2= ruleSr04 | this_Sound_3= ruleSound ) (otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) ) )? ( (lv_preprocessor_6_0= rulePreProcessor ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token lv_rate_5_0=null;
        EObject this_Water_level_1 = null;

        EObject this_Sr04_2 = null;

        EObject this_Sound_3 = null;

        EObject lv_preprocessor_6_0 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:617:2: ( (otherlv_0= 'sensor' (this_Water_level_1= ruleWater_level | this_Sr04_2= ruleSr04 | this_Sound_3= ruleSound ) (otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) ) )? ( (lv_preprocessor_6_0= rulePreProcessor ) ) ) )
            // InternalSensorHub.g:618:2: (otherlv_0= 'sensor' (this_Water_level_1= ruleWater_level | this_Sr04_2= ruleSr04 | this_Sound_3= ruleSound ) (otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) ) )? ( (lv_preprocessor_6_0= rulePreProcessor ) ) )
            {
            // InternalSensorHub.g:618:2: (otherlv_0= 'sensor' (this_Water_level_1= ruleWater_level | this_Sr04_2= ruleSr04 | this_Sound_3= ruleSound ) (otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) ) )? ( (lv_preprocessor_6_0= rulePreProcessor ) ) )
            // InternalSensorHub.g:619:3: otherlv_0= 'sensor' (this_Water_level_1= ruleWater_level | this_Sr04_2= ruleSr04 | this_Sound_3= ruleSound ) (otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) ) )? ( (lv_preprocessor_6_0= rulePreProcessor ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSensorHub.g:623:3: (this_Water_level_1= ruleWater_level | this_Sr04_2= ruleSr04 | this_Sound_3= ruleSound )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSensorHub.g:624:4: this_Water_level_1= ruleWater_level
                    {

                    				newCompositeNode(grammarAccess.getSensorAccess().getWater_levelParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_15);
                    this_Water_level_1=ruleWater_level();

                    state._fsp--;


                    				current = this_Water_level_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSensorHub.g:633:4: this_Sr04_2= ruleSr04
                    {

                    				newCompositeNode(grammarAccess.getSensorAccess().getSr04ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Sr04_2=ruleSr04();

                    state._fsp--;


                    				current = this_Sr04_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSensorHub.g:642:4: this_Sound_3= ruleSound
                    {

                    				newCompositeNode(grammarAccess.getSensorAccess().getSoundParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_15);
                    this_Sound_3=ruleSound();

                    state._fsp--;


                    				current = this_Sound_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSensorHub.g:651:3: (otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSensorHub.g:652:4: otherlv_4= 'rate' ( (lv_rate_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getRateKeyword_2_0());
                    			
                    // InternalSensorHub.g:656:4: ( (lv_rate_5_0= RULE_INT ) )
                    // InternalSensorHub.g:657:5: (lv_rate_5_0= RULE_INT )
                    {
                    // InternalSensorHub.g:657:5: (lv_rate_5_0= RULE_INT )
                    // InternalSensorHub.g:658:6: lv_rate_5_0= RULE_INT
                    {
                    lv_rate_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    						newLeafNode(lv_rate_5_0, grammarAccess.getSensorAccess().getRateINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rate",
                    							lv_rate_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSensorHub.g:675:3: ( (lv_preprocessor_6_0= rulePreProcessor ) )
            // InternalSensorHub.g:676:4: (lv_preprocessor_6_0= rulePreProcessor )
            {
            // InternalSensorHub.g:676:4: (lv_preprocessor_6_0= rulePreProcessor )
            // InternalSensorHub.g:677:5: lv_preprocessor_6_0= rulePreProcessor
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getPreprocessorPreProcessorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_preprocessor_6_0=rulePreProcessor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"preprocessor",
            						lv_preprocessor_6_0,
            						"org.xtext.example.mydsl.SensorHub.PreProcessor");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleWater_level"
    // InternalSensorHub.g:698:1: entryRuleWater_level returns [EObject current=null] : iv_ruleWater_level= ruleWater_level EOF ;
    public final EObject entryRuleWater_level() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWater_level = null;


        try {
            // InternalSensorHub.g:698:52: (iv_ruleWater_level= ruleWater_level EOF )
            // InternalSensorHub.g:699:2: iv_ruleWater_level= ruleWater_level EOF
            {
             newCompositeNode(grammarAccess.getWater_levelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWater_level=ruleWater_level();

            state._fsp--;

             current =iv_ruleWater_level; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWater_level"


    // $ANTLR start "ruleWater_level"
    // InternalSensorHub.g:705:1: ruleWater_level returns [EObject current=null] : (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleWater_level() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:711:2: ( (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSensorHub.g:712:2: (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSensorHub.g:712:2: (otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSensorHub.g:713:3: otherlv_0= 'water' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWater_levelAccess().getWaterKeyword_0());
            		
            // InternalSensorHub.g:717:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensorHub.g:718:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensorHub.g:718:4: (lv_name_1_0= RULE_ID )
            // InternalSensorHub.g:719:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWater_levelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWater_levelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWater_level"


    // $ANTLR start "entryRuleSr04"
    // InternalSensorHub.g:739:1: entryRuleSr04 returns [EObject current=null] : iv_ruleSr04= ruleSr04 EOF ;
    public final EObject entryRuleSr04() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSr04 = null;


        try {
            // InternalSensorHub.g:739:45: (iv_ruleSr04= ruleSr04 EOF )
            // InternalSensorHub.g:740:2: iv_ruleSr04= ruleSr04 EOF
            {
             newCompositeNode(grammarAccess.getSr04Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSr04=ruleSr04();

            state._fsp--;

             current =iv_ruleSr04; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSr04"


    // $ANTLR start "ruleSr04"
    // InternalSensorHub.g:746:1: ruleSr04 returns [EObject current=null] : (otherlv_0= 'sr04' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSr04() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:752:2: ( (otherlv_0= 'sr04' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSensorHub.g:753:2: (otherlv_0= 'sr04' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSensorHub.g:753:2: (otherlv_0= 'sr04' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSensorHub.g:754:3: otherlv_0= 'sr04' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSr04Access().getSr04Keyword_0());
            		
            // InternalSensorHub.g:758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensorHub.g:759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensorHub.g:759:4: (lv_name_1_0= RULE_ID )
            // InternalSensorHub.g:760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSr04Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSr04Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSr04"


    // $ANTLR start "entryRuleSound"
    // InternalSensorHub.g:780:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalSensorHub.g:780:46: (iv_ruleSound= ruleSound EOF )
            // InternalSensorHub.g:781:2: iv_ruleSound= ruleSound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSound=ruleSound();

            state._fsp--;

             current =iv_ruleSound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalSensorHub.g:787:1: ruleSound returns [EObject current=null] : (otherlv_0= 'sound' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:793:2: ( (otherlv_0= 'sound' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSensorHub.g:794:2: (otherlv_0= 'sound' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSensorHub.g:794:2: (otherlv_0= 'sound' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSensorHub.g:795:3: otherlv_0= 'sound' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getSoundKeyword_0());
            		
            // InternalSensorHub.g:799:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensorHub.g:800:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensorHub.g:800:4: (lv_name_1_0= RULE_ID )
            // InternalSensorHub.g:801:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSoundAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRulePreProcessor"
    // InternalSensorHub.g:821:1: entryRulePreProcessor returns [EObject current=null] : iv_rulePreProcessor= rulePreProcessor EOF ;
    public final EObject entryRulePreProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreProcessor = null;


        try {
            // InternalSensorHub.g:821:53: (iv_rulePreProcessor= rulePreProcessor EOF )
            // InternalSensorHub.g:822:2: iv_rulePreProcessor= rulePreProcessor EOF
            {
             newCompositeNode(grammarAccess.getPreProcessorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreProcessor=rulePreProcessor();

            state._fsp--;

             current =iv_rulePreProcessor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreProcessor"


    // $ANTLR start "rulePreProcessor"
    // InternalSensorHub.g:828:1: rulePreProcessor returns [EObject current=null] : (this_Average_0= ruleAverage | this_Threshold_1= ruleThreshold ) ;
    public final EObject rulePreProcessor() throws RecognitionException {
        EObject current = null;

        EObject this_Average_0 = null;

        EObject this_Threshold_1 = null;



        	enterRule();

        try {
            // InternalSensorHub.g:834:2: ( (this_Average_0= ruleAverage | this_Threshold_1= ruleThreshold ) )
            // InternalSensorHub.g:835:2: (this_Average_0= ruleAverage | this_Threshold_1= ruleThreshold )
            {
            // InternalSensorHub.g:835:2: (this_Average_0= ruleAverage | this_Threshold_1= ruleThreshold )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensorHub.g:836:3: this_Average_0= ruleAverage
                    {

                    			newCompositeNode(grammarAccess.getPreProcessorAccess().getAverageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Average_0=ruleAverage();

                    state._fsp--;


                    			current = this_Average_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSensorHub.g:845:3: this_Threshold_1= ruleThreshold
                    {

                    			newCompositeNode(grammarAccess.getPreProcessorAccess().getThresholdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Threshold_1=ruleThreshold();

                    state._fsp--;


                    			current = this_Threshold_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreProcessor"


    // $ANTLR start "entryRuleAverage"
    // InternalSensorHub.g:857:1: entryRuleAverage returns [EObject current=null] : iv_ruleAverage= ruleAverage EOF ;
    public final EObject entryRuleAverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverage = null;


        try {
            // InternalSensorHub.g:857:48: (iv_ruleAverage= ruleAverage EOF )
            // InternalSensorHub.g:858:2: iv_ruleAverage= ruleAverage EOF
            {
             newCompositeNode(grammarAccess.getAverageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAverage=ruleAverage();

            state._fsp--;

             current =iv_ruleAverage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAverage"


    // $ANTLR start "ruleAverage"
    // InternalSensorHub.g:864:1: ruleAverage returns [EObject current=null] : (otherlv_0= 'avg' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:870:2: ( (otherlv_0= 'avg' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalSensorHub.g:871:2: (otherlv_0= 'avg' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalSensorHub.g:871:2: (otherlv_0= 'avg' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalSensorHub.g:872:3: otherlv_0= 'avg' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAverageAccess().getAvgKeyword_0());
            		
            // InternalSensorHub.g:876:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSensorHub.g:877:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSensorHub.g:877:4: (lv_value_1_0= RULE_INT )
            // InternalSensorHub.g:878:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getAverageAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAverageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAverage"


    // $ANTLR start "entryRuleThreshold"
    // InternalSensorHub.g:898:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // InternalSensorHub.g:898:50: (iv_ruleThreshold= ruleThreshold EOF )
            // InternalSensorHub.g:899:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalSensorHub.g:905:1: ruleThreshold returns [EObject current=null] : (otherlv_0= 'thresh' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;


        	enterRule();

        try {
            // InternalSensorHub.g:911:2: ( (otherlv_0= 'thresh' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) ) )
            // InternalSensorHub.g:912:2: (otherlv_0= 'thresh' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )
            {
            // InternalSensorHub.g:912:2: (otherlv_0= 'thresh' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )
            // InternalSensorHub.g:913:3: otherlv_0= 'thresh' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getThresholdAccess().getThreshKeyword_0());
            		
            // InternalSensorHub.g:917:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalSensorHub.g:918:4: (lv_min_1_0= RULE_INT )
            {
            // InternalSensorHub.g:918:4: (lv_min_1_0= RULE_INT )
            // InternalSensorHub.g:919:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_min_1_0, grammarAccess.getThresholdAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThresholdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getThresholdAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSensorHub.g:939:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalSensorHub.g:940:4: (lv_max_3_0= RULE_INT )
            {
            // InternalSensorHub.g:940:4: (lv_max_3_0= RULE_INT )
            // InternalSensorHub.g:941:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_max_3_0, grammarAccess.getThresholdAccess().getMaxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThresholdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThreshold"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});

}