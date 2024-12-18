

package ec.edu.espoch.ejercicioherencia;

import ec.edu.espoch.ejercicioherencia.clases.CuentaBancaria;


public class EjercicioHerencia {

    public static void main(String[] args) {
        System.out.println("=== Prueba de Cuenta ===");
        CuentaBancaria cuenta = new CuentaBancaria(50000, 12);
        cuenta.consignar(20000);
        cuenta.retirar(15000);
        cuenta.calcularInteresMensual();
        cuenta.extractoMensual();
        cuenta.imprimir();

        System.out.println("\n=== Prueba de CuentaAhorros ===");
        CuentaAhorros cuentaAhorros = new CuentaAhorros(12000, 10);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(3000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(1500);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(500); // Genera comisión
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();
    }
}

