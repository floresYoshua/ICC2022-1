import java.util.Scanner;

/**
 * Clase agencia con el metodo main ejecutable
 *
 * @author Isaac Alcantara y Eduardo Vargas
 * @version 1.0
 **/
public class Agencia{
    /**
     * Metodo principal main, donde se realizar todo el comportamiento de la agencia
     * 
     * @param args Los argumentos
     **/
    public static void main(String[] args){
	//Imprimir el nombre de la agencia y si podemos ayudar en algo
	System.out.println("***AGENCIA LOS CLASICOS***" + "\n"+ "Bienvenido, ¿podemos ayudarle en algo? (ingresar el numero) \n 1. Deseo hablar con un vendedor \n 2. Solamente estoy viendo");

	//Objetos de la clase Scanner para las respuestas del usuario
	Scanner numeros = new Scanner(System.in);
	Scanner strings = new Scanner(System.in);
	
	//Para la respuesta del usuario
	int respuesta = numeros.nextInt();
	respuesta = Math.abs(respuesta); //Tomemos el valor absoluto
	
	//Abrimos casos donde si desea hablar con el vendedor y donde no
	if(respuesta == 1){
	    //Preguntar con cual de los 5 vendedores disponibles quiere hablar (Juan, Isaac, Eduardo, Renata, Maria)
	    System.out.println("Estan disponibles Juan, Isaac, Eduardo, Renata y Maria. \nIngrese el nombre del vendedor por el que quiera ser atendido: ");
	    //Variable String para guardar la respuesta del usuario
	    String vendedor = strings.nextLine();
	    //Creando objeto de la clase vendedor para atender al cliente
	    boolean humor = true;
	    Vendedor v = new Vendedor(vendedor, humor);
	    //El vendedor se presenta y pregunta si quiere comprar o rentar
	    System.out.println("\n" + v.presentarse() + "\n 1. Deseo comprar un auto \n 2. Deseo rentar un auto");
	    //Respuesta del usuario
	    respuesta = numeros.nextInt();
	    respuesta = Math.abs(respuesta);
	    //Variables para el nombre y el apellido del cliente
	    String nombreC;
	    String apellidoC;
	    //Objeto de la clase comprador
	    Comprador cliente = new Comprador();
	    //Preguntar el nombre del cliente
	    System.out.println("Antes de seguir, ¿cual es su nombre?");
	    nombreC = strings.nextLine();
	    System.out.println("¿Y su apellido?");
	    apellidoC = strings.nextLine();
	    //Cambiando el nombre y apellido del cliente
	    cliente.setNombre(nombreC);
	    cliente.setApellido(apellidoC);
	    
	    switch(respuesta){
	    case 1:     //En caso de querer comprar;
		System.out.println("De acuerdo " + cliente.getNombre() + " " + cliente.getApellido() + "\nEn esta agencia solamente manejamos 5 marcas de autos para comprar: \n 1. Nissan \n 2. Kia \n 3. Chevrolet \n 4. Toyota \n 5. Volkswagen");
		break;
	    case 2:     //En caso de querer rentar
		System.out.println("De acuerdo " + cliente.getNombre() + " "  + cliente.getApellido() + "\nEn esta agencia solamente manejamos 3 marcas de autos para rentar: \n 1. Kia \n 2. Toyota \n 3. Chevrolet");
		break;
	    }	
	}else if(respuesta == 2){
	    System.out.println("Estamos para servirle.");
	}else{
	    System.out.println("Escriba 1 o 2");
	}
    }
}
