package com.hexadecimal.binario;

import javax.swing.*;

import static com.hexadecimal.binario.logica.Logica.getNumeroBinario;
import static com.hexadecimal.binario.modelo.Binario.getBinario;

public class HexadecimalABinario {
    public static void main(String[] args) {
        String hexa = JOptionPane.showInputDialog(null, "Ingrese el numero hexadecimal");

        if (hexa == null){
            JOptionPane.showMessageDialog(null, "Error intente nuevamente");
            System.exit(-1);
        }else if(hexa.isBlank()){
            JOptionPane.showMessageDialog(null, "Error campo de texo esta vacio intente nuevamente");
            System.exit(-1);
        }else {
            System.out.println("\nNumero binario " + getNumeroBinario("a12"));
            JOptionPane.showMessageDialog(null, "Numero hexadecimal ingresado " +
                    hexa + "\nNumero binario resultante " + getNumeroBinario(hexa));
        }


    }
}
