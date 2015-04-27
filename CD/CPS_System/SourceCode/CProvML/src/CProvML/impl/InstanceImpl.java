/**
 */
package CProvML.impl;

import CProvML.CPUType;
import CProvML.CProvMLPackage;
import CProvML.Instance;
import CProvML.OSType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CProvML.impl.InstanceImpl#getCPU <em>CPU</em>}</li>
 *   <li>{@link CProvML.impl.InstanceImpl#getOS <em>OS</em>}</li>
 *   <li>{@link CProvML.impl.InstanceImpl#getRAM <em>RAM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends NodeImpl implements Instance {
	/**
	 * The default value of the '{@link #getCPU() <em>CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPU()
	 * @generated
	 * @ordered
	 */
	protected static final CPUType CPU_EDEFAULT = CPUType.INTEL;
	/**
	 * The cached value of the '{@link #getCPU() <em>CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPU()
	 * @generated
	 * @ordered
	 */
	protected CPUType cpu = CPU_EDEFAULT;
	/**
	 * The default value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected static final OSType OS_EDEFAULT = OSType.WINDOWS;
	/**
	 * The cached value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected OSType os = OS_EDEFAULT;
	/**
	 * The default value of the '{@link #getRAM() <em>RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAM()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRAM() <em>RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAM()
	 * @generated
	 * @ordered
	 */
	protected int ram = RAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CProvMLPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUType getCPU() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPU(CPUType newCPU) {
		CPUType oldCPU = cpu;
		cpu = newCPU == null ? CPU_EDEFAULT : newCPU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.INSTANCE__CPU, oldCPU, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSType getOS() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS(OSType newOS) {
		OSType oldOS = os;
		os = newOS == null ? OS_EDEFAULT : newOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.INSTANCE__OS, oldOS, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRAM() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRAM(int newRAM) {
		int oldRAM = ram;
		ram = newRAM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.INSTANCE__RAM, oldRAM, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CProvMLPackage.INSTANCE__CPU:
				return getCPU();
			case CProvMLPackage.INSTANCE__OS:
				return getOS();
			case CProvMLPackage.INSTANCE__RAM:
				return getRAM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CProvMLPackage.INSTANCE__CPU:
				setCPU((CPUType)newValue);
				return;
			case CProvMLPackage.INSTANCE__OS:
				setOS((OSType)newValue);
				return;
			case CProvMLPackage.INSTANCE__RAM:
				setRAM((Integer)newValue);
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
			case CProvMLPackage.INSTANCE__CPU:
				setCPU(CPU_EDEFAULT);
				return;
			case CProvMLPackage.INSTANCE__OS:
				setOS(OS_EDEFAULT);
				return;
			case CProvMLPackage.INSTANCE__RAM:
				setRAM(RAM_EDEFAULT);
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
			case CProvMLPackage.INSTANCE__CPU:
				return cpu != CPU_EDEFAULT;
			case CProvMLPackage.INSTANCE__OS:
				return os != OS_EDEFAULT;
			case CProvMLPackage.INSTANCE__RAM:
				return ram != RAM_EDEFAULT;
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
		result.append(" (CPU: ");
		result.append(cpu);
		result.append(", OS: ");
		result.append(os);
		result.append(", RAM: ");
		result.append(ram);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
