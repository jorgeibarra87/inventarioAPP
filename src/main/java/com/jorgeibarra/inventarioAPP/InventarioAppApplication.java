package com.jorgeibarra.inventarioAPP;

import com.jorgeibarra.inventarioAPP.controlador.ProductoControlador;
import com.jorgeibarra.inventarioAPP.modelo.Producto;
import com.jorgeibarra.inventarioAPP.modelo.ProductoRepositorio;
import com.jorgeibarra.inventarioAPP.vista.VentanaProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioAppApplication {
    
    @Autowired
    ProductoRepositorio repositorio;

	public static void main(String[] args) {
	SpringApplicationBuilder builder = new SpringApplicationBuilder(InventarioAppApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
	}
        
        @Bean
        ApplicationRunner applicationRunner() {
        return args -> {
            /*
             * Incluir código definitivo aqui 
             */
            VentanaProducto ventana = new VentanaProducto();
            ProductoControlador controlador = new ProductoControlador(ventana, repositorio);
            List<Producto> listadoProductos = (List<Producto>) repositorio.findAll();
            controlador.getVista().asigarModelo(listadoProductos);

        };
    }

}
