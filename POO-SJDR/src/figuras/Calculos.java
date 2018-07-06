/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author T-101
 */
public class Calculos {
    public String calcularArea(Cuadrado c){
        float area =c.getLado()*c.getLado();
        return "el area es"+area;
        
    }
    public String CalcularPerimetro(Cuadrado c){
        float perimetro=4*c.getLado();
        return"el resultado es "+perimetro;
    }
}
