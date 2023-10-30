package T3R1;

import java.util.Scanner;

public class EJ3 {
    public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de pesetas que quieres convertir: ");
    int pesetas = scanner.nextInt();

    Double euros = pesetas / 166.38;
    System.out.println(pesetas + " pesetas son " + euros + " euros");
    scanner.close();
    }
}
