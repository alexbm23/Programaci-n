import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String [] args){
        int hora;
        int minutos;
        int segundos;
        int segundosTotales;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        hora = scanner.nextInt();
        System.out.println("Introduce los minutos: ");
        minutos = scanner.nextInt();


        segundos = hora * 3600 + minutos * 60;
        segundosTotales = 24*3600 - segundos;



        System.out.printf("Desde las %d:%d hasta la medianoche faltan %d segundos.",hora,minutos,segundosTotales);




        scanner.close();

    }
    
}
