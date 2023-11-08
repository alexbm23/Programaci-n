import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String [] args){
// raiz cuadrada = Math.sqrt(lo que sea);
    final double gravedad;
    double altura;
    double ayuda1;
    double total;

    gravedad = 9.81;
        
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Introduce la altura (en metros) desde la que cae el objeto: ");
    altura = scanner.nextDouble();

    ayuda1 = 2*altura/gravedad;
    total = Math.sqrt(ayuda1);
    System.out.printf("El objeto tarda %.2f segundos.",total);


        scanner.close();

    }
}
