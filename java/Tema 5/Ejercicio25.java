import java.util.Scanner;
public class Ejercicio25 {
    
    public static void main (String [] args){

    String tipoTarta;
    String tipoChocolate = "";
    double precioTarta = 0;
    String nombre;
    double precioNombre = 0;
    String nata;
    double precioNata = 0;
    double precioTotal;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    tipoTarta = scanner.nextLine();

    if (tipoTarta.equals("chocolate")){
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate = scanner.nextLine();
        if(tipoChocolate.equals("negro")){
            precioTarta = 14;
        }
        else{
            precioTarta = 15;
        }
    
    }
    else if(tipoTarta.equals("manzana")){
        precioTarta = 18;
    }
    else if(tipoTarta.equals("fresa")){
        precioTarta = 16;
    }
    System.out.print("¿Quiere nata? (si o no):");
    nata = scanner.nextLine();

    

    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    nombre = scanner.nextLine();

    System.out.printf("Tarta de %s %s: %.2f\n",tipoTarta,tipoChocolate,precioTarta);

    if(nata.equals("si")){
            precioNata = 2.5;
            System.out.println("Con nata: 2,5");
        }

    if(nombre.equals("si")){
        precioNombre = 2.75;
        System.out.println("Con nombre: 2,75");
    }

    precioTotal = precioTarta + precioNombre + precioNata;

    System.out.printf("Total: %.2f",precioTotal);





    scanner.close();


}
}