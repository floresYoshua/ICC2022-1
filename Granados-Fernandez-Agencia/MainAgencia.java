import java.util.Scanner;

/**
 * Clase MainAgencia Clase que simula una agencia de autos
 * 
 * @author Melissa Fernández
 * @author José Pablo Granados
 * 
 * @version 1.0
 */

public class MainAgencia {

    /**
     * Metodo principal Metodo donde ejecutamos los condicionales y utilizamos las
     * clases Agencia, Auto,
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {

        // Crear un Scanner
        Scanner scan = new Scanner(System.in);
        // Creamos una agencia
        Agencia agencia = new Agencia();
        // Preguntar al usuario a qué agencia ir
        System.out.println("Buenos días ¿A qué agencia quiere ir?");
        String nombreAgencia = scan.nextLine(); // almacenar nombre de agencia
        agencia.setNombre(nombreAgencia); // asignar el nombre a la agencia
        System.out.println("¿Qué quiere comprar?(auto/seguro)");// preguntar al usuario si quiere un auto o seguro
        String comprar = scan.nextLine();// leer la respuesta del usuario
        comprar = comprar.toLowerCase().trim(); // respuesta a minusculas y sin espacios

        // Condicional para ver si el usuario quiere comprar un auto
        if (comprar.equals("auto")) {
            Auto auto = new Auto(); // Creamos el auto
            auto.setMarca(nombreAgencia); // El auto es de la marca de la agencia
            System.out.println("¿Que tipo de auto quiere?(nuevo/seminuevo)");// preguntar si será agencia de autos
                                                                             // seminuevos o nuevos
            String repuestaNuevo = scan.nextLine();// leer la respuesta del usuario
            repuestaNuevo = repuestaNuevo.toLowerCase().trim();// respuesta a minusculas y sin espacios

            // Condicional para ver si el usuario quiere un auto nuevo
            if (repuestaNuevo.equals("nuevo")) {
                agencia.setAutosNuevos(true);// Hacemos que la agencia venda autos nuevos
                auto.setNuevo(true); // Hacemos que el auto sea nuevo
                System.out.println("¿Busca algún modelo en especial?(si/no)"); // preguntar si el usuaro tiene algún
                                                                               // modelo en mente
                String modelo = scan.nextLine();// leer la respuesta del usuario
                modelo = modelo.toLowerCase().trim();// respuesta a minusculas y sin espacios

                // Condicional para ver si el usuario quiere un modelo en especifico
                if (modelo.equals("si")) {
                    System.out.println("¿Qué modelo desea comprar?");// Preguntar al usuario qué modelo quiere
                                                                     // comprar
                    String modeloUsuario = scan.nextLine();// leer la respuesta del usuario
                    auto.setModelo(modeloUsuario);// asignar el modelo deseado al auto

                    // Si el usuario no quiere un modelo en específico
                } else {
                    System.out.println("Se le asignará un vendedor que le muestre los modelos disponibles");

                }

                // Si el usuario quiere un auto seminuevo
            } else {
                agencia.setAutosNuevos(false);// Hacemos que la agencia sea de autos seminuevos
                auto.setNuevo(false);// Hacemos que el auto sea seminuevo

            }

            // Si el usuario quiere comprar un seguro
        } else if (comprar.equals("seguro")) {

            System.out.println();

            // Si el usuario respondió diferente de las palabras auto/seguro
        } else {
            System.out.println("Disculpe, en esta agencia no vendemos lo que usted busca");
        }

    }
}