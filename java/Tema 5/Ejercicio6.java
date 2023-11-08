import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double nota3;
        double sumaNotas;
        double media;


        
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduzca la primera nota:");
        nota1= scanner.nextDouble();
        System.out.println("Ahora introduzca la segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Por último introduzca la tercerna nota: ");
        nota3= scanner.nextDouble();

        sumaNotas= nota1 + nota2 + nota3;
        media = sumaNotas/3;

        System.out.printf("La media es de %.2f",media);




        scanner.close();

    }
}