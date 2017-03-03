/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

/**
 *
 * @author Franklin Garcia
 */
public class gatos extends articulos{
    protected int peso,altura;

    public gatos() {
    }

    public gatos(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
