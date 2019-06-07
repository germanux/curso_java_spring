package com.sinensia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/productos/obten_prueba
// http://localhost:8080/productos/obten_prueba?nombre=Gggggggggggggg
@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired 	// Inyección de dependencias
	private ProductoRepository prodRepo;
	
	@RequestMapping("/obten_prueba")
	public Producto devuelveProducto(
			@RequestParam(value="nombre", defaultValue = "Sin producto") 
			String nombre) 
	{
		System.out.print(" >>>>> Petición - HTTP: " + nombre);
		return new Producto(1, nombre, 100, 2);
	}
	
	@GetMapping("/add")
	public @ResponseBody String addProducto(
			@RequestParam String nombre,
			@RequestParam double precio,
			@RequestParam int cantidad) {
		Producto nuevoProd = new Producto(nombre, precio, cantidad);
		
		// Lo guardamos en BBDD mediante el crudRepo		
		prodRepo.save(nuevoProd);
		
		return "Guardado";
	}
}




