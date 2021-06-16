package ro.sync.beautifier.test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import junit.framework.Assert;
import ro.sync.ui.mvc.Controller;
import ro.sync.ui.mvc.Model;
import ro.sync.ui.mvc.View;

public class DocumentGeneratorTest {

	/**
	   * <p><b>Description:</b> Check generation action and output content</p>
	   * <p><b>Bug ID:</b> XXXX1</p>
	   *
	   * @author bozieac_artur
	   *
	   * @throws Exception
	   */
	@SuppressWarnings("deprecation")
	@Test
	public void controllerGenerateActionTest() throws IOException {
		View userInterface = new View("XML Beautifier");
		Model model = new Model();
		Controller controller = new Controller(model, userInterface);
		File xmlFile = new File("src/test/resources/personal-schema.xml");
		File xslFile = new File("src/test/resources/sampleStylesheetUpgraded.xsl");
		File outputFile = new File("src/test/resources/test.html");
		
		model.setInputFileXML(xmlFile);
		model.setInputFileXSL(xslFile);
		model.setOutputFileHTML(outputFile);
		
		userInterface.getFilePickerOpenXML().setTextFieldContent(xmlFile.getAbsolutePath());
		userInterface.getFilePickerOpenXSL().setTextFieldContent(xslFile.getAbsolutePath());
		userInterface.getFilePickerSave().setTextFieldContent(outputFile.getAbsolutePath());
		
		try {
		controller.generateButtonAction();
		
		assertTrue(outputFile.exists());
		
		// compares create file(output) content with test file content
		Assert.assertEquals(FileUtils.readLines(new File("src/test/resources/expected/expectedOutput.html")), FileUtils.readLines(outputFile));
		}finally {
			outputFile.delete();
		}

	}

}
