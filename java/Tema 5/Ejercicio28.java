import java.util.Scanner;
public class Ejercicio28 {
    public static void main (String [] args){

        String articulo;
        double precioArticulo;
        int unidades;
        String fiesta;
        int descuento = 0;
        double precioBruto;
        double descuentoUnidad = 0;
        double precioDescontado;
        double iva = 0;
        double precioTotal;
        int ivaPorcentaje = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el nombre del artículo: ");
        articulo = scanner.nextLine();

        System.out.print("Introduzca el precio del artículo: ");
        precioArticulo = scanner.nextDouble();

        System.out.print("Introduzca el número de unidades vendidas: ");
        unidades = scanner.nextInt();

        String ayuda = scanner.nextLine();

        System.out.print("¿Aplicamos descuento en IVA por fiesta? (s/n): ");
        fiesta = scanner.nextLine();



        // TICKET - SALIDA POR PANTALLA

        System.out.println("\nFactura\n");
        System.out.println("==============================================");
        System.out.printf("Artículo\t\t\t %s\n",articulo);
        System.out.printf("Precio \t\t\t\t\t %.2f /unidad\n",precioArticulo);
        System.out.printf("Cantidad \t\t\t\t %d\n",unidades);

        precioBruto = precioArticulo * unidades;

        if(unidades>=1 && unidades<=3){
            descuento = 5;
            descuentoUnidad = precioBruto / 100 * descuento;
            System.out.printf("Descuento (%d%%) \t\t\t\t -%.2f\n",descuento,descuentoUnidad);
        }
        else if(unidades>=4 && unidades<=10){
            descuento = 10;
            descuentoUnidad = precioBruto / 100 * descuento;
            System.out.printf("Descuento (%d%%) \t\t\t -%.2f\n",descuento,descuentoUnidad);
        }
        else if(unidades>10){
            descuento = 15;
            descuentoUnidad = precioBruto / 100 * descuento;
            System.out.printf("Descuento (%d%%) \t\t\t -%.2f\n",descuento,descuentoUnidad);
        }

        precioDescontado = precioBruto - descuentoUnidad;

        System.out.printf("Subtotal con descuento \t\t\t %.2f\n",precioDescontado);

        if(fiesta.equals("s")){
            iva = precioDescontado /100 * 16;
            ivaPorcentaje = 16;
        }
        else if (fiesta.equals("n")){
            iva = precioDescontado /100 * 21;
            ivaPorcentaje = 21;
        }


        System.out.printf("IVA (%d%%) \t\t\t\t %.2f\n",ivaPorcentaje,iva);
        System.out.println("==============================================");

        precioTotal = precioDescontado + iva;

        System.out.printf("\033[47;1mTOTAL \t\t\t\t\t %.2f\033[0m",precioTotal);









        scanner.close();





    }


}
