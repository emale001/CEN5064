package CProvML.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class CProvMLNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CProvML.diagram.navigator.CProvMLNavigatorItem
				&& !isOwnView(((CProvML.diagram.navigator.CProvMLNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CProvML.diagram.navigator.CProvMLNavigatorGroup) {
			CProvML.diagram.navigator.CProvMLNavigatorGroup group = (CProvML.diagram.navigator.CProvMLNavigatorGroup) element;
			return CProvML.diagram.part.CProvMLDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CProvML.diagram.navigator.CProvMLNavigatorItem) {
			CProvML.diagram.navigator.CProvMLNavigatorItem navigatorItem = (CProvML.diagram.navigator.CProvMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view)) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?CProvML?NodesDiagram", CProvML.diagram.providers.CProvMLElementTypes.NodesDiagram_1000); //$NON-NLS-1$
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?CProvML?Storage", CProvML.diagram.providers.CProvMLElementTypes.Storage_2001); //$NON-NLS-1$
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?CProvML?Instance", CProvML.diagram.providers.CProvMLElementTypes.Instance_2002); //$NON-NLS-1$
		case CProvML.diagram.edit.parts.SecurityGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?CProvML?SecurityGroup", CProvML.diagram.providers.CProvMLElementTypes.SecurityGroup_2003); //$NON-NLS-1$
		case CProvML.diagram.edit.parts.NetworkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?CProvML?Network", CProvML.diagram.providers.CProvMLElementTypes.Network_2004); //$NON-NLS-1$
		case CProvML.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?CProvML?Environment", CProvML.diagram.providers.CProvMLElementTypes.Environment_2005); //$NON-NLS-1$
		case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?CProvML?Connection", CProvML.diagram.providers.CProvMLElementTypes.Connection_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& CProvML.diagram.providers.CProvMLElementTypes
						.isKnownElementType(elementType)) {
			image = CProvML.diagram.providers.CProvMLElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CProvML.diagram.navigator.CProvMLNavigatorGroup) {
			CProvML.diagram.navigator.CProvMLNavigatorGroup group = (CProvML.diagram.navigator.CProvMLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CProvML.diagram.navigator.CProvMLNavigatorItem) {
			CProvML.diagram.navigator.CProvMLNavigatorItem navigatorItem = (CProvML.diagram.navigator.CProvMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CProvML.diagram.part.CProvMLVisualIDRegistry.getVisualID(view)) {
		case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
			return getNodesDiagram_1000Text(view);
		case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_2001Text(view);
		case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2002Text(view);
		case CProvML.diagram.edit.parts.SecurityGroupEditPart.VISUAL_ID:
			return getSecurityGroup_2003Text(view);
		case CProvML.diagram.edit.parts.NetworkEditPart.VISUAL_ID:
			return getNetwork_2004Text(view);
		case CProvML.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2005Text(view);
		case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getNodesDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStorage_2001Text(View view) {
		IParser parser = CProvML.diagram.providers.CProvMLParserProvider
				.getParser(
						CProvML.diagram.providers.CProvMLElementTypes.Storage_2001,
						view.getElement() != null ? view.getElement() : view,
						CProvML.diagram.part.CProvMLVisualIDRegistry
								.getType(CProvML.diagram.edit.parts.StorageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInstance_2002Text(View view) {
		IParser parser = CProvML.diagram.providers.CProvMLParserProvider
				.getParser(
						CProvML.diagram.providers.CProvMLElementTypes.Instance_2002,
						view.getElement() != null ? view.getElement() : view,
						CProvML.diagram.part.CProvMLVisualIDRegistry
								.getType(CProvML.diagram.edit.parts.InstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSecurityGroup_2003Text(View view) {
		IParser parser = CProvML.diagram.providers.CProvMLParserProvider
				.getParser(
						CProvML.diagram.providers.CProvMLElementTypes.SecurityGroup_2003,
						view.getElement() != null ? view.getElement() : view,
						CProvML.diagram.part.CProvMLVisualIDRegistry
								.getType(CProvML.diagram.edit.parts.SecurityGroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetwork_2004Text(View view) {
		IParser parser = CProvML.diagram.providers.CProvMLParserProvider
				.getParser(
						CProvML.diagram.providers.CProvMLElementTypes.Network_2004,
						view.getElement() != null ? view.getElement() : view,
						CProvML.diagram.part.CProvMLVisualIDRegistry
								.getType(CProvML.diagram.edit.parts.NetworkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnvironment_2005Text(View view) {
		IParser parser = CProvML.diagram.providers.CProvMLParserProvider
				.getParser(
						CProvML.diagram.providers.CProvMLElementTypes.Environment_2005,
						view.getElement() != null ? view.getElement() : view,
						CProvML.diagram.part.CProvMLVisualIDRegistry
								.getType(CProvML.diagram.edit.parts.EnvironmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID
				.equals(CProvML.diagram.part.CProvMLVisualIDRegistry
						.getModelID(view));
	}

}
