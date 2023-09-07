/*
 * Este bucle se ejecuta al menos una vez, aunque la condición del while no se cumpla.
*/

import java.util.*;

public class doWhile {
    public static void main(String[] args){

        int random = (int)(Math.random()*1000);
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        System.out.println("Introduce un numero: ");

        do{
            numero = scanner.nextInt();
            intentos++;
            if (random > numero){
                System.out.println("Mas alto!");
            } else if (random < numero){
                System.out.println("Mas bajo!");
            }
        } while(numero != random);

        System.out.println("Correcto! Lo has conseguido en " + intentos + " intentos!");
        scanner.close();

    }
}
