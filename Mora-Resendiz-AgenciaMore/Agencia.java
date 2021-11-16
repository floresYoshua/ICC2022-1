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
		    System.out.println("Selecciono la opcion 2. AUTOS DISPONIBLES");
		    	Auto auto5 = new Auto("Rojo", "Volkswagen", 2019, 4, "automatico", "electico", 4, 12345687, 389000, 5468, "10%")
	    System.out.println("Color: " + auto5.getColor());
	    System.out.println("Marca: " + auto5.getMarca());
	    System.out.println("Año de fabricación: " + auto5.getFabricación());
	    System.out.println("Número de pasajeros: " + auto5.getPasajeros());
	    System.out.println("Tipo de auto: " + auto5.getTipodeauto());
	    System.out.println("Tipo de energia: " + auto8.getTipodeenergia());
	    System.out.println("Número de puertas: " + auto5.getPuertas());
	    System.out.println("Modelo: " + auto5.getModelo());
	    System.out.println("Precio: " + auto5.getPrecio());
	    System.out.println("Matricula: " + auto5.getMatricula());
	    System.out.println("Descuento: " + auto5.getDescuento());

	    Auto auto6 = new Auto("Blanco", "Nissan", 2020, 4, "estandar", "electrico", 4, 45612387, 526000, 1478, "No aplica")
	    System.out.println("Color: " + auto6.getColor());
	    System.out.println("Marca: " + auto6.getMarca());
	    System.out.println("Año de fabricación: " + auto6.getFabricación());
	    System.out.println("Número de pasajeros: " + auto6.getPasajeros());
	    System.out.println("Tipo de auto: " + auto6.getTipodeauto());
	    System.out.println("Tipo de energia: " + auto8.getTipodeenergia());
	    System.out.println("Número de puertas: " + auto6.getPuertas());
	    System.out.println("Modelo: " + auto6.getModelo());
	    System.out.println("Precio: " + auto6.getPrecio());
	    System.out.println("Matricula: " + auto6.getMatricula());
	    System.out.println("Descuento: " + auto6.getDescuento());

	    Auto auto7 = new Auto("Negro", "Mercedes-benz", 2022, 2, "estandar", "hibrido", 2, 45685387, 1530000, 0258, "No aplica")
	    System.out.println("Color: " + auto7.getColor());
	    System.out.println("Marca: " + auto7.getMarca());
	    System.out.println("Año de fabricación: " + auto7.getFabricación());
	    System.out.println("Número de pasajeros: " + auto7.getPasajeros());
	    System.out.println("Tipo de auto: " + auto7.getTipodeauto());
	    System.out.println("Tipo de energia: " + auto8.getTipodeenergia());
	    System.out.println("Número de puertas: " + auto7.getPuertas());
	    System.out.println("Modelo: " + auto7.getModelo());
	    System.out.println("Precio: " + auto7.getPrecio());
	    System.out.println("Matricula: " + auto7.getMatricula());
	    System.out.println("Descuento: " + auto7.getDescuento());

	    Auto auto8 = new Auto("Plateado", "Ford", 2018, 4, "automatico", "electrico", 4, 36914752, 210000, 4562, "15%")
	    System.out.println("Color: " + auto8.getColor());
	    System.out.println("Marca: " + auto8.getMarca());
	    System.out.println("Año de fabricación: " + auto8.getFabricación());
	    System.out.println("Número de pasajeros: " + auto8.getPasajeros());
	    System.out.println("Tipo de auto: " + auto8.getTipodeauto());
	    System.out.println("Tipo de energia: " + auto8.getTipodeenergia());
	    System.out.println("Número de puertas: " + auto8.getPuertas());
	    System.out.println("Modelo: " + auto8.getModelo());
	    System.out.println("Precio: " + auto8.getPrecio());
	    System.out.println("Matricula: " + auto8.getMatricula());
	    System.out.println("Descuento: " + auto8.getDescuento());

		    break;

      	    case 3:
		    System.out.println("Selecciono la opcion 3. SEMINUEVOS");
		    break;

	    case 4:
		    System.out.println("Selecciono la opcion 4. PROMOCIONES");
		    break;

	    case 5:
		    System.out.println("Selecciono la opcion 5. VENDEDORES");
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

	//Cliente 3 ocupando constructor 3 de la clase Comprador       
	Comprador cliente3 = new Comprador("Alejandro Herrera", 87654321, "efectivo", 0);
	System.out.println("\nNombre: " + cliente3.getNombre());
	System.out.println("Clave del auto que adquirio: " + cliente3.getAutoCompra());
	System.out.println("Tipo de pago: " + cliente3.getTipoPago());
	System.out.println("Numero de autos que ha adquirido: " + cliente3.getHistorial());

	//Cliente 4 ocupando constructor 2 de la clase Comprador
	Comprador cliente4 = new Comprador("Gustavo Gutierrez", "julio de 2010", 2021, 2);
	System.out.println("\nNombre: " + cliente4.getNombre());
	System.out.println("Fecha de la ultima compra: " + cliente4.getUltCompra());
	System.out.println("Año actual: " + cliente4.getAñoCompra());
	System.out.println("Numero de autos que ha adquirido: " + cliente4.getHistorial());

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
