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
import org.example.capitulo_4.FactorizarNumero;
import org.example.capitulo_4.IndicarSiEsNumeroPrimo;
import org.example.capitulo_4.IndicarSiUnNumeroEsPerfecto;
import org.example.capitulo_4.LeerNumero_e_InvertirSusCifras;
import org.example.capitulo_5.CalculoDelValorDePi;
import org.example.capitulo_5.CantidadNumerosPositivosNegativosParesImparesIngresados;
import org.example.capitulo_5.MaximaAreaDeTerreno;
import org.example.capitulo_5.RaizCuadradaPorMetodoNewton;
import org.example.capitulo_6.MayorDe_n_Numeros;
import org.example.capitulo_6.PromedioDe_n_Numeros;
import org.example.capitulo_6.SumaDeFracciones;
import org.example.capitulo_6.ValorNumericoDeUnPolinomioDeGradoN;
import org.example.capitulo_7.EliminaElementosRepetidosEnUnArray;
import org.example.capitulo_7.LeerNumerosDeUnArrayEImprimirlos;
import org.example.capitulo_7.MediaAritmeticaDeUnConjuntoDeDatos;
import org.example.capitulo_7.OrdenamientoPorBurbuja;
import org.example.capitulo_8.DivisoresComunesDeDosNumeros;
import org.example.capitulo_8.NumeroPrimo;
import org.example.capitulo_8.Primeros_m_MultiplosDe_n;
import org.example.capitulo_8.TeoremaDelCoseno;

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
        MontoPagarConDescuento compra = new MontoPagarConDescuento();
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

        System.out.println("-------------Este es el primero archivo del cuarto Capitulo----------------");
        FactorizarNumero factor = new FactorizarNumero();
        factor.MostrarFactores();

        System.out.println("-------------Este es el segundo archivo del cuarto Capitulo----------------");
        IndicarSiEsNumeroPrimo verificador = new IndicarSiEsNumeroPrimo();
        verificador.numero = 5;
        verificador.MostrarSiEsNumeroPrimo();

        System.out.println("-------------Este es el tercer archivo del cuarto Capitulo----------------");
        IndicarSiUnNumeroEsPerfecto perfec = new IndicarSiUnNumeroEsPerfecto();
        perfec.numero = 6;
        perfec.mostrarSiEsPerfecto();

        System.out.println("-------------Este es el cuarto archivo del cuarto Capitulo----------------");
        LeerNumero_e_InvertirSusCifras leer = new LeerNumero_e_InvertirSusCifras();
        leer.numero = 19;
        leer.mostrarNumeroInvertido();

        System.out.println("-------------Este es el primero archivo del quinto Capitulo----------------");
        CalculoDelValorDePi pi = new CalculoDelValorDePi();
        pi.mostrarValorPi();

        System.out.println("-------------Este es el segundo archivo del quinto Capitulo----------------");
        RaizCuadradaPorMetodoNewton raiz = new RaizCuadradaPorMetodoNewton();
        raiz.numero = 9;
        raiz.mostrarRaizCuadrada();

        System.out.println("-------------Este es el tercer archivo del quinto Capitulo----------------");
        CantidadNumerosPositivosNegativosParesImparesIngresados cant = new CantidadNumerosPositivosNegativosParesImparesIngresados();
        cant.MostrarNumeros();

        System.out.println("-------------Este es el cuarto archivo del quinto Capitulo----------------");
        MaximaAreaDeTerreno max = new MaximaAreaDeTerreno();
        max.MostrarAreaDeTerreno();

        System.out.println("-------------Este es el primer archivo del sexto Capitulo----------------");
        MayorDe_n_Numeros mayor = new MayorDe_n_Numeros();
        mayor.mostrarMayor();

        System.out.println("-------------Este es el segundo archivo del sexto Capitulo----------------");
        PromedioDe_n_Numeros prom = new PromedioDe_n_Numeros();
        prom.mostrarPromedio();

        System.out.println("-------------Este es el tercer archivo del sexto Capitulo----------------");
        SumaDeFracciones suma = new SumaDeFracciones();
        suma.sumafracciones();

        System.out.println("-------------Este es el cuarto archivo del sexto Capitulo----------------");
        ValorNumericoDeUnPolinomioDeGradoN valor = new ValorNumericoDeUnPolinomioDeGradoN();
        valor.mostrarValor();

        System.out.println("-------------Este es el primer archivo del septimo Capitulo----------------");
        LeerNumerosDeUnArrayEImprimirlos leernum = new LeerNumerosDeUnArrayEImprimirlos();
        leernum.mostrarArray();

        System.out.println("-------------Este es el segundo archivo del septimo Capitulo----------------");
        MediaAritmeticaDeUnConjuntoDeDatos media = new MediaAritmeticaDeUnConjuntoDeDatos();
        media.mostrarMedia();

        System.out.println("-------------Este es el tercer archivo del septimo Capitulo----------------");
        EliminaElementosRepetidosEnUnArray eliminar = new EliminaElementosRepetidosEnUnArray();
        eliminar.mostrarElementos();

        System.out.println("-------------Este es el cuarto archivo del septimo Capitulo----------------");
        OrdenamientoPorBurbuja ordenar = new OrdenamientoPorBurbuja();
        ordenar.mostrarArreglo();

        System.out.println("-------------Este es el primer archivo del octavo Capitulo----------------");
        Primeros_m_MultiplosDe_n multiplos = new Primeros_m_MultiplosDe_n();
        multiplos.mostrarMultiplos();

        System.out.println("-------------Este es el segundo archivo del octavo Capitulo----------------");
        NumeroPrimo primo = new NumeroPrimo();
        primo.primo();

        System.out.println("-------------Este es el tercer archivo del octavo Capitulo----------------");
        DivisoresComunesDeDosNumeros divisor = new DivisoresComunesDeDosNumeros();
        divisor.mostrarDivisores();

        System.out.println("-------------Este es el cuarto archivo del octavo Capitulo----------------");
        TeoremaDelCoseno coseno = new TeoremaDelCoseno();
        coseno.mostrarTeorema();
    }
}