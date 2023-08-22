package com.auto.ahora.model;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consecionario {

    ArrayList<Vehiculo> vehiculos= new ArrayList<>();
    ArrayList<Vehiculo> Registro_ventas= new ArrayList<>();

    public Consecionario() {
    }

    public void verVehiculos(){

    }
    public void verStock(){

    }
    public Predicate<Vehiculo> verEstado (final boolean estado){
        return(Vehiculo)-> Vehiculo.getIsEstado() ;
    }



    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getRegistro_ventas() {
        return Registro_ventas;
    }

    public void setRegistro_ventas(ArrayList<Vehiculo> registro_ventas) {
        Registro_ventas = registro_ventas;
    }
}
