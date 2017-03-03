/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class empleado extends Personas {
    
    protected String seccion_trabajo;
    protected Date entrada,salida;
    protected int sueldo;
    protected String estado;

    public empleado() {
        super();
    }

    public empleado(String seccion_trabajo, Date entrada, Date salida, int sueldo, String estado) {
        this.seccion_trabajo = seccion_trabajo;
        this.entrada = entrada;
        this.salida = salida;
        this.sueldo = sueldo;
        this.estado = estado;
    }


    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
