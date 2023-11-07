package tema4;

import java.util.Scanner;

public class ejercicio2clase {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        final String PALABRA_SECRETA = "galapago";

        System.out.println("Adivina la palabra: ");
        String palabra;
        palabra = System.console().readLine();

        if (palabra.equals(PALABRA_SECRETA)){
            System.out.println("!Has adivinado la palabra secreta");
        }
        else{
            System.out.println("Ooohh... No has adividnado");

        }

    scanner.close();
        
    }
    
}
