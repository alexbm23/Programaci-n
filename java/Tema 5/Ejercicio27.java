import java.util.Scanner;
public class Ejercicio27 {
    public static void main (String [] args){

        String comida;
        String tipoPitufo = "";
        double precioComida = 0;
        String bebida = "";
        double precioBebida = 0;
        double precioTotal = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida = scanner.nextLine();


        if(comida.equals("pitufo")){
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            tipoPitufo = scanner.nextLine();
            
        }
       

        System.out.print("¿Qué ha tomao de beber? (zumo o cafe):");
        bebida = scanner.nextLine();
        if(comida.equals("donut")){
                    System.out.print("Donut: 1\n");
                    precioComida = 1;

                }
                else if(comida.equals("palmera")){
                    System.out.print("Palmera: 1.40\n");
                    precioComida = 1.40;
                }

         switch(tipoPitufo){
            case "tortilla":
                System.out.println("Pitufo con tortilla: 1.60");
                precioComida = 1.60;
            break;
            case "aceite":
                 System.out.println("Pitufo con aceite 1,20");
                precioComida = 1.20;
            break;
            default:
            break;
        }
        if(bebida.equals("zumo")){
            System.out.println("Zumo: 1.50");
            precioBebida = 1.50;

        }
        else if(bebida.equals("cafe")){
            System.out.println("Café: 1.20");
            precioBebida = 1.20;
        }

        precioTotal = precioBebida + precioComida;

        System.out.printf("Total desayuno %.2f",precioTotal);










        scanner.close();



    }
    
}
