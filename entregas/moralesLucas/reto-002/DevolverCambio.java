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
    }
} 


