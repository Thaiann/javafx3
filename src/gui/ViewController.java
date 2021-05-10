package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btText;
	
	@FXML
	private void onBtTextAction(){
		System.out.println("Click");
		
		Alerts.showAlert("Alert titlle", null, "Hello", AlertType.ERROR);
	}
}
