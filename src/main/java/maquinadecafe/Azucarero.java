package maquinadecafe;

/** Depósito de azúcar (medido en cucharadas). */
public class Azucarero {

    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    /** ¿Hay suficientes cucharadas para lo que se pide? */
    public boolean hasAzucar(int cantidadAzucar) {
        return this.cantidadAzucar >= cantidadAzucar;
    }

    /** Echa azúcar: la resta del depósito. */
    public void giveAzucar(int cantidadAzucar) {
        this.cantidadAzucar -= cantidadAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
