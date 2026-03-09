package ConversorDeMonedas.principal;

import ConversorDeMonedas.API.ConsumoAPI;
import ConversorDeMonedas.calculos.Calculos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        var opcion = -1;
        String primeraMoneda = "";
        String segundaMoneda = "";

        var menuDeMonedas = """
                **********************************************************
                ¡Bienvenido/a al conversor de monedas!
                Seleccione una de nuestras conversiones predeterminadas
                
                1) Dólar(USD) =>> Peso Argentino(ARS)
                2) Peso Argentino(ARS) =>> Dólar(USD)
                3) Dólar(USD) =>> Real Brasileño(BRL)
                4) Real Brasileño(BRL) =>> Dólar(USD)
                5) Dólar(USD) =>> Peso Colombiano(COP)
                6) Peso Colombiano(COP) =>> Dólar(USD)
                7) Salir
                **********************************************************
                """;

        while (opcion != 7){
            System.out.println(menuDeMonedas);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    primeraMoneda = "USD";
                    segundaMoneda = "ARS";
                    break;
                case 2:
                    primeraMoneda ="ARS";
                    segundaMoneda = "USD";
                    break;
                case 3:
                    primeraMoneda = "USD";
                    segundaMoneda = "BRL";
                    break;
                case 4:
                    primeraMoneda = "BRL";
                    segundaMoneda = "USD";
                    break;
                case 5:
                    primeraMoneda = "USD";
                    segundaMoneda = "COP";
                    break;
                case 6:
                    primeraMoneda = "COP";
                    segundaMoneda = "USD";
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Coloco una opcion invalida");
                    break;

            }

            System.out.println("Ingrese el monto que desea convertir");
            double monto = teclado.nextDouble();
            double resultado = Calculos.calculando(ConsumoAPI.obtenerTasa(primeraMoneda,segundaMoneda),monto);
            System.out.println(monto+" "+primeraMoneda+" son ==> "+resultado+" "+segundaMoneda);



        }
    }
}
