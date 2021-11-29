
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameFrameController extends Application implements EventHandler<ActionEvent>{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }
    
    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void start(Stage gameStage) throws Exception {
        Parent root =FXMLLoader.load(getClass().getResource("GameFrame.fxml"));
        gameStage.setScene(new Scene(root));
        gameStage.show();
        
    }
    public static void Launch() {
        launch();
    }
}
