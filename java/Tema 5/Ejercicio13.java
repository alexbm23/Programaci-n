import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        
    

    String caracter;
    int opcion;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa pinta una pirámide.");
    System.out.println("Introduzca el carácter de relleno: ");
    caracter = scanner.nextLine();
    System.out.println("Elija un tipo de pirámide: ");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    opcion = scanner.nextInt();

    switch(opcion){
        case 1:
            System.out.printf("La pirámide es: \n");
            System.out.printf("  %s \n",caracter);
            System.out.printf(" %s%s%s \n",caracter,caracter,caracter);
            System.out.printf("%s%s%s%s%s\n",caracter,caracter,caracter,caracter,caracter);

            break;
        case 2:
        System.out.printf("La pirámide es: \n");
            System.out.printf("%s%s%s%s%s\n",caracter,caracter,caracter,caracter,caracter);
            System.out.printf(" %s%s%s \n",caracter,caracter,caracter);
            System.out.printf("  %s \n",caracter);
            break;
        case 3:
            System.out.printf("La pirámide es: \n");
            System.out.printf("  %s\n",caracter);
            System.out.printf(" %s%s\n",caracter,caracter);
            System.out.printf("%s%s%s\n",caracter,caracter,caracter);
            System.out.printf(" %s%s\n",caracter,caracter);
            System.out.printf("  %s\n",caracter);
            break;
        case 4:
            System.out.printf("La pirámide es:\n");
            System.out.printf("%s  \n",caracter);
            System.out.printf("%s%s \n",caracter,caracter);
            System.out.printf("%s%s%s\n",caracter,caracter,caracter);
            System.out.printf("%s%s\n",caracter,caracter);
            System.out.printf("%s\n",caracter);
            break;
        default:
            System.out.println("Elige una opción válida");
    }
    scanner.close();


    }

    
    
    
    
    
    
    




}
