package CProvML.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createInstance1CreationTool());
		paletteContainer.add(createStorage2CreationTool());
		paletteContainer.add(createConnection3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstance1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.Instance1CreationTool_title,
				CProvML.diagram.part.Messages.Instance1CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Instance_2002));
		entry.setId("createInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.edit/icons/full/obj16/Instance.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.edit/icons/full/obj16/Instance.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				CProvML.diagram.part.Messages.Storage2CreationTool_title,
				CProvML.diagram.part.Messages.Storage2CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Storage_2001));
		entry.setId("createStorage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.edit/icons/full/obj16/Storage.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.edit/icons/full/obj16/Storage.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				CProvML.diagram.part.Messages.Connection3CreationTool_title,
				CProvML.diagram.part.Messages.Connection3CreationTool_desc,
				Collections
						.singletonList(CProvML.diagram.providers.CProvMLElementTypes.Connection_4001));
		entry.setId("createConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.edit/icons/full/obj16/Connection.png")); //$NON-NLS-1$
		entry.setLargeIcon(CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.findImageDescriptor("/CProvML.edit/icons/full/obj16/Connection.png")); //$NON-NLS-1$
		return entry;
	}

}
