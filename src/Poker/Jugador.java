package Poker;

import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author ismael trascastro
 */
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

    public void setManosGanadas() {
        this.manosGanadas++;
    }

    public Mano getMano() {
        return this.mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }

    public void calcularJugada() {
        this.puntuacion = this.mano.getValor();
    }

    /**
     *
     * @param cartas
     */
    public void cogerCartas(ArrayList<Carta> cartas) {
        if (cartas.size() == 5) {
            this.mano.setCartas(cartas);
        } else {
            for (Carta c : cartas) {
                this.mano.addCarta(c);
            }
        }
    }

    public void descartar() {
        this.descartadas = this.mano.descartar();
    }

    public String toString() {
        String cadena = "Jugador[";
        
        cadena += "Id: " + this.id + ", ";
        cadena += "ManosGanadas: " + this.manosGanadas + ", ";
        cadena += "Descartadas: " + this.descartadas + ", ";
        cadena += "Puntuación: " + this.puntuacion + ", ";
        cadena += this.mano.toString();
        cadena += "]";
        
        return cadena;
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
