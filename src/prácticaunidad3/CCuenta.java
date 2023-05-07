/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 *
 * Clase que permite crear objetos Cuenta Corriente, con los atributos nombre, cuenta, saldo y tipoInterés
 * @author Alejandro Martínez Bravo
 * @version  1.0 17/03/2023, JDK 15.0.2
 * @since 15/02/2023
 * @see Main
 */
public class CCuenta {


    // Propiedades de la Clase Cuenta
    /**
     * nombre tipo String, atributo que identifica el nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * cuenta tipo String, atributo que identifica el número de cuenta de 20 dígitos
     */
    private String cuenta;
    /**
     * saldo tipo double, atributo que identifica la cantidad monetaria actual en la cuenta
     */
    private double saldo;
    /**
     * tipoInterés tipo double, atributo que identifica el tipo de interés que afecta a las transacciones de la cuenta
     */
    private double tipoInterés;

    
    /** Constructor de la clase CCuenta sin argumentos*/
    public CCuenta ()
    {
    }
    /** Constructor con parámetros para iniciar todas las propiedades de la clase CCuenta
     * 
     * @param nom tipo String, parámetro que identifica el nombre del titular de la CCuenta
     * @param cue tipo String, parámetro que identifica el número de cuenta, 20 dígitos de la CCuenta
     * @param sal tipo double, parámetro que identifica la cantidad monetaria actual en la cuenta
     * @param tipo tipo double, parámetro que identifica el tipo de interés que afecta a las transacciones de la cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método para asignar el nombre del titular de la CCuenta
     * @param nom tipo String, parámetro que identifica el nombre del titular de la CCuenta
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    /**
     * Método que me devuelve el nombre del titular de la CCuenta
     * @return tipo String con el valor del atributo nombre, titular de la CCuenta
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return tipo double con el valor del saldo disponible en cada momento en la CCuenta
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    //Este método va a ser probado con Junit
    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad tipo double, parámetro que identifica la cantidad monetaria que será añadida al saldo actual
     * @throws Exception tipo Exception cuando el argumento cantidad sea inferior a 0 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }



    //Este método va a ser probado con Junit
    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad tipo double, parámetro que indica la cantidad monetaria que será substraída al saldo actual
     * @throws Exception tipo Exception cuando el argumento cantidad sea menor o igual a 0 
     * y Exception tipo Exception cuando el argumento cantidad sea mayor que el saldo actual de la cuenta
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que me devuelve el número de cuenta
     * @return tipo String con el número de CCuenta, compuesto por 20 dígitos
     */
    public String getCuenta ()
    {
        return cuenta;
    }

    
    
    /**
     * Setter para el nombre de la cuenta, tipo String
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter del saldo disponible en la CCuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter del saldo de la cuenta, tipo double
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del TipoInterés de la CCuenta, tipo double
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter del tipoInterés, tipo double
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
