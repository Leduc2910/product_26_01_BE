package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private IService<Category> categoryIService;
    @GetMapping
    public ResponseEntity<List<Category>> showAll() {
        List<Category> categoryList = categoryIService.findAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
}
