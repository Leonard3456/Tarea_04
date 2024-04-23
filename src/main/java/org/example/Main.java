package org.example;
import org.example.capitulo_1.AreaCilindroRecto;
import org.example.capitulo_1.DistanciaEntreDosPuntos;
import org.example.capitulo_1.HipotenusaTrianguloRectangulo;
import org.example.capitulo_1.VolumenCilindroRecto;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Este es el primer archivo del primer Capitulo----------------");
        AreaCilindroRecto area = new AreaCilindroRecto();
        area.radio = 6;
        area.altura = 13;
        area.mostrarArea();

        System.out.println("-------------Este es el segundo archivo del primer Capitulo----------------");
        DistanciaEntreDosPuntos dist = new DistanciaEntreDosPuntos();
        dist.x1 = 2;
        dist.x2 = 3;
        dist.y1 = 7;
        dist.y2 = 4;
        dist.mostrarDistancia();

        System.out.println("-------------Este es el tercer archivo del primer Capitulo----------------");
        HipotenusaTrianguloRectangulo hip = new HipotenusaTrianguloRectangulo();
        hip.cateto1 = 12;
        hip.cateto2 = 6;
        hip.mostrarHipotenusa();

        System.out.println("-------------Este es el cuarto archivo del primer Capitulo----------------");
        VolumenCilindroRecto vol = new VolumenCilindroRecto();
        vol.altura = 13;
        vol.radio = 6;
        vol.mostrarVolumen();

        System.out.println("-------------Este es el primer archivo del segundo Capitulo----------------");
    }
}