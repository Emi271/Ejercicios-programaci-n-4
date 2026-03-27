package com.sisinventario.sisinventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sisinventario.sisinventario.Producto.Producto;
import com.sisinventario.sisinventario.Inventario.Inventario;

@SpringBootApplication
public class SisinventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisinventarioApplication.class, args);

		Inventario inventario = new Inventario();

        Producto p1 = new Producto("A001", "Notebook", 1500.0);
        Producto p2 = new Producto("A002", "Mouse", 25.0);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        // Instanciamos un producto pero no lo agregamos al inventario
        Producto p3 = new Producto("A003", "Teclado", 45.0); 

        System.out.println("Total de productos creados en el sistema: " + Producto.getTotalProductosRegistrados()); // Imprime 3
        System.out.println("Total consultado desde el gestor: " + inventario.consultarTotalHistorico());
	}

}
