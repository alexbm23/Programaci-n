import java.io.*;
public class Ejercicio1 {
    public static void main (String [] args) {
    String dia ;

    Console cnsl = System.console();
  

    System.out.println("Introduce un día de la semana y te diré qué asignatura toca a primera hora de ese día: ");
    dia = cnsl.readLine();

    switch (dia) {
        case "lunes":
            System.out.printf("\033[1mPROGRAMACIÓN\033[0m");
            break;
        case "martes":
            System.out.printf("\033[1mPROGRAMACIÓN\033[0m");
            break;
        case "miércoles":
            System.out.printf("\033[1mSISTEMAS INFORMÁTICOS\033[0m");
            break;
        case "jueves":
            System.out.printf("\033[1mBASES DE DATOS\033[0m");
            break;
        case "viernes":
            System.out.printf("\033[1mSISTEMAS INFORMÁTICOS\033[0m");
            break;
        
        default:
        System.out.println("El día introducido no es correcto ");
            break;
    }


    }
    
}
