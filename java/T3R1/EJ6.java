package T3R1;

import java.util.Scanner;

public class EJ6 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de un triángulo");
        System.out.println("---------------------");
        System.out.println("Introduce la longitud de la altura en cm: ");
        Double longitud = scanner.nextDouble();
        System.out.println("Introduce la base del triángulo: ");
        Double base = scanner.nextDouble();
        Double area = longitud * base / 2;
        System.out.println("El área del triángulo es " + area + " cm cuadrados");
        scanner.close();


    }
    
}
