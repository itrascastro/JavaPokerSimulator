package Poker;

/**
 *
 * @author ismael trascastro
 */
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
    
    public boolean mismoNumero(Carta c) {
        if (this.numero == c.getNumero()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String cadena;

        cadena = "Carta[palo=" + this.palo + ", numero=" + this.numero + "]";

        return cadena;
    }
    
    public int Valor() {
        if (this.numero == 0) {
            return 13;
        } else {
            return this.numero;
        }
    }

}
