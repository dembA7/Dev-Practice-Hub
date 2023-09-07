/*
 * Clase: Es un modelo donde se redactan las características comunes de un grupo de objetos.
 * Objeto: Ejemplar perteneciente a una clase. Tiene atributos y métodos.
 * package: Contiene un conjunto de clases ligadas entre sí.
 * Modularización: Consiste en dividir un programa en pequeños módulos o partes.
 * Encapsulacion: Consiste en ocultar detalles internos y el estado de un objeto
*/

package POO;

public class Car {

    // Atributos:
    int largo, ancho, alto, caballosFuerza, peso;
    private boolean asientosCuero, calentadorAsientos;
    private int ruedas; // Encapsulacion de la variable ruedas

    // Constructor:
    public Car(){
        ruedas = 4;
        largo = 350;
        ancho = 195;
        alto = 155;
        caballosFuerza = 200;
        peso = 1000;
        asientosCuero = false;
        calentadorAsientos = false;
    }

    public int getRuedas(){
        return ruedas;
    }
                    // Paso de parametros!
    public void setRuedas(int newRuedas){
        ruedas = newRuedas;
    }

    public boolean getAsientosCuero(){
        return asientosCuero;
    }

    public void setAsientosCuero(boolean newAsientosCuero){
        asientosCuero = newAsientosCuero;
    }

    public boolean getCalentadorAsientos(){
        return calentadorAsientos;
    }

    public void setCalentadorAsientos(boolean newCalentadorAsientos){
        this.calentadorAsientos = newCalentadorAsientos;
    }
}
