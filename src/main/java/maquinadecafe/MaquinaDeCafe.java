package maquinadecafe;

/**
 * La máquina coordina a su "equipo": vasos, cafetera y azucarero.
 * No guarda café ni azúcar ella misma: les pregunta a sus componentes.
 */
public class MaquinaDeCafe {

    // Sin "private" (visibilidad de paquete) porque las pruebas de la guía
    // leen estos campos directamente: maquinaDeCafe.vasosPequeno
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;

    /** Traduce el texto del botón ("pequeno", "mediano", "grande") al depósito de vasos. */
    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso.toLowerCase()) {
            case "pequeno": return vasosPequeno;
            case "mediano": return vasosMediano;
            case "grande":  return vasosGrande;
            default:        return null; // tamaño desconocido
        }
    }

    /**
     * Prepara el café. Primero VERIFICA todo y solo después ENTREGA,
     * para no gastar vasos o café si al final falta algo.
     */
    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        int cafeNecesario = tipoDeVaso.getContenido() * cantidadDeVasos;

        // 1) Verificaciones (en el orden del diagrama de secuencia)
        if (!tipoDeVaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }
        if (!cafetera.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }
        if (!azucarero.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }

        // 2) Entrega: todo está disponible, se descuenta de cada depósito
        tipoDeVaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);

        return "Felicitaciones";
    }

    // ---- getters y setters ----
    public Cafetera getCafetera() { return cafetera; }
    public void setCafetera(Cafetera cafetera) { this.cafetera = cafetera; }

    public Vaso getVasosPequeno() { return vasosPequeno; }
    public void setVasosPequeno(Vaso vasosPequeno) { this.vasosPequeno = vasosPequeno; }

    public Vaso getVasosMediano() { return vasosMediano; }
    public void setVasosMediano(Vaso vasosMediano) { this.vasosMediano = vasosMediano; }

    public Vaso getVasosGrande() { return vasosGrande; }
    public void setVasosGrande(Vaso vasosGrande) { this.vasosGrande = vasosGrande; }

    public Azucarero getAzucarero() { return azucarero; }
    public void setAzucarero(Azucarero azucarero) { this.azucarero = azucarero; }
}
