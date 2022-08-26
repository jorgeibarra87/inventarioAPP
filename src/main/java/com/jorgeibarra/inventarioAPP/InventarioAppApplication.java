package com.jorgeibarra.inventarioAPP;

import com.jorgeibarra.inventarioAPP.controlador.ProductoControlador;
import com.jorgeibarra.inventarioAPP.modelo.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioAppApplication {
    
    @Autowired
    ProductoRepositorio productoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(InventarioAppApplication.class, args);
	}
        
        @Bean
        public void aplicationRunner(){
            
            ProductoControlador productoControlador = new ProductoControlador(productoRepositorio);
            productoControlador.buscarProductos();
        }

}
