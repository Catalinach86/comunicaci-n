import java.util.Scanner; //Esto es un paquete llamado Util.Scanner, el cual se usa para capturar datos ingresados manualmente, se puede capturar cualquier tipo de dato.

public class TipoTriangulo { //Esto es una clase publica llamada TipoTriangulo
    public void metPrincipalTipoTriangulo() { //Esto es un metodo público que retorna un valor vacio que se llama metPrincipalTipoTriangulo
        Scanner objEntrada = new Scanner(System.in); //Se llama a la libreria Scanner, se agrega un nombe y se 
        double angA = 0,
                angB = 0,
                angC = 0,
                ladoA = 0,
                ladoB = 0,
                ladoC = 0,
                sumaAng = 0;
        int menu = 0;
        System.out.println("\n Diseñe un programa que ________ .\n");
        System.out.println("---- MENÚ TRIÁNGULO");
        System.out.println("1. Ángulos");
        System.out.println("2. Lados");
        System.out.print("Digite una opción del menú: ");
        menu = objEntrada.nextInt();
        switch (menu) {
            case 1:
                System.out.print("\nDigite el ángulo A: ");
                angA = objEntrada.nextDouble();
                System.out.print("Digite el ángulo B: ");
                angB = objEntrada.nextDouble();
                angC = 180 - (angA + angB);
                sumaAng = angA + angB + angC;
                if (sumaAng == 180 && angC > 0) {
                    if (angA == 90 || angB == 90 || angC == 90) {
                        System.out.println("Es un triángulo: _________ ");
                    } else if (angA < 90 && angB < 90 && angC < 90) {
                        System.out.println("Es un triángulo: _________ ");
                    } else {
                        System.out.println("Es un triángulo:  _________ ");
                    }
                } else {
                    System.out.println(" _________ ");
                }
                break;
            case 2:
                System.out.print("\nDigite el ladoA: ");
                ladoA = objEntrada.nextDouble();
                System.out.print("Digite el ladoB: ");
                ladoB = objEntrada.nextDouble();
                System.out.print("Digite el ladoC: ");
                ladoC = objEntrada.nextDouble();
                if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
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
