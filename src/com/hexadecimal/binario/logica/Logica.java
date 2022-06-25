package com.hexadecimal.binario.logica;

import java.util.ArrayList;
import java.util.List;

import static com.hexadecimal.binario.modelo.Binario.getBinario;

public class Logica {
    private static List<String> caracteres;
    private static StringBuilder numeroBinario;

    private static boolean verificarHexadeximal(String hexa) {
        caracteres = new ArrayList<>();
        int longitud = hexa.length(), indice = 0;
        boolean verificar = false;

        for (int i = 0; i < longitud; i++) {
            String caracter = String.valueOf(hexa.charAt(i));
            if (caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9") || caracter.equals("a") || caracter.equals("b") || caracter.equals("c") || caracter.equals("d") || caracter.equals("e") || caracter.equals("f")) {
                ++indice;
                caracteres.add(caracter);
            }
        }

        if (indice == longitud) {
            verificar = true;
        }

        return verificar;
    }

    public static String getNumeroBinario(String hexa) {
        boolean verificado = verificarHexadeximal(hexa);
        numeroBinario = new StringBuilder();
        if (verificado) {
            for (String c : caracteres) {
               numeroBinario.append(getBinario(c));
            }
        }else {
            numeroBinario.append("Error el numero hexadecimal es incorrecto");
        }

        return numeroBinario.toString();
    }
}
