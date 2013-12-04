package Poker;

/**
 *
 * @author ismael trascastro
 */
public class Test {
    public static void main(String args[])
    {
        //Test.testBarajaMano();
        Test.testPoker();
    }
    
    public static void testPoker()
    {
        Poker pk = new Poker();
        
        Jugador j = pk.jugar();
        
        System.out.println(pk.toString());
        System.out.println(j.toString());
    }
    
    public static void testBarajaMano() {
        Baraja b;
        
        Mano cartas = new Mano();
        
        b = new Baraja();
        
        System.out.println(b.toString());
        b.barajar();
        System.out.println(b.toString());
        
        cartas.setCartas(b.repartir(5));
        System.out.println(cartas.toString());
        
        int descartadas = cartas.descartar();
        
        System.out.println(cartas.toString());
    }
    
}
