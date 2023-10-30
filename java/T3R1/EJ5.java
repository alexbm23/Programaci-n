package T3R1;

import java.util.Scanner;

public class EJ5 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de un rectángulo");
        System.out.println("---------------------");
        System.out.println("Introduce la longitud de la base en cm: ");
        Double longitud = scanner.nextDouble();
        System.out.println("Introduce la base del rectángulo: ");
        Double base = scanner.nextDouble();
        Double area = longitud * base;
        System.out.println("El área del rectángulo es " + area + " cm cuadrados");
        scanner.close();
    }
    
}
