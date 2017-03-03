/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class ordenes {
    protected ArrayList<articulos>articulos;
    protected int numero_articulos,dinero;
    protected ArrayList<empleado>atiende;

    public ordenes() {
    }

    public ordenes(ArrayList<articulos> articulos, int numero_articulos, int dinero, ArrayList<empleado> atiende) {
        this.articulos = articulos;
        this.numero_articulos = numero_articulos;
        this.dinero = dinero;
        this.atiende = atiende;
    }

    public ArrayList<articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<articulos> articulos) {
        this.articulos = articulos;
    }

    public int getNumero_articulos() {
        return numero_articulos;
    }

    public void setNumero_articulos(int numero_articulos) {
        this.numero_articulos = numero_articulos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<empleado> getAtiende() {
        return atiende;
    }

    public void setAtiende(ArrayList<empleado> atiende) {
        this.atiende = atiende;
    }
    
}
