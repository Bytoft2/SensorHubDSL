/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.SensorHubRuntimeModule;
import org.xtext.example.mydsl.SensorHubStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SensorHubIdeSetup extends SensorHubStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SensorHubRuntimeModule(), new SensorHubIdeModule()));
	}
	
}