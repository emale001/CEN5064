package CProvML.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class CProvMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(view)) {

			case CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.NodesDiagramEditPart(view);

			case CProvML.diagram.edit.parts.StorageEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.StorageEditPart(view);

			case CProvML.diagram.edit.parts.StorageNameEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.StorageNameEditPart(view);

			case CProvML.diagram.edit.parts.NetworkEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.NetworkEditPart(view);

			case CProvML.diagram.edit.parts.NetworkNameEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.NetworkNameEditPart(view);

			case CProvML.diagram.edit.parts.SecurityGroupEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.SecurityGroupEditPart(
						view);

			case CProvML.diagram.edit.parts.SecurityGroupNameEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.SecurityGroupNameEditPart(
						view);

			case CProvML.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.EnvironmentEditPart(view);

			case CProvML.diagram.edit.parts.EnvironmentNameEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.EnvironmentNameEditPart(
						view);

			case CProvML.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.InstanceEditPart(view);

			case CProvML.diagram.edit.parts.InstanceNameEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.InstanceNameEditPart(view);

			case CProvML.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.ConnectionEditPart(view);

			case CProvML.diagram.edit.parts.NodeTargetConnectionsEditPart.VISUAL_ID:
				return new CProvML.diagram.edit.parts.NodeTargetConnectionsEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
