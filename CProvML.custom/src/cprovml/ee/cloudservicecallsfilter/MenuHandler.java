package cprovml.ee.cloudservicecallsfilter;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

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

import cprovml.ee.PipelineFacade;
import cprovml.ee.xcprovmlfilter.XCProvMLFilter;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class MenuHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public MenuHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            
            String directory = file.getParent();
            
            // Transform CProvML to API calls.
    		String callsFileName = file.getName().split("\\.(?=[^\\.]+$)")[0] + ".txt";
    		String callsOutputName = new File(directory, callsFileName).getAbsolutePath();
    	
    		PipelineFacade.getInstance().transformXCProvToCloudCalls(file.getAbsolutePath(), callsOutputName);
    		
    		MessageDialog.openInformation(
    				window.getShell(),
    				"CProvML Custom Editor",
    				"Transformation was successful.");
        }
		
		return null;
	}
}
