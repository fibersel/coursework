/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.s2c.cypher.ui.internal.CypherActivator;

public class CypherUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CypherActivator.getInstance().getInjector("org.xtext.example.s2c.Cypher");
	}

}
