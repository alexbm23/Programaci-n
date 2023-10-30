package T3R1;

import java.util.Scanner;

public class EJ2 {
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de euros que quiere convertir: ");
    int euros = scanner.nextInt();

    Double pesetas = euros * 166.3;

    System.out.println(euros + " euros son " + pesetas + " pesetas");

    scanner.close();
}
}
