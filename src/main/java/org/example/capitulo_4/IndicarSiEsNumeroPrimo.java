package org.example.capitulo_4;

public class IndicarSiEsNumeroPrimo {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esPrimo() {
        if (getNumero() <= 1) {
            return false;
        }
        // Verificamos si el número es divisible solo por 1 y por sí mismo
        for (int i = 2; i <= Math.sqrt(getNumero()); i++) {
            if (getNumero() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void MostrarSiEsNumeroPrimo() {
        IndicarSiEsNumeroPrimo verificador = new IndicarSiEsNumeroPrimo();
        System.out.println(verificador.esPrimo());
    }


}
