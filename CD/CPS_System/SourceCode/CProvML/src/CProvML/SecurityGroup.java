/**
 */
package CProvML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CProvML.SecurityGroup#getIPRange <em>IP Range</em>}</li>
 *   <li>{@link CProvML.SecurityGroup#getVPCName <em>VPC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CProvML.CProvMLPackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends Node {
	/**
	 * Returns the value of the '<em><b>IP Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Range</em>' attribute.
	 * @see #setIPRange(String)
	 * @see CProvML.CProvMLPackage#getSecurityGroup_IPRange()
	 * @model required="true"
	 * @generated
	 */
	String getIPRange();

	/**
	 * Sets the value of the '{@link CProvML.SecurityGroup#getIPRange <em>IP Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Range</em>' attribute.
	 * @see #getIPRange()
	 * @generated
	 */
	void setIPRange(String value);

	/**
	 * Returns the value of the '<em><b>VPC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VPC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VPC Name</em>' attribute.
	 * @see #setVPCName(String)
	 * @see CProvML.CProvMLPackage#getSecurityGroup_VPCName()
	 * @model required="true"
	 * @generated
	 */
	String getVPCName();

	/**
	 * Sets the value of the '{@link CProvML.SecurityGroup#getVPCName <em>VPC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VPC Name</em>' attribute.
	 * @see #getVPCName()
	 * @generated
	 */
	void setVPCName(String value);

} // SecurityGroup
