package com.sinensia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

	@RequestMapping("/productos")
	public Producto devuelveProducto() {
		return new Producto(1, "Examen", "30 €");
	}
}
