/**
 * Clase Agencia clase que simula una agencia de autos
 * 
 * @author Melissa Fernández
 * @author Jose Pablo Granados
 * @version 1.0
 */
public class Agencia {

    public static void main(String[] args) {

        String nombre = "El koala"; // El nombre de la agencia
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor("Josue");
        Vendedor vendedor3 = new Vendedor("Mario");
        Auto auto1 = new Auto(nombre, "KSJ", "mediano", "blanco");
        Auto auto2 = new Auto(nombre, "JHS", "deportivo", "negro");
        Auto auto3 = new Auto(nombre, "JJK", "de lujo", "lila");
        Auto auto4 = new Auto(nombre, "KNJ", "mediano", "azul");
        Auto auto5 = new Auto(nombre, "KTH", "mediano", "rojo");

    }
}