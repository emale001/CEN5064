/**
 */
package CProvML.util;

import CProvML.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see CProvML.CProvMLPackage
 * @generated
 */
public class CProvMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CProvMLValidator INSTANCE = new CProvMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "CProvML";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CProvMLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CProvMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CProvMLPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case CProvMLPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case CProvMLPackage.STORAGE:
				return validateStorage((Storage)value, diagnostics, context);
			case CProvMLPackage.NODES_DIAGRAM:
				return validateNodesDiagram((NodesDiagram)value, diagnostics, context);
			case CProvMLPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case CProvMLPackage.SECURITY_GROUP:
				return validateSecurityGroup((SecurityGroup)value, diagnostics, context);
			case CProvMLPackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case CProvMLPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case CProvMLPackage.OS_TYPE:
				return validateOSType((OSType)value, diagnostics, context);
			case CProvMLPackage.CPU_TYPE:
				return validateCPUType((CPUType)value, diagnostics, context);
			case CProvMLPackage.STORAGE_TYPE:
				return validateStorageType((StorageType)value, diagnostics, context);
			case CProvMLPackage.NETWORK_TYPE:
				return validateNetworkType((NetworkType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodeNameCannotBeEmpty(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedToSelf(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedMoreThanOnce(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NodeNameCannotBeEmpty constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__NODE_NAME_CANNOT_BE_EMPTY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Name must not be empty.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tif name.size() > 0 then true else null endif\n" +
		"}.status";

	/**
	 * Validates the NodeNameCannotBeEmpty constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_NodeNameCannotBeEmpty(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CProvMLPackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NodeNameCannotBeEmpty",
				 NODE__NODE_NAME_CANNOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NodesCannotBeConnectedToSelf constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__NODES_CANNOT_BE_CONNECTED_TO_SELF__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Node cannot connect to itself.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tif sourceConnections->forAll(c | c.source <> c.target) then true else null endif\n" +
		"}.status";

	/**
	 * Validates the NodesCannotBeConnectedToSelf constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_NodesCannotBeConnectedToSelf(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CProvMLPackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NodesCannotBeConnectedToSelf",
				 NODE__NODES_CANNOT_BE_CONNECTED_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NodesCannotBeConnectedMoreThanOnce constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__NODES_CANNOT_BE_CONNECTED_MORE_THAN_ONCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Nodes may not connect more than once.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlet selfConnections : Boolean = sourceConnections->forAll(a | sourceConnections->forAll(b | a <> b implies a.target <> b.target)) in \n" +
		"\t\t\tlet otherConnections : Boolean = sourceConnections->forAll(sc | sc.target.sourceConnections->forAll(tc | sc.source <> tc.target)) in\n" +
		"\t\t\tif selfConnections and otherConnections then true else null endif\n" +
		"}.status";

	/**
	 * Validates the NodesCannotBeConnectedMoreThanOnce constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_NodesCannotBeConnectedMoreThanOnce(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CProvMLPackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NodesCannotBeConnectedMoreThanOnce",
				 NODE__NODES_CANNOT_BE_CONNECTED_MORE_THAN_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodeNameCannotBeEmpty(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedToSelf(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedMoreThanOnce(instance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodeNameCannotBeEmpty(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedToSelf(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedMoreThanOnce(storage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesDiagram(NodesDiagram nodesDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodesDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityGroup(SecurityGroup securityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodeNameCannotBeEmpty(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedToSelf(securityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedMoreThanOnce(securityGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodeNameCannotBeEmpty(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedToSelf(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedMoreThanOnce(network, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(environment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodeNameCannotBeEmpty(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedToSelf(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_NodesCannotBeConnectedMoreThanOnce(environment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSType(OSType osType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPUType(CPUType cpuType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageType(StorageType storageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkType(NetworkType networkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CProvMLValidator
