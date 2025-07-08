import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        ConsultaMoneda consulta=new ConsultaMoneda();
        System.out.println("Seleccione una opción para la conversión:");

        System.out.println("1: DOLAR >>> PESO ARGENTINO");
        System.out.println("2: PESO ARGENTINO >>> DOLAR");
        System.out.println("3: DOLAR >>> REAL BRASILEÑO");
        System.out.println("4: REAL BRASILEÑO >>> DOLAR");
        System.out.println("5: DOLAR >>> PESO COLOMBIANO");
        System.out.println("6: PESO COLOMBIANO >>> DOLAR");
        System.out.println("7; SALIR");

        var opcion=Integer.valueOf(lectura.nextLine());

        String monedaBase = "";
        String monedaDestino = "";


        switch (opcion) {
            case 1:
                monedaBase = "USD";
                monedaDestino = "ARS";

                break;
            case 2:
                monedaBase = "ARS";
                monedaDestino = "USD";
                break;
            case 3:
                monedaBase = "USD";
                monedaDestino = "BRL";
                break;
            case 4:
                monedaBase = "BRL";
                monedaDestino = "USD";
                break;
            case 5:
                monedaBase = "USD";
                monedaDestino = "COP";
                break;
            case 6:
                monedaBase = "COP";
                monedaDestino = "USD";
                break;
            case 7:
                System.out.println("Saliendo...");
                return;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Ingresa la cantidad de "+monedaBase+" a convertir a "+monedaDestino);
        var cantidad=Integer.valueOf(lectura.nextLine());

        Moneda moneda = consulta.buscarMoneda(monedaBase);

        double numero=moneda.conversion_rates().get(monedaDestino);
        double calculo=numero*cantidad;
        String resultado = formatear(calculo);


        System.out.println("$"+cantidad+" "+monedaBase + " "+ "son $"+resultado+" "+monedaDestino);
    }

    public static String formatear(double valor) {
        DecimalFormat df = new DecimalFormat("0.###############");
        return df.format(valor);
    }
}