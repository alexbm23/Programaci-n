package T3R1;

import java.util.Scanner;

public class EJ9 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volumen de un cono: ");
        System.out.println("Introduce la altura del cono en cm: ");
        Double altura = scanner.nextDouble();
        System.out.println("Introduce el radio de la base en cm: ");
        Double radio = scanner.nextDouble();
        Double paso1 = 3.14 * radio * radio;
        Double paso2 = paso1 * altura / 3;
        System.out.println("El volumen del cono es de " + paso2 + "cm cúbicos");
        scanner.close();
        


    }

    
}
