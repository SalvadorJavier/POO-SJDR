/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.*;
/**
 *una clase puede tener mas de un constructor pero si agregas una mas ya no podra usar el contructor de defecto a menos que  
 * @author T-102
 */
public class Probar_constructores {
    public static void main(String[] args) {
     //   Alumno a=new Alumno(); //inicializa los atributos de su clase siempre se tiene que llamar igual que su clase 
        //System.out.println("Tu Edad es "+a.getNombre());
        
        int x=2;
        System.out.println(x);
        JFrame v=new JFrame("Hola");//genera ventana 
        v.setSize(400, 200);
        v.setVisible(true);
    }
    
  
}
