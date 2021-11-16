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
		    System.out.println("HISTORIAL DE CLIENTES");
	//Cliente 1 ocupando constructor 1 de la clase Comprador
	Comprador cliente1 = new Comprador("Mildred Calvillo", 38523564, 2021, "noviembre del 2005", "efectivo", 1);
	System.out.println("Nombre: " + cliente1.getNombre());
	System.out.println("Clave del auto que adquirio: " + cliente1.getAutoCompra());
	System.out.println("Año actual: " + cliente1.getAñoCompra());
	System.out.println("Fecha de la ultima compra: " + cliente1.getUltCompra());
	System.out.println("Tipo de pago: " + cliente1.getTipoPago());
	System.out.println("Numero de autos que ha adquirido: " + cliente1.getHistorial());

	//Cliente 2 ocupando constructor 1 de la clase Comprador	
	Comprador cliente2 = new Comprador("Alexia Ramirez", 12345678, 2021, "enero del 2008", "tarjeta de debito", 2);
	System.out.println("\nNombre: " + cliente2.getNombre());
	System.out.println("Clave del auto que adquirio: " + cliente2.getAutoCompra());
	System.out.println("Año actual: " + cliente1.getAñoCompra());
	System.out.println("Fecha de la ultima compra: " + cliente2.getUltCompra());
	System.out.println("Tipo de pago: " + cliente2.getTipoPago());
	System.out.println("Numero de autos que ha adquirido: " + cliente2.getHistorial());

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
