package com.dziombra.consolidacao.repositories;

import com.dziombra.consolidacao.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
