package org.example.capitulo_5;

public class CalculoDelValorDePi {
    private float i = 1, pi4 = 0, signo = -1;

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    public float getPi4() {
        return pi4;
    }

    public void setPi4(float pi4) {
        this.pi4 = pi4;
    }

    public float getSigno() {
        return signo;
    }

    public void setSigno(float signo) {
        this.signo = signo;
    }

    public void mostrarValorPi() {

        do {
            signo = -signo; // cambia el signo en cada iteración
            pi4 = pi4 + signo * (1 / i);
            i = i + 2;
        } while (1 / i > 0.000001);

        System.out.println("Pi vale : " + 4 * pi4);
    }
}
