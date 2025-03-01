package cuentas.clientes;

/**
 * Clase que representa una cuenta bancaria con operaciones de ingreso, retiro y consulta de saldo.
 * 
 * @author María del Carmen Álvarez Navas
 * @version 2.0
 * @since 01/03/2025
 */
public class Cuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
    * Constructor por defecto. Inicializa la cuenta con valores vacíos y saldo en 0.
    */
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=0;
        tipoInteres=0;
    }

    /**
     * Constructor parametrizado para crear una cuenta con valores iniciales
     * @param nom nombre del titular de la cuenta
     * @param cue número de la cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interés asociado a la cuenta
     */
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /**
     * Método que muestra el saldo de la cuenta
     * @return saldo actual de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que permite ingresar dinero en la cuenta
     * @param cantidad cantidad de dinero a ingresar
     * @throws Exception si la cantidad es negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite retirar dinero de la cuenta
     * @param cantidad cantidad de dinero a retirar
     * @throws Exception si la cantidad es negativa o superior al saldo disponible.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Método que permite obtener el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite establecer el nombre del titular.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que permite obtener el número de cuenta
     * 
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Método que permite establecer el número de cuenta.
     * 
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que permite obtener el saldo actual de la cuenta.
     * 
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que permite establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que permite obtiener el tipo de interés asociado a la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método que permite establecer el tipo de interés asociado a la cuenta.
     * 
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
}
