package CProvML.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class NodesDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "CProvML"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public NodesDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CProvML.diagram.edit.policies.NodesDiagramItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new CProvML.diagram.edit.policies.NodesDiagramCanonicalEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						CProvML.diagram.part.CProvMLVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
