import java.util.Scanner;

public class Ejercicio5Clase {
    public static void main (String [] args){

        int menu;
        double ladoCuadrado;
        double areaCuadrado;
        double baseRectangulo;
        double alturaRectangulo;
        double areaRectangulo;
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una de las 3 opciones:");
        System.out.println("OPCIÓN 1: Calcular el área de un cuadrado");
        System.out.println("OPCIÓN 2: Calcular el área de un rectángulo");
        System.out.println("OPCIÓN 3: Calcular el área de un triángulo");
        menu = scanner.nextInt();

        switch (menu){
            case 1:
            System.out.println("Escribe la longitud de los lados del cuadrado");
            ladoCuadrado = scanner.nextDouble();
            areaCuadrado = ladoCuadrado * ladoCuadrado;
            System.out.println("El área del cuadrado es: " + areaCuadrado);
            break;

            case 2:
            System.out.println("Escribe la longitud de la base del rectángulo");
            baseRectangulo = scanner.nextDouble();
            System.out.println("Escribe la longitud de la altura del rectángulo");
            alturaRectangulo = scanner.nextDouble();
            areaRectangulo = baseRectangulo * alturaRectangulo;
            System.out.println("El área del rectángulo es: " + areaRectangulo);
            break;

            case 3:
            System.out.println("Escribe la longitud de la base del triángulo");
            baseTriangulo = scanner.nextDouble();
            System.out.println("Escribe la longitud de la altura del triángulo");
            alturaTriangulo = scanner.nextDouble();
            areaTriangulo = baseTriangulo * alturaTriangulo / 2;
            System.out.println("El área del triangulo es: " + areaTriangulo);
            break;

            default:
            System.out.println("Escribe una opción disponible...");
            break;

        }


        scanner.close();

    }
}
