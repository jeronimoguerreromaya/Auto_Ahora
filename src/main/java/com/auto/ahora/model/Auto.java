package com.auto.ahora.model;

public class Auto extends Vehiculo{


    private int num_puertas;
    private boolean isGasolina;

    public Auto(String placa, String marca, String referencia, String modelo, float precio, int num_ruedas,int num_puertas,boolean isGasolina) {
        super(placa,marca,referencia,modelo,precio,num_ruedas);
        this.num_puertas=num_puertas;
        this.isGasolina=isGasolina;

    }

    @Override
    public void addVehiculo(Vehiculo auto){
        Consecionario consecionario=new Consecionario();
        consecionario.setVehiculos(auto);

    }
    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public boolean isGasolina() {
        return isGasolina;
    }

    public void setGasolina(boolean gasolina) {
        isGasolina = gasolina;
    }
}
