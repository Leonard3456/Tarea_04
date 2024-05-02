package org.example.capitulo_4;

import java.util.ArrayList; //proporciona una estructura de datos dinámica
import java.util.List; //es una interfaz que define una colección ordenada de elementos

public class FactorizarNumero {
    public int num = 18;



    public List<Integer> obtenerFactores() {      //
        List<Integer> factores = new ArrayList<>();
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                factores.add(i);
            }
            i++;
        }
        return factores;
    }

    public void MostrarFactores(){
        FactorizarNumero factorizador = new FactorizarNumero();
        List<Integer> factores = factorizador.obtenerFactores();
        System.out.println("Los factores de " + num + " son: " + factores);
    }

}
