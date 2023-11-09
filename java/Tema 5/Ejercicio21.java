import java.util.Scanner;
public class Ejercicio21 {
    public static void main (String [] args){

        double base;
        String tipoIva;
        double valorIva = 0;
        double añadirIva;
        double precioMasIva;
        String tipoPromo;
        double valorPromo = 0;
        double descuento = 0;
        double promoADescontar;
        String ayuda = "";
        double precioTotal;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduzca la base imponible: ");
        base = scanner.nextDouble();

        ayuda = scanner.nextLine();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        tipoIva = scanner.nextLine();

        switch(tipoIva){
            case "general":
            valorIva = 21;
            break;
            case "reducido":
            valorIva = 10;
            break;
            case "superreducido":
            valorIva = 4;
            break;
            default:
            break;
        }

        añadirIva = base / 100 * valorIva;
        precioMasIva = base + añadirIva;



        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        tipoPromo = scanner.nextLine();

        switch(tipoPromo){
            case "nopro":
            valorPromo = 1;
            break;
            case "mitad":
            valorPromo= 50;
            break;
            case "meno5":
            descuento = 5;
            break;
            case "5porc":
            valorPromo=5;
            break;
            default:
            valorPromo=0;
            break;
        }

        if(tipoPromo.equals("meno5")){
            promoADescontar= 5;

        }
        else if (tipoPromo.equals("nopro")){
            promoADescontar = 0;
        }
        else{
            promoADescontar = precioMasIva / 100 * valorPromo;
        }

        precioTotal = precioMasIva - promoADescontar;

        System.out.printf("Base imponible\t\t%.2f\n",base);
        System.out.printf("IVA (%.2f%%)\t\t%.2f\n",valorIva,añadirIva);
        System.out.printf("Precio con IVA\t\t%f\n",precioMasIva);
        System.out.printf("Cod. promo. (%s): -%.2f\n",tipoPromo,promoADescontar);
        System.out.printf("\033[46;1mTOTAL:                  %.2f\033[0m",precioTotal);





        scanner.close();


    }
}
