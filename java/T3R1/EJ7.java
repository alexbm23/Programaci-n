package T3R1;

import java.util.Scanner;

public class EJ7 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la base imponible (precio del artículo sin IVA): ");
        double base = scanner.nextDouble();
        double iva = base * 0.21;
        double total = base + iva;

        System.out.println("Base imponible: " + base);
        System.out.println("IVA 21%: " + iva);
        System.out.println("Total: " + total);
        scanner.close();


    }


}
