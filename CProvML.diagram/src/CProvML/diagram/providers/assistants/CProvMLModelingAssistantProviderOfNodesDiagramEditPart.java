package CProvML.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CProvMLModelingAssistantProviderOfNodesDiagramEditPart extends
		CProvML.diagram.providers.CProvMLModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.SecurityGroup_2003);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Instance_2002);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Storage_2001);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Network_2004);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Environment_2005);
		return types;
	}

}
