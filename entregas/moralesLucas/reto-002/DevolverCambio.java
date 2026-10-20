import java.util.Scanner;

public class DevolverCambio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int importePagar;
        int importeEntregado;
        int cambio;

        int billetes100;
        int billetes50;
        int billetes20;
        int billetes10;
        int billetes5;
        int monedas2;
        int monedas1;

        System.out.println("¿Cuántos euros debe pagar?");
        importePagar = teclado.nextInt();
        System.out.println();
        System.out.println("¿Con cuántos euros paga?");
        importeEntregado = teclado.nextInt();
        cambio = importeEntregado - importePagar;

        billetes100 = cambio / 100;
        cambio = cambio % 100;

        billetes50 = cambio / 50;
        cambio = cambio % 50;

        billetes20 = cambio / 20;
        cambio = cambio % 20;
        billetes10 = cambio / 10;
        cambio = cambio % 10;
        billetes5 = cambio / 5;
        cambio = cambio % 5;
        monedas2 = cambio / 2;
        cambio = cambio % 2;
        monedas1 = cambio / 1;
    }
} 


