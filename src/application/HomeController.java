package application;

import java.io.IOException;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomeController {
	
    @FXML
    private Button moodLog;

    @FXML
    private Button trackMood;
    
    @FXML
    private ImageView happySun;
	
	@FXML
    public void goToMoodLog(ActionEvent event) throws IOException {
		FXMLLoader fxload = new FXMLLoader(getClass().getResource("MoodLogView.fxml"));
    	AnchorPane mainPane = fxload.load();
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(mainPane);
    	window.setScene(scene);
    	window.show();
	}

    @FXML
    public void goToInputMood(ActionEvent event) throws IOException {
    	FXMLLoader fxload = new FXMLLoader(getClass().getResource("inputMood.fxml"));
    	AnchorPane mainPane = fxload.load();
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(mainPane);
    	window.setScene(scene);
    	window.show();
    }
    
    @FXML
    public void initialize() {
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(20);
        rotate.setFromAngle(-10);
        rotate.setToAngle(10);
        rotate.setCycleCount(100);
        rotate.setDuration(Duration.seconds(3));
        rotate.setAutoReverse(true);
        rotate.setNode(happySun);
        rotate.play();

    	
    }
}




