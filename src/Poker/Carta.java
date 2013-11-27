package Poker;

public class Carta {

    private int palo;
    private int numero;

    /**
     *
     * @param palo
     * @param numero
     */
    public Carta(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getPalo() {
        return this.palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        String cadena;

        cadena = "Carta[palo=" + this.palo + ", numero=" + this.numero + "]";

        return cadena;
    }

}
