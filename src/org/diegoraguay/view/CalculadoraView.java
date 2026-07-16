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
    
    public CalculadoraView() {
        view = new VBox(15); 
        view.setPadding(new Insets(15)); 
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #D3D3D3;"); 
        
        pantalla = new Label("0"); 
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(235, 50); 
        
        cuadroBotones = new GridPane(); 
        cuadroBotones.setHgap(10); //Interlineado entre elementos de la cuadricula
        cuadroBotones.setVgap(10); 
        cuadroBotones.setAlignment(Pos.CENTER); //Alineado del centro 
        
        
        Button btnC = new Button("C");
        btnC.setPrefSize(50, 50);
        btnC.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnC.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnC.setOnMousePressed(e -> {
            btnC.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnC.setTranslateY(2);
        });
        
        btnC.setOnMouseReleased(e -> {
            btnC.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnC.setTranslateY(0);
        });

        Button btnCero = new Button("0");
        btnCero.setPrefSize(50, 50);
        btnCero.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
         btnCero.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnCero.setOnMousePressed(e -> {
            btnCero.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnCero.setTranslateY(2);
        });
        
        btnCero.setOnMouseReleased(e -> {
            btnCero.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnCero.setTranslateY(0);
        });
        
        Button btnPunto = new Button ("."); 
        btnPunto.setPrefSize(50, 50); 
        btnPunto.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;"); 
        btnPunto.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnPunto.setOnMousePressed(e -> {
            btnPunto.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnPunto.setTranslateY(2);
        });

        btnPunto.setOnMouseReleased(e -> {
            btnPunto.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnPunto.setTranslateY(0);
        });
        
        Button btnIgual = new Button ("="); 
        btnIgual.setPrefSize(50, 50); 
        btnIgual.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;"); 
        btnIgual.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnIgual.setOnMousePressed(e -> {
            btnIgual.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnIgual.setTranslateY(2);
        });

        btnIgual.setOnMouseReleased(e -> {
            btnIgual.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnIgual.setTranslateY(0);
        });
        
        Button btnUno = new Button("1");
        btnUno.setPrefSize(50, 50);
        btnUno.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnUno.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnUno.setOnMousePressed(e -> {
            btnUno.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnUno.setTranslateY(2);
        });

        btnUno.setOnMouseReleased(e -> {
            btnUno.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnUno.setTranslateY(0);
        });
        
         Button btnDos = new Button("2");
        btnDos.setPrefSize(50, 50);
        btnDos.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnDos.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnDos.setOnMousePressed(e -> {
            btnDos.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnDos.setTranslateY(2);
        });

        btnDos.setOnMouseReleased(e -> {
            btnDos.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnDos.setTranslateY(0);
        });

        Button btnTres = new Button("3");
        btnTres.setPrefSize(50, 50);
        btnTres.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnTres.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnTres.setOnMousePressed(e -> {
            btnTres.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnTres.setTranslateY(2);
        });

        btnTres.setOnMouseReleased(e -> {
            btnTres.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnTres.setTranslateY(0);
        });

        Button btnMas = new Button("+");
        btnMas.setPrefSize(50, 50);
        btnMas.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnMas.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnMas.setOnMousePressed(e -> {
            btnMas.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnMas.setTranslateY(2);
        });

        btnMas.setOnMouseReleased(e -> {
            btnMas.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white;");
            btnMas.setTranslateY(0);
        });

        Button btnCuatro = new Button("4");
        btnCuatro.setPrefSize(50, 50);
        btnCuatro.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnCuatro.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnCuatro.setOnMousePressed(e -> {
            btnCuatro.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnCuatro.setTranslateY(2);
        });

        btnCuatro.setOnMouseReleased(e -> {
            btnCuatro.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white;");
            btnCuatro.setTranslateY(0);
        });

        Button btnCinco = new Button("5");
        btnCinco.setPrefSize(50, 50);
        btnCinco.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnCinco.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnCinco.setOnMousePressed(e -> {
            btnCinco.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnCinco.setTranslateY(2);
        });

        btnCinco.setOnMouseReleased(e -> {
            btnCinco.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnCinco.setTranslateY(0);
        });

        Button btnSeis = new Button("6");
        btnSeis.setPrefSize(50, 50);
        btnSeis.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnSeis.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnSeis.setOnMousePressed(e -> {
            btnSeis.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnSeis.setTranslateY(2);
        });

        btnSeis.setOnMouseReleased(e -> {
            btnSeis.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnSeis.setTranslateY(0);
        });

        Button btnResta = new Button("-");
        btnResta.setPrefSize(50, 50);
        btnResta.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnResta.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnResta.setOnMousePressed(e -> {
            btnResta.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnResta.setTranslateY(2);
        });

        btnResta.setOnMouseReleased(e -> {
            btnResta.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnResta.setTranslateY(0);
        });

        Button btnSiete = new Button("7");
        btnSiete.setPrefSize(50, 50);
        btnSiete.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnSiete.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnSiete.setOnMousePressed(e -> {
            btnSiete.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnSiete.setTranslateY(2);
        });

        btnSiete.setOnMouseReleased(e -> {
            btnSiete.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnSiete.setTranslateY(0);
        });

        Button btnOcho = new Button("8");
        btnOcho.setPrefSize(50, 50);
        btnOcho.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnOcho.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnOcho.setOnMousePressed(e -> {
            btnOcho.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnOcho.setTranslateY(2);
        });

        btnOcho.setOnMouseReleased(e -> {
            btnOcho.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnOcho.setTranslateY(0);
        });

        Button btnNueve = new Button("9");
        btnNueve.setPrefSize(50, 50);
        btnNueve.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnNueve.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnNueve.setOnMousePressed(e -> {
            btnNueve.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnNueve.setTranslateY(2);
        });

        btnNueve.setOnMouseReleased(e -> {
            btnNueve.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnNueve.setTranslateY(0);
        });

        Button btnMultiplicacion = new Button("*");
        btnMultiplicacion.setPrefSize(50, 50);
        btnMultiplicacion.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnMultiplicacion.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnMultiplicacion.setOnMousePressed(e -> {
            btnMultiplicacion.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnMultiplicacion.setTranslateY(2);
        });

        btnMultiplicacion.setOnMouseReleased(e -> {
            btnMultiplicacion.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnMultiplicacion.setTranslateY(0);
        });
        
        Button btnRaizCuadrada = new Button("√");
        btnRaizCuadrada.setPrefSize(50, 50);
        btnRaizCuadrada.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnRaizCuadrada.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnRaizCuadrada.setOnMousePressed(e -> {
            btnRaizCuadrada.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnRaizCuadrada.setTranslateY(2);
        });

        btnRaizCuadrada.setOnMouseReleased(e -> {
            btnRaizCuadrada.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnRaizCuadrada.setTranslateY(0);
        });
        
        Button btnElevar = new Button("^");
        btnElevar.setPrefSize(50, 50);
        btnElevar.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnElevar.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnElevar.setOnMousePressed(e -> {
            btnElevar.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnElevar.setTranslateY(2);
        });

        btnElevar.setOnMouseReleased(e -> {
            btnElevar.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnElevar.setTranslateY(0);
        });
        
         Button btnPorcentaje = new Button("%");
        btnPorcentaje.setPrefSize(50, 50);
        btnPorcentaje.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnPorcentaje.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnPorcentaje.setOnMousePressed(e -> {
            btnPorcentaje.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnPorcentaje.setTranslateY(2);
        });

        btnPorcentaje.setOnMouseReleased(e -> {
            btnPorcentaje.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnPorcentaje.setTranslateY(0);
        });
        
        Button btnDividir = new Button("/");
        btnDividir.setPrefSize(50, 50);
        btnDividir.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnDividir.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btnDividir.setOnMousePressed(e -> {
            btnDividir.setStyle("-fx-background-color: #33507A; -fx-text-fill:white;");
            btnDividir.setTranslateY(2);
        });

        btnDividir.setOnMouseReleased(e -> {
            btnDividir.setStyle("-fx-background-color: #4A6FA5; -fx-text-fill:white; ");
            btnDividir.setTranslateY(0);
        });

        
        //agregarlo al cuadro botones 
        cuadroBotones.add(btnC, 0, 5); 
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
        
        //configuracion de boton
        //tamaño, el estilo, sus funciones
        return btn; 
    }
}