package org.diegoraguay.controller;

import javafx.scene.control.Label;

public class CalculadoraController {

    private String opcion1 = "";
    private String operador = "";
    private String opcion2 = "";
    private boolean calculoTerminado = true;

    public CalculadoraController() {
    }

    public void procesoDeEntrada(String entrada, Label pantalla) {
        if (entrada.equals("C")) {
            opcion1 = "";
            operador = "";
            opcion2 = "";
            pantalla.setText("");
        }

        //si ya se completo un calculo //reiniciar
        if (calculoTerminado && entrada.matches("[0-9]")) {
            opcion1 = "";
            operador = "";
            opcion2 = "";
        }
        calculoTerminado = false;

        if (entrada.matches("[0-9]")) {
            if (operador.isEmpty()) {
                opcion1 += entrada;
            } else {
                opcion2 += entrada;
            }
            actualizarPantalla(pantalla);
        } else if (entrada.equals("+") || entrada.equals("-") || entrada.equals("×") || entrada.equals("÷") || entrada.equals("^")) {

            if (!opcion1.isEmpty()) {
                operador = entrada;
            }
            actualizarPantalla(pantalla);
        } else if (entrada.equals("=")) {
            if (!opcion1.isEmpty() && !opcion2.isEmpty()) {
                if (operador.equals("+")) {
                    opcion1 = resultadoSuma(opcion1, opcion2);
                } else if (operador.equals("-")) {
                    opcion1 = resultadoResta(opcion1, opcion2);
                } else if (operador.equals("×")) {
                    opcion1 = resultadoMultiplicacion(opcion1, opcion2);
                } else if (operador.equals("÷")) {
                    if (opcion2.equals("0")) {
                        opcion1 = "Error";
                    } else {
                        opcion1 = resultadoDivision(opcion1, opcion2);
                    }
                } else if (operador.equals("^")) {
                    opcion1 = resultadoPotencia(opcion1, opcion2);
                }
                operador = "";
                opcion2 = "";
                calculoTerminado = true;
            } 
            actualizarPantalla(pantalla);                
        } else if (entrada.equals("√")) {
            opcion1 = resultadoRaizCuadrada(opcion1);
            actualizarPantalla(pantalla);
        }
    }
    

    private void actualizarPantalla(Label pantalla) {
        if (operador.isEmpty()) {
            pantalla.setText(opcion1);
        } else {
            pantalla.setText(opcion1 + " " + operador + " " + opcion2);
        }
    }

    private String resultadoSuma(String numeroUno, String numeroDos) {
        try {
            double datoUno = Double.parseDouble(opcion1);
            double datoDos = Double.parseDouble(opcion2);
            double suma = datoUno + datoDos;
            return formatearResultado(suma);
        } catch (NumberFormatException e) {
            return "Error";
        }
    }

    private String resultadoResta(String numeroUno, String numeroDos) {
        try {
            double datoUno = Double.parseDouble(opcion1);
            double datoDos = Double.parseDouble(opcion2);
            double resta = datoUno - datoDos;
            return formatearResultado(resta);
        } catch (NumberFormatException e) {
            return "Error";
        }
    }

    private String resultadoMultiplicacion(String numeroUno, String numeroDos) {
        try {
            double datoUno = Double.parseDouble(opcion1);
            double datoDos = Double.parseDouble(opcion2);
            double multiplicacion = datoUno * datoDos;

            return formatearResultado(multiplicacion);
        } catch (NumberFormatException e) {
            return "Error";
        }
    }

    private String resultadoDivision(String numeroUno, String numeroDos) {
        try {
            double datoUno = Double.parseDouble(opcion1);
            double datoDos = Double.parseDouble(opcion2);
            double division = datoUno / datoDos;

            return formatearResultado(division);
        } catch (NumberFormatException e) {
            return "Error";
        }
    }

    private String resultadoRaizCuadrada(String numeroUno) {
        try {
            double datoUno = Double.parseDouble(numeroUno);
            if (datoUno < 0) {
                return "Error";
            }
            double raizCuadrada = Math.sqrt(datoUno);
            return formatearResultado(raizCuadrada);
        } catch (NumberFormatException e) {
            return "";
        }
    }
    
    private String resultadoPotencia(String numeroUno, String numeroDos) {
        try {
            double datoUno = Double.parseDouble(numeroUno);
            double datoDos = Double.parseDouble(numeroDos);
            double potencia = Math.pow(datoUno, datoDos);
            if (Double.isNaN(potencia)) {
                return "Error";
            }
            return formatearResultado(potencia);
        } catch (NumberFormatException e) {
            return "Error";
        }
    }

    private String formatearResultado(double valor) {
        if (valor == Math.floor(valor) && !Double.isInfinite(valor)) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }
}
