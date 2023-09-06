import java.util.Scanner;

public class api2 {
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
