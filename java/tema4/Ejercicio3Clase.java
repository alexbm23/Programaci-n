import java.util.Scanner;
public class Ejercicio3Clase {

    public static void main (String [] args){

        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu edad: ");
        edad = scanner.nextInt();

        if (edad <= 17){
            System.out.println("Eres menor de edad");
        }
        else if ((edad >= 18) && (edad <= 65)){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres jubilado");
        }

    scanner.close();
    }
   
}
