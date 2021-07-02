package ro.sync.ui.mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import ro.sync.ui.components.JFilePicker;

/**
 * <h1>View</h1> Part of MVC Pattern, UI of application
 * 
 * @author Bozieac_Artur
 * @version 0.1
 */
public class View extends JFrame {
	
	private static final int WINDOW_WIDTH = 750;
	private static final int WINDOW_HEIGHT = 350;
	
	private static final long serialVersionUID = 1L;
	private static final String BROWSE_BUTTON_LABEL = "Browse...";
	
	private String windowTitle;
	private JFilePicker filePickerOpenXML;
	private JFilePicker filePickerOpenXSL;
	private JFilePicker filePickerSave;
	private JPanel panel;
	private JButton generateButton = new JButton("Generate");
	private JButton cancelButton = new JButton("Cancel");

	/**
	 * Constructor for View, sets windows size and title
	 * 
	 * @param width  Windows width
	 * @param height Window height
	 * @param title  Windows title
	 */
	public View(String title) {
		this.windowTitle = title;

	}

	/**
	 * This method is used to display JFrame Components.
	 */
	void displayJFrame() {
		// Frame setup stuff
		
		// Set window title
		this.setTitle(windowTitle);
		// Default action on close operation
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// Window size
		this.setMinimumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		// Setting relative location to NULL to display window in center
		this.setLocationRelativeTo(null);
		// Window cannot be resized
		this.setResizable(false);
		// MUST Set window visible
		this.setVisible(true);

		// all the frame components (used JPanel as a container for all the elements)
		panel = new JPanel(new GridBagLayout());
		setUpPanel();
		// Adding panel to the frame
		this.getContentPane().add(panel, BorderLayout.CENTER);

	}

	private void setUpPanel() {
		panel.setBorder(BorderFactory.createMatteBorder(1, 0,0, 0, Color.BLACK));

		JLabel titleLabel = new JLabel(windowTitle);
		
		// Creating first instance of filePicker, set to open mode with filter on JSON files
		filePickerOpenXML = new JFilePicker("XML File Path:", BROWSE_BUTTON_LABEL);
		filePickerOpenXML.setMode(JFilePicker.MODE_OPEN);
		filePickerOpenXML.addFileTypeFilter(".xml", "XML Files");
		
		filePickerOpenXSL = new JFilePicker("XSL File Path:", BROWSE_BUTTON_LABEL);
		filePickerOpenXSL.setMode(JFilePicker.MODE_OPEN);
		filePickerOpenXSL.addFileTypeFilter(".xsl", "XSL Files");

		// Creating second instance of filePicker, set to save mode with filter on JSON
		// files

		filePickerSave = new JFilePicker("Output Path:  ", BROWSE_BUTTON_LABEL);
		filePickerSave.setMode(JFilePicker.MODE_SAVE);

		// add the components to the frame

		
		titleLabel.setOpaque(true);
		titleLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		titleLabel.setForeground(Color.BLACK);
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.fill = GridBagConstraints.CENTER;
		constraints.gridy = 0;
		constraints.weighty = 1;
		constraints.weightx = 1;
		
		panel.add(titleLabel, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridy++;
		panel.add(filePickerOpenXML, constraints);
		
		constraints.gridy++;
		panel.add(filePickerOpenXSL, constraints);

		constraints.gridy++;
		panel.add(filePickerSave, constraints);

		// "Generate" button style and action

		constraints.gridy++;
		generateButton.setPreferredSize(new Dimension(100, 30));
		generateButton.setForeground(Color.BLACK);
		generateButton.setFocusPainted(false);
		generateButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

		// "Cancel" button style 
		cancelButton.setPreferredSize(new Dimension(100, 30));
		cancelButton.setForeground(Color.BLACK);
		cancelButton.setFocusPainted(false);
		cancelButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);
		flowLayout.setAlignOnBaseline(true);
		
		JPanel buttonsPanel = new JPanel(flowLayout);
		buttonsPanel.add(generateButton, BorderLayout.EAST);
		buttonsPanel.add(cancelButton, BorderLayout.CENTER);
		
		panel.add(buttonsPanel, constraints);
	}
	
	/**
	 * @param filePickerOpenXML the filePickerOpenXML to set
	 */
	public void setFilePickerOpenXML(JFilePicker filePickerOpenXML) {
		this.filePickerOpenXML = filePickerOpenXML;
	}

	/**
	 * @param filePickerOpenXSL the filePickerOpenXSL to set
	 */
	public void setFilePickerOpenXSL(JFilePicker filePickerOpenXSL) {
		this.filePickerOpenXSL = filePickerOpenXSL;
	}

	/**
	 * @param filePickerSave the filePickerSave to set
	 */
	public void setFilePickerSave(JFilePicker filePickerSave) {
		this.filePickerSave = filePickerSave;
	}
	
	/**
	 * @param filePickerOpenXML instance
	 */
	public JFilePicker getFilePickerOpenXML() {
		return filePickerOpenXML;
	}

	/**
	 * @return filePickerSave instance
	 */
	public JFilePicker getFilePickerSave() {
		return filePickerSave;
	}

	/**
	 * @param generateButton instance
	 */
	public JButton getGenerateButton() {
		return generateButton;
	}

	/**
	 * @param cancelButton instance
	 */
	public JButton getCancelButton() {
		return cancelButton;
	}

	/**
	 * @param filePickerSave the filePickerSave to set
	 */
	public JFilePicker getFilePickerOpenXSL() {
		return filePickerOpenXSL;
	}

}