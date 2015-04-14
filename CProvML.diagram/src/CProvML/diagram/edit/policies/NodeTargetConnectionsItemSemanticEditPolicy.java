package CProvML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class NodeTargetConnectionsItemSemanticEditPolicy extends
		CProvML.diagram.edit.policies.CProvMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeTargetConnectionsItemSemanticEditPolicy() {
		super(
				CProvML.diagram.providers.CProvMLElementTypes.NodeTargetConnections_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
