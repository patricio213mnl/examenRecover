package com.patricio.examen.repositories;

import com.patricio.examen.models.ProductoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDAO extends MongoRepository<ProductoDTO, String> {
}
