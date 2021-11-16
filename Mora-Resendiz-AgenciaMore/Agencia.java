import java.util.Scanner;
public class Menu{
    public static void main(String[] args){
	
      	Scanner sc = new Scanner(System.in);	

	System.out.println("Bienvenido a AGENCIA MORE");

	int opcion;
	boolean salida = false;
	
	    System.out.println("1. Autos mas vendidos");
	    System.out.println("2. Autos disponibles");
	    System.out.println("3. Seminuevos");
	    System.out.println("4. Promociones");
	    System.out.println("5. Vendedores");
	    System.out.println("6. Clientes");
      	    System.out.println("7. Salir");
	    System.out.print("Introducir el numero de la accion que desea realizar: ");
	    opcion = sc.nextInt();

	    switch (opcion){
	    case 1:
		    System.out.println("Selecciono la opcion 1. AUTOS MÁS VENDIDOS");
		    break;    
		   
	    case 2:
		    System.out.println("Selecciono la opcion 2");
		    //		    int opcion1;
		    //switch(opcion1){}
		    break;

      	    case 3:
		    System.out.println("Selecciono la opcion 3");
		    break;

	    case 4:
		    System.out.println("Selecciono la opcion 4");
		    break;

	    case 5:
		    System.out.println("Selecciono la opcion 5");
		    break;

	    case 6:
		    System.out.println("Selecciono la opcion 6. CLIENTES");
		    break;

	    case 7:
		    salida = true;
		    break;
		    //Para que solo este en el rango
	    default:
		System.out.println("Las opciones disponibles son del 1 al 6");
	    }       
    }
}
