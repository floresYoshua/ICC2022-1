/**
 * Clase Agencia clase que simula una agencia de autos
 * 
 * @author Melissa Fernández
 * @version 1.0
 */
public class Agencia {

    private String nombre; // El nombre de la agencia
    private boolean autosNuevos;// Si la agencia vende autos nuevos o seminuevos

    /**
     * Metodo constructor sin parámetros
     */
    public Agencia() {
        nombre = "Sin nombre";
        autosNuevos = true;
    }

    /**
     * Metodo getNombre regresa el nombre de la agencia
     * 
     * @return el nombre de la agencia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo getAutosNuevos permite saber si la agencia vende autos nuevos o no
     * 
     * @return si la agencia vende autos nuevos (true) o seminuevos (false)
     */
    public boolean getAutosNuevos() {
        return autosNuevos;
    }

    /**
     * Metodo setNombre asigna el nombre de la agencia
     * 
     * @param nombre El nombre de la agencia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo setAiutosNuevos asigna true si la agencia es de autos nuevos y false
     * si es de seminuevos
     * 
     * @param autosNuevos Si es de autos nuevos o seminuevos
     */
    public void setAutosNuevos(boolean autosNuevos) {
        this.autosNuevos = autosNuevos;
    }
}