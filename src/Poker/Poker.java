package Poker;

public class Poker {

    private Jugador turno;
    private Baraja baraja;
    private Jugador[] jugadores;
    private boolean descartes;

    public Poker() {
        this.jugadores = new Jugador[4];
        for (int i = 0; i < 4; i++) {
            this.jugadores[i] = new Jugador(i);
        }
        this.turno = this.jugadores[0];
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
        
        return ganador;
    }

    public Jugador getTurno() {
        return this.turno;
    }

    public void setTurno(Jugador turno) {
        this.turno = turno;
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
            if (!this.descartes) {
                num = 5;
            } else {
                num = this.jugadores[i].getDescartadas();
            }
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
        throw new UnsupportedOperationException();
    }

    public boolean isDescartes() {
        return this.descartes;
    }

    public void setDescartes(boolean descartes) {
        this.descartes = descartes;
    }

}
