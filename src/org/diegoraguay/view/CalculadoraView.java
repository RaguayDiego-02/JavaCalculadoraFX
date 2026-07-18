package org.diegoraguay.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.diegoraguay.controller.CalculadoraController;

public class CalculadoraView {
    private VBox view; 
    private Label pantalla; 
    private GridPane cuadroBotones; 
    //controller
    private CalculadoraController Controlador; 
    
    public CalculadoraView() {
        Controlador = new CalculadoraController(); 
        
        view = new VBox(15); 
        view.setPadding(new Insets(15)); 
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #D3D3D3;"); 
        
        pantalla = new Label("0"); 
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(235, 50); 
        pantalla.setStyle("-fx-background-color: #F5F7FA;"); 
        
        cuadroBotones = new GridPane(); 
        cuadroBotones.setHgap(10); //Interlineado entre elementos de la cuadricula
        cuadroBotones.setVgap(10); 
        cuadroBotones.setAlignment(Pos.CENTER); //Alineado del centro 
        
        Button btnClean = nuevoBoton("C");
        Button btnCero = nuevoBoton("0");
        Button btnPunto = nuevoBoton(".");
        Button btnIgual =  botonOperacion("=");
        Button btnUno = nuevoBoton("1");
        Button btnDos = nuevoBoton("2");
        Button btnTres = nuevoBoton("3");
        Button btnMas = botonOperacion("+");
        Button btnCuatro = nuevoBoton("4");
        Button btnCinco = nuevoBoton("5");
        Button btnSeis = nuevoBoton("6");
        Button btnResta =  botonOperacion("-");
        Button btnSiete = nuevoBoton("7");
        Button btnOcho = nuevoBoton("8");
        Button btnNueve = nuevoBoton("9");
        Button btnMultiplicacion =  botonOperacion("×");
        Button btnRaizCuadrada =  botonOperacion("√");
        Button btnElevar =  botonOperacion("^");
        Button btnPorcentaje =  botonOperacion("%");
        Button btnDividir =  botonOperacion("÷");
        
        //agregarlo al cuadro botones 
        cuadroBotones.add(btnClean, 0, 5); 
        cuadroBotones.add(btnCero, 1, 5); 
        cuadroBotones.add(btnPunto, 2, 5); 
        cuadroBotones.add(btnIgual, 3,5);
        cuadroBotones.add(btnUno, 0, 4); 
        cuadroBotones.add(btnDos, 1, 4); 
        cuadroBotones.add(btnTres, 2,4);
        cuadroBotones.add(btnMas, 3, 4);
        cuadroBotones.add(btnCuatro, 0, 3); 
        cuadroBotones.add(btnCinco, 1, 3); 
        cuadroBotones.add(btnSeis, 2, 3);
        cuadroBotones.add(btnResta, 3, 3);
        cuadroBotones.add(btnSiete, 0, 2); 
        cuadroBotones.add(btnOcho, 1, 2); 
        cuadroBotones.add(btnNueve, 2, 2);
        cuadroBotones.add(btnMultiplicacion, 3, 2);
        cuadroBotones.add(btnRaizCuadrada, 0, 1);
        cuadroBotones.add(btnElevar, 1, 1);
        cuadroBotones.add(btnPorcentaje, 2, 1);
        cuadroBotones.add(btnDividir, 3, 1);
        
        view.getChildren().addAll(pantalla, cuadroBotones); 
    }
    
    public VBox getView() {
        return view; 
    }
    
    private Button nuevoBoton (String texto) {
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50); 
        btn.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        
        btn.setOnMousePressed(e -> {
            btn.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btn.setTranslateY(2);
        });

        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btn.setTranslateY(0);
        });
        
        btn.setOnAction(e-> Controlador.procesoDeEntrada(texto, pantalla));
        return btn; 
    }
    
        private Button botonOperacion (String texto) {
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50); 
        btn.setStyle("-fx-background-color: #707070; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        
        btn.setOnMousePressed(e -> {
            btn.setStyle("-fx-background-color: #8C8C7A; -fx-text-fill:white;");
            btn.setTranslateY(2);
        });

        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #707070; -fx-text-fill:white; ");
            btn.setTranslateY(0);
        });
        
        btn.setOnAction(e-> Controlador.procesoDeEntrada(texto, pantalla));
        return btn; 
    }
    
}