package org.example.capitulo_2;

public class MontoPagarConDescuento {
    double nuevoMonto = 200;
    double porcentaje = 15;

    public double calcularMontoConDescuento() {
        double descuento = nuevoMonto * (porcentaje / 100.0);
        return nuevoMonto - descuento;
    }

    public void mostrarMontoConDescuento() {
        double montoConDescuento = calcularMontoConDescuento();
        System.out.println("El monto a pagar con descuento es: " + montoConDescuento);
    }
}
