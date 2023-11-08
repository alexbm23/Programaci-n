 import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String [] args){

        int horas;
        int sueldoNormal;
        int sueldoExtra;
        int sueldoTotal;
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número de horas trabajadas durante la semana: ");
        horas = scanner.nextInt();

        sueldoNormal = 12;

        if(horas <= 40){
            sueldoTotal = horas * sueldoNormal;
            System.out.printf("El sueldo semanal que le corresponde es de %d euros",sueldoTotal);

        }else{
            sueldoNormal = 40 * 12;
            horas = horas - 40;
            sueldoExtra = horas * 16;
            sueldoTotal = sueldoNormal + sueldoExtra;
            System.out.printf("El sueldo semanal que le corresponde es de %d euros",sueldoTotal);
        }

        scanner.close();
    }
}