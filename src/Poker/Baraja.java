package Poker;

import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author ismael trascastro
 */
public class Baraja {

    private ArrayList<Carta> cartas;

    public Baraja() {
        int cnt = 0;

        this.cartas = new ArrayList<Carta>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas.add(cnt, new Carta(i,j));
                cnt++;
            }
        }
    }

    public void barajar() {
        Collections.shuffle(this.cartas);
    }

    /**
     *
     * @param num
     * @return cartas
     */
    public ArrayList<Carta> repartir(int num) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        for (int i = 0; i < num; i++) {
            cartas.add(this.cartas.get(0));
            this.cartas.remove(0);
        }
        return cartas;
    }

    public String toString() {
        String cadena = "Baraja[";
        int cnt = 0;
        
        for (Carta c : this.cartas) {
            cadena += this.cartas.get(cnt).toString();
            if (cnt < 51) {
                cadena += ", ";
            }
            cnt++;
        }
        cadena += "]";
        return cadena;
    }
}
