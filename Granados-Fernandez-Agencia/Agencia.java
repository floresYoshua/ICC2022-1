import java.util.Scanner;

import java.util.Scanner;

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
        Cliente cliente1 = new Cliente("Alejandro", "Rosas", "Diaz");
        Cliente cliente2 = new Cliente("Mariana", "Casas", "Fuentes");
        Cliente cliente3 = new Cliente("Diana", "Islas", "Santiago");

        vendedor1.setNoVendedor(1234);
        vendedor2.setNoVendedor(1235);
        vendedor3.setNoVendedor(1237);

        // Dar bienvenida y preguntar qué hacer
        System.out.println("Bienvenid@ a la agencia" + nombre);
        System.out.println("¿Qué quieres hacer?(imgresa el numero)");
        System.out.println("1) Comprar auto");
        System.out.println("2) Ver autos");
        System.out.println("3) Salir");
        Scanner scan = new Scanner(System.in);// Hacer Scanner
        int respuesta = scan.nextInt();// Leer la respuesta del usuario

        switch (respuesta) {
        case 1:
            double suma = 1;
        }

    }

}