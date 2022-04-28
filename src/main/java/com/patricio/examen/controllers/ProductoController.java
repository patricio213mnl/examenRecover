package com.patricio.examen.controllers;

import com.patricio.examen.models.ProductoDTO;
import com.patricio.examen.repositories.IProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductoController {

    @Autowired
    private IProductoDAO repository;

    @PostMapping("/product")
    public ProductoDTO create(@Validated @RequestBody ProductoDTO p) {
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<ProductoDTO> readAll() {
        return repository.findAll();
    }

    @PutMapping("/product/{id}")
    public ProductoDTO update(@PathVariable String id, @Validated @RequestBody ProductoDTO p) {
        return repository.save(p);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
