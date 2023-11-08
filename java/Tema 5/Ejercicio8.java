import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String [] args){

        double valorA;
        double valorB;
        double menosB;
        double valorC;
        double DR;
        double ayudaDR;
        double div;
        double ayudaTotal1;
        double ayudaTotal2;
        double totalx2;
        double totalx1;

    Scanner scanner = new Scanner(System.in);


        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("axe2 + bx + c = 0");
        System.out.println("Introduce los valores: ");
        System.out.println("a = ");
        valorA = scanner.nextDouble();
        System.out.println("b = ");
        valorB = scanner.nextDouble();
        System.out.println("c = ");
        valorC = scanner.nextDouble();

        // casos: dr(dentro de la raiz)<0 NO TIENE SOLUCIONES REALES
        // a b c == 0 INFINITAS SOLUCIONES
        // a b == 0 NO TIENE SOLUCION


        ayudaDR = 4 * valorA * valorC;
        
        DR = valorB * valorB - ayudaDR;

        if (DR<0){
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        else if((valorA==0) && (valorB == 0) && (valorC == 0)){
            System.out.println("La ecuación tiene infinitas soluciones");
        }
        else if((valorA == 0) && (valorB == 0)){
            System.out.println("La ecuación no tiene solución");
        }
        else{
        div = valorA * 2;
        menosB = -valorB;

        ayudaTotal1 = menosB + Math.sqrt(DR);
        ayudaTotal2 = menosB - Math.sqrt(DR);

        totalx2 = ayudaTotal2 / div;

        totalx1 = ayudaTotal1 / div;



        System.out.printf("x1 = %.1f\n",totalx1);
        System.out.printf("x2 = %.1f",totalx2);
        }

    scanner.close();



    }
}
