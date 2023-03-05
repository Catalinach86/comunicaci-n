import java.util.Scanner; //Esto es un paquete llamado Util.Scanner, el cual se usa para capturar datos ingresados manualmente, se puede capturar cualquier tipo de dato.

public class TipoTriangulo { //Esto es una clase publica llamada TipoTriangulo

    public static void main(String[] args) {
        metPrincipalTipoTriangulo();
    }
    public void metPrincipalTipoTriangulo() { //Esto es un metodo público que retorna un valor vacio que se llama metPrincipalTipoTriangulo
        Scanner objEntrada = new Scanner(System.in); //Se llama a la libreria Scanner, se agrega un nombe y se inicializa
        double angA = 0, // Esto son variables tipos dobles
                angB = 0,
                angC = 0,
                ladoA = 0,
                ladoB = 0,
                ladoC = 0,
                sumaAng = 0;
        int menu = 0; //Esta es una variable tipo entera
        System.out.println("\n Diseñe un programa que indique el nombre del triangulo por sus lados o angulos .\n"); //Se imprime por consola
        System.out.println("---- MENÚ TRIÁNGULO ----"); //Se imprime por consola
        System.out.println("1. Ángulos"); //Se imprime por consola
        System.out.println("2. Lados"); //Se imprime por consola
        System.out.print("Digite una opción del menú: "); //Se imprime por consola
        menu = objEntrada.nextInt(); //Se llama a la variable menu, a la cual se le asignara el valor digitado en la consola
        switch (menu) { //Se crea un swich la cual su parametro es la variable menu
            case 1: //Este es el caso 1 o la opcion 1
                System.out.print("\nDigite el ángulo A: "); //Se le pide al usuario que digite el primer angulo
                angA = objEntrada.nextDouble(); //Se almacena el valor digitado anteriormente en una variable
                System.out.print("Digite el ángulo B: "); //Se le pide al usuario que digite el segundo angulo
                angB = objEntrada.nextDouble(); //Se almacena el valor digitado anteriormente en una variable
                angC = 180 - (angA + angB); //Se almacena la operacion en la variable, esta operacion busca el tercer angulo del triangulo
                sumaAng = angA + angB + angC; //Se realiza la suma de todos los lados del triangulo para saber que tipo de triangulo es
                if (sumaAng == 180 && angC > 0) { //Se realiza una condicional, si el angA es igual a 90 y el angC es mayor a 0, si se cumple entraria en la condicion verdadera
                    if (angA == 90 || angB == 90 || angC == 90) { //Aqui buscamos el tipo de triangulo segun sus angulos, si todos sus angulos son iguales seria un triangulo obtusangulo
                        System.out.println("Es un triángulo: Obtusangulo");
                    } else if (angA < 90 && angB < 90 && angC < 90) { //Si todos los angulos son menores a 90°, estariamos hablando de un triangulo acutangulo
                        System.out.println("Es un triángulo: Acutangulo ");
                    } else { //Si no se cumple la primera y segunda condicion po descarte estariamos hablando de un triangulo isoceles
                        System.out.println("Es un triángulo:  Isoceles ");
                    }
                } else {
                    System.out.println(" Angulos incorrectos"); //Si no se cumple la condicion, se le informa al usurio que los datos son erroneos
                }
                break;
            case 2: //Este es el caso 2 o la opcion 2
                System.out.print("\nDigite el ladoA: "); //Se le solicita al usuario que digite el lado A del triangulo
                ladoA = objEntrada.nextDouble(); //Se almacena el dato en la variable
                System.out.print("Digite el ladoB: "); //Se le solicita al usuario que digite el lado B del triangulo
                ladoB = objEntrada.nextDouble(); //Se almacena el dato en la variable
                System.out.print("Digite el ladoC: "); //Se le solicita al usuario que digite el lado C del triangulo
                ladoC = objEntrada.nextDouble(); //Se almacena el dato en la variable
                if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) { //Se realiza la conicion para saber si es un triangulo, si se cumple entraria a la primera opcion.
                    if (ladoA == ladoB && ladoB == ladoC) { //Se verifica que los lados son iguales
                        System.out.println("Es un triángulo: Equilatero"); //Si son iguales se trata de un triangulo Equilatero
                    } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                        System.out.println("Es un triángulo: Isósceles "); //Si 2 lados son iguales se trata de un triangulo Isósceles
                    } else {
                        System.out.println("Es un triángulo: Escaleno "); //Si no se cumplieron las 2 condiciones anteriores se trata de un triangulo escaleno
                    }
                } else {
                    System.out.println("Lados incorrectos"); //Si no se cumple se le informa al usuario que los datos digitados son erroneos
                }
                break;
            default:
                System.out.println("La opción no existe"); //Esta opcion es por si agrego un numero del swich erroneo
        }
    }
}
