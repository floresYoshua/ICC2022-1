/**
 * Clase Auto
 * Clase que muestra los datos de un Auto
 * @author Brenda Paola Resendiz Mendoza 
 * @author Dulce Julieta Mora Hernandez 
 * @version 1.0
 */

public class Auto{

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
