package org.example.capitulo_5;

public class MaximaAreaDeTerreno {
    private float x, xmax, area, areamax = 0, inc = 0.0001f;
    private float longitudMaxima = 20.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getXmax() {
        return xmax;
    }

    public void setXmax(float xmax) {
        this.xmax = xmax;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getAreamax() {
        return areamax;
    }

    public void setAreamax(float areamax) {
        this.areamax = areamax;
    }

    public float getInc() {
        return inc;
    }

    public void setInc(float inc) {
        this.inc = inc;
    }

    public float getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(float longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public void mostrarAreaDeTerreno() {
        do {
            x = x + inc;
            area = x * (longitudMaxima - x); //rango de 0 a longitudMaxima
            if (area > areamax) {
                areamax = area;
                xmax = x;
            }
        } while (x <= longitudMaxima);

        System.out.println("El máximo área del terreno es: " + areamax);
        System.out.println("La longitud correspondiente del lado es: " + xmax);
    }
}