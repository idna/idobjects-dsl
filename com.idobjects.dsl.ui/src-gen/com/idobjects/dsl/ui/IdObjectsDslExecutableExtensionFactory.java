/*
 * generated by Xtext
 */
package com.idobjects.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class IdObjectsDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return com.idobjects.dsl.ui.internal.IdObjectsDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return com.idobjects.dsl.ui.internal.IdObjectsDslActivator.getInstance().getInjector("com.idobjects.dsl.IdObjectsDsl");
	}
	
}
