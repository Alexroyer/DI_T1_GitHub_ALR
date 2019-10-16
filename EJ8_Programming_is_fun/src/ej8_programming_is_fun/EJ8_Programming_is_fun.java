/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_programming_is_fun;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author Alejandro
 */
public class EJ8_Programming_is_fun extends Application {

@Override
    public void start(Stage primaryStage) throws Exception {
        Text programing = new Text(30, 30, "Programing is fun");
        Pane root = new Pane();
        root.getChildren().addAll(programing);

        programing.setOnMouseDragged(e -> {
            programing.setX(e.getX());
            programing.setY(e.getY());
        });

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
