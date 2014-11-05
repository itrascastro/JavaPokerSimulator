package Poker;

/**
 *
 * @author ismael trascastro
 */
public class Poker {

    private Baraja baraja;
    private Jugador[] jugadores;
    private boolean descartes;

    public Poker() {
        this.jugadores = new Jugador[4];
        for (int i = 0; i < 4; i++) {
            this.jugadores[i] = new Jugador(i);
        }
        this.baraja = new Baraja();
        this.descartes = false;
        
    }

    public Jugador jugar() {
        Jugador ganador; 
        
        this.barajar();
        this.repartir();
        this.descartes();
        this.repartir();
        ganador = this.calcularGanador();
        ganador.setManosGanadas();
        
        return ganador;
    }

    public Baraja getBaraja() {
        return this.baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    private void barajar() {
        this.baraja.barajar();
    }

    private void repartir() {
        int num;
        
        for (int i = 0; i < 4; i++) {
            num = this.jugadores[i].getDescartadas();
            this.jugadores[i].cogerCartas(baraja.repartir(num));
        }
    }

    private void descartes() {
        for (int i=0; i<4; i++) {
            this.jugadores[i].descartar();
        }
        this.descartes = true;
    }

    private Jugador calcularGanador() {
        int p0, p1, p2, p3;
        
        for (int i=0; i<4; i++) {
            this.jugadores[i].calcularJugada();
        }
        p0 = this.jugadores[0].getPuntuacion();
        p1 = this.jugadores[1].getPuntuacion();
        p2 = this.jugadores[2].getPuntuacion();
        p3 = this.jugadores[3].getPuntuacion();
        
        if (p0 > p1 && p0 > p2 && p0 > p3) {
            return this.jugadores[0];
        }
        if (p1 > p0 && p1 > p2 && p1 > p3) {
            return this.jugadores[1];
        }
        if (p2 > p0 && p2 > p1 && p2 > p3) {
            return this.jugadores[2];
        }
        return this.jugadores[3];
    }

    public String toString() {
        String cadena = "Poker[\n";
        
        cadena += this.baraja.toString() + ",\n";
        cadena += "Jugadores[\n";
        for (int i=0; i<4; i++) {
            cadena += this.jugadores[i].toString();
            if (i!=3) {
                cadena += ",";
            }
            cadena += "\n";
        }
        cadena += "]\n";
        cadena += "Descartes=";
        if (this.descartes) {
            cadena += "yes";
        } else {
            cadena += "no";
        }
        cadena += "\n]";
        
        return cadena;
    }

    public boolean isDescartes() {
        return this.descartes;
    }

    public void setDescartes(boolean descartes) {
        this.descartes = descartes;
    }

}
