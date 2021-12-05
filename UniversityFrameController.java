import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class UniversityFrameController {
    private GameFrameController gameFrameController=new GameFrameController();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private ToggleButton clubactivitiesButton;

    @FXML
    private ToggleButton culturelecture1Button;

    @FXML
    private ToggleButton culturelecture2Button;

    @FXML
    private ToggleButton hiddeneventButton;

    @FXML
    private ToggleButton majorlecture1Button;

    @FXML
    private ToggleButton majorlecture2Button;

    @FXML
    private ToggleButton majorlecture3Button;

    @FXML
    private ToggleButton majorlecture4Button;

    @FXML
    private ToggleButton specialeventButton;

    @FXML
    private Button studyButton;

    @FXML
    private Text universityText;

    @FXML
    void OnclubactivitiesButton(ActionEvent event) {

    }

    @FXML
    void Onculturelecture1Button(ActionEvent event) {
        
        if(culturelecture1Button.isSelected()){
            gameFrameController.adjHealth(-1);
        }
        else{
            gameFrameController.adjHealth(1);
        }
        System.out.println(gameFrameController.getCon().getCharacter().getHealth());
    }

    @FXML
    void Onculturelecture2Button(ActionEvent event) {
        if(culturelecture1Button.isSelected()){
            gameFrameController.adjHealth(-1);
        }
        else{
            gameFrameController.adjHealth(1);
        }
        System.out.println(gameFrameController.getCon().getCharacter().getHealth());
    }

    @FXML
    void OnhiddeneventButton(ActionEvent event) {
        
    }

    @FXML
    void Onmajorlecture1Button(ActionEvent event) {
        if(majorlecture1Button.isSelected()){
            gameFrameController.adjHealth(-1);
        }
        else{
            gameFrameController.adjHealth(1);
        }
        System.out.println(gameFrameController.getCon().getCharacter().getHealth());
    }

    @FXML
    void Onmajorlecture2Button(ActionEvent event) {
        if(majorlecture1Button.isSelected()){
            gameFrameController.adjHealth(-1);
        }
        else{
            gameFrameController.adjHealth(1);
        }
        System.out.println(gameFrameController.getCon().getCharacter().getHealth());
    }

    @FXML
    void Onmajorlecture3Button(ActionEvent event) {
        if(majorlecture1Button.isSelected()){
            gameFrameController.adjHealth(-1);
        }
        else{
            gameFrameController.adjHealth(1);
        }
        System.out.println(gameFrameController.getCon().getCharacter().getHealth());
    }

    @FXML
    void Onmajorlecture4Button(ActionEvent event) {
        if(majorlecture1Button.isSelected()){
            gameFrameController.adjHealth(-1);
        }
        else{
            gameFrameController.adjHealth(1);
        }
        System.out.println(gameFrameController.getCon().getCharacter().getHealth());
    }

    @FXML
    void OnspecialeventButton(ActionEvent event) {

    }

    @FXML
    void OnstudyButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert anchorpane != null : "fx:id=\"anchorpane\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert clubactivitiesButton != null : "fx:id=\"clubactivitiesButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert culturelecture1Button != null : "fx:id=\"culturelecture1Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert culturelecture2Button != null : "fx:id=\"culturelecture2Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert hiddeneventButton != null : "fx:id=\"hiddeneventButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture1Button != null : "fx:id=\"majorlecture1Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture2Button != null : "fx:id=\"majorlecture2Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture3Button != null : "fx:id=\"majorlecture3Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture4Button != null : "fx:id=\"majorlecture4Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert specialeventButton != null : "fx:id=\"specialeventButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert studyButton != null : "fx:id=\"studyButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert universityText != null : "fx:id=\"universityText\" was not injected: check your FXML file 'UniversityFrame.fxml'.";

    }

    public void setController(GameFrameController gameFrameController){
        this.gameFrameController = gameFrameController;
    }

    public GameFrameController getGameFrameController(){
        return this.gameFrameController;
    }

    public GameFrameController getController(){
        return this.gameFrameController;
    }
}
