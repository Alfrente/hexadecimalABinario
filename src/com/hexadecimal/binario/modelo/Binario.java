package com.hexadecimal.binario.modelo;

public class Binario {
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
