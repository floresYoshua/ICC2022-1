/**
 *@author Juarez Martinez && Flores Santillan
 *@version 1.0
 */
public class Cliente{
    private String name_cliente;
    private String direccion_cliente;
    private int dineroDisponible;
    private int edad;    
    /**
     *Constructor del Cliente con parametros
     */    
    public Cliente(String nombre, String address, int dinero, int edad_cliente){
	this.name_cliente = nombre;
	this.direccion_cliente = address;
	this.dineroDisponible = dinero;
	this.edad = edad_cliente;	    
    }
    /**
     *Metodo setName para modificar el nombre del cliente
     */    
    public void setNameCliente(String name){
	this.name_cliente = name;
    }
    /**
     *Metodo setDireccionCliente para modificar la direccion del cliente
     */    
    public void setDireccionCliente(String txt){
	this.direccion_cliente = txt;
    }
    /**
     *Metodo setDineroDisponible para modificar el dinero disponible del cliente
     */    
    public void setDineroDisponible(int masdinero){
	this.dineroDisponible = masdinero;
    }
    /**
     *Metodo getDireccionCliente para obtener la direccion del cliente
     */        
    public String getDireccionCliente(){
	return direccion_cliente;
    }
    /**
     *Metodo getName para obtener el nombre del cliente
     */        
    public String getNameCliente(){
	return this.name_cliente;
    }
    /**
     *Metodo getDineroDisponible para conocer la cantidad de dinero del cliente
     */        
    public int getDineroDisponible(){
	return this.dineroDisponible;
    }
    /**
     *Metodo toString para representar al objeto
     */    
    public String toString(){
	return "Soy " + name_cliente;
    }    	    
}
