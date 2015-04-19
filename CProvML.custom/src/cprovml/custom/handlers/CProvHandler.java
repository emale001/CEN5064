package cprovml.custom.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
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
		
		// Before we attempt to 
		
		XMLParser.transformCprovml(cprovmlPath);
		
		// Menu Manager stuff.
//		MenuManager editMenu = bars.getMenuManager().findMenuUsingPath(
//		IWorkbenchActionConstants.M_EDIT);
		
		
		// Get action bars.
		@SuppressWarnings("restriction")
		IActionBars bars = ((WorkbenchPage)page).getActionBars();
		IMenuManager editMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_EDIT);
		
		IContributionItem validation = editMenu.find("validationGroup");
		
//		IAction validateAction = new CProvML.diagram.part.ValidateAction(page);
		
		// Load XMI.
		XMIResource resource = new XMIResourceImpl(URI.createFileURI(cprovmlPath));
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MessageDialog.openInformation(
				window.getShell(),
				"CProvML Custom Editor",
				"CProvML Path to be transformed:" + cprovmlPath);
		
		return null;
	}
}
