import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String []args){
        double nota1;
        double nota2;
        double media;
        double sumaMedia;
        String recuperacion;
        String ayuda;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota del primer examen: ");
        nota1 = scanner.nextDouble();
        System.out.println("Nota del segundo examen: ");
        nota2 = scanner.nextDouble();

        sumaMedia= nota1 + nota2;
        media = sumaMedia / 2;

        ayuda = scanner.nextLine();

        if(media >= 5){
            System.out.printf("Tu nota en programación es %.2f",media);
        }else{
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            recuperacion = scanner.nextLine();
            if(recuperacion.equals("apto")){
                System.out.println("Tu nota en programación es un 5");}
                else{
                    System.out.printf("Tu nota en programación es %.2f",media);
                }
            }
        scanner.close();
        }

        
    }
    

