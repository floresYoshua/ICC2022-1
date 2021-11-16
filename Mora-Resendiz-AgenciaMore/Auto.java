/**
 *Clase Auto
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

}
