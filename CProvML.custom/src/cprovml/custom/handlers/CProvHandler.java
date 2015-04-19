package cprovml.custom.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.jface.dialogs.MessageDialog;

import cprovml.custom.transformations.XMLParser;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CProvHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public CProvHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IEditorInput input = editor.getEditorInput();
		IPath path = ((FileEditorInput)input).getPath();
		String cprovmlPath = path.toString().replace(".cprovml_diagram", ".cprovml");
		
		// Validate the CProvML prior to attempting to transform it.
		
		// Load XMI.
		XMIResource resource = new XMIResourceImpl(URI.createFileURI(cprovmlPath));
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MessageDialog.openError(window.getShell(), "CProvML Custom Editor", "Unable to read CProvML at path: " + cprovmlPath);
			return null;
		}
		
		// Get the root ECore object for this particular XML.
		EObject root = resource.getContents().get(0);
		
		// Validate the ECore object.
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);
		
		if(diagnostic.getSeverity() > 0)
		{
			MessageDialog.openError(window.getShell(), "CProvML Custom Editor", "There are validation errors for this CProv Model. Please correct the issues before transforming.");
			return null;
		}
		
		XMLParser.transformCprovml(cprovmlPath);
		
		MessageDialog.openInformation(
				window.getShell(),
				"CProvML Custom Editor",
				"Transformation was successful.");
		
		return null;
	}
}
