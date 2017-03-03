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
public class clientes extends Personas {
    protected String ticket;
    protected int dinero;
    protected ArrayList <ordenes>ordenes;

    public clientes() {
        super();
    }

    public clientes(String ticket, int dinero, ArrayList<ordenes> ordenes) {
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
    
}
