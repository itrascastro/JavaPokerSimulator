/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poker;

/**
 *
 * @author ismael
 */
public class Test {
    public static void main(String args[])
    {
        Baraja b;
        
        Carta[] cartas;
        
        b = new Baraja();
        
        System.out.println(b.toString());
        b.barajar();
        System.out.println(b.toString());
        
        cartas = b.repartir(3);
        
        System.out.println(cartas[0].toString());
        System.out.println(cartas[1].toString());
        System.out.println(cartas[2].toString());
        
    }
    
}
