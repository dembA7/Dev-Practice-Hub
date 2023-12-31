/*
 * String: "ejemplo de un string"; (String debe ir en MAYUS)
 * length(): Devuelve la longitud de un string
 * charAt(n): Devuelve la posición de un caracter dentro de un string.
 * substring(x, n): Devuelve una subcadena dentro de la cadena, siendo x el 
 *                  caracter por el que empieza y n el numero de caracteres a extraer.
 * equals(cadenaEjemplo): Devuelve true si las dos cadenas comparadas son iguales.
 * equalsIgnoreCase(cadenaEjemplo): Lo mismo que arriba pero sin contar mayus.
*/

public class string {
    public static void main(String args[]){
        String name = "Arturito";
        System.out.println("Mi nombre es " + name);

        String name2 = "Alejandrito";
        if (!name.equals(name2)){
            System.out.println("No se llaman igual!");
        }

        String name3 = "Chuchito Perez";
        String apellido = name3.substring(9, 14);
        System.out.println("Su apellido es: " + apellido);
        int nameLength = name3.length();
        System.out.println("Su nombre completo tiene: " + nameLength + " caracteres.");

    }
}
