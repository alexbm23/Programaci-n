import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String [] args){
    String respuesta1;
    int nota;
    nota = 0;


    Scanner scanner = new Scanner(System.in);

    System.out.printf("\033[1mCUESTIONARIO DE 1º DAW\033[0m");
    System.out.println("1. ¿Cuál de los siguientes tipos de datos tiene más precisión?");
    System.out.println("\ta. int");
    System.out.println("\tb. double");
    System.out.println("\tc. float");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("b")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
    System.out.println("\ta. XML");
    System.out.println("\tb. SELECT");
    System.out.println("\tc. SQL");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("c")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }


    System.out.println("3. Para insertar un hiperenlace de una página se utiliza la etiqueta...");
    System.out.println("\ta. href");
    System.out.println("\tb. a");
    System.out.println("\tc. link");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("a")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }

    System.out.println("¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("\ta. /etc");
    System.out.println("\tb. /config");
    System.out.println("\tc. /cfg");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("a")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }
    
    
    System.out.println("5. ¿Cuál de lsa siguientes memorias es volátil?");
    System.out.println("\ta. RAM");
    System.out.println("\tb. EPROM");
    System.out.println("\tc. ROM");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("a")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }

    System.out.println("6. ¿Qué nombre adquiere una variable cuyo valor no puede cambiarse una vez se le asigna?");
    System.out.println("\ta. String");
    System.out.println("\tb. Constante");
    System.out.println("\tc. Variable");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("b")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }


    System.out.println("7. ¿Cuál es el nombre que se le da al microprocesador que controla la memoria gráfica?");
    System.out.println("\ta. GCPU");
    System.out.println("\tb. CPU Gráfico");
    System.out.println("\tc. GPU");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("c")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }


    System.out.println("8. ¿Qué componente del hardware de un ordenador almacena de forma permanente los datos incluso cuando se apaga la máquina");
    System.out.println("\ta. Disco Duro");
    System.out.println("\tb. RAM");
    System.out.println("\tc. Memoria Caché");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("a")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }

    System.out.println("9. ¿Cuál de estos programas es un Entorno de Desarrollo en el cual podemos programar con Java?");
    System.out.println("\ta. EDRPlus");
    System.out.println("\tb. XAMMP");
    System.out.println("\tc. VS Code");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("c")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }
    

    System.out.println("10. ¿Qué nombre adquiere el archivo oculto que se genera cuando hacemos el comando >git init<?");
    System.out.println("\ta. .git");
    System.out.println("\tb. .init");
    System.out.println("\tc. .repo");
    System.out.print("=>");
    respuesta1 = scanner.nextLine();
    if(respuesta1.equals("a")){
        System.out.println("Correcto");
        nota = nota + 1;
    }
    else {
        System.out.println("Incorrecto");
    }

    System.out.printf("Has obtenido %d puntos",nota);

    scanner.close();
    }
}
