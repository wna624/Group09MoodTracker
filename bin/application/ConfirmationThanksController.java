package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ConfirmationThanksController {
	
	@FXML
	private Button goHomeBtn;
	
	@FXML
	private Button logMoodBtn;
	
	
	void logMood(ActionEvent event) throws IOException {
		AnchorPane logMood = FXMLLoader.load(getClass().getResource("InputMood.fxml"));
		logMoodBtn.getScene().setRoot(logMood);
	}
	
	
	void gohome(ActionEvent event) throws IOException{
		AnchorPane goHome = FXMLLoader.load(getClass().getResource("HomeView.fxml"));
		goHomeBtn.getScene().setRoot(goHome);
	}
}
