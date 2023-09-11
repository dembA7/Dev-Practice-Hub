package MetodosStatic;

public class metodosStatic {
    public static void main(String[] args) {
        Employees trabajador1 = new Employees("Paco");
        Employees trabajador2 = new Employees("Ana");
        Employees trabajador3 = new Employees("Antonio");
        Employees trabajador4 = new Employees("Maria");

        trabajador1.setSection("RRHH");

        System.out.println(trabajador1.getData() + "\n" + trabajador2.getData() + "\n" + trabajador3.getData() + "\n" + trabajador4.getData());
        System.out.println("El siguiente id es: " + Employees.nextId);  // Se accede a la propiedad static nextId a través de la CLASE, no del OBJETO.

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
        public static int getNextId(){ return nextId; }
    }
}
