package com.auto.ahora.model;

public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String referencia;
    private String modelo;
    private float precio;
    private int num_ruedas;

    private boolean estado;

    public Vehiculo() {
    }


    public Vehiculo(String placa, String marca, String referencia, String modelo, float precio, int num_ruedas) {
        this.placa=placa;
        this.marca=marca;
        this.referencia=referencia;
        this.modelo=modelo;
        this.precio=precio;
        this.precio=precio;


    }


    public abstract void addVehiculo(Vehiculo vehiculo);

    public String getPlaca() {

        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumRuedas() {
        return num_ruedas;
    }

    public void setNumRuedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public boolean getIsEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
