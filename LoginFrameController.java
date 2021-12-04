import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginFrameController {
    private Account account= new Account();
    
    private String account_string="";
    private IntroFrameController con;
    private GameData gameData; 
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private URL location;

    @FXML
    private Text Login;

    @FXML
    private Button creatbutton;

    @FXML
    private Label id_text;

    @FXML
    private TextField idtextfield;

    @FXML
    private Button loginbutton;

    @FXML
    private Label pw_text;

    @FXML
    private PasswordField pwfield;

    @FXML
    public void OnLogin(ActionEvent event) throws Exception {
        Stage loginStage=new Stage();
        if(account.checkAccountFile(idtextfield.getText(),pwfield.getText())){
            System.out.println("login succes!");
            Node node =(Node)event.getSource();
            loginStage=(Stage)node.getScene().getWindow();
            this.account_string+=idtextfield.getText()+"#"+pwfield.getText();
            loginStage.close();
            con.closeStage();
            this.gameData=new GameData("./resources/gamedata/"+this.getaccount_string()+".csv");
            gameData.readfile();
        }
        else{
            System.out.println("login failed!");
        }
    }

    @FXML
    void OnCreatAccount(ActionEvent event) throws IOException {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Parent root=FXMLLoader.load(getClass().getResource("CreatAccountFrame.fxml"));
        Scene scene = new Scene(root, 300, 275);
        window.getIcons().add(new Image("file:resources/user.png"));
        window.setScene(scene);
        window.show();
    }

    @FXML
    void initialize() {
        assert Login != null : "fx:id=\"Login\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert creatbutton != null : "fx:id=\"creatbtn\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert id_text != null : "fx:id=\"id_text\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert idtextfield != null : "fx:id=\"idtextfield\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert loginbutton != null : "fx:id=\"loginbtn\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert pw_text != null : "fx:id=\"pw_text\" was not injected: check your FXML file 'LoginFrame.fxml'.";
        assert pwfield != null : "fx:id=\"pwfield\" was not injected: check your FXML file 'LoginFrame.fxml'.";
    }

    public String getaccount_string(){
        return this.account_string;
    }

    public void setaccount_string(String account_string){
        this.account_string= account_string;
    }

    public IntroFrameController getCon() {
        return this.con;
    }

    public void setCon(IntroFrameController con) {
        this.con = con;
    }


}
