package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class MoodLogController {
	@FXML
    private TextArea moodTxt;
    
    @FXML
    private Button homeBtn;
    
    @FXML
    void home() throws IOException {
    	AnchorPane home = FXMLLoader.load(getClass().getResource("HomeView.fxml"));
        homeBtn.getScene().setRoot(home);
    }
    
    @FXML
    void initialize() throws FileNotFoundException {
    	MoodTracker moods = new MoodTracker();
    	moodTxt.setText(moods.getMoods());
    }

}
