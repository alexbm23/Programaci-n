import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String [] args){
        int numero;
        String converNumero;
        char digito;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
        numero = scanner.nextInt();

        converNumero = Integer.toString(numero);
        digito = converNumero.charAt(0);

        System.out.printf("El primer dígito del número introducido es %c",digito);

        scanner.close();

    }
    
}
