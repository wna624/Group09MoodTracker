package application;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

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

}
