import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String [] args){

        String dia;
        int diaNumero;
        int hora;
        int minutos;
        int diasRestantes;
        int horasRestantes;
        int minutosRestantes;
        int minutosTotales;
        int minutosDias;
        int minutosHoras;

        Scanner scanner = new Scanner(System.in);

        diaNumero = 0;
        minutosDias = 0;

        System.out.println("Introduzca un día de la semana (de lunes a viernes): ");
        dia = scanner.nextLine();
        switch(dia){
            case "lunes":
                diaNumero = 1;
                break;
            case "martes":
                diaNumero = 2;
                break;
            case "miercoles":
                diaNumero = 3;
                break;
            case "jueves":
                diaNumero = 4;
                break;
            case "viernes":
                diaNumero = 5; 
                break;
        }
        System.out.println("A continuación introduzca la hora (horas y minutos)");
        System.out.print("Hora: ");
        hora= scanner.nextInt();
        System.out.print("Minutos: ");
        minutos = scanner.nextInt();

        if(diaNumero==5 && hora>=15){
            System.out.println("Ya es fin de semana");
        }
        else if(diaNumero!=5 && minutos!=0){
            
            diasRestantes = 5 - diaNumero;
            horasRestantes = 23 - hora;
            minutosRestantes = 60 - minutos;

            minutosDias = diasRestantes * 1440;
            minutosHoras = horasRestantes * 60;
            minutosTotales = minutosDias + minutosHoras + minutosRestantes - 540;

            System.out.printf("Faltan %d minutos para llegar al fin de semana",minutosTotales);

        }else if(minutos==0){
            diasRestantes = 5 - diaNumero;
            horasRestantes = 23 - hora;
            minutosRestantes = 0;

            minutosDias = diasRestantes * 1440;
            minutosHoras = horasRestantes * 60;
            minutosTotales = minutosDias + minutosHoras + minutosRestantes - 480;
            System.out.printf("Faltan %d minutos para llegar al fin de semana",minutosTotales);

        }else{
            diasRestantes = 5 - diaNumero;
            horasRestantes = 14 - hora;
            minutosRestantes = 60 - minutos;

            minutosDias = diasRestantes * 1440;
            minutosHoras = horasRestantes * 60;
            minutosTotales = minutosDias + minutosHoras + minutosRestantes;

            System.out.printf("Faltan %d minutos para llegar al fin de semana",minutosTotales);
        }

        scanner.close();



    }
    
}
