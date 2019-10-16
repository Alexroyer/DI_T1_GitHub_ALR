/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10_animacion;

import javafx.animation.PathTransition;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Aleja
 */
public class EJ10_Animacion extends Application {
    
    @Override
    public void start(Stage primaryStage) {
               
        BorderPane root = new BorderPane();


        Rectangle rectangulo =  new Rectangle(0, 0, 25, 20);

        rectangulo.setFill(Color.ORANGE);

        Circle circulo = new Circle(125, 100, 50);

        circulo.setFill(Color.WHITE);
        circulo.setStroke(Color.BLACK);
        
        
        PathTransition pt = new PathTransition();
        

        pt.setDuration(Duration.millis(3000));
        pt.setPath(circulo);
        pt.setNode(rectangulo);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setAutoReverse(true);

        
        pt.play();
        circulo.setOnMousePressed(e -> pt.pause());
        

        root.getChildren().addAll(rectangulo, circulo);
        
        root.setAlignment(circulo, Pos.CENTER);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Animacion ej 10");
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
