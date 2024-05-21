package org.example.capitulo_2;

public class ClasificarAlumnosSegunPromedio {
    private double promedio;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String clasificarAlumno() {
        if (getPromedio() >= 9.0) {
            return "Excelente";
        } else if (getPromedio() >= 7.0) {
            return "Bueno";
        } else if (getPromedio() >= 5.0) {
            return "Regular";
        } else {
            return "Deficiente";
        }
    }

    public void mostrarClasificacion() {
        System.out.println("El alumno tiene una clasificación de: " + clasificarAlumno());
    }
}
