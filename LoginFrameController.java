import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginFrameController {
    private Account account= new Account();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text Login;

    @FXML
    private Button creatbtn;

    @FXML
    private Label id_text;

    @FXML
    private TextField idtextfield;

    @FXML
    private Button loginbtn;

    @FXML
    private Label pw_text;

    @FXML
    private PasswordField pwfield;

    @FXML
    void OnLogin(ActionEvent event) throws IOException {
        if(account.checkAccountFile(idtextfield.getText(),pwfield.getText())){
            System.out.println("yes");
        }
        else{
            
        }
    }
    

    @FXML
    void OnCreatAccount(ActionEvent event) {
        
    }

    @FXML
    void initialize() {
        assert Login != null : "fx:id=\"Login\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert creatbtn != null : "fx:id=\"creatbtn\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert id_text != null : "fx:id=\"id_text\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert idtextfield != null : "fx:id=\"idtextfield\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert loginbtn != null : "fx:id=\"loginbtn\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert pw_text != null : "fx:id=\"pw_text\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert pwfield != null : "fx:id=\"pwfield\" was not injected: check your FXML file 'LoginFrame.fxml'.";

    }

}
