package Constantes;

public class usoStatic {
    public static void main(String[] args) {
        Employees trabajador1 = new Employees("Paco");
        Employees trabajador2 = new Employees("Ana");
        Employees trabajador3 = new Employees("Antonio");


        trabajador1.setSection("RRHH");

        System.out.println(trabajador1.getData());
        System.out.println(trabajador2.getData());
        System.out.println(trabajador3.getData());

    }

    static class Employees{
        private String section;
        private final String name;
        private int id;
        private static int nextId = 1;

        public Employees(String name){
            this.name = name;
            section = "Administracion";
            id = nextId;
            nextId++;
        }

        public void setSection(String section){ this.section = section; }
        public String getData(){ return "El nombre es " + name + ", la seccion es " + section + " y el id es " + id + "."; }
    }
}
