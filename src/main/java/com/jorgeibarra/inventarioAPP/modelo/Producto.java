package com.jorgeibarra.inventarioAPP.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Jorge Ibarra
 */
@Table("Productos")
public class Producto {
    //Atributos
    @Id
    @Column("codigo")
    private Integer codigo;
    @Column("nombre")
    private String nombre;
    @Column("precio")
    private double precio;
    @Column("inventario")
    private Integer inventario;
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }
    
    //Constructores
    //constructor x defecto
    public Producto() {
    }
    
    /**
     * Constructor sobrecargado
     * @param codigo valor parametrico para asignar al atributo 'codigo'
     * @param nombre valor parametrico para asignar al atributo 'nombre'
     * @param precio valor parametrico para asignar al atributo 'precio'
     * @param inventario  valor parametrico para asignar al atributo 'inventario'
     */
    public Producto(Integer codigo, String nombre, double precio, Integer inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    @Override
    /**
     * Sobrecargado de la superclase Object para imprimit el estado del objeto
     */
    public String toString() {
        return this.codigo + " " + this.nombre + " " + this.precio + " " + this.inventario; 
    }
  
}


