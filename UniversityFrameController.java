import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class UniversityFrameController {
	private Stage window;
    private Stage primeStage=new Stage();
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clubactivitiesButton;

    @FXML
    private Button culturelecture1Button;

    @FXML
    private Button culturelecture2Button;

    @FXML
    private Button hiddeneventButton;

    @FXML
    private CheckBox hiddeneventCheckBox;

    @FXML
    private Label lecutreLabel;

    @FXML
    private ListView<?> lecutreListView;

    @FXML
    private Button majorlecture1Button;

    @FXML
    private Button majorlecture2Button;

    @FXML
    private Button majorlecture3Button;

    @FXML
    private Button majorlecture4Button;

    @FXML
    private ImageView returnIamgeView;

    @FXML
    private Button specialButton;

    @FXML
    private CheckBox specialeventCheckBox;

    @FXML
    private Button studyButton;

    @FXML
    private TextField universityTextField;

    @FXML
    void initialize() {
        assert clubactivitiesButton != null : "fx:id=\"clubactivitiesButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert culturelecture1Button != null : "fx:id=\"culturelecture1Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert culturelecture2Button != null : "fx:id=\"culturelecture2Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert hiddeneventButton != null : "fx:id=\"hiddeneventButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert hiddeneventCheckBox != null : "fx:id=\"hiddeneventCheckBox\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert lecutreLabel != null : "fx:id=\"lecutreLabel\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert lecutreListView != null : "fx:id=\"lecutreListView\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture1Button != null : "fx:id=\"majorlecture1Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture2Button != null : "fx:id=\"majorlecture2Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture3Button != null : "fx:id=\"majorlecture3Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture4Button != null : "fx:id=\"majorlecture4Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert returnIamgeView != null : "fx:id=\"returnIamgeView\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert specialButton != null : "fx:id=\"specialButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert specialeventCheckBox != null : "fx:id=\"specialeventCheckBox\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert studyButton != null : "fx:id=\"studyButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert universityTextField != null : "fx:id=\"universityTextField\" was not injected: check your FXML file 'UniversityFrame.fxml'.";

    }
    
    
    
    public static void Launch() {
        Launch();
    }

}
