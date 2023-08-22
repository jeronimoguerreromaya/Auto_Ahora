package com.auto.ahora.utils;

import com.auto.ahora.model.Vehiculo;

import java.util.function.Predicate;

public class BuscarVehiculoUtils {

    public static Predicate<Vehiculo> buscarPorMarca(String marca){
        return vehiculo -> vehiculo.getMarca().equals(marca);
    }
    public static Predicate<Vehiculo> buscarPorPlaca(String placa){
        return vehiculo -> vehiculo.getPlaca().equals(placa);
    }
    public static Predicate<Vehiculo> buscarPorReferencia(String referencia){
        return vehiculo -> vehiculo.getReferencia().equals(referencia);
    }
    public static Predicate<Vehiculo> buscarPorModel(String modelo){
        return vehiculo -> vehiculo.getModelo().equals(modelo);
    }
    public static Predicate<Vehiculo> buscarPorPrecio(float precio){
        return vehiculo -> vehiculo.getPrecio() == precio;
    }
    public static Predicate<Vehiculo> buscarPorTodo(String placa,String marca, String referencia, String modelo, float precio){
        Predicate<Vehiculo> predicate= vehiculo -> true;
        if(placa != null && !placa.isEmpty()){
            predicate= predicate.and(buscarPorPlaca(placa));
        }
        if(marca != null && !marca.isEmpty()){
            predicate= predicate.and(buscarPorMarca(marca));
        }
        if(referencia != null && !referencia.isEmpty()){
            predicate= predicate.and(buscarPorReferencia(referencia));
        }
        if(modelo != null && !modelo.isEmpty()){
            predicate= predicate.and(buscarPorModel(modelo));
        }
        if(precio > 0){
            predicate= predicate.and(buscarPorPrecio(precio));
        }
        return predicate;
    }
}
