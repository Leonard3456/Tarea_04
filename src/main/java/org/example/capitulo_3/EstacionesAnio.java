package org.example.capitulo_3;

public class EstacionesAnio {
    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String determinarEstacion() {
        switch (mes) {
            case 1:  // Enero
            case 2:  // Febrero
            case 12: // Diciembre
                return "Invierno";
            case 3:  // Marzo
            case 4:  // Abril
            case 5:  // Mayo
                return "Primavera";
            case 6:  // Junio
            case 7:  // Julio
            case 8:  // Agosto
                return "Verano";
            case 9:  // Septiembre
            case 10: // Octubre
            case 11: // Noviembre
                return "Otoño";
            default:
                return "Mes inválido";
        }
    }

    public void mostrarEstacion() {
        String estacion = determinarEstacion();
        System.out.println("El mes " + getMes() + " corresponde a la estación: " + estacion);
    }

}