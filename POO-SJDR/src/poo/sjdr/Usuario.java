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
public class Usuario {
    //regla 1 de encapsulamiento 
    private float peso;
    private float altura;
    
    
    
    
    
    /* //regla 2 
    public void setPeso(float peso){
    this.peso=peso;  
        }
    public void setAltura(float altura){
    this.altura=altura; 
    }
    //Regla 3
    public float getPeso(){
        return peso;
    }
    public float getAltura(){
        return altura;
    }
/***/

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     * este es el valor que debes pasar al metodo
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
