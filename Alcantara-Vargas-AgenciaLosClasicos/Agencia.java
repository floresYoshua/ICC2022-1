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
		//Mostrar al cliente las opciones de marcas para compra
		System.out.println("\nDe acuerdo " + cliente.getNombre() + " " + cliente.getApellido() + "\nEn esta agencia solamente manejamos 5 marcas de autos para comprar: \n 1. Nissan \n 2. Kia \n 3. Chevrolet \n 4. Toyota \n 5. Volkswagen \nIngrese el numero de la marca deseada:");
		
		//Guarda la opcion en la variable respuesta
		respuesta = numeros.nextInt();
		respuesta = Math.abs(respuesta);
		
		//Solicitar ahora el numero de cuenta y el dinero disponible en ella
		System.out.println("Para poder continuar con el trámite necesito saber su numero de cuenta bancaria (De cuatro digitos): ");
		int cuentaC = numeros.nextInt();
		cliente.setNumCuenta(cuentaC); //Establece el numero de cuenta
		
		//Solicita el dinero disponible en la cuenta
		System.out.println("Ahora necesito saber cuanto dinero tiene: ");
		double dineroC = numeros.nextInt();
		cliente.setDinero(dineroC); //Establece el dinero disponible
		
		//Se abren los casos dependiendo de la marca seleccionada por el usuario
		String marca; //Variable para la marca del auto
		switch(respuesta){
		case 1:
		    marca = "Nissan";
		    System.out.println("De la marca Nissan contamos con los siguientes modelos: ");
		    break;
		case 2:
		    marca = "Kia";
		    System.out.println("De la marca Kia contamos con los siguientes modelos: ");
		    break;
		case 3:
		    marca = "Chevrolet";
		    System.out.println("De la marca Chevrolet contamos con los siguientes modelos: ");
		    break;
		case 4:
		    marca = "Toyota";
		    System.out.println("De la marca Toyota contamos con los siguientes modelos: ");
		    break;
		case 5:
		    marca = "Volkswagen";
		    System.out.println("De la marca Volkswagen contamos con los siguientes modelos: ");
		    break;
		default:
		    System.out.println("Esa no es una opcion");
		}
		break;
	    case 2:     //En caso de querer rentar
		System.out.println("De acuerdo " + cliente.getNombre() + " "  + cliente.getApellido() + "\nEn esta agencia solamente manejamos 3 marcas de autos para rentar: \n 1. Kia \n 2. Toyota \n 3. Chevrolet");
		break;
	    default:
		System.out.println("Esa no es una opción");
	    }	
	}else if(respuesta == 2){
	    System.out.println("Estamos para servirle.");
	}else{
	    System.out.println("Escriba 1 o 2");
	}
    }
}
