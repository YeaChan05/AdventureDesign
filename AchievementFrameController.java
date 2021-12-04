import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.text.Text;

public class AchievementFrameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> achievementTableColumn;

    @FXML
    private Text achievementText;

    @FXML
    private TableColumn<?, ?> contentTableColumn;

    @FXML
    private TableColumn<?, ?> rewardTableColumn;

    @FXML
    void initialize() {
        assert achievementTableColumn != null : "fx:id=\"achievementTableColumn\" was not injected: check your FXML file 'Untitled'.";
        assert achievementText != null : "fx:id=\"achievementText\" was not injected: check your FXML file 'Untitled'.";
        assert contentTableColumn != null : "fx:id=\"contentTableColumn\" was not injected: check your FXML file 'Untitled'.";
        assert rewardTableColumn != null : "fx:id=\"rewardTableColumn\" was not injected: check your FXML file 'Untitled'.";

    }

}
