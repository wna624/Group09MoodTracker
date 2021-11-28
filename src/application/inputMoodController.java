
package application;

//import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class inputMoodController{
    
    @FXML
    private Button homeButton;
    
    @FXML
    private TextField userDateTxt;

    @FXML
    private TextField userHappinessTxt;

    @FXML
    private TextField userMoodTxt;
    
  @
  FXML 
  private Button nextPage; 
  
    
    @FXML
    private Label myLabel;

    @FXML
    private AnchorPane mainPane2;

    @FXML
    void backHome(ActionEvent event) throws IOException { /*This will take the user to previous or home screen*/
    	URL url = new File("src/application/HomeView.fxml").toURI().toURL();
    	mainPane2 = FXMLLoader.load(url);
        Scene scene = new Scene(mainPane2);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    void saveButton(ActionEvent event) throws IOException{
  
    	String inMood = userMoodTxt.getText();
		String inDate = userDateTxt.getText(); 
    	String inHappiness = userHappinessTxt.getText(); 
    	
    	MoodTracker moods = new MoodTracker();
    	moods.addMood(new Mood(inDate, inMood, inHappiness));
    	
    	nextPageView(event);
    	
    	//userMoodTxt.setText(""); // empty the text field for new move 
    	//userHappinessTxt.getText(); 
    	//userDateTxt.setText("");
    }

    @FXML
    void nextPageView(ActionEvent event)throws IOException {
    	//AnchorPane conformation = FXMLLoader.load(getClass().getResource("ConfirmationThanksView.fxml"));
    	//nextPage.getScene().setRoot(conformation);
    	
    	FXMLLoader fxload = new FXMLLoader(getClass().getResource("ConfirmationThanksView.fxml"));
    	AnchorPane mainPane = fxload.load();
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(mainPane);
    	window.setScene(scene);
    	window.show();
    }
}