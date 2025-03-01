package cuentas.clientes;

/**
 * Clase principal
 * 
 * @author María del Carmen Álvarez Navas
 * @version 2.0
 * @since 01/03/2025
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa
     * @param args 
     */
    public static void main(String[] args) {
        operativa_cuenta();
    }

    /**
     * Método que realiza operaciones sobre la cuenta sin parámetros específicos.
     */
    private static void operativa_cuenta() {
        operativa_cuenta(100);
    }

     /**
     * Método que realiza operaciones sobre la cuenta con una cantidad inicial.
     * 
     * @param cantidad Cantidad inicial para operar con la cuenta.
     */
    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );
        System.out.println("Los apellidos del titular son: " + cuenta1.getApellidos());

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
