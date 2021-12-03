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

public class CreatAccountFrameController {
    private Account account=new Account();
    private GameData gd;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button creatbtn;

    @FXML
    private Text creataccount;

    @FXML
    private Label id_text;

    @FXML
    private TextField idfield;

    @FXML
    private Label pw_text;

    @FXML
    private PasswordField pwfield;

    @FXML
    void OnCreat(ActionEvent event) throws IOException {
        if(account.checkAccountFile(idfield.getText(), pwfield.getText())){
            System.out.println("alredy exist");
        }
        else {
            account.creatAccount(idfield.getText(), pwfield.getText());
            System.out.println("successfully creat");
        }         
    }

    @FXML
    void initialize() {
        assert creatbtn != null : "fx:id=\"creatbtn\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert creataccount != null : "fx:id=\"creataccount\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert id_text != null : "fx:id=\"id_text\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert idfield != null : "fx:id=\"idfield\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert pw_text != null : "fx:id=\"pw_text\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert pwfield != null : "fx:id=\"pwfield\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
    }

}
