import java.util.Scanner;
public class Menu{
    public static void main(String[] args){
	
      	Scanner sc = new Scanner(System.in);	

	System.out.println("Bienvenido a AGENCIA MORE");

	int opcion;
	boolean salida = false;
	
	    System.out.println("1. Autos mas vendidos");
	    System.out.println("2. Autos disponibles");
	    System.out.println("3. Promociones");
	    System.out.println("4. Vendedores");
	    System.out.println("5. Clientes");
      	    System.out.println("6. Salir");
	    System.out.print("Introducir el numero de la accion que desea realizar: ");
	    opcion = sc.nextInt();

	    switch (opcion){
	    case 1:
		    System.out.println("Selecciono la opcion 1. AUTOS MÁS VENDIDOS");
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

	            Auto auto1 = new Auto("Azul", "Chevrolet", 2017, 6, "estandar", "hibrido", 4, 14735379, 204900, 2456, "7%")
		    System.out.println("Color: " + auto1.getColor());
		    System.out.println("Marca: " + auto1.getMarca());
		    System.out.println("Año de fabricación : " + auto1.getFabricacion());
		    System.out.println("Numero de pasajeros: " + auto1.getPasajeros());
		    System.out.println("Tipo de auto: " + auto1.getTipodeauto());
		    System.out.println("Tipo de energia: " + auto1.getTipodeenergia());
		    System.out.println("Numero de puertas: " + auto1.getPuertas());
		    System.out.println("Modelo: " + auto1.getModelo());
		    System.out.println("Precio: " + auto1.getPrecio());
		    System.out.println("Matricula: " + auto1.getMatricula());
		    System.out.println("Descuentos: " + auto1.getDescuento());

		    Auto auto4 = new Auto("Plateado", "Hyundai", 2020, 6, "estandar", "electrico", 4, 63892908, 303000, 8965, "10%")
		    System.out.println("Color: " + auto1.getColor());
		    System.out.println("Marca: " + auto1.getMarca());
		    System.out.println("Año de fabricación : " + auto1.getFabricacion());
		    System.out.println("Numero de pasajeros: " + auto1.getPasajeros());
		    System.out.println("Tipo de auto: " + auto1.getTipodeauto());
		    System.out.println("Tipo de energia: " + auto1.getTipodeenergia());
		    System.out.println("Numero de puertas: " + auto1.getPuertas());
		    System.out.println("Modelo: " + auto1.getModelo());
		    System.out.println("Precio: " + auto1.getPrecio());
		    System.out.println("Matricula: " + auto1.getMatricula());
		    System.out.println("Descuentos: " + auto1.getDescuento());
		    break;    
		   
	    case 2:
		    System.out.println("Selecciono la opcion 2. AUTOS DISPONIBLES");

		    // Autos.

		    Auto auto1 = new Auto("Azul", "Chevrolet", 2017, 6, "estandar", "hibrido", 4, 14735379, 204900, 2456, "7%")
		    System.out.println("Color: " + auto1.getColor());
		    System.out.println("Marca: " + auto1.getMarca());
		    System.out.println("Año de fabricación : " + auto1.getFabricacion());
		    System.out.println("Numero de pasajeros: " + auto1.getPasajeros());
		    System.out.println("Tipo de auto: " + auto1.getTipodeauto());
		    System.out.println("Tipo de energia: " + auto1.getTipodeenergia());
		    System.out.println("Numero de puertas: " + auto1.getPuertas());
		    System.out.println("Modelo: " + auto1.getModelo());
		    System.out.println("Precio: " + auto1.getPrecio());
		    System.out.println("Matricula: " + auto1.getMatricula());
		    System.out.println("Descuentos: " + auto1.getDescuento());

		    Auto auto2 = new Auto("Negro", "Renault", 2020, 4, "automatico", "hibrido", 2, 67536487, 194900, 5490, "No aplica")
		    System.out.println("Color: " + auto2.getColor());
		    System.out.println("Marca: " + auto2.getMarca());
		    System.out.println("Año de fabricación : " + auto2.getFabricacion());
		    System.out.println("Numero de pasajeros: " + auto2.getPasajeros());
		    System.out.println("Tipo de auto: " + auto2.getTipodeauto());
		    System.out.println("Tipo de energia: " + auto2.getTipodeenergia());
		    System.out.println("Numero de puertas: " + auto2.getPuertas());
		    System.out.println("Modelo: " + auto2.getModelo());
		    System.out.println("Precio: " + auto2.getPrecio());
		    System.out.println("Matricula: " + auto2.getMatricula());
		    System.out.println("Descuentos: " + auto2.getDescuento());

		    Auto auto3 = new Auto("Azul", "Honda", 2019, 5, "estandar", "electrico", 4, 78537954, 170000, 8976, "15%")
		    System.out.println("Color: " + auto3.getColor());
		    System.out.println("Marca: " + auto3.getMarca());
		    System.out.println("Año de fabricación : " + auto3.getFabricacion());
		    System.out.println("Numero de pasajeros: " + auto3.getPasajeros());
		    System.out.println("Tipo de auto: " + auto3.getTipodeauto());
		    System.out.println("Tipo de energia: " + auto3.getTipodeenergia());
		    System.out.println("Numero de puertas: " + auto3.getPuertas());
		    System.out.println("Modelo: " + auto3.getModelo());
		    System.out.println("Precio: " + auto3.getPrecio());
		    System.out.println("Matricula: " + auto3.getMatricula());
		    System.out.println("Descuentos: " + auto3.getDescuento());

		    Auto auto4 = new Auto("Plateado", "Hyundai", 2020, 6, "estandar", "electrico", 4, 63892908, 303000, 8965, "10%")
		    System.out.println("Color: " + auto1.getColor());
		    System.out.println("Marca: " + auto1.getMarca());
		    System.out.println("Año de fabricación : " + auto1.getFabricacion());
		    System.out.println("Numero de pasajeros: " + auto1.getPasajeros());
		    System.out.println("Tipo de auto: " + auto1.getTipodeauto());
		    System.out.println("Tipo de energia: " + auto1.getTipodeenergia());
		    System.out.println("Numero de puertas: " + auto1.getPuertas());
		    System.out.println("Modelo: " + auto1.getModelo());
		    System.out.println("Precio: " + auto1.getPrecio());
		    System.out.println("Matricula: " + auto1.getMatricula());
		    System.out.println("Descuentos: " + auto1.getDescuento());

		    
			
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
