
package ec.edu.espoch.ejercicioherencia.clases;

public class CuentaBancaria {
    
    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comMensual = 0;

    public CuentaBancaria(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConsignaciones() {
        return numConsignaciones;
    }

    public void setNumConsignaciones(int numConsignaciones) {
        this.numConsignaciones = numConsignaciones;
    }

    public int getNumRetiros() {
        return numRetiros;
    }

    public void setNumRetiros(int numRetiros) {
        this.numRetiros = numRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComMensual() {
        return comMensual;
    }

    public void setComMensual(float comMensual) {
        this.comMensual = comMensual;
    }
    
    
    
}
