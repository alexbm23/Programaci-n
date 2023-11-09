import java.util.Scanner;
public class Ejercicio23 {
    public static void main (String [] args){
        int altura;
        int anchura;
        double areaBandera;
        double precioPorCm;
        String escudo;
        double precioEscudo;
        double precioTotal;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cms: ");
        altura = scanner.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        anchura = scanner.nextInt();
        areaBandera = altura * anchura;

        String ayuda = scanner.nextLine();

        System.out.print("¿Quiere escudo borado? (s/n): ");
        escudo = scanner.nextLine();

        precioPorCm = areaBandera * 0.01;     

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %.2f cm\u00B2:\t%.2f €\n", areaBandera,precioPorCm);
        if(escudo.equals("s")){
            System.out.println("Con escudo:\t\t3,25 €");
            precioEscudo = 3.25;
        }
        else{
            System.out.println("Sin escudo:\t\t0,00 €");
            precioEscudo = 0;
        }
        System.out.println("Gastos de envío:\t3,25 €");

        precioTotal = precioEscudo + 3.25 + precioPorCm;

        System.out.printf("Total:\t\t\t%.2f €",precioTotal);
        







        scanner.close();


    }
    
}
