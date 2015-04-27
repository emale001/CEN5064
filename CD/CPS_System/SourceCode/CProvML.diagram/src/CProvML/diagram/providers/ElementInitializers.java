package CProvML.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CProvML.diagram.part.CProvMLDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
