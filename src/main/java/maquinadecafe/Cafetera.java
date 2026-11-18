package maquinadecafe;

/** Depósito de café de la máquina. */
public class Cafetera {

    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    /** ¿Alcanza el café para lo que se pide? */
    public boolean hasCafe(int cantidadCafe) {
        return this.cantidadCafe >= cantidadCafe;
    }

    /** Sirve café: lo resta del depósito. */
    public void giveCafe(int cantidadCafe) {
        this.cantidadCafe -= cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
}
