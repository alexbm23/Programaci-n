import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String [] args){

        int numero;
        String cadenaNumero;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
        numero = scanner.nextInt();

        cadenaNumero = Integer.toString(numero);

        if (numero/10000!=0){
            if((cadenaNumero.charAt(0)==cadenaNumero.charAt(4))&&(cadenaNumero.charAt(1)==cadenaNumero.charAt(3))){
                System.out.printf("El número introducido \033[1mes capucúa\033[0m");
            }
            else{
                System.out.printf("El número introducido \033[1mno es capicúa\033[0m");
            }
        }
        else if (numero/1000!=0){
            if((cadenaNumero.charAt(0)==cadenaNumero.charAt(3)) && (cadenaNumero.charAt(1)==cadenaNumero.charAt(2))){
                System.out.printf("El número introducido \033[1mes capucúa\033[0m");
            }
            else{
                System.out.printf("El número introducido \033[1mno es capicúa\033[0m");
            }
        }
        else if(numero/100!=0){
            if(cadenaNumero.charAt(0)==cadenaNumero.charAt(2)){
                System.out.printf("El número introducido \033[1mes capucúa\033[0m");
            }else{
                System.out.printf("El número introducido \033[1mno es capucúa\033[0m");
            }
        }
        else if(numero/10!=0){
            if(cadenaNumero.charAt(0)==cadenaNumero.charAt(1)){
                System.out.printf("El número introducido \033[1mes capucúa\033[0m");
            }else{
                System.out.printf("El número introducido \033[1mno es capucúa\033[0m");
            }
        }
        else{
            System.out.printf("El número introducido \033[1mes capucúa\033[0m ya que es de una sola cifra");
        }




        scanner.close();


    }
}
