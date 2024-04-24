package org.example;
import org.example.capitulo_1.AreaCilindroRecto;
import org.example.capitulo_1.DistanciaEntreDosPuntos;
import org.example.capitulo_1.HipotenusaTrianguloRectangulo;
import org.example.capitulo_1.VolumenCilindroRecto;
import org.example.capitulo_2.ClasificarAlumnosSegunPromedio;
import org.example.capitulo_2.MayorValorTresNumeros;
import org.example.capitulo_2.MontoPagarConDescuento;
import org.example.capitulo_2.OrdenarMayorMenorTresNumeros;
import org.example.capitulo_3.CalculadorDeCincoFunciones;
import org.example.capitulo_3.DiasMes;
import org.example.capitulo_3.EstacionesAnio;
import org.example.capitulo_3.SignosZodiaco;

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
        OrdenarMayorMenorTresNumeros ord = new OrdenarMayorMenorTresNumeros();
        ord.numero1 = 8;
        ord.numero2 = 3;
        ord.numero3 = 6;
        ord.ordenarMayorMenor();
        ord.mostrarNumerosOrdenados();

        System.out.println("-------------Este es el segundo archivo del segundo Capitulo----------------");
        MayorValorTresNumeros may  = new MayorValorTresNumeros();
        may.numero1 = 10;
        may.numero2 = 3;
        may.numero3 = 6;
        may.encontrarMayor();
        may.mostrarMayor();

        System.out.println("-------------Este es el tercer archivo del segundo Capitulo----------------");
        ClasificarAlumnosSegunPromedio alumno = new ClasificarAlumnosSegunPromedio();
        alumno.promedio = 15;
        alumno.mostrarClasificacion();

        System.out.println("-------------Este es el cuarto archivo del segundo Capitulo----------------");
        MontoPagarConDescuento compra = new MontoPagarConDescuento(100.0, 10.0);
        compra.mostrarMontoConDescuento();

        System.out.println("-------------Este es el primer archivo del tercer Capitulo----------------");
        CalculadorDeCincoFunciones func = new CalculadorDeCincoFunciones();
        func.numero1 = 24;
        func.numero2 = 5;
        func.mostrarResultados();

        System.out.println("-------------Este es el segundo archivo del tercer Capitulo----------------");
        SignosZodiaco persona = new SignosZodiaco();
        persona.dia = 25;
        persona.mes = 5;
        persona.mostrarSignoZodiaco();

        System.out.println("-------------Este es el tercer archivo del tercer Capitulo----------------");
        DiasMes diasMes = new DiasMes();
        diasMes.mes = 2;
        diasMes.mostrarDiasEnMes();

        System.out.println("-------------Este es el cuarto archivo del tercer Capitulo----------------");
        EstacionesAnio estaciones = new EstacionesAnio();
        estaciones.mes = 5;
        estaciones.mostrarEstacion();
    }
}