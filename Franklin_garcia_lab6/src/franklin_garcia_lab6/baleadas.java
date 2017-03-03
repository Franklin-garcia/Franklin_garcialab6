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
public class baleadas extends articulos{
    protected String ingredientes;

    public baleadas() {
    }

    public baleadas(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
