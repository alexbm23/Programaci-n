import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        int mes;
        int dia;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa te dirá cuál es tu horóscopo.");
        System.out.println("Introduce el número del mes en que nació (1-12)");
        mes = scanner.nextInt();
        System.out.println("Ahora introduce el día: ");
        dia = scanner.nextInt();

        if(((mes == 3) && (dia>= 21 || dia <=31)) || ((mes == 4) && (dia<=19 && dia >=1))){
            System.out.println("Su horóscopo es Aries");
        }
        else if(((mes == 4) && (dia>= 20 || dia <=30)) || ((mes == 5) && (dia<=20 && dia >=1))){
            System.out.println("Su horóscopo es Tauro");
        }
        else if(((mes == 5) && (dia>= 21 || dia <=31)) || ((mes == 6) && (dia<=20 && dia >=1))){
            System.out.println("Su horóscopo es Géminis");
        }
        else if(((mes == 6) && (dia>= 21 || dia <=30)) || ((mes == 7) && (dia<=22 && dia >=1))){
            System.out.println("Su horóscopo es Cáncer");
        }
        else if(((mes == 7) && (dia>= 23 || dia <=31)) || ((mes == 8) && (dia<=22 && dia >=1))){
            System.out.println("Su horóscopo es Leo");
        }
        else if(((mes == 8) && (dia>= 23 || dia <=31)) || ((mes == 9) && (dia<=22 && dia >=1))){
            System.out.println("Su horóscopo es Virgo");
        }
        else if(((mes == 9) && (dia>= 23 || dia <=30)) || ((mes == 10) && (dia<=22 && dia >=1))){
            System.out.println("Su horóscopo es Libra");
        }
        else if(((mes == 10) && (dia>= 23 || dia <=31)) || ((mes == 11) && (dia<=21 && dia >=1))){
            System.out.println("Su horóscopo es Escorpio");
        }
        else if(((mes == 11) && (dia>= 22 || dia <=30)) || ((mes == 12) && (dia<=21 && dia >=1))){
            System.out.println("Su horóscopo es Sagitario");
        }
        else if(((mes == 12) && (dia>= 22 || dia <=31)) || ((mes == 1) && (dia<=19 && dia >=1))){
            System.out.println("Su horóscopo es Capricornio");
        }
        else if(((mes == 1) && (dia>= 20 || dia <=31)) || ((mes == 2) && (dia<=18 && dia >=1))){
            System.out.println("Su horóscopo es Acuario");
        }
        else if(((mes == 2) && (dia>= 19 || dia <=28)) || ((mes == 3) && (dia<=20 && dia >=1))){
            System.out.println("Su horóscopo es Piscis");
        }

        scanner.close();

    }
}
