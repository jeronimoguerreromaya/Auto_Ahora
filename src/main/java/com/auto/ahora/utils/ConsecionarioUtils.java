package com.auto.ahora.utils;

import com.auto.ahora.model.Consecionario;
import com.auto.ahora.model.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsecionarioUtils {
    public static List<Vehiculo> verVentas() {
        boolean estado = true;
        Consecionario con = new Consecionario();

        Predicate<Vehiculo> filtrarVendidos =con.verEstado(estado);

        List<Vehiculo> vendidos = new ArrayList<>();

        for (Vehiculo vehiculo : con.getVehiculos()) {
            if (filtrarVendidos.test(vehiculo)) {
                vendidos.add(vehiculo);
            }
        }

        return vendidos;
    }

        public static List<Vehiculo> verDisponibles() {
            boolean estado = false;
            Consecionario con = new Consecionario();

            Predicate<Vehiculo> filtrarVendidos =con.verEstado(estado);

            List<Vehiculo> vendidos = new ArrayList<>();

            for (Vehiculo vehiculo : con.getVehiculos()) {
                if (filtrarVendidos.test(vehiculo)) {
                    vendidos.add(vehiculo);
                }
            }

            return vendidos;
    }
    public void verStock(){

    }
}
