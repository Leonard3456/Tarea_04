package org.example.capitulo_2;

public class ClasificarAlumnosSegunPromedio {
    public double promedio;

    public String clasificarAlumno() {
        if (promedio >= 9.0) {
            return "Excelente";
        } else if (promedio >= 7.0) {
            return "Bueno";
        } else if (promedio >= 5.0) {
            return "Regular";
        } else {
            return "Deficiente";
        }
    }

    public void mostrarClasificacion() {
        System.out.println("El alumno tiene una clasificación de: " + clasificarAlumno());
    }
}
