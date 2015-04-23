/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kula kula = new Kula();
        Walec walec = new Walec();
        System.out.printf("Pole kuli: %.3f\n",kula.pole());        
        System.out.printf("Objetosc kuli: %.3f\n",kula.objetosc());
        System.out.printf("Pole walca: %.0f\n",walec.pole());        
        System.out.printf("Objetosc walca: %.0f\n",walec.objetosc());
// TODO code application logic here
    }
    
}
