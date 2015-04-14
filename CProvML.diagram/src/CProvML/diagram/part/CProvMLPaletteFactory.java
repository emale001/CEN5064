package CProvML.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class CProvMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCProvML1Group());
	}

	/**
	 * Creates "CProvML" palette tool group
	 * @generated
	 */
	private PaletteContainer createCProvML1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				CProvML.diagram.part.Messages.CProvML1Group_title);
		paletteContainer.setId("createCProvML1Group"); //$NON-NLS-1$
		paletteContainer.add(createEnvironment1CreationTool());
		paletteContainer.add(createSecurityGroup2CreationTool());
		paletteContainer.add(createNetwork3CreationTool());
		paletteContainer.add(createInstance4CreationTool());
		paletteContainer.add(createStorage5CreationTool());
		paletteContainer.add(createConnection6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnvironment1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.Environment1CreationTool_title,
				CProvML.diagram.part.Messages.Environment1CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Environment_2005));
		entry.setId("createEnvironment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Environment.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Environment.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityGroup2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.SecurityGroup2CreationTool_title,
				CProvML.diagram.part.Messages.SecurityGroup2CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.SecurityGroup_2003));
		entry.setId("createSecurityGroup2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/SecurityGroup.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/SecurityGroup.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetwork3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.Network3CreationTool_title,
				CProvML.diagram.part.Messages.Network3CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Network_2004));
		entry.setId("createNetwork3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Network.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Network.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstance4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.Instance4CreationTool_title,
				CProvML.diagram.part.Messages.Instance4CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Instance_2002));
		entry.setId("createInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Instance.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Instance.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.Storage5CreationTool_title,
				CProvML.diagram.part.Messages.Storage5CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Storage_2001));
		entry.setId("createStorage5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Storage.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Storage.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.Connection_4001);
		types.add(CProvML.diagram.providers.CProvMLElementTypes.NodeTargetConnections_4002);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				CProvML.diagram.part.Messages.Connection6CreationTool_title,
				CProvML.diagram.part.Messages.Connection6CreationTool_desc,
				types);
		entry.setId("createConnection6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Connection.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.custom/icons/Connection.png")); //$NON-NLS-1$
		return entry;
	}

}
