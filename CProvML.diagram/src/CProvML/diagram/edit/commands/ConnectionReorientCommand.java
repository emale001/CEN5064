package CProvML.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof CProvML.Connection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof CProvML.Node && newEnd instanceof CProvML.Node)) {
			return false;
		}
		CProvML.Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CProvML.Node)) {
			return false;
		}
		CProvML.Node container = (CProvML.Node) getLink().eContainer();
		return CProvML.diagram.edit.policies.CProvMLBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CProvML.Node && newEnd instanceof CProvML.Node)) {
			return false;
		}
		CProvML.Node source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CProvML.Node)) {
			return false;
		}
		CProvML.Node container = (CProvML.Node) getLink().eContainer();
		return CProvML.diagram.edit.policies.CProvMLBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_4001(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CProvML.Connection getLink() {
		return (CProvML.Connection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected CProvML.Node getOldSource() {
		return (CProvML.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CProvML.Node getNewSource() {
		return (CProvML.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected CProvML.Node getOldTarget() {
		return (CProvML.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CProvML.Node getNewTarget() {
		return (CProvML.Node) newEnd;
	}
}
