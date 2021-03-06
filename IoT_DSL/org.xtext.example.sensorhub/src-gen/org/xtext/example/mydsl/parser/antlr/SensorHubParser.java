/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalSensorHubParser;
import org.xtext.example.mydsl.services.SensorHubGrammarAccess;

public class SensorHubParser extends AbstractAntlrParser {

	@Inject
	private SensorHubGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSensorHubParser createParser(XtextTokenStream stream) {
		return new InternalSensorHubParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SensorSystem";
	}

	public SensorHubGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SensorHubGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
