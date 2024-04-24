package org.example.capitulo_2;

public class MontoPagarConDescuento {
    public double monto;
    public double porcentajeDescuento;

    public MontoPagarConDescuento(double monto, double porcentajeDescuento) {
        this.monto = monto;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double calcularMontoConDescuento() {
        double descuento = monto * (porcentajeDescuento / 100.0);
        return monto - descuento;
    }

    // Método para mostrar el monto a pagar con el descuento aplicado
    public void mostrarMontoConDescuento() {
        double montoConDescuento = calcularMontoConDescuento();
        System.out.println("El monto a pagar con descuento es: " + montoConDescuento);
    }
}
