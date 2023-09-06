/*
 * final: Puede usarse en variables, métodos y argumentos.
 * Cualquier valor declarado con final no puede modificarse después de haber sido asignado.
*/

public class operators {
    public static void main(String args[]){
        int cm = 35;
        float inches = 2.54f;
        double resultado = cm * inches;
        final String resultadoFormatted = String.format("%.2f", resultado);
        System.out.println(cm + " centimetros son iguales a " + resultadoFormatted + " pulgadas.");

        double raiz = Math.sqrt(resultado);
        final String raizFormatted = String.format("%.2f", raiz);
        System.out.println("La raiz cuadrada de " + cm + " es: " + raizFormatted);

        double base = 5.652;
        double exponente = 3.154;
        double powed = Math.pow(base, exponente);
        final String powedFormatted = String.format("%.2f", powed);
        System.out.println(base + " a la " + exponente + " es igual a: " + powedFormatted);

    }
}
