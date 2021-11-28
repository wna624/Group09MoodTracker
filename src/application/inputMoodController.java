
package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
    
    @FXML TextField userMoodTxt;
    
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
    	String feeling = userMoodTxt.getText();
    	FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
    	//root = loader.load();
    	File file = new File("UserInput/Usermood.txt"); // searches the file and makes it the object 
    	FileWriter fr = new FileWriter(file, true);  // opens the writer to write the data 
    	BufferedWriter br = new BufferedWriter(fr); // pointer to the file writer 
    	br.write(feeling); // writes the data 
    	br.write("\n");
    	userMoodTxt.setText(""); // empty the text field for new move 

    	br.close();
    	fr.close();
    	
    }
 
}