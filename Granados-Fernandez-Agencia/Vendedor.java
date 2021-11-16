/**
 * Clase Vendedor Clase que simula a un vendedor de autos
 * 
 * @author Melissa Fernández
 * @author Jose Pablo Granados
 * @version 1.0
 */
public class Vendedor {

    private boolean buenHumor; // Si el vendedor está de buen humor o no
    private boolean trabajador; // Si el vendedor es trabajador o no
    private int noVendedor;// El número de vendedor
    private String nombre; // El nombre del vendedor

    /**
     * Método constructor sin parámetros
     */
    public Vendedor() {
        buenHumor = true;
        trabajador = true;
        nombre = "Humberto";

    }

    /**
     * Metodo constructor que recibe el nombre del vendedor
     * 
     * @param nombre El nombre del vendedor
     */
    public Vendedor(String nombre) {
        buenHumor = true;
        trabajador = true;
        this.nombre = nombre;

    }

    /**
     * Método getBuenHumor Método que nos deja saber si el vendedor está de buen
     * humor o no
     * 
     * @return buenHumor Si el vendedor está de buen humor o no
     */
    public boolean getBuenHumor() {
        return buenHumor;
    }

    /**
     * Metodo getNoVendedor nos deja saber el número de vendedor
     * 
     * @return noVendedor El numero de vendedor
     */
    public int getNoVendedor() {
        return noVendedor;
    }

    /**
     * Metodo getTrabajador nos dice si el vendedor es trabajador o no
     * @return si el vendedor es trabajador
     */
    public boolean getTrabajador(){
        return trabajador;
    }

    /**
     * Método setBuenHumor método que permite cambiar el humor del vendedor
     * 
     * @param buenHumor
     */
    public void setBuenHumor(boolean buenHumor) {
        this.buenHumor = buenHumor;
    }

    /**
     * Metodo setNoVendedor Asigna un numero de vendedor
     * 
     * @param noVendedor El numero de vendedor
     */
    public void setNoVendedor(int noVendedor) {
        this.noVendedor = noVendedor;
    }

    /**
     * Metodo setTrabajador permite hacer que el vendedor sea trabajador o no
     * @param trabajador True si lo es y false si no lo es
     */
    public void setTrabajador(boolean trabajador){
        this.trabajador=trabajador;
    }

    /**
     * Método presentarse hace que el vendedor se presente
     * 
     * @return La presentación del vendedor
     */
    public String presentarse() {
        return "Hola, buen día, mi nombre es " + nombre + " y estoy aquí para ayudarl@ a elegir su auto. ";
    }

    /**
     * Método ofrecer hace que el vendedor ofrezca los modelos disponibles
     * @param auto1 Un auto
     * @param auto2 Un auto
     * @param auto3 Un auto
     * @param auto4 Un auto
     * @param auto5 Un auto
     * @return La oferta de los autos disponibles
     */
    public String ofrecer(Auto auto1, Auto auto2, Auto auto3, Auto auto4, Auto auto5){
        return "¿En cuál de los modelos está interesado? \n Tenemos los modelos: " + auto1.getModelo() + ", "+auto2.getModelo() + ", "+auto3.getModelo() + ", " + auto4.getModelo() + ", " + auto5.getModelo();
    }

    /**
     * Método color hace que el vendedor ofrezca el color de auto disponible en un modelo determinado
     * @param auto Un auto
     * @return La oferta del color disponible del auto dado
     */
    public String color(Auto auto){
        return "Ese auto por el momento lo tenemos en color "+ auto.getcolor();
    }

    /**
     * Metodo deAcuerdo hace que el vendedor pregunte al cliente si está de acuerdo con lo que se le ofrece
     * @return La confirmación de la oferta
     */
    public String deAcuerdo(){
        return "¿Está de acuerdo con esta oferta?(si/no)";
    }

    /**
     * Método precio hace que el vendedor de a conocer el precio del auto
     * @param auto El auto
     * @return El precio del auto
     */
    public String precio(Auto auto){
        return "El precio del auto ahora es de: $ " + auto.getCosto();
    }

    /**
     * Metodo preguntarColor hace que el vendedor pregunte el color deseado de auto
     * @return La pregunta del color deseado
     */
    public String preguntarColor(){
        return "¿Qué color es el que busca?";
    }

    /**
     * Metodo pedirAuto hace que el vendedor pida un nuevo auto (cambiaa el color del auto)
     * @param color El color del auto
     * @param auto El nuevo auto
     * @return Anuncio de que el auto llegará pronto
     */
    public String pedirAuto(String color, Auto auto){
        auto.setColor(color);
        return "Su auto llegará en 2 días. " + this.precio(auto);
    }

    /**
     * Metodo avisoTramite hace que el vendedor avise que puede comenzar con el trámite de compra
     * @return Aviso de tramite
     */
    public String avisoTramite(){
        return "Ahora puede pasar a la parte de \"comprar auto\" para comenzar su trámite";
    }

    /**
     * Metodo servicio: Preguntar si el servicio ha sido bueno
     * @return La pregunta acerca del servicio
     */
    public String servicio(){
        return "¿Nuestro servicio le ha parecido bien hasta el momento?(si/no)";
    }

    /**
     * Metodo aplicarDescuento Hace que el vendedor haga un descuento
     * @param auto el auto a comprar
     */
    public void aplicarDescuento(Auto auto){
        double costoConDescuento = auto.getCosto() - 20000;
        auto.setCosto(costoConDescuento);
    }



}