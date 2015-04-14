package CProvML.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class NodesDiagramItemSemanticEditPolicy extends
		CProvML.diagram.edit.policies.CProvMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodesDiagramItemSemanticEditPolicy() {
		super(CProvML.diagram.providers.CProvMLElementTypes.NodesDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CProvML.diagram.providers.CProvMLElementTypes.Storage_2001 == req
				.getElementType()) {
			return getGEFWrapper(new CProvML.diagram.edit.commands.StorageCreateCommand(
					req));
		}
		if (CProvML.diagram.providers.CProvMLElementTypes.Network_2004 == req
				.getElementType()) {
			return getGEFWrapper(new CProvML.diagram.edit.commands.NetworkCreateCommand(
					req));
		}
		if (CProvML.diagram.providers.CProvMLElementTypes.SecurityGroup_2003 == req
				.getElementType()) {
			return getGEFWrapper(new CProvML.diagram.edit.commands.SecurityGroupCreateCommand(
					req));
		}
		if (CProvML.diagram.providers.CProvMLElementTypes.Environment_2005 == req
				.getElementType()) {
			return getGEFWrapper(new CProvML.diagram.edit.commands.EnvironmentCreateCommand(
					req));
		}
		if (CProvML.diagram.providers.CProvMLElementTypes.Instance_2002 == req
				.getElementType()) {
			return getGEFWrapper(new CProvML.diagram.edit.commands.InstanceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
