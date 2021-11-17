/**
 *@author Juarez Martinez && Flores Santillan
 *@version 1.0
 */
public class Vendedor{
    private String name;
    private double numFactura;
    private double costoAuto;
    /**
     *Constructor sin parametros para crear la clase Vendedor
     */    
    public Vendedor(String nombre, double numero, double costo){
	this.name = nombre;
	this.numFactura = numero;
	this.costoAuto = costo;
	
    }
    /**
     *Metodo setNumFactura para 
     */
    public void setNumFactura(double random){
	this.numFactura = random;
    }
    /**
     *Metodo setName para darle un nombre al Vendedor
     */
    public void setName(String name){
	this.name = name;
    }
    public void setCosto(double costo){
	this.costoAuto = costo;
    }
    /**
     *Metodo getNumFactura
     */
    public double getNumFactura(){
	return this.numFactura;	
    }
    /**
     *Metodo getName
     */    
    public String getName(){
	return this.name;
    }
    public double getCostoAuto(){
	return this.costoAuto;
    }
    /**
     *Metodo toString para dar una representacion en cadena del objeto
     */
    public String toString(){
	return "Empleado:\n " + name;
    }





    

}
