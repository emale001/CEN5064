/**
 */
package CProvML;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CProvML.Storage#getSize <em>Size</em>}</li>
 *   <li>{@link CProvML.Storage#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CProvML.CProvMLPackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Node {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute list.
	 * @see CProvML.CProvMLPackage#getStorage_Size()
	 * @model lower="3" upper="2000"
	 * @generated
	 */
	EList<Integer> getSize();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CProvML.StorageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CProvML.StorageType
	 * @see #setType(StorageType)
	 * @see CProvML.CProvMLPackage#getStorage_Type()
	 * @model
	 * @generated
	 */
	StorageType getType();

	/**
	 * Sets the value of the '{@link CProvML.Storage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CProvML.StorageType
	 * @see #getType()
	 * @generated
	 */
	void setType(StorageType value);
} // Storage
