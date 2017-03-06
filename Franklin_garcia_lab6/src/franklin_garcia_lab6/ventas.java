/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class ventas {
    protected String nombre_cliente;
    protected String nombre_atendio;
    protected int cantidad_articulos;
    protected int total;
    protected Date fecha_compra;

    public ventas() {
    }

    public ventas(String nombre_cliente, String nombre_atendio, int cantidad_articulos, int total, Date fecha_compra) {
        this.nombre_cliente = nombre_cliente;
        this.nombre_atendio = nombre_atendio;
        this.cantidad_articulos = cantidad_articulos;
        this.total = total;
        this.fecha_compra = fecha_compra;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_atendio() {
        return nombre_atendio;
    }

    public void setNombre_atendio(String nombre_atendio) {
        this.nombre_atendio = nombre_atendio;
    }

    public int getCantidad_articulos() {
        return cantidad_articulos;
    }

    public void setCantidad_articulos(int cantidad_articulos) {
        this.cantidad_articulos = cantidad_articulos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return nombre_cliente;
    }
  
}
