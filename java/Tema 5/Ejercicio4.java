import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args){

        double valorA;
        double valorB;
        double valorSolucion;

        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Introduzca el valor de a: ");
        valorA = scanner.nextDouble();
        System.out.println("Ahora introduzca el valor de b: ");
        valorB = scanner.nextDouble();


        if (valorA == 0) {
            System.out.println("Esta ecuación no tiene solución real. ");
        }
        else{
        valorB = -valorB;
        valorSolucion = valorB/valorA;

        System.out.printf("x = %.1f",valorSolucion);
}

        scanner.close();



    }
}
