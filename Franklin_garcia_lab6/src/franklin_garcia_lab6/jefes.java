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
public class jefes extends Personas{
   //Existen solo dos jefes (1 para cada área) y estos cuentan con, una sección d
    //de trabajo (venta de gatos y venta de baleadas), una lista de empleados que trabajan 
    //en su misma sección, número de clientes atendidos y ganancia hasta el momento. 
    protected String seccion_trabajo;
    protected ArrayList<empleado>lista_empleados;
    protected int atendidos;
    protected int ganancia;

    public jefes() {
        super();
    }

    public jefes(String seccion_trabajo, ArrayList<empleado> lista_empleados, int atendidos, int ganancia, int edad, int ID, String nacionalidad, String lugar_nacimiento, String nombre, Color color, ArrayList<Familiares> familiar, DefaultTreeModel arbol) {
        super(edad, ID, nacionalidad, lugar_nacimiento, nombre, color, familiar, arbol);
        this.seccion_trabajo = seccion_trabajo;
        this.lista_empleados = lista_empleados;
        this.atendidos = atendidos;
        this.ganancia = ganancia;
    }


    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<empleado> getLista_empleados() {
        return lista_empleados;
    }

    public void setLista_empleados(ArrayList<empleado> lista_empleados) {
        this.lista_empleados = lista_empleados;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
