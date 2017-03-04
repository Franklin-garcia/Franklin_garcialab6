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
    protected int numero_articulos,dinero;
    protected String atiende;
    protected  String clientes;
    protected String tipo_articulo;
    
    public ordenes() {
    }

    public ordenes(int numero_articulos, int dinero, String atiende, String clientes, String tipo_articulo) {
        this.numero_articulos = numero_articulos;
        this.dinero = dinero;
        this.atiende = atiende;
        this.clientes = clientes;
        this.tipo_articulo = tipo_articulo;
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

    public String getTipo_articulo() {
        return tipo_articulo;
    }

    public void setTipo_articulo(String tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }

    public String getAtiende() {
        return atiende;
    }

    public void setAtiende(String atiende) {
        this.atiende = atiende;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }    
}
