package Poker;

import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author ismael trascastro
 */
public class Mano {

    private ArrayList<Carta> cartas;
    private int valor;

    public Mano() {
        this.cartas = new ArrayList<Carta>();
        this.valor = 0;
    }

    public ArrayList<Carta> getCartas() {
        return this.cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
        this.calcularValor();
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
        this.cartas.add(carta);
        this.calcularValor();
    }
    
    public Carta getCarta(int n) {
        return this.cartas.get(n);
    }
    
    private ArrayList<Carta> copiarMano() {
        ArrayList<Carta> copia = new ArrayList<Carta>();
        
        for (Carta c : this.cartas) {
            copia.add(c);
        }
        
        return copia;
    }

    /**
     *
     * @param carta
     */
    public void removeCarta(Carta carta) {
        this.cartas.remove(carta);
    }

    private void calcularValor() {
        int valor = 0;
        
        for (Carta c : this.cartas) {
            valor += c.Valor();
        }
        
        //es necesaria una copia porque una asignación modificaría la misma
        //zona de memoria
        ArrayList<Carta> manoActual = this.copiarMano();
        
        int descartes = this.descartar();//esta llamada modifica la mano
        
        
        if (descartes == 0) {//full
            valor += 400;
        } else if (descartes == 2) {//trio
            valor += 300;
        } else if (descartes == 3) {//pareja
            valor += 100;
        } else if (descartes == 1) {//poker o doblePareja
            if (this.isPoker()) {
                valor += 500;
            } else {
                valor += 200;
            }
        }
        
        this.cartas = manoActual;//restaura la mano
        this.valor = valor;
    }
    
    private boolean isPoker() {
        if (this.cartas.get(0).mismoNumero(this.cartas.get(1)) &&
            this.cartas.get(0).mismoNumero(this.cartas.get(2)) &&
            this.cartas.get(0).mismoNumero(this.cartas.get(3))
            ) {
            return true;
        }
        return false;
    }

    public String toString() {
        String cadena = "Mano[";
        
        for (Carta c : this.cartas) {
            cadena += c.toString();
            if (c != this.cartas.get(this.cartas.size() - 1)) {
                cadena += ", ";
            }
        }
        cadena += "]";
        
        return cadena;
    }

    public int descartar() {
        ArrayList<Carta> meQuedo = new ArrayList<Carta>();
        
        while (this.cartas.size() > 0) {
            this.repetidas(this.cartas.get(0), meQuedo);
        }
        
        this.cartas = meQuedo;
        return (5 - this.cartas.size());
    }

    private void repetidas(Carta c, ArrayList<Carta> meQuedo) {
        boolean repetida = false;
        int cnt = 0;
        Carta enMano;
        
        this.cartas.remove(c);
        while (this.cartas.size() > 0 && cnt<this.cartas.size()) {
            enMano = this.cartas.get(cnt);
            if (enMano.mismoNumero(c)) {
                meQuedo.add(enMano);
                this.cartas.remove(enMano);
                repetida = true;
            } else {
                cnt++;
            }
        }
        if (repetida) {
            meQuedo.add(c);
        }
    }
}
