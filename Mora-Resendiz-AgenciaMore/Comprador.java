/**
 * Clase que nos da los datos de un Comprador
 * @author MORE
 * @version 1.0
 **/
public class Comprador {

    //Atributos
    private String nombre;
    private int autocompra;
    private int añocompra;
    private String ultcompra;
    private String tipopago;
    private int historial;

    /**
     * Constructor que recibe 6 valores, 3 de tipo String y 3 de tipo int
     * @param nombre Representa el nombre del cliente
     * @param autocompra Representa el auto que se esta comprando
     * @param añocompra Representa el año en el que se hace la compra(año actual)
     * @param ultcompra Representa la fecha de la ultima compra
     * @param tipopago Representa como se pagara, en efectivo o tarjeta
     * @param historial Representa el numero de autos que ha comprado
     **/
    public Comprador(String nombre, int autocompra, int añocompra, String ultcompra, String tipopago, int historial){
    this.nombre = nombre;
    this.autocompra = autocompra;
    this.añocompra = añocompra;
    this.ultcompra = ultcompra;
    this.tipopago = tipopago;
    this.historial = historial;
    }

     /**
     * Constructor que recibe 4 valores, 2 de tipo String y 2 de tipo int(en ese orden)
     * @param nombre Representa el nombre del cliente
     * @param ultcompra Representa la fecha de la ultima compra
     * @param añocompra Representa el año en el que se hace la compra(año actual)
    * @param historial Representa el numero de autos que ha comprado
     **/
    public Comprador(String nombre, String ultcompra, int añocompra, int historial){
    this.nombre = nombre;
    this.añocompra = añocompra;
    this.ultcompra = ultcompra;
    this.historial = historial;
    }

    /**
     * Constructor que recibe 4 valores, 2 de tipo String y 2 de tipo int
     * @param nombre Representa el nombre del cliente
     * @param autocompra Representa el auto que se esta comprando
     * @param tipopago Representa como se pagara, en efectivo o tarjeta
     * @param historial Representa el numero de autos que ha comprado
     **/    
    public Comprador(String nombre, int autocompra, String tipopago, int historial){
    this.nombre = nombre;
    this.autocompra = autocompra;
    this.tipopago = tipopago;
    this.historial = historial;
    }
