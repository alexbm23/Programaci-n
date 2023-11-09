import java.util.Scanner;
public class Ejercicio26 {
    public static void main (String [] args){

        String jugador1;
        int mov1 = 0;
        String jugador2;
        int mov2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        jugador1 = scanner.nextLine();

        

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        jugador2 = scanner.nextLine();

        switch(jugador1){
            case"piedra":
            mov1 = 1;
            break;
            case"papel":
            mov1 = 2;
            break;
            case"tijera":
            mov1 = 3;
            break;
        }

        switch(jugador2){
            case"piedra":
            mov2 = 1;
            break;
            case"papel":
            mov2 = 2;
            break;
            case"tijera":
            mov2 = 3;
            break;
        }

        if(mov1==mov2){
            System.out.println("Empate");
        }
        else if((mov1==1 && mov2==3) || (mov1==2 && mov2==1) || (mov1==3 && mov2==2)){
            System.out.println("Gana el jugador 1");

        } 
        else{
            System.out.println("Gana el jugador 2");
        }




        scanner.close();

    }
    
}
