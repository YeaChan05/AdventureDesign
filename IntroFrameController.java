import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class IntroFrameController extends Application implements EventHandler<ActionEvent>{
    private Stage window;
    private String account_string;
    LoginFrameController con;
   
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private ImageView introimage;

    @FXML
    private Button loginbutton;
    
    @FXML
    void initialize() {
        assert anchorpane != null : "fx:id=\"anchorpane\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert introimage != null : "fx:id=\"introimage\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert loginbutton != null : "fx:id=\"loginbtn\" was not injected: check your FXML file 'IntroFrame.fxml'.";
    }
    @FXML
    public void Login() throws IOException{
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        //Parent root=FXMLLoader.load(getClass().getResource("LoginFrame.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginFrame.fxml"));
        Parent parent = loader.load();
        con=loader.getController();
        con.setCon(this);
        Scene scene = new Scene(parent, 300, 275);
        window.getIcons().add(new Image("file:resources/user.png"));
        window.setScene(scene);
        window.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("IntroFrame.fxml"));
        stage.getIcons().add(new Image("file:resources/user.png"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() throws Exception {
        ////////////////////////////////////////write부분
        super.stop();
    }
    public static void Launch() {
        launch();
    }
    public void closeStage() {
		Stage stage = (Stage)anchorpane.getScene().getWindow();
		Platform.runLater(() -> {
            stage.close();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("GameFrame.fxml"))));
                stage.getIcons().add(new Image("file:resources/user.png"));
                stage.show();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		});
	}

    
}
