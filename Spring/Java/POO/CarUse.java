package POO;

public class CarUse {
    public static void main(String[] args) {

        Car Porsche = new Car(); // Instanciacion de la clase Car
        Porsche.caballosFuerza = 550;
        System.out.println("El Porsche tiene " + Porsche.caballosFuerza + " caballos de fuerza.");
        int numeroRuedas = Porsche.getRuedas();
        System.out.println("El Porsche tiene " + numeroRuedas + " ruedas.");

        Car Jeep = new Car();
        Jeep.alto = 210;
        Jeep.setRuedas(6); int nuevasRuedas = Jeep.getRuedas();
        System.out.println("Esta Jeep tiene " + nuevasRuedas + " ruedas y mide " + Jeep.alto + " cm de alto.");
        Jeep.setAsientosCuero(true); boolean jeepAsientos = Jeep.getAsientosCuero();
        if (jeepAsientos){
            System.out.println("La Jeep tiene asientos de cuero.");
        }

        Car Volkswagen = new Car();
        Volkswagen.caballosFuerza = 155;
        Volkswagen.setCalentadorAsientos(false);

        Van Mercedes = new Van(500, 4);
        int capacidadCargaMercedes = Mercedes.getCapacidadCarga();
        int plazasExtraMercedes = Mercedes.getPlazasExtra();
        int numeroRuedasMercedes = Mercedes.getRuedas();
        System.out.println("La van Mercedes tiene " + capacidadCargaMercedes + " kg de capacidad de carga, cuenta con " + plazasExtraMercedes 
        + " plazas extra y tiene " + numeroRuedasMercedes + " ruedas.");


        System.out.println();
    }
}
