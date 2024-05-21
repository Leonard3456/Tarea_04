package org.example.capitulo_4;

import java.util.ArrayList; // proporciona una estructura de datos dinámica
import java.util.List; // es una interfaz que define una colección ordenada de elementos

public class FactorizarNumero {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Integer> obtenerFactores() {
        List<Integer> factores = new ArrayList<>();
        int i = 1;
        while (i <= getNum()) {
            if (getNum() % i == 0) {  // Usar getNum() en lugar de num
                factores.add(i);
            }
            i++;
        }
        return factores;
    }

    public void mostrarFactores() {
        // Usar this para obtener los factores de la instancia actual
        List<Integer> factores = this.obtenerFactores();
        System.out.println("Los factores de " + getNum() + " son: " + factores);
    }

}
