/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CalculatorFormStandaloneSetup extends CalculatorFormStandaloneSetupGenerated {

	def static void doSetup() {
		new CalculatorFormStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
