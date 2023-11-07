package tema4;

import java.util.Scanner;

public class Ejercicio1SwitchClase {
    public static void main(String [] args){
        int dia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el día de la semana: ");
        dia = scanner.nextInt();
        switch (dia){
            case 1 :
                System.out.println("Es día entre semana");
            break;
            case 2 :
                System.out.println("Es día entre semana");
            break;
            case 3 :
                System.out.println("Es día entre semana");
            break;
            case 4 :
                System.out.println("Es día entre semana");
                break;
            case 5 :
                System.out.println("Es dia entre semana");
                break;
            case 6 :
                System.out.println("Es fin de semana");
            break;
            case 7 :
                System.out.println("Es fin de semana");
            break;
            default:
                System.out.println("Error: no se corresponde con ningún día de la semana");
            break;

        }
    scanner.close();    
    }
    
    
}
