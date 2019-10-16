/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7_calculadora_actionevent;
import static java.lang.Math.pow;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EJ7_Calculadora_ActionEvent extends Application {
    
Button btn_calcular = new Button("Calcular"); 
Double interes_anual = 0.00 ;
Double numero_anios = 0.00;
Double total_prestamo = 0.00;
Double pago_mensual = 0.00;
Double pago_total = 0.00;

TextField text_interes = new TextField();
TextField text_num_anios = new TextField();
TextField text_total_anios = new TextField();
TextField text_pago_mensual = new TextField();
TextField text_pago_total = new TextField();


    public class Calcular implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e){
        interes_anual = Double.parseDouble(text_interes.getText());
        numero_anios = Double.parseDouble(text_num_anios.getText());
        total_prestamo = Double.parseDouble(text_total_anios.getText());
        
        Double r = interes_anual/1200;
        
        pago_mensual = total_prestamo * r / (1-pow((1+r), (-12*numero_anios)));
        pago_total = pago_mensual* 12 *numero_anios;
        

        text_pago_mensual.setText(pago_mensual.toString());
        text_pago_total.setText(pago_total.toString());
        
        }
    }   
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        
        GridPane panel = new GridPane();

        
        
        Label label_interes = new Label("Porcentaje de interes anual: ");
        Label label_anios = new Label("Numero de anios: ");
        Label label_prestamo = new Label("Total de prestamo");
        Label label_pago_mensual = new Label("Pago mensual: ");
        Label label_pago_total = new Label("Pago total: ");
        panel.addRow(0, label_interes);
        panel.addColumn(0, label_anios);
        panel.addColumn(0, label_prestamo);
        panel.addColumn(0, label_pago_mensual);
        panel.addColumn(0, label_pago_total);
        

        
        panel.addColumn(1, text_interes);
        panel.addColumn(1, text_num_anios);
        panel.addColumn(1, text_total_anios);
        panel.addColumn(1, text_pago_mensual);
        panel.addColumn(1, text_pago_total);
       
       
        
        btn_calcular.setOnAction(new Calcular());
        panel.addColumn(0, btn_calcular);
        
        
        
        
        Scene scene = new Scene(panel, 350, 250);
        
        primaryStage.setTitle("EJ7_Calculadora_ActionEvent");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
