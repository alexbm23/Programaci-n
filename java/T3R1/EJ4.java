package T3R1;

import java.util.Scanner;

public class EJ4 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int segundoNumero = scanner.nextInt();

        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        double divi = primerNumero / segundoNumero;
        int multi = primerNumero * segundoNumero;

        System.out.println("x = " + primerNumero);
        System.out.println("y = " + segundoNumero);
        System.out.println("x + y = " + suma);
        System.out.println("x - y = " + resta);
        System.out.println("x / y = " + divi);
        System.out.println("x * y = " + multi);
        scanner.close();
    }
    
}
