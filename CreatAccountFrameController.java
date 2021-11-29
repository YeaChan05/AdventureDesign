import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CreatAccountFrameController {
    private Account account=new Account();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button creatbtn;

    @FXML
    private Text crreatccount;

    @FXML
    private Label id_text;

    @FXML
    private TextField idtextfield;

    @FXML
    private Label pw_text;

    @FXML
    private PasswordField pwfield;

    @FXML
    void OnCreat(ActionEvent event) throws IOException {
        if(account.checkAccountFile(idtextfield.getText(), pwfield.getText())){
            System.out.println("alredy exist");
        }
        else {
            account.creatAccount(idtextfield.getText(), pwfield.getText());
            System.out.println("successfully creat");
        }
            
            
    }

    @FXML
    void initialize() {
        assert creatbtn != null : "fx:id=\"creatbtn\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert crreatccount != null : "fx:id=\"crreatccount\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert id_text != null : "fx:id=\"id_text\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert idtextfield != null : "fx:id=\"idtextfield\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert pw_text != null : "fx:id=\"pw_text\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";
        assert pwfield != null : "fx:id=\"pwfield\" was not injected: check your FXML file 'CreatAccountFrame.fxml'.";

    }

}
