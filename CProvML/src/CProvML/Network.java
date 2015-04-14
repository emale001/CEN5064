/**
 */
package CProvML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CProvML.Network#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CProvML.CProvMLPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Node {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CProvML.NetworkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CProvML.NetworkType
	 * @see #setType(NetworkType)
	 * @see CProvML.CProvMLPackage#getNetwork_Type()
	 * @model
	 * @generated
	 */
	NetworkType getType();

	/**
	 * Sets the value of the '{@link CProvML.Network#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CProvML.NetworkType
	 * @see #getType()
	 * @generated
	 */
	void setType(NetworkType value);

} // Network
