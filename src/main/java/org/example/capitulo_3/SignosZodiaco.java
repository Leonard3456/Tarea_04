package org.example.capitulo_3;

public class SignosZodiaco {
    private int dia;
    private int mes;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String determinarSignoZodiaco() {
        if ((getMes() == 3 && getDia() >= 21) || (getMes() == 4 && getDia() <= 19)) {
            return "Aries";
        } else if ((getMes() == 4 && getDia() >= 20) || (getMes() == 5 && getDia() <= 20)) {
            return "Tauro";
        } else if ((getMes() == 5 && getDia() >= 21) || (getMes() == 6 && getDia() <= 20)) {
            return "Géminis";
        } else if ((getMes() == 6 && getDia() >= 21) || (getMes() == 7 && getDia() <= 22)) {
            return "Cáncer";
        } else if ((getMes() == 7 && getDia() >= 23) || (getMes() == 8 && getDia() <= 22)) {
            return "Leo";
        } else if ((getMes() == 8 && getDia() >= 23) || (getMes() == 9 && getDia() <= 22)) {
            return "Virgo";
        } else if ((getMes() == 9 && getDia() >= 23) || (getMes() == 10 && getDia() <= 22)) {
            return "Libra";
        } else if ((getMes() == 10 && getDia() >= 23) || (getMes() == 11 && getDia() <= 21)) {
            return "Escorpio";
        } else if ((getMes() == 11 && getDia() >= 22) || (getMes() == 12 && getDia() <= 21)) {
            return "Sagitario";
        } else if ((getMes() == 12 && getDia() >= 22) || (getMes() == 1 && getDia() <= 19)) {
            return "Capricornio";
        } else if ((getMes() == 1 && getDia() >= 20) || (getMes() == 2 && getDia() <= 18)) {
            return "Acuario";
        } else if ((getMes() == 2 && getDia() >= 19) || (getMes() == 3 && getDia() <= 20)) {
            return "Piscis";
        } else {
            return "Fecha no válida";
        }
    }

    public void mostrarSignoZodiaco() {
        System.out.println("El signo zodiacal es: " + determinarSignoZodiaco());
    }
}
