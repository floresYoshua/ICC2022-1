**
* Clase que define los atributos y métodos de un Auto de la Agencia Trash.
* @author : Dhamar Cabrera.
* @author : Elizabeth Hernandez.
* @version : 1.0
*/

public class Auto {
  // Atributos del Auto.
  private String marca; //cuál es su marca
  private String modelo; //qué modelo es
  private String tipo; //sedan, rurral, familiar, casa rodante, etc...
  private String color; //cuál es su color
  private int n_llantas; //cuántas llantas tiene
  private int n_puertas; //cuántas puertas tiene
  private double precio; //qué precio tiene
  
    /**
     * Constructor por omisión
     * @return : marca
     * @return : modelo
     * @return : tipo
     * @return :color
     * @return : n_llantas
     * @return : n_puertas
     * @return : precio
     */

    public Auto (){
	this.marca = "Nissan";
	this.modelo = "Versa";
	this.tipo = "Sedan";
	this.color = "Rojo";
	this.n_llantas = 4;
	this.n_puertas = 4;
	this.precio = 276.900;
    }
  
    /**
     * Constructor con parámetros
     * @param : marca
     * @param : modelo
     * @param : tipo
     * @param :color
     * @param : n_llantas
     * @param : n_puertas
     * @param : precio
     */
    public Auto ( String marca, String modelo, String tipo, String color, int n_llantas, int n_puertas, double precio){
	this.marca = marca;
	this.modelo = modelo;
	this.tipo = tipo;
	this.color = color;
	this.n_llantas = n_llantas;
	this.n_puertas = n_puertas;
	this.precio = precio;
    }

    /**
     * Acceso a características del auto.
     * @return : marca
     * @return : modelo
     * @return : tipo
     * @return :color
     * @return : n_llantas
     * @return : n_puertas
     * @return : precio
     */
    public String getMarca ( String marca ){
	return this.marca = marca;
    }

    public String getModelo ( String modelo ){
	return this.modelo = modelo;
    }

    public String getTipo ( String tipo ){
	return this.tipo = tipo;
    }
        public String getColor ( String color ){
	return this.color = color;
    }
    
    public int getLlantas ( int n_llantas ){
	return this.n_llantas = n_llantas;
    }

    public int getPuertas ( int n_puertas ){
	return this.n_puertas = n_puertas;
    }
    public double getPrecio ( double precio){
	return this.precio = precio;
    }
}
