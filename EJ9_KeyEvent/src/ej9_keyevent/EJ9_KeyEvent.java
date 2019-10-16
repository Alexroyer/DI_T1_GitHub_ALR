/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9_keyevent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class EJ9_KeyEvent extends Application {

    @Override
    public void start(Stage primaryStage) {

        
        Text textomovil = new Text(200, 200, "EJ9 Texto movil");
        
        
        textomovil.setFocusTraversable(true);
        
        
        
        textomovil.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                
                switch (e.getCode()) {
                    case DOWN:
                        textomovil.setY(textomovil.getY() + 10);
                        break;
                        
                    case UP:
                        textomovil.setY(textomovil.getY() - 10);
                        break;
                        
                    case LEFT:
                        textomovil.setX(textomovil.getX() - 10);
                        break;
                        
                    case RIGHT:
                        textomovil.setX(textomovil.getX() + 10);
                        break;
                        
                }
            }
        });

        Pane root = new Pane();
        root.getChildren().addAll(textomovil);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Texto movil!");
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
