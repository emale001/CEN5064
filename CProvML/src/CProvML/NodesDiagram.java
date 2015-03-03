/**
 */
package CProvML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CProvML.NodesDiagram#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see CProvML.CProvMLPackage#getNodesDiagram()
 * @model
 * @generated
 */
public interface NodesDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link CProvML.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see CProvML.CProvMLPackage#getNodesDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // NodesDiagram
