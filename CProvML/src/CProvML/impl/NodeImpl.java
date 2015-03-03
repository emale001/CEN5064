/**
 */
package CProvML.impl;

import CProvML.CProvMLPackage;
import CProvML.Connection;
import CProvML.Node;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CProvML.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CProvML.impl.NodeImpl#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link CProvML.impl.NodeImpl#getTargetConnections <em>Target Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceConnections() <em>Source Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnections()
	 * @generated
	 * @ordered
	 */
	protected Connection sourceConnections;

	/**
	 * The cached value of the '{@link #getTargetConnections() <em>Target Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnections()
	 * @generated
	 * @ordered
	 */
	protected Connection targetConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CProvMLPackage.Literals.NODE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getSourceConnections() {
		return sourceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceConnections(Connection newSourceConnections, NotificationChain msgs) {
		Connection oldSourceConnections = sourceConnections;
		sourceConnections = newSourceConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CProvMLPackage.NODE__SOURCE_CONNECTIONS, oldSourceConnections, newSourceConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConnections(Connection newSourceConnections) {
		if (newSourceConnections != sourceConnections) {
			NotificationChain msgs = null;
			if (sourceConnections != null)
				msgs = ((InternalEObject)sourceConnections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CProvMLPackage.NODE__SOURCE_CONNECTIONS, null, msgs);
			if (newSourceConnections != null)
				msgs = ((InternalEObject)newSourceConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CProvMLPackage.NODE__SOURCE_CONNECTIONS, null, msgs);
			msgs = basicSetSourceConnections(newSourceConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.NODE__SOURCE_CONNECTIONS, newSourceConnections, newSourceConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getTargetConnections() {
		if (targetConnections != null && targetConnections.eIsProxy()) {
			InternalEObject oldTargetConnections = (InternalEObject)targetConnections;
			targetConnections = (Connection)eResolveProxy(oldTargetConnections);
			if (targetConnections != oldTargetConnections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CProvMLPackage.NODE__TARGET_CONNECTIONS, oldTargetConnections, targetConnections));
			}
		}
		return targetConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetTargetConnections() {
		return targetConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConnections(Connection newTargetConnections) {
		Connection oldTargetConnections = targetConnections;
		targetConnections = newTargetConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CProvMLPackage.NODE__TARGET_CONNECTIONS, oldTargetConnections, targetConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CProvMLPackage.NODE__SOURCE_CONNECTIONS:
				return basicSetSourceConnections(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CProvMLPackage.NODE__NAME:
				return getName();
			case CProvMLPackage.NODE__SOURCE_CONNECTIONS:
				return getSourceConnections();
			case CProvMLPackage.NODE__TARGET_CONNECTIONS:
				if (resolve) return getTargetConnections();
				return basicGetTargetConnections();
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
			case CProvMLPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case CProvMLPackage.NODE__SOURCE_CONNECTIONS:
				setSourceConnections((Connection)newValue);
				return;
			case CProvMLPackage.NODE__TARGET_CONNECTIONS:
				setTargetConnections((Connection)newValue);
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
			case CProvMLPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CProvMLPackage.NODE__SOURCE_CONNECTIONS:
				setSourceConnections((Connection)null);
				return;
			case CProvMLPackage.NODE__TARGET_CONNECTIONS:
				setTargetConnections((Connection)null);
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
			case CProvMLPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CProvMLPackage.NODE__SOURCE_CONNECTIONS:
				return sourceConnections != null;
			case CProvMLPackage.NODE__TARGET_CONNECTIONS:
				return targetConnections != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
