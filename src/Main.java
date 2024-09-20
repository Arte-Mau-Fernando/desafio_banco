import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner teclado = new Scanner(System.in);
        String cliente = "Tony Stark";
        String menu = """
                **********************************************************+
                **  Escribe el número de la opción deseada  **
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                ***********************************************************
                """;
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcionSeleccionada = 0;
        //Datos del cliente
        System.out.println("***********************************************************");
        System.out.println("Nombre del cliente: " + cliente);
        System.out.println("Tipo de cuenta:     " + tipoDeCuenta);
        System.out.println("Saldo disponible:   " + saldo + " $ ");
        //Ciclo while y case para las opciones de menu
        while (opcionSeleccionada != 9){
            //Guardamos la selección
            System.out.println(menu);
            opcionSeleccionada = teclado.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    System.out.println("Su saldo actual es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Cuál es el monto que desea retirar:_");
                    double retiro = teclado.nextDouble();
                    if (retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("Su saldo restante es: "+ saldo + "$");
                    }
                    else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el monto que desea depositar:_");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Su saldo actualizado es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios");
//                default:
//                    System.out.println("0pcion no valida");
            }
        }
        teclado.close();
    }
}