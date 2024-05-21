package org.example.capitulo_8;

public class TeoremaDelCoseno {

    private float b = 5.0f; //el f es para que se trate como float y no double
    private float c = 7.0f;

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float calcularLadoA(float b, float c, float alfa) {
        return (float) Math.sqrt(b * b + c * c - 2 * b * c * Math.cos(alfa));
        //es una función en Java que calcula el coseno de un ángulo dad
    }

    public void mostrarTeorema() {
        float alfa = (float) Math.toRadians(60); // Convertir el ángulo a radianes

        float a = calcularLadoA(b, c, alfa);
        System.out.println("El tercer lado mide " + a);
    }


}
