package ro.sync.ui.mvc;

import java.io.File;


/**
 * <h1>Model</h1> Part of MVC pattern
 * 
 * @author Bozieac_Artur
 * @version 0.1
 */
public class Model {
	/*
	 * File instance for input XML file
	 */
	private File inputFileXML;
	/*
	 * File instance for input XSL file
	 */
	private File inputFileXSL;
	/*
	 * File instance for output file
	 */
	private File outputFileHTML;


	public File getInputFileXSL() {
		return inputFileXSL;
	}

	public void setInputFileXSL(File inputFileXSL) {
		this.inputFileXSL = inputFileXSL;
	}

	public File getOutputFileHTML() {
		return outputFileHTML;
	}

	public void setOutputFileHTML(File outputFileHTML) {
		this.outputFileHTML = outputFileHTML;
	}

	public File getInputFileXML() {
		return inputFileXML;
	}

	public void setInputFileXML(File inputFileXML) {
		this.inputFileXML = inputFileXML;
	}

}