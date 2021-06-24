package ro.sync.beautifier;

import ro.sync.ui.mvc.Controller;
import ro.sync.ui.mvc.Model;
import ro.sync.ui.mvc.View;

/**
 * <h1>XML Beautifier</h1> This program implements an
 * application that simply displays UI for a beautifier for XML content
 *
 * @author Bozieac_Artur
 * @version 0.1
 */

public class App {

	/**
	 * Main method, entry point of application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		View userInterface = new View("XML Beautifier");
		Model model = new Model();
		Controller controller = new Controller(model, userInterface);
		controller.initView();
		
	}
}