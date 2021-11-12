import java.util.Scanner;

public class Agencia{
    public static void main(String[] args)throws InterruptedException{
	Scanner sc = new Scanner(System.in);

	//este Scanner es para pausar los datos en pantalla, ya que si no, la informacion se imprime y se borra en corto
	Scanner p = new Scanner(System.in);
 	int opcion;
	do{
	    //Agregamos codio ANSI para simular limpieza de pantalla
	    System.out.print("\033[H\033[2J");
	    System.out.println("****BIENVENIDO A LA AGENCIA LOS CHICOS QUE LLORAN****" + "\n");
	    System.out.println("¿Que podemos hacer por ti?"+ "\n" + "1. Comprar auto" + "\n" + "2. Quejas sobre algun vendedor" + "\n" + "3. Salir");
	    System.out.print("Elija una opcion: ");

	    opcion = sc.nextInt();
	    System.out.println("---------------------------------------------------------------------------------------");
	    
	    switch(opcion){
		
	    case 1:
		do{
		    System.out.print("\033[H\033[2J");
		    
		    //booleano que mientras sea verdadero se va a manetener en el menu de compra
		    boolean repite = true;
		    
		    System.out.println("**Bienvenido a la compra de autos**");
		    System.out.println("¿Que auto quiere comprar?");
		    System.out.println("1. Chevrolet Aveo 2022 $229,200 (color a elegir)");
		    System.out.println("2. Chevrolet Groove 2022 $332,900 (solo color rojo disponible)");
		    System.out.println("3. Chevrolet Bolt EUV 2020 (precio varia si es electrico o no)");
		    System.out.println("4. Salir al menu principal");
		    System.out.print("Seleccione una opcion: ");
		    opcion = sc.nextInt();
		    System.out.println("------------------------------------------------------");
	 
		    switch(opcion){
		    case 1:
			System.out.print("\033[H\033[2J");
			System.out.println("¿Que color desea?");
			System.out.println("1. Rojo");
			System.out.println("2. Blanco");
			System.out.print("Elija una opcion: ");
			opcion = sc.nextInt();
			System.out.println("---------------------------------------------");
			if(opcion == 1){
			    Auto autoAveo = new Auto("Rojo");
			    System.out.println("Usted ha realizado la compra de:\n" + autoAveo);
			}else if(opcion == 2){
			    Auto autoAveo = new Auto("Blanco");
			    System.out.println("Usted ha realizado la compra de:\n" + autoAveo);
			}else{
			    System.out.println("Ingresa una opcion valida");
			}
			System.out.println("---------------------------------------------");

			System.out.print("Presione enter para continuar...");
			p.nextLine();
			break;
		
		
		case 2:
		    System.out.print("\033[H\033[2J");
		    Auto autoGroove = new Auto();
		    System.out.println("Usted ha realizado la compra de: \n" + autoGroove);
		    System.out.println("---------------------------------------------");

		    
		    System.out.print("Presione enter para continuar...");
		    p.nextLine();
		    break;
		
		case 3:
		    System.out.print("\033[H\033[2J");
		    System.out.println("Elija su clasificacion:");
		    System.out.println("1. Electrico $930,900");
		    System.out.println("2. No electrico $620,000");
		    System.out.print("Elija una opcion: ");
		    opcion = sc.nextInt();
		    System.out.println("---------------------------------------------");
		    if(opcion == 1){
			Auto autoBolt = new Auto(true, "930,900");
			System.out.println("Usted ha realizado la compra de:\n" + autoBolt);
		    }else if(opcion == 2){
			Auto autoBolt = new Auto(false, "620,000");
			System.out.println("Usted ha realizado la compra de:\n" + autoBolt);
		    }else{
			System.out.println("Ingresa una opcion valida");
		    }
		    System.out.println("---------------------------------------------");

		    
		    System.out.print("Presione enter para continuar...");
		    p.nextLine();
		    break;
		
		case 4:
		    System.out.print("\033[H\033[2J");
		    //repite = false, regresa al menu principal
		    repite = false;
		    break;
		}//fin del segundo switch
		    
	    }while(opcion != 4);//fin del segundo do
	    
	    break;

	    
	case 2:
	    System.out.print("\033[H\033[2J");
	    System.out.println("¿Cual es su queja?");
	    System.out.println("1. Queja sobre algun vendedor.");
	    System.out.println("2. Queja sobre servicio.");
	    System.out.println("Elija alguna opcion: ");

	    opcion = sc.nextInt();

	    /*  if(opcion == 1){

		System.out.print("Ingrese el nombre del vendedor: ");
		nombreVendedor = sc.nextLine();

		System.out.println("Ingrese el motivo de queja: ");
		quejaVendedor = sc.nextLine();

		System.out.println("¿Que calificacion le da al vendedor del 1 al 5 (1 muy malo - 5 excelente)");
		calVendedor = sc.nextInt();
		Vendedor vendedor = new Vendedor(nombreVendedor,quejaVendedor,calVendedor);
		System.out.println("Su queja ha sido recibida:\n" + vendedor);
		    }else if(opcion == 2){
		System.out.println("Ingrese su queja: ");

		queja = sc.nextLine();
		System.out.println("Su queja ha sido recibida, gracias");
		
		    }else{
		    System.out.println("Ingresa una opcion valida");}
		    

	    */

	    
	    System.out.print("Teclee cualquier tecla para continuar...");
	    p.nextLine();
	    break;

	case 3:
	    System.out.print("\033[H\033[2J");
	    System.out.println("Gracias por comprar en Los Chicos Que Lloran, buen dia");
	    System.exit(0);
	    break;
	    }

	
	
	    }while(opcion != 3);//fin del do
	
	
    }//fin del metodo main
    
}//fin de la clase Agencia
