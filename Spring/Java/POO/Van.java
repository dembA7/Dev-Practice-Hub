/*
 * Herencia de clases:
 * public class ClaseHija extends ClasePadre {}
*/

package POO;

public class Van extends Car {
    private int capacidadCarga, plazasExtra;

    public Van(int capacidadCarga, int plazasExtra){
        super(); // Llama al constructor de la clase padre.
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    public int getCapacidadCarga(){ return capacidadCarga; }
    public void setCapacidadCarga(int capacidadCarga){ this.capacidadCarga = capacidadCarga; }

    public int getPlazasExtra(){ return plazasExtra; }
    public void setPlazasExtra(int plazasExtra){ this.plazasExtra = plazasExtra; }
}