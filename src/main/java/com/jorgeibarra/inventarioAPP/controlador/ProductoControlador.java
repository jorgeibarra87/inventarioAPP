package com.jorgeibarra.inventarioAPP.controlador;

import com.jorgeibarra.inventarioAPP.modelo.Producto;
import com.jorgeibarra.inventarioAPP.modelo.ProductoRepositorio;
import java.util.List;

/**
 *
 * @author Jorge Ibarra
 */
public class ProductoControlador {
    
    ProductoRepositorio productoRepositorio;
    
    public ProductoControlador(ProductoRepositorio productoRepositorio){
     this.productoRepositorio = productoRepositorio;
    }
    
    public void buscarProductos (){
     List<Producto> listaProducto = (List<Producto>) productoRepositorio.findAll();
        for (Producto producto : listaProducto) {
            System.out.println("Producto----> " + producto);
        }
    }
    
    public void agregar (){
    
    }
    
    public void actualizar(){
    
    }
    
    public void eliminar(){
    
    }
    
    public void generarInforme (){
    
    }
    
}
