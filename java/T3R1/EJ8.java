package T3R1;

import java.util.Scanner;

public class EJ8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de horas trabajadas esta semana: ");
        int horas = scanner.nextInt();
        int sueldo = horas * 12;
        System.out.println("Tu salario semanal es de: " + sueldo);
        scanner.close();


    }
    
}
