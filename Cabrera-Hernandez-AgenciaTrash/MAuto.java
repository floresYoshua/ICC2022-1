/**
 * Clase que indica las características de un Auto de la Agencia Trash.
 * @author : Dhamar Cabrera.
 * @author : Elizabeth Hernandez.
 * @version : 1.0
 */

public class MAuto {
    public static void main (String[] args);
    /**
     * Método main
     * @param : args
     */

    /**
     * Ejecutación e impresión del constructor por omisión de la clase @see : Auto
     */
    Auto versa = new Auto ();
    System.out.println("Marca: " + versa.getMarca());
    System.out.println("Modelo: " + versa.getModelo());
    System.out.println("Tipo: " + versa.getTipo());
    System.out.println("Color: " + versa.getColor());
    System.out.println("Llantas: " + versa.getLlantas());
    System.out.println("Puertas: " + versa.getPuertas());
    System.out.println("Precio: " + versa.getPrecio());

    /**
     * Ejecutación e impresión del constructor con parámetros de la clase @see : Auto
     */
    Auto aveo = new Auto (Chevrolet, Aveo, Sedan, Azul, 4, 4, 280300.00);

    
}
/**
 * Fin del programa.
 */

