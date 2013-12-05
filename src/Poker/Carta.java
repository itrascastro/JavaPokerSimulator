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
    
//  Uno mas que la suma de los 5 anteriores
    public int Valor() {
        switch (this.numero) {
            case 1 : return 1;
            case 2 : return 2;
            case 3 : return 4;
            case 4 : return 8;
            case 5 : return 16;
            case 6 : return 32;
            case 7 : return 63;
            case 8 : return 124;
            case 9 : return 244;
            case 10 : return 480;
            case 11 : return 944;
            case 12 : return 1856;
            default : return 3649; //as
        }
    }

}
