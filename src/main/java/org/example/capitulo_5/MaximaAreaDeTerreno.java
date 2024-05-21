package org.example.capitulo_5;

public class    MaximaAreaDeTerreno {
    private float x, xmax = 0, area, areamax, inc = 0.0001f;
    public void MostrarAreaDeTerreno() {
        x = 0;
        areamax = 0;

        do {
            x = x + inc;
            area = x * (20 - x); //rango de 0 a 20
            if (area > areamax) {
                areamax = area;
                xmax = x;
            }
        } while (x <= 20);

        System.out.println("El máximo área del terreno es: " + areamax);
        System.out.println("La longitud correspondiente del lado es: " + xmax);
    }
}
