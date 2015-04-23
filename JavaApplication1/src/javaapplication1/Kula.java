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
public class Kula implements Pole, Objetosc{
    int promienKuli = 10;
    public double objetosc()
    {
    double objetosc = ((4/3*(Math.pow(promienKuli, 3)))*Math.PI);
    return objetosc;
}

    public double pole(){
        double pole = 4*(((Math.pow(promienKuli, 3))*Math.PI));
        return pole;
    }
    
}