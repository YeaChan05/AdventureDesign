import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class App extends Application implements EventHandler<ActionEvent> {
    static Stage window;
    static Scene scene1;
    static Scene scene2;

    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
       //Parent root =FXMLLoader.load(getClass().getResource("MainFrame.fxml"));
       window = stage;
       window.setWidth(1500);
       window.setHeight(800);
       window.setX(200);
       window.setY(50);
      
       Label label1 = new Label("Welcome to the first scene!");
       Label label2 = new Label("this is a second scene!");

       Button button_login = new Button("Login");
       button_login.setOnAction(e->Login());

       VBox layout_gamestart = new VBox(100);
       layout_gamestart.getChildren().addAll(label1,button_login);
       scene1 = new Scene(layout_gamestart);
       layout_gamestart.setAlignment(Pos.CENTER);

    //    Button button2 = new Button("Fuck out to the scene1");
    //    button2.setOnAction(e->display("응애","this is a test"));

    //    StackPane layout2 = new StackPane();
    //    layout2.getChildren().addAll(label2,button2);
    //    scene2 = new Scene(layout2);
    //    layout2.setAlignment(Pos.CENTER);

       window.setScene(scene1);
       stage.setTitle("공대생 키우기");
       stage.show();
    }

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();
    }
    
    public static void display(String title, String message){
        window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.initStyle(StageStyle.TRANSPARENT);
        

        Label label=new Label();
        label.setText(message);
        Button closeButton =new Button("Close the window");
        closeButton.setOnAction(e->window.close());
        
        StackPane layout = new StackPane();
        layout.getChildren().add(closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,1500,1000);
        window.setScene(scene);
        window.showAndWait();
    }

    public static void Login(){
        window = new Stage();
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 300, 275);

        Text scenetitle = new Text("Welcome"); 
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:"); 
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField(); 
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:"); 
        grid.add(pw, 0,2);

        PasswordField pwBox = new PasswordField(); 
        grid.add(pwBox, 1, 2);

        Button loginAccount = new Button("Login");
        grid.add(loginAccount,1,3);

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        window.setScene(scene);
        window.show();

    }

    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    
    public static void Launch() {
        launch();
    }
}