package com.dziombra.consolidacao.controllers;

import com.dziombra.consolidacao.dto.ProductDTO;
import com.dziombra.consolidacao.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById (@PathVariable Long id) {
        return service.findById(id);

    }

    @GetMapping
    public Page<ProductDTO> findAll ( Pageable pageable ) {
        return service.findAll(pageable);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> update ( @PathVariable Long id, @RequestBody ProductDTO dto ) {
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }



}
