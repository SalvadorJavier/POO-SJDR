/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

/**
 *
 * @author T-102
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        b=(byte)l;
        i=s;
        s=(short)i;
        i=(int)l;
        
        float f=2.0F;
        double d=2.0;
                
          f=(float)d;
           d=f;
           
           char ch='h';
           String y="hola";
           String x="45";
           String z="43.2";
           
           float w=Integer.parseInt(y)+Float.parseFloat(z);
           
    }
}
