package T3R1;

import java.util.Scanner;

public class EJ1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        int numPrimero = scanner.nextInt();
        System.out.println("Por favor, introduzca el segundo número: ");
        int numSegundo = scanner.nextInt();
        int multi = numPrimero * numSegundo;
        System.out.println("" + numPrimero + " * " + numSegundo + " = " + multi);
        scanner.close();
    }
    
}
