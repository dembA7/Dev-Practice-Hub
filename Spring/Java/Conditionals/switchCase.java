import java.util.*;

public class switchCase {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                // int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del lado: "));
                System.out.println("Introduzca el valor del lado: ");
                int lado = scanner.nextInt();
                System.out.println("El area del cuadrado es: " + Math.pow(lado, lado));
                break;

            case 2:
                System.out.println("Introduzca el valor de la base: ");
                int base = scanner.nextInt();
                System.out.println("Introduzca el valor de la altura: ");
                int altura = scanner.nextInt();
                System.out.println("El area del rectangulo es: " + (base * altura));
                break;
            
            case 3:
                System.out.println("Introduzca el valor de la base: ");
                int baseT = scanner.nextInt();
                System.out.println("Introduzca el valor de la altura: ");
                int alturaT = scanner.nextInt();
                System.out.println("El area del rectangulo es: " + (baseT * alturaT) / 2);
                break;

            case 4:
                System.out.println("Introduzca el valor del radio: ");
                int radio = scanner.nextInt();
                double areaCirculo = (Math.PI * Math.pow(radio, 2));
                System.out.println("El area del circulo es: " + areaCirculo);
                break;

            default:
                System.out.println("Elige un valor entre 1 y 4.");
        }


        scanner.close();
    }
}
