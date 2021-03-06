/**
 *
 * $Id$
 */
package CProvML.validation;

import CProvML.Connection;

/**
 * A sample validator interface for {@link CProvML.Node}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateSourceConnections(Connection value);
	boolean validateTargetConnections(Connection value);
}
