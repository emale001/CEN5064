package CProvML.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CProvMLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CProvML.diagram.navigator.CProvMLNavigatorItem) {
			CProvML.diagram.navigator.CProvMLNavigatorItem item = (CProvML.diagram.navigator.CProvMLNavigatorItem) element;
			return CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
