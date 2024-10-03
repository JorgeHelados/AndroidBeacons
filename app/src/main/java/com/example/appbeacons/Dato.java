package com.example.appbeacons;

// Clase modelo que representa los datos que enviarás
// Ordenar como en la BBDD
public class Dato {
    private String hora;
    private String lugar;
    private String gas;
    private double cantidad;


    // Constructor
    // Ordenar como en la BBDD
    public Dato(String hora, String lugar, String gas, double cantidad) {  //esto tambien ordenar
        this.hora = hora;
        this.lugar = lugar;
        this.gas = gas;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public double getValor() {
        return cantidad;
    }

    public void setValor(double valor) {
        this.cantidad = valor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
