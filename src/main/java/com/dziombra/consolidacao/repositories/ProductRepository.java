package com.dziombra.consolidacao.repositories;

import com.dziombra.consolidacao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
