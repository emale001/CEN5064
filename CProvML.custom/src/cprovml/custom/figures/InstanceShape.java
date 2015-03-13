package cprovml.custom.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class InstanceShape extends Figure {

	public InstanceShape() {
		GridLayout layout = new GridLayout(2, false);
		super.setLayoutManager(layout);
		add(new ImageFigure(getShipImage()), new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false, 1, 2));
	}

	@Override
	public void setLayoutManager(LayoutManager manager) {
	}

	@Override
	public void add(IFigure figure, Object constraint, int index) {
		if (figure instanceof ShapeCompartmentFigure) {
			constraint = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
			figure.setBorder(new LineBorder());
		} else if (figure instanceof ResizableCompartmentFigure) {
			constraint = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1);
		}
		super.add(figure, constraint, index);
	}

	protected Image getShipImage() {
		return getImageImage("images/Instance.png"); //$NON-NLS-1$
	}

	protected Image getImageImage(String path) {
		Image image = JFaceResources.getImageRegistry().get(path);
		if (image == null) {
			ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin("CProvML.custom", path); //$NON-NLS-1$
			if (descriptor == null) {
				descriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			JFaceResources.getImageRegistry().put(path, image = descriptor.createImage());
		}
		return image;
	}
	
}
