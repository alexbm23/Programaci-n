import java.util.Scanner;
public class Ejercicio22 {

    public static void main (String [] args){


        int numeroCargoEmpleado;
        double sueldo = 0;
        int diasViajando;
        double aumentoSueldo;
        int estadoCivil;
        int retencion = 0;
        double retencionTotal;
        double sueldoNeto;
        double sueldoBruto;

        Scanner scanner = new Scanner(System.in);



        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        numeroCargoEmpleado = scanner.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        diasViajando = scanner.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivil = scanner.nextInt();

        switch(numeroCargoEmpleado){
            case 1:
            sueldo = 950;
            break;
            case 2:
            sueldo = 1200;
            break;
            case 3:
            sueldo = 1600;
            break;
            default:
            break;
        }

        aumentoSueldo = diasViajando * 30;
        if (estadoCivil==1) {
            retencion = 25;
        }
        else{
            retencion = 20;
        }

        

        


        System.out.printf("--------------------------------\n");
        System.out.printf("|Sueldo base\t\t%.2f|\n",sueldo);
        sueldoBruto = sueldo + aumentoSueldo;
        System.out.printf("|Dietas (%d viajes) \t %.2f|\n",diasViajando,aumentoSueldo);
        System.out.printf("--------------------------------\n");
        System.out.printf("|Sueldo bruto\t\t%.2f|\n",sueldoBruto);

        aumentoSueldo = diasViajando * 30;
        if (estadoCivil==1) {
            retencion = 25;
        }
        else{
            retencion = 20;
        }

        retencionTotal = sueldoBruto / 100 * retencion;
        System.out.printf("|Retención IRFP (%d%%)\t %.2f|\n",retencion,retencionTotal);

        System.out.printf("--------------------------------\n");
        sueldoNeto = sueldoBruto - retencionTotal;
        System.out.printf("|Sueldo neto\t\t%.2f|\n",sueldoNeto);
        System.out.printf("--------------------------------\n");






        scanner.close();



    }
    
}
