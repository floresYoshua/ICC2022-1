public class Comprador{

    private String nombre;
    private String apellido;
    private int numCuenta;
    private double dinero;
    private String estadoAnimo;


     public String getEstadoAnimo(){
	return this.estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo){
	this.estadoAnimo= estadoAnimo;
    }

    public String getNombre(){
	return this.nombre;
    }

    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    
    public String getApellido(){
	return this.apellido;
    }

      public void setApellido(String apellido){
	this.apellido = apellido;
    }

    public int getNumCuenta(){
	return this.numCuenta;
    }
    
  public void setNumCuenta(int numCuenta){
	this.numCuenta = numCuenta;
    }
    
    public double getDinero(){
	return this.dinero;
    }
  public void setNombre(double dinero){
	this.dinero = dinero;
    }

    public Comprador (){
  
     nombre= "Usuario";
     apellido= "Uno";
     numCuenta = 000;
     dinero= 0.00;
     estadoAnimo = "Feliz";
    }

    public Comprador (String nombre, String apellido, int numCuenta, double dinero, String estadoAnimo){
  
     this.nombre = nombre;
     this.apellido = apellido;
     this.numCuenta = numCuenta;
     this.dinero = dinero;
     this.estadoAnimo = estadoAnimo;
    }

    public String toString(){
	return "Nombre: " + this.nombre + "\n Apellido: " + this.apellido + "\n Número de Cuenta: " + this.numCuenta + "\n Dinero en cuenta: " + this.dinero +  "Y se ve que usted está " + this.estadoAnimo; 
    }


    public String Comprar(double x){
        String estadoaAnimo = "Feliz";
	if(x <= this.dinero){
	    this.dinero-= x;
            setEstadoAnimo(estadoAnimo);
	    return "Gracias por su compra, ahora el dinero en su cuenta es de " + this.dinero + "pesos"; 
	} else {

	    estadoAnimo = "Triste";
	    setEstadoAnimo(estadoAnimo);
	 	return "No cuenta con el dinero disponible para realizar esa compra, su saldo es de" + this.dinero + "pesos";  
   
	}

    }


    public String Rentar(int tiempo, double precio){
        String estadoaAnimo = "Feliz";
	double total;
	total = (precio*tiempo);
	if(total <= this.dinero){
	    this.dinero-= total;
            setEstadoAnimo(estadoAnimo);
	    return "Gracias por su compra, ahora el dinero en su cuenta es de " + this.dinero + "pesos"; 
	} else {

	    estadoAnimo = "Enojado";
	    setEstadoAnimo(estadoAnimo);
	 	return "No cuenta con el dinero disponible para realizar esa renta, pues su saldo es de" + this.dinero + "pesos" + "\n Puede intentar rentar otro auto o cambiar el tiempo de renta";  
   
	}

    }


    
    public String Feliz(){

	return "Muchas gracias, que tenga excelente día";

    }

     public String Triste(){

	return "Rayos, supongo que aún no podré comprar ese auto, bueno, gracias";

    }

     public String Enojado(){

	return "Pero qué tontería, esto debe ser un error, no vuelvo a este lugar";

    }
}
