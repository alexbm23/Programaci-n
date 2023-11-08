    import java.util.Scanner;
public class Ejercicio2 {

    public static void main (String [] args){
        int hora;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una hora del día (0 - 23): ");
        hora = scanner.nextInt();

        if((hora>=6 && hora<=12)){
            System.out.println("Buenos días.");
        }
        else if(hora>=13 && hora<=20){
            System.out.println("Buenas tardes. ");
        }
        else if ((hora>=0 && hora<=5) || (hora>=21 && hora<=23)){
            System.out.println("Buenas noches. ");
        }
        else if(hora>23){
            System.out.println("La hora introducida no es correcta. ");
        }
        scanner.close();
        }
    
}
