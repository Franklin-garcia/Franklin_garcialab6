/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Franklin Garcia
 */
public class Personas {
    // es su edad, ID, nacionalidad, lugar de nacimiento, nombre, árbol genealógico, color de piel y un familiar. 
    protected int edad;
    protected int ID;
    protected String nacionalidad;
    protected String lugar_nacimiento;
    protected String nombre;
    protected String color;
    protected ArrayList<Familiares> familiar;
    protected DefaultTreeModel arbol;
    public Personas() {
    }

    public Personas(int edad, int ID, String nacionalidad, String lugar_nacimiento, String nombre, String color, ArrayList<Familiares> familiar, DefaultTreeModel arbol) {
        this.edad = edad;
        this.ID = ID;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color = color;
        this.familiar = familiar;
        this.arbol = arbol;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Familiares> getFamiliar() {
        return familiar;
    }

    public void setFamiliar(ArrayList<Familiares> familiar) {
        this.familiar = familiar;
    }

    public DefaultTreeModel getArbol() {
        return arbol;
    }

    public void setArbol(DefaultTreeModel arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
