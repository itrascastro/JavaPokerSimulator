package Poker;

public class Mano {

    private Carta[] cartas;
    private int valor;

    public Mano() {
        this.cartas = new Carta[5];
        this.valor = 0;
    }

    public Carta[] getCartas() {
        return this.cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     *
     * @param carta
     */
    public void addCarta(Carta carta) {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param carta
     */
    public void removeCarta(Carta carta) {
        throw new UnsupportedOperationException();
    }

    public int calcularValor() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}
