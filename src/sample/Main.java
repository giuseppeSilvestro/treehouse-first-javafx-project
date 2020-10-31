package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //comment out next line because we do not want to use the FXBuilder
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //create the root
        Group root = new Group();

        //create a new node
        Text text = new Text("Sup?");
        //move the new node 50px down from the top
        text.setY(50);

        //create a new node
        TextField nameFld = new TextField();

        //create a new node
        Button btn = new Button("Say Sup!");
        //create an intention action for the button
        btn.setOnAction(event -> System.out.printf("Sup %s!%n",
                nameFld.getText().trim()));



        //create a Vertical Box layout
        VBox box = new VBox();
        //add the nodes to the box
        box.getChildren().addAll(text, nameFld, btn);
        //add the node to the scene
        root.getChildren().add(box);

        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
