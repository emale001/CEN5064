package CProvML.diagram.part;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class CProvMLNewDiagramFileWizard extends Wizard {

	/**
	 * @generated
	 */
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated
	 */
	private CProvML.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	public CProvMLNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(
				CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage
				.setTitle(CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage
				.setDescription(NLS
						.bind(CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_CreationPageDescription,
								CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension()
				.lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1)
					.toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException(
					"Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage
				.setFileName(CProvML.diagram.part.CProvMLDiagramEditorUtil
						.getUniqueFileName(filePath, fileName,
								"cprovml_diagram")); //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage
				.setTitle(CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage
				.setDescription(CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		CProvML.diagram.part.CProvMLDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain,
				CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = CProvML.diagram.part.CProvMLVisualIDRegistry
						.getDiagramVisualID(diagramRootElementSelectionPage
								.getModelElement());
				if (diagramVID != CProvML.diagram.edit.parts.NodesDiagramEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService
						.createDiagram(
								diagramRootElementSelectionPage
										.getModelElement(),
								CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID,
								CProvML.diagram.part.CProvMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			diagramResource.save(CProvML.diagram.part.CProvMLDiagramEditorUtil
					.getSaveOptions());
			CProvML.diagram.part.CProvMLDiagramEditorUtil
					.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin
					.getInstance()
					.logError(
							"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			CProvML.diagram.part.CProvMLDiagramEditorPlugin.getInstance()
					.logError("Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * @generated
	 */
	private static class DiagramRootElementSelectionPage extends
			CProvML.diagram.part.ModelElementSelectionPage {

		/**
		 * @generated
		 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		 * @generated
		 */
		protected String getSelectionTitle() {
			return CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		 * @generated
		 */
		protected boolean validatePage() {
			if (getModelElement() == null) {
				setErrorMessage(CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = ViewService
					.getInstance()
					.provides(
							new CreateDiagramViewOperation(
									new EObjectAdapter(getModelElement()),
									CProvML.diagram.edit.parts.NodesDiagramEditPart.MODEL_ID,
									CProvML.diagram.part.CProvMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: CProvML.diagram.part.Messages.CProvMLNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
