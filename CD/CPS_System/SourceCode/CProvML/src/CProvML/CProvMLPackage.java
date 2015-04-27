/**
 */
package CProvML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CProvML.CProvMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CProvMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CProvML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CProvML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CProvML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CProvMLPackage eINSTANCE = CProvML.impl.CProvMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link CProvML.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.NodeImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOURCE_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TARGET_CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CProvML.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.InstanceImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SOURCE_CONNECTIONS = NODE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TARGET_CONNECTIONS = NODE__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CPU = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__RAM = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CProvML.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.StorageImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SOURCE_CONNECTIONS = NODE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__TARGET_CONNECTIONS = NODE__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SIZE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__TYPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CProvML.impl.NodesDiagramImpl <em>Nodes Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.NodesDiagramImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getNodesDiagram()
	 * @generated
	 */
	int NODES_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_DIAGRAM__NODES = 0;

	/**
	 * The number of structural features of the '<em>Nodes Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodes Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CProvML.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.ConnectionImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link CProvML.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.SecurityGroupImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__SOURCE_CONNECTIONS = NODE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__TARGET_CONNECTIONS = NODE__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>IP Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__IP_RANGE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VPC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__VPC_NAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CProvML.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.NetworkImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SOURCE_CONNECTIONS = NODE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TARGET_CONNECTIONS = NODE__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CProvML.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.impl.EnvironmentImpl
	 * @see CProvML.impl.CProvMLPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SOURCE_CONNECTIONS = NODE__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__TARGET_CONNECTIONS = NODE__TARGET_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CProvML.OSType <em>OS Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.OSType
	 * @see CProvML.impl.CProvMLPackageImpl#getOSType()
	 * @generated
	 */
	int OS_TYPE = 8;

	/**
	 * The meta object id for the '{@link CProvML.CPUType <em>CPU Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.CPUType
	 * @see CProvML.impl.CProvMLPackageImpl#getCPUType()
	 * @generated
	 */
	int CPU_TYPE = 9;

	/**
	 * The meta object id for the '{@link CProvML.StorageType <em>Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.StorageType
	 * @see CProvML.impl.CProvMLPackageImpl#getStorageType()
	 * @generated
	 */
	int STORAGE_TYPE = 10;

	/**
	 * The meta object id for the '{@link CProvML.NetworkType <em>Network Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CProvML.NetworkType
	 * @see CProvML.impl.CProvMLPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link CProvML.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see CProvML.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CProvML.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link CProvML.Node#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see CProvML.Node#getSourceConnections()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SourceConnections();

	/**
	 * Returns the meta object for the reference list '{@link CProvML.Node#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see CProvML.Node#getTargetConnections()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_TargetConnections();

	/**
	 * Returns the meta object for class '{@link CProvML.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see CProvML.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Instance#getCPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU</em>'.
	 * @see CProvML.Instance#getCPU()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_CPU();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Instance#getOS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS</em>'.
	 * @see CProvML.Instance#getOS()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_OS();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Instance#getRAM <em>RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAM</em>'.
	 * @see CProvML.Instance#getRAM()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_RAM();

	/**
	 * Returns the meta object for class '{@link CProvML.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see CProvML.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Storage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CProvML.Storage#getSize()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Storage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CProvML.Storage#getType()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Type();

	/**
	 * Returns the meta object for class '{@link CProvML.NodesDiagram <em>Nodes Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes Diagram</em>'.
	 * @see CProvML.NodesDiagram
	 * @generated
	 */
	EClass getNodesDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link CProvML.NodesDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see CProvML.NodesDiagram#getNodes()
	 * @see #getNodesDiagram()
	 * @generated
	 */
	EReference getNodesDiagram_Nodes();

	/**
	 * Returns the meta object for class '{@link CProvML.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see CProvML.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link CProvML.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CProvML.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link CProvML.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CProvML.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link CProvML.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see CProvML.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.SecurityGroup#getIPRange <em>IP Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Range</em>'.
	 * @see CProvML.SecurityGroup#getIPRange()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_IPRange();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.SecurityGroup#getVPCName <em>VPC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VPC Name</em>'.
	 * @see CProvML.SecurityGroup#getVPCName()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_VPCName();

	/**
	 * Returns the meta object for class '{@link CProvML.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see CProvML.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link CProvML.Network#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CProvML.Network#getType()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Type();

	/**
	 * Returns the meta object for class '{@link CProvML.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see CProvML.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for enum '{@link CProvML.OSType <em>OS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Type</em>'.
	 * @see CProvML.OSType
	 * @generated
	 */
	EEnum getOSType();

	/**
	 * Returns the meta object for enum '{@link CProvML.CPUType <em>CPU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CPU Type</em>'.
	 * @see CProvML.CPUType
	 * @generated
	 */
	EEnum getCPUType();

	/**
	 * Returns the meta object for enum '{@link CProvML.StorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Type</em>'.
	 * @see CProvML.StorageType
	 * @generated
	 */
	EEnum getStorageType();

	/**
	 * Returns the meta object for enum '{@link CProvML.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type</em>'.
	 * @see CProvML.NetworkType
	 * @generated
	 */
	EEnum getNetworkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CProvMLFactory getCProvMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CProvML.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.NodeImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Source Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SOURCE_CONNECTIONS = eINSTANCE.getNode_SourceConnections();

		/**
		 * The meta object literal for the '<em><b>Target Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TARGET_CONNECTIONS = eINSTANCE.getNode_TargetConnections();

		/**
		 * The meta object literal for the '{@link CProvML.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.InstanceImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>CPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__CPU = eINSTANCE.getInstance_CPU();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__OS = eINSTANCE.getInstance_OS();

		/**
		 * The meta object literal for the '<em><b>RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__RAM = eINSTANCE.getInstance_RAM();

		/**
		 * The meta object literal for the '{@link CProvML.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.StorageImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__SIZE = eINSTANCE.getStorage_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__TYPE = eINSTANCE.getStorage_Type();

		/**
		 * The meta object literal for the '{@link CProvML.impl.NodesDiagramImpl <em>Nodes Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.NodesDiagramImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getNodesDiagram()
		 * @generated
		 */
		EClass NODES_DIAGRAM = eINSTANCE.getNodesDiagram();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_DIAGRAM__NODES = eINSTANCE.getNodesDiagram_Nodes();

		/**
		 * The meta object literal for the '{@link CProvML.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.ConnectionImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link CProvML.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.SecurityGroupImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>IP Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__IP_RANGE = eINSTANCE.getSecurityGroup_IPRange();

		/**
		 * The meta object literal for the '<em><b>VPC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__VPC_NAME = eINSTANCE.getSecurityGroup_VPCName();

		/**
		 * The meta object literal for the '{@link CProvML.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.NetworkImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__TYPE = eINSTANCE.getNetwork_Type();

		/**
		 * The meta object literal for the '{@link CProvML.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.impl.EnvironmentImpl
		 * @see CProvML.impl.CProvMLPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link CProvML.OSType <em>OS Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.OSType
		 * @see CProvML.impl.CProvMLPackageImpl#getOSType()
		 * @generated
		 */
		EEnum OS_TYPE = eINSTANCE.getOSType();

		/**
		 * The meta object literal for the '{@link CProvML.CPUType <em>CPU Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.CPUType
		 * @see CProvML.impl.CProvMLPackageImpl#getCPUType()
		 * @generated
		 */
		EEnum CPU_TYPE = eINSTANCE.getCPUType();

		/**
		 * The meta object literal for the '{@link CProvML.StorageType <em>Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.StorageType
		 * @see CProvML.impl.CProvMLPackageImpl#getStorageType()
		 * @generated
		 */
		EEnum STORAGE_TYPE = eINSTANCE.getStorageType();

		/**
		 * The meta object literal for the '{@link CProvML.NetworkType <em>Network Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CProvML.NetworkType
		 * @see CProvML.impl.CProvMLPackageImpl#getNetworkType()
		 * @generated
		 */
		EEnum NETWORK_TYPE = eINSTANCE.getNetworkType();

	}

} //CProvMLPackage
