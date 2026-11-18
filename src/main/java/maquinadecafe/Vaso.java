package maquinadecafe;

/**
 * Representa un "depósito" de vasos de un mismo tamaño.
 * Ej: new Vaso(5, 10) = hay 5 vasos y cada uno lleva 10 unidades de café.
 */
public class Vaso {

    private int cantidadVasos; // cuántos vasos quedan en el depósito
    private int contenido;     // cuánto café lleva cada vaso

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    /** ¿Hay al menos la cantidad de vasos que se pide? */
    public boolean hasVasos(int cantidadVasos) {
        return this.cantidadVasos >= cantidadVasos;
    }

    /** Entrega vasos: los resta del depósito. */
    public void giveVasos(int cantidadVasos) {
        this.cantidadVasos -= cantidadVasos;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
}
