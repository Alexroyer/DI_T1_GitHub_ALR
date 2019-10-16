/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11_eclipse_transicion;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Alejandro
 */
public class EJ11_Eclipse_Transicion extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Ellipse elipse = new Ellipse(300, 300, 200, 100);
        
        elipse.setFill(Color.PINK);
        elipse.setStroke(Color.BLACK);
        root.getChildren().addAll(elipse);

        FadeTransition fadet = new FadeTransition(Duration.millis(1000), elipse);
        
        fadet.setFromValue(1.0);
        fadet.setToValue(0.1);
        fadet.setCycleCount(Timeline.INDEFINITE);
        fadet.setAutoReverse(true);
        fadet.play();

        elipse.setOnMousePressed(e -> fadet.pause());
        elipse.setOnMouseReleased(e -> fadet.play());

        Scene scene = new Scene(root, 450, 450);

        primaryStage.setTitle("Ej11 Transicion Eclipse");
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
