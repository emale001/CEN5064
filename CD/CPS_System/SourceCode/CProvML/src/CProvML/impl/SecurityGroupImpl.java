/**
 */
package CProvML.impl;

import CProvML.CProvMLPackage;
import CProvML.SecurityGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CProvML.impl.SecurityGroupImpl#getIPRange <em>IP Range</em>}</li>
 *   <li>{@link CProvML.impl.SecurityGroupImpl#getVPCName <em>VPC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityGroupImpl extends NodeImpl implements SecurityGroup {
	/**
	 * The default value of the '{@link #getIPRange() <em>IP Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPRange()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPRange() <em>IP Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPRange()
	 * @generated
	 * @ordered
	 */
	protected String ipRange = IP_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVPCName() <em>VPC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVPCName()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVPCName() <em>VPC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVPCName()
	 * @generated
	 * @ordered
	 */
	protected String vpcName = VPC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CProvMLPackage.Literals.SECURITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPRange() {
		return ipRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPRange(String newIPRange) {
		String oldIPRange = ipRange;
		ipRange = newIPRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.SECURITY_GROUP__IP_RANGE, oldIPRange, ipRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVPCName() {
		return vpcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVPCName(String newVPCName) {
		String oldVPCName = vpcName;
		vpcName = newVPCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.SECURITY_GROUP__VPC_NAME, oldVPCName, vpcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CProvMLPackage.SECURITY_GROUP__IP_RANGE:
				return getIPRange();
			case CProvMLPackage.SECURITY_GROUP__VPC_NAME:
				return getVPCName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CProvMLPackage.SECURITY_GROUP__IP_RANGE:
				setIPRange((String)newValue);
				return;
			case CProvMLPackage.SECURITY_GROUP__VPC_NAME:
				setVPCName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CProvMLPackage.SECURITY_GROUP__IP_RANGE:
				setIPRange(IP_RANGE_EDEFAULT);
				return;
			case CProvMLPackage.SECURITY_GROUP__VPC_NAME:
				setVPCName(VPC_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CProvMLPackage.SECURITY_GROUP__IP_RANGE:
				return IP_RANGE_EDEFAULT == null ? ipRange != null : !IP_RANGE_EDEFAULT.equals(ipRange);
			case CProvMLPackage.SECURITY_GROUP__VPC_NAME:
				return VPC_NAME_EDEFAULT == null ? vpcName != null : !VPC_NAME_EDEFAULT.equals(vpcName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IPRange: ");
		result.append(ipRange);
		result.append(", VPCName: ");
		result.append(vpcName);
		result.append(')');
		return result.toString();
	}

} //SecurityGroupImpl
