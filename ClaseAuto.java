/**
 * Clase de prueba para crear un menú con 
 * los autos 
 *
 * @author Danielo
 * @version 1.0
 * */
public class ClaseAuto{
    // Atributos
    private String tipo; // Tipo de auto (Deportivo, camioneta y así)
    private String color; // Color del auto
    private String modelo; // Modelo del auto

    /**
     *
     * Método constructor sin parámetros
     *
     * */
    public ClaseAuto(String tipo, String color, String modelo){
	this.tipo = tipo;
	this.color = color;
	this.modelo = modelo;
    }

    /**
     * Método constructos con parámetros
     *
     * @param tipo El tipo de auto
     * @param color El color del auto
     * @param modelo El modelo del auto
     * */
    public ClaseAuto(){
	this.tipo = "Deportivo";
	this.color = "Rojo";
	this.modelo = "Ferrari";
    }

    //Métodos set y get

    /**
     * Método que devuelve el tipo de auto
     *
     * @return tipo El tipo de auto
     * */
    public String getTipo(){
	return this.tipo;
    }

    /**
     * Método que devuelve el color del auto
     *
     * @return color El color que tiene el auto
     * */
    public String getColor(){
	return this.color;
    }

    /**
     * Método que devuelve el modelo del auto
     *
     * @return modelo El modelo del auto
     * */
    public String getModelo(){
	return this.modelo;
    }

    /**
     * Método que cambiar el valor del tipo de auto
     *
     * @param tipo El nuevo valor de tipo de auto
     * */
    public void setTipo(String tipo){
	this.tipo = tipo;
    }

    /**
     * Método que cambiar el valor del color del auto
     *
     * @param color El nuevo valor del color del auto
     * */
    public void setColor(String color){
	this.color = color;
    }

    /**
     * Método que cambiar el valor del modelo del auto
     *
     * @param modelo El nuevo valor del modelo del auto
     * */
    public void setModelo(String modelo){
	this.modelo = modelo;
    }

    /**
     * Método que hace conexión con el main para imprimir datos
     *
     * @return toString
     * */
    public String toString(){
	return "";
    }

}
    
    
