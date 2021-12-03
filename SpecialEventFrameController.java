import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SpecialEventFrameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button contestButton;

    @FXML
    private Button councilelectionButton;

    @FXML
    private Button examButton;

    @FXML
    private Button festivalButton;

    @FXML
    private Button membershiptranningButton;

    @FXML
    void OncouncilelectionButton(ActionEvent event) {

    }

    @FXML
    void OnexamButton(ActionEvent event) {

    }

    @FXML
    void OnfestivalButton(ActionEvent event) {

    }

    @FXML
    void OnmembershiptranningButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert contestButton != null : "fx:id=\"contestButton\" was not injected: check your FXML file 'SpecialFrame.fxml'.";
        assert councilelectionButton != null : "fx:id=\"councilelectionButton\" was not injected: check your FXML file 'SpecialFrame.fxml'.";
        assert examButton != null : "fx:id=\"examButton\" was not injected: check your FXML file 'SpecialFrame.fxml'.";
        assert festivalButton != null : "fx:id=\"festivalButton\" was not injected: check your FXML file 'SpecialFrame.fxml'.";
        assert membershiptranningButton != null : "fx:id=\"membershiptranningButton\" was not injected: check your FXML file 'SpecialFrame.fxml'.";

    }

}
