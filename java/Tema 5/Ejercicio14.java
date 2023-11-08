import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String [] args){

        String respuesta;
        int contador;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.");
        System.out.printf("\n");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("(v)erdadero o (f)also: ");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador=3;
        }
        else{
            contador = 0;
        }

        System.out.println("2. Ha aumentado sus gastos en vestuario.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }
        
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("4. Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer).");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("6. A veces tiene llamada que dice no querer contestar cuando estás tú delante.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar por que dice tener mucho más trabajo.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        respuesta = scanner.nextLine();
        if(respuesta.equals("v")){
            contador = contador + 3;
        }

        if(contador>=0 && contador<=10){
            System.out.println("!Enhorabuena¡ Tu pareja parece ser totalmente fiel.");
        }
        else if(contador>=11 && contador <=22){
            System.out.println("Quizás exista el peligro de otra persona en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        else if (contador>=23 && contador <= 30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué eslo que está pasando por su cabeza");
        }
        


        scanner.close();



    }
    
}
