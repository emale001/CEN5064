package CProvML.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CProvMLModelingAssistantProviderOfStorageEditPart extends
		CProvML.diagram.providers.CProvMLModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CProvML.diagram.edit.parts.StorageEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			CProvML.diagram.edit.parts.StorageEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Connection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(CProvML.diagram.edit.parts.StorageEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			CProvML.diagram.edit.parts.StorageEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CProvML.diagram.edit.parts.InstanceEditPart) {
			types.add(CProvML.diagram.providers.CProvMLElementTypes.Connection_4001);
		}
		if (targetEditPart instanceof CProvML.diagram.edit.parts.StorageEditPart) {
			types.add(CProvML.diagram.providers.CProvMLElementTypes.Connection_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(CProvML.diagram.edit.parts.StorageEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			CProvML.diagram.edit.parts.StorageEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CProvML.diagram.providers.CProvMLElementTypes.Connection_4001) {
			types.add(CProvML.diagram.providers.CProvMLElementTypes.Instance_2002);
			types.add(CProvML.diagram.providers.CProvMLElementTypes.Storage_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CProvML.diagram.edit.parts.StorageEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			CProvML.diagram.edit.parts.StorageEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Connection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(CProvML.diagram.edit.parts.StorageEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			CProvML.diagram.edit.parts.StorageEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CProvML.diagram.providers.CProvMLElementTypes.Connection_4001) {
			types.add(CProvML.diagram.providers.CProvMLElementTypes.Instance_2002);
			types.add(CProvML.diagram.providers.CProvMLElementTypes.Storage_2001);
		}
		return types;
	}

}
