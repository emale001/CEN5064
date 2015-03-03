package CProvML.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		CProvML.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		CProvML.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		CProvML.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		CProvML.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		CProvML.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
