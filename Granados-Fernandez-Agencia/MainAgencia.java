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
            Auto auto = new Auto(nombreAgencia); // Creamos el auto y le asignamos la marca de la agencia
            System.out.println("¿Que tipo de auto quiere?(nuevo/seminuevo)");// preguntar si será agencia de autos
                                                                             // seminuevos o nuevos
            String repuestaNuevo = scan.nextLine();// leer la respuesta del usuario
            repuestaNuevo = repuestaNuevo.toLowerCase().trim();// respuesta a minusculas y sin espacios

            // Condicional para ver si el usuario quiere un auto nuevo
            if (repuestaNuevo.equals("nuevo")) {
                agencia.setAutosNuevos(true);// Hacemos que la agencia venda autos nuevos
                auto.setNuevo(true); // Hacemos que el auto sea nuevo

                // Si el usuario quiere un auto seminuevo
            } else {
                agencia.setAutosNuevos(false);// Hacemos que la agencia sea de autos seminuevos
                auto.setNuevo(false);// Hacemos que el auto sea seminuevo
                double precio = auto.getCosto() - 50000;
                auto.setCosto(precio);

            }

            System.out.println("¿Busca algún modelo en especial?(si/no)"); // preguntar si el usuaro tiene algún
                                                                           // modelo en mente
            String modelo = scan.nextLine();// leer la respuesta del usuario
            modelo = modelo.toLowerCase().trim();// respuesta a minusculas y sin espacios

            // Condicional para ver si el usuario quiere un modelo en especifico
            if (modelo.equals("si")) {
                System.out.println("Se le asignará un vendedor que le muestre lo que usted desea\n\n");
                Vendedor vendedor = agencia.getVendedor(); // creamos a un vendedor
                System.out.println(agencia.asignarVendedor());// vendedor se presenta
                String tipoAuto = scan.nextLine();// Leer la respuesta del usuario
                auto.setTipoAuto(tipoAuto);// asignamos el tipo de auto
                tipoAuto = tipoAuto.toLowerCase().trim(); // quitamos espacios y ponemos en minúsculas

                // Condicional para asignar el costo despendiendo del tipo de auto
                if (tipoAuto.equals("delujo")) {
                    double costo = auto.getCosto() * 3;
                    auto.setCosto(costo);
                } else if (tipoAuto.equals("deportivo")) {
                    double costo = auto.getCosto() * 2;
                    auto.setCosto(costo);
                }

                System.out.println(vendedor.preguntarModelo());// vendedor pregunta al cliente el modelo buscado
                String modeloUsuario = scan.nextLine();// leer la respuesta del usuario
                auto.setModelo(modeloUsuario);// asignar el modelo deseado al auto
                System.out.println(vendedor.preguntarColor());// El vendedor pregunta el color de auto que quiere el
                                                              // usuario
                String color = scan.nextLine();// leemos la respuesta del usuario
                color = color.toLowerCase().trim();

                // Condicional que hace que el vendedor niegue un auto de color rojo
                if (color.equals("rojo")) {
                    System.out.println(vendedor.negarColor());// el vendedor niega el color rojo
                    String respuesta = scan.nextLine();// leer la respuesta del cliente
                    respuesta.toLowerCase().trim();

                    // Si el usuario responde que no quiere ningún otro color
                    if (respuesta.equals("ninguno")) {
                        System.out.println(vendedor.pedirRegreso());// el vendedor solicita al cliente que regrese
                                                                    // más tarde

                        // Si el usuario quiere otro color
                    } else {
                        auto.setColor(respuesta);// asignar el color al auto
                    }

                    // Si el color elegido no es rojo
                } else {
                    auto.setColor(color);// asignar el color al auto
                }

                System.out.println(vendedor.todoBien());// El vendedor pregunta si todo va bien hasta el momento
                String respuesta = scan.nextLine();// leer la respuesta delcliente
                respuesta = respuesta.toLowerCase().trim();

                // Condicional que hace que el vendedor esté de buen humor o no
                if (respuesta.equals("no")) {
                    vendedor.setBuenHumor(false);// poner al vendedor de mal humor
                }

                // Condicional que hace que el vendedor de un descuento si está de buen humor
                boolean humor = vendedor.getBuenHumor();
                if (humor) {
                    System.out.println(vendedor.descuento());
                    double precio = auto.getCosto() - 20000;
                    auto.setCosto(precio);

                }
                // Mostrar el auto al cliente
                System.out.println(vendedor.mostrarAuto());
                System.out.println(auto);

                System.out.println(vendedor.acuerdo());// vendedor pregunta si está bien la compra
                respuesta = scan.nextLine();// leer respuesta del cliente
                respuesta = respuesta.toLowerCase().trim();

                if (respuesta.equals("no")) {
                    System.out.println(vendedor.deNuevo());
                } else {
                    System.out.println(vendedor.contrato());
                }

                // Si el usuario no quiere un modelo en específico
            } else {
                System.out.println("Se le asignará un vendedor que le muestre los modelos disponibles\n\n");
                Vendedor vendedor = new Vendedor(); // creamos a un vendedor
                System.out.println(vendedor.presentarse() + "\n" + vendedor.ofrecerTipoAuto()); // el vendedor se
                                                                                                // presenta y
                                                                                                // pregunta el tipo
                                                                                                // de auto deaseado
                String tipoAuto = scan.nextLine();// Leer la respuesta del usuario
                auto.setTipoAuto(tipoAuto);// asignamos el tipo de auto
                tipoAuto = tipoAuto.toLowerCase().trim(); // quitamos espacios y ponemos en minúsculas

                // Condicional para asignar el costo despendiendo del tipo de auto
                if (tipoAuto.equals("delujo")) {
                    double costo = auto.getCosto() * 3;
                    auto.setCosto(costo);
                } else if (tipoAuto.equals("deportivo")) {
                    double costo = auto.getCosto() * 2;
                    auto.setCosto(costo);
                }
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