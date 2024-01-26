package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements IService<Category>{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findEById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Category> findByName(String name) {
        return null;
    }

    @Override
    public List<Category> findByPrice(int min, int max) {
        return null;
    }

    @Override
    public List<Category> findByCategory(Long id) {
        return null;
    }
}
