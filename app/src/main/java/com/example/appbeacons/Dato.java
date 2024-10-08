package com.example.appbeacons;

// Clase modelo que representa los datos que enviarás
// Ordenar como en la BBDD
public class Dato {
    private String hora;
    private String lugar;
    private String gas;
    private double cantidad;

    // Constructor
    // ----------------------------------------------------------
    // String, String, String, double -> Dato()
    // ----------------------------------------------------------
    public Dato(String hora, String lugar, String gas, double cantidad) {
        this.hora = hora;
        this.lugar = lugar;
        this.gas = gas;
        this.cantidad = cantidad;
    }

    // Getters y setters

    // ----------------------------------------------------------
    // void -> getGas() -> String
    // ----------------------------------------------------------
    public String getGas() {
        return gas;
    }

    // ----------------------------------------------------------
    // String -> setGas()
    // ----------------------------------------------------------
    public void setGas(String gas) {
        this.gas = gas;
    }

    // ----------------------------------------------------------
    // void -> getValor() -> double
    // ----------------------------------------------------------
    public double getValor() {
        return cantidad;
    }

    // ----------------------------------------------------------
    // double -> setValor()
    // ----------------------------------------------------------
    public void setValor(double valor) {
        this.cantidad = valor;
    }

    // ----------------------------------------------------------
    // void -> getHora() -> String
    // ----------------------------------------------------------
    public String getHora() {
        return hora;
    }

    // ----------------------------------------------------------
    // String -> setHora()
    // ----------------------------------------------------------
    public void setHora(String hora) {
        this.hora = hora;
    }

    // ----------------------------------------------------------
    // void -> getLugar() -> String
    // ----------------------------------------------------------
    public String getLugar() {
        return lugar;
    }

    // ----------------------------------------------------------
    // String -> setLugar()
    // ----------------------------------------------------------
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
