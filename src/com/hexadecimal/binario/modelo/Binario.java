package com.hexadecimal.binario.modelo;

public class Binario {
    //public int cero = 0000, uno = 0001, dos = 0010, tres = 0011, cuatro = 0100;
    //public int cinco = 0101, seis = 0110, siete = 0111, ocho = 1000, nueve = 1001;
    //public int a = 1010, b = 1011, c = 1100, d = 1101, e = 1110, f = 1111; //10, 11, 12, 13, 14, 15

    private static String[] binarios = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", /**/"1010", "1011", "1100", "1101", "1110", "1111"};

    public static String getBinario(String chr) {
        String binario = "";

        switch (chr) {
            case "a": {
                binario = String.valueOf(binarios[10]);
                break;
            }

            case "b": {
                binario = String.valueOf(binarios[11]);
                break;
            }

            case "c": {
                binario = String.valueOf(binarios[12]);
                break;
            }

            case "d": {
                binario = String.valueOf(binarios[13]);
                break;
            }

            case "e": {
                binario = String.valueOf(binarios[14]);
                break;
            }

            case "f": {
                binario = String.valueOf(binarios[15]);
                break;
            }

            default:{
                binario = String.valueOf(binarios[Integer.parseInt(chr)]);
                break;
            }
        }

        return binario;
    }


}
