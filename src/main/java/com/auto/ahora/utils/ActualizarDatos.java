package com.auto.ahora.utils;

import com.auto.ahora.model.Vehiculo;

public class ActualizarDatos {

    public static String actualizarPlaca(String nuevaPlaca) {
        return nuevaPlaca;
    }

    public static String actualizarMarca(String nuevaMarca) {
        return nuevaMarca;
    }

    public static String actualizarReferencia(String nuevaReferencia) {
        return nuevaReferencia;
    }

    public static String actualizarModelo(String nuevoModelo) {
        return nuevoModelo;
    }

    public static float actualizarPrecio(float nuevoPrecio) {
        return nuevoPrecio;
    }

    public static int actualizarNumRuedas(int nuevasRuedas) {
        return nuevasRuedas;
    }

    public static Vehiculo actualizarDatos(Vehiculo vehiculo, String nuevaPlaca, String nuevaMarca, String nuevaReferencia,
                                           String nuevoModelo, float nuevoPrecio, int nuevasRuedas
    ) {
        if (nuevaPlaca != null && !nuevaPlaca.isEmpty()) {
            vehiculo.setPlaca(nuevaPlaca);
        }
        if (nuevaMarca != null && !nuevaMarca.isEmpty()) {
            vehiculo.setMarca(nuevaMarca);
        }
        if (nuevaReferencia != null && !nuevaReferencia.isEmpty()) {
            vehiculo.setReferencia(nuevaReferencia);
        }
        if (nuevoModelo != null && !nuevoModelo.isEmpty()) {
            vehiculo.setModelo(nuevoModelo);
        }
        if (nuevoPrecio > 0) {
            vehiculo.setPrecio(nuevoPrecio);
        }
        if (nuevasRuedas > 0) {
            vehiculo.setNumRuedas(nuevasRuedas);
        }


        return vehiculo;


    }
}