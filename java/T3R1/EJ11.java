package T3R1;

import java.util.Scanner;

public class EJ11 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de KB: ");
        Double kilos = scanner.nextDouble();
        Double megas = kilos / 1024;
        System.out.println("" + kilos + "kb son " + megas + "mb");
        scanner.close();



    }
    
}
