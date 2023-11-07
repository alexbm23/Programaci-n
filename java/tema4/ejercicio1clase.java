package tema4;

import java.util.Scanner;

public class ejercicio1clase {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Qué nota has sacado en el último examen? ");
        double nota = scanner.nextDouble();

        if ((nota >= 5) && (nota <= 10)){
            System.out.println("Enhorabuena, has aprobado");
        }
        else if ((nota >= 0) && (nota <5)){
            System.out.println("Lo siento, has suspendido");
        }
        else {
            System.out.println("Nota introducida inválido");

        }

        scanner.close();


    }
    
}
