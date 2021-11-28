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
    private Button loadBtn;
    
    @FXML
    private Button homeBtn;

    @FXML
    void refresh(ActionEvent event) throws FileNotFoundException {
    	MoodTracker moods = new MoodTracker();
    	moodTxt.setText(moods.getMoods());
    }
    
    @FXML
    void home() throws IOException {
    	AnchorPane home = FXMLLoader.load(getClass().getResource("HomeView.fxml"));
        homeBtn.getScene().setRoot(home);
    }

}
