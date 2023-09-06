/*
 * La clase Scanner se utiliza para obtener entrada de datos por parte del usuario
 * a través de la consola. Esta clase cuenta con 3 métodos principales:
 * - nextLine(): Sirve para introducir texto
 * - nextInt(): Sirve para introducir numeros enteros
 * - nextDouble: Sirve para introducir numeros decimales.
 * 
 * Se debe declarar una variable usando la clase Scanner -> Scanner scannerVariable = new Scanner(System.in);
 * Así podemos usar esta variable para introducir información desde la consola hasta una variable.
 * -> String name = scanner.nextLine(); 
 * -> int edad = scanner.nextInt();
*/

import java.util.*;

public class api {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String name = scanner.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + name + ", tienes " + edad + " anios.");

        scanner.close();

    }
}