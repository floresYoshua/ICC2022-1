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


	Auto ToyotaPrius = new Auto();
	Auto KiaRent2018 = new Auto("Kia", "Forte Sedán", 2018, 4560.50, "Rojo");
	Auto KiaRent2014 = new Auto("Kia", "Rio Sedán", 2014, 3600.80, "Azul");
       	Auto ChevroletRent2021 = new Auto("Chevrolet", "Aveo", 2021, 5600.30, "Arena");
	Auto ChevroletRent2010 = new Auto("Chevrolet", "Cavalier", 2010, 3350.00, "Blanco");
	Auto ChevroletRent1990 = new Auto("Chevrolet", "Camaro", 1990, 6700.27, "Negro");
	//Objetos de la clase Scanner para las respuestas del usuario
	Scanner numeros = new Scanner(System.in);
	Scanner strings = new Scanner(System.in);
	Scanner rentanum = new Scanner(System.in);
	
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
		//Se solicita al usuario que elija la marca del coche que desea rentar
		System.out.println("\n Elija la marca de coche que desea rentar seleccionando el número asociado a este");
		//Para la respuesta del usuario
		int respRenta = rentanum.nextInt();
		respRenta = Math.abs(respRenta); //Tomemos el valor absoluto
		switch(respRenta){

		case 1: System.out.println("\n Actualmente contamos sólo con dos ejemplares disponibles de esta marca para rentar");
		    
		    System.out.println("1.Primer ejemplar \n" + KiaRent2018.toString() + " (Por día de renta) \n");

		     System.out.println("2.Segundo ejemplar \n" + KiaRent2014.toString() + " (Por día de renta)");
		     System.out.println("Elija el ejemplar que desea rentar escribiendo el número asociado a este");
	//Para la respuesta del usuario
		int autoRenta = rentanum.nextInt();
		autoRenta = Math.abs(autoRenta); //Tomemos el valor absoluto
		 double precio;
		 int dias;
		 dias=5;
		if (respRenta==1){
		     precio = KiaRent2018.getPrecio();
		     cliente.Rentar(dias, precio);

		}else if (respRenta==2){
		    precio = KiaRent2014.getPrecio();
		    cliente.Rentar(dias, precio);
		} else{
		    System.out.println("Lo siento, sólo contamos con esos modelos y usted seleccionó un modelo con el que no contamos actualmente");
		}
		System.out.println("Espero haber sido de ayuda, hasta luego");
		break;
		}
               
	    }	
	}else if(respuesta == 2){
	    System.out.println("Estamos para servirle.");
	}else{
	    System.out.println("Escriba 1 o 2");
	}
    }
}
