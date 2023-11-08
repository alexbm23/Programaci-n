import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String [] args){

        int numero;
        String parImpar;
        int ayudaParImpar;
        String div;
        int ayudaDiv;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        numero = scanner.nextInt();


        ayudaParImpar = numero%2;
        if(ayudaParImpar == 0){
            parImpar = "par";
        }
        else{
            parImpar = "impar";
        }

        ayudaDiv = numero%5;
        if(ayudaDiv == 0){
            div = "es";
        }
        else{
            div = "no es";
        }


        System.out.printf("El número introducido es \033[1m%s\033[0m y \033[1m%s divisible\033[0m entre 5", parImpar,div);



        scanner.close();
    }
    
}
