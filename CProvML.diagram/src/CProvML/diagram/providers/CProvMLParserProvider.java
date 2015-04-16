package CProvML.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CProvMLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser securityGroupName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSecurityGroupName_5003Parser() {
		if (securityGroupName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CProvML.CProvMLPackage.eINSTANCE
					.getNode_Name() };
			CProvML.diagram.parsers.MessageFormatParser parser = new CProvML.diagram.parsers.MessageFormatParser(
					features);
			securityGroupName_5003Parser = parser;
		}
		return securityGroupName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser environmentName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEnvironmentName_5004Parser() {
		if (environmentName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CProvML.CProvMLPackage.eINSTANCE
					.getNode_Name() };
			CProvML.diagram.parsers.MessageFormatParser parser = new CProvML.diagram.parsers.MessageFormatParser(
					features);
			environmentName_5004Parser = parser;
		}
		return environmentName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceName_5005Parser() {
		if (instanceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CProvML.CProvMLPackage.eINSTANCE
					.getNode_Name() };
			CProvML.diagram.parsers.MessageFormatParser parser = new CProvML.diagram.parsers.MessageFormatParser(
					features);
			instanceName_5005Parser = parser;
		}
		return instanceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser storageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStorageName_5001Parser() {
		if (storageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CProvML.CProvMLPackage.eINSTANCE
					.getNode_Name() };
			CProvML.diagram.parsers.MessageFormatParser parser = new CProvML.diagram.parsers.MessageFormatParser(
					features);
			storageName_5001Parser = parser;
		}
		return storageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser networkName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNetworkName_5002Parser() {
		if (networkName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CProvML.CProvMLPackage.eINSTANCE
					.getNode_Name() };
			CProvML.diagram.parsers.MessageFormatParser parser = new CProvML.diagram.parsers.MessageFormatParser(
					features);
			networkName_5002Parser = parser;
		}
		return networkName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CProvML.diagram.edit.parts.SecurityGroupNameEditPart.VISUAL_ID:
			return getSecurityGroupName_5003Parser();
		case CProvML.diagram.edit.parts.InstanceNameEditPart.VISUAL_ID:
			return getInstanceName_5005Parser();
		case CProvML.diagram.edit.parts.StorageNameEditPart.VISUAL_ID:
			return getStorageName_5001Parser();
		case CProvML.diagram.edit.parts.NetworkNameEditPart.VISUAL_ID:
			return getNetworkName_5002Parser();
		case CProvML.diagram.edit.parts.EnvironmentNameEditPart.VISUAL_ID:
			return getEnvironmentName_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CProvML.diagram.part.CProvMLVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CProvML.diagram.providers.CProvMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
