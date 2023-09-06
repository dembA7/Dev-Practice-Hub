public class string2 {
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
