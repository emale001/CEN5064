/**
 */
package CProvML;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CProvML.Instance#getCPU <em>CPU</em>}</li>
 *   <li>{@link CProvML.Instance#getOS <em>OS</em>}</li>
 *   <li>{@link CProvML.Instance#getRAM <em>RAM</em>}</li>
 * </ul>
 * </p>
 *
 * @see CProvML.CProvMLPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Node {

	/**
	 * Returns the value of the '<em><b>CPU</b></em>' attribute.
	 * The literals are from the enumeration {@link CProvML.CPUType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU</em>' attribute.
	 * @see CProvML.CPUType
	 * @see #setCPU(CPUType)
	 * @see CProvML.CProvMLPackage#getInstance_CPU()
	 * @model required="true"
	 * @generated
	 */
	CPUType getCPU();

	/**
	 * Sets the value of the '{@link CProvML.Instance#getCPU <em>CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU</em>' attribute.
	 * @see CProvML.CPUType
	 * @see #getCPU()
	 * @generated
	 */
	void setCPU(CPUType value);

	/**
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * The literals are from the enumeration {@link CProvML.OSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see CProvML.OSType
	 * @see #setOS(OSType)
	 * @see CProvML.CProvMLPackage#getInstance_OS()
	 * @model required="true"
	 * @generated
	 */
	OSType getOS();

	/**
	 * Sets the value of the '{@link CProvML.Instance#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see CProvML.OSType
	 * @see #getOS()
	 * @generated
	 */
	void setOS(OSType value);

	/**
	 * Returns the value of the '<em><b>RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAM</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAM</em>' attribute.
	 * @see #setRAM(int)
	 * @see CProvML.CProvMLPackage#getInstance_RAM()
	 * @model required="true"
	 * @generated
	 */
	int getRAM();

	/**
	 * Sets the value of the '{@link CProvML.Instance#getRAM <em>RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAM</em>' attribute.
	 * @see #getRAM()
	 * @generated
	 */
	void setRAM(int value);
} // Instance
