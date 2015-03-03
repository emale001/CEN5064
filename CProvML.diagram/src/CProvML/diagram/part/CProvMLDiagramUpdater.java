package CProvML.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class CProvMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLNodeDescriptor> getSemanticChildren(
			View view) {
		switch (CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view)) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			return getNodesDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLNodeDescriptor> getNodesDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CProvML.NodesDiagram modelElement = (CProvML.NodesDiagram) view
				.getElement();
		LinkedList<CProvML.diagram.part.CProvMLNodeDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			CProvML.Node childElement = (CProvML.Node) it.next();
			int visualID = CProvML.diagram.part.CProvMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID) {
				result.add(new CProvML.diagram.part.CProvMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID) {
				result.add(new CProvML.diagram.part.CProvMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getContainedLinks(
			View view) {
		switch (CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view)) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			return getNodesDiagram_1000ContainedLinks(view);
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_2001ContainedLinks(view);
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2002ContainedLinks(view);
		case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getIncomingLinks(
			View view) {
		switch (CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view)) {
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_2001IncomingLinks(view);
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2002IncomingLinks(view);
		case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view)) {
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_2001OutgoingLinks(view);
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2002OutgoingLinks(view);
		case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getNodesDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getStorage_2001ContainedLinks(
			View view) {
		CProvML.Storage modelElement = (CProvML.Storage) view.getElement();
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getInstance_2002ContainedLinks(
			View view) {
		CProvML.Instance modelElement = (CProvML.Instance) view.getElement();
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getStorage_2001IncomingLinks(
			View view) {
		CProvML.Storage modelElement = (CProvML.Storage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getInstance_2002IncomingLinks(
			View view) {
		CProvML.Instance modelElement = (CProvML.Instance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getStorage_2001OutgoingLinks(
			View view) {
		CProvML.Storage modelElement = (CProvML.Storage) view.getElement();
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getInstance_2002OutgoingLinks(
			View view) {
		CProvML.Instance modelElement = (CProvML.Instance) view.getElement();
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CProvML.diagram.part.CProvMLLinkDescriptor> getConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CProvML.diagram.part.CProvMLLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			CProvML.Node container) {
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		CProvML.Connection link = container.getSourceConnections();
		if (CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != CProvML.diagram.part.CProvMLVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		CProvML.Node dst = link.getTarget();
		CProvML.Node src = link.getSource();
		result.add(new CProvML.diagram.part.CProvMLLinkDescriptor(src, dst,
				link,
				CProvML.diagram.providers.CProvMLElementTypes.Connection_4001,
				CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CProvML.diagram.part.CProvMLLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(
			CProvML.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CProvML.CProvMLPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof CProvML.Connection) {
				continue;
			}
			CProvML.Connection link = (CProvML.Connection) setting.getEObject();
			if (CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != CProvML.diagram.part.CProvMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CProvML.Node src = link.getSource();
			result.add(new CProvML.diagram.part.CProvMLLinkDescriptor(
					src,
					target,
					link,
					CProvML.diagram.providers.CProvMLElementTypes.Connection_4001,
					CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CProvML.diagram.part.CProvMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			CProvML.Node source) {
		CProvML.Node container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CProvML.Node) {
				container = (CProvML.Node) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor> result = new LinkedList<CProvML.diagram.part.CProvMLLinkDescriptor>();
		CProvML.Connection link = container.getSourceConnections();
		if (CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != CProvML.diagram.part.CProvMLVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		CProvML.Node dst = link.getTarget();
		CProvML.Node src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new CProvML.diagram.part.CProvMLLinkDescriptor(src, dst,
				link,
				CProvML.diagram.providers.CProvMLElementTypes.Connection_4001,
				CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<CProvML.diagram.part.CProvMLNodeDescriptor> getSemanticChildren(
				View view) {
			return CProvMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CProvML.diagram.part.CProvMLLinkDescriptor> getContainedLinks(
				View view) {
			return CProvMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CProvML.diagram.part.CProvMLLinkDescriptor> getIncomingLinks(
				View view) {
			return CProvMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CProvML.diagram.part.CProvMLLinkDescriptor> getOutgoingLinks(
				View view) {
			return CProvMLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
