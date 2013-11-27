package Poker;

import java.util.Collections;
import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> cartas;
    private int index;

    public Baraja() {
        int cnt = 0;

        this.cartas = new ArrayList<Carta>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas.add(cnt, new Carta(i,j));
                cnt++;
            }
        }
        this.index = 0;
    }

    public void barajar() {
        Collections.shuffle(this.cartas);
    }

    /**
     *
     * @param num
     * @return cartas
     */
    public Carta[] repartir(int num) {
        Carta[] cartas = new Carta[num];

        for (int i = 0; i < num; i++) {
            cartas[i] = this.cartas.get(this.index);
            this.index++;
        }
        return cartas;
    }

    public String toString() {
        String cadena = "Baraja[";
        int cnt = this.index;
        
        for (int i=this.index; i<52; i++) {
            cadena += this.cartas.get(cnt).toString();
            if (cnt < 51) {
                cadena += ", ";
            }
            cnt++;
        }
        cadena += "]";
        return cadena;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
