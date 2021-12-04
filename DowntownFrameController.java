import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DowntownFrameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button FitnessCenterButton;

    @FXML
    private Button ParttimeJobButton;

    @FXML
    private Button Storebutton;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private Text downtownText;

    @FXML
    void OnFitnessCenterButton(ActionEvent event) {

    }

    @FXML
    void OnParttimeJobButton(ActionEvent event) {

    }

    @FXML
    void OnStorebutton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert FitnessCenterButton != null : "fx:id=\"FitnessCenterButton\" was not injected: check your FXML file 'DowntownFrame.fxml'.";
        assert ParttimeJobButton != null : "fx:id=\"ParttimeJobButton\" was not injected: check your FXML file 'DowntownFrame.fxml'.";
        assert Storebutton != null : "fx:id=\"Storebutton\" was not injected: check your FXML file 'DowntownFrame.fxml'.";
        assert anchorpane != null : "fx:id=\"anchorpane\" was not injected: check your FXML file 'DowntownFrame.fxml'.";
        assert downtownText != null : "fx:id=\"downtownText\" was not injected: check your FXML file 'DowntownFrame.fxml'.";

    }

}
