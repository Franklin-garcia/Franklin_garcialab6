/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Franklin Garcia
 */
public class clientes extends Personas {
    protected String ticket;
    protected int dinero;
    protected ArrayList <ordenes>ordenes;

    public clientes() {
        super();
    }

    public clientes(String ticket, int dinero, ArrayList<ordenes> ordenes, int edad, int ID, String nacionalidad, String lugar_nacimiento, String nombre, Color color, ArrayList<Familiares> familiar, DefaultTreeModel arbol) {
        super(edad, ID, nacionalidad, lugar_nacimiento, nombre, color, familiar, arbol);
        this.ticket = ticket;
        this.dinero = dinero;
        this.ordenes = ordenes;
    }


    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<ordenes> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
