package org.example.capitulo_2;

public class MontoPagarConDescuento {
    private double nuevoMonto;
    private double porcentaje ;

    public double getNuevoMonto() {
        return nuevoMonto;
    }

    public void setNuevoMonto(double nuevoMonto) {
        this.nuevoMonto = nuevoMonto;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularMontoConDescuento() {
        double descuento = getNuevoMonto() * (getPorcentaje() / 100.0);
        return getNuevoMonto() - descuento;
    }

    public void mostrarMontoConDescuento() {
        double montoConDescuento = calcularMontoConDescuento();
        System.out.println("El monto a pagar con descuento es: " + montoConDescuento);
    }
}
