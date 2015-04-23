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
public class Walec implements Pole, Objetosc{
    int polePodstawy = 10;
    int wysokoscWalca = 20;
    int polePowBocznej = 45;
    
    public double objetosc()
    {
    double objetosc = polePodstawy*wysokoscWalca;
    return objetosc;
}

    public double pole(){
        double pole = polePowBocznej+(2*polePodstawy);
        return pole;
    }
}

