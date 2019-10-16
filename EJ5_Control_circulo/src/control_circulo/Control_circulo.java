/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_circulo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class Control_circulo extends Application {
    Circle circle = new Circle(100, 100, 50);
    //Funciones para agrandar o encoger el círculo
    
    public class Engrandar implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            circle.setRadius(200.0f);
        }
    }
    public class Encoger implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            circle.setRadius(50.0f);
        }
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        
        Button engrandar = new Button();
        Button encoger = new Button();
        
        engrandar.setText("Engrandar");
        encoger.setText("Encoger");
        
        engrandar.setOnAction(new Engrandar());
        encoger.setOnAction(new Encoger());
        
        VBox raizvbox = new VBox();
        raizvbox.setAlignment(Pos.CENTER);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.BASELINE_CENTER);
        hbox.getChildren().addAll(engrandar, encoger);
        raizvbox.getChildren().addAll(circle, hbox);
        
        Scene scene = new Scene(raizvbox, 400, 350);
        primaryStage.setTitle("ControlCircle");
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
