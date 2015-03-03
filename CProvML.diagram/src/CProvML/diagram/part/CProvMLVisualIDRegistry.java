package CProvML.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CProvMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "CProvML.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CProvML.CProvMLPackage.eINSTANCE.getNodesDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((CProvML.NodesDiagram) domainElement)) {
			return CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = CProvML.diagram.part.CProvMLVisualIDRegistry
				.getModelID(containerView);
		if (!CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			if (CProvML.CProvMLPackage.eINSTANCE.getStorage().isSuperTypeOf(
					domainElement.eClass())) {
				return CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID;
			}
			if (CProvML.CProvMLPackage.eINSTANCE.getInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = CProvML.diagram.part.CProvMLVisualIDRegistry
				.getModelID(containerView);
		if (!CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			if (CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			if (CProvML.diagram.edit.parts.StorageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			if (CProvML.diagram.edit.parts.InstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CProvML.CProvMLPackage.eINSTANCE.getConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CProvML.NodesDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			return false;
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
