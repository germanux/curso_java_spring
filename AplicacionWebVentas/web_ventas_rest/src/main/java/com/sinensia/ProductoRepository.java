package com.sinensia;

import org.springframework.data.repository.CrudRepository;
// Spring crea un bean automaticamente llamado productoRepository
public interface ProductoRepository 
	extends CrudRepository<Producto, Integer> 
{

}
