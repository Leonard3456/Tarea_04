package org.example.capitulo_4;

public class IndicarSiEsNumeroPrimo {
    public int numero;
    public boolean esPrimo() {
        if (numero <= 1) {
            return false;
        }
        // Verificamos si el número es divisible solo por 1 y por sí mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
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
