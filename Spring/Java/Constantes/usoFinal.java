package Constantes;

public class usoFinal {
    public static void main(String[] args) {
        Employees trabajador1 = new Employees("Paco");
        Employees trabajador2 = new Employees("Ana");

        trabajador1.setSection("RRHH");

        System.out.println(trabajador1.getData());
        System.out.println(trabajador2.getData());
    }

    static class Employees{
        private String section;
        private final String name;

        public Employees(String name){
            this.name = name;
            section = "Administracion";
        }

        public void setSection(String section){ this.section = section; }
        public String getData(){ return "El nombre es: " + name + " y la seccion es: " + section; }
    }
}
