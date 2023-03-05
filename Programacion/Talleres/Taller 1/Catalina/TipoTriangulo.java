import java.util.Scanner; //Esto es un paquete llamado Util.Scanner, el cual se usa para capturar datos ingresados manualmente, se puede capturar cualquier tipo de dato.

public class TipoTriangulo { //Esto es una clase publica llamada TipoTriangulo
    public void metPrincipalTipoTriangulo() { //Esto es un metodo público que retorna un valor vacio que se llama metPrincipalTipoTriangulo
        Scanner objEntrada = new Scanner(System.in); //Se llama a la libreria Scanner, se agrega un nombre y se inicia
        double angA = 0, // se ingresa la opcion de munros decimales
                angB = 0,
                angC = 0,
                ladoA = 0,
                ladoB = 0,
                ladoC = 0,
                sumaAng = 0;
        int menu = 0; //variable llamada "menu" en donde se encontrara dideferes enunciados con numeros enteros, ej:
        System.out.println("\n Diseñe un programa que _indique el nombre del triangulo segun sus lados o angulos .\n"); //se indica el contenido del programa
        System.out.println("---- MENÚ TRIÁNGULO"); //indica los ejercicios especificos
        System.out.println("1. Ángulos"); //ejercicio #1 se imprime consola
        System.out.println("2. Lados"); //Ejercicio #2y se imprime consola
        System.out.print("Digite una opción del menú: ");  //se indica la acción 
        menu = objEntrada.nextInt(); //se almacena la opcion indicada en "menu" la cual es una variable
        switch (menu) { //se crea "switch" se ejecuta según la condicion o caso
            case 1: // caso 1
                System.out.print("\nDigite el ángulo A: "); //se solicita digitar el "angulo A"
                angA = objEntrada.nextDouble(); //la respuesta se guarda en la variable 
                System.out.print("Digite el ángulo B: "); // se solicita digitar el "angulo B"
                angB = objEntrada.nextDouble(); // se guarda la respuesta en la variable
                angC = 180 - (angA + angB); // se indica la formula o ecuacion segun el caso
                sumaAng = angA + angB + angC; // se suman todos los lados del triangulo para idedntificar que de que tipo es.
                if (sumaAng == 180 && angC > 0) { // se realiza la condicional "si la suma del angulo es igual a 180 y el angulo c es mayor que 0"
                    if (angA == 90 || angB == 90 || angC == 90) { //condicional "si los angulos son igual a 90 es un triangulo obtusangulo"
                        System.out.println("Es un triángulo: obtusangulo ");
                    } else if (angA < 90 && angB < 90 && angC < 90) { // condicional "si el angulo A es menor que 90 y ael angulo B es menor que 90 y el agulo c es menor que 90 es un triangulo acutanguo "
                        System.out.println("Es un triángulo: acutangulo ");
                    } else {
                        System.out.println("Es un triángulo:  isóseles ");
                    }
                } else { // si no cumple ninguna de las condiciones, saldra el mensaje de "datos incorrectos"
                    System.out.println("Es un triángulo:  isóseles ");
                } 
                }
                break;
            case 2: // caso número 2 
                System.out.print("\nDigite el ladoA: "); //se solicita al usuario digitar el lado A
                ladoA = objEntrada.nextDouble(); // se guarda el dato en la variable
                System.out.print("Digite el ladoB: "); //se solicita al usuario digresar el lado B
                ladoB = objEntrada.nextDouble(); // se guarda  el dato en la variable
                System.out.print("Digite el ladoC: "); // se solicita al usuario a digitar el lado C
                ladoC = objEntrada.nextDouble(); // se guarda el datonen la variable 
                if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) { //condicional "si el lado A es menor al lado B "
                    if (ladoA == ladoB && ladoB == ladoC) {
                        System.out.println("Es un triángulo: _________ ");
                    } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                        System.out.println("Es un triángulo: _________ ");
                    } else {
                        System.out.println("Es un triángulo: _________ ");
                    }
                } else {
                    System.out.println("Lados incorrectos");
                }
                break;
            default:
                System.out.println("La opción no existe");
        }
    }
}
