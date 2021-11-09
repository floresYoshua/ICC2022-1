/**
 * Clase Agencia clase que simula una agencia de autos
 * 
 * @author Melissa Fernández
 * @version 1.0
 */
public class Agencia {

    public static void main(String[] args) {

        String nombre; // El nombre de la agencia
        boolean autosNuevos;// Si la agencia vende autos nuevos o seminuevos
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor("Josue");
        Vendedor vendedor3 = new Vendedor("Mario");
        Auto auto1 = new Auto("El koala", "KSJ", "mediano", "blanco");
        Auto auto2 = new Auto("El koala", "JHS", "deportivo", "negro");
        Auto auto3 = new Auto("El koala", "JJK", "de lujo", "lila");
        Auto auto4 = new Auto("El koala", "KNJ", "mediano", "azul");
        Auto auto5 = new Auto("El koala", "KTH", "mediano", "rojo");

    }
}