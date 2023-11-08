import java.util.Scanner;
public class Ejercicio15 {
    
    public static void main (String []args){

    int numero;
    int digito;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce un número entero: ");
    numero = scanner.nextInt();


    digito = numero%10;

    System.out.printf("El último dígito del número introducido es el %d",digito);



    scanner.close();

    }
}
