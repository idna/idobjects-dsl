
package com.idobjects.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IdObjectsDslStandaloneSetup extends IdObjectsDslStandaloneSetupGenerated{

	public static void doSetup() {
		new IdObjectsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

