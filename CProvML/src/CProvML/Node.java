/**
 */
package CProvML;

import org.eclipse.emf.common.util.EList;
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NodeNameCannotBeEmpty NodesCannotBeConnectedToSelf NodesCannotBeConnectedMoreThanOnce'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NodeNameCannotBeEmpty='Tuple {\n\tmessage : String = \'Name must not be empty.\',\n\tstatus : Boolean = \n\t\t\tif name.size() > 0 then true else null endif\n}.status' NodesCannotBeConnectedToSelf='Tuple {\n\tmessage : String = \'Node cannot connect to itself.\',\n\tstatus : Boolean = \n\t\t\tif sourceConnections->forAll(c | c.source <> c.target) then true else null endif\n}.status' NodesCannotBeConnectedMoreThanOnce='Tuple {\n\tmessage : String = \'Nodes may not connect more than once.\',\n\tstatus : Boolean = \n\t\t\tlet selfConnections : Boolean = sourceConnections->forAll(a | sourceConnections->forAll(b | a <> b implies a.target <> b.target)) in \n\t\t\tlet otherConnections : Boolean = sourceConnections->forAll(sc | sc.target.sourceConnections->forAll(tc | sc.source <> tc.target)) in\n\t\t\tif selfConnections and otherConnections then true else null endif\n}.status'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CProvML.CProvMLPackage#getNode_Name()
	 * @model default="" id="true"
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
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference list.
	 * The list contents are of type {@link CProvML.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference list.
	 * @see CProvML.CProvMLPackage#getNode_SourceConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getSourceConnections();

	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' reference list.
	 * The list contents are of type {@link CProvML.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' reference list.
	 * @see CProvML.CProvMLPackage#getNode_TargetConnections()
	 * @model
	 * @generated
	 */
	EList<Connection> getTargetConnections();

} // Node
