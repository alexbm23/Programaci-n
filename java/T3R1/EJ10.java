package T3R1;

import java.util.Scanner;

public class EJ10 {
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca el número de Mb: ");
    Double megas = scanner.nextDouble();
    double kilos = megas * 1000;
    System.out.println("" + megas + " son " + kilos + " kb");
    scanner.close();
    }
}
