package com.auto.ahora.model;

public class Moto extends Vehiculo {
    private float clindrage;
    private float tam_tanque;

    public Moto(String placa, String marca, String referencia, String modelo, float precio, int num_ruedas,float cilindrage,float tam_tanque) {
        super(placa,marca,referencia,modelo,precio,num_ruedas);
        this.clindrage=cilindrage;
        this.tam_tanque=tam_tanque;
    }

    @Override
    public void addVehiculo(Vehiculo moto){
        Consecionario consecionario=new Consecionario();
        consecionario.setVehiculos(moto);
    }


    public float getClindrage() {
        return clindrage;
    }

    public void setClindrage(float clindrage) {
        this.clindrage = clindrage;
    }

    public float getTam_tanque() {
        return tam_tanque;
    }

    public void setTam_tanque(float tam_tanque) {
        this.tam_tanque = tam_tanque;
    }
}
