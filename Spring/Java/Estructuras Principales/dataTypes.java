/*
 * Enteros:
 * Int: Enteros
 * Short: Enteros (desde -32,768 a 32,767)
 * Long: Enteros (muy largos)
 * Byte: (desde -128 hasta 127)
 *  
 * Flotantes:
 * Float: Hasta 6 a 7 decimales (Llevan una f al final de su declaración)
 * Double Hasta 15 decimales
 * 
 * Char: Representan caracteres
 * 
*/

public class dataTypes {

    public static void main(String args[]){
        int integer = 5;
        short shortInteger = 14512;
        long longInteger = 45925;
        byte byteInteger = 12;

        long sum = integer + shortInteger + longInteger + byteInteger;

        System.out.println("La suma de estos valores es: " + sum);

        float floatNumber = 3.14f;
        double doubleNumber = 3.14159265358979323846;

        double floatSum = floatNumber + doubleNumber;
        String formattedFloatSum = String.format("%.15f", floatSum);

        System.out.println("La suma de estos valores es: " + formattedFloatSum);

    }
}
