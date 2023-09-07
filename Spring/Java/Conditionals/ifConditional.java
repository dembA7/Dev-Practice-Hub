/*
 *  variable = (condición) ? valorSiVerdadero : valorSiFalso;
*/

import java.util.*;

public class ifConditional {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        String mensaje = (edad >= 18) ? "Eres mayor de edad!" : "No eres mayor de edad!";
        System.out.println(mensaje);

        // if (edad >= 18){
        //     System.out.println("Eres mayor de edad!");
        // } else{
        //     System.out.println("No eres mayor de edad!");
        // }

        scanner.close();
    }
}
