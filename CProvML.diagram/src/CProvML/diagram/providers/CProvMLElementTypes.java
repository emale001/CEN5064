package CProvML.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class CProvMLElementTypes {

	/**
	 * @generated
	 */
	private CProvMLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType NodesDiagram_1000 = getElementType("CProvML.diagram.NodesDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SecurityGroup_2003 = getElementType("CProvML.diagram.SecurityGroup_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Environment_2005 = getElementType("CProvML.diagram.Environment_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Instance_2002 = getElementType("CProvML.diagram.Instance_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Storage_2001 = getElementType("CProvML.diagram.Storage_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Network_2004 = getElementType("CProvML.diagram.Network_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_4001 = getElementType("CProvML.diagram.Connection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(NodesDiagram_1000,
					CProvML.CProvMLPackage.eINSTANCE.getNodesDiagram());

			elements.put(SecurityGroup_2003,
					CProvML.CProvMLPackage.eINSTANCE.getSecurityGroup());

			elements.put(Instance_2002,
					CProvML.CProvMLPackage.eINSTANCE.getInstance());

			elements.put(Storage_2001,
					CProvML.CProvMLPackage.eINSTANCE.getStorage());

			elements.put(Network_2004,
					CProvML.CProvMLPackage.eINSTANCE.getNetwork());

			elements.put(Environment_2005,
					CProvML.CProvMLPackage.eINSTANCE.getEnvironment());

			elements.put(Connection_4001,
					CProvML.CProvMLPackage.eINSTANCE.getConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(NodesDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(SecurityGroup_2003);
			KNOWN_ELEMENT_TYPES.add(Instance_2002);
			KNOWN_ELEMENT_TYPES.add(Storage_2001);
			KNOWN_ELEMENT_TYPES.add(Network_2004);
			KNOWN_ELEMENT_TYPES.add(Environment_2005);
			KNOWN_ELEMENT_TYPES.add(Connection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			return NodesDiagram_1000;
		case CProvML.diagram.edit.parts.SecurityGroupEditPart.VISUAL_ID:
			return SecurityGroup_2003;
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return Instance_2002;
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return Storage_2001;
		case CProvML.diagram.edit.parts.NetworkEditPart.VISUAL_ID:
			return Network_2004;
		case CProvML.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return Environment_2005;
		case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return Connection_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return CProvML.diagram.providers.CProvMLElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return CProvML.diagram.providers.CProvMLElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return CProvML.diagram.providers.CProvMLElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
