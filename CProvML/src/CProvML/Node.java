/**
 */
package CProvML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CProvML.Node#getName <em>Name</em>}</li>
 *   <li>{@link CProvML.Node#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link CProvML.Node#getTargetConnections <em>Target Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see CProvML.CProvMLPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CProvML.CProvMLPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CProvML.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference.
	 * @see #setSourceConnections(Connection)
	 * @see CProvML.CProvMLPackage#getNode_SourceConnections()
	 * @model containment="true" upper="-2"
	 * @generated
	 */
	Connection getSourceConnections();

	/**
	 * Sets the value of the '{@link CProvML.Node#getSourceConnections <em>Source Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Connections</em>' containment reference.
	 * @see #getSourceConnections()
	 * @generated
	 */
	void setSourceConnections(Connection value);

	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' reference.
	 * @see #setTargetConnections(Connection)
	 * @see CProvML.CProvMLPackage#getNode_TargetConnections()
	 * @model upper="-2"
	 * @generated
	 */
	Connection getTargetConnections();

	/**
	 * Sets the value of the '{@link CProvML.Node#getTargetConnections <em>Target Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Connections</em>' reference.
	 * @see #getTargetConnections()
	 * @generated
	 */
	void setTargetConnections(Connection value);

} // Node
