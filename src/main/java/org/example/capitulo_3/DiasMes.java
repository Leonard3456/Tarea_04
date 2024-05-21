package org.example.capitulo_3;

public class DiasMes {
    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int obtenerDiasEnMes() {
        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                return 31;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                return 30;
            case 2:  // Febrero
                return 28; // Asumimos que Febrero tiene 28 días en un año no bisiesto
            default:
                return -1; // Valor inválido para el mes
        }
    }

    // Método principal para mostrar la cantidad de días en un mes
    public void mostrarDiasEnMes() {
        int dias = obtenerDiasEnMes();
        if (dias != -1) {
            System.out.println("El mes " + getMes() + " tiene " + dias + " días.");
        } else {
            System.out.println("Mes inválido: " + getMes());
        }
    }


}
