/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.sjdr;

/**
 *
 * @author T-102
 */
public class Imc {
    //el siguiente atributo es de composicion agregacion 
    Usuario u;
    
    public String calcular(){
        float imc=u.getPeso()/(u.getAltura()*u.getAltura());
       return "aqui aparecera tu resultado"+imc; 
    }
}
