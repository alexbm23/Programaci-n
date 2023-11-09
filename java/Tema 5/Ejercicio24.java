import java.util.Scanner;
public class Ejercicio24 {
    public static void main (String [] args){

        int numeroEntradas;
        int numeroEntradasPareja = 0;
        String diaSemana;
        int numeroDia = 0;
        String tarjeta;
        double precioEntradaIndividual = 8;
        double precioEntradaDoble = 11;
        double descuento = 0;
        double precioTotalEntradas;
        double precioTotalDobles;
        double precioTotalIndividual;
        double precioTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");
        System.out.print("Número de entradas: ");
        numeroEntradas = scanner.nextInt();
        String ayuda = scanner.nextLine();
        System.out.print("Día de la semana: ");
        diaSemana = scanner.nextLine();
        switch(diaSemana){
            case "lunes":
            numeroDia = 1;
            break;
            case "martes":
            numeroDia = 2;
            break;
            case "miercoles":
            numeroDia = 3;
            break;
            case "jueves":
            numeroDia = 4;
            break;
            case "viernes":
            numeroDia = 5;
            break;
            case "sabado":
            numeroDia = 6;
            break;
            case "domingo":
            numeroDia = 7;
            break;
        }
        System.out.print("¿Tienes tarjeta de CineCampa? (s/n): ");
        tarjeta = scanner.nextLine();

        

        System.out.println("");


        System.out.printf("Aquí tiene sus entradas. Gracias por su compra.\n");
        
        if(numeroDia==4 && numeroEntradas%2==0){
            numeroEntradasPareja = numeroEntradas/2;
            numeroEntradas=0;
            System.out.printf("Entradas de parejas:\t\t\t%d\n",numeroEntradasPareja);
            
            System.out.printf("Precio por entrada de parejas:\t\t%.2f\n",precioEntradaDoble);
            
            
        }else if(numeroDia==4 && numeroEntradas%2!=0){
            numeroEntradasPareja = numeroEntradas/2;
            numeroEntradas = 1;
            System.out.printf("Entradas de parejas:\t\t\t%d\n",numeroEntradasPareja);
            System.out.printf("Precio por entrada de parejas:\t\t%.2f\n",precioEntradaDoble);
            System.out.printf("Entradas individuales:\t\t\t1\n");
            System.out.printf("Precio por entrada individual:\t\t%.2f\n",precioEntradaIndividual);



        } else if (numeroDia==3){
            precioEntradaIndividual = 5;
            System.out.printf("Entradas individuales:\t\t\t%d\n",numeroEntradas);
            System.out.printf("Precio por entrada individual:\t\t%.2f\n",precioEntradaIndividual);
        } else {
            System.out.printf("Entradas individuales:\t\t\t%d\n",numeroEntradas);
            System.out.printf("Precio por entrada individual:\t\t%.2f\n",precioEntradaIndividual);
        }
        precioTotalDobles = numeroEntradasPareja * precioEntradaDoble;
        precioTotalIndividual = numeroEntradas * precioEntradaIndividual;
        precioTotalEntradas = precioTotalDobles + precioTotalIndividual;

        System.out.printf("total\t\t\t\t\t%.2f\n",precioTotalEntradas);

        if(tarjeta.equals("s")){
            descuento = precioTotalEntradas/10;
        }

        System.out.printf("Descuento\t\t\t\t%.2f\n",descuento);

        precioTotal = precioTotalEntradas - descuento;

        System.out.printf("A pagar\t\t\t\t\t%.2f\n",precioTotal);


        scanner.close();



    }

    
}

