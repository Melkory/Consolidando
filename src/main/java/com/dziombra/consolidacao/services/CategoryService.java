package com.dziombra.consolidacao.services;

import com.dziombra.consolidacao.dto.CategoryDTO;
import com.dziombra.consolidacao.entities.Category;
import com.dziombra.consolidacao.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll () {

        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();

    }

}
