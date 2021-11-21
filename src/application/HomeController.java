package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController {
	@FXML
    void go(ActionEvent event) throws IOException {
		FXMLLoader fxload = new FXMLLoader(getClass().getResource("MoodLogView.fxml"));
    	AnchorPane mainPane = fxload.load();
    	//MoodLogController logview = fxload.getController();
    	//logview.load();
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(mainPane);
    	window.setScene(scene);
    	window.show();
    }
}