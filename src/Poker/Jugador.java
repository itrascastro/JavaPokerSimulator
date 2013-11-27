package Poker;

public class Jugador {

    private int id;
    private int manosGanadas;
    private Mano mano;
    private int descartadas;
    private int puntuacion;

    public Jugador(int id) {
        this.id = id;
        this.manosGanadas = 0;
        this.mano = new Mano();
        this.descartadas = 0;
        this.puntuacion = 0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManosGanadas() {
        return this.manosGanadas;
    }

    public void setManosGanadas(int manosGanadas) {
        this.manosGanadas = manosGanadas;
    }

    public Mano getMano() {
        return this.mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }

    public int calcularJugada() {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param cartas
     */
    public void cogerCartas(Carta[] cartas) {
        throw new UnsupportedOperationException();
    }

    public Carta[] descartar() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

    public Jugador() {
        throw new UnsupportedOperationException();
    }

    public int getDescartadas() {
        return this.descartadas;
    }

    public void setDescartadas(int descartadas) {
        this.descartadas = descartadas;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

}
