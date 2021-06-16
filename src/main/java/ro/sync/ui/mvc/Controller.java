package ro.sync.ui.mvc;

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;
import ro.sync.ui.components.JFilePicker;

/**
 * <h1>Controller</h1> Part of MVC Pattern, logic part of application
 * 
 * @author Bozieac_Artur
 * @version 0.1
 */
public class Controller {

	private View view;
	private Model model;

	/**
	 * Constructor for Controller
	 * 
	 * @param model Data part
	 * @param view  User Interface
	 */
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		try {
			initView();
		} catch (InvocationTargetException | InterruptedException e) { // NOSONAR Do not re-throw exception
			e.printStackTrace();
		}
	}

	/**
	 * Initializes UI and sets System Look and Feel
	 * 
	 * @throws InterruptedException
	 * @throws InvocationTargetException
	 * 
	 */
	private void initView() throws InvocationTargetException, InterruptedException {
		try {
			// Set System L&F to my system L&F (a better style than default)
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// Schedule this for the event dispatch thread
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					view.displayJFrame();
				}
			});
		} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// Will not happen
		} 
	}

	/**
	 * Initializes Controller and addes action listeners
	 */
	public void initController() {
		view.getGenerateButton().addActionListener(e -> generateButtonAction());
		view.getCancelButton().addActionListener(e -> view.dispose());
	}

	/**
	 *  Action which happens when "Generate" button is clicked
	 */
	public void generateButtonAction() {
		// creates 2 file instances for selected paths
		model.setInputFileXML(new File(view.getFilePickerOpenXML().getSelectedFilePath()));
		model.setInputFileXSL(new File(view.getFilePickerOpenXSL().getSelectedFilePath()));
		model.setOutputFileHTML(new File(view.getFilePickerSave().getSelectedFilePath()));

		// verifies if file exists at selected path and if it is a xml file
		if (!model.getInputFileXML().exists() && !model.getInputFileXML().getPath().contains(".xml")) {
			showMessageDialog(null, "Invalid XML File Path");
			return;
		}else if(!model.getInputFileXSL().exists() && !model.getInputFileXSL().getPath().contains(".xsl")){
			showMessageDialog(null, "Invalid XSL File Path");
			return;
		}

		if (model.getOutputFileHTML().exists() && view.getFilePickerSave().getMode() == JFilePicker.MODE_SAVE) {
			int result = JOptionPane.showConfirmDialog(view, "The file exists, overwrite?", "Existing file",
					JOptionPane.YES_NO_CANCEL_OPTION);
			switch (result) {
			case JOptionPane.YES_OPTION:
				try {
					generateHTMLFiles(model.getInputFileXML(), model.getInputFileXSL());
				} catch (IOException | TransformerException e) {
					e.printStackTrace();
				}
				return;
			case JOptionPane.NO_OPTION:
				return;
			case JOptionPane.CLOSED_OPTION:
				return;
			case JOptionPane.CANCEL_OPTION:
				return;
			default:
				return;
			}
		} else {
			// Creates file if there is no need to overwrite
			// Call useSelectedFormat method to create file of selected format
			try {
				generateHTMLFiles(model.getInputFileXML(), model.getInputFileXSL());
			} catch (IOException | TransformerException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generates the HTML documentation files.
	 * 
	 * @param xmlFile The xml file.
	 * @param xslFile Stylesheet file.
	 * @throws IOException
	 * @throws TransformerException
	 */
	public void generateHTMLFiles(File xmlFile, File xslFile) throws IOException, TransformerException {
		Source xmlSource = new StreamSource(new FileInputStream(xmlFile));
		Source xslSource = new StreamSource(new FileInputStream(xslFile));

		Transformer transformer = new TransformerFactoryImpl().newTransformer(xslSource);
		StreamResult sr = new StreamResult(model.getOutputFileHTML());
		transformer.transform(xmlSource, sr);
		
		Desktop.getDesktop().browse(model.getOutputFileHTML().toURI());
	}
}
