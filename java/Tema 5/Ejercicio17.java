import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String [] args){
        int numero;
        String cadenaNumero;
        int digitos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
        numero = scanner.nextInt();

        if(numero<0){
            numero = -numero;
        }

        cadenaNumero = Integer.toString(numero);

        digitos = cadenaNumero.length();


        System.out.printf("El número introducido tiene %d digitos",digitos);



        scanner.close();



    }
    
}
