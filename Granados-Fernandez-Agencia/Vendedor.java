/**
 * Clase Vendedor Clase que simula a un vendedor de autos
 * 
 * @author Melissa Fernández
 * @author Jose Pablo Granados
 * @version 1.0
 */
public class Vendedor {

    private boolean buenHumor; // Si el vendedor está de buen humor o no
    private boolean trabajador; // Si el vendedor es trabajador o no
    private int noVendedor;// El número de vendedor
    private String nombre; // El nombre del vendedor

    /**
     * Método constructor sin parámetros
     */
    public Vendedor() {
        buenHumor = true;
        trabajador = true;
        nombre = "Humberto";

    }

    /**
     * Metodo constructor que recibe el nombre del vendedor
     * 
     * @param nombre El nombre del vendedor
     */
    public Vendedor(String nombre) {
        buenHumor = true;
        trabajador = true;
        this.nombre = nombre;

    }

    /**
     * Método getBuenHumor Método que nos deja saber si el vendedor está de buen
     * humor o no
     * 
     * @return buenHumor Si el vendedor está de buen humor o no
     */
    public boolean getBuenHumor() {
        return buenHumor;
    }

    /**
     * Metodo getNoVendedor nos deja saber el número de vendedor
     * 
     * @return noVendedor El numero de vendedor
     */
    public int getNoVendedor() {
        return noVendedor;
    }

    /**
     * Método setBuenHumor método que permite cambiar el humor del vendedor
     * 
     * @param buenHumor
     */
    public void setBuenHumor(boolean buenHumor) {
        this.buenHumor = buenHumor;
    }

    /**
     * Metodo setNoVendedor Asigna un numero de vendedor
     * 
     * @param noVendedor El numero de vendedor
     */
    public void setNoVendedor(int noVendedor) {
        this.noVendedor = noVendedor;
    }

    /**
     * Método presentarse hace que el vendedor se presente
     * 
     * @return La presentación del vendedor
     */
    public String presentarse() {
        return "Hola, buen día, mi nombre es " + nombre + " y estoy aquí para ayudarl@ a elegir su auto. ";
    }
}