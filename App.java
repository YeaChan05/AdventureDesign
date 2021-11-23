import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
public class App extends Application implements EventHandler<ActionEvent> {
    Stage window;
    Scene scene1, scene2;
    @Override
    public void start(Stage stage) {
       window = stage;
       Label label1 = new Label("Welcome to the first scene!");
       Button button1 = new Button("Go to scene2");
       button1.setOnAction(e->window.setScene(scene2));

       StackPane layout1 = new StackPane();
       layout1.getChildren().add(button1);
       scene1 = new Scene(layout1,200,200);

       Button button2 = new Button("Fuck out to the scene1");
       button2.setOnAction(e->display("응애","this is a test"));

       StackPane layout2 = new StackPane();
       layout2.getChildren().add(button2);
       scene2 = new Scene(layout2,400,400);

       window.setScene(scene1);
       window.setTitle("공대생 키우기");
       window.show();
    }

    public static void display(String title, String message){
        Stage window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(300);

        Label label=new Label();
        label.setText(message);
        Button closeButton =new Button("Close the window");
        closeButton.setOnAction(e->window.close());

        StackPane layout = new StackPane();
        layout.getChildren().add(closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.showAndWait();
    }


    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    public static void Launch() {
        launch();
    }

}