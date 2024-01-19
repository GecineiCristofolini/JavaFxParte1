package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import util.Alerts;

public class ViewController {

	@FXML
	private Button btMyButton;
	
	@FXML
	public void onMyButtonClick() {
		Alerts.showAlert("Informações do Alert", null, "Ola Amigo", AlertType.ERROR);
	}
}