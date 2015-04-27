/**
 */
package CProvML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Network Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CProvML.CProvMLPackage#getNetworkType()
 * @model
 * @generated
 */
public enum NetworkType implements Enumerator {
	/**
	 * The '<em><b>Host Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_ONLY(0, "HostOnly", "HostOnly"),

	/**
	 * The '<em><b>Bridge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIDGE_VALUE
	 * @generated
	 * @ordered
	 */
	BRIDGE(0, "Bridge", "Bridge"),

	/**
	 * The '<em><b>NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT_VALUE
	 * @generated
	 * @ordered
	 */
	NAT(0, "NAT", "NAT");

	/**
	 * The '<em><b>Host Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Host Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOST_ONLY
	 * @model name="HostOnly"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Bridge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bridge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRIDGE
	 * @model name="Bridge"
	 * @generated
	 * @ordered
	 */
	public static final int BRIDGE_VALUE = 0;

	/**
	 * The '<em><b>NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Network Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NetworkType[] VALUES_ARRAY =
		new NetworkType[] {
			HOST_ONLY,
			BRIDGE,
			NAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Network Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NetworkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Network Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkType get(int value) {
		switch (value) {
			case HOST_ONLY_VALUE: return HOST_ONLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NetworkType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NetworkType
