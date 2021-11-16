/**
 * Clase Auto
 * Clase que muestra los datos de un Auto
 * @author Brenda Paola Resendiz Mendoza 
 * @author Dulce Julieta Mora Hernandez 
 * @version 1.0
 */

public class Auto{
    //Atributos
    private int puertas;
    private int modelo;
    private int precio;
    private int matricula;
    private String descuento;

     /**
     * Constructor que recibe 5 valores, 4 de tipo int y un String
     * @param puertas Representa el numero de puertas del auto
     * @param modelo Representa el modelo del auto
     * @param precio Representa su precio
     * @param matricula Representa su matricula
     * @param descuento Representa el valor del descuento que tiene
     **/    
    public Comprador(int puertas, int modelo, int precio, int matricula, String descuento){
	this.puertas = puertas;
	this.modelo = modelo;
	this.precio = precio;
	this.matricula = matricula;
	this.descuento = descuento;	
    }

     /**
     *Metodo que devuelve el numero de puertas
     *@return El numero de puertas
     **/
    public int getPuertas(){
    return this.puertas;
    }
    /**
    *Metodo que modifica el numero de puertas
    *@param puertas int
    **/
    public void setNombre(int puertas){
    this.puertas = puertas;
    }

     /**
     *Metodo que devuelve el modelo del auto
     *@return El modelo del auto
     **/    
    public int getModelo(){
    return this.modelo;
    }
    /**
    *Metodo que modifica el modelo del auto
    *@param modelo int
    **/
    public void setModelo(int modelo){
    this.modelo = modelo;
    }

     /**
     *Metodo que devuelve el precio del auto
     *@return El precio del auto
     **/    
    public int getPrecio(){
    return this.precio;
    }
    /**
    *Metodo que modifica el precio del auto
    *@param precio int
    **/
    public void setPrecio(int precio){
    this.precio = precio;
    }

    
     /**
     *Metodo que devuelve la matricula
     *@return La matricula
     **/    
    public int getMatricula(){
    return this.matricula;
    }
    /**
    *Metodo que modifica la matricula
    *@param matricula int
    **/
    public void setMatricula(int matricula){
    this.matricula = matricula;
    }

    
     /**
     *Metodo que devuelve el descuento
     *@return El descuento
     **/    
    public String getDescuento(){
    return this.descuento;
    }
    /**
    *Metodo que modifica el descuento
    *@param descuento String
    **/
    public void setDescuento(String descuento){
    this.descuento = descuento;
    }

    // Atributos
    private String color;
    private String marca;
    private int añodefabricacion;
    private int numerodepasajeros;
    private String tipodeauto;
    private String tipodeenergia;
    

    /**
     * Constructor que recibe 6 valores, 4 string y 2 int 
     *
     * @param color Representa el color del auto
     * @param marca Representa la marca del auto
     * @param tipodeauto Representa el tipo de auto (estandar o automatico)
     * @param tipodeenergia Representa el tipo de energia del auto (hibrido o electrico)
     *
     * @param añodefabricacion Representa el año de fabricacion del auto
     * @param numerodepasajeros Representa el numero de pasajero que puede llevar el auto 
     */

    public Auto(String color, String marca, int añodefabricacion, int numerodepasajeros, String tipodeauto)

    {
	this.color = color;
	this.marca = marca;
	this.añodefabricacion = añodefabricacion;
	this.numerodepasajeros = numerodepasajeros;
	this.tipodeauto = tipodeauto;
	this.tipodeenergia = tipodeenergia
    }

    /**
     * Metodos get y set del atributo color 
     */ 
    public String getColor() {
	return color;
    }

    public void setColor(String color){
	this.color = color;
    }

    /**
     * Metodos get y set del atributo marca 
     */ 

    public String getMarca() {
	return marca;
    }

    public void setMarca(String marca){
	this.marca = marca;
    }

    /**
     * Metodos get y set del atributo año de fabricacion  
     */ 
    
    public int getAñodefabricacion() {
	return añodefabricacion;
    }

    public void setAñodefabricacion(int añodefabricacion){
	this.añodefabricacion = añodefabricacion;
    }

    /**
     * Metodos get y set del atributo numero de pasajeros 
     */ 

    public int getNumerodepasajeros() {
	return numerodepasajeros;
    }

    public void setNumerodepasajeros(int numerodepasajeros){
	this.numerodepasajeros = numerodepasajeros;
    }

    /**
     * Metodos get y set del atributo tipo de auto 
     */ 

    public String getTipodeauto() {
	return tipodeauto;
    }

    public void setTipodeauto(String tipodeauto){
	this.tipodeauto = tipodeauto;
    }

    /**
     * Metodos get y set del atributo tipo de enegia 
     */ 

    public String getTipodeenergia() {
	return tipodeenergia;
    }

    public void setTipodeenergia(String tipodeenergia){
	this.tipodeenergia = tipodeenergia;
    }

}
