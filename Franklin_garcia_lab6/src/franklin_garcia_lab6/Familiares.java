/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class Familiares extends Personas {
   //Los Familiares tienen edad, ID, nacionalidad, lugar de nacimiento
    //, nombre, color de piel, un familiar padre y una lista de familiares hijos. 
protected int edad;
protected int ID;
protected String nacionalidad;
protected String lugar_nacimineto;
protected String nombre;
protected String color;
protected Familiares Padre;
protected ArrayList hijos;

    public Familiares() {
    }

    public Familiares(int edad, int ID, String nacionalidad, String lugar_nacimineto, String nombre, String color, Familiares Padre, ArrayList hijos) {
        this.edad = edad;
        this.ID = ID;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimineto = lugar_nacimineto;
        this.nombre = nombre;
        this.color = color;
        this.Padre = Padre;
        this.hijos = hijos;
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

    public String getLugar_nacimineto() {
        return lugar_nacimineto;
    }

    public void setLugar_nacimineto(String lugar_nacimineto) {
        this.lugar_nacimineto = lugar_nacimineto;
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

    public Familiares getPadre() {
        return Padre;
    }

    public void setPadre(Familiares Padre) {
        this.Padre = Padre;
    }

    public ArrayList getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList hijos) {
        this.hijos = hijos;
    }

}