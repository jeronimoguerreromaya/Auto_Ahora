package com.auto.ahora.model;

public class Camion extends Vehiculo{

    private float cap_carga;

    public Camion(String placa, String marca, String referencia, String modelo, float precio, int num_ruedas,float cap_carga) {
        super(placa,marca,referencia,modelo,precio,num_ruedas);
        this.cap_carga=cap_carga;
    }

    @Override
    public void addVehiculo(Vehiculo camion){
        Consecionario consecionario=new Consecionario();
        consecionario.setVehiculos(camion);
    }
    public float getCap_carga() {
        return cap_carga;
    }

    public void setCap_carga(float cap_carga) {
        this.cap_carga = cap_carga;
    }
}
