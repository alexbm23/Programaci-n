package T3R1;

import java.util.Scanner;

public class EJ12 {

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la nota del primer examen: ");
        Double primeraNota = scanner.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?: ");
        Double trimestreNota = scanner.nextDouble();
        Double primeraMedia = primeraNota * 0.40;
        Double segundaNota = trimestreNota - primeraMedia;
        Double notaFinal = segundaNota / 0.6;
        System.out.println("Necesitas sacar un " + notaFinal + " para tener un " + trimestreNota + " en el trimestre");
        scanner.close();



    }
    
}
